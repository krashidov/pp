package com.android;

import java.util.Date;
import java.lang.Object;
import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;

public class PlusplusActivity extends Activity {
	
	private static final int ACTIVITY_CREATE = 0;
	private static final int ACTIVITY_EDIT = 1;
	
	//private static final int INSERT_ID = Menu.FIRST;
	
	
	private PDbAdapter mDbHelper;
	private Cursor mNotesCursor;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        mDbHelper = new PDbAdapter(this);
        mDbHelper.open();
        dumpDay();
        //filldata();
    }
    
    public void dumpDay()
    {
    	long current = System.currentTimeMillis();
    	Date today = null;
    	today.setTime(current);
    	Date dbDate = null;
    	dbDate.setTime(mDbHelper.getLastDate());
    	/*if( today.compareTo(dbDate) < 0 )
    	{
    		
    	
    	}*/
    }
    
    
    
    
}