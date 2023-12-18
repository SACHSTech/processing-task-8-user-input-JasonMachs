import processing.core.PApplet;
import processing.core.PImage;
public class Sketch extends PApplet {
	
  
  //caling size
	public void settings() {
	size(355, 145);
  }
   
  // global variables
  PImage backImage1;
  PImage backImage2;
  PImage backImage3;
  PImage orange;
  PImage objOne;
  float  width =10;
  float  height =10;
  
  //loading images
  public void setup() {
    backImage1 = loadImage("C:\\Users\\majas\\github-classroom\\SACHSTech\\processing-task-8-user-input-JasonMachs\\bg3.jpg");
    backImage2 = loadImage("C:\\Users\\majas\\github-classroom\\SACHSTech\\processing-task-8-user-input-JasonMachs\\backIm.jpg");
    backImage3 = loadImage("C:\\Users\\majas\\github-classroom\\SACHSTech\\processing-task-8-user-input-JasonMachs\\backlmg.jpg");
    orange = loadImage("C:\\Users\\majas\\github-classroom\\SACHSTech\\processing-task-8-user-input-JasonMachs\\orange.jpg");
    objOne = loadImage("C:\\Users\\majas\\github-classroom\\SACHSTech\\processing-task-8-user-input-JasonMachs\\car1-PhotoRoom.png");
  }
    
    //setting conditions
    boolean upPressed    = false;
    boolean downPressed  = false;
    boolean leftPressed  = false;
    boolean rightPressed = false;
    
    public void draw() {
    //backgroung and car
    image(backImage1, 0, 0);
    //change background
    if (keyPressed){
      if(keyCode == UP){
        image(backImage2, 0, 0);
      }
    }
    image(objOne, mouseX-150, mouseY-50);
    
    // movements
    if (keyPressed) {
      if (key == 'w') {
        height--;
      }
      else if (key == 'a') {
        height++;
      }
      else if(key =='d'){
        width--;
      }
      else if(key == 's'){
       width++;
      }
    }
    //circle
    ellipse(mouseX, mouseY, width, height);
    }

  public void keyReleased(){
   if(key == 't'){
    height++;
   }
   else if (key == 'f'){
    height--;
   }
   else if (key =='h'){
    width++;
   }
   else if(key =='g'){
    width--;
   }
  }
  
  //movement methods
  public void mouseReleased() {
   width = 200;
   height = 100;
  }
  
  public void mouseClicked(){
    backImage1 = backImage3;
  }

  public void mouseWheel(){
    width = 5; 
    height = 5;
  }

  public void mouseMoved(){
   image(orange,0,0);
  }

  public void mouseDragged(){
   fill(230,0,0);
  }
  }
    

 
  

    
  
