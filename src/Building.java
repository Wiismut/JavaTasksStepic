public abstract class Building {
    String name_building;
    String address;
    int year;
    String name;
    boolean monument;


    {
         name_building = "Без названия";
         address = "Неизвестно";
         year = 0000;
         name = "Неизвестный";
         monument = false;
    }

    public String getName_building() {
        return name_building;
    }

    public void setName_building(String name_building) {
        this.name_building = name_building;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMonument() {
        return monument;
    }

    public void setMonument(boolean monument) {
        this.monument = monument;
    }
}
