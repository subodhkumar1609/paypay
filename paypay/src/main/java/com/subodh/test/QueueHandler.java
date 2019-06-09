package com.subodh.test;

public class QueueHandler<T> implements Queue<T>
{

	private QueueHandler<T> q ;
	private T[] queue;
	private int start, end = -1;
	private int queueSize, size = 0;
	
	public QueueHandler(int queueSize)
	{
		this.queueSize = queueSize;
		queue = (T[]) new Object[queueSize];
	}

	public void push(T t) 
	{
		end ++;
		size ++;
		queue[end] = t;
	}
	
	public void pop() 
	{
		start ++;
		size --;
	}
	
	
	@Override
	public Queue<T> enQueue(T t) throws Exception
	{
		if(size + 1 > queueSize)
			throw new Exception("Index out of bound");
		
		if(end+1 >= queueSize)
		{
			end = -1;
		}	
		
		push(t);
		
		QueueHandler<T> q = new QueueHandler<T>(queueSize);
		for(int i=start; i < end ; i++)
		{
			q.push(queue[i]);
		}
		
		return q;
	}

	@Override
	public Queue<T> deQueue()
	{
//		Cyclic not required as this will return immutable queue
//		if(start+1 >= queueSize)
//		{
//			start = -1;
//		}
		
		
		QueueHandler<T> q = new QueueHandler<T>(queueSize);
		for(int i=start+1; i < end ; i++)
		{
			q.push(queue[i]);
		}
		
		return q;
	}

	@Override
	public T head()
	{
		return queue[start];
	}

	@Override
	public boolean isEmpty()
	{
		return start == end;
	}

}
