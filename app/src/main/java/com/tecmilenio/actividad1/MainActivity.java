package com.tecmilenio.actividad1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button holaButton;
    private TextView mundoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        holaButton = findViewById(R.id.buttonHola);
        mundoText = findViewById(R.id.textMundo);
    }

    public void onClickButton(View view) {
        holaButton.setText("Hola");
        mundoText.setText("Mundo!");
    }
}
