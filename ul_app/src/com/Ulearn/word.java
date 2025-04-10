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

public class word extends Activity {
 
	TextToSpeech t1;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word);
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            public void onInit(int status) {
               if(status != TextToSpeech.ERROR) {
                  t1.setLanguage(Locale.US);
               }
            }
         });
       
}
  
    public void move1(View view){
   	String str = "1";
   	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView1);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myanimation);
	      image.startAnimation(animation1);
	     /*Animation animation2 = 
	 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	 	      image.startAnimation(animation2);*/
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
  	       mp.start();
	     
	   }
    
    public void move2(View view){
       	String str = "2";
       	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
    	      ImageView image = (ImageView)findViewById(R.id.imageView2);
    	      Animation animation1 = 
    	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myanimation);
    	      image.startAnimation(animation1);
    	     /*Animation animation2 = 
    	 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
    	 	      image.startAnimation(animation2);*/
    	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
   	       mp.start();
    	     
    	   }
    public void move3(View view){
       	String str = "3";
       	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
    	      ImageView image = (ImageView)findViewById(R.id.imageView3);
    	      Animation animation1 = 
    	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myanimation);
    	      image.startAnimation(animation1);
    	     /*Animation animation2 = 
    	 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
    	 	      image.startAnimation(animation2);*/
    	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
   	       mp.start();
    	     
    	   }
    
    public void move4(View view){
       	String str = "4";
       	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
    	      ImageView image = (ImageView)findViewById(R.id.imageView4);
    	      Animation animation1 = 
    	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myanimation);
    	      image.startAnimation(animation1);
    	     /*Animation animation2 = 
    	 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
    	 	      image.startAnimation(animation2);*/
    	      
    	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
   	       mp.start();
    	   }
    
    public void move5(View view){
       	String str = "5";
       	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
    	      ImageView image = (ImageView)findViewById(R.id.imageView5);
    	      Animation animation1 = 
    	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myanimation);
    	      image.startAnimation(animation1);
    	     /*Animation animation2 = 
    	 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
    	 	      image.startAnimation(animation2);*/
    	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
   	       mp.start();
    	     
    	   }
    
    public void move6(View view){
       	String str = "6";
       	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
    	      ImageView image = (ImageView)findViewById(R.id.imageView6);
    	      Animation animation1 = 
    	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myanimation);
    	      image.startAnimation(animation1);
    	     /*Animation animation2 = 
    	 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
    	 	      image.startAnimation(animation2);*/
    	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
   	       mp.start();
    	     
    	   }
    
    public void move7(View view){
       	String str = "7";
       	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
    	      ImageView image = (ImageView)findViewById(R.id.imageView7);
    	      Animation animation1 = 
    	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myanimation);
    	      image.startAnimation(animation1);
    	     /*Animation animation2 = 
    	 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
    	 	      image.startAnimation(animation2);*/
    	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
   	       mp.start();
    	     
    	   }
    public void move8(View view){
       	String str = "8";
       	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
    	      ImageView image = (ImageView)findViewById(R.id.imageView8);
    	      Animation animation1 = 
    	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myanimation);
    	      image.startAnimation(animation1);
    	     /*Animation animation2 = 
    	 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
    	 	      image.startAnimation(animation2);*/
    	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
   	       mp.start();
    	     
    	   }
    public void move9(View view){
       	String str = "9";
       	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
    	      ImageView image = (ImageView)findViewById(R.id.imageView9);
    	      Animation animation1 = 
    	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myanimation);
    	      image.startAnimation(animation1);
    	     /*Animation animation2 = 
    	 	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
    	 	      image.startAnimation(animation2);*/
    	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
   	       mp.start();
    	     
    	   }
        
        
        
        
        
        
        
        
    
    
    
}