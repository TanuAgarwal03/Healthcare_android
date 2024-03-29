package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BuyMedicineBookActivity extends AppCompatActivity {

    EditText edFullName , edAddress , edPinCode , edContact;
    Button btnBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_medicine_book);

        edFullName = findViewById(R.id.buyMedBook_fullname);
        edAddress = findViewById(R.id.buyMedBook_address);
        edPinCode = findViewById(R.id.buyMedBook_pincode);
        edContact = findViewById(R.id.buyMedBook_contact);

        btnBook = findViewById(R.id.buyMedBook_btnBook);

        Intent intent = getIntent();
        String[] price = intent.getStringExtra("price").toString().split(java.util.regex.Pattern.quote(":"));
        String date = intent.getStringExtra("date");

        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs" , Context.MODE_PRIVATE);
                String username = sharedPreferences.getString("username" , "").toString();

                Database db = new Database(getApplicationContext() , "healthcare" , null , 1);
                db.addOrder(username,edFullName.getText().toString(), edAddress.getText().toString() , edContact.getText().toString() , Integer.parseInt(edPinCode.getText().toString()) ,
                        date.toString() , "", Float.parseFloat(price[1].toString()) , "lab");
                db.removeCart(username , "medicine");
                Toast.makeText(getApplicationContext() , "Your booking is done successfully ", Toast.LENGTH_LONG).show();
                startActivity(new Intent(BuyMedicineBookActivity.this , HomeActivity.class));

            }
        });

    }
}