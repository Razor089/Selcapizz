package it.unibas.selcapizz;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public class AzioneAvanti implements OnClickListener{
	 private SelcapizzActivity activity;
	
	public AzioneAvanti(SelcapizzActivity a){
		this.activity = a;
	}
	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		saveChoice(which);
		dialog.dismiss();
		createNext();
		
	}
	
	private void saveChoice(int i){
		activity.setBase(i);
	}

	private void createNext(){
		Builder builder = new Builder(activity);
		builder.setTitle("Scegli il numero di aggiunte");
		builder.setCancelable(true);
		//builder.setNegativeButton("Indietro", new AzioneIndietro(activity));
		//builder.setPositiveButton("Fine", new AzioneFine(activity));
		builder.setSingleChoiceItems(R.array.numeroAggiunte, 0, new AzioneFine(activity));
		AlertDialog alert = builder.create();
		alert.show();
	}
}
