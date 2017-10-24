package strathmore.edu.sqlitelab3;

/**
 * Created by user on 10/24/17.
 */


public class Contact {
    //private variables
    int _id;
    String _firstname;
    String _Surname;

    public Contact(){}
    public Contact(int id, String firstname, String Surname){
        this._id = id;
        this._firstname = firstname;
        this._Surname = Surname;
    }
    public Contact(String firstname, String Surname){
        this._firstname = firstname;
        this._Surname = Surname;
    }

    public int getID() {
        return _id;
    }

    public void setID(int _id) {
        this._id = _id;
    }

    public String getFname() {
        return _firstname;
    }

    public void setFname(String _firstname) {
        this._firstname = _firstname;
    }

    public String getSurname() {
        return _Surname;
    }

    public void setSurname(String _Surname) {
        this._Surname = _Surname;
    }



}
