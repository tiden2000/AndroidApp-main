package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        TextView tvName = findViewById(R.id.tvName_Test);
        TextView tvAddress = findViewById(R.id.tvAddress_Test);
        TextView tvType = findViewById(R.id.tvType_Test);
        TextView tvFurniture = findViewById(R.id.tvFurniture_Test);
        TextView tvBedroom = findViewById(R.id.tvBedroom_Test);
        TextView tvPrice = findViewById(R.id.tvPrice_Test);
        TextView tvReporter = findViewById(R.id.tvReporter_Test);
        TextView tvNote = findViewById(R.id.tvNote_Test);
        TextView tvDate = findViewById(R.id.tvDate_Test);

        String name = "";
        String address = "";
        String type = "";
        String furniture = "";
        String bedroom = "";
        String price ="";
        String reporter = "";
        String note = "";
        String date = "";


        Intent intent = getIntent();

        // 1st method to receive data.
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            name = bundle.getString("name");
            address = bundle.getString("address");
            type = bundle.getString("type");
            furniture = bundle.getString("furniture");
            bedroom = bundle.getString("bedroom");
            price = bundle.getString("price");
            reporter = bundle.getString("reporter");
            note = bundle.getString("note");
            date = bundle.getString("date");

        }

        // 2nd method to receive data.
        //username = intent.getStringExtra("username");
        //password = intent.getStringExtra("password");
        /*propertyname = intent.getStringExtra("propertyname");
        propertyaddress = intent.getStringExtra("propertyaddress");
        propertycity = intent.getStringExtra("propertycity");
        propertydistrict = intent.getStringExtra("propertydistrict");
        propertyward = intent.getStringExtra("propertyward");
        propertytype = intent.getStringExtra("propertytype");
        propertyfurniture = intent.getStringExtra("propertyfurniture");
        propertybedroom = intent.getStringExtra("propertybedroom");
        propertyprice = intent.getStringExtra("propertyprice");
        propertyreporter = intent.getStringExtra("propertyreporter");
        propertynote = intent.getStringExtra("propertynote");
        propertydate = intent.getStringExtra("propertydate");*/

        //tvUsername.setText(username);
        //tvPassword.setText(password);
        tvName.setText(name);
        tvAddress.setText(address);
        tvType.setText(type);
        tvFurniture.setText(furniture);
        tvBedroom.setText(bedroom);
        tvPrice.setText(price);
        tvReporter.setText(reporter);
        tvNote.setText(note);
        tvDate.setText(date);

    }
}