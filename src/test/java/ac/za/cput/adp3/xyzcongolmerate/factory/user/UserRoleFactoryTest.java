package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {
        UserRole userRole = UserRoleFactory.buildUserRole("12345","sinawo@gmail.com","SoftwareTester94");

        System.out.println("User_ID " +  userRole.getRoleId());
        assertEquals("SoftwareTester94",userRole.getRoleId());
    }
}