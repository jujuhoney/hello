import java.sql.*;

public class sqlcon {

    public static void main(String[] args)
    {
        try {
            String course[]={"java","react","redux","bootstrap"};
            String student[]={"a","b","c","d"};
            Connection con=null;
            ResultSet rs=null;
            String url="jdbc:mysql://localhost:3306/schedule";
            String user="root";
            String password="123456";
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)DriverManager.getConnection(url,user,password);
            System.out.println("connect successful");
            PreparedStatement ps=null;
            System.out.println("average： ");
            for(int i=0;i<4;i++) {
                String sql = "select avg(score) from schedule.sc  where cr_id="+(i+5)+"";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.print(course[i]+": ");
                    System.out.println(rs.getFloat(1));
                }
            }
            System.out.println("everybody's score： ");
            for(int j=0;j<4;j++) {
                String sql2="SELECT s.st_name, sc.score ,c.coursename\n" +
                        "FROM student s   JOIN sc  on s.st_id= sc.st_id\n" +
                        "JOIN course c ON c.cr_id=sc.cr_id\n" +
                        "WHERE s.st_name=\""+student[j]+"\"";
//                        ""++" "
                ps = con.prepareStatement(sql2);
                rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.print(rs.getString(1)+": ");
                    System.out.print(rs.getString(3)+" ");
                    System.out.println(rs.getInt(2)+" ");

                }
            }
            System.out.println("sumscore ");
                String sql3="SELECT  student.st_name,sum(sc.score) FROM student JOIN sc ON student.st_id=sc.st_id \n" +
                        "GROUP BY student.st_name\n" +
                        "ORDER BY sum(sc.score)";
            ps = con.prepareStatement(sql3);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getString(1)+": ");

                System.out.println(rs.getInt(2)+" ");

            }

            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//SELECT AVG(score) FROM SCHEDULE.score WHERE class="Java";
//

    }
}
