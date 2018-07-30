PImage rainbow;
PImage unicorn;
void setup() {
  rainbow = loadImage ("Rainbow.jpg");
  size(800, 600);
  rainbow.resize(width, height);
  background(rainbow);
  unicorn = loadImage ("Unicorn.png");
  unicorn.resize(170, 150);
}
void draw() {
  background(rainbow);
  image(unicorn, mouseX, mouseY);
}