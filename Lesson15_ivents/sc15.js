d1.onmouseenter=function(){
  s1.innerText="d1";
  console.log("d1.OnMouseEnter");
}

d1.onmouseleave=function(){
  s2.innerText="d1";
  console.log("d1.OnMouseLeave");
}

d2.addEventListener("mouseenter", function(){
  s1.innerText="d2";
  console.log("d2.OnMouseEnter");
})

d2.addEventListener("mouseleave", function(){
  s2.innerText="d2";
  console.log("d2.OnMouseLeave");
})