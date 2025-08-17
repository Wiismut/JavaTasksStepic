public class ShoppingCenter extends Building implements SocialHouse{
    int store_count;
    boolean kidFunZone;

public ShoppingCenter(){
    store_count++;
}

    public int getStore_count() {
        return store_count;
    }

    public void setStore_count(int store_count) {
        this.store_count = store_count;
    }

    public boolean isKidFunZone() {
        return kidFunZone;
    }

    public void setKidFunZone(boolean kidFunZone) {
        this.kidFunZone = kidFunZone;
    }

    public String toString(){
        return "Название: " + name_building + ", адрес: " + address+ ", год постройки: "
                + year  + ", имя архитектора: " + name
                + ", культурный памятник? - " + (monument ? "Да" : "Нет")
                + ", количество магазинов: " + store_count
                + " Зона для детей : " + (kidFunZone ? "Да" : "Нет")+
                "\n, количество работников: " + getEmployeeCount() +
                ", рабочие дни: " + getWorkingDays();
    }

    public void openNewStore(String titleStore) {
        System.out.println("Открыт новый магазин! Ждем вас в магазине " + titleStore + ".");
    }

    public String closeCenter (String time) {
    boolean isClose= false;
    String[] parts = time.split(":");
    if(Integer.parseInt(parts[0]) > 22 || (Integer.parseInt(parts[0]) == 22 && Integer.parseInt(parts[1])> 0)){
        isClose = true;
    }
        return isClose ? "Торговый центр уже закрыт :(" : "Торговый центр пока открыт! :)" ;
    }


    @Override
    public int getEmployeeCount() {
        return 200;
    }

    @Override
    public String getWorkingDays() {
        return "Пн-Вс";
    }
}
