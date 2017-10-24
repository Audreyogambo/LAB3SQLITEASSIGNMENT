package strathmore.edu.sqlitelab3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler db = new DatabaseHandler(this);
        /**
         * CRUD Operations
         *  */
        //Inserting contacts
        Log.d("Insert:", "Inserting..");
        db.addContact(new Contact("Audrey", "0790139046"));
        db.addContact(new Contact("Ravi", "12345678"));
        db.addContact(new Contact("Michael", "0708822190"));
        db.addContact(new Contact("Glenn", "0721795715"));
        db.addContact(new Contact("mum", "0722284130"));

        //Inserting schools
        Log.d("Insert:", "Inserting..");
        db.addContact(new Contact("Strathmore", "0790139046"));
        db.addContact(new Contact("CUEA", "12345678"));
        db.addContact(new Contact("USIU", "0708822190"));
        db.addContact(new Contact("KenyattaUniversity", "0721795715"));
        db.addContact(new Contact("JKUATKaren", "0722284130"));


        //Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = db.getAllContact();

        for (Contact cn: contacts) {
            String log =  "Id: " + cn.getID() + ",FName:" + cn.getFname() + ",LName:" + cn.getSurname();
            //Writing Contacts to Log
            Log.d("Name: ", log);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
