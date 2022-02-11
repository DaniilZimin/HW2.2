package com.company;


public class Main {

    public static void main(String[] args) {

        Gryffindor garry = new Gryffindor("Гарри", "Поттер", 76, 95, 78, 57, 78);
        Gryffindor germiona = new Gryffindor("Гермиона", "Грейнджер", 34, 89, 96, 47, 77);
        Gryffindor ron = new Gryffindor("Рон", "Уизли", 78, 67, 58, 32, 89);

        Slytherin malfoy = new Slytherin("Драко", "Малфой", 67, 85, 79, 35, 98, 67, 93);
        Slytherin graham = new Slytherin("Грэхэм", "Монтегю", 69, 75, 68, 76, 87, 69, 69);
        Slytherin gregory = new Slytherin("Грегори", "Гойл", 89, 56, 74, 23, 67, 87, 56);

        Hufflepuff zaharia = new Hufflepuff("Захария", "Смит", 56, 87, 95, 48, 81);
        Hufflepuff sendrik = new Hufflepuff("Седрик", "Диггори", 57, 79, 59, 72, 83);
        Hufflepuff justin = new Hufflepuff("Джастин", "Финч-Флетчли", 75, 92, 87, 81, 79);

        Ravenclaw zhou = new Ravenclaw("Чжоу", "Чанг", 45, 78, 81, 90, 80, 75);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", 46, 77, 80, 93, 84, 71);
        Ravenclaw markus = new Ravenclaw("Маркус", "Белби", 75, 79, 82, 76, 45, 65);

        garry.printInfo();
        sendrik.printInfo();
        padma.printInfo();
        gregory.printInfo();

        ron.compareTo(germiona);
        zaharia.compareTo(justin);
        zhou.compareTo(markus);
        malfoy.compareTo(graham);

        garry.compareHogwarts(malfoy);
    }
}
