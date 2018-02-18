package com.mylenovo.words;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder aBuilder = new AlertDialog.Builder( this );
        aBuilder.setMessage( "Want to EXIT?" ).setCancelable( false ).setPositiveButton( "Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                moveTaskToBack( true );
                android.os.Process.killProcess( android.os.Process.myPid() );
                System.exit( 1 );
            }
        } ).setNegativeButton( "No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        } );
        AlertDialog alertDialog = aBuilder.create();
        alertDialog.show();
    }
}
