package test;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.mockserver.configuration.Configuration;
import org.mockserver.integration.ClientAndServer;

public class MockServer implements BeforeEachCallback, AfterEachCallback {

    private ClientAndServer client;

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        teardown();
    }

    private void teardown() {
        client.stop();
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        client = ClientAndServer.startClientAndServer(Configuration.configuration(), 6000);
    }
}
