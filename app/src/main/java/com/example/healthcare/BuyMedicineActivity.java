package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class BuyMedicineActivity extends AppCompatActivity {

    private String[][] packages ={
            {"Uprise-D3 1000IU Capsule" , "" , "" , "" , "50"},
            {"HealthVit Chromum Picolinate 200mg Capsule" , "" , "" , "" , "305"},
            {"Vitamin B Complex Capsule" , "" , "" , "" , "448"},
            {"In Life Vitamin E Wheat Germ Oil Capsule" , "" , "" , "" , "539"},
            {"Dolo 650 Capsule" , "" , "" , "" , "30"},
            {"Crocin 650 Advance Tablets" , "" , "" , "" , "50"},
            {"Strepsils medicated lozenges for sore throat" , "" , "" , "" , "40"},
            {"Tata 1mg Calcium + Vitamin D3" , "" , "" , "" , "30"},
            {"Feronia -XT Tablet" , "" , "" , "" , "130"},
    };

    private String[] package_details ={
            "Building and keeping the bones and teeth strong \n" +
                    "Reducing fatigue/stress and muscular pains\n" +
                    "Boosting immunity and increasing resistance against infection" ,
            "Chromium is an essential trace mineral that plays an important role in helping insulin regulation" ,
            "Provides relief from vitamin B deficiencies\n" +
                    "Helps in formation of RBCs\n" +
                    "Maintains healthy nervous system" ,
            "It promotes health as well as skin benefits\n" +
                    "It helps reduce skin blemish and pigmentation\n" +
                    "It acts as a safeguard for skin from the harsh UVA and UVB sun rays." ,
            "helps relieve pain and fever by blocking the release of certain chemical messaging bacterias." ,
            "Provides relief from vitamin B deficiencies\n" +
                    "Helps in formation of RBCs\n" +
                    "Maintains healthy nervous system" ,
            "Provides relief from vitamin B deficiencies\n" +
                    "Helps in formation of RBCs\n" +
                    "Maintains healthy nervous system" ,
            "Provides relief from vitamin B deficiencies\n" +
                    "Helps in formation of RBCs\n" +
                    "Maintains healthy nervous system" ,
            "Provides relief from vitamin B deficiencies\n" +
                    "Helps in formation of RBCs\n" +
                    "Maintains healthy nervous system"
    };


    HashMap<String , String> item ;
    ArrayList list ;
    SimpleAdapter sa;
    ListView lst;
    Button btnBack , btnGoToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_medicine);

        lst = findViewById(R.id.buyMedicine_listView);
        btnBack= findViewById(R.id.buyMedicine_backBtn);
        btnGoToCart = findViewById(R.id.buyMedicine_cartBtn);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BuyMedicineActivity.this , HomeActivity.class));
            }
        });

        btnGoToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BuyMedicineActivity.this , CartBuyMedicineActivity.class));
            }
        });

        list = new ArrayList();
        for(int i = 0 ; i<packages.length ; i++){
            item = new HashMap<String, String>();
            item.put("line1" , packages[i][0]);
            item.put("line2" , packages[i][1]);
            item.put("line3" , packages[i][2]);
            item.put("line4" , packages[i][3]);
            item.put("line5" , "Total cost :" + packages[i][4] +"/-");
            list.add(item);
        }

        sa = new SimpleAdapter(this , list ,
                R.layout.multi_lines,
                new String[]{"line1" , "line2" , "line3" , "line4" ,"line5"} ,
                new int[] {R.id.line_a , R.id.line_b , R.id.line_c , R.id.line_d , R.id.line_e });
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(BuyMedicineActivity.this , BuyMedicineDetailsActivity.class);
                it.putExtra("text1" , packages[i][0]);
                it.putExtra("text2" , package_details[i]);
                it.putExtra("text3" , packages[i][4]);
                startActivity(it);
            }
        });
    }
}