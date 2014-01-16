package com.example.cyber;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class Membaca extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.membaca);
		
		ketikarrowback();
		ketikkenalhuruf();
		ketikbaca();
	}

	protected void ketikarrowback(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.arrowback); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View baca) {  
				   Intent intent = new Intent(context,AppActivity.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	protected void ketikkenalhuruf(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.kenalhuruf); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View baca) {  
				   Intent intent = new Intent(context,Hurufa.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	protected void ketikbaca(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.belajarmembaca); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View baca) {  
				   Intent intent = new Intent(context,Baca1.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	

}



