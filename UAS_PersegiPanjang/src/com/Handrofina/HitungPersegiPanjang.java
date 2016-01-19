package com.agus;

/**
 * Class HitungPersegiPanjan
 * @version 1.0 Oct 03, 2010
 * @author Agus Haryanto (agus.superwriter@gmail.com)
 * @website http://agusharyanto.net
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungPersegiPanjang extends Activity {
	private EditText txtPanjang;
	private EditText txtLebar;
	private EditText txtLuas;
	private Button btnHitung;

	/**
	 * Method yang dipanggil pada saat applikaasi dijalankan
	 * */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		txtPanjang = (EditText) findViewById(R.id.txtPanjang);
		txtLebar = (EditText) findViewById(R.id.txtLebar);
		txtLuas = (EditText) findViewById(R.id.txtLuas);
		btnHitung = (Button) findViewById(R.id.btnHitung);

	}

	/**
	 * Method untuk Menghitung Luas Persegi panjang dipanggil pada saat button
	 * Hitung Luas diklik
	 * 
	 * @param view
	 */
	public void hitungLuas(View view) {
		try {

			int panjang = Integer.parseInt(txtPanjang.getText().toString());
			int lebar = Integer.parseInt(txtLebar.getText().toString());
			int luas = panjang * lebar;
			txtLuas.setText(String.valueOf(luas));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}