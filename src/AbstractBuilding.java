public class AbstractBuilding {
    public static void main(String[] args) {
        // Тест Library
        Library lib = new Library();
        lib.setAddress("ул. Ленина, 5");
        lib.setYear(1980);
        lib.setName("Иван Иванов");
        lib.setMonument(true);
        lib.setFree(true);
        lib.setBook_count(5000);
        lib.organizeEvent("Ночь в библиотеке");
        System.out.println(lib.roomForTea(true));
        System.out.println(lib);

        System.out.println("\n-------------------------");

        // Тест House
        House house = new House();
        house.setName_building("Жилой дом");
        house.setAddress("ул. Горького, 12");
        house.setYear(2000);
        house.setName("Петр Петров");
        house.setMonument(false);
        house.setFloor_count(9);
        house.setRoof_type("Плоская");
        house.organizeMeeting("Ремонт подъезда");
        System.out.println(house.costOfApartments(true));
        System.out.println(house);

        System.out.println("\n-------------------------");

        // Тест PoliceDepartment
        PoliceDepartment pd = new PoliceDepartment();
        pd.setName_building("Отдел полиции №3");
        pd.setAddress("ул. Центральная, 7");
        pd.setYear(1995);
        pd.setName("Сидоров С.С.");
        pd.setMonument(false);
        pd.setPolice_number(3);
        pd.setCar_count(5);
        pd.reportCrime("Кража");
        System.out.println(pd.officerPatrol("Иванов"));
        System.out.println(pd);

        System.out.println("\n-------------------------");

        // Тест University
        University uni = new University();
        uni.setName_building("Технический университет");
        uni.setAddress("пр. Науки, 15");
        uni.setYear(1970);
        uni.setName("Архипов А.А.");
        uni.setMonument(false);
        uni.setNemedBy("М.В. Ломоносов");
        uni.setMilitary_Department(true);
        uni.alumniMeetingDay("15 мая");
        System.out.println(uni.newFaculty("Кибербезопасность"));
        System.out.println(uni);

        System.out.println("\n-------------------------");

        // Тест ShoppingCenter
        ShoppingCenter sc = new ShoppingCenter();
        sc.setName_building("Mega Mall");
        sc.setAddress("ул. Торговая, 1");
        sc.setYear(2010);
        sc.setName("Зуев А.П.");
        sc.setMonument(false);
        sc.setStore_count(150);
        sc.setKidFunZone(true);
        sc.openNewStore("H&M");
        System.out.println(sc.closeCenter("21:30"));
        System.out.println(sc);

        System.out.println("\n-------------------------");

        // Тест HighRiseBuilding
        HighRiseBuilding hr = new HighRiseBuilding();
        hr.setName_building("Башня Федерации");
        hr.setAddress("Москва-Сити");
        hr.setYear(2015);
        hr.setName("Смирнов В.В.");
        hr.setMonument(false);
        hr.setApartment_count(500);
        hr.setEvalator(true);
        hr.paintWall("Панорама города");
        System.out.println(hr.buildingDemolition());
        System.out.println(hr);
    }

}
