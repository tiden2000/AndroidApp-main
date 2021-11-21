package com.example.androidapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String notification_01 = getResources().getString(R.string.notification_01);
        String btnSubmitName = getResources().getString(R.string.btn_submit);

        Toast.makeText(this, "Please fill in the form", Toast.LENGTH_LONG).show();

        Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setText(btnSubmitName);
        btnSubmit.setOnClickListener(btnSubmit_Click);
    }
    private View.OnClickListener btnSubmit_Click = new View.OnClickListener() {
        public void onClick(View v) {
            Boolean isValid = true;

            TextView tvError = findViewById(R.id.tvError);
            TextView tvName = findViewById(R.id.tvName);
            TextView tvAddress = findViewById(R.id.tvAddress);
            TextView tvType = findViewById(R.id.tvType);
            TextView tvFurniture = findViewById(R.id.tvFurniture);
            TextView tvBedroom = findViewById(R.id.tvBedroom);
            TextView tvPrice = findViewById(R.id.tvPrice);
            TextView tvReporter = findViewById(R.id.tvReporter);
            TextView tvNote = findViewById(R.id.tvNote);
            TextView tvDate = findViewById(R.id.tvDate);

            String error = "";
            // Get content of textview "Username".
            String name = tvName.getText().toString();
            String address = tvAddress.getText().toString();
            String type = tvType.getText().toString();
            String furniture = tvFurniture.getText().toString();
            String bedroom = tvBedroom.getText().toString();
            String price = tvPrice.getText().toString();
            String reporter = tvReporter.getText().toString();
            String note = tvNote.getText().toString();
            String date = tvDate.getText().toString();
            // Get content of textview "Password".
            String notification_02 = getResources().getString(R.string.notification_02);
            // Like "alert" in JavaScript.
            Toast.makeText(v.getContext(), notification_02, Toast.LENGTH_LONG).show();

            // Check whether username is empty or not.
            if (TextUtils.isEmpty(name)) {
                isValid = false;
                error += "* Property name cannot be blank.\n";
            }

            // Check whether password is empty or not.
            if (TextUtils.isEmpty(address)) {
                isValid = false;
                error += "* Address cannot be blank.\n";
            }

            if (TextUtils.isEmpty(type)) {
                isValid = false;
                error += "* Type cannot be blank.\n";
            }

            if (TextUtils.isEmpty(price)) {
                isValid = false;
                error += "* Price cannot be blank.\n";
            }

            if (TextUtils.isEmpty(bedroom)) {
                isValid = false;
                error += "* Bedroom cannot be blank.\n";
            }

            if (TextUtils.isEmpty(reporter)) {
                isValid = false;
                error += "* Reporter cannot be blank.\n";
            }

            // Check whether form is valid or not.
            if (isValid) {
                // Show alerts.
                Toast.makeText(v.getContext(), name, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), address, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), type, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), furniture, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), bedroom, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), price, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), reporter, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), note, Toast.LENGTH_LONG).show();
                Toast.makeText(v.getContext(), date, Toast.LENGTH_LONG).show();



                // Show logs.
                Log.w("Main Activity", "This is a Warning Log.");
                Log.i("Main Activity", "This is an Information Log.");
                Log.d("Main Activity", "This is a Debug Log.");
                Log.v("Main Activity", "This is a Verbose Log.");

                Bundle propertyInfo = new Bundle();
                propertyInfo.putString("name", name);
                propertyInfo.putString("address", address);
                propertyInfo.putString("type", type);
                propertyInfo.putString("furniture", furniture);
                propertyInfo.putString("bedroom", bedroom);
                propertyInfo.putString("price", price);
                propertyInfo.putString("reporter", reporter);
                propertyInfo.putString("note", note);
                propertyInfo.putString("date", date);


                // Create a new activity and start it.
                Intent testActivity = new Intent(v.getContext(), TestActivity.class);

                // 1st method to transfer data.
                testActivity.putExtras(propertyInfo);

                // 2nd method to transfer data.
                //testActivity.putExtra("username", username);
                //testActivity.putExtra("password", password);

                // Start "TestActivity".
                startActivity(testActivity);

                // Terminate current activity.
                finish();
            } else {
                // Display errors in textview.
                tvError.setText(error);

                // Display errors in logs.
                Log.e("Main Activity", error);
            }
        }
    };
}