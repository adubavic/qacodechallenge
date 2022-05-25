package com.hostelworld.qacodechallenge

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    // This variable will be global for all the tests

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    // The first est is to verify if the main activity/screen is displayed

    @Test
    fun verifyMainScreenIsDisplayed() {
        onView(withId(R.id.layout_mainActivity))
            .check(matches(isDisplayed()))
    }

    // The second test is to verify that Test "QA Code Challenge" and the "CREATE ACCOUNT" button are displayed

    @Test
    fun verifyMainTextAndButton() {
        onView(withText("QA Code Challenge"))
            .check(matches(isDisplayed()))

        onView(withId(R.id.btnCreateAccount))
            .check(matches(isDisplayed()))
    }

    // The third test is to verify that a user can create an Account

    @Test
    fun test_Account_Creation() {

        onView(withId(R.id.btnCreateAccount))
            .perform(click())

        onView(withId(R.id.firstNameEt))
            .perform(typeText("Victor"))
        onView(withId(R.id.lastNameEt))
            .perform(typeText("Aduba"))
        onView(withId(R.id.emailEt))
            .perform(typeText("victor@gmail.com"))
        onView(withId(R.id.passwordEt))
            .perform(typeText("password123"))

        onView(withId(R.id.btnCreateAccount))
            .perform(click())

        /// Check to make sure that the user is brought back to main activity screen
        onView(withText("QA Code Challenge"))
            .check(matches(isDisplayed()))
    }

    /// The fourth test is to verify that a user can login

    @Test
    fun test_Login(){

        onView(withId(R.id.btnLogin))
            .perform(click())

        onView(withId(R.id.usernameEt))
            .perform(typeText("Victor"))
        onView(withId(R.id.passwordEt))
            .perform(typeText("password123"))
        onView(withId(R.id.btnLogin))
            .perform(click())

    }


}