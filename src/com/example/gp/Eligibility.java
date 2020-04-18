package com.example.gp;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("NewApi")
public class Eligibility extends Fragment {
       TextView t1;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreateView(inflater, container, savedInstanceState);
  		View rootView = inflater.inflate(R.layout.activity_eligibility, container, false);
  		t1=(TextView)rootView.findViewById(R.id.textv);
  		t1.setText(Html.fromHtml("<font color=\"#000000\">"+"\t\t Bachelor's degree holders in Engineering /Technology" +
  				"/architecture(4 year after 10+2) and those who are in the final year of such programmes." +"</font>"+
  				"<font color=\"#ff0000\" size=\"18\">"+"\t\t\t\t\t\t\t\t\t\t\t\t\tOR"+"</font>"+
  				"<font color=\"#000000\">"+ "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMaster's degree holders in any branch of " +
  						"science/mathematics/Statistics/Computer Application or equivalant" +
            	" and those who are in final or pre-final of such programmes." +"</font>"+"<font color=\"#ff0000\">"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tOR"+"</font>"+
  	            "<font color=\"#000000\" size=\"18\">"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCandidates" +
  	            		" in second  or higher year of the four-year Integrated Master's digree programme" +
  				"(Post-B.sc.) in Engineering/Technology or in the third or higher year of five-year " +
  				"integrated master's degrre programme and Dual Degree programme in Engineering/Technology."+"</font>"+
  				"<font color=\"#ff0000\">"+"\t\t\t\t\t\t\tOR"+"</font>"+
  				"<font color=\"#000000\">"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCandidates with qualifications " +
  						"obtained through examinations conducted by professional societes" +
  		         " recognized by UPSC/AICTE(e.g. AMIE by IE(I),AMICE(I) by the Institute of civil Engineers(India)" +
  		    	 "-ICE(I)) as equivalant to B.E./B.Tech. Those who completed section A or equivalant of such professional "+
  		    	 "courses are also eligible"+"</font>"+"<font color=\"#ff0000\">"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tOR"+"</font>"+"<font color=\"#000000\">"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCandidate declared \"GATE qualified at the time of admission \"is entitled" +
  		    	 " for MHRD fellowship for 24 month unless he/she losses it due to poor performance in the registered programme... "+"</font>"));
	
	return rootView;
	}
}
