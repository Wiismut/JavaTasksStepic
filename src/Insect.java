public class Insect extends Animal{
    int wingCount  ;
    boolean likeJesus  ;

    public boolean isLikeJesus(){
        return this.likeJesus;
    }

    public int getWingCount () {
        return wingCount  ;
    }
    public void setWingCount(int wingCount){
        this.wingCount   = wingCount  ;
    }
    public Insect() {
        super("Насекомое", "No Name");
        setWalk(true);
    }
    public boolean getLikeJesus  () {
        return likeJesus ;
    }
    public void setLikeJesus(boolean likeJesus){
        this.likeJesus  = likeJesus ;
    }
    public void ggggg(){
        System.out.println("Ggggg");
    }
    public void display(){
        System.out.println("I'm a Insect " + "Тип: " + type +
                ", Имя: " + name + "," +
                " Возраст: " + age + "," +
                " Вес: " + weight + ","
                +" Умеет летать: " +
                (isFly ? "Да":"Нет") +
                ", Умеет ходить: " +
                (isWalk ? "Да":"Нет") +
                ", Умеет плавать: " +
                (isSwimm ? "Да":"Нет") + ". Кол-во крыльев: " + wingCount   + "Умеет ходить по воде: " + (likeJesus ? "Да":"Нет"));
    }





    public Insect(String type, String name) {
        super(type, name);
        setWalk(true);
    }

    public Insect(String type, int age) {
        super(type, age);
        setWalk(true);
    }

    public Insect(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        setWalk(true);
    }
}
