package edu.nyu.cs9053.homework10;

public interface CustomThreadPool {

    void submit(Runnable runnable);

    void stop();

}
