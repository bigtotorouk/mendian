package com.mdgj;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * 退货
 * 
 * @author lizhan
 * 
 */
public class PurchaseCancelActivity extends FragmentActivity implements
		OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_purchase_cancel);
		findViewById(R.id.previous).setOnClickListener(this);

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
