public final class Fish extends Animal{

    String squama ;
    boolean upStreamSwim ;
    public boolean isUpStreamSwim(){
        return this.upStreamSwim;
    }

    public String getSquama () {
        return squama ;
    }
    public void setSquama(String squama){
        this.squama  = squama ;
    }
    public void bul_bul(){
        System.out.println("Bul-bul");
    }
    public Fish() {
        super("Рыба", "No Name");
        setSwimm(true);
    }
    public boolean getUpStreamSwim () {
        return upStreamSwim;
    }
    public void setUpStreamSwim(boolean upStreamSwim ){
        this.upStreamSwim = upStreamSwim;
    }

    public void display(){
        System.out.println("I'm a Fish " + "Тип: " + type +
                ", Имя: " + name + "," +
                " Возраст: " + age + "," +
                " Вес: " + weight + ","
                +" Умеет летать: " +
                (isFly ? "Да":"Нет") +
                ", Умеет ходить: " +
                (isWalk ? "Да":"Нет") +
                ", Умеет плавать: " +
                (isSwimm ? "Да":"Нет") + ". Тип чешуи: " + squama  + "Умеет плавать против течения: " + (upStreamSwim ? "Да":"Нет"));
    }


    public Fish(String type, String name) {
        super(type, name);
        setSwimm(true);
    }

    public Fish(String type, int age) {
        super(type, age);
        setSwimm(true);
    }

    public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        setSwimm(true);
    }
}
