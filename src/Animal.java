public class Animal {
     String type;
     String name;
     int age;
     double weight;
     boolean isFly;
     boolean isWalk;
     boolean isSwimm;
    final static String description = "Это животное!";
     static int count = 0;
     int number = 1;
     public static  int getCount(){
         return count;
     }
    public int getNumber(){
        return number;
    }
    //инициализатор
    {
        type = "No type";
        age = 0;
        name = "No Name";
        weight = 0;
        isFly = false;
        isWalk = false;
        isSwimm = false;
        count++;
        number = count;
    }
    public String toString(){
       return "Тип: " + type +
                ", Имя: " + name + "," +
                " Возраст: " + age + "," +
                " Вес: " + weight + ","
                +" Умеет летать: " +
                (isFly ? "Да":"Нет") +
                ", Умеет ходить: " +
                (isWalk ? "Да":"Нет") +
                ", Умеет плавать: " +
                (isSwimm ? "Да":"Нет") + ", Номер животного - "+ number +".";
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }



    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwimm = isSwim;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isSwimm() {
        return isSwimm;
    }

    public void setSwimm(boolean swim) {
        isSwimm = swim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Тип: " + type +
                ", Имя: " + name + "," +
                " Возраст: " + age + "," +
                " Вес: " + weight + ","
                +" Умеет летать: " +
                (isFly ? "Да":"Нет") +
        ", Умеет ходить: " +
                (isWalk ? "Да":"Нет") +
                ", Умеет плавать: " +
                (isSwimm ? "Да":"Нет") + ".");
    }

    public final String rename(String name){
        this.name = name;
        return name;
    }



    public double holiday(){
        double n = 0.1;
        weight = n + weight;
        weight =  (weight*100)/100;
        return  weight;
    }

    public double holiday(double m){
        this.weight = m+weight;
        return weight;
    }

    public double holiday(double m, int n){
        this.weight = (n*m)+weight;
        return weight;
    }

}
