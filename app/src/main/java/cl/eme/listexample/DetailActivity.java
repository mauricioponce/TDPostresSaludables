package cl.eme.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getExtras();
        String name = "";
        int id = -1;

        if(extras != null) {
            name = extras.getString("NAME");
            id = extras.getInt("ID");
        }

        Toast.makeText(this, "El nombre es " + name, Toast.LENGTH_LONG).show();
    }
}