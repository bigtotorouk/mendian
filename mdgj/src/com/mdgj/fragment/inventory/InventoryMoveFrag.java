package com.mdgj.fragment.inventory;

import com.mdgj.PurchaseAddActivity;
import com.mdgj.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
/**
 * 仓库管理界面
 * @author bing
 *
 */
public class InventoryMoveFrag extends Fragment implements OnClickListener {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.frag_inventory_move, container, false);
		view.findViewById(R.id.add).setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.add:
			startActivity(new Intent(getActivity(), PurchaseAddActivity.class));
			break;

		default:
			break;
		}
	}
}
