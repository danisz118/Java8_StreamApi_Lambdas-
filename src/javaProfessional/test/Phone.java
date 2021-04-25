package javaProfessional.test;

import java.util.Objects;

public class Phone  {
    String model;
    int battery;

    public Phone(String model, int bettaryMAP) {
        this.model = model;
        this.battery = bettaryMAP;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return getBattery() == phone.getBattery() &&
                Objects.equals(getModel(), phone.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getBattery());
    }



    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", battery=" + battery +
                '}';
    }
}
