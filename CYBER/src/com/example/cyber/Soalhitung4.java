package com.example.cyber;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Soalhitung4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.soalhitung4);
		
		ketikarrowback();
		ketikbintanga();
		ketikbintangb();
		ketikbintangc();
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
	
	protected void ketikbintanga(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.bintanga); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b1) {  
				   Intent intent = new Intent(context,Ketikabenar3.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	
	protected void ketikbintangb(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.bintangb); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b2) {  
				   Intent intent = new Intent(context,Ketikasalah.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	protected void ketikbintangc(){
		final Context context = this;
		ImageButton arrow = (ImageButton) findViewById(R.id.bintangc); 
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
				Intent intent = new Intent(context,Soalhitung3.class);
				startActivity(intent);
			}
		});
	}
	
	protected void ketikarrowkanan(){
		final Context context = this;
		ImageButton btn2 = (ImageButton)findViewById(R.id.rightarrow);
		btn2.setOnClickListener(new OnClickListener(){
			public void onClick (View a2){
				Intent intent = new Intent(context,Soalhitung5.class);
				startActivity(intent);
			}
		});
	}
		
	
	
	
}
