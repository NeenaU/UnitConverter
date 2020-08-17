package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static final String EXTRA_NUMBER = "com.example.application.example.EXTRA_NUMBER";

    //Declaring widgets
    Spinner categorySpinner, optionSpinner1, optionSpinner2;
    ArrayAdapter<CharSequence> optionAdapter1, optionAdapter2;
    private Button button;
    EditText initialNumber;
    TextView resultTextView;
    double number;

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
                initialNumber = findViewById(R.id.initialNumber);
                number = Double.parseDouble(initialNumber.getText().toString());
                getConversion(categorySpinner.getSelectedItem().toString(), optionSpinner1.getSelectedItem().toString(), optionSpinner2.getSelectedItem().toString(), number);
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

    private void getConversion(String category, String option1, String option2, double number) {
        double result = 0.0;

        UnitConverter converter = new UnitConverter();

        if (category.equals("Length")) {
            result = converter.convertLength(option1, option2, number);
        }
        else if (category.equals("Mass")) {
            result = converter.convertMass(option1, option2, number);
        }
        else if (category.equals("Volume")) {
            result = converter.convertVolume(option1, option2, number);
        }
        else if (category.equals("Time")) {
            result = converter.convertTime(option1, option2, number);
        }
        else if (category.equals("Temperature")) {
            result = converter.convertTemp(option1, option2, number);
        }

        resultTextView = findViewById(R.id.resultTextView);
        if (result % 1 == 0) {
            int intResult = (int) result;
            resultTextView.setText("" + intResult);
        }
        else {
            resultTextView.setText("" + result);
        }

    }
}
