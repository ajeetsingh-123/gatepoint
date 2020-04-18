package com.example.gp;

import android.net.Uri;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

@SuppressLint("NewApi") 
public class Contactus extends Fragment {
	Button txt1;
	Button txt2;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreateView(inflater, container, savedInstanceState);
  		View rootView = inflater.inflate(R.layout.activity_contactus, container, false);
  		txt1 = (Button)rootView.findViewById(R.id.phnumber);
  		txt2 = (Button)rootView.findViewById(R.id.email);
  	 	txt1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918090270327"));
			    startActivity(intent);  
			}
  		});
  	 	
	return rootView;
	}
} 

