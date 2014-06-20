package com.mdgj;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * 模板快记
 * 
 * @author lizhan
 * 
 */
public class PurchaseTemplateActivity extends FragmentActivity implements
		OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_purchase_template);
		findViewById(R.id.previous).setOnClickListener(this);
		initData();
	}

	private void initData() {

	}

	@Override
	public void onClick(View arg0) {
		switch (arg0.getId()) {
		case R.id.previous:
			this.finish();
			break;

		default:
			break;
		}
	}

}
