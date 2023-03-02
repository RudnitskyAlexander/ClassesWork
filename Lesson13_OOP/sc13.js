// class List{

//    constructor(values){
//       this.values=values;
//     }

// // get values(){
// //   return this.values;
// // }

// // set values(values){
// //   this.values=values;
// // }

// print(){
//   this.values.sort();
//   document.write('</p> <ol>');
//   for (const elem of this.values) {
//     document.write("<li>"+elem+"</li>")
//   }
//   document.write('</ol> </p>');
//   }


// add(){
//   this.values.push(elem);
//   //let total = sp.push('panapple', 'watermelon');
// }

// ochistka(){
//   sp.clear();
// }

// clear(){
//   this.values.length=0;
// }

// fillElem(){
//   sp=Array(3).fill('empty');
// }

// }

// sp=['banana', 'apple', 'kiwi', 'peach', 'onion'];
// l1=new List(sp);
// // l1.add();
// // l1.print();
// // l1.ochistka();
// // l1.print();
// l1.fillElem();
// l1.print();


// sp2= ['C#', 'Java', 'Python', 'JavaScript'];
// for(elem of sp2) l1.add(elem);
// l1.print();



class Button{
  constructor(text){
  this.text=text;
      }

  show(){
    document.write(

      '<div id=btn1 style='+
      '"width: 150;'+
      'height:50px;'+
      'padding: 10px;'+
      'margin: 10px 20px;'+
      'background: #fa8072;'+
      'text-align:center;'+
      'display:table-cell;'+
      'vertical-align: middle;">'+
      '<a href="#btn3">'+this.text+'</a></div>'
    );
  }
}

class ColorButton extends Button{
  constructor(text,color){
    super(text);
    this.color=color;
  }
show(){
  document.write(
  '<div id=btn1 style='+
  '"width: 150;'+
  'height:50px;'+
  'padding: 10px;'+
  'margin: 10px 20px;'+
  'background:' +this.color+';'+
  'text-align:center;'+
  'display:table-cell;'+
  'vertical-align: middle;">'+
  '<a href="#btn3">'+this.text+'</a></div>'
  );
}

}


btn1=new Button("Press me!");
btn1.show();
btn2=new ColorButton("Cancel","red");
btn2.show();


  
  
  