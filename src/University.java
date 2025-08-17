public class University extends Building implements SocialHouse{

    String nemedBy;
    boolean military_Department;



    public String toString(){
        return "Название: " + name_building + ", адрес: " + address+ ", год постройки: "
                + year  + ", имя архитектора: " + name
                + ", культурный памятник? - " + (monument ? "Да" : "Нет")
                + ", назван в честь: " + nemedBy
                + ", военная кафедра: " + (military_Department ? "Есть" : "Нет")+
                "\n, количество работников: " + getEmployeeCount() +
                ", рабочие дни: " + getWorkingDays();
    }

    public String getNemedBy() {
        return nemedBy;
    }

    public void setNemedBy(String nemedBy) {
        this.nemedBy = nemedBy;
    }

    public boolean isMilitary_Department() {
        return military_Department;
    }

    public void setMilitary_Department(boolean military_Department) {
        this.military_Department = military_Department;
    }

    public void alumniMeetingDay(String date) {
        System.out.println("День встречи выпускников пройдет " + date + ".");
    }

    public String newFaculty(String faculty) {
        return "Открылся новый факультет: " + faculty;
    }


    @Override
    public int getEmployeeCount() {
        return 300;
    }

    @Override
    public String getWorkingDays() {
        return "Пн-Сб";
    }
}
