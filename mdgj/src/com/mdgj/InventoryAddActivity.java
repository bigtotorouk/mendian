package com.mdgj;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
/**
 * inventory add , edit
 * @author bing
 *
 */
public class InventoryAddActivity extends Activity implements OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_inventory_add);
		super.onCreate(savedInstanceState);
		
		findViewById(R.id.back).setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.back:
			InventoryAddActivity.this.finish();
			break;

		default:
			break;
		}
		
	}
}
