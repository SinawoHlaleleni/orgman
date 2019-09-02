package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {


    @Test
    public void buildUser() {
        String email = "sinawo@gmail.com";
        User user= UserFactory.buildUser(email,"Sinawo","Hlaleleni");

        System.out.println("User Email:"+ user.getUserEmail());
        assertEquals(email,user.getUserEmail());
    }
}