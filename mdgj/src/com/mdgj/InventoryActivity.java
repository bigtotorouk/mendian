package com.mdgj;

import com.mdgj.fragment.inventory.InventoryAddFrag;
import com.mdgj.fragment.inventory.InventoryCheckFrag;
import com.mdgj.fragment.inventory.InventoryInfoFrag;
import com.mdgj.fragment.inventory.InventoryMoveFrag;
import com.mdgj.fragment.inventory.InventorySearchFrag;
import com.mdgj.fragment.menu.AccountManageFrag;
import com.mdgj.fragment.menu.BusinessManageFrag;
import com.mdgj.fragment.menu.InventoryManageFrag;
import com.mdgj.fragment.menu.MoreManageFrag;
import com.mdgj.fragment.menu.PurchaseManageFrag;
import com.mdgj.fragment.menu.SaleManageFrag;
import com.mdgj.util.ContextUtil;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;

/**
 * 各种库存管理界面：库存查询，移动，信息等
 * @author bing
 *
 */
public class InventoryActivity extends FragmentActivity {
	private final String[] TAGS = { "info", "search", "check", "move" };
	private final Class<?>[] CLASSES = { InventoryInfoFrag.class,
				InventorySearchFrag.class, InventoryCheckFrag.class, InventoryMoveFrag.class,
				};
	private int position = 0;
	private Fragment mContent;
			
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_inventory);
		position = getIntent().getIntExtra("position", 0);
		
		togglePage(position);
	}
	
	public void togglePage(int position) {
		this.position = position;
		if (position < 0 || position > TAGS.length) {
			Toast.makeText(this, "out... in togglePage.", Toast.LENGTH_SHORT)
					.show();
			return;
		}
		ContextUtil.hideKeyBoard(findViewById(R.id.content), this);
		Fragment fragment = getSupportFragmentManager().findFragmentByTag(
				TAGS[position]);
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		if (mContent != null) {
			ft.detach(mContent);
		}
		if (fragment == null) {
			fragment = Fragment.instantiate(this, CLASSES[position].getName());
			ft.add(R.id.content, fragment, TAGS[position]);
		} else {
			ft.attach(fragment);
		}
		mContent = fragment;
		ft.commit();
		getSupportFragmentManager().executePendingTransactions();
		
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
	}
}
