public class Bird extends Animal{
    String area;
    boolean WinterFly;
    public boolean isWinterFly(){
        return this.WinterFly;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area){
        this.area = area;
    }
    public void chirick_chirick(){
        System.out.println("Chirik-Chirik");
    }
    public boolean getWinterFly() {
        return WinterFly;
    }
    public void setWinterFly(boolean isWinterFly){
        this.WinterFly = isWinterFly;
    }
    public Bird() {
        super("Птица", "No Name");
        setFly(true);
    }
    public Bird(String type, String name) {
        super(type, name);
        setFly(true);
    }

    public Bird(String type, int age) {
        super(type, age);
        setFly(true);
    }

    public Bird(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        setFly(true);
    }

    public void display(){
        System.out.println("I'm a Bird " + "Тип: " + type +
                ", Имя: " + name + "," +
                " Возраст: " + age + "," +
                " Вес: " + weight + ","
                +" Умеет летать: " +
                (isFly ? "Да":"Нет") +
                ", Умеет ходить: " +
                (isWalk ? "Да":"Нет") +
                ", Умеет плавать: " +
                (isSwimm ? "Да":"Нет") + ". Зона обитания: " + area + "Умеет летать: " + (WinterFly ? "Да":"Нет"));
    }


}
