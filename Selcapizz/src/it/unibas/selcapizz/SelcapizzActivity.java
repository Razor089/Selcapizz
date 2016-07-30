package it.unibas.selcapizz;



import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class SelcapizzActivity extends Activity {
	
	private int base;
	private int aggiunte;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        inizializzaAzioni();
    }
    
    private void inizializzaAzioni(){
    	Button casualButton = (Button)findViewById(R.idBottoni.casuale);
    	Button guidedButton = (Button)findViewById(R.idBottoni.guidato);
    	casualButton.setOnClickListener(new AzioneCasuale(this));
    	guidedButton.setOnClickListener(new AzioneGuidata(this));
    }
    
    public void setBase(int num){
    	this.base = num;
    }
    
    public void setAggiunte(int num){
    	this.aggiunte = num;
    }
    
    public int getBase(){
    	return this.base;
    }
    
    public int getAggiunte(){
    	return this.aggiunte;
    }
}