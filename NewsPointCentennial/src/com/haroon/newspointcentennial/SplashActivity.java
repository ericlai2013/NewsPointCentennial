package com.haroon.newspointcentennial;



import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class SplashActivity extends M_Activity{

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		startAnimating();
	}
	
	private void startAnimating(){
		TextView logo1 = (TextView) findViewById(R.id.TextViewTopTitle);
		Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
		logo1.startAnimation(fade1);
		
		TextView logo2 = (TextView) findViewById(R.id.TextViewBottomTitle01);
		Animation fade2 = AnimationUtils.loadAnimation(this, R.anim.fade_in2);
		logo2.startAnimation(fade2);
		
		fade2.setAnimationListener(new AnimationListener(){

			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				startActivity(new Intent(SplashActivity.this, MainActivity.class));				
			}

			@Override
			public void onAnimationRepeat(Animation arg0) {
				// TODO Auto-generated method stub				
			}

			@Override
			public void onAnimationStart(Animation arg0) {
				// TODO Auto-generated method stub				
			}
		});
		
		Animation spinin = AnimationUtils.loadAnimation(this, R.anim.custom_anim);
		LayoutAnimationController controller = new LayoutAnimationController(spinin);
		TableLayout table = (TableLayout) findViewById(R.id.TableLayout01);
		for(int i=0; i<table.getChildCount(); i++){
			TableRow row = (TableRow) table.getChildAt(i);
			row.setLayoutAnimation(controller);
		}
	}
}
