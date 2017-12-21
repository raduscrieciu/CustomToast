package com.screechstuidos.customtoast;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonTop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastWithImage("This is a top Toast!", Gravity.TOP, 0, 0, MainActivity.this);
            }
        });

        findViewById(R.id.buttonCenter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastWithImage("This is a center Toast!", Gravity.CENTER, 0, 0, MainActivity.this);
            }
        });

        findViewById(R.id.buttonBottom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastWithImage("This is a bottom Toast!", Gravity.BOTTOM, 0, 0, MainActivity.this);
            }
        });
    }

    private void showToastWithImage(String message, int gravity,
                                    int xOffset, int yOffset, Activity activity) {

        View rootLayout = activity.getLayoutInflater().inflate(R.layout.view_toast, null);

        ((TextView) rootLayout.findViewById(R.id.toastTextView)).setText(message);

        Toast toast = new Toast(activity);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(rootLayout);
        toast.setGravity(gravity, xOffset, yOffset);
        toast.show();
    }
}
