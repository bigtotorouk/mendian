package com.mdgj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * 新增采购订单
 * 
 * @author lizhan
 * 
 */
public class PurchaseAddActivity extends FragmentActivity implements
		OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_purchase_add);
		findViewById(R.id.previous).setOnClickListener(this);
		findViewById(R.id.txt_template).setOnClickListener(this);
		findViewById(R.id.ll_choose_goods).setOnClickListener(this);

	}

	@Override
	public void onClick(View arg0) {
		switch (arg0.getId()) {
		case R.id.previous:
			this.finish();
			break;
		case R.id.txt_template:
			Intent intent = new Intent(this, PurchaseTemplateActivity.class);
			startActivity(intent);
			this.finish();
			break;
		case R.id.ll_choose_goods:
			Intent intent1 = new Intent(this, PurchaseGoodsActivity.class);
			startActivity(intent1);
			this.finish();
			break;

		default:
			break;
		}
	}

}
