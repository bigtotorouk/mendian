package com.mdgj;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
/**
 * 登陆界面，导航界面
 * @author bing
 *
 */
public class LoginActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		findViewById(R.id.login).setOnClickListener(this);
		
		System.out.println(java.util.UUID.randomUUID());
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.login:
			startActivity(new Intent(this, MenuActivity.class));
			this.finish();
			break;
		default:
			break;
		}
		
	}

}
