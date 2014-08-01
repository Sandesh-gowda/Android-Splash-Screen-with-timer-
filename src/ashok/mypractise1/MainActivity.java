package ashok.mypractise1;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	 int count = 0;
	 int total_count=108;
	 int a;
	 int japa_counter_total=0;
    Button Bjapa;
    TextView Tjapa, T_total_japa_count,Overallchants;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
		Tjapa=(TextView)findViewById(R.id.textView1);
		//text view for total japa counts like after 108 to display count number 1
		T_total_japa_count=(TextView)findViewById(R.id.textView3);
		Overallchants=(TextView)findViewById(R.id.textView4);
        Bjapa=(Button)findViewById(R.id.button1);
        Bjapa.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			 count++;
			 Tjapa.setText("Your Japa count is :"+count);
			 for(int i=0;i<1000;i++)
			 {
				int a;
				a=i*total_count;
				if(a==count)
				{
					japa_counter_total++;
					T_total_japa_count.setText(japa_counter_total+" "+ "rounds");
					Overallchants.setText(a+" :"+"Over All chat counts");
				}
			 }
		}
             			 
			
			
		});
    }
 }

       