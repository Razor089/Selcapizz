package it.unibas.selcapizz;

import java.util.Random;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;

public class AzioneFine implements OnClickListener{
	private SelcapizzActivity activity;
	
	public AzioneFine(SelcapizzActivity a){
		this.activity = a;
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		saveChoice(which);
		dialog.dismiss();
		create();
	}
	
	private void saveChoice(int i){
		this.activity.setAggiunte(i);
	}
	
	private void create(){
		Resources res = activity.getResources();
		String[] baseArray = res.getStringArray(R.array.baseArray);
		String[] arrayAggiunte = res.getStringArray(R.array.arrayAggiunte);
		String base = baseArray[activity.getBase()];
		String aggiunte = randomAggiunte(arrayAggiunte);
		
		Builder builder = new Builder(activity);
		builder.setTitle("Pizza Generata");
		builder.setMessage("Base: " + base + "\n" + "Aggiunte: " + aggiunte);
		builder.setPositiveButton("Ok", null);
		AlertDialog alert = builder.create();
		alert.show();
	}
	
	private String randomAggiunte(String[] aggiunte){
		String res = "";
		Random rand = new Random();
		int numeroAggiunte = activity.getAggiunte();
		switch (numeroAggiunte) {
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
		return res;
	}

}
