package com.fb.javathreadpool;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * 线程服务类
 *
 * @ProjectName: javaThreadPool
 * @Package: com.fb.javathreadpool
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/23 下午5:27
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class ThreadPoolService {

    /**
     * 最大线程数
     */
    private static final Integer THREAD_MAX = 10;

    /**
     * 最大任务数
     */
    private static final Integer WORK_MAX = 5;

    /**
     * 最大队列数
     */
    private static final Integer QUEUE_MAX = 10;

    /**
     * 工作队列
     */
    private static final ArrayBlockingQueue<Work> workQueue = new ArrayBlockingQueue<Work>(WORK_MAX);

    /**
     * 线程队列
     */
    private static final LinkedBlockingQueue<Runnable> jobs = new LinkedBlockingQueue<Runnable>(QUEUE_MAX);

    public void init() {
        for (int i = 0; i < THREAD_MAX; i++) {
            Work work = new Work();
            try {
                workQueue.put(work);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Thread thread = new Thread();
            thread.start();

            System.out.println("A new thread!");
        }
    }

    public class Work extends Thread {
        public volatile boolean running = true;

        @Override
        public void run() {
            while (running) {
                System.out.println("This is a " + Thread.currentThread().getName() + "!");
                Runnable job;

                synchronized (jobs) {

                }
            }

        }
    }





}
