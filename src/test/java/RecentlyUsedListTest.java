import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RecentlyUsedListTest {


    private RecentlyUsedList list;

    @Before public void
    setup() {
        list = new RecentlyUsedList();
    }


    @Test public void
    should_hold_recently_used_string() {
        list.add("test");
        assertThat(list.mostRecentlyUsed(), equalTo("test"));
        assertThat(list.leastRecentlyUsed(), equalTo("test"));
    }

    @Test public void
    should_hold_strings_in_right_order() {
        list.add("1");
        list.add("2");
        list.add("3");
        assertThat(list.mostRecentlyUsed(), equalTo("3"));
        assertThat(list.leastRecentlyUsed(), equalTo("1"));
    }

    @Test public void
    should_expose_items_by_index() {
        list.add("cos");
        list.add("nicosc");
        assertThat(list.get(0), equalTo("nicosc"));
        assertThat(list.get(1), equalTo("cos"));
    }

    @Test public void
    should_overwrite_same_items() {
        list.add("cos");
        list.add("cos");
        assertThat(list.size(), is(1));
    }

    @Test public void
    should_be_empty_on_start() {
        assertThat(list.size(), is(0));
    }

}
