package behaviorial.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private final List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }
    public String pop() {
        urls.remove(urls.get(urls.size()-1));
        return "removed";
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public static class ListIterator implements Iterator {
        private final BrowseHistory history;
        private int index = 0;

        public ListIterator(BrowseHistory history){
            this.history = history;
        }
        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
