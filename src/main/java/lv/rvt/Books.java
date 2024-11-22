package lv.rvt;

import java.util.ArrayList;
import java.util.List;

public class Books
{
    private String title;
    private int pages;
    private int year;

    public Books(String initialTitle, int initialPage, int initialyear) {
        this.title = initialTitle;
        this.pages = initialPage;
        this.year = initialyear;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int getYear() {
        return this.year;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + "pages, " + this.year;
    }
}

