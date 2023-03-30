package samseptiano.example.stopwatchapp

import android.view.View
import android.widget.ImageView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import junit.framework.TestCase
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.Description
import org.junit.runner.RunWith
import java.util.regex.Matcher

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest : TestCase(){

	@get:Rule
	val activityRule = ActivityScenarioRule(MainActivity::class.java)

	@Test
	fun fab_is_clicked(){
		onView(withId(R.id.button))
			.perform(click())
		onView(withId(R.id.timer))
			.check(matches(isDisplayed()))
		onView(withId(R.id.imageView))
			.check(matches(isDisplayed()))
	}

}
