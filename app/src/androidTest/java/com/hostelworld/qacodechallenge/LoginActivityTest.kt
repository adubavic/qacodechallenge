package com.hostelworld.qacodechallenge

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class LoginActivityTest{

    // This variable will be global for all the tests

    @get:Rule
    var activityScenarioRule = activityScenarioRule<LoginActivity>()

    /// The fourth test is to verify that a user can login

    @Test
    fun test_Login(){

        onView(withId(R.id.usernameEt))
            .perform(ViewActions.typeText("Victor"))
        onView(withId(R.id.passwordEt))
            .perform(ViewActions.typeText("password123"))
        onView(withId(R.id.btnLogin))
            .perform(ViewActions.click())

        //onView(withId(R.id.user_detail_view))
        //    .check(matches(withText(R.id.greetingTv)))





    }

}