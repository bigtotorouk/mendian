package com.mdgj.fragment.menu;

import com.mdgj.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * 商业管理界面
 * @author bing
 *
 */
public class BusinessManageFrag extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.frag_business_manage, container, false);
		return view;
	}
}
