 int random = (int) random(301);
 int random2 = (int) random(301);
void setup(){
      size(300, 300);
    background(155, 230, 155);
}
void draw(){
  makeMagical();
  for(int i = 0; i<300; i++){
    fill(frameCount,i,i);
    ellipse(getWormX(i),getWormY(i),25,25);
    random = (int) random(301);
  random2 = (int) random(301);
}
}
float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
