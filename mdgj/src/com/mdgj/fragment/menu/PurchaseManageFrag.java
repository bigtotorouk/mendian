package com.mdgj.fragment.menu;

import com.mdgj.Constants;
import com.mdgj.PurchaseActivity;
import com.mdgj.PurchaseAddActivity;
import com.mdgj.PurchaseCancelActivity;
import com.mdgj.PurchaseHistoryActivity;
import com.mdgj.PurchaseTemplateActivity;
import com.mdgj.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class PurchaseManageFrag extends Fragment implements OnClickListener {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.frag_purchase_manage, container,
				false);
		// 今日采购
		view.findViewById(R.id.today_purchase).setOnClickListener(this);
		// 本周采购
		view.findViewById(R.id.week_purchase).setOnClickListener(this);
		// 本月采购
		view.findViewById(R.id.month_purchase).setOnClickListener(this);
		// 记一笔
		view.findViewById(R.id.btn_add).setOnClickListener(this);
		// 模板快记
		view.findViewById(R.id.btn_template_add).setOnClickListener(this);
		// 采购历史
		view.findViewById(R.id.btn_purchase_history).setOnClickListener(this);
		// 退一笔
		view.findViewById(R.id.btn_cancel_purchase).setOnClickListener(this);
		// 退货历史
		view.findViewById(R.id.btn_cancel_purchase_history).setOnClickListener(
				this);
		return view;
	}

	@Override
	public void onClick(View arg0) {

		switch (arg0.getId()) {
		case R.id.today_purchase:// 今日采购
			Intent todayIntent = new Intent(getActivity(),
					PurchaseActivity.class);
			todayIntent.putExtra(Constants.PURCHASE_MANAGE_PURCHASE_TYPE,
					R.id.today_purchase);
			startActivity(todayIntent);
			break;
		case R.id.week_purchase:// 本周采购
			Intent weekIntent = new Intent(getActivity(),
					PurchaseActivity.class);
			weekIntent.putExtra(Constants.PURCHASE_MANAGE_PURCHASE_TYPE,
					R.id.week_purchase);
			startActivity(weekIntent);
			break;
		case R.id.month_purchase:// 本月采购
			Intent monthIntent = new Intent(getActivity(),
					PurchaseActivity.class);
			monthIntent.putExtra(Constants.PURCHASE_MANAGE_PURCHASE_TYPE,
					R.id.month_purchase);
			startActivity(monthIntent);
			break;
		case R.id.btn_add:// 记一笔
			Intent purchaseAddIntent = new Intent(getActivity(),
					PurchaseAddActivity.class);
			startActivity(purchaseAddIntent);
			break;
		case R.id.btn_template_add:// 模板快记
			Intent purchaseTemplateIntent = new Intent(getActivity(),
					PurchaseTemplateActivity.class);
			startActivity(purchaseTemplateIntent);
			break;
		case R.id.btn_purchase_history:// 采购历史
			Intent purchaseHistoryIntent = new Intent(getActivity(),
					PurchaseHistoryActivity.class);
			purchaseHistoryIntent.putExtra(
					Constants.PURCHASE_MANAGE_PURCHASE_HISTORY,
					R.id.btn_purchase_history);
			startActivity(purchaseHistoryIntent);
			break;
		case R.id.btn_cancel_purchase:// 退一笔
			Intent purchaseCancelIntent = new Intent(getActivity(),
					PurchaseCancelActivity.class);
			startActivity(purchaseCancelIntent);
			break;
		case R.id.btn_cancel_purchase_history:// 退货历史
			Intent cancelPurchaseHistoryIntent = new Intent(getActivity(),
					PurchaseHistoryActivity.class);
			cancelPurchaseHistoryIntent.putExtra(
					Constants.PURCHASE_MANAGE_PURCHASE_HISTORY,
					R.id.btn_cancel_purchase_history);
			startActivity(cancelPurchaseHistoryIntent);
			break;

		default:
			break;
		}
	}

}
