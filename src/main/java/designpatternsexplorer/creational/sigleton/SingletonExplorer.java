package creational.sigleton;


import java.io.*;

/*

 */
public class SingletonExplorer {
    // Creational design pattern

    //creates a single instance of class


    public static void explore() throws IOException, ClassNotFoundException {
        System.out.println("Singleton Explorer");
        DbConnection dbConnectionObj = DbConnection.getInstance();

        //breaking singleton by serialazable

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("dbconn.text"));
        outputStream.writeObject(dbConnectionObj);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("dbconn.text"));
        DbConnection deserializedDbConnectionObj = (DbConnection) inputStream.readObject();

        //issue with serialization
        System.out.println("hashcode1 : "+dbConnectionObj.hashCode());
        System.out.println("hashcode2 : "+deserializedDbConnectionObj.hashCode());

        //breaking singleton using reflections


    }

}
