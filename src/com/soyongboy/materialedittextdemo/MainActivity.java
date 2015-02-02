package com.soyongboy.materialedittextdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.yh.materialedittextdemo.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initEnableBt();
		initSingleLineEllipsisEt();
	}

	private void initEnableBt() {
		final EditText basicEt = (EditText) findViewById(R.id.basicEt);
		final Button enableBt = (Button) findViewById(R.id.enableBt);
		enableBt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				basicEt.setEnabled(!basicEt.isEnabled());
				enableBt.setText(basicEt.isEnabled() ? "DISABLE" : "ENABLE");
			}
		});
	}

	private void initSingleLineEllipsisEt() {
		EditText singleLineEllipsisEt = (EditText) findViewById(R.id.singleLineEllipsisEt);
		singleLineEllipsisEt.setSelection(singleLineEllipsisEt.getText()
				.length());
	}

	
}
