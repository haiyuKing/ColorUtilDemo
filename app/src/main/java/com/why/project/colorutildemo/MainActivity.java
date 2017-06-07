package com.why.project.colorutildemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.why.project.colorutildemo.util.ColorUtil;

public class MainActivity extends AppCompatActivity {

	private static final String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initData();
	}
	private void initData() {

		String colorHex1 = ColorUtil.int2Hex(-12590395);//#3FE2C5
		String colorHex2 = ColorUtil.int2Hex2(-12590395);//#3FE2C5
		Log.w(TAG,"colorHex1="+colorHex1);
		Log.w(TAG,"colorHex2="+colorHex2);

		int[] colorRgb = ColorUtil.int2Rgb(-12590395);//63,226,197
		Log.w(TAG,"colorRgb="+colorRgb[0]+","+colorRgb[1]+","+colorRgb[2]);

		int colorInt1 = ColorUtil.hex2Int("#3FE2C5");//-12590395
		Log.w(TAG,"colorInt1="+colorInt1);
	}
}
