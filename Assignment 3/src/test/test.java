package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Model.LinkedQueue;
import Model.PriorityQueue;

class test {

	@Test
	void testLinkedEnqueue() {
		
		LinkedQueue<String> lq = new LinkedQueue<String>();
		
		String test = "t1";
		String test2 = "t2";
		
		lq.enqueue(test);
		lq.enqueue(test2);

		assertEquals(test + test2, lq.dequeue() + lq.dequeue());
	}
	
	@Test
	void testLinkedDequeue() {
		
		LinkedQueue<String> lq = new LinkedQueue<String>();
		
		String test = "t1";
		String first = "f1";
		
		lq.enqueue(first);
		lq.enqueue(test);
		lq.enqueue(test);
		lq.enqueue(test);
			
		assertEquals(first, lq.dequeue());	
	}
	
	@Test
	void testLinkedGetSize() {
		
		LinkedQueue<String> lq = new LinkedQueue<String>();
		
		String test = "t1";
		int size = 5;
		
		lq.enqueue(test);
		lq.enqueue(test);
		lq.enqueue(test);
		lq.enqueue(test);
		lq.enqueue(test);
		
		assertEquals(size, lq.getSize());	
	}
	
	@Test
	void testLinkedPeek() {
		
		LinkedQueue<String> lq = new LinkedQueue<String>();
		
		String test = "t1";
		String first = "f1";
		
		lq.enqueue(first);
		lq.enqueue(test);
		lq.enqueue(test);
		lq.enqueue(test);
		
		assertEquals(first, lq.peek());	
	}
	
	
	@Test
	void testPriorityEnqueue() {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		String test = "a";
		String test2 = "b";
		String test3 = "c";
		
		pq.enqueue(test3);
		pq.enqueue(test2);
		pq.enqueue(test);
		
		assertEquals(test + test2 + test3, pq.dequeue() + pq.dequeue() + pq.dequeue());
	}
	
	@Test
	void testPriorityDequeue() {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		String test = "a";
		String test2 = "b";
		String test3 = "c";
		
		pq.enqueue(test3);
		pq.enqueue(test2);
		pq.enqueue(test);
			
		assertEquals(test, pq.dequeue());	
	}
	
	@Test
	void testPriorityGetSize() {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		String test = "t1";
		int size = 5;
		
		pq.enqueue(test);
		pq.enqueue(test);
		pq.enqueue(test);
		pq.enqueue(test);
		pq.enqueue(test);
		
		assertEquals(size, pq.getSize());
	}
	
	@Test
	void testPriorityPeek() {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		String test = "a";
		String test2 = "b";
		String test3 = "c";
		
		pq.enqueue(test3);
		pq.enqueue(test2);
		pq.enqueue(test);
		
		assertEquals(test, pq.peek());	
	}

}
