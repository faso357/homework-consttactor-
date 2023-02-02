public class Book {
   /*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed*/
   String title;
   int pages;
    Book(String nametitle) {
       title =nametitle;}
    Book(int bpages){
        pages=bpages;}
    void bookdisplayinfo(){
        System.out.println("Tittle is "+title);}
    void bookdisplayinfo2(){
        System.out.println("Book pages are "+pages);
    }
    public static void main(String[] args) {
        Book example1 = new Book("Egypt is great ");
        Book example2 = new Book(100);
        example1.bookdisplayinfo();
        example2.bookdisplayinfo2();

    }

    }

