package com.example.cyber;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;


public class AppActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		ketikberhitung();
		ketikmembaca();
		ketikmenulis();
		
	}
	
	
	protected void ketikberhitung(){
		final Context context = this;
		ImageButton btn2 = (ImageButton)findViewById(R.id.berhitung);
		btn2.setOnClickListener(new OnClickListener(){
			public void onClick (View b1){
				Intent intent = new Intent(context,Berhitung.class);
				startActivity(intent);
			}
		});
	}
	
	
	protected void ketikmenulis(){
		final Context context = this;
		ImageButton btn3 = (ImageButton)findViewById(R.id.menulis);
		btn3.setOnClickListener(new OnClickListener(){
			public void onClick (View b1){
				Intent intent = new Intent(context,Menulisa.class);
				startActivity(intent);
			}
		});
	}
	
	protected void ketikmembaca(){
		final Context context = this;
		
		ImageButton btn1 =(ImageButton)findViewById(R.id.membaca);
		
		btn1.setOnClickListener(new OnClickListener(){
			public void onClick (View a1){
				Intent intent = new Intent(context,Membaca.class);
				
				startActivity(intent);
			}
			
		});
		
		
	}
		
	}
		
	
		
	
	
	
		
	
	
	
	



