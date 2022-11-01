package com.uts.pab_2024240072;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNamaM, etNoPenM;
    private Button btnDaftarM;
    private Spinner spJalurM;
    private CheckBox cbKonfirM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNamaM = findViewById(R.id.et_namaM);
        spJalurM = findViewById(R.id.sp_jalurM);
        etNoPenM = findViewById(R.id.et_nomorM);
        btnDaftarM = findViewById(R.id.btn_daftarM);
        cbKonfirM = findViewById(R.id.cb_konfirmasiM);

        btnDaftarM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaL, noPen, jalur;

                namaL = etNamaM.getText().toString();
                noPen = etNoPenM.getText().toString();
                jalur = spJalurM.getSelectedItem().toString();

                if(namaL.trim().equals("")){
                    etNamaM.setError("Masukkan nama!");
                }

                else if(noPen.trim().equals("")){
                    etNoPenM.setError("Masukkan nomor pendaftaran!");
                }

                else if(jalur.trim().equals("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Pilih jalur terlebih!!", Toast.LENGTH_SHORT).show();
                }
                else if(cbKonfirM.isChecked() == false){
                    Toast.makeText(MainActivity.this, "Konfirmasi di Butuhkan!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent change = new Intent(MainActivity.this, MainActivity2.class);
                    change.putExtra("xNama", namaL);
                    change.putExtra("xNomor", noPen);
                    change.putExtra("xJalur", jalur);
                    startActivity(change);

                }
            }
        });
    }
}