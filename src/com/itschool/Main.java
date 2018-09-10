package com.itschool;

public class Main {

    public static void main(String[] args) {
	    Table table1 = new Table();
        table1.setLength((short)120);
        table1.setColor("Yellow");
        System.out.println(table1.toString());

        Table table2 = new Table(150, 80, 70, "Brown", 120, 4, "Стол руководителя СР-150");
        System.out.println(table2.toString());
    }
}
