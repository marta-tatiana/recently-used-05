import org.mockito.Mockito;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class RecentlyUsedList {

    Deque<String> stack;

    public RecentlyUsedList() {
        stack = new ArrayDeque<>();
    }

    public void add(String s) {
        stack.remove(s);
        stack.add(s);
    }

    public String leastRecentlyUsed() {
        return stack.peekFirst();
    }

    public String mostRecentlyUsed() {
        return stack.peekLast();
    }

    public String get(int i) {
        return stack.toArray(new String[]{})[stack.size() - 1 - i];
    }

    public int size() {
        return stack.size();
    }
}
