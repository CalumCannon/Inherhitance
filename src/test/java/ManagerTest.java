import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Calum", "HU999777", 20000, "Computing");
    }

    @Test
    public void testGetDepartment() {
        assertEquals("Computing", manager.getDeptName());
    }

    @Test
    public void testRaiseSalary() {
        manager.raiseSalary(100);
        assertEquals(20100, manager.getSalary(), 0.1);
    }

    @Test
    public void testPayBonus() {
        assertEquals(200, manager.payBonus(), 0.1);
    }
}
