package hw16;

import java.util.Calendar;

public class FitnessTracker {
    public static class User {
        private final String name;
        private final int birthDay;
        private final int birthMonth;
        private final int birthYear;
        private final String email;
        private final String phoneNumber;
        private String surname;
        private double weight;
        private String bloodPressure;
        private int stepsPerDay;
        private int age;

        // Builder for creating a user account
        public User(String name, int birthDay, int birthMonth, int birthYear,
                    String email, String phoneNumber) {
            this.name = name;
            this.birthDay = birthDay;
            this.birthMonth = birthMonth;
            this.birthYear = birthYear;
            this.email = email;
            this.phoneNumber = phoneNumber;

            calculateAge(); //Age determination when creating an account
            printAccountInfo();
        }

        private void calculateAge() {
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            this.age = currentYear - birthYear;
        }

        public void printAccountInfo() {
            System.out.println("\nname: " + name);
            System.out.println("surname: " + surname);
            System.out.println("date of birth: " + birthDay + "/" + birthMonth + "/" + birthYear);
            System.out.println("age: " + age);
            System.out.println("email: " + email);
            System.out.println("phone: " + phoneNumber);
            System.out.println("weight: " + weight + " kg");
            System.out.println("pressure: " + bloodPressure);
            System.out.println("The number of steps taken per day: " + stepsPerDay);
        }

        // Getter for the ages
        public int getAge() {
            return age;
        }

        // Setters
        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setBloodPressure(String bloodPressure) {
            this.bloodPressure = bloodPressure;
        }

        public void setStepsPerDay(int stepsPerDay) {
            this.stepsPerDay = stepsPerDay;
        }
    }

    public static void main(String[] args) {
        User userOne = new User("Tom", 15, 5, 1990, "tomtom90@gmail.com", "123456789");

        // Change of some fields and repeated display of information
        userOne.setSurname("Doe");
        userOne.setWeight(95.5);
        userOne.setBloodPressure("120/80");
        userOne.setStepsPerDay(10000);
        userOne.printAccountInfo();

        User userTwo = new User("Amanda", 20, 8, 1985, "amanda85@gmail.com", "987543210");

        // Change of some fields and repeated display of information
        userTwo.setWeight(70.5);
        userTwo.setBloodPressure("110/70");
        userTwo.setStepsPerDay(8000);
        userTwo.printAccountInfo();
    }
}
