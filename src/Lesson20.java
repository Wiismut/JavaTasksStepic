public class Lesson20 {

    public static void main(String[] args) {
        Person human2 = new Person("Ваня", 16, "Мужчина");
        Person human1 = new Person("Маша", 22, "Женщина");
/*        human1.setName("Маша");
        human1.setAge(22);
        human1.setGender("Женщина");*/
        System.out.println("Привет! Мое имя - " + human1.getName()+ ". Мне сегодня исполняется: "
                + human1.getAge() + ". Мой пол - " + human1.getGender());

        human1.setAge(23);
        human1.setName("Изольда");

        System.out.println("Привет! Теперь меня зовут - " + human1.getName()+ ". Мне уже стукнуло: "
                + human1.getAge() + ". Мой пол все еще - " + human1.getGender());
    }
}

    class Person{
        private String name;
        private int age;
        private String gender;

        public Person(String name, int age, String gender){
            this.name = name;
            this.age = age;
            this.gender = gender;
        }


        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setGender(String gender){
            this.gender = gender;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public String getGender(){
            return gender;
        }

    }


