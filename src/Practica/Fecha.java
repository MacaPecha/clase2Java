package Practica;

import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {
    private int year;
    private int month;
    private int day;

    public Fecha(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Fecha() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void plusOneDay() {
        Date d = new Date();
        d.setDate(this.getDay());
        d.setMonth(this.getMonth());
        d.setYear(this.getYear());
//        LocalDateTime.from(d.toInstant()).plusDays(1);
        GregorianCalendar gd = new GregorianCalendar();
        gd.setGregorianChange(d);
        gd.add(GregorianCalendar.DATE,1);
        System.out.println(d);
        //falta terminaaar!
    }

    @Override
    public String toString() {
        return "Fecha: " + year +
                "/" + month +
                "/" + day;
    }

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
    }
}
