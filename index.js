// console.log(1)





// let name="aaaa";

// let a="b";
// let b="k";

// console.log(a,b);

// [a,b]=[b,a];

// console.log(a,b);

// let n={a:"1",b:"2"};
// console.log(n['a']);

// let {c}=n;
// console.log(c);


// let a='hello';
// let b='world';
// let c=`${a} ${b}! Welcome!`;//模板字符串
// console.log(c);


// let a = "123";
// let b = "123.4";
// let c = Number.parseInt(a);
// let d = Number.parseFloat(b);
// console.log(typeof a);
// console.log(typeof b);
// console.log(typeof c);
// console.log(typeof d);

// let e = 123;
// let f = e + '';
// console.log(typeof e);
// console.log(typeof f);



//给定索引值。对应数组项向前移动一位

let arr=[1,2,3,4,5]
let a1=(arr,index)=>{
   let temp=a[index-1];
    a[index-1]=a[index];
    a[index]=temp;
    return arr;

}

let a2=(arr,index)=>{
   [arr[index],arr[index-1]]=[arr[index-1],arr[index]];
   return arr; 
}
//移动到最前
let b1=(arr,index)=>{
    let temp=a[0];
     a[0]=a[index];
     a[index]=temp;
    return arr;
 }

let b2=(arr,index)=>{
  arr.unshift(arr.slice(index,index+1));
  return arr;
}
//移动到最后位
let c1=(arr,index)=>{
    let temp=a[4];
     a[4]=a[index];
     a[index]=temp;
    return arr;
 }

 let c2=(arr,index)=>{
    arr.push(arr.slice(index,index+1));
    return arr;
  }

//实现任意两个数组项位置互换
  let d1=(arr,index1,index2)=>{
    let temp=a[index1];
     a[index1]=a[index2];
     a[index2]=temp;
     return arr;
 
 }
 let d2=(arr,index1,index2)=>{
    [arr[index1],arr[index2]]=[arr[index2],arr[index1]];
    return arr; 
 }