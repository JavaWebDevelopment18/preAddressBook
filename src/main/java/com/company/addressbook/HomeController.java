package com.company.addressbook;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.ArrayList;



@Component
public class HomeController implements CommandLineRunner{


    public void makeBook() {
        ArrayList<Entry> addressBook = new ArrayList<>(5);
        String firstNames= "";

        addressBook.add(new Entry("Anna", "Banana", "123 Road, City, State, Zip", "email@comcast.com", "240-222-3333"));
        addressBook.add(new Entry("Brian", "Cana", "456 Ave, City, State, Zip", "email@apple.com", "111-222-3333"));
        addressBook.add(new Entry("Connor", "Doe", "562 Ave, City, State, Zip", "email@gmail.com", "301-245-3333"));
        addressBook.add(new Entry("David", "Esjdfk", "127 Ave, City, State, Zip", "email@gmail.com", "201-212-3333"));
        addressBook.add(new Entry("Elizabeth", "Smith", "396 Ave, City, State, Zip", "email@yahoo.com", "511-222-1414"));

        for (Entry e : addressBook){
            firstNames += e.getFirstName() + " ";
        }
        System.out.println(firstNames);
    }

    @Override
    public void run(String... strings) {
        makeBook();
    }
}


