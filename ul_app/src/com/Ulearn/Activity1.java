package com.Ulearn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity1 extends Activity {
 
	ImageView im1,im2;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        
       im1=(ImageView)findViewById(R.id.imageView1);
       im2=(ImageView)findViewById(R.id.imageView2);
}
    
    public void onLone(View v)
    {
    	openActivity1();
    }
    
    public void onLtwo(View v)
    {
    	openActivity2();
    }
    
    public void onthree(View v)
    {
    	openActivity3();
    }
    
    public void openActivity1()
    {
    	Intent intent = new Intent(getApplicationContext(),alpha.class);
    	startActivity(intent);
    }
    
    public void openActivity2()
    {
    	Intent intent = new Intent(getApplicationContext(),word.class);
    	startActivity(intent);
    }
    public void openActivity3()
    {
    	Intent intent = new Intent(getApplicationContext(),words.class);
    	startActivity(intent);
    }
    
    
    
}