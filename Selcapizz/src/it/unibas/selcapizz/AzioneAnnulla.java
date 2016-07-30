package it.unibas.selcapizz;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public class AzioneAnnulla implements OnClickListener{
	Activity activity;
	
	public AzioneAnnulla(Activity a){
		this.activity = a;
	}
	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		dialog.dismiss();
	}

}
