package br.senac.sp.l13.bottomnav;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.action_add:
                        Toast toast = Toast.makeText(MainActivity.this, "Clique para adicionar", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
                        toast.show();

                        break;
                    case R.id.action_edit:
                        Toast toast1 = Toast.makeText(MainActivity.this, "Clique para ediat", Toast.LENGTH_LONG);
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
                        toast1.show();

                        break;
                    case R.id.action_remove:
                        Toast toast2 = Toast.makeText(MainActivity.this, "Clique para remover", Toast.LENGTH_LONG);
                        toast2.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
                        toast2.show();

                        break;
                }

                return true;
            }
        });
    }
}
