import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.example.testerdemo.Calculator;

public class MyFirstTest {
    
    private Calculator calc;


    @BeforeEach
    void setUp(){
        calc = new Calculator();
    }

    @Test
    void testAdd1(){
        assertEquals(10, calc.add(2, 8));
    }
    @Test
    void testAdd2(){
        assertNotEquals(13, calc.add(2, 8));
    }

    @Test
    void testSub(){
        assertEquals(-6, calc.sub(2, 8));
    }

    @Test
    void testDiv(){
        assertThrows(ArithmeticException.class,()-> calc.div(1,0));
    }

    @Test
    void testMul(){
        assertTrue(calc.prod(2,4)==8);
 
    }
}
