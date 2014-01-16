package com.example.cyber;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;

public class Soalhitung6 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.soalhitung6);
		
		ketikarrowback();
		ketikbulana();
		ketikbulanb();
		ketikbulanc();
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
	
	protected void ketikbulana(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.bulana); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b1) {  
				   Intent intent = new Intent(context,Ketikabenar5.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	
	protected void ketikbulanb(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.bulanb); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b2) {  
				   Intent intent = new Intent(context,Ketikasalah5.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	protected void ketikbulanc(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.bulanc); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b2) {  
				   Intent intent = new Intent(context,Ketikasalah5.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	
	protected void ketikarrowkiri(){
		final Context context = this;
		ImageButton btn1 = (ImageButton)findViewById(R.id.leftarrow);
		btn1.setOnClickListener(new OnClickListener(){
			public void onClick (View a){
				Intent intent = new Intent(context,Soalhitung5.class);
				startActivity(intent);
			}
		});
	}
	
	protected void ketikarrowkanan(){
		final Context context = this;
		ImageButton btn2 = (ImageButton)findViewById(R.id.rightarrow);
		btn2.setOnClickListener(new OnClickListener(){
			public void onClick (View a2){
				Intent intent = new Intent(context,Soalhitung1.class);
				startActivity(intent);
			}
		});
	}
		
	
	
	
}
