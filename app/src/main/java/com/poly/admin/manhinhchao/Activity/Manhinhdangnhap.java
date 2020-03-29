package com.poly.admin.manhinhchao.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.poly.admin.manhinhchao.R;

public class Manhinhdangnhap extends AppCompatActivity {

    EditText edtUser,edtPass,edttk,edtmk;
    Button btndangki,btndangnhap,btnthoat,btndongy,btnhuy;
    String ten,mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinhdangnhap);
        Anhxa();
        ControlButton();
    }

    private void ControlButton(){
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Manhinhdangnhap.this,android.R.style.Theme_DeviceDefault_Dialog);
                builder.setTitle("Bạn có muốn thoát không ?");
                builder.setMessage("Hãy lựa chọn bên dưới để xác nhận");
                builder.setIcon(android.R.drawable.ic_dialog_alert);

                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        onBackPressed();
                    }
                });
                    builder.setPositiveButton("Không", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int i) {

                        }
                    });
                builder.show();
            }
        });

        btndangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog  = new Dialog(Manhinhdangnhap.this);
                dialog.setTitle("Hộp thoại xử lý");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.activity_dangki);
                final EditText edttk = dialog.findViewById(R.id.edttk);
                final EditText edtmk = dialog.findViewById(R.id.edtmk);
                Button btndongy = dialog.findViewById(R.id.btndongy);
                Button btnhuy = dialog.findViewById(R.id.btnhuy);
                btndongy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                         ten = edttk.getText().toString().trim();
                         mk = edtmk.getText().toString().trim();

                         edtUser.setText(ten);
                         edtPass.setText(mk);

                         dialog.cancel();
                    }
                });
                btnhuy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtUser.getText().length() !=0 && edtPass.getText().length() !=0){
                    if (edtUser.getText().toString().equals(ten) && edtPass.getText().toString().equals(mk)) {
                        Toast.makeText(Manhinhdangnhap.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Manhinhdangnhap.this,MainActivity.class);
                        startActivity(intent);
                    }else  if (edtUser.getText().toString().equals("1") && edtPass.getText().toString().equals("1")){
                        Toast.makeText(Manhinhdangnhap.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Manhinhdangnhap.this,MainActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(Manhinhdangnhap.this,"Bạn đã đăng nhập thất bại",Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(Manhinhdangnhap.this,"Mời bạn nhập đủ thông tin",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @SuppressLint("WrongViewCast")
    private void Anhxa(){
        edtUser = findViewById(R.id.edtUser) ;
        edtPass = findViewById(R.id.edtPass);
        btndangnhap = findViewById(R.id.btndangnhap);
        btndangki = findViewById(R.id.btndangki);
        btnthoat = findViewById(R.id.btnthoat);

    }
}
