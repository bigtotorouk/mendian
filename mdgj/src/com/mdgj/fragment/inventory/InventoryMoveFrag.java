package com.mdgj.fragment.inventory;

import com.mdgj.InventoryActivity;
import com.mdgj.InventoryAddActivity;
import com.mdgj.InventoryAddMoveActivity;
import com.mdgj.PurchaseAddActivity;
import com.mdgj.R;

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
public class InventoryMoveFrag extends Fragment implements OnClickListener {
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
		View view = inflater.inflate(R.layout.frag_inventory_move, container, false);
		view.findViewById(R.id.add).setOnClickListener(this);
		view.findViewById(R.id.back).setOnClickListener(this);
		content = (EditText)view.findViewById(R.id.content);
		content.setHint("单据号、仓库名");
		
		return view;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.add:
			startActivity(new Intent(getActivity(), InventoryAddMoveActivity.class));
			break;
		case R.id.back:
			parentActivity.finish();
		default:
			break;
		}
	}
}
