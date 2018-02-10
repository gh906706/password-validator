package com.example.ghadikashgari.validator_a2;

/**
 * Created by GhadiKashgari on 2018-02-10.
 */

import  org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import android.support.test.rule.ActivityTestRule;

public class ValidatorEspressoTest{
    private String password;
    @Rule
    ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void validPassword() {
        password = "Strong-password123";
    }

    @Test
    public void TxtCheck() {
        onView(withId(R.id.editTextUserInput))
                .perform(typeText(password), closeSoftKeyboard());
        onView(withId(R.id.changeTextBt)).perform(click());

        onView(withId(R.id.textToBeChanged))
                .check(matches(withText(password)));
    }
}
}