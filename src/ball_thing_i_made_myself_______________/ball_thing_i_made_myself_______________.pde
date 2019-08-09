float circleX;
float xspeed = 3;

void setup() {
  size(640, 360);
  circleX=0;
}
  
  void draw() {
  
   
    background(51);
  ;
  fill(102);
  stroke(255);

fill(circleX);
  color c1 = color(random(255),random(255),random(255));
  ellipse(circleX,height/2, 32, 32);
  
  circleX=circleX + xspeed;
  
  if(circleX>width || circleX<0){
    
    xspeed = xspeed * -1.1;
  

}
  }
