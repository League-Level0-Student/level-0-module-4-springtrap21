void setup(){
  PImage face = loadImage("chungus.png");
  size(350,600);
  face.resize(width,height);
  background(face);
}

void draw(){
  fill(#FFFFFF);
  ellipse(177,248,30,30);
  fill(#000000);
  ellipse(177+((mouseX-177)/20),248+((mouseY-248)/32),10,10);
  if(mousePressed){
    println(mouseX +" "+mouseY);
  }
  fill(#FFFFFF);
  ellipse(226,250,26,26);
  fill(#000000);
  ellipse(227+((mouseX-227)/20),250+((mouseY-250)/32),10,10);
  if(mousePressed){
    println(mouseX +" "+mouseY);
  }    
}
                            
