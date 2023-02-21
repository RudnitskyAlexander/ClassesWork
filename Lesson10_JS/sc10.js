// Array1. Дано целое число N (> 0). Сформировать и вывести целочисленный
// массив размера N, содержащий N первых положительных нечетных чисел:
// 1, 3, 5, . . . .

// let arr=[];
// let n=parseInt(prompt("Введите положительное число", 0));
// for (let i = 0; i < n; i++) {
//    arr.push(2*i+1);
// }
// alert(arr);

// Array2. Дано целое число N (> 0). Сформировать и вывести целочисленный
// массив размера N, содержащий степени двойки от первой до N-й: 2, 4,
// 8, 16, . . . .

// let arr=[];
// let n=parseInt(prompt("Введите положительное число",1));
// for (let i = 0; i < n; i++) {
//       arr.push(2**(i+1));
//    }
//    alert(arr);

//    Array3. Дано целое число N (> 1), а также первый член A и разность D арифметической прогрессии. Сформировать и вывести массив размера N, содержащий N первых членов данной прогрессии:
// A+0·D, A + 1·D, A + 2·D, A + 3·D, . . . .

// let arr=[];
// let n=parseInt(prompt("Введите положительное число N (длину массива)",1));
// let a=parseInt(prompt("Введите значение первого члена массива А",1));
// let d=parseInt(prompt("Введите разность арифметической прогрессии D",2));
// for (let i = 0; i < n; i++) {
//       arr.push(a+d*i);
//    }
//    alert(arr);

//    Array5. Дано целое число N (> 2). Сформировать и вывести целочисленный
// массив размера N, содержащий N первых элементов последовательности
// чисел Фибоначчи FK:
// F1 = 1, F2 = 1, FK = FK−2 + FK−1, K = 3, 4, . . . .

// let arr=[1,1];
// let n=parseInt(prompt("Введите положительное число N (длину массива)",3));
// for (let i = 2; i < n; i++) {
//       arr.push(arr[i-1]+arr[i-2]);
//    }
//    alert(arr);

//    Array6. Даны целые числа N (> 2), A и B. Сформировать и вывести целочисленный массив размера N, первый элемент которого равен A, второй
// равен B, а каждый последующий элемент равен сумме всех предыдущих.
// let arr=[];
// let a=parseInt(prompt("Введите a- первый элемент",1));
// let b=parseInt(prompt("Введите b- второй элемент",1));
// let n=parseInt(prompt("Введите n- количество элементов",3));
// arr.push(a);
// arr.push(b);

// for (let i = 2; i < n; i++) {
//    let sum=0;
//    for (let j = 0; j < i; j++) {
//       sum+=arr[j];
//    }
//       arr.push(sum);
//    }
//    alert(arr);

//    Array7. Дан массив размера N. Вывести его элементы в обратном порядке.
// let arr=[];
// let n=parseInt(prompt("Введите n-длину массива",1));
// for (let i = 0; i < n; i++) {
//       arr.push(2**(i+1));
//    }
//    alert(arr);

// for (let i = n-1; i >=0; i--) {
//    console.log(","+arr[i]);
//    document.writeln(";"+arr[i]);
//    }
   

// Array18. Дан массив A ненулевых целых чисел размера 10. Вывести значение
// первого из тех его элементов A[K], которые удовлетворяют неравенству
// A[K] < A[9]. Если таких элементов нет, то вывести 0.

// let arr=[];
// for (let i = 0; i < 10; i++) {
//    let x= Math.floor(Math.random()*11);
//    arr.push(x);
// }

// console.log(arr);
// con=false;
// for (let i = 0; i < arr.length; i++) {
//    if(arr[i]<arr.at(-i)){
//       con=true;
//       alert("Меньший элемент "+arr[i]+" номер элемента "+i);
//       console.log(arr[i]+" " +i);
//       break;
//    }
// }
// if(!con) console.log(0);

// Array19. Дан целочисленный массив A размера 10. Вывести порядковый номер
// последнего из тех его элементов A[K], которые удовлетворяют двойному
// неравенству A[1] < A[K] < A[10]. Если таких элементов нет, то вывести 0.

// let arr=[];
// for (let i = 0; i < 10; i++) {
//    let x= Math.floor(Math.random()*11);
//    arr.push(x);
// }

// console.log(arr);
// con=false;
// for (let i = 0; i < arr.length; i++) {
//    if(arr[0]<arr[i] && arr[i]<arr.at(-1)){ //[arr.length-1]
//       con=true;
//       alert("Элемент удовлетворяющий неравенству A[1] < A[K] < A[10] : "+arr[i]+", номер элемента "+(i+1));
//       console.log(arr[i]+" " +i);
//       break;
//    }
// }
// if(!con) console.log(0);

// Array49. Дан целочисленный массив размера N. Если он является перестановкой, то есть содержит все числа от 1 до N, то вывести 0; в противном
// случае вывести номер первого недопустимого элемента.

// let arr=[];
// for (let i = 0; i < 10; i++) {
//    let x= Math.floor(Math.random()*11);
//    arr.push(x);
// }
// console.log(arr);

// let arr1=[];
// arr1=arr.sort(i,n);

// console.log(arr1);

// Array51. Даны массивы A и B одинакового размера N. Поменять местами их
// содержимое и вывести вначале элементы преобразованного массива A, а
// затем — элементы преобразованного массива B.

// let arrA=[];
// for (let i = 0; i < 10; i++) {
//    let x= Math.floor(Math.random()*11);
//    arrA.push(x);
// }
// console.log(arrA);

// let arrB=[];
// for (let i = 0; i < 10; i++) {
//    let x= Math.floor(Math.random()*11);
//    arrB.push(x);
// }
// console.log(arrB);

// for (let i = 0; i < 10; i++) {
//    let a=arrA[i];
//    arrA[i]=arrB[i];
//    arrB[i]=a;
// }

// console.log(arrA);
// console.log(arrB);

// Array52. Дан массив A размера N. Сформировать новый массив B того же
// размера, элементы которого определяются следующим образом:
// B[K] = 2·A[K], если A[K] < 5,
// A[K]/2 в противном случае.

let arrA=[];
for (let i = 0; i < 10; i++) {
   let x= Math.floor(Math.random()*11);
   arrA.push(x);
}
console.log(arrA);

let arrB=[];
for (let i = 0; i < 10; i++) {
   if(arrA[i]<5){arrB.push(2*arrA[i]);}
   else {arrB.push(arrA[i]/2);}
}
   console.log(arrB);

     
