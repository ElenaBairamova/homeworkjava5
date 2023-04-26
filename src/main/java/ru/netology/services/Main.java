package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        System.out.println("Отдохнуть " + service.CalcRestService(100_000, 60_000, 150_000) + " месяца(ев)");
    }

}
