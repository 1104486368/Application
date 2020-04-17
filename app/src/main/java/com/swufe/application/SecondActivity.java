package com.swufe.application;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        score = findViewById(R.id.score);
    }

    public void btnAdd1 (View btn){
        showScore(1);
    }
    public void btnAdd2 (View btn){
        showScore(2);
    }
    public void btnAdd3 (View btn){
        showScore(3);
    }
    public void btnReset (View btn){
        score.setText("0");
    }

    private void showScore(int inc){
        Log.i("show","inc="+inc);
        String oldScore = (String) score.getText();
        int newScore = Integer.parseInt(oldScore) + inc;
        score.setText(""+newScore);
        //当前转换结果加增量
    }

}
