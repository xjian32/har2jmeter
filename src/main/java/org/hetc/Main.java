package org.hetc;

import org.hetc.core.JmeterFileGenerater;
import org.hetc.utils.HarFileReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        if (args.length != 2) {
            logger.error("Usage: java -jar Har2Jmeter.jar <har file path> <jmx file path>");
            throw new RuntimeException();
        }
        try {
            String harFilePath = args[0];
            String jmxOutPutPath = args[1];

            // logger.info("harFilePath: {}", harFilePath);
            JmeterFileGenerater jmeterFileGenerater = new JmeterFileGenerater();
            jmeterFileGenerater.generateJmxFile(HarFileReader.readFile(harFilePath).getLog(), jmxOutPutPath);
            logger.info("JMX file generated successfully!");
        } catch (Exception e) {
            logger.error("Error occurred while generating JMX file!", e);
        }

    }
}