public class Library extends Building implements SocialHouse{
     int book_count = 0;
    boolean free;

    public  int getBook_count() {
        return book_count;
    }

    public void setBook_count(int book_count) {
        this.book_count = book_count;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
    public void organizeEvent(String eventName) {
        System.out.println("Мероприятие '" + eventName + "' организовано");
    }

    public String roomForTea(boolean hasRoomForTea) {
        return hasRoomForTea ? "Есть чайная комната" : "Нет чайной комнаты";
    }
    {
        name_building = "Библиотека";
    }

    public Library(){
        book_count++;
    }

    public String toString(){
        return "Название: " + name_building + ", адрес: " + address+ ", год постройки: "
              + year  + ", имя архитектора: " + name
                + ", культурный памятник? - " + (monument ? "Да" : "Нет")
                + ", \nколичество книг: " + book_count
                + ", бесплатно? - " + (free ? "Да" : "Нет") +
                ", количество работников: " + getEmployeeCount() +
                ", рабочие дни: " + getWorkingDays();
    }


    @Override
    public int getEmployeeCount() {
        return 15;
    }

    @Override
    public String getWorkingDays() {
        return "Пн-Сб, Вс - выходной";
    }
}
