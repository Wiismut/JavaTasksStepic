public final class Ruler extends WritingMaterials{
    int lengthRul;
    boolean wood ;


    {
        name = "Линейка";
        color = "Цвет линейки неизвестен";
    }

    public void display(){
        System.out.println("This is a Ruler" + "Название: " + name + ", Цвет: " + color +" Длина: " +
                length +", Цена: " + price +  ", Умеет рисовать: " +
                (draw ? "Да" : "Нет") +". Длина линейки: "+
                lengthRul + "Из дерева: "+
                (wood ? "Да" : "Нет"));
    }


    public boolean isWood() {
        return wood;
    }

    public void setLengthRul(int lengthRul ){
        this.lengthRul  = lengthRul ;
    }
    public int getLengthRul(){
        return lengthRul ;
    }

    public void setWood(boolean wood){
        this.wood  = wood ;
    }
    public boolean getWood(){
        return wood ;
    }

    public void measure(){
        System.out.println("Сейчас померяем длину");
    }

    public Ruler(){
        draw = false;
    }
}
