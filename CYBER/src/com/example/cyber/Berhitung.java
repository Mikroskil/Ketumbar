package com.example.cyber;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Berhitung extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.berhitung);
		
		ketikarrowback();
		ketikkenalangka();
		ketikhitung();
	}

	protected void ketikarrowback(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.arrowback); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b) {  
				   Intent intent = new Intent(context,AppActivity.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	protected void ketikkenalangka(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.kenalangka); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b1) {  
				   Intent intent = new Intent(context,Angka1.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	
	protected void ketikhitung(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.hitung); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b2) {  
				   Intent intent = new Intent(context,Soalhitung1.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	
}
