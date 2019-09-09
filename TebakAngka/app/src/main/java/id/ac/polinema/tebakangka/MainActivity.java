package id.ac.polinema.tebakangka;

import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //  TODO: deklarasikan variabel di sini
    private int angka;
    private EditText angkaInput;
    private Button btn;
    private int angkaTebakan;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: bind layout di sini
        initRandomNumber();
    }

    // TODO: generate angka random di sini
    private void initRandomNumber() {
        angka = random.nextInt(10) + 1;
    }

    public void handleGuess(View view) {
        // TODO: Tambahkan logika untuk melakukan pengecekan angka
        angkaInput = findViewById(R.id.number_input);
        angkaTebakan = Integer.parseInt(String.valueOf(angkaInput.getText()));
        if (angkaTebakan == angka) {
            Toast.makeText(this, "Tebakan anda benar !!!", Toast.LENGTH_SHORT).show();
            btn = findViewById(R.id.guess_button);
            btn.setEnabled(false);
        } else if (angkaTebakan > angka) {
            Toast.makeText(this, "Tebakan anda terlalu besar !!!", Toast.LENGTH_SHORT).show();
        } else if (angkaTebakan < angka) {
            Toast.makeText(this, "Tebakan anda terlalu kecil !!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void handleReset(View view) {
        // TODO: Reset tampilan
        setContentView(R.layout.activity_main);
    }
}
