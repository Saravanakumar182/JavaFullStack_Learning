                 
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mockdemo.ExternalApi;
import com.mockdemo.ServiceDemo;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ServiceTestDemo {
    @Mock
    ExternalApi externalApi;

    @InjectMocks
    ServiceDemo myService;

    @Test
    void testVerifyInteraction() {
        myService.processData();

        verify(externalApi).fetchData("/users/data");
    }
}