package demoqa.tests;

import static demoqa.utils.RandomUtils.*;

public class TestData {
    public static String firstName = getRandomFirstName(),
            lastName = getRandomLastName(),
            email = getRandomEmail(),
            gender = getRandomGender(),
            phoneNumber = getRandomPhoneNumber(),
            birthMonth = getRandomMonthOfBirthday(),
            birthYear = getRandomYearOfBirthday(),
            birthDay = getRandomDayOfBirthday(),
            subject = getRandomSubject(),
            hobby = getRandomHobby(),
            pictureName = getRandomPicture(),
            picturePath = "images/" + pictureName,
            address = getRandomAddress(),
            state = getRandomState(),
            city = getRandomCity(state);
}
