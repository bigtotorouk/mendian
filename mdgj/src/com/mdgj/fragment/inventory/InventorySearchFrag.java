package com.mdgj.fragment.inventory;

import com.mdgj.R;
import com.mdgj.popwindow.InventoryPop;

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
public class InventorySearchFrag extends Fragment implements OnClickListener {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.frag_inventory_search, container, false);
		view.findViewById(R.id.search).setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.search:
			new InventoryPop(getActivity(), v);
			break;

		default:
			break;
		}
		
	}
}
