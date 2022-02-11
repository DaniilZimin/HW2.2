package com.company;

public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String lastName, int powerOfWitchcraft, int distanceOfTheTransgression, int industriousness, int loyalty, int honesty) {
        super(firstName, lastName, powerOfWitchcraft, distanceOfTheTransgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void compareTo(Hufflepuff student) {
        if (this.honesty > student.honesty) {
            System.out.println(this.getFirstName() + " честнее чем " + student.getFirstName());
        } else if (this.honesty < student.honesty) {
            System.out.println(student.getFirstName() + " честнее чем " + this.getFirstName());
        } else {
            System.out.println(this.getFirstName() + " и " + student.getFirstName() + " одинаково честные");
        }
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Трудолюбие: " + industriousness + '\n' +
                "Верность:  " + loyalty + '\n' +
                "Честность: " + honesty + '\n';
    }
}
