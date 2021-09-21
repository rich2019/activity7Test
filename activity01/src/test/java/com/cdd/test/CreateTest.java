package com.cdd.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;

public class CreateTest {

    @Test
    public void testCreateTable() {
        //需要使用avtiviti提供的工具类 ProcessEngines ,使用方法getDefaultProcessEngine
        //getDefaultProcessEngine会默认从resources下读取名字为actviti.cfg.xml的文件
        //创建processEngine时，就会创建mysql的表
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        System.out.println(defaultProcessEngine);
    }
}
