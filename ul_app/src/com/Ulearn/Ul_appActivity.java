package com.Ulearn;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Ul_appActivity extends Activity {
	ProgressBar pb1;
	int pv = 0;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slapsh_screen);
        pb1 = (ProgressBar)findViewById(R.id.pg1);
        Thread mythread = new Thread(){
        	 @Override
             public void run()
             {
          	   try
          	   {
          		 while (pv <= 100)
         		{
         			Thread.sleep(3000);
         			pv += 15;
         			pb1.setProgress(pv);
         		}
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