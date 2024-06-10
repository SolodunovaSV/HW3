package view;

import java.util.Scanner;

public class View {
    public String CreateUser(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите данные пользователя в следующем формате: фамилия, имя, отчество, дата рождения (dd.mm.yyyy), телефонный номер (10), пол: ");
        return inp.nextLine();
    }

    public void Exception(Exception e){
        Exception(e.getMessage());
    }

    public void Exception(String str){
        System.out.println(str);
    }
}