package com.mdgj;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 * 选择商品
 * 
 * @author lizhan
 * 
 */
public class PurchaseGoodsActivity extends FragmentActivity implements
		OnClickListener {
	private TextView mTitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_purchase_goods);
		findViewById(R.id.previous).setOnClickListener(this);
		mTitle = (TextView) findViewById(R.id.title);
		initData();
	}

	private void initData() {
		int purchaseType = getIntent().getIntExtra(
				Constants.PURCHASE_MANAGE_PURCHASE_HISTORY, 0);
		switch (purchaseType) {
		case 0:// 默认显示采购订单历史
			mTitle.setText("选择商品");
			break;
		case R.id.btn_purchase_history:// 采购订单历史
			mTitle.setText("采购订单历史");
			break;
		case R.id.btn_cancel_purchase_history:// 退货历史
			mTitle.setText("退货订单历史");
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
