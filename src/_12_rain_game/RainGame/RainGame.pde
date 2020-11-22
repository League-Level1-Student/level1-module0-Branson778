int elly = 1;
    int randomNumber = (int) random(601);
void setup(){
   size(600, 600);
}
void draw(){
    background(#03F9FF);
     fill(0, 1, 255);
    stroke(0, 5, 175);
    ellipse(randomNumber, elly, 42, 37);
    ellipse(randomNumber, elly, 42, 37);
    ellipse(randomNumber, elly, 42, 37);
    ellipse(randomNumber, elly, 42, 37);
    ellipse(randomNumber, elly, 42, 37);
    ellipse(randomNumber, elly, 42, 37);
    ellipse(randomNumber, elly, 42, 37);
    elly+=5;
    if(elly>=600){
   elly=0;
   randomNumber = (int) random(601);
    }
    // rect(590, 300, int width, int height);
}
