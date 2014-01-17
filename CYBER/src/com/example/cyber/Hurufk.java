package com.example.cyber;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Hurufk extends Activity {

	MediaPlayer mp;
    ImageButton one ;
    
	@Override
	 protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hurufk);
		ketikarrowback();
		ketikarrowkiri();
		ketikarrowkanan();
		
		
		mp = MediaPlayer.create(this, R.raw.k);
        one = (ImageButton)this.findViewById(R.id.k);

        one.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {
               
               mp.start();
           }
       });
		
	}
		
		
	protected void ketikarrowback(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.arrowback); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View a1) {  
				   Intent intent = new Intent(context,Membaca.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	protected void ketikarrowkiri(){
		final Context context = this;
		ImageButton btn1 = (ImageButton)findViewById(R.id.leftarrow);
		btn1.setOnClickListener(new OnClickListener(){
			public void onClick (View a){
				Intent intent = new Intent(context,Hurufj.class);
				startActivity(intent);
			}
		});
	}
	
	protected void ketikarrowkanan(){
		final Context context = this;
		ImageButton btn2 = (ImageButton)findViewById(R.id.rightarrow);
		btn2.setOnClickListener(new OnClickListener(){
			public void onClick (View a2){
				Intent intent = new Intent(context,Hurufl.class);
				startActivity(intent);
			}
		});
	}
		
	}
	







