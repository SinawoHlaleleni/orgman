package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {


    @Test
    public void buildOrganisation() {
        Organisation organisation = OrganisationFactory.buildOrganisation("KineticSkunk IT Solutions");

        System.out.println("Organisation Name: "+organisation.getOrgName());
        assertEquals("KineticSkunk IT Solutions",organisation.getOrgName());
    }
}