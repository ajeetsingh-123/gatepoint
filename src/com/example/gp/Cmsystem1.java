package com.example.gp;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.example.gp.R;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cmsystem1 extends Activity {
	
	 private Button openPDF,back;
     @Override
     protected void onCreate(Bundle savedInstanceState)
     {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_cmsystem1);
        openPDF = (Button)findViewById(R.id.button2);
         back = (Button)findViewById(R.id.button1);
         openPDF.setOnClickListener(new View.OnClickListener() {
          @Override
         public void onClick(View v) {
           // TODO Auto-generated method stub
           openPdf();
            CopyReadAssets(); }
         });
         back.setOnClickListener(new View.OnClickListener(){
        	 @Override
             public void onClick(View v) {
               // TODO Auto-generated method stub
        		 Intent obj=new Intent(Cmsystem1.this,HomeFragment.class);
        		 startService(obj);
    		     finish();
			 }
             });
         }
        

     
void openPdf()
{
Intent intent = new Intent(Intent.ACTION_VIEW);
//String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/PDF";

File file = new File("/assets", "cmm.pdf");

intent.setDataAndType( Uri.fromFile( file ), "application/pdf" );
 startActivity(intent);
}


     private void CopyReadAssets()
     {
         AssetManager assetManager = getAssets();

         InputStream in = null;
         OutputStream out = null;
         File file = new File(getFilesDir(), "cmm.pdf");
         try
         {
             in = assetManager.open("cmm.pdf");
             out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

             copyFile(in, out);
             in.close();
             in = null;
             out.flush();
             out.close();
             out = null;
         } catch (Exception e)
         {
             Log.e("tag", e.getMessage());
         }

         Intent intent = new Intent(Intent.ACTION_VIEW);
         intent.setDataAndType(
                 Uri.parse("file://" + getFilesDir() + "/cmm.pdf"),
                 "application/pdf");

         startActivity(intent);
     }

     private void copyFile(InputStream in, OutputStream out) throws IOException
     {
         byte[] buffer = new byte[1024];
         int read;
         while ((read = in.read(buffer)) != -1)
         {
             out.write(buffer, 0, read);
         }
     }

 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cmsystem1, menu);
		return true;
	}

}
