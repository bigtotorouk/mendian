package com.mdgj;

import com.mdgj.fragment.account.LoginFrag;
import com.mdgj.fragment.account.RegisterFrag;
import com.mdgj.fragment.menu.AccountManageFrag;
import com.mdgj.fragment.menu.BusinessManageFrag;
import com.mdgj.fragment.menu.InventoryManageFrag;
import com.mdgj.fragment.menu.MoreManageFrag;
import com.mdgj.fragment.menu.PurchaseManageFrag;
import com.mdgj.fragment.menu.SaleManageFrag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

/**
 * 登陆界面，导航界面
 * 
 * @author bing
 * 
 */
public class LoginActivity extends FragmentActivity implements OnClickListener {
	private final String[] TAGS = { "login", "register" };
	private final Class<?>[] CLASSES = { LoginFrag.class,
			RegisterFrag.class };
	private int position = 0;
	private Fragment mContent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		

		System.out.println(java.util.UUID.randomUUID());

		startActivity(new Intent(LoginActivity.this, GuideActivity.class));
		
	}
	
	@Override
	protected void onResume() {
		togglePage(position);
		super.onResume();
	}
	
	public void togglePage(int position) {
		this.position = position;
		if (position < 0 || position > TAGS.length) {
			Toast.makeText(this, "out... in togglePage.", Toast.LENGTH_SHORT)
					.show();
			return;
		}
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
	public void onClick(View v) {
		

	}

}
