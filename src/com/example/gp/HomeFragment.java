package com.example.gp;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

@SuppressLint("NewApi")
public class HomeFragment extends Fragment 
{
	ImageButton img1,img2,img3,img4;																	
	Button b1,b2,b3,b4,back,back1;
	ListView l,lv;
	TextView txt1;
	Thread t;
	String news1,s;
	LinearLayout l1,l2;
	private ArrayAdapter<String> adapter;
	String []a,b,c,e,f,g,h,i;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreateView(inflater, container, savedInstanceState);
  		View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        
			img1 = (ImageButton)rootView.findViewById(R.id.img1);
			img2 = (ImageButton)rootView.findViewById(R.id.img2);
			img3 = (ImageButton)rootView.findViewById(R.id.img3);
			img4 = (ImageButton)rootView.findViewById(R.id.img4);
			
			l1	 =( LinearLayout)rootView.findViewById(R.id.llt1);
			l2	 =( LinearLayout)rootView.findViewById(R.id.llt2);
			
			txt1 = (TextView)rootView.findViewById(R.id.txt1);
			b1 = ( Button)rootView.findViewById(R.id.b1);
			b2 = ( Button)rootView.findViewById(R.id.b2);
			b3 = ( Button)rootView.findViewById(R.id.b3);
			b4 = ( Button)rootView.findViewById(R.id.b4);
			back =(Button)rootView.findViewById(R.id.b5);
			back1 =(Button)rootView.findViewById(R.id.b6);
			
			l  = ( ListView)rootView.findViewById(R.id.listView1);
			lv  = ( ListView)rootView.findViewById(R.id.listView2);
			
			

			b1.setVisibility(View.VISIBLE);
			img1.setVisibility(View.VISIBLE);
		
			b2.setVisibility(View.VISIBLE);
			img2.setVisibility(View.VISIBLE);
			
			b3.setVisibility(View.VISIBLE);
			img3.setVisibility(View.VISIBLE);
			
			b4.setVisibility(View.VISIBLE);
			img4.setVisibility(View.VISIBLE);
			
			l1.setVisibility(View.VISIBLE);
			l2.setVisibility(View.GONE);
			//lv.setVisibility(View.GONE);
		    //back1.setVisibility(View.GONE);
			
			b1.setText(Html.fromHtml("<font color=\"#ffffff\" >"+"<big><b>"+"Engineering Mathematics\n"+"</b></big>"+"</font></br>"
			+"<small><b>"+"Logic,Probability,Set Theory & Algebra,combinatorics,Graph Theory,Linear Algebra," +
			"calculus"+"</b></small>"+"<br />"));
			
			b2.setText(Html.fromHtml("<font color=\"#ffffff\" size=\"10\">"+"<big><b>"+"Computer Science\n"+"</b></big></br>"+"</font>"
			+"<small>"+"\n"+"\t\t\t\t\t\t\t\tDigital Logic,Algorithms,Theory of Computation,Compiler Design," +
			"Operating System,Databases,Computer Network" +"</br>"+
			"Data Structure"+"</small>"+"<br/>"));
			
			b3.setText(Html.fromHtml("<font color=\"#ffffff\" size=\"10\">"+"<b><big>"+"Electronics & Communication\n"+"</big></b></br>"+"</font>"
			+"<small>"+"Networks,Electronic devices,Anlog Circuits," +"</br>"+
					"Digital circuits,Signals And Systems Control Systems,Communications,..."+"</small>"+"<br />"));
			
			b4.setText(Html.fromHtml("<font color=\"#ffffff\">"+"<b><big>"+"Gate News...\n"+"</big></b>"
			+"<small>"+"</font>"+"</small>"+"<br />"));
			a   = new String[4];
			a[0]="Discrete Mathematics                        >";
			a[1]="Linear Algebra                                     >";
			a[2]="Probability                                           >";
			a[3]="Calculus                                               >";
		
            b = new String[8];
            b[0]="Digital Logic                                        >";
            b[1]="Computer Organisation and Architecture                                         >";
            b[2]="Design and Analysis of Algorithms  >";
            b[3]="Theory of Computation                      >";
            b[4]="Compiler Design                                 >"; 
            b[5]="Operating System                              >";
            b[6]="Database Management System      >";
            b[7]="Computer Network                             >";
            
            c = new String[8];
            c[0]="Anlog Circuit                                      >";
            c[1]="Control System                                  >";
            c[2]="Digital Logic                                       >";
            c[3]="Electonic device and Circuits           >";
            c[4]="Signal and Systems                          >";
            c[5]="Communication System                   >";
            c[6]="EMF Theory                                        >";
            c[7]="Electrical Networks Theory              >";
        
			
			b1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
				call1();	
				}
			});
			
			img1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					call1();
				}
			}
			);
			b2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
				call2();	
				}
			});
			
			img2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					call2();
				}
				
			}
			);
			b3.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
				call3();	
				}
			});
			
			img3.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					call3();
				}
				
			}
			);
			b4.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
				call4();
				}
			});
			
			img4.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					call4();
				}
			}
			);
		back.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				l1.setVisibility(View.VISIBLE);
				l2.setVisibility(View.GONE);
				lv.setVisibility(View.GONE);
				l.setVisibility(View.GONE);
				
				
			}
			
		});
		back1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				call2();
				back.setVisibility(View.VISIBLE);
				back1.setVisibility(View.GONE);
				l1.setVisibility(View.VISIBLE);
				l2.setVisibility(View.GONE);
				lv.setVisibility(View.GONE);
				l.setVisibility(View.GONE);
			}
			
		});
    return rootView;
}

	private void call1() {
		// TODO Auto-generated method stub
		list1();
		lv.setVisibility(View.GONE);
		back1.setVisibility(View.GONE);
		l.setVisibility(View.VISIBLE);
		l2.setVisibility(View.VISIBLE);
		l1.setVisibility(View.GONE);
		txt1.setVisibility(View.GONE);
	}
	private void call2() {
		// TODO Auto-generated method stub
		list2();
		lv.setVisibility(View.VISIBLE);
		l2.setVisibility(View.VISIBLE);
		l1.setVisibility(View.GONE);
		l.setVisibility(View.GONE);
		txt1.setVisibility(View.GONE);
	}
	private void call3() {
		// TODO Auto-generated method stub
		list3();
		back1.setVisibility(View.GONE);
		lv.setVisibility(View.GONE);
		l.setVisibility(View.VISIBLE);
		l2.setVisibility(View.VISIBLE);
		l1.setVisibility(View.GONE);
		txt1.setVisibility(View.GONE);
		
	}
	private void call4() {
		// TODO Auto-generated method stub
		txt1.setVisibility(View.VISIBLE);
		lv.setVisibility(View.GONE);
		back1.setVisibility(View.GONE);
		l.setVisibility(View.GONE);
		t=new Thread()
		{
				public void run(){
				List<BasicNameValuePair> li;
				li=new ArrayList<BasicNameValuePair>();
				li.add(new BasicNameValuePair("key","cvb"));
				
				httpconnection con=new httpconnection();
				final String res=con.get_httpvalue("http://10.0.2.2:8090/examples/Gate_news.jsp", li, getActivity());
				JSONArray jAr = null;
				 //s="Sorry! you are not connected to server...";
				try{
					jAr = new JSONArray(res);
					JSONObject obj = null;
					obj = jAr.getJSONObject(0);
					news1 = obj.getString("info");
					
					
				}catch(JSONException e){
					 e.printStackTrace();
					System.out.println("Sorry! you are not connected to server...");
					//Toast.makeText(getActivity(), s, Toast.LENGTH_LONG).show();
				}
			      getActivity().runOnUiThread(new Runnable(){
					public void run(){
						Toast.makeText(getActivity(), news1, Toast.LENGTH_LONG).show();
					//	txt1.setText(news1);
					//	l1.setVisibility(View.GONE);
					//	l2.setVisibility(View.VISIBLE);
						
					}
				});
				}
			};
		t.start();
		
	}
	private void list1() {
		    // TODO Auto-generated method stub
		      adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,a);
		      l.setAdapter(adapter);		
		       l.setOnItemClickListener(new OnItemClickListener()
	           {
  	              @Override
  	              public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3)
		         	{
                    String res=l.getItemAtPosition(arg2).toString();
			          //String type=state.getSelectedItem().toString();
				     //Toast.makeText(getActivity(),res,Toast.LENGTH_LONG).show();
					   for(int d=0;d<4;d++)	
					   if(res.equals(a[d]))
						{ 
						 switch (d) {
							case 0:
								Intent i=new Intent(getActivity(),Discrete.class);
								startActivity(i);
								break;
							
							case 1:
								Intent p=new Intent(getActivity(),LinearAlgebra.class);
								startActivity(p);
								break;
							case 2:
								Intent q=new Intent(getActivity(),Probability.class);
								startActivity(q);
								break;
							case 3:
								Intent r=new Intent(getActivity(),Calculus.class);
								startActivity(r);
								break;
							default:
								break;
						 
						 }
						}
						l.setAdapter(adapter);
						//l.setVisibility(View.GONE);
						back.setVisibility(View.GONE);
						back1.setVisibility(View.VISIBLE);
					}
			 });

	      }
	
	private void list2() {
		// TODO Auto-generated method stub
		adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,b);
		lv.setAdapter(adapter);
		lv.setOnItemClickListener(new OnItemClickListener()
	    {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
	
						String res=lv.getItemAtPosition(arg2).toString();
						//String type=state.getSelectedItem().toString();
						//Toast.makeText(getActivity(),res,Toast.LENGTH_LONG).show();
						for(int d=0;d<8;d++)
							 if(res.equals(b[d]))
								{ 
							  switch (d) {
									case 0:
										Intent i=new Intent(getActivity(),Digital1.class);
										startActivity(i);
										break;
									
									case 1:
										Intent p=new Intent(getActivity(),Digital1.class);
										startActivity(p);
										break;
									case 2:
										Intent q=new Intent(getActivity(),Algo.class);
										startActivity(q);
										break;
									case 3:
										Intent r=new Intent(getActivity(),Toc1.class);
										startActivity(r);
										break;
									case 4:
										Intent s =new Intent(getActivity(),Compiler1.class);
										startActivity(s);
										break;
									
									case 5:
										Intent t=new Intent(getActivity(),Os1.class);
										startActivity(t);
										break;
									case 6:
										Intent u=new Intent(getActivity(),Database1.class);
										startActivity(u);
										break;
									case 7:
										Intent v=new Intent(getActivity(),Networking1.class);
										startActivity(v);
										break;
									default:
										break;
								 }
								}
						lv.setAdapter(adapter);
						//l.setVisibility(View.GONE);
						back.setVisibility(View.GONE);
						back1.setVisibility(View.VISIBLE);
					}
			});
	}
	private void list3() {
		// TODO Auto-generated method stub
		adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,c);
		l.setAdapter(adapter);
        l.setOnItemClickListener(new OnItemClickListener()
	      {
            @Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
	
						String res=l.getItemAtPosition(arg2).toString();
						//String type=state.getSelectedItem().toString();
						//Toast.makeText(getActivity(),res,Toast.LENGTH_LONG).show();
						for(int d=0;d<8;d++)
							 if(res.equals(c[d]))
								{ 
								 switch (d) {
									case 0:
										Intent i=new Intent(getActivity(),Anlog1.class);
										startActivity(i);
										break;
									
									case 1:
										Intent p=new Intent(getActivity(),Csystem1.class);
										startActivity(p);
										break;
									case 2:
										Intent q=new Intent(getActivity(),Digital1.class);
										startActivity(q);
										break;
									case 3:
										Intent r=new Intent(getActivity(),Edc1.class);
										startActivity(r);
										break;
									case 4:
										Intent s =new Intent(getActivity(),Ssystem1.class);
										startActivity(s);
										break;
									
									case 5:
										Intent t=new Intent(getActivity(),Cmsystem1.class);
										startActivity(t);
										break;
									case 6:
										Intent u=new Intent(getActivity(),Emf1.class);
										startActivity(u);
										break;
									case 7:
										Intent v=new Intent(getActivity(),Ent1.class);
										startActivity(v);
										break;
									default:
										break;
								 }
								}
						l.setAdapter(adapter);
						//l.setVisibility(View.GONE);
						back.setVisibility(View.GONE);
						back1.setVisibility(View.VISIBLE);
					}
			});

	}
}