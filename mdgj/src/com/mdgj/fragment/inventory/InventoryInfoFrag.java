package com.mdgj.fragment.inventory;

import com.mdgj.InventoryActivity;
import com.mdgj.InventoryAddActivity;
import com.mdgj.R;
import com.mdgj.util.ContextUtil;
import android.content.Intent;
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
public class InventoryInfoFrag extends Fragment implements OnClickListener {
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
		View view = inflater.inflate(R.layout.frag_inventory_info, container, false);
		view.findViewById(R.id.add).setOnClickListener(this);
		view.findViewById(R.id.back).setOnClickListener(this);
		content = (EditText)view.findViewById(R.id.content);
		content.setHint("模板名称");
		ContextUtil.hideKeyBoard(view.findViewById(R.id.content), getActivity());
		return view;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.add:
			//parentActivity.togglePage(1);
			startActivity(new Intent(parentActivity, InventoryAddActivity.class));
			break;
		case R.id.back:
			parentActivity.finish();
			break;
		default:
			break;
		}
		
	}
}
