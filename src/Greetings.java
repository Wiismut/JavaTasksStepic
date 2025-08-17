import test.SomeClassNew;

public class Greetings {

    public static void main(String[] args) {
        Bird vorobey = new Bird("Птица","Джек",28, 0.5,true,false,false);
        System.out.println("Общее количество животных - "+vorobey.getCount());
        System.out.println(vorobey.toString());
        Insect zhora = new Insect();
        System.out.println("Общее количество животных -  "+zhora.getCount());
        System.out.println(zhora);
        System.out.println(vorobey.toString());
    }

}
