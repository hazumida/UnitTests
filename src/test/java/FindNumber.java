import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FindNumber {

    PhoneBook phoneBook;

    @BeforeAll
    public static void beforeAllMethod() {

    }


    @BeforeEach
    public void beforeEachMethod() {
        phoneBook = new PhoneBook();
        Contact user1 = new Contact("user1", "+791919191911");
        Contact user2 = new Contact("user2", "8903903903903");
        Contact user3 = new Contact("user3", "8501501501501");
        Contact user4 = new Contact("user4", "+7937937937937");

        phoneBook.addGroup("group1");
        phoneBook.addGroup("group2");
        phoneBook.addGroup("group3");

        phoneBook.addContactInGroup("group1", user1);
        phoneBook.addContactInGroup("group3", user1);
        phoneBook.addContactInGroup("group2", user2);
        phoneBook.addContactInGroup("group1", user2);
        phoneBook.addContactInGroup("group3", user3);
        phoneBook.addContactInGroup("group2", user3);
        phoneBook.addContactInGroup("group1", user4);
        phoneBook.addContactInGroup("group2", user4);
    }

    @AfterEach
    public void afterEachMethod() {

    }

    @AfterAll
    public static void afterAllMethod() {

    }

    @Test
    public void testConcat1() {
        // given:
        String number = "8501501501501";
        String expected = "user3";

        // when:
        String result = phoneBook.getContactOnNumber(number);

        // then:
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testConcat2() {
        // given:
        String number = "+7937937937937";
        String expected = "user4";

        // when:
        String result = phoneBook.getContactOnNumber(number);

        // then:
        Assertions.assertEquals(result, expected);
    }

    @ParameterizedTest
    @MethodSource("testSource")
    public void testContact3(String number){
        String result = phoneBook.getContactOnNumber(number);
        Assertions.assertEquals(result, "Номер телефона не найден");
    }

    private static Stream<Arguments> testSource() {
        return Stream.of(
                Arguments.of("+79398554861"),
                Arguments.of("89999999955"),
                Arguments.of("745820")
        );
    }


}
