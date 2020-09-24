package com.example.photolab2;

import android.app.Activity;
import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

// Espresso imports
import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.Espresso.onView;

@RunWith(AndroidJUnit4.class)
public class SearchTest {

    @Rule
    public final ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule<>(MainActivity.class, false, true);

//    @Test
//    public void searchByTime() {
//        // Context of the app under test.
//        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
//        assertEquals("com.example.photolab2", appContext.getPackageName());
//
//        onView(withId(R.id.btnSearch)).perform(click());
//        onView(withId(R.id.etFromDateTime)).perform(typeText(""), closeSoftKeyboard());
//        onView(withId(R.id.etToDateTime)).perform(typeText(""), closeSoftKeyboard());
//        onView(withId(R.id.etKeywords)).perform(typeText("caption"), closeSoftKeyboard());
//        onView(withId(R.id.go)).perform(click());
//        onView(withId(R.id.etCaption)).check(matches(withText("caption")));
//        onView(withId(R.id.btnRight)).perform(click());
//        onView(withId(R.id.btnLeft)).perform(click());
//    }

    @Test
    public void testing() {
        onView(withId(R.id.button_next)).perform(click());
        onView(withId(R.id.button_prev)).perform(click());
        System.out.println("test");
    }
}

