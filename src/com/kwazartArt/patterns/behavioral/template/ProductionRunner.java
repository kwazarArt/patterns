package com.kwazartArt.patterns.behavioral.template;

public class ProductionRunner {
    public static void main(String[] args) {
        Employee leeChuan = new EmployeeLeeChuan();
        Employee wooXon = new EmployeeWooXon();

        leeChuan.doWork();
        System.out.println("\n====================\n");
        wooXon.doWork();
    }
}
