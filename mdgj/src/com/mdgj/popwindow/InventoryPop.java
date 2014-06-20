package com.mdgj.popwindow;

import com.mdgj.R;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.PopupWindow;

public class InventoryPop implements OnClickListener {
	private Context context;
	PopupWindow popupWindow;

	private EditText editContent;

	public InventoryPop(Context context, View view) {
		this.context = context;
		LayoutInflater inflater = LayoutInflater.from(context);
		View layout = inflater.inflate(R.layout.pop_inventory_search, null);
		popupWindow = new PopupWindow(layout,  400,  LayoutParams.WRAP_CONTENT, true);
		popupWindow.setFocusable(true);
		popupWindow.setOutsideTouchable(true);
		popupWindow.setBackgroundDrawable(new BitmapDrawable()); // 响应返回键必须的语句
		popupWindow.showAsDropDown(view);
		/*Rect rc = new Rect();
		view.getWindowVisibleDisplayFrame(rc);
		int[] xy = new int[2];
		view.getLocationInWindow(xy);
		rc.offset(xy[0], xy[1]);
		popupWindow.showAtLocation(view, Gravity.TOP | Gravity.LEFT, 400, 4);*/

		layout.findViewById(R.id.search).setOnClickListener(this);
		editContent = (EditText) layout.findViewById(R.id.content);

	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.search) {
			popupWindow.dismiss();
		}
	}

	public String getContent() {
		return editContent.getText().toString().trim();
	}

	private void OnKey() {
		// TODO Auto-generated method stub

	}
}
