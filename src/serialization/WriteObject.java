package serialization;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) throws IOException {
    Person[] person = {new Person(1, "Маша"),
            new Person(2, "Игорь"),
            new Person(2, "Иван")};

        FileOutputStream fos = new FileOutputStream("people.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeInt(person.length);
        for(Person p : person){
           oos.writeObject(p);
        }
        oos.close();
    }
}
