package com.mdgj.fragment.inventory;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.mdgj.R;
import com.mdgj.util.ContextUtil;
/**
 * Inventory add , edit
 * @author bing
 *
 */
public class InventoryAddFrag extends Fragment implements OnClickListener{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_inventory_add, container, false);
		view.findViewById(R.id.back).setOnClickListener(this);
		ContextUtil.hideKeyBoard(view, getActivity());
		return view;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.back:
			
			break;

		default:
			break;
		}
		
	}
}
