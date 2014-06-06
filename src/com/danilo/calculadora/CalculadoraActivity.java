package com.danilo.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		final EditText v1 = (EditText) findViewById(R.id.edtValor1);
		final EditText v2 = (EditText) findViewById(R.id.edtValor2);
		final TextView resultado = (TextView) findViewById(R.id.txtResultado);
		
		Button somar = (Button) findViewById(R.id.btnSomar);
		Button subtrair = (Button) findViewById(R.id.btnSubtrair);
		Button dividir = (Button) findViewById(R.id.btnDividir);
		Button multiplicar = (Button) findViewById(R.id.btnMultiplicar);
	
		//Somar
		somar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Double valor1 = Double.parseDouble(v1.getText().toString());
				Double valor2 = Double.parseDouble(v2.getText().toString());
				Double r = valor1 + valor2;
				resultado.setText(String.valueOf(r));
				
			}
		});
		//Subtrair
	     subtrair.setOnClickListener(new OnClickListener() {
	    	 
	    	 @Override
	    	 public void onClick(View v) {
	    		 
	    		 Double valor1 = Double.parseDouble(v1.getText().toString());
	    		 Double valor2 = Double.parseDouble(v2.getText().toString());
	    		 Double r = valor1 - valor2;
	    		 resultado.setText(String.valueOf(r));
	    		 
	    	 }
	     });
	     
	     //Dividir
	     dividir.setOnClickListener(new View.OnClickListener() {

	    	 	@Override
	  			public void onClick(View v) {
	    	 		
	  				Double valor1 =  Double.parseDouble(v1.getText().toString());
	  				Double valor2 =  Double.parseDouble(v2.getText().toString());	
	  				Double r = valor1/valor2;
	  				resultado.setText(String.valueOf(r));
			}
		});
	     
	   //Multiplicar
	   multiplicar.setOnClickListener(new OnClickListener() {
		   
		   @Override
		   public void onClick(View v) {


			   
			   Double valor1 = Double.parseDouble(v1.getText().toString());
			   Double valor2 = Double.parseDouble(v2.getText().toString());
			   Double r = valor1 * valor2;
			   resultado.setText(String.valueOf(r));
			   
		   }
	   });
	
	}
}
