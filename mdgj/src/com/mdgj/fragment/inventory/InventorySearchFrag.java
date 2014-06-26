package com.mdgj.fragment.inventory;

import com.mdgj.InventoryActivity;
import com.mdgj.R;
import com.mdgj.popwindow.InventoryPop;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
/**
 * 仓库管理界面
 * @author bing
 *
 */
public class InventorySearchFrag extends Fragment implements OnClickListener {
	private InventoryActivity parentActivity;
	private EditText content;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		parentActivity = (InventoryActivity)getActivity();
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.frag_inventory_search, container, false);
		view.findViewById(R.id.search).setOnClickListener(this);
		view.findViewById(R.id.back).setOnClickListener(this);
		content = (EditText)view.findViewById(R.id.content);
		content.setHint("商品名称、仓库名称、商品拼音首字母");
		return view;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.search:
			new InventoryPop(getActivity(), v);
			break;
		case R.id.back:
			parentActivity.finish();
			break;
		default:
			break;
		}
		
	}
}
