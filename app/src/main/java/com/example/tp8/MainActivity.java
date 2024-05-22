package com.example.tp8;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String modls[] = {"Algorithmique", "Programmation", "Réseaux", "Base de données"};
    ListView listv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listv = findViewById(R.id.listv);
        ArrayAdapter<String> lvadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, modls);
        listv.setAdapter(lvadapter);

        // Écouteur pour lancer l'activité Personalislv
        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, Personalislv.class);
                startActivity(intent);
            }
        });
    }
}
