public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LoginPage loginPage=new LoginPage();
        loginPage.login("standard_user", "secret_sauce");

        IventoryPage iventory=new IventoryPage();
        iventory.checkLogin();
        iventory.logout();
        loginPage.afterLogout();
    }
}
