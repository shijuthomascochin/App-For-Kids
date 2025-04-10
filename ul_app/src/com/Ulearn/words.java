package com.Ulearn;





import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class words extends Activity {
	TextToSpeech t1;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apple);
     //  MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.a);
        //mp.start();
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            public void onInit(int status) {
               if(status != TextToSpeech.ERROR) {
                  t1.setLanguage(Locale.US);
               }
            }
         });
       
}
    
    public void movea(View view){
    	 String str = "A for apple";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView1);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    public void moveb(View view){
   	 String str = "B for ball";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView2);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    
    public void movec(View view){
      	 String str = "c for cat";
      	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
   	      ImageView image = (ImageView)findViewById(R.id.imageView3);
   	      Animation animation1 = 
   	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
   	      image.startAnimation(animation1);
   	     
   	   }
    
    public void moved(View view){
     	 String str = "d for doll";
     	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
  	      ImageView image = (ImageView)findViewById(R.id.imageView4);
  	      Animation animation1 = 
  	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
  	      image.startAnimation(animation1);
  	     
  	   }
    
    public void movee(View view){
    	 String str = "e for Egg";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
 	      ImageView image = (ImageView)findViewById(R.id.imageView5);
 	      Animation animation1 = 
 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
 	      image.startAnimation(animation1);
 	     
 	   }
    
    public void movef(View view){
    	 String str = "f for fish";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
 	      ImageView image = (ImageView)findViewById(R.id.imageView6);
 	      Animation animation1 = 
 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
 	      image.startAnimation(animation1);
 	     
 	   }
    public void moveg(View view){
    	 String str = "g for gun";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
 	      ImageView image = (ImageView)findViewById(R.id.imageView7);
 	      Animation animation1 = 
 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
 	      image.startAnimation(animation1);
 	     
 	   }
    
    public void moveh(View view){
    	 String str = "h for hat";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
 	      ImageView image = (ImageView)findViewById(R.id.imageView8);
 	      Animation animation1 = 
 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
 	      image.startAnimation(animation1);
 	     
 	   }
    
    public void movei(View view){
    	 String str = "i for icecream";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
 	      ImageView image = (ImageView)findViewById(R.id.imageView9);
 	      Animation animation1 = 
 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
 	      image.startAnimation(animation1);
 	     
 	   }
    
    public void movej(View view){
    	 String str = "j for jug";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
 	      ImageView image = (ImageView)findViewById(R.id.imageView10);
 	      Animation animation1 = 
 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
 	      image.startAnimation(animation1);
 	     
 	   }
    
    public void movek(View view){
   	 String str = "k for kite";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView11);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    public void movel(View view){
   	 String str = "l for lime";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView12);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    
    public void movem(View view){
   	 String str = "m for monkey";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView13);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    
    public void moven(View view){
   	 String str = "n for nest";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView14);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    
    public void moveo(View view){
   	 String str = "o for orange";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView15);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    
    
    public void movep(View view){
   	 String str = "p for pen";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView16);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    public void moveq(View view){
   	 String str = "q for quill";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView17);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    
    public void mover(View view){
   	 String str = "r for rabbit";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView18);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    
    public void moves(View view){
   	 String str = "s for squrriel";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView19);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    
    public void movet(View view){
   	 String str = "t for tree";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView20);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    public void moveu(View view){
   	 String str = "u for umberalla";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView21);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    public void movev(View view){
   	 String str = "v for violin";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView22);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    public void movew(View view){
   	 String str = "w for watermelon";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView23);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    public void movex(View view){
   	 String str = "x for xmas";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView24);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    public void movey(View view){
   	 String str = "y for yak";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView25);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
    
    public void movez(View view){
   	 String str = "z for zip";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView26);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
	      image.startAnimation(animation1);
	     
	   }
}