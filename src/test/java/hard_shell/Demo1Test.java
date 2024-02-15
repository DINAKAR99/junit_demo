package hard_shell;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hard_shell.core_files.Demo_1;

@DisplayName(value = "THE BIG TESTER")
public class Demo1Test {
    @BeforeAll
    static void starter() {

        System.out.println("the core protector front master");
    }

    @AfterAll
    static void ender() {

        System.out.println("the core protector back master");
    }

    @BeforeEach
    public void starter_each() {

        System.out.println("the core protector front_each master");
    }

    @AfterEach
    public void ender_each() {

        System.out.println("the core protector back_each master");
    }

    @Test
    @DisplayName(value = "THE 1ST")

    void tester1() {

        Demo_1 d1 = new Demo_1();
        int summ = d1.summ(11, 100);
        System.out.println("in the testing function");

        assertEquals(111, summ);
    }

}
