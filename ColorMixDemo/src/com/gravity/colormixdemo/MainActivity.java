package com.gravity.colormixdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.gravity.colormixer.ColorSelector;

public class MainActivity extends ActionBarActivity implements
		ColorSelector.ColorControl, OnClickListener {

	Button select1, select2, select3, select4, select5, select6, select7, select8;

	ColorSelector cs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		select1 = (Button) findViewById(R.id.select1);
		select2 = (Button) findViewById(R.id.select2);
		select3 = (Button) findViewById(R.id.select3);
		select4 = (Button) findViewById(R.id.select4);
		select5 = (Button) findViewById(R.id.select5);
		select6 = (Button) findViewById(R.id.select6);
		select7 = (Button) findViewById(R.id.select7);
		select8 = (Button) findViewById(R.id.select8);
		select1.setOnClickListener(this);
		select2.setOnClickListener(this);
		select3.setOnClickListener(this);
		select4.setOnClickListener(this);
		select5.setOnClickListener(this);
		select6.setOnClickListener(this);
		select7.setOnClickListener(this);
		select8.setOnClickListener(this);
		}

	@Override
	public void onCancelled() {
		// TODO Auto-generated method stub
		Toast.makeText(MainActivity.this, "Color selecotor cancelled",
				Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onColorSelected(int color) {
		// TODO Auto-generated method stub
		Toast.makeText(MainActivity.this, "Selected color was: " + color,
				Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id = v.getId();
		switch (id) {
		case R.id.select1:
			cs = new ColorSelector(MainActivity.this, MainActivity.this);
			cs.show();
			break;
		case R.id.select2:
			cs = new ColorSelector(MainActivity.this, MainActivity.this);
			cs.show();
			cs.setColor(0xffff0000);
			break;
		case R.id.select3:
			cs = new ColorSelector(MainActivity.this, MainActivity.this);
			cs.setRGBColor(255, 0, 0);
			cs.show();
			break;
		case R.id.select4:
			cs = new ColorSelector(MainActivity.this, MainActivity.this);
			cs.supportsAlpha(true);
			cs.show();
			break;
		case R.id.select5:
			cs = new ColorSelector(MainActivity.this, MainActivity.this);
			cs.setARGBColor(100, 255, 0, 0);
			cs.supportsAlpha(true);
			cs.show();
			break;
		case R.id.select6:
			cs = new ColorSelector(MainActivity.this, MainActivity.this);
			cs.setRGBColor(255, 0, 0);
			cs.colorPreview(false);
			cs.show();
			break;
		case R.id.select7:
			cs = new ColorSelector(MainActivity.this, MainActivity.this);
			cs.setARGBColor(100, 255, 0, 0);
			cs.supportsAlpha(true);
			cs.showLEDS(false);
			cs.show();
			break;
		case R.id.select8:
			cs = new ColorSelector(MainActivity.this, MainActivity.this, 4);
			cs.setARGBColor(100, 255, 0, 0);
			cs.supportsAlpha(true);
			cs.show();
			break;
		}
	}
}
