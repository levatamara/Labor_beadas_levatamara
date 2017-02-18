package hu.bme.aut.amorg.examples.viewlabor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewLaborActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_labor);

        PasswordEditText passwordEditText = (PasswordEditText) findViewById(R.id.registrationPET);
        passwordEditText.eyeImageView.setImageDrawable(passwordEditText.passwordImage);
    }

}
