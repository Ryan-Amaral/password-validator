package com.example.amaral.csci3136a2;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class AppUiTest {

    private String badPass;
    private String okPass;
    private String goodPass;

    @Rule
    public ActivityTestRule<Validator> mActivityRule = new ActivityTestRule<>(
            Validator.class);

    @Before
    public void initPass() {
        badPass = "aaa";
        okPass = "AAA33333";
        goodPass = "Aa1@lasdjfW#RAWTgawew";
    }

    @Test
    public void validateBadPassword() throws Exception {
        // type text
        onView(withId(R.id.edt_txt_pass))
                .perform(typeText(badPass), closeSoftKeyboard());
        // press validate button
        onView(withId(R.id.btn_val))
                .perform(click());
        // check tests passed text
        onView(withId(R.id.txt_strength))
                .check(matches(withText("1")));
    }

    @Test
    public void validateOkPassword() throws Exception {
        // type text
        onView(withId(R.id.edt_txt_pass))
                .perform(typeText(okPass), closeSoftKeyboard());
        // press validate button
        onView(withId(R.id.btn_val))
                .perform(click());
        // check tests passed text
        onView(withId(R.id.txt_strength))
                .check(matches(withText("3")));
    }

    @Test
    public void validateGoodPassword() throws Exception {
        // type text
        onView(withId(R.id.edt_txt_pass))
                .perform(typeText(goodPass), closeSoftKeyboard());
        // press validate button
        onView(withId(R.id.btn_val))
                .perform(click());
        // check tests passed text
        onView(withId(R.id.txt_strength))
                .check(matches(withText("5")));
    }
}
