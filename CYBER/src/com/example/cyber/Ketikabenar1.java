package com.example.cyber;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class Ketikabenar1 extends Activity {

	
	MediaPlayer mp;
    ImageButton one ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.ketikabenar1);
		mp = MediaPlayer.create(this, R.raw.kamubenar);
		mp.start();
		
		ketikbenar();
		
	}

	protected void ketikbenar(){
		final Context context = this;
		Button arrow = (Button) findViewById(R.id.benar1); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b1) {  
				   Intent intent = new Intent(context,Soalhitung2.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	
	

}
