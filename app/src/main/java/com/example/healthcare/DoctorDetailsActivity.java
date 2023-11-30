package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {

    private String[][] doctor_details1 = {
            {"Doctor Name : Dr. Anil Jain" , "Hospital : Lucky Hospital" , "Exp : 15 yrs" , "Mobile no. : 9876543210" , "300"},
            {"Doctor Name : Dr. Rishav Bansal" , "Hospital : Bansal Health Clinic" , "Exp : 10 yrs" , "Mobile no. : 9988776655" , "400"},
            {"Doctor Name : Dr. Sunny Singhal  " , "Hospital : Singhal Clinic" , "Exp : 9 yrs" , "Mobile no. : 9001122339" , "300"},
            {"Doctor Name : Dr. Umakant Gupta" , "Hospital : Narmada Hospital and Diagnostic Centre" , "Exp : 33 yrs" ,  "Mobile no. : 9445566778" , "600"},
            {"Doctor Name : Dr. Chandan Kedawat" , "Hospital : Manipal Hospitals" , "Exp : 30 yrs" ,  "Mobile no. : 9765841230" , "500"},

    };

    private String[][] doctor_details2 = {
            {"Doctor Name : Dt. Rajat Jain " , "Hospital : Health Wealth" , "Exp : 15 yrs" , "Mobile no. : 9876543210" , "600"},
            {"Doctor Name : Dr. Surbhi " , "Hospital : NutriSaga" , "Exp : 12 yrs" , "Mobile no. : 9988776655" , "900"},
            {"Doctor Name : Dr. Anamika" , "Hospital : Anamikas Diet Gallery" , "Exp : 10 yrs" , "Mobile no. : 9001122339" , "500"},
            {"Doctor Name : Dr. Medhavi" , "Hospital : NutriFit" , "Exp : 8 yrs" ,  "Mobile no. : 9445566778" , "300"},
            {"Doctor Name : Dr. sonal" , "Hospital : NutriDiet" , "Exp : 7 yrs" ,  "Mobile no. : 9765841230" , "700"},


    };

    private String[][] doctor_details3 = {
            {"Doctor Name : Dr.Shikha Bansal" , "Hospital : Cosmodent Dental Clinic" , "Exp : 15 yrs" , "Mobile no. : 9876543210" , "600"},
            {"Doctor Name : Dr. Garima Ruhela" , "Hospital : Goodwill Dental Clinic" , "Exp : 12 yrs" , "Mobile no. : 9988776655" , "900"},
            {"Doctor Name : Dr. Akansha " , "Hospital : Ekdantam Dental Clinic" , "Exp : 10 yrs" , "Mobile no. : 9001122339" , "600"},
            {"Doctor Name : Dr. Prateek Mathur" , "Hospital : Sharda Dental Hospital" , "Exp : 18 yrs" ,  "Mobile no. : 9445566778" , "300"},
            {"Doctor Name : Dr. Ramesh Bhargava" , "Hospital : Bhargava Dental Clinic" , "Exp : 55 yrs" ,  "Mobile no. : 9765841230" , "100"},


    };

    private String[][] doctor_details4 = {
            {"Doctor Name : Dr. Raj Kumar Gupta" , "Hospital : Santokba Durlabhji Memorial Hospital" , "Exp : 55 yrs" , "Mobile no. : 9876543210" , "600"},
            {"Doctor Name : Dr. Rajesh Sharma" , "Hospital : Fortis Hospital" , "Exp : 42 yrs" , "Mobile no. : 9988776655" , "900"},
            {"Doctor Name : Dr. Lalit Modi" , "Hospital : Rukmani Birla Hospital" , "Exp : 20 yrs" , "Mobile no. : 9001122339" , "500"},
            {"Doctor Name : Dr. Ratnesh Jenaw" , "Hospital : Apollo Spectra Hospital" , "Exp : 8 yrs" ,  "Mobile no. : 9445566778" , "300"},
            {"Doctor Name : Dr. Lalit Malik" , "Hospital : Manipal Hospital" , "Exp : 27 yrs" ,  "Mobile no. : 9765841230" , "700"},

    };

    private String[][] doctor_details5 = {
            {"Doctor Name : Dr. Raj" , "Hospital : Raj ENT Hospital" , "Exp : 15 yrs" , "Mobile no. : 9876543210" , "600"},
            {"Doctor Name : Dr. Lovelish Jain" , "Hospital : Adinath ENT Hospital" , "Exp : 12 yrs" , "Mobile no. : 9988776655" , "500"},
            {"Doctor Name : Dr. Deshbandhu Jain" , "Hospital : Deshbandhu Hospital" , "Exp : 20 yrs" , "Mobile no. : 9001122339" , "500"},
            {"Doctor Name : Dr. Apoorva Jain" , "Hospital : Deshbandhu Hospital" , "Exp : 8 yrs" ,  "Mobile no. : 9445566778" , "500"},
            {"Doctor Name : Dr. Shailesh Kumar Jain" , "Hospital : ManglamPlus Medicity Hospital" , "Exp : 8 yrs" ,  "Mobile no. : 9765841230" , "700"},
    };
    private String[][] doctor_details6 = {
            {"Doctor Name : Dr. Raj" , "Hospital : Raj ENT Hospital" , "Exp : 15 yrs" , "Mobile no. : 9876543210" , "600"},
            {"Doctor Name : Dr. Lovelish Jain" , "Hospital : Adinath ENT Hospital" , "Exp : 12 yrs" , "Mobile no. : 9988776655" , "500"},
            {"Doctor Name : Dr. Deshbandhu Jain" , "Hospital : Deshbandhu Hospital" , "Exp : 20 yrs" , "Mobile no. : 9001122339" , "500"},
            {"Doctor Name : Dr. Apoorva Jain" , "Hospital : Deshbandhu Hospital" , "Exp : 8 yrs" ,  "Mobile no. : 9445566778" , "500"},
            {"Doctor Name : Dr. Shailesh Kumar Jain" , "Hospital : ManglamPlus Medicity Hospital" , "Exp : 8 yrs" ,  "Mobile no. : 9765841230" , "700"},
    };
    private String[][] doctor_details7 = {
            {"Doctor Name : Dr. Raj" , "Hospital : Raj ENT Hospital" , "Exp : 15 yrs" , "Mobile no. : 9876543210" , "600"},
            {"Doctor Name : Dr. Lovelish Jain" , "Hospital : Adinath ENT Hospital" , "Exp : 12 yrs" , "Mobile no. : 9988776655" , "500"},
            {"Doctor Name : Dr. Deshbandhu Jain" , "Hospital : Deshbandhu Hospital" , "Exp : 20 yrs" , "Mobile no. : 9001122339" , "500"},
            {"Doctor Name : Dr. Apoorva Jain" , "Hospital : Deshbandhu Hospital" , "Exp : 8 yrs" ,  "Mobile no. : 9445566778" , "500"},
            {"Doctor Name : Dr. Shailesh Kumar Jain" , "Hospital : ManglamPlus Medicity Hospital" , "Exp : 8 yrs" ,  "Mobile no. : 9765841230" , "700"},
    };

    TextView tv;
    Button btn;
    String[][] doctor_details = {};
    ArrayList list;
    SimpleAdapter sa;
    HashMap<String , String> item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv = findViewById(R.id.doctorDetail_title);


        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

       // btn = findViewById(R.id.cardFD1);

        if(title.compareTo("Physician") == 0){
            doctor_details = doctor_details1;
        }
        else
        if(title.compareTo("Dietician") == 0)
            doctor_details = doctor_details2;
        else
        if(title.compareTo("Dentist") == 0)
            doctor_details = doctor_details3;
        else
        if(title.compareTo("Surgeon") == 0)
            doctor_details = doctor_details4;
        else
        if(title.compareTo("ENT Surgeon") == 0)
            doctor_details = doctor_details5;
        else
        if(title.compareTo("Orthopedic") == 0)
            doctor_details = doctor_details6;
        else
        if(title.compareTo("Cardiologist") == 0)
            doctor_details = doctor_details7;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailsActivity.this , FindDoctorActivity.class));
            }
        });

        list = new ArrayList();
        for(int i = 0 ; i< doctor_details.length ; i++){
        item = new HashMap<String, String>();
        item.put("line1" , doctor_details[i][0]);
        item.put("line2" , doctor_details[i][1]);
        item.put("line3" , doctor_details[i][2]);
        item.put("line4" , doctor_details[i][3]);
        item.put("line5" , "Cons Fees : " +doctor_details[i][4] + "/-");
        list.add(item);
        }

        sa =new SimpleAdapter(this , list, R.layout.multi_lines , new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a , R.id.line_b , R.id.line_c ,R.id.line_d ,R.id.line_e});

        ListView lst = findViewById(R.id.doctorDetails_listview);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(DoctorDetailsActivity.this , BookAppointmentActivity.class);
                it.putExtra("text1" , title);
                it.putExtra("text2" , doctor_details[i][0]);
                it.putExtra("text3" , doctor_details[i][1]);
                it.putExtra("text4" , doctor_details[i][3]);
                it.putExtra("text5" , doctor_details[i][4]);
                startActivity(it);
                startActivity(it);

            }
        });


    }

}