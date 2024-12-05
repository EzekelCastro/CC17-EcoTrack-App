
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		login_page
	 *	@date 		Thursday 05th of December 2024 06:00:30 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;

public class login_page_activity extends Activity {

	
	private View _bg__login_page;
	private ImageView rectangle_54;
	private ImageView rectangle_55;
	private View line_8;
	private ImageView _rectangle_54_ek1;
	private TextView login;
	private TextView _don_t_have_an_account__create_account;
	private TextView name;
	private TextView password;
	private ImageView image;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_page);

		
		_bg__login_page = (View) findViewById(R.id._bg__login_page);
		rectangle_54 = (ImageView) findViewById(R.id.rectangle_54);
		rectangle_55 = (ImageView) findViewById(R.id.rectangle_55);
		line_8 = (View) findViewById(R.id.line_8);
		_rectangle_54_ek1 = (ImageView) findViewById(R.id._rectangle_54_ek1);
		login = (TextView) findViewById(R.id.login);
		_don_t_have_an_account__create_account = (TextView) findViewById(R.id._don_t_have_an_account__create_account);
		name = (TextView) findViewById(R.id.name);
		password = (TextView) findViewById(R.id.password);
		image = (ImageView) findViewById(R.id.image);
	
		
		_rectangle_54_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_don_t_have_an_account__create_account.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), sign_up_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	