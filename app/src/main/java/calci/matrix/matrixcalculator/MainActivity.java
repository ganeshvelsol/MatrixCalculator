package calci.matrix.matrixcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import calci.matrix.matrixcalculator.addition.AdditionExample;
import calci.matrix.matrixcalculator.determenent.DeterminentMatrix;
import calci.matrix.matrixcalculator.subtraction.SubtractionExample;

public class MainActivity extends AppCompatActivity {

    TextView Addition_matrix_txt,subtraction_matrix_txt,multipication_matrix_txt,
            transepose_matrix_txt,determinent_matrix_txt,diagonal_matrix_txt,
            upper_triangular_matrix_txt,lower_triangular_matrix_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeParams();
    }
    public void initializeParams()
    {
        Addition_matrix_txt=(TextView)findViewById(R.id.Addition_matrix_txt);
        subtraction_matrix_txt=(TextView)findViewById(R.id.subtraction_matrix_txt);
        multipication_matrix_txt=(TextView)findViewById(R.id.multipication_matrix_txt);
        transepose_matrix_txt=(TextView)findViewById(R.id.transepose_matrix_txt);
        determinent_matrix_txt=(TextView)findViewById(R.id.determinent_matrix_txt);
        diagonal_matrix_txt=(TextView)findViewById(R.id.diagonal_matrix_txt);
        upper_triangular_matrix_txt=(TextView)findViewById(R.id.upper_triangular_matrix_txt);
        lower_triangular_matrix_txt=(TextView)findViewById(R.id.lower_triangular_matrix_txt);


        Addition_matrix_txt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this,AdditionExample.class));
            }
        });

        subtraction_matrix_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this,SubtractionExample.class));
            }
        });
        diagonal_matrix_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this,DiagonalMatrix.class));
            }
        });

        determinent_matrix_txt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this,DeterminentMatrix.class));
            }
        });
    }

}
