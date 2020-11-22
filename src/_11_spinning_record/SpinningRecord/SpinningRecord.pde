PImage pictureOfRecord;                        //as member variable
int rotnum = 0;
void setup(){

        size(600,600);                                 //in setup method
        pictureOfRecord= loadImage("recordimg.jpeg");      //in setup method
          pictureOfRecord.resize(600,600);     //in setup method
  
  
  
  
}
void draw(){
  if(mousePressed){
  rotateImage(pictureOfRecord,rotnum);
  image(pictureOfRecord,0,0);
  rotnum+=100;
  }
  
  
}
 void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
