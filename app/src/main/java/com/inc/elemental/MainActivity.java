package com.inc.elemental;

import static android.text.Html.fromHtml;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView)findViewById(R.id.textView3)).setText(fromHtml("Facotry<sup>TM</sup>",0));
    }
}