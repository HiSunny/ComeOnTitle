package com.example.comeonlinearlayouttitle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.Button;
import android.view.View;
import android.annotation.SuppressLint;
import android.app.Activity;
@SuppressLint("NewApi")
public class TitleLayout extends LinearLayout{

	public TitleLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	public TitleLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		LayoutInflater.from(context).inflate(R.layout.title, this);
		
		Button back_btn = (Button)findViewById(R.id.back);
		back_btn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View view){
				//Context android.view.View.getContext()
				//Returns the context the view is running in
				((Activity) getContext()).finish();
			}
		});
	}
	public TitleLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	

	

}
