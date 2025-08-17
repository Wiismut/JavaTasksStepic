public class HighRiseBuilding extends Building implements LivingHouse{
    int apartment_count;
    boolean evalator;


    public int getApartment_count() {
        return apartment_count;
    }

    public void setApartment_count(int apartment_count) {
        this.apartment_count = apartment_count;
    }

    public boolean isEvalator() {
        return evalator;
    }

    public void setEvalator(boolean evalator) {
        this.evalator = evalator;
    }

    public String toString(){
        return "Название: " + name_building + ", адрес: " + address+ ", год постройки: "
                + year  + ", имя архитектора: " + name
                + ", культурный памятник? - " + (monument ? "Да" : "Нет")
                + ", количество квартир: " + apartment_count
                + ", Наличие лифта -  " + (evalator ? "Есть" : "Нет")+ "," +
                "\n отключение воды: "
                + "отопление - " + (hasHeating() ? "есть" : "нет");
    }

    public void paintWall(String titlePaint) {
        System.out.println("Решено разрисовать стену здания и нарисовать " + titlePaint + ".");
    }

    public String buildingDemolition() {
        boolean demolition_flag = false;
        if(2025 - this.year >= 80){
            demolition_flag = true;
        }
        return demolition_flag ? "Зданию грозит снос!" : "Здание еще постоит";
    }


    @Override
    public String turningOffTheHotWater(String date) {
        return "в ближайшее время не планируется";
    }

    @Override
    public boolean hasHeating() {
        return true;
    }
}
