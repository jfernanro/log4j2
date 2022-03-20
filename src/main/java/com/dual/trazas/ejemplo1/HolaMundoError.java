package com.dual.trazas.ejemplo1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HolaMundoError
{

  private static final Logger logger = LogManager.getLogger(HolaMundoError.class);

  public static void main(String[] args)
  {

    try
    {
      logger.info("/**********************************************/");
      logger.info("/************* HOLA MUNDO ERROR  **************/");
      logger.info("/**********************************************/");

      System.out.println(getData());
    }
    catch(Exception e)
    {
      logger.error("{Excepcion capturada} " + e.getMessage());

    }

  }

  static int getData() throws Exception
  {
    throw new Exception("Error argumentos invalidos");
  }

}
