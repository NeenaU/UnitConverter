package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner categorySpinner, optionSpinner1, optionSpinner2;
    ArrayAdapter<CharSequence> optionAdapter1, optionAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categorySpinner = (Spinner)findViewById(R.id.categorySpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categories, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categorySpinner.setAdapter(adapter);
        categorySpinner.setOnItemSelectedListener(this);

        optionSpinner1 = (Spinner)findViewById(R.id.optionSpinner1);
        optionSpinner2 = (Spinner)findViewById(R.id.optionSpinner2);
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
}
