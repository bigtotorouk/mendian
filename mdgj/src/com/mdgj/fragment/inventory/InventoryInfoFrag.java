package com.mdgj.fragment.inventory;

import com.mdgj.InventoryActivity;
import com.mdgj.InventoryAddActivyt;
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
public class InventoryInfoFrag extends Fragment implements OnClickListener {
	private InventoryActivity parentActivity;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		parentActivity = (InventoryActivity)getActivity();
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.frag_inventory_info, container, false);
		view.findViewById(R.id.add).setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.add:
			//parentActivity.togglePage(1);
			startActivity(new Intent(parentActivity, InventoryAddActivyt.class));
			break;

		default:
			break;
		}
		
	}
}
