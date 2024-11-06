
package utils;
import Pages.DashboardPage;
import Pages.LoginPage;
//import pages.*;

public class PageInitializers {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static LoginPage usernameField;
    public static LoginPage passwordField;


    public static void initializePageObjects(){
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();




    }

}