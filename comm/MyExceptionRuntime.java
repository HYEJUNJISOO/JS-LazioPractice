package com.boot.sailing.comm;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MyExceptionRuntime extends RuntimeException {

    //에러만 받는 생성자
    public MyExceptionRuntime(String s){
        super("My Exception 처리 =>"+s);
    }

    //에러와 에러의 경위까지 받는 생성자
    public MyExceptionRuntime(String s,String sClass){
        super("My Exception 처리 => [[ "+s+"]]");
        log.info("MyException Class 오류발생 =>"+sClass);
    }
}
