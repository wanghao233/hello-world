package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
//import android.view.view;


public class firstactivity extends baseactivity {

		@Override
		protected void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			Log.d("firstactivity", this.toString() + "task id is" + getTaskId());
			requestWindowFeature(Window.FEATURE_NO_TITLE);
			setContentView(R.layout.first_layout);
			
			Button button1 = (Button)findViewById(R.id.button_1);
			button1.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v){
					//Toast.makeText(firstactivity.this, "you cliced button 1", Toast.LENGTH_SHORT).show();
					//Intent intent = new Intent(firstactivity.this, secondactivity.class);
					//startActivity(intent);
					//Intent intent = new Intent("com.example.activitytest.ACTION_START");
					//intent.addCategory("com.example.activitytest.MY_CATEGORY");
					//startActivity(intent);
					//finish();
					//Intent intent = new Intent(Intent.ACTION_VIEW);
					//intent.setData(Uri.parse("http://www.baidu.com"));
					//intent.setData(Uri.parse("http://www.qq.com"));
					//Intent intent = new Intent(Intent.ACTION_DIAL);
					//intent.setData(Uri.parse("tel:13824125580"));
					//String data = "hello secondactivity";
					//Intent intent = new Intent(firstactivity.this, secondactivity.class);
					//intent.putExtra("extra_data", data);
					//startActivity(intent);
					//Log.d("firstactivity", "first activity");
					//Intent intent = new Intent(firstactivity.this, secondactivity.class);
					//Intent intent = new Intent(firstactivity.this, firstactivity.class);
					//intent.putExtra("param1", "data1");
					//intent.putExtra("param2", "data2");
					
					//startActivity(intent);
					//startActivityForResult(intent, 1);
					secondactivity.actionstart(firstactivity.this, "data1", "data2");
				}
			});
		}
		
		@Override
		protected void onRestart()
		{
			super.onRestart();
			Log.d("firstactivity", "onRestart");
		}
		
		
		@Override
		public boolean onCreateOptionsMenu(Menu menu)
		{
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}
		
		@Override
		public boolean onOptionsItemSelected(MenuItem item)
		{
			switch(item.getItemId()) {
			case R.id.add_item:
				Toast.makeText(this, "you clicked add", Toast.LENGTH_SHORT).show();
				break;
			case R.id.remove_item:
				Toast.makeText(this, "you clicked remove", Toast.LENGTH_SHORT). show();
				break;
			default:
				break;
			}
			return true;
		}
		
		@Override
		protected void onActivityResult(int requestCode, int resultCode, Intent data){
			switch(requestCode){
			case 1:
				if(resultCode == RESULT_OK){
					String returnData = data.getStringExtra("data_return");
					Log.d("firstactivity", returnData);
				}
				break;
			default:
				break;
			}
		}
		
}
