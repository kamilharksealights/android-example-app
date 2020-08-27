package io.sealights.android.example;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.rule.ServiceTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeoutException;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ChangeTextBehaviorTest {
//
//    @Rule
//    public ActivityTestRule<ItemListActivity> activityRule = new ActivityTestRule<>(ItemListActivity.class);

    @Rule
    public final ServiceTestRule serviceRule = new ServiceTestRule();


//    @Test
//    public void changeText_sameActivity() throws InterruptedException {
//        onView(withId(R.id.fab)).perform(click());
//    }

    @Test
    public void changeText_intentService() throws InterruptedException, TimeoutException {
        MyIntentService.startActionBaz(ApplicationProvider.getApplicationContext(), "1", "2");
    }

    @Test
    public void changeText_boundService() throws InterruptedException, TimeoutException {
        Intent serviceIntent = new Intent(ApplicationProvider.getApplicationContext(), MyBindService.class);

        IBinder binder = serviceRule.bindService(serviceIntent);

        MyBindService service = ((MyBindService.MyBinder) binder).getService();

        service.doIt();
    }

}
