package com.example.gp;
import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class GpointActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gpoint);
		Timer obj=new Timer();
		TimerTask obj1=new tt();
		obj.schedule(obj1,3500);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gpoint, menu);
		return true;
	}
	class tt extends TimerTask
	{

		@Override
		public void run()
		{
		     Intent obj=new Intent(GpointActivity.this,MainMenu.class);
		     startActivity(obj);
		     finish();
		     
			
		}
	}

}
