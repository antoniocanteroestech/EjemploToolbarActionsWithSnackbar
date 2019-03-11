package softepec.es.ejemplotoolbar;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Ejemplo Toolbar y Snackbar");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.backup:
                Snackbar.make(this.findViewById(R.id.ll),
                        "Backup clicked",
                        Snackbar.LENGTH_SHORT)
                        .show();
                break;
            case R.id.attach:
                Snackbar.make(this.findViewById(R.id.ll),
                        "Attach clicked",
                        Snackbar.LENGTH_SHORT)
                        .setAction("Attach", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this,
                                        "Attach action clicked",
                                        Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                        .show();
                break;
            case R.id.add:
                Snackbar.make(this.findViewById(R.id.ll),
                        "Add clicked",
                        Snackbar.LENGTH_SHORT)
                        .setActionTextColor(getResources().getColor(R.color.yellow))
                        .setAction("Attach", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this,
                                        "Add action clicked",
                                        Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                        .show();
                break;
            case R.id.check:
                Snackbar.make(this.findViewById(R.id.ll),
                        "Check clicked",
                        Snackbar.LENGTH_SHORT)
                        .show();
                break;
        }


        return true;
    }
}
