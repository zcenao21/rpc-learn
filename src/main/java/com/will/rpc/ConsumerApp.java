package com.will.rpc;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsumerApp {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorRemoteImpl();
        int result = calculator.add(6, 2);
        log.info("get sum:"+result);
    }
}
