package encostai.encostai.com.br.encostaai.activity.bestsPlaces;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import encostai.encostai.com.br.encostaai.R;

public class BestsSpotsActivity extends AppCompatActivity implements IBestsSpotsView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melhores_locais);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
