package com.mdgj;

import com.mdgj.util.ContextUtil;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
/**
 * inventory move's add , edit
 * 新增仓库调拨单界面
 * @author bing
 *
 */
public class InventoryAddMoveActivity extends Activity implements OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_inventory_add_move);
		super.onCreate(savedInstanceState);
		
		findViewById(R.id.back).setOnClickListener(this);
		
		ContextUtil.hideKeyBoard(findViewById(R.id.back), this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.back:
			InventoryAddMoveActivity.this.finish();
			break;

		default:
			break;
		}
		
	}
}
