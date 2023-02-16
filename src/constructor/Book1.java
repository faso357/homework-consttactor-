package constructor;

public class Book1 {
   /*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed*/
   static Book example1;
        static Book example2;
        String title;
        int pages;
        Book1(String nametitle) {
            this.title =nametitle;}
        Book1(int bpages){
            this.pages=bpages;}

        void bookdisplayinfo(){
            System.out.println("Tittle is "+example1.title+" and pages are  "+example2.pages);
        }
        public static void main(String[] args) {
            example1 = new Book("Egypt is great ");
            example2 = new Book(100);
            example1.bookdisplayinfo();

        }

    }



