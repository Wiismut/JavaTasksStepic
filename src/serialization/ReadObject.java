package serialization;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("people.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int pcount = ois.readInt();
        Person[] people = new Person[pcount];
        for(int i = 0; i < pcount; i++){
            people[i] = (Person) ois.readObject();
        }



        ois.close();
        //System.out.println(person1);

    }
}
