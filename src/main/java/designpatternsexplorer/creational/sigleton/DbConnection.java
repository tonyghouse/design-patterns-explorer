package creational.sigleton;

import java.io.Serializable;

public class DbConnection implements Serializable {

    //properties

    private DbConnection() {
        System.out.println("DB connection object m");
    }

    private static DbConnection instance = null;

    public static  DbConnection getInstance() {
        if (instance == null) {
            synchronized (DbConnection.class) {
                if (instance == null) {
                    instance = new DbConnection();
                }

            }
        }
        return instance;
    }

    public Object readResolve(){
        return instance;
    }



}
