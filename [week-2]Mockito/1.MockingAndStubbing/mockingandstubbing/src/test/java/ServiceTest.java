
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mockdemo.ExternalApi;
import com.mockdemo.ServiceDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ServiceTest {
    @Mock
    ExternalApi externalApi;

    @InjectMocks
    ServiceDemo myService;

    @Test
    void testFetchDataFromExternalApi() {

        when(externalApi.fetchData("api/endpoint")).thenReturn("Mocked Response");

        
        String result = myService.fetchData("api/endpoint");
        assertEquals("Mocked Response", result);
    }
}