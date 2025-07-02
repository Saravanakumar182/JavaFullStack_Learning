import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.paratest.EvenChecker;

public class EvenCheckerTest {
    
    EvenChecker isEvenChecker;

    @BeforeEach
    void setUp(){
        isEvenChecker = new EvenChecker();
    }

    @ParameterizedTest
    @ValueSource(ints = {2,4,8,23456,156})
    void checkEven(int n){
        assertTrue(isEvenChecker.isEven(n), n+"Should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,123,45,7,-1})
    void checkNotEven(int n){
        assertFalse(isEvenChecker.isEven(n), n+"Should not be even");
    }



    
}
