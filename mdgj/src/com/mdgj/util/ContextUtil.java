package com.mdgj.util;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class ContextUtil {
	public static void hideKeyBoard(View view, Context context) {
		InputMethodManager imm = (InputMethodManager) context
				.getSystemService(Context.INPUT_METHOD_SERVICE);
		imm.showSoftInput(view, InputMethodManager.SHOW_FORCED);
		imm.hideSoftInputFromWindow(view.getWindowToken(), 0);// 强制隐藏键盘
	}

}
