public class Divider extends WritingMaterials{
    String dividerType ;
    boolean metal  ;

    {
        name = "Циркуль";
        color = "Цвет циркуля неизвестен";
    }
    public void display(){
        System.out.println("This is a Divider" + "Название: " + name + ", Цвет: " + color +" Длина: " +
                length +", Цена: " + price +  ", Умеет рисовать: " +
                (draw ? "Да" : "Нет") +". Тип циркуля: "+
                dividerType + "Из металла: "+
                (metal ? "Да" : "Нет"));
    }


    public boolean isMetal() {
        return metal;
    }

    public void setDividerType(String dividerType ){
        this.dividerType  = dividerType ;
    }
    public String getDividerType(){
        return dividerType ;
    }

    public void setMetal(boolean metal){
        this.metal   = metal  ;
    }
    public boolean getMetal(){
        return metal ;
    }

    public final void draw_circle(){
        System.out.println("Нарисован круг");
    }

    public Divider(){
        draw = true;
    }

}
