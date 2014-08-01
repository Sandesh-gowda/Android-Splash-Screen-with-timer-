package ashok.mypractise1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class Splash extends Activity {

	 CountDownTimer StartJapa_Timer;
	 TextView count;
	 long millisUntilFinished;
	 long counter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		count=(TextView)findViewById(R.id.textView2);
		
		StartJapa_Timer = new CountDownTimer(5000, 1000) {
	        @Override
	        public void onFinish() {
	        	   startActivity(new Intent(getApplicationContext(),MainActivity.class));
	        	   finish(); 
	        	    
	        	    
	        }
	        @Override
	        public void onTick(long millisUntilFinished) {
	        
	        	count.setText("Application Starts in :"+ (millisUntilFinished/1000));
	        
	        }
	    };
	    StartJapa_Timer.start();
	}
}