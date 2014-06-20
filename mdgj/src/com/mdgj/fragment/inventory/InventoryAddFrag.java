package com.mdgj.fragment.inventory;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mdgj.R;
/**
 * Inventory add , edit
 * @author bing
 *
 */
public class InventoryAddFrag extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_inventory_add, container, false);
		return view;
	}
}
