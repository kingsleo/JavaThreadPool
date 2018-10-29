package com.fb.javathreadpool;


import org.junit.Test;

/**
 * java类简单作用描述
 *
 * @ProjectName: javaThreadPool
 * @Package: com.fb.javathreadpool
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/10/29 11:22 AM
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class ThreadPoolServiceTest {

    @Test
    public void executeTest() {
        ThreadPoolService threadPoolService = new ThreadPoolService();
        threadPoolService.init(0);

        for (int i = 0; i < 100; i++) {
            Double random = Math.random();
            threadPoolService.execute(new Task(random.toString()));
        }
    }


}
