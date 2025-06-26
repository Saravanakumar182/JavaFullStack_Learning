import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
    @ValueSource(ints = {1,3,2,7,-1,8,156})
    void checkEven(int n){
        assertTrue(isEvenChecker.isEven(n), n+"Should be even");
    }
    
}
