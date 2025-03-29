package Challenges;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/*
  	Q : Create a PriorityQueue of a custom class Student with attributes name and grade. Use a comparator to order by grade.
*/
class PriorityQueueSorting {
	
	public static void main(String args []) {
		// used comparator constructor of priority queue to define priority queue.
		PriorityQueue <Student> queue = new PriorityQueue<>(new java.util.Comparator <Student>() {
			public int compare(Student s1, Student s2) {				
				return s1.getGrade()-s2.getGrade();
			}
		});
		
		queue.offer(new Student("Kunal", 'E'));
		queue.offer(new Student("Pruthvi", 'C'));
		queue.offer(new Student("Akanksha", 'B'));
		queue.offer(new Student("Ayesha", 'D'));
		queue.offer(new Student("Hanumant", 'A'));
		queue.offer(new Student("Ganesh", 'A'));
		
		
		// it will follow insertion order..
		System.out.println(queue);
		
		// it will remove element on basis of priority.
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
	}
	
	
		private static class Student {
			private final String name;
			private final char grade;
			
			public Student(String name, char grade) {
				super();
				this.name = name;
				this.grade = grade;
			}

			@Override
			public String toString() {
				return name + " : " + grade + " ";
			}

			public String getName() {
				return name;
			}

			public char getGrade() {
				return grade;
			}
		}


}

