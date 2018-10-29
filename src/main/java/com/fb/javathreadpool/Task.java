package com.fb.javathreadpool;

/**
 * java类简单作用描述
 *
 * @ProjectName: javaThreadPool
 * @Package: com.fb.javathreadpool
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/10/29 11:38 AM
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class Task implements Runnable {

    private String taskName = "default";

    Task(String name) {
        taskName = name;
    }

    public void run() {
        System.out.println("I am a new task " + taskName + "\n");
    }
}
