package com.Ulearn;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class instruction extends Activity {
	//private Button b1;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instruction);
        
       // b1=(Button)findViewById(R.id.b1);
    	//b2=(Button)findViewById(R.id.b2);
    	//b3=(Button)findViewById(R.id.b3); 
      
    
    Thread mythread = new Thread(){
   	 @Override
        public void run()
        {
     	   try
     	   {
     		
     		   sleep(2000);
     		   Intent i= new Intent(getApplicationContext(),MainActivity.class);
     		   startActivity(i);
     		   finish();
     	   }
     	   catch(Exception e)
     	   {
     		   
     	   }
        }
   	 
   };
   mythread.start();
 
}
}