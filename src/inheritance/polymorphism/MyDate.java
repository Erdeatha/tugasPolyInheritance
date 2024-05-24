/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.polymorphism;

/**
 *
 * @author Putra
 */
public class MyDate {
    private int tahun;
    private int bulan;
    private int hari;

    public MyDate() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.tahun = calendar.get(java.util.Calendar.YEAR);
        this.bulan = calendar.get(java.util.Calendar.MONTH) + 1;
        this.hari = calendar.get(java.util.Calendar.DAY_OF_MONTH);
    }

    public MyDate(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }

    public int getTahun() {
        return tahun;
    }

    public int getBulan() {
        return bulan;
    }

    public int getHari() {
        return hari;
    }

    @Override
    public String toString() {
        return tahun + "/" + bulan + "/" + hari;
    }
}
