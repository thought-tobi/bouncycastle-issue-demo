package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

public class SampleTest {

    @RegisterExtension
    private MockServer mockServer = new MockServer();

    @Test
    public void ok() {
        assert true;
    }
}
