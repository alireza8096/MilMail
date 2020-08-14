package com.example.milmail;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SendEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);
    }





    public void sendClick(View view) {
        EditText senderEmailPlain = findViewById(R.id.senderEmailAddress);
        EditText emailSubjectPlain = findViewById(R.id.emailSubject);
        EditText emailTextPlain = findViewById(R.id.emailText);
        String senderEmail = senderEmailPlain.getText().toString();
        String emailSubject = emailSubjectPlain.getText().toString();
        String emailText = emailTextPlain.getText().toString();
        if (emailSubject.isEmpty()) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("ERROR");
            alertDialog.setMessage("Subject is empty :)");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        }
    }
}