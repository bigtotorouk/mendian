package com.mdgj.fragment.account;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.mdgj.LoginActivity;
import com.mdgj.R;
import com.mdgj.util.ContextUtil;

public class RegisterFrag extends Fragment implements OnClickListener{
	
	private LoginActivity parentActivity = null;
	
	private View layoutNumber, layoutVerifyCode;
	public static final int STATE_NUMBER = 0;
	public static final int STATE_VERIFY = 1;
	public int state = STATE_NUMBER;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		parentActivity = (LoginActivity)getActivity();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.frag_account_register, container, false);
		ContextUtil.hideKeyBoard(view, getActivity());
		
		layoutNumber = view.findViewById(R.id.layout_number);
		layoutVerifyCode = view.findViewById(R.id.layout_verify_code);
		view.findViewById(R.id.back).setOnClickListener(this);
		view.findViewById(R.id.fetch_verify).setOnClickListener(this);
		return view;
	}

	public void updateView(int state){
		if(state == STATE_NUMBER){
			layoutNumber.setVisibility(View.VISIBLE);
			layoutVerifyCode.setVisibility(View.GONE);
		}else {
			layoutNumber.setVisibility(View.GONE);
			layoutVerifyCode.setVisibility(View.VISIBLE);
		}
		this.state = state;
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.back:
			if(state == STATE_NUMBER){
				parentActivity.togglePage(0);
			}else{
				updateView(STATE_NUMBER);
			}
			
			break;
		case R.id.fetch_verify:
			updateView(STATE_VERIFY);
			break;
		default:
			break;
		}
	}
	
}
