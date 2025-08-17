public class WritingMaterials {
    String name;
    String color;
    int price;
    double length;
    boolean draw;
    final static  String description = "Это письменная принадлежность!";
    static int count = 0;
    int number;

static int getCount(){
    return count;
}
    {
        name = "No name";
        color = "No color";
        count++;
        number = count;
    }

    public String toString(){
        return "Название: " + name + ", Цвет: " + color +" Длина: " +
                length +", Цена: " + price +  ", Умеет рисовать: " +
                (draw ? "Да" : "Нет") +"." + "Номер этой письменной принадлежности: " +
        number + ", Общее кол-во принадлежностей " + count +".";
    }

public void display(){
    System.out.println("Название: " + name + ", Цвет: " + color +" Длина: " +
            length +", Цена: " + price +  ", Умеет рисовать: " +
            (draw ? "Да" : "Нет") +".");
}

public String replace_rod(String color){
    this.color = color;
    return color;
}

public int priceUp(int num){
    this.price = price + num;
    return price;
}

public int priceDown(int num){
    this.price = price - num;
    return price;
}
    public WritingMaterials(){
        /*this.name = "Название";
        this.color = "Цвет";*/
    }
    public WritingMaterials(String name, int price){
        this.name = name;
        this.price = price;
    }


/*public WritingMaterials(String name, String color){
    this.name = name;
    this.color = color;
}
public WritingMaterials(String name, int price){
     this.name = name;
     this.price = price;
     this.color = "No Color";
}

public WritingMaterials(int price, double length, boolean draw){
     this.name = "No name";
     this.price = price;
     this.length = length;
     this.draw = draw;
     this.color = "No Color";
}
*/
public WritingMaterials(String name, String color, int price, double length, boolean draw){
     this.name = name;
    this.color = color;
     this.price = price;
     this.length = length;
     this.draw = draw;

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public void draw(){
    if(this.draw){
        System.out.println(this.name + " провёл линий: 1. Их цвет -  "
                + this.color +".");
    } else {
        System.out.println(this.name + " не может ничего нарисовать.");
    }
}

    public void draw(int n){
        if(this.draw){
            System.out.println(this.name + " провёл линий: " + n +". Их цвет -  "
                    + this.color +".");
        } else {
            System.out.println(this.name + " не может ничего нарисовать.");
        }
    }
    public void draw(String color,int n){
        if(this.draw){
            System.out.println(this.name + " провёл линий: " + n +". Их цвет - " + color
                    + ".");
        } else {
            System.out.println(this.name + " не может ничего нарисовать.");
        }
    }

    public void draw(String color){
        if(this.draw){
            System.out.println(this.name + " провёл линий: 1. Их цвет -  "
                    + color +".");
        } else {
            System.out.println(this.name + " не может ничего нарисовать.");
        }
    }

}
