package com.haroon.newspointcentennial;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.view.View.OnClickListener;
import android.widget.Spinner;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;



public class MainActivity extends M_Activity implements OnItemSelectedListener{ 

	private Spinner spinner1;
	private Spinner spinner2;
	private Spinner spinner3;
	private Spinner spinner4;
	private Spinner spinner5;
	private Spinner spinner6;
	private Spinner spinner7;
	private Spinner spinner8;
	private Spinner spinner9;
	private Spinner spinner10;
	private Spinner spinner11;
	private Spinner spinner12;
	private Spinner spinner13;
	private Spinner spinner14;
	private Spinner spinner15;
	private Spinner spinner16;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ImageButton img = (ImageButton)findViewById(R.id.imageButton13);
		ImageButton img1 = (ImageButton)findViewById(R.id.imageButton1);
		ImageButton img2 = (ImageButton)findViewById(R.id.imageButton2);
		ImageButton img3 = (ImageButton)findViewById(R.id.imageButton3);
		ImageButton img14 = (ImageButton)findViewById(R.id.imageButton14);
		ImageButton img4 = (ImageButton)findViewById(R.id.imageButton4);
		ImageButton img5 = (ImageButton)findViewById(R.id.imageButton5);
		ImageButton img6 = (ImageButton)findViewById(R.id.imageButton6);
		ImageButton img15 = (ImageButton)findViewById(R.id.imageButton15);
		ImageButton img7 = (ImageButton)findViewById(R.id.imageButton7);
		ImageButton img8 = (ImageButton)findViewById(R.id.imageButton8);
		ImageButton img9 = (ImageButton)findViewById(R.id.imageButton9);
		ImageButton img16 = (ImageButton)findViewById(R.id.imageButton16);
		ImageButton img10 = (ImageButton)findViewById(R.id.imageButton10);
		ImageButton img11 = (ImageButton)findViewById(R.id.imageButton11);
		ImageButton img12 = (ImageButton)findViewById(R.id.imageButton12);


		img.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://www.nytimes.com"));
				startActivity(intent);
			}
		});

		img1.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://www.bbc.com"));
				startActivity(intent);
			}
		});

		img2.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://cnews.canoe.ca"));
				startActivity(intent);
			}
		});

		img3.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://www.cbc.ca/news/"));
				startActivity(intent);
			}
		});

		img14.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://www.huffingtonpost.ca"));
				startActivity(intent);
			}
		});

		img4.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://www.cnn.com"));
				startActivity(intent);
			}
		});

		img5.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://www.cp24.com"));
				startActivity(intent);
			}
		});

		img6.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://www.ctvnews.ca"));
				startActivity(intent);
			}
		});

		img15.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://www.thestar.com/news.html"));
				startActivity(intent);
			}
		});

		img7.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://www.dailymail.co.uk/news/index.html"));
				startActivity(intent);
			}
		});

		img8.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://www.foxnews.com"));
				startActivity(intent);
			}
		});

		img9.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://www.theglobeandmail.com/news/"));
				startActivity(intent);
			}
		});

		img16.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://www.usatoday.com"));
				startActivity(intent);
			}
		});

		img10.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("https://news.google.ca"));
				startActivity(intent);
			}
		});

		img11.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://www.nationalpost.com/index.html"));
				startActivity(intent);
			}
		});

		img12.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("http://www.nbcnews.com"));
				startActivity(intent);
			}
		});

		addListenerOnSpinnerItemSelection_NYT();
	}

	private void addListenerOnSpinnerItemSelection_NYT(){
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(this);
		
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		spinner2.setOnItemSelectedListener(this);
		
		spinner3 = (Spinner) findViewById(R.id.spinner3);
		spinner3.setOnItemSelectedListener(this);
		
		spinner4 = (Spinner) findViewById(R.id.spinner4);
		spinner4.setOnItemSelectedListener(this);
		
		spinner5 = (Spinner) findViewById(R.id.spinner5);
		spinner5.setOnItemSelectedListener(this);
		
		spinner6 = (Spinner) findViewById(R.id.spinner6);
		spinner6.setOnItemSelectedListener(this);
		
		spinner7 = (Spinner) findViewById(R.id.spinner7);
		spinner7.setOnItemSelectedListener(this);
		
		spinner8 = (Spinner) findViewById(R.id.spinner8);
		spinner8.setOnItemSelectedListener(this);
		
		spinner9 = (Spinner) findViewById(R.id.spinner9);
		spinner9.setOnItemSelectedListener(this);
		
		spinner10 = (Spinner) findViewById(R.id.spinner10);
		spinner10.setOnItemSelectedListener(this);
		
		spinner11 = (Spinner) findViewById(R.id.spinner11);
		spinner11.setOnItemSelectedListener(this);
		
		spinner12 = (Spinner) findViewById(R.id.spinner12);
		spinner12.setOnItemSelectedListener(this);
		
		spinner13 = (Spinner) findViewById(R.id.spinner13);
		spinner13.setOnItemSelectedListener(this);
		
		spinner14 = (Spinner) findViewById(R.id.spinner14);
		spinner14.setOnItemSelectedListener(this);
		
		spinner15 = (Spinner) findViewById(R.id.spinner15);
		spinner15.setOnItemSelectedListener(this);
		
		spinner16 = (Spinner) findViewById(R.id.spinner16);
		spinner16.setOnItemSelectedListener(this);
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
		// TODO Auto-generated method stub
			/*	Toast.makeText(parent.getContext(), 
					"OnItemSelectedListener : " + parent.getItemAtPosition(pos) + "\nparent.getId() : " + parent.getId(), 
					Toast.LENGTH_SHORT).show();*/
		
		if (parent.getId() == R.id.spinner1 && parent.getItemAtPosition(pos).equals("News") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.nytimes.com/?adxnnl=1&adxnnlx=1373171248-wHx1wZfb+ITTzoe1kJ1/MA"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner1 && parent.getItemAtPosition(pos).equals("Sports")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.nytimes.com/pages/sports/index.html"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner1 && parent.getItemAtPosition(pos).equals("World")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.nytimes.com/pages/world/index.html"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner2 && parent.getItemAtPosition(pos).equals("News") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.bbc.com/news/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner2 && parent.getItemAtPosition(pos).equals("Sports")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.bbc.co.uk/sport/0/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner2 && parent.getItemAtPosition(pos).equals("Travel")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.bbc.com/travel"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner3 && parent.getItemAtPosition(pos).equals("News") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://cnews.canoe.ca/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner3 && parent.getItemAtPosition(pos).equals("Autos")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.autonet.ca/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner3 && parent.getItemAtPosition(pos).equals("Health")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://chealth.canoe.ca/"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner4 && parent.getItemAtPosition(pos).equals("News") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.cbc.ca/news/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner4 && parent.getItemAtPosition(pos).equals("Politics")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.cbc.ca/news/politics/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner4 && parent.getItemAtPosition(pos).equals("Business")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.cbc.ca/news/business/"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner5 && parent.getItemAtPosition(pos).equals("Business") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.huffingtonpost.ca/business/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner5 && parent.getItemAtPosition(pos).equals("World")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.huffingtonpost.com/world/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner5 && parent.getItemAtPosition(pos).equals("Living")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.huffingtonpost.ca/living/"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner6 && parent.getItemAtPosition(pos).equals("Justice") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.cnn.com/JUSTICE/?hpt=sitenav"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner6 && parent.getItemAtPosition(pos).equals("Tech")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.cnn.com/TECH/?hpt=sitenav"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner6 && parent.getItemAtPosition(pos).equals("Travel")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.cnn.com/TRAVEL/?hpt=sitenav"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner7 && parent.getItemAtPosition(pos).equals("News") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.cp24.com/news"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner7 && parent.getItemAtPosition(pos).equals("Weather")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.cp24.com/weather/toronto-weather"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner7 && parent.getItemAtPosition(pos).equals("Travel")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.cp24.com/traffic/travel-times"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner8 && parent.getItemAtPosition(pos).equals("News") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.ctvnews.ca/canada"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner8 && parent.getItemAtPosition(pos).equals("Lifestyle")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.ctvnews.ca/video?binId=1.811496"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner8 && parent.getItemAtPosition(pos).equals("Entertainment")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.ctvnews.ca/entertainment"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner9 && parent.getItemAtPosition(pos).equals("Life") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.thestar.com/life.html"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner9 && parent.getItemAtPosition(pos).equals("Sports")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.thestar.com/sports.html"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner9 && parent.getItemAtPosition(pos).equals("Business")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.thestar.com/business.html"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner10 && parent.getItemAtPosition(pos).equals("News") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.dailynews.com/news/?source=Nav_News"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner10 && parent.getItemAtPosition(pos).equals("Sports")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.dailynews.com/sports/?source=Nav_Sports"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner10 && parent.getItemAtPosition(pos).equals("Blogs")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.dailynews.com/blogs?source=nav_blogs"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner11 && parent.getItemAtPosition(pos).equals("News") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.foxnews.com/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner11 && parent.getItemAtPosition(pos).equals("Politics")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.foxnews.com/politics/index.html"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner11 && parent.getItemAtPosition(pos).equals("Science")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.foxnews.com/science/index.html"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner12 && parent.getItemAtPosition(pos).equals("News") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.theglobeandmail.com/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner12 && parent.getItemAtPosition(pos).equals("Investing")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.theglobeandmail.com/globe-investor/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner12 && parent.getItemAtPosition(pos).equals("Arts")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.theglobeandmail.com/arts/"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner13 && parent.getItemAtPosition(pos).equals("News") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.usatoday.com/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner13 && parent.getItemAtPosition(pos).equals("Money")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.usatoday.com/money/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner13 && parent.getItemAtPosition(pos).equals("Opinion")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.usatoday.com/opinion/"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner14 && parent.getItemAtPosition(pos).equals("News") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://news.google.ca/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner14 && parent.getItemAtPosition(pos).equals("Maps")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("https://maps.google.ca/maps?hl=en"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner14 && parent.getItemAtPosition(pos).equals("Finance")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.google.ca/finance?tab=ne"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner15 && parent.getItemAtPosition(pos).equals("News") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://news.nationalpost.com/category/news/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner15 && parent.getItemAtPosition(pos).equals("Life")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://life.nationalpost.com/category/life/"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner15 && parent.getItemAtPosition(pos).equals("Driving")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://life.nationalpost.com/category/driving/"));
			startActivity(intent);
		}else if (parent.getId() == R.id.spinner16 && parent.getItemAtPosition(pos).equals("Shows") ){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.nbc.com/shows"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner16 && parent.getItemAtPosition(pos).equals("Shop")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("http://www.nbcuniversalstore.com/?v=nbc&ecid=PRF-NBC-102828&pa=PRF-NBC-102828"));
			startActivity(intent);
		}else if(parent.getId() == R.id.spinner16 && parent.getItemAtPosition(pos).equals("Schedule")){
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("www.nbc.com/schedule"));
			startActivity(intent);
		}else {}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
}
