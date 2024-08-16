// ChildrensBook.java
/*
 * Student Number: [st10446180]
 * Class: ChildrensBook
 * Description: This is the child class representing the Children's Book subsidiary.
 * It overrides the displayAddress() method to show the specific address for Children's Book.
 */
public class ChildrensBook extends ABCBooks {
    // Overridden method to display the address of Children's Book
    @Override
    public void displayAddress() {
        System.out.println("Children's Book Address: 456 Elm Street, Storyville, SV 12345");
    }
}
