PImage yeet;
 PImage friend;

void setup(){
friend=loadImage("friend.jpeg");
 size(800,600);
 friend.resize(width, height);
 yeet=loadImage("yeet.png");
 yeet.resize(180,100);
}
void draw(){
background(friend);
  if(mousePressed){
  image(yeet, mouseX,mouseY);
  }
}
