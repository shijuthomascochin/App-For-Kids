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

public class alpha extends Activity {
	TextToSpeech t1;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alpha);
     
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            public void onInit(int status) {
               if(status != TextToSpeech.ERROR) {
                  t1.setLanguage(Locale.US);
               }
            }
         });
       
}
    
    public void movea(View view){
    	 String str = "A";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView1);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	       mp.start();
	     
	   }
    public void moveb(View view){
    	 String str = "B";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView2);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	       mp.start();
	     
	   }
    public void movec(View view){
    	 String str = "C";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView3);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void moved(View view){
    	 String str = "D";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView4);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	    //  image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void movee(View view){
    	 String str = "E";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView5);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void movef(View view){
    	 String str = "F";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView6);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void moveg(View view){
    	 String str = "G";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView7);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void moveh(View view){
    	 String str = "H";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView8);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void movei(View view){
    	 String str = "I";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView9);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void movej(View view){
    	 String str = "J";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView10);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    
    public void movek(View view){
    	 String str = "K";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView11);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	    //  image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
	   
    public void movel(View view){
    	 String str = "L";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView12);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   } 
    public void movem(View view){
    	 String str = "M";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView13);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void moven(View view){
    	 String str = "N";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView14);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	      //image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    
    public void moveo(View view){
    	 String str = "O";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView15);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    
    public void movep(View view){
    	 String str = "P";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView16);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	    //  image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    
    public void moveq(View view){
    	 String str = "Q";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView17);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void mover(View view){
    	 String str = "R";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView18);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void moves(View view){
    	 String str = "S";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView19);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void movet(View view){
    	 String str = "T";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView20);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	    //  image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void moveu(View view){
    	 String str = "U";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView21);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    
    public void movev(View view){
    	 String str = "V";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView22);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void movew(View view){
    	 String str = "W";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView24);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void movex(View view){
    	 String str = "X";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView23);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    public void movey(View view){
    	 String str = "Y";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView25);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     // image.startAnimation(animation1);
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
    
    public void movez(View view){
    	 String str = "Z";
    	 t1.speak(str, TextToSpeech.QUEUE_FLUSH, null);
	      ImageView image = (ImageView)findViewById(R.id.imageView26);
	      Animation animation1 = 
	         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
	      image.startAnimation(animation1);
	     
	      MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.jump);
	      mp.start();
	   }
}