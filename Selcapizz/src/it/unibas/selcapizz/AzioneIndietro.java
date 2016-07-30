package it.unibas.selcapizz;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public class AzioneIndietro implements OnClickListener{
	private SelcapizzActivity activity;
	
	public AzioneIndietro(SelcapizzActivity a){
		this.activity = a;
	}
	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		creaDialog();
	}
	
private void creaDialog(){
		
		Builder builder = new Builder(activity);
		builder.setTitle("Scegli la base della pizza");
		builder.setCancelable(true);
		builder.setPositiveButton("Avanti", new AzioneAvanti(activity));
		builder.setNegativeButton("Annulla", new AzioneAnnulla(activity));
		builder.setSingleChoiceItems(R.array.baseArray, 0, null);
		AlertDialog alert = builder.create();
		alert.show();
	}

}
