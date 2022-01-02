package com.mkyong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

  // private static final Logger logger = LogManager.getLogger(HelloWorld.class);
  private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {

        logger.debug("Hello from Log4j 2");

        // in old days, we need to check the log level log to increase performance
        /*if (logger.isDebugEnabled()) {
            logger.debug("{}", getNumber());
        }*/

        // with Java 8, we can do this, no need to check the log level

        for(int i = 0;i <= 10000000;i++)
        {
          // test rolling file
          logger.debug("Invocamos a getNumber() : {}",getNumber(i));

        }

    }

      static int getNumber(int n)
      {
        return n * 1;
    }

}
