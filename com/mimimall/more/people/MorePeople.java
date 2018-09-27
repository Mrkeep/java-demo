//package com.mimimall.more.people;
//
///**
// * 目标：编写一段代码，模拟并发请求为20，且总的请求数为1000，当1000个请求完成后，打印“请求完成”
// */
//
//import java.util.concurrent.*;
//
//
//
//public class TestConcurrentRequest {
//    // 总的请求个数
//    public static final int requestTotal = 1000;
//
//
//    // 同一时刻最大的并发线程的个数
//    public static final int concurrentThreadNum = 20;
//
//    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        CountDownLatch countDownLatch = new CountDownLatch(requestTotal);
//        Semaphore semaphore = new Semaphore(concurrentThreadNum);
//        for (int i = 0; i< requestTotal; i++) {
//            executorService.execute(()->{
//                try {
//                    semaphore.acquire();
//                    String result = testRequestUri();
//                    semaphore.release();
//                } catch (Exception e) {
//                    System.out.println("错误");
//                    e
//                }
//                countDownLatch.countDown();
//            });
//        }
//        countDownLatch.await();
//        executorService.shutdown();
//
//    }
//
//    private static String testRequestUri() {
//        return HttpClientUtil.doGet("Http://http://192.168.1.62:86/mimimall-api-mimimall-1.0.0/order/createOrder");
//    }
//}
//
