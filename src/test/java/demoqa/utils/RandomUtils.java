package demoqa.utils;

import com.github.javafaker.Faker;


public class RandomUtils {

    public static Faker faker = new Faker();

    public static String getRandomGender() {
        String gender = faker.options().option("Male", "Female", "Other");

        return gender;
    }

    public static String getRandomSubject() {
        String subject = faker.options().option("Maths", "Arts", "Hindi", "Biology", "English");

        return subject;
    }

    public static String getRandomHobby() {
        String hobbie = faker.options().option("Sports", "Reading", "Music");

        return hobbie;
    }

    public static String getRandomState() {
        String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");

        return state;
    }

    public static String getRandomCity(String state) {
        String city;

        switch (state) {
            case "NCR":
                city = faker.options().option("Delhi", "Gurgaon", "Noida");
                return city;

            case "Uttar Pradesh":
                city = faker.options().option("Agra", "Lucknow", "Merrut");
                return city;

            case "Haryana":
                city = faker.options().option("Karnal", "Panipat");
                return city;

            case "Rajasthan":
                city = faker.options().option("Jaipur", "Jaiselmer");
                return city;
        }

        return "";

    }

    public static String getRandomFirstName() {
        return new Faker().name().firstName();
    }

    public static String getRandomLastName() {
        return new Faker().name().lastName();
    }

    public static String getRandomEmail() {
        return new Faker().internet().emailAddress();
    }

    public static String getRandomPhoneNumber() {
        return new Faker().phoneNumber().subscriberNumber(10);
    }

    public static String getRandomDayOfBirthday() {
        int dayOfBirth = faker.number().numberBetween(1, 31);

        if (dayOfBirth < 10) {
            return "0" + dayOfBirth;
        }

        else {
            return String.valueOf(dayOfBirth);
        }
    }

    public static String getRandomMonthOfBirthday() {
        return faker.options().option("January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December");
    }

    public static String getRandomYearOfBirthday() {
        return String.valueOf(faker.number().numberBetween(1900, 2100));
    }

    public static String getRandomAddress() {
        return new Faker().address().fullAddress();
    }

    public static String getRandomPicture() {
        return faker.options().option("cat.gif", "dog.png", "bird.jpg");
    }

}
