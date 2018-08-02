
PImage catPic;
void setup() {
  size(600, 800);
  catPic = loadImage("Cat.jpg");
  catPic.resize(width, height);
  background(catPic);
}

void draw(){
  if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + 
"Mouse’s y-position: " + mouseY + "\n");}
ellipse(167, 232, 80, 80);
}