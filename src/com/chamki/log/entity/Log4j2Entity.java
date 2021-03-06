package com.chamki.log.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class Log4j2Entity {
  private static final Logger logger = LogManager.getLogger(Log4j2Entity.class);
  
  public static boolean printTestString(){
     logger.entry();
     System.out.println("开始Log4j2");
     logger.error("Did it again");
     logger.info("结束Log4j2");
     //打印数据
     System.out.println("CONSOLE输出数据");
     logger.info("输出日志信息");
     return logger.exit(false);
     
  }
  
  public void print() {
	  logger.debug("This method is add, it is not useful.");
  }
}
