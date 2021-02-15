package gleb.first_app.mythreeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imgFood)
    }
    public void OnClickBtn(View view){
        count++;
        if(count > 4)
            count=1;
        switch(count){
            case 1:
                img.setImageResource(R.drawable.food_1);
                break;
            case 2:
                img.setImageResource(R.drawable.food_2);
                break;
            case 3:
                img.setImageResource(R.drawable.food_1);
                break;
            case 4:
                img.setImageResource(R.drawable.food_1);
                break;
        }


    }
}