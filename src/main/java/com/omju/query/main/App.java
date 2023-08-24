package com.omju.query.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        LOGGER.info("Info App!");
        LOGGER.debug("Debug App!");
        LOGGER.warn("Warn App!");
        LOGGER.error("Error App!");
    }
}