package dev.console;

import dev.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LOG.info("Bonjour Slf4J !");
        LOG.info("Implementation Logback");
        AppService aS = new AppService();
        aS.executer("null");
    }
}
