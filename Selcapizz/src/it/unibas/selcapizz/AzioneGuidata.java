package it.unibas.selcapizz;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

public class AzioneGuidata implements OnClickListener{
	private SelcapizzActivity activity;
	
	public AzioneGuidata(SelcapizzActivity a){
		this.activity = a;
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		creaDialog();
	}
	
	private void creaDialog(){
		
		Builder builder = new Builder(activity);
		builder.setTitle("Scegli la base della pizza");
		builder.setCancelable(true);
		//builder.setPositiveButton("Avanti", new AzioneAvanti(activity));
		//builder.setNegativeButton("Annulla", new AzioneAnnulla(activity));
		builder.setSingleChoiceItems(R.array.baseArray, 0, new AzioneAvanti(activity));
		AlertDialog alert = builder.create();
		alert.show();
		
	}
	

}
