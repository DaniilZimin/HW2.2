package com.company;

public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String firstName, String lastName, int powerOfWitchcraft, int distanceOfTheTransgression, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(firstName, lastName, powerOfWitchcraft, distanceOfTheTransgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void compareTo(Slytherin student) {
        if (this.trick > student.trick) {
            System.out.println(this.getFirstName() + " хитрее чем " + student.getFirstName());
        } else if (this.trick < student.trick) {
            System.out.println(student.getFirstName() + " хитрее чем " + this.getFirstName());
        } else {
            System.out.println(this.getFirstName() + " и " + student.getFirstName() + " одинаково хитрые");
        }
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Хитрость: " + trick + '\n' +
                "Решительность: " + determination + '\n' +
                "Амбициозность: " + ambition + '\n' +
                "Находчивость: " + resourcefulness + '\n' +
                "Жажда власти: " + lustForPower + '\n';
    }
}
