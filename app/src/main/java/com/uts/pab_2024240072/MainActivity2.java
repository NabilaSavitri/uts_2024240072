package com.uts.pab_2024240072;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tvNamaSecond, tvNoPenSecond, tvJalurSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNamaSecond = findViewById(R.id.tv_namaSecond);
        tvNoPenSecond = findViewById(R.id.tv_nopenSecond);
        tvJalurSecond = findViewById(R.id.tv_jalurSecond);

        Intent terima = getIntent();
        tvNamaSecond.setText(terima.getStringExtra("xNama"));
        tvNoPenSecond.setText(terima.getStringExtra("xNomor"));
        tvJalurSecond.setText(terima.getStringExtra("xJalur"));
    }
}