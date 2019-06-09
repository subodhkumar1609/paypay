package paypay;

import com.subodh.test.Queue;
import com.subodh.test.QueueHandler;

public class Tester
{

	public static void main(String[] args) throws Exception
	{
		Queue<String> q = new QueueHandler<String>(4);
		q.enQueue("A");
		q.enQueue("B");
		q.enQueue("C");
		
		q.enQueue("D");
		q.deQueue();
		Queue<String> g = q.deQueue();
//		q.deQueue();
//		q.deQueue();
//		q.enQueue("E");
//		q.enQueue("F");
//		q.deQueue();
		//q.deQueue();
		
		System.out.println(q.head());
		System.out.println(g.head());
		System.out.println(q.isEmpty());
	}
}

