package it.unibas.selcapizz;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;

import java.util.Random;

public class AzioneCasuale implements OnClickListener {
	private Activity activity;
	
	public AzioneCasuale(Activity a){
		this.activity = a;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		create();
	}

	private void create(){
		
		Resources res = activity.getResources();
		String[] baseArray = res.getStringArray(R.array.baseArray);
		String[] arrayAggiunte = res.getStringArray(R.array.arrayAggiunte);
		String base = randomBase(baseArray);
		String aggiunte = randomAggiunte(arrayAggiunte);
		
		Builder builder = new Builder(activity);
		builder.setTitle("Pizza Generata");
		builder.setMessage("Base: " + base + "\n" + "Aggiunte: " + aggiunte);
		builder.setCancelable(true);
		builder.setPositiveButton("Ok", null);
		AlertDialog dialog = builder.create();
		dialog.show();
	}
	
	private String randomAggiunte(String[] aggiunte){
		
		Random rand = new Random();
		int i = rand.nextInt(3);
		switch(i){
			case (0):{
				String scelta1 = aggiunte[rand.nextInt(aggiunte.length)];
			    String scelta2 = aggiunte[rand.nextInt(aggiunte.length)];
			    while(scelta1.equals(scelta2)){
			    	scelta2 = aggiunte[rand.nextInt(aggiunte.length)];
			    }
			    
			    return scelta1 + ", " + scelta2;
			}
			case (1):{
				String scelta1 = aggiunte[rand.nextInt(aggiunte.length)];
			    String scelta2 = aggiunte[rand.nextInt(aggiunte.length)];
			    String scelta3 = aggiunte[rand.nextInt(aggiunte.length)];
			    while(scelta2.equals(scelta1) || scelta2.equals(scelta3)){
			    	scelta2 = aggiunte[rand.nextInt(aggiunte.length)];
			    }
			    while(scelta3.equals(scelta1) || scelta3.equals(scelta2)){
			    	scelta3 = aggiunte[rand.nextInt(aggiunte.length)];
			    }
			    return scelta1 + ", " + scelta2 + ", " + scelta3;
			}
			case (2):{
				String scelta1 = aggiunte[rand.nextInt(aggiunte.length)];
				String scelta2 = aggiunte[rand.nextInt(aggiunte.length)];
				String scelta3 = aggiunte[rand.nextInt(aggiunte.length)];
				String scelta4 = aggiunte[rand.nextInt(aggiunte.length)];
				String scelta5 = aggiunte[rand.nextInt(aggiunte.length)];
				while(scelta2.equals(scelta1) || scelta2.equals(scelta3) || scelta2.equals(scelta4) || scelta2.equals(scelta5)){
					scelta2 = aggiunte[rand.nextInt(aggiunte.length)];
				}
				while(scelta3.equals(scelta1) || scelta3.equals(scelta2) || scelta3.equals(scelta4) || scelta3.equals(scelta5)){
					scelta3 = aggiunte[rand.nextInt(aggiunte.length)];
				}
				while(scelta4.equals(scelta1) || scelta4.equals(scelta2) || scelta4.equals(scelta3) || scelta4.equals(scelta5)){
					scelta4 = aggiunte[rand.nextInt(aggiunte.length)];
				}
				while(scelta5.equals(scelta1) || scelta5.equals(scelta2) || scelta5.equals(scelta3) || scelta5.equals(scelta4)){
					scelta5 = aggiunte[rand.nextInt(aggiunte.length)];
				}
				return scelta1 + ", " + scelta2 + ", " + scelta3 + ", " + scelta4 + ", " + scelta5;
			}
		}
		return "";
	}
	
	private String randomBase(String[] base){
		Random rand = new Random();
		String res = base[rand.nextInt(base.length)];
		return res;
	}
	
}
