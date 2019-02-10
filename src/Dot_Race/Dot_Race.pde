int dotX = 0;
void setup(){
  size(800, 200);
}
void draw() {
  fill (#A2ECFF);
  ellipse(dotX, 100, 100, 100);
  if (mousePressed){
   ellipse(dotX, 100, 100, 100);
   dotX = dotX + 50;
  }
  if (dotX > 750){
    //playSound();
  }
}
import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding1.wav");
        sound.trigger();
        soundPlayed = true;
    }
}