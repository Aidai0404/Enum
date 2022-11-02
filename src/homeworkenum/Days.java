package homeworkenum;

public enum Days {
    MONDAY("Дуйшомбу"),
    TUESDAY("Шейшемби"),
    WEDNESDAY("Шаршемби"),
    THURSDAY("Бейшемби"),
    FRIDAY("Жума"),
    SATURDAY("Ишемби"),
    SUNDAY("Жекшемби");
   private String name;

    Days(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
