package dz.seminar6;

public class Laptop {
    Integer ram;
    Integer ssd;
    float diagonal;
    String cpu;
    String screenType;
    String color;

    public Laptop(int ram, int ssd, float diagonal, String cpu, String screenType, String color) {
        this.ram = ram;
        this.ssd = ssd;
        this.diagonal = diagonal;
        this.cpu = cpu;
        this.screenType = screenType;
        this.color = color;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Оперативная память: " + ram + "ГБ" + ". SSD: " + ssd + "ГБ" + ". Диагональ: " + diagonal + " дюймов" +
                ". Процессор: " + cpu + ". Тип экрана: " + screenType + ". Цвет: " + color;
    }
}

