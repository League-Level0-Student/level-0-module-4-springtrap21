void setup(){
  PImage face = loadImage("chungus.png");
  size(350,600);
  face.resize(width,height);
  background(face);
}

void draw(){
  fill(#FFFFFF);
  ellipse(177,248,30,30);
  int pupilCenterX = 177;
  int pupilCenterY = 248;
  int boxDiff = 5;
  int pupilX = 177+((mouseX-177)/23);
  int pupilY = 248+((mouseY-248)/35);
  pupilX = boundInt(pupilX, pupilCenterX, boxDiff);
  pupilY = boundInt(pupilY, pupilCenterY, boxDiff);
    
  fill(#000000);
  ellipse(pupilX,pupilY,10,10);
  if(mousePressed){
    println(mouseX +" "+mouseY);
  }
  fill(#FFFFFF);
  ellipse(226,250,26,26);
  pupilX = 227+((mouseX-227)/25);
  pupilY = 250+((mouseY-250)/37);
  pupilCenterX = 227;
  pupilCenterY = 250;
  pupilX = boundInt(pupilX, pupilCenterX, boxDiff);
  pupilY = boundInt(pupilY, pupilCenterY, boxDiff);
  fill(#000000);
  ellipse(pupilX,pupilY,10,10);
  if(mousePressed){
    println(mouseX +" "+mouseY);
  }    
}

int boundInt(int num, int center, int boxDiff) {
  if (num < center - boxDiff)
    num = center - boxDiff;
  if (num > center + boxDiff)
    num = center + boxDiff;
  return num;
}


                            
