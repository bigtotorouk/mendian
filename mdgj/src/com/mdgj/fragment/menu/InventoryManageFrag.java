package com.mdgj.fragment.menu;

import com.mdgj.InventoryActivity;
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
public class InventoryManageFrag extends Fragment implements OnClickListener {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.frag_inventory_manage, container, false);
		view.findViewById(R.id.inventory_info).setOnClickListener(this);
		view.findViewById(R.id.inventory_search).setOnClickListener(this);
		view.findViewById(R.id.inventory_check).setOnClickListener(this);
		view.findViewById(R.id.inventory_move).setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		Intent intent  = new Intent(getActivity(), InventoryActivity.class);
		int position = 0;
		switch (v.getId()) {
		case R.id.inventory_info:
			position = 0;
			intent.putExtra("position", position);
			startActivity(intent);
			break;
		case R.id.inventory_search:
			position = 1;
			intent.putExtra("position", position);
			startActivity(intent);
			break;
		case R.id.inventory_check:
			position = 2;
			intent.putExtra("position", position);
			startActivity(intent);
			break;
		case R.id.inventory_move:
			position = 3;
			intent.putExtra("position", position);
			startActivity(intent);
			break;
		default:
			break;
		}
		
	}
}
