package com.company;

public abstract class Hogwarts {
    private String firstName;
    private String lastName;
    private int powerOfWitchcraft;
    private int distanceOfTheTransgression;

    public Hogwarts(String firstName, String lastName, int powerOfWitchcraft, int distanceOfTheTransgression) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.powerOfWitchcraft = powerOfWitchcraft;
        this.distanceOfTheTransgression = distanceOfTheTransgression;
    }

    public void compareHogwarts(Hogwarts student) {
        if (this.powerOfWitchcraft > student.powerOfWitchcraft && this.distanceOfTheTransgression > student.distanceOfTheTransgression) {
            System.out.println(this.firstName + " во всем сильнее чем " + student.firstName);
        } else if (this.powerOfWitchcraft < student.powerOfWitchcraft && this.distanceOfTheTransgression < student.distanceOfTheTransgression) {
            System.out.println(this.firstName + " во всем слабее чем " + student.firstName);
        } else if (this.powerOfWitchcraft < student.powerOfWitchcraft && this.distanceOfTheTransgression > student.distanceOfTheTransgression) {
            System.out.println(this.firstName + " сильнее чем " + student.firstName + " в трансгрессии, но слабее в силе магии");
        } else if (this.powerOfWitchcraft > student.powerOfWitchcraft && this.distanceOfTheTransgression < student.distanceOfTheTransgression) {
            System.out.println(student.firstName + " сильнее чем " + this.firstName + " в трансгрессии, но слабее в силе магии");
        } else {
            System.out.println(student.firstName + " и " + this.firstName + " равны в своих силах");
        }
    }

    public void printInfo() {
        System.out.printf("Имя: %s%nФамилия: %s%nСила магии: %s%nРасстояние трансгрессии: %s%n%s%n",
                this.firstName, this.lastName, this.powerOfWitchcraft, this.distanceOfTheTransgression, this);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPowerOfWitchcraft() {
        return powerOfWitchcraft;
    }

    public void setPowerOfWitchcraft(int powerOfWitchcraft) {
        this.powerOfWitchcraft = powerOfWitchcraft;
    }

    public int getDistanceOfTheTransgression() {
        return distanceOfTheTransgression;
    }

    public void setDistanceOfTheTransgression(int distanceOfTheTransgression) {
        this.distanceOfTheTransgression = distanceOfTheTransgression;
    }

}
