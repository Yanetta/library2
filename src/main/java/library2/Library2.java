package library2;

import java.util.HashMap;

public class Library2 {
    public Library2(){
    }
    public void getFinishedBooks (HashMap<String, Boolean> lib){
        if (lib.size() < 1) {
            System.out.println("HashMap is empty");
        }
        else {
            for (String book : lib.keySet()) {
                if (lib.get(book) == true) {
                    System.out.println(book);
                }
            }
        }
    }
    public static void main(String[] args) {
        HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
        myBooks.put("Road Down The Funnel", true);
        myBooks.put("Rat: A Biology", false);
        myBooks.put("TimeIn", true);
        myBooks.put("3D Food Printing", false);
        Library2 myLibrary = new Library2();
        myLibrary.getFinishedBooks(myBooks);
        System.out.println("good books");
        }
}

