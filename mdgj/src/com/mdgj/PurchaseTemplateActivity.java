package com.mdgj;

import android.content.Intent;
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
		findViewById(R.id.ll_template1).setOnClickListener(this);
		findViewById(R.id.ll_template2).setOnClickListener(this);
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
		case R.id.ll_template1:
			Intent intent = new Intent(this, PurchaseAddActivity.class);
			startActivity(intent);
			this.finish();
			break;
		case R.id.ll_template2:
			Intent intent1 = new Intent(this, PurchaseAddActivity.class);
			startActivity(intent1);
			this.finish();
			break;

		default:
			break;
		}
	}

}
