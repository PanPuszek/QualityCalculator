package pl.edu.agh.qualitycalculator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.fail;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void testSum() {
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("4.0 plus 4.0 gives value 8.0")));
    }

    @Test
    public void testSubtract() {
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum)).perform(click()).perform(typeText("16"));
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnSub)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("16.0 minus 4.0 gives value 12.0")));
    }

    @Test
    public void testMultiply() {
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("3"));
        onView(withId(R.id.btnMult)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("4.0 multiplied by 3.0 gives value 12.0")));
    }

    @Test
    public void testDivide() {
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum)).perform(click()).perform(typeText("27"));
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("3"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("27.0 divided by 3.0 gives value 9.0")));
    }

    @Test
    public void testAverage() {
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum)).perform(click()).perform(typeText("0"));
        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("5"));
        onView(withId(R.id.etNum2)).perform(click()).perform(clearText());
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnAvg)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("0.0 , 5.0 and 4.0 averaged gives value 3.0")));
    }

}

