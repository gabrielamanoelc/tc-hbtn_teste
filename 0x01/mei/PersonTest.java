import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void setup(){
        person = new Person(
                "Paul",
                24,
                "McCartney",
                new Date(),
                true,
                true,
                true,
                1200);
    }


    @Test
    public void show_full_name(){
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    public void test_calculateYearlySalary(){
        assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    public void person_is_not_MEI(){
        Assertions.assertFalse(person.isMEI());
    }

    @Test
    public void person_is_MEI(){

        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);

        Assertions.assertTrue(person.isMEI());
    }
}
