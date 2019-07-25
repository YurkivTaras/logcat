package com.devlight.logcat_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.devlight.logcat.LogcatActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.btn_main_open_logcat).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this, LogcatActivity.class);
				intent.putExtra(LogcatActivity.BUFFER_SIZE_EXTRA, 1000);
				startActivity(intent);
			}
		});
	}
}
