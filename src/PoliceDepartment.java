public class PoliceDepartment extends Building implements SocialHouse{
    int police_number;
    int car_count;

    public int getPolice_number() {
        return police_number;
    }

    public void setPolice_number(int police_number) {
        this.police_number = police_number;
    }

    public int getCar_count() {
        return car_count;
    }

    public void setCar_count(int car_count) {
        this.car_count = car_count;
    }

    public void reportCrime(String crime) {
        System.out.println("Преступление '" + crime + "' зарегистрировано");
    }

    public String toString(){
        return "Название: " + name_building + ", адрес: " + address+ ", год постройки: "
                + year  + ", имя архитектора: " + name
                + ", культурный памятник? - " + (monument ? "Да" : "Нет")
                + ", номер участка: " + police_number
                + ", количество машин: " + car_count+
                "\n, количество работников: " + getEmployeeCount() +
                ", рабочие дни: " + getWorkingDays();
    }



    public String officerPatrol(String officer) {
        return "На патруль вышел офицер " + officer;
    }

    @Override
    public int getEmployeeCount() {
        return 50;
    }

    @Override
    public String getWorkingDays() {
        return "Пн-Вс";
    }
}
