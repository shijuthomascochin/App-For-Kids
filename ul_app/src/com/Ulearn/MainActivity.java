package com.Ulearn;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {
	//private Button b1;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.rym);
	       mp.start();
        
       // b1=(Button)findViewById(R.id.b1);
    	//b2=(Button)findViewById(R.id.b2);
    	//b3=(Button)findViewById(R.id.b3); 
      
    }
    public void onplay(View v)
    {
    	openActivity1();
    	
    }
    
  
    
    public void openActivity1()
    {
    	Intent intent = new Intent(getApplicationContext(),Activity1.class);
    	startActivity(intent);
    }
    
    public void oninst(View v)
    {
    	openActivity2();
    	
    }
    
  
    
    public void openActivity2()
    {
    	Intent intent = new Intent(getApplicationContext(),instruction.class);
    	startActivity(intent);
    }
    public void onabut(View v)
    {
    	openActivity3();
    	
    }
    
  
    
    public void openActivity3()
    {
    	Intent intent = new Intent(getApplicationContext(),about.class);
    	startActivity(intent);
    }
    
    public void onexit(View v)
    {
    	openActivity4();
    	
    }
    
  
    
    public void openActivity4()
    {
    	Intent intent = new Intent(getApplicationContext(),exit.class);
    	startActivity(intent);
    }
}