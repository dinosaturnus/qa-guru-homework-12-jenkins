package demoqa.tests;

import demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static demoqa.tests.TestData.*;
import static io.qameta.allure.Allure.step;

public class RegistrationPracticeFormTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @DisplayName("Successful registration form test")
    void fullFormTest() {
        step("Open form", () -> {
            registrationPage.openPage();
        });
        step("Fill form", () -> {
            registrationPage.closedBanners()
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .setUserEmail(email)
                    .setGender(gender)
                    .setPhoneNumber(phoneNumber)
                    .setBirthDate(birthYear, birthMonth, birthDay)
                    .setSubject(subject)
                    .setHobby(hobby)
                    .uploadPicture(picturePath)
                    .setAddress(address)
                    .setState(state)
                    .setCity(city)
                    .clickSubmitButton();
        });
        step("Verify results", () -> {
            registrationPage.verifyRegistrationsModalAppears()
                    .verifyResults("Student Name", firstName + " " + lastName)
                    .verifyResults("Student Email", email)
                    .verifyResults("Gender", gender)
                    .verifyResults("Mobile", phoneNumber)
                    .verifyResults("Date of Birth", birthDay + " " + birthMonth + "," + birthYear)
                    .verifyResults("Subjects", subject)
                    .verifyResults("Hobbies", hobby)
                    .verifyResults("Picture", pictureName)
                    .verifyResults("Address", address)
                    .verifyResults("State and City", state + " " + city);
        });
    }
}
