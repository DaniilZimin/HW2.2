package com.company;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String firstName, String lastName, int powerOfWitchcraft, int distanceOfTheTransgression, int mind, int wisdom, int wit, int creativity) {
        super(firstName, lastName, powerOfWitchcraft, distanceOfTheTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void compareTo(Ravenclaw student) {
        if (this.mind > student.mind) {
            System.out.println(this.getFirstName() + " умнее чем " + student.getFirstName());
        } else if (this.mind < student.mind) {
            System.out.println(student.getFirstName() + " умнее чем " + this.getFirstName());
        } else {
            System.out.println(this.getFirstName() + " и " + student.getFirstName() + " одинаково умные");
        }
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ум: " + mind + '\n' +
                "Мудрость: " + wisdom + '\n' +
                "Остроумие: " + wit + '\n' +
                "Творчество: " + creativity + '\n';
    }
}
