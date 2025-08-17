public class Pen extends WritingMaterials {

    int countColor;
    boolean auto;

    {
        name = "Ручка";
        color = "Цвет ручки неизвестен";
    }

    public void display(){
        System.out.println("This is a Pen" + "Название: " + name + ", Цвет: " + color +" Длина: " +
                length +", Цена: " + price +  ", Умеет рисовать: " +
                (draw ? "Да" : "Нет") +". Количество цветов: "+
                countColor + "Автоматическая: "+
                (auto ? "Да" : "Нет"));
    }



    public boolean isAuto() {
        return auto;
    }

    public void setCountColor(int countColor){
    this.countColor = countColor;
}
public int getCountColor(){
    return countColor;
}

    public void setAuto(boolean auto){
        this.auto = auto;
    }
    public boolean getAuto(){
        return auto;
    }

public void writeMyName(){
    System.out.println(name);
}

    public Pen(){
        draw = true;
        countColor = 1;
    }

}
