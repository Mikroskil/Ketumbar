package com.example.cyber;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Soalhitung1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.soalhitung1);
		
		ketikarrowback();
		ketikmikia();
		ketikmikib();
		ketikmikic();
		ketikarrowkiri();
		ketikarrowkanan();
	}

	protected void ketikarrowback(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.arrowback); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b) {  
				   Intent intent = new Intent(context,Berhitung.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	protected void ketikmikia(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.mikia); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b1) {  
				   Intent intent = new Intent(context,Ketikabenar.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	
	protected void ketikmikib(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.mikib); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b2) {  
				   Intent intent = new Intent(context,Ketikasalah.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	protected void ketikmikic(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.mikic); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b2) {  
				   Intent intent = new Intent(context,Ketikasalah.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	
	protected void ketikarrowkiri(){
		final Context context = this;
		ImageButton btn1 = (ImageButton)findViewById(R.id.leftarrow);
		btn1.setOnClickListener(new OnClickListener(){
			public void onClick (View a){
				Intent intent = new Intent(context,Soalhitung6.class);
				startActivity(intent);
			}
		});
	}
	
	protected void ketikarrowkanan(){
		final Context context = this;
		ImageButton btn2 = (ImageButton)findViewById(R.id.rightarrow);
		btn2.setOnClickListener(new OnClickListener(){
			public void onClick (View a2){
				Intent intent = new Intent(context,Soalhitung2.class);
				startActivity(intent);
			}
		});
	}
		
	
	
	
}
