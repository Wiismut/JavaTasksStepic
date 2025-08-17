public class House extends Building implements LivingHouse{
    int floor_count;
    String roof_type;



    public String toString(){
        return "Название: " + name_building + ", адрес: " + address+ ", год постройки: "
                + year  + ", имя архитектора: " + name
                + ", культурный памятник? - " + (monument ? "Да" : "Нет")
                + ", количество этажей: " + floor_count
                + ", тип крыши: " + roof_type
                + ", \n отключение воды: "
                + "отопление - " + (hasHeating() ? "есть" : "нет");
    }

    public void organizeMeeting(String titleMeeting) {
        System.out.println("Организовано собрание жильцов по теме " + titleMeeting + ".");
    }

    public String costOfApartments(boolean cost) {
        return "Цена квартиры в доме: " + cost;
    }

    public int getFloor_count() {
        return floor_count;
    }

    public void setFloor_count(int floor_count) {
        this.floor_count = floor_count;
    }

    public String getRoof_type() {
        return roof_type;
    }

    public void setRoof_type(String roof_type) {
        this.roof_type = roof_type;
    }

    @Override
    public String turningOffTheHotWater(String date) {
        return "17 августа!";
    }

    @Override
    public boolean hasHeating() {
        return false;
    }
}
