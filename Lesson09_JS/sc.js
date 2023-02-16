// var a= prompt("Введите a",0);
// var b=prompt("Введите b",0);
// var sum=0;

// for (let i = a; i <b; i++) {
//     sum=sum+i;
// }
// alert("sum = "+sum);
// console.log("Сумма= "+sum);
// document.writeln("Сумма= "+sum);

// 2. нахождение наименьшего общего делителя
// var a= prompt("Введите a",0);
// var b=prompt("Введите b",0);

// while (a!=0 & b!=0) {
//     if (a>b) {a=a%b}
//     else {b=b%a}
// }
 
// alert("НОД= "+(a+b));

// 3.найти делители числа
// var a= prompt("Введите A",0);
// for (let index = 1; index <= a; index++) {
//     if (res=a%index==0) {console.log("НОД= "+index);}
// }

// 4. определить количество цифр в введенном числе.
// var num= prompt("Введите число",0);
// var k=0;
// while (num>0) {
//     k++;
//     num=parseInt(num/10);
//     console.log(num);
//  }
// alert("Количество цифр в числе= "+k);

//5. ввести числа и подсчитать сколько положительных, отрицательных, нулевых
//четных и нечетных
// var pol=0;
// var otr=0;
// var nul=0;
// var chet=0;
// var nechet=0;

// for (let i = 1; i <=10; i++) {
//     let num=parseInt(prompt("Введите число ",0));
//     if(num>0)pol++;
//     else if (num<0) otr++;
//     else if (num==0) null++;
//     if(num%2==0) chet++;
//     else nechet++;
// }

// 6. Зациклить калькулятор

// answer = "yes";
// do {
// var num1=prompt("Введите первое число ",0);
// var num2=prompt("Введите второе число ",0);
// var sign=prompt("Введите знак операции ",'+');
// var res=0;   

// switch(sign){
//     case "+": res=num1+num2; break;
//     case "-": res=num1-num2; break;
//     case "/": res=num1/num2; break;
//     case "*": res=num1*num2; break;
//     default: res = "Нет такого знака";
// }

// console.log(res);
// answer=prompt("Введите yes для продолжения или любое другое для выхода",'yes');
// }
//  while (answer =="yes");


// 7.  