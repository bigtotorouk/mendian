package com.mdgj.fragment.account;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.mdgj.LoginActivity;
import com.mdgj.MenuActivity;
import com.mdgj.R;
import com.mdgj.util.ContextUtil;

public class LoginFrag extends Fragment implements OnClickListener{
	private LoginActivity parentActivity = null;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		parentActivity = (LoginActivity)getActivity();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.frag_account_login, container, false);
		view.findViewById(R.id.login).setOnClickListener(this);
		view.findViewById(R.id.register).setOnClickListener(this);
		ContextUtil.hideKeyBoard(view, getActivity());
		return view;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.login:
			startActivity(new Intent(getActivity(), MenuActivity.class));
			getActivity().finish();
			break;
		case R.id.register:
			parentActivity.togglePage(1);
			break;
		default:
			break;
		}
		
	}
}
