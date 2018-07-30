void setup(){
  size(800, 800);
}
void draw(){
  background(#FFFFFF);
  fill(#62FADA);
  if(mousePressed) {
    fill(#E3C8F5);
  }
  ellipse(mouseX, mouseY, 25, 25);
}