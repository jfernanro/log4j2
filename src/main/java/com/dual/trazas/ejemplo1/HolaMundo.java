package com.dual.trazas.ejemplo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HolaMundo
{


  private static final Logger logger = LoggerFactory.getLogger(HolaMundo.class);

  public static void main(String[] args)
  {
    logger.info("/********************************************/");
    logger.info("/**************** HOLA MUNDO ****************/");
    logger.info("/********************************************/");
    

    for(int i = 0;i <= 10000;i++)
    {
      // test rolling file
      logger.debug("Invocamos a getNumber() : {}",getNumber(i));

    }

    logger.info("/********************************************/");
    logger.info("/************* FIN HOLA MUNDO ***************/");
    logger.info("/********************************************/");

  }

  static int getNumber(int n)
  {
    logger.info("getNumber()");
    return n * 1;
  }

}
