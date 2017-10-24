package strathmore.edu.sqlitelab3;

/**
 * Created by user on 10/24/17.
 */

public class Schools {
    //private variables
    int _cid;
    String _schoolname;

    public Schools(){}
    public Schools(int id, String name){
        this._cid = id;
        this._schoolname = name;
    }
    public Schools(String name){
        this._schoolname = name;
    }

    public int getCID() {
        return _cid;
    }

    public void setCID(int _cid) {
        this._cid = _cid;
    }

    public String getCName() {
        return _schoolname;
    }

    public void setCName(String _cname) {
        this._schoolname = _cname;
    }


}
