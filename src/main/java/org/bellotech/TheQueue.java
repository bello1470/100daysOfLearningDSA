package org.bellotech;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class TheQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(2);
        queue.offer(4);
        queue.offer(67);
        queue.offer(32);
        queue.offer(44);
        queue.offer(67);
      /*  for (int i = 0; i<=queue.size(); i++){

            System.out.println(queue.poll());
        }*/

        while(!queue.isEmpty()){

            System.out.println(queue.poll());

            /*  //Queue

        // add = enqueue, offer()
        // remove = dequeue, poll()

   *//*     //queue is an interface cant be instatiate itself
        Queue<String> queue = new Queue<String>();*//*

        Queue<String> queue = new LinkedList<String>();

        //adding people to the queuue to complain to the manager

        queue.offer("keran");
        queue.offer("chad");
        queue.offer("steve");
        queue.offer("harold");
        //
       queue.poll();

        System.out.println(queue);*/

        }
    }
}
