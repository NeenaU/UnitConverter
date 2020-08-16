package com.example.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static final String EXTRA_NUMBER = "com.example.application.example.EXTRA_NUMBER";

    //Declaring widgets
    Spinner categorySpinner, optionSpinner1, optionSpinner2;
    ArrayAdapter<CharSequence> optionAdapter1, optionAdapter2;
    private Button button;
    EditText initialNumber;
    TextView resultTextView;

    //Hashmaps linking each unit in a category to a number
    Map<String, Integer> lengthMap = new HashMap<String, Integer>() {{
        put("Kilometre",0);
        put("Metre",1);
        put("Centimetre",2);
        put("Millimetre",3);
        put("Mile",4);
        put("Yard",5);
        put("Foot",6);
        put("Inch",7);
    }};

    Map<String, Integer> massMap = new HashMap<String, Integer>() {{
        put("Tonne",0);
        put("Kilogram",1);
        put("Gram",2);
        put("Stone",3);
        put("Pound",4);
        put("Ounce",5);
    }};

    Map<String, Integer> volumeMap = new HashMap<String, Integer>() {{
        put("Litre",0);
        put("Millilitre",1);
        put("Gallon",2);
        put("Quart",3);
        put("Pint",4);
        put("Cup",5);
        put("Fluid Ounce",6);
        put("Tablespoon",7);
        put("Teaspoon",7);
    }};

    Map<String, Integer> timeMap = new HashMap<String, Integer>() {{
        put("Second",0);
        put("Minute",1);
        put("Hour",2);
        put("Day",3);
        put("Week",4);
        put("Month",5);
        put("Year",6);
    }};

    Map<String, Integer> tempMap = new HashMap<String, Integer>() {{
        put("Celsius",0);
        put("Fahrenheit",1);
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categorySpinner = (Spinner) findViewById(R.id.categorySpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categories, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categorySpinner.setAdapter(adapter);
        categorySpinner.setOnItemSelectedListener(this);

        optionSpinner1 = (Spinner) findViewById(R.id.optionSpinner1);
        optionSpinner2 = (Spinner) findViewById(R.id.optionSpinner2);

        button = (Button) findViewById(R.id.convertButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if (position == 0) {
            optionAdapter1 = ArrayAdapter.createFromResource(this, R.array.length, android.R.layout.simple_spinner_item);;
            optionAdapter2 = ArrayAdapter.createFromResource(this, R.array.length, android.R.layout.simple_spinner_item);;
        }

        else if (position == 1) {
            optionAdapter1 = ArrayAdapter.createFromResource(this, R.array.mass, android.R.layout.simple_spinner_item);;
            optionAdapter2 = ArrayAdapter.createFromResource(this, R.array.mass, android.R.layout.simple_spinner_item);;
        }

        else if (position == 2) {
            optionAdapter1 = ArrayAdapter.createFromResource(this, R.array.volume, android.R.layout.simple_spinner_item);;
            optionAdapter2 = ArrayAdapter.createFromResource(this, R.array.volume, android.R.layout.simple_spinner_item);;
        }

        else if (position == 3) {
            optionAdapter1 = ArrayAdapter.createFromResource(this, R.array.time, android.R.layout.simple_spinner_item);;
            optionAdapter2 = ArrayAdapter.createFromResource(this, R.array.time, android.R.layout.simple_spinner_item);;
        }

        else if (position == 4) {
            optionAdapter1 = ArrayAdapter.createFromResource(this, R.array.temperature, android.R.layout.simple_spinner_item);;
            optionAdapter2 = ArrayAdapter.createFromResource(this, R.array.temperature, android.R.layout.simple_spinner_item);;
        }

        optionSpinner1.setAdapter(optionAdapter1);
        optionSpinner2.setAdapter(optionAdapter2);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

    private void convert() {
        initialNumber = findViewById(R.id.initialNumber);
        double number = Double.parseDouble(initialNumber.getText().toString());

        double result = 0;

        //Display the result
        resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText("" + result);

    }
}
