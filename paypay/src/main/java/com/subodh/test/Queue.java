package com.subodh.test;

public interface Queue<T>
{
	public Queue<T> enQueue(T t) throws Exception;
    //Removes the element at the beginning of the immutable queue, and returns the new queue.
    public Queue<T> deQueue();
    public T head();
    public boolean isEmpty();
}
