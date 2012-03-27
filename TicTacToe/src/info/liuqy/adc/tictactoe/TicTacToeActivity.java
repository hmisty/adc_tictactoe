package info.liuqy.adc.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;

public class TicTacToeActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        GridView grid = (GridView) this.findViewById(R.id.gridview);
        grid.setAdapter(new ImageAdapter(this));
        grid.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                ImageView iv = (ImageView) v;
                iv.setImageResource(R.drawable.x);
            }
        });

    }
}