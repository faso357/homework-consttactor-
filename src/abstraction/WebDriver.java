package abstraction;
//Create a WebDriver Interface that will have the following unimplemented behaviour:
// openBrowser(), closeBrowser(), maximizeWindow(), findElement().
// Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
  interface WebDriver {
    void OpenBrowser();
   void CloseBrowser();
    void MaximizeWindow();
     void FindElement();


}
class ChromeDriver implements WebDriver{
    @Override
    public void OpenBrowser() {

    }

    @Override
    public void CloseBrowser() {

    }

    @Override
    public void MaximizeWindow() {

    }

    @Override
    public void FindElement() {

    }
}
class FirefoxDriver implements WebDriver{
    @Override
    public void OpenBrowser() {

    }

    @Override
    public void CloseBrowser() {

    }

    @Override
    public void MaximizeWindow() {

    }

    @Override
    public void FindElement() {

    }
}