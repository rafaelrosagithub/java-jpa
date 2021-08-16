package org.example.junit;

import org.junit.*;

public class LearningJUnitTest {

    @BeforeClass
    public static void iniciarTests() {
        System.out.println(">>> iniciarTests()");
    }

    @AfterClass
    public static void encerrarTests() {
        System.out.println(">>> encerrarTests()");
    }

    @Before
    public void iniciarTest() {
        System.out.println(">>> iniciarTest()");
    }

    @After
    public void encerrarTest() {
        System.out.println(">>> encerrarTest()");
    }

    @Test
    public void testandoAlgo() {
        System.out.println(">>> public void testandoAlgo()");
        String nome = String.format("%s", "Alexandre");

        Assert.assertEquals("Alexandre", nome);
    }

    @Test
    public void testandoOutraCoisa() {
        System.out.println(">>> public void testandoOutraCoisa()");

        String str = String.format("%s", "");

        Assert.assertTrue(str.isEmpty());
    }

}
