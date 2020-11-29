int elly = 1;
int score = 0;
    int randomNumber = (int) random(601);
    int randomNumber2 = (int) random(601);
    int randomNumber3 = (int) random(601);
    int randomNumber4 = (int) random(601);
    int randomNumber5 = (int) random(601);
    int randomNumber6 = (int) random(601);
    int randomNumber7 = (int) random(601);
    int randomNumber8 = (int) random(601);
void setup(){
   size(600, 600);
}
void draw(){
    background(#03F9FF);
     fill(0, 1, 255);
    stroke(0, 5, 175);
    ellipse(randomNumber, elly+0, 42, 37);
    ellipse(randomNumber2, elly+12, 42, 37);
    ellipse(randomNumber3, elly+27, 42, 37);
    ellipse(randomNumber4, elly+31, 42, 37);
    ellipse(randomNumber5, elly+37, 42, 37);
    ellipse(randomNumber6, elly+18, 42, 37);
    ellipse(randomNumber7, elly+8, 42, 37);
      fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    fill(#A5A0A0);
    rect(mouseX, 558, 45, 52);
    elly+=5;
  if(elly==558){
      checkCatch(randomNumber);
    }
     if(elly+12==558){
      checkCatch(randomNumber2);
    }
      if(elly+27==558){
      checkCatch(randomNumber3);
     }
      if(elly+31==558){
      checkCatch(randomNumber4);
     }
     if(elly+37==558){
      checkCatch(randomNumber5);
     }
      if( elly+18==558){
      checkCatch(randomNumber6);
    }
    if(elly+8==558){
      checkCatch(randomNumber7);
     }
    if(elly>=600){
   elly=0;
   randomNumber = (int) random(601);
   randomNumber2 = (int) random(601);
   randomNumber3 = (int) random(601);
   randomNumber4 = (int) random(601);
   randomNumber5 = (int) random(601);
   randomNumber6 = (int) random(601);
   randomNumber7 = (int) random(601);
    }
   
    // rect(590, 300, int width, int height);
}
 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
      
        println("Your score is now: " + score);
        
        
        
        
    }
