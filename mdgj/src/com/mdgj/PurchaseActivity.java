package com.mdgj;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 * 采购信息界面
 * 
 * @author lizhan
 * 
 */
public class PurchaseActivity extends FragmentActivity implements
		OnClickListener {

	private TextView mTitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_purchase);
		findViewById(R.id.previous).setOnClickListener(this);
		mTitle = (TextView) findViewById(R.id.title);

		initData();
	}

	private void initData() {
		int purchaseType = getIntent().getIntExtra(
				Constants.PURCHASE_MANAGE_PURCHASE_TYPE, 0);
		switch (purchaseType) {
		case 0:// 默认显示今日采购
			mTitle.setText("今日采购");
			break;
		case R.id.today_purchase:// 今日采购
			mTitle.setText("今日采购");
			break;
		case R.id.week_purchase:// 本周采购
			mTitle.setText("2014.6.8~2014.6.15");
			break;
		case R.id.month_purchase:// 本月采购
			mTitle.setText("2014年6月");
			break;
		default:
			break;
		}
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
