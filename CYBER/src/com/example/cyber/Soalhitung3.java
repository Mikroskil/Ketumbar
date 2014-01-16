package com.example.cyber;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;

public class Soalhitung3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.soalhitung3);
		
		ketikarrowback();
		ketikmataharia();
		ketikmataharib();
		ketikmataharic();
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
	
	protected void ketikmataharia(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.mataharia); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b1) {  
				   Intent intent = new Intent(context,Ketikabenar2.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	
	protected void ketikmataharib(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.mataharib); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b2) {  
				   Intent intent = new Intent(context,Ketikasalah2.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	protected void ketikmataharic(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.mataharic); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b2) {  
				   Intent intent = new Intent(context,Ketikasalah2.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	
	protected void ketikarrowkiri(){
		final Context context = this;
		ImageButton btn1 = (ImageButton)findViewById(R.id.leftarrow);
		btn1.setOnClickListener(new OnClickListener(){
			public void onClick (View a){
				Intent intent = new Intent(context,Soalhitung2.class);
				startActivity(intent);
			}
		});
	}
	
	protected void ketikarrowkanan(){
		final Context context = this;
		ImageButton btn2 = (ImageButton)findViewById(R.id.rightarrow);
		btn2.setOnClickListener(new OnClickListener(){
			public void onClick (View a2){
				Intent intent = new Intent(context,Soalhitung4.class);
				startActivity(intent);
			}
		});
	}
		
	
	
	
}
