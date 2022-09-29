import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ////////////// BOOK PRT ////////////////////
        System.out.println(".........Book Class.......");
        Book myBook = new Book("bangla", "Raisha", "1", "Grammer", 100);
        Book myBook2 = new Book("bangla2", "Raisha2", "12", "Grammer2", 102);
        Book myBook3 = new Book("bangla3", "Raisha3", "13", "Grammer3", 103);

        myBook.ShowBookInfo();
        myBook2.ShowBookInfo();
        myBook3.ShowBookInfo();

        Book book = new Book();
        book.AddBookCopy(myBook.getBookCopy() + myBook2.getBookCopy() + myBook3.getBookCopy());
        Book.showTotalBookInfo();

        ///////////////////// Contact//////////////////
        System.out.println("\n\n.......Contact Class........");
        Contact myContac = new Contact("shadhin", "2", 28,"01677234133",'M');
        Contact myContac2 = new Contact("shadhin2", "22", 22,"0173473984",'F');

        myContac.ShowPersonInfo();
        myContac.DetectMobileOperator();
        myContac2.ShowPersonInfo();
        myContac2.DetectMobileOperator();

        ///////////////////// Mobile//////////////////
        System.out.println("\n\n.......Mobile Class........");
        Mobile myMobile = new Mobile("Raisha","013987239",30,"Android",false );
        Mobile myMobile2 = new Mobile("Raisha22","01898723922",30,"IOS",true );

        myMobile.ShowInfo();
        myMobile.Recharge(20);
        myMobile.CallSomeone(4);

        myMobile.ShowInfo();
        myMobile.Recharge(20);
        myMobile.CallSomeone(4);

        myMobile2.ShowInfo();
        myMobile2.Recharge(20);
        myMobile2.CallSomeone(4);

    }
}