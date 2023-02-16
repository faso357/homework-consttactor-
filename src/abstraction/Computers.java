package abstraction;
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and
// override some methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array.
// Loop through each object and execute available methods

public class Computers {
int storage;
int ScreenSize;
void PlayingMusic(){
    System.out.println("play music");

    }
    void InternetConnection(){
        System.out.println("connect internet");
    }
}
class Apple extends Computers{
    @Override
    void PlayingMusic() {
        System.out.println("itune");
    }
    void SendMessage(){
        System.out.println("Imessage");
    }
}
class Lenovo extends Computers{
    @Override
    void InternetConnection() {
        System.out.println("Chrome ");
    }
    void WatchMovies(){
        System.out.println("Using Youtube");
    }
}
class HP extends Computers{
    @Override
    void PlayingMusic() {
        System.out.println("using windows player");
    }
    void DownloadFile(){
        System.out.println("download file");
    }
}
class Dell extends Computers{
    @Override
    void InternetConnection() {
        System.out.println("connect to browser");
    }
    void InstallApp(){
        System.out.println("Using windows store ");
    }

    public static void main(String[] args) {
        Computers [] computers={new Apple(),new Lenovo(),new HP(),new Dell()};
        for (int i = 0; i < computers.length; i++) {
            computers[i].InternetConnection();
            computers[i].PlayingMusic();
        }
    }
}