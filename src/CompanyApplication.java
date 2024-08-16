// CompanyApplication.java
/*
 * Student Number: [st10446180]
 * Application: CompanyApplication
 * Description: This application demonstrates the use of inheritance and method overriding.
 * It creates instances of ABCBooks and ChildrensBook classes and calls the displayAddress()
 * method to show the correct address for each company.
 */
public class CompanyApplication {
    public static void main(String[] args) {
        // Create an object of ABCBooks
        ABCBooks abcBooks = new ABCBooks();
        
        // Create an object of ChildrensBook
        ChildrensBook childrensBook = new ChildrensBook();
        
        // Display the address of ABC Books
        abcBooks.displayAddress();
        
        // Display the address of Children's Book (overrides parent method)
        childrensBook.displayAddress();
    }
}
