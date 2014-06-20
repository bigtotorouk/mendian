package com.mdgj;

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
import android.widget.TextView;
import android.widget.Toast;
/**
 * 主菜单页面
 * @author bing
 *
 */
public class MenuActivity extends FragmentActivity implements OnClickListener {

	private final String[] TAGS = { "sales", "purchase", "inventory", "business",
	"account","more" };
	private final Class<?>[] CLASSES = { SaleManageFrag.class,
		PurchaseManageFrag.class, InventoryManageFrag.class, BusinessManageFrag.class,
		AccountManageFrag.class, MoreManageFrag.class };
	private int position = 0;
	private Fragment mContent;
	private TextView tab0, tab1, tab2, tab3, tab4, tab5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tab0 =(TextView) findViewById(R.id.radio_button0); tab0.setOnClickListener(this);
		tab1 =(TextView) findViewById(R.id.radio_button1); tab1.setOnClickListener(this);
		tab2 =(TextView) findViewById(R.id.radio_button2); tab2.setOnClickListener(this);
		tab3 =(TextView) findViewById(R.id.radio_button3); tab3.setOnClickListener(this);
		tab4 =(TextView) findViewById(R.id.radio_button4); tab4.setOnClickListener(this);
		tab5 =(TextView) findViewById(R.id.radio_button5); tab5.setOnClickListener(this);
		
		updateTab(R.id.radio_button0);
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

	/**
	 * startActivity(new Intent(this, AccountActivity.class));
	 * overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
	 */
	public void updateTab(int id){
		switch (id) {
		case R.id.radio_button0:
			tab0.setSelected(true);
			tab1.setSelected(false);
			tab2.setSelected(false);
			tab3.setSelected(false);
			tab4.setSelected(false);
			tab5.setSelected(false);
			togglePage(position = 0);
			break;
		case R.id.radio_button1:
			tab0.setSelected(false);
			tab1.setSelected(true);
			tab2.setSelected(false);
			tab3.setSelected(false);
			tab4.setSelected(false);
			tab5.setSelected(false);
			togglePage(position = 1);
			break;
		case R.id.radio_button2:
			tab0.setSelected(false);
			tab1.setSelected(false);
			tab2.setSelected(true);
			tab3.setSelected(false);
			tab4.setSelected(false);
			tab5.setSelected(false);
			togglePage(position = 2);
			break;
		case R.id.radio_button3:
			tab0.setSelected(false);
			tab1.setSelected(false);
			tab2.setSelected(false);
			tab3.setSelected(true);
			tab4.setSelected(false);
			tab5.setSelected(false);
			togglePage(position = 3);
			break;
		case R.id.radio_button4:
			tab0.setSelected(false);
			tab1.setSelected(false);
			tab2.setSelected(false);
			tab3.setSelected(false);
			tab4.setSelected(true);
			tab5.setSelected(false);
			togglePage(position = 4);
			break;
		case R.id.radio_button5:
			tab0.setSelected(false);
			tab1.setSelected(false);
			tab2.setSelected(false);
			tab3.setSelected(false);
			tab4.setSelected(false);
			tab5.setSelected(true);
			togglePage(position = 5);
			break;
		}
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.radio_button0:
		case R.id.radio_button1:
		case R.id.radio_button2:
		case R.id.radio_button3:
		case R.id.radio_button4:
		case R.id.radio_button5:
			updateTab(v.getId());
			break;

		default:
			break;
		}
		
	}

}
