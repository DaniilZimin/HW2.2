package com.company;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstName, String lastName, int powerOfWitchcraft, int distanceOfTheTransgression, int nobility, int honor, int bravery) {
        super(firstName, lastName, powerOfWitchcraft, distanceOfTheTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void compareTo(Gryffindor student) {
        if (this.bravery > student.bravery) {
            System.out.println(this.getFirstName() + " храбрее чем " + student.getFirstName());
        } else if (this.bravery < student.bravery) {
            System.out.println(student.getFirstName() + " храбрее чем " + this.getFirstName());
        } else {
            System.out.println(this.getFirstName() + " и " + student.getFirstName() + " одинаково храбры");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Благородство: " + nobility + '\n' +
                "Честь: " + honor + '\n' +
                "Храбрость: " + bravery + '\n';
    }
}
