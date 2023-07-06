% Array

# array declaration
* elements of array have default values. 0 for numeric types, false for boolean, '\u0000', null for reference types
* once an array is created, its size is fixed
* array elements are accessed using an index
* array index starts at 0
* array index can be any integer type
* array index can be any expression that evaluates to an integer

	Exercises:
	1. what would be the output of following program?
	```java
	public class ArrayTest {
		public static void main(String[] args) {
			int[] arr = new int[5];
			System.out.println(arr[3]);
		}
	}
	```
		a) 0
		b) 3
		c) null
		d) error

	---

	2. what would be the output of following program?
	```java
	public class ArrayTest {
		public static void main(String[] args) {
			int[] arr = new int[5];
			System.out.println(arr[5]);
		}
	}
	```
		a) 0
		b) 5
		c) runtime error
		d) compile time error

	---

	3. what would be the output of following program?
	```java
	public class ArrayTest {
		public static void main(String[] args) {
			int[] arr = new int[5];
			System.out.println(arr[-1]);
		}
	}
	```
		a) 0
		b) -1
		c) runtime error
		d) compile time error

	---

# array initialization
* array elements can be initialized at the time of declaration
* array elements can be initialized using an array initializer
* array initializer is a comma separated list of expressions enclosed in curly braces
* array initializer can be used to initialize all or some of the elements of an array
* array initializer can be used to initialize multidimensional arrays

	Exercises:
	4. what would be the output of following program?
	```java
	public class ArrayTest {
		public static void main(String[] args) {
			int[] arr = {1, 2, 3, 4, 5};
			System.out.println(arr[3]);
		}
	}
	```
		a) 0
		b) 3
		c) 4
		d) error

	---

	5. what would be the output of following program?
	```java
	public class ArrayTest {
		public static void main(String[] args) {
			int[] arr = {1, 2, 3, 4, 5};
			System.out.println(arr[5]);
		}
	}
	```
		a) 0
		b) 5
		c) runtime error
		d) compile time error

	---

	6. how can i initialize an array of size 5 with values 1, 2, 3, 4, 5?
		a) `int[] arr = {1, 2, 3, 4, 5};`
		b) `int[] arr = new int[5] {1, 2, 3, 4, 5};`
		c) `int[] arr = new int[] {1, 2, 3, 4, 5};`
		d) `int[] arr = new int[5] = {1, 2, 3, 4, 5};`

	---

# array access
* array elements are accessed using an index
* array index starts at 0
* array index can be any integer type
* array index can be any expression that evaluates to an integer

	Exercises:
	7. what would be the output of following program?
	```java
	public static void main(String[] args){
		int[] arr = new int[10];
		arr[4] = 5;
		int[] arr2 = arr;
		arr2[4] = 3;
		System.out.println(arr[4]);
	}
	```
	a) 3
	b) 5
	c) 10
	d) Compiler Error

	---

# array length
* array length is the number of elements in the array
* array length is accessed using the length property
* array length is an integer
* array length is read-only

	Exercises:
	8. what would be the output of following program?
	```java
	public static void main(String[] args){
		int[] arr = new int[10];
		System.out.println(arr.length);
	}
	```
	a) 10
	b) 0
	c) 1
	a) Compiler Error

	---

	9. what would be the output of following program?
	```java
	public static void main(String[] args){
		int[] arr = new int[10];
		arr.length = 5;
		System.out.println(arr.length);
	}
	```
	a) 10
	b) 5
	c) runtime error
	d) Compiler time Error

	---

	10. what would be the output of following program?
	```java
	public static void main(String[] args){
		int[] arr = new int[] {0, 1, 2, 3, 4};
		System.out.println(arr.length);
	}
	```
	a) 4
	b) 5
	c) 1
	d) Compiler Error

	---

# array iteration
* array elements can be accessed using a for loop
* array elements can be accessed using a foreach loop

	Exercises:
	11. the following program prints the elements of an array. what should be in the blank?
	```java
	public static void main(String[] args){
		int[] arr = new int[] {1, 2, 3, 4, 5};
		for(int i = 0; i < ____________; i++){
			System.out.print(arr[i] + " ");
		}
	}
	```
	a) len(arr)
	b) arr.length
	c) arr.length()
	d) arr.length(i)

	---

	12. what would be the output of following program?
	```java
	public static void main(String[] args){
		int[] arr = new int[] {1, 2, 3, 4, 5};
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
	```
	a) 1 2 3 4 5
	b) 0 1 2 3 4
	c) 0 1 2 3 4 5
	d) Compiler Error

	---

# array elements usage
* array elements can be used in any opration that uses a variable of the same type

	Exercises:
	13. The following function is supposed to reverse the elements of an integer array. What should be replaced with question marks?
	```java
	static void reverse(int[] arr) {
		int temp;
		int len = arr.length;
		for(int i=0; i< len/2 ; i++) {
			temp = arr[i];
			arr[i] = ________________;
			________________ = temp;
		}
	}
	```
	a) `arr[arr.length - i - 1]`
	b) `arr[len - 1 - i]`
	c) `tmp `____` arr[i]`
	d) `arr[len/2]`

---

# Lab Questions
1. Write a program to print the sum of all the elements of an array of size 5.
2. write a function that takes an array of integers and sorts it in ascending order.(return an array)
3. write a function that takes an array of integers and sorts it in descending order.(return an array)
4. write a function which rotate an integer array by given amount. As demenstrated:

`[1, 2, 3, 4, 5, 6] -> rotate by +1 -> [6, 1, 2, 3, 4, 5]`

`[1, 2, 3, 4, 5, 6] -> rotate by +3 -> [4, 5, 6, 1, 2, 3]`

`[1, 2, 3, 4, 5, 6] -> rotate by -2 -> [3, 4, 5, 6, 1, 2]`

5. write a program that take a set of integers from user and print them in reverse order
6. write a function that take two sorted array of integers and returns a merged sorted array. (in same order of two initial array)

---

_answers to exercises_

1. a

2. c

3. c

4. c

5. d

6. a,c

7. a

8. a

9. d

10. b

11. b

12. a

13. a,b

---

_answer to Lab Questions_
