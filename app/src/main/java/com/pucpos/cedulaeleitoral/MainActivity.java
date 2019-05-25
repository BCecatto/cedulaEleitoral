package com.pucpos.cedulaeleitoral;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int candidateOneVotes = 0;
    private int candidateTwoVotes = 0;
    private int candidateThreeVotes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void vote(View view) {
        RadioButton radioButton1 = findViewById(R.id.candidato1);
        RadioButton radioButton2 = findViewById(R.id.candidato2);
        RadioButton radioButton3 = findViewById(R.id.candidato3);

        if (radioButton1.isChecked()) {
            candidateOneVotes += 1;

            Toast toast = Toast.makeText(this, "Você votou no candidato 1",Toast.LENGTH_LONG);
            toast.show();
        } else {
            if (radioButton2.isChecked()) {
                candidateTwoVotes += 1;

                Toast toast = Toast.makeText(this, "Você votou no candidato 2",Toast.LENGTH_LONG);
                toast.show();
            } else {
                if (radioButton3.isChecked()) {
                    candidateThreeVotes += 1;

                    Toast toast = Toast.makeText(this, "Você votou no candidato 3",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        }
        setTextViewValues(candidateOneVotes, candidateTwoVotes, candidateThreeVotes);
    }
    public void changePicture(View view) {
        RadioButton radioButton1 = findViewById(R.id.candidato1);
        RadioButton radioButton2 = findViewById(R.id.candidato2);
        RadioButton radioButton3 = findViewById(R.id.candidato3);
        ImageView imgView  = findViewById(R.id.imgCandidate);
        if (radioButton1.isChecked()) {
            imgView.setImageResource(R.drawable.ichigo);
        } else {
            if (radioButton2.isChecked()) {
                imgView.setImageResource(R.drawable.rukia);
            } else {
                if (radioButton3.isChecked()) {
                    imgView.setImageResource(R.drawable.zaraki);
                }
            }
        }

    }

    private void setTextViewValues(Integer candidateOne, Integer candidateTwo, Integer candidateThree) {
        TextView txtViewCandidate1 = findViewById(R.id.txtViewCandidate1);
        TextView txtViewCandidate2 = findViewById(R.id.txtViewCandidate2);
        TextView txtViewCandidate3 = findViewById(R.id.txtViewCandidate3);

        txtViewCandidate1.setText(candidateOne.toString());
        txtViewCandidate2.setText(candidateTwo.toString());
        txtViewCandidate3.setText(candidateThree.toString());
    }
}