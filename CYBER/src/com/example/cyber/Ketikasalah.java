package com.example.cyber;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ketikasalah extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ketikasalah);
		
		ketikbenar();
		
	}

	protected void ketikbenar(){
		final Context context = this;
		Button arrow = (Button) findViewById(R.id.salah); 
		arrow.setOnClickListener(new View.OnClickListener() {  
			   @Override  
			   public void onClick(View b1) {  
				   Intent intent = new Intent(context,Soalhitung1.class);
					startActivity(intent);
			   }  
			  });
		
		}
	
	
	

}
