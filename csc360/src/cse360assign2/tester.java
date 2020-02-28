package cse360assign2;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleList test = new SimpleList();
		
		test.add(0);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(5);
		
		test.append(6);
		test.append(7);
		test.append(8);
		test.append(9);
		test.append(10);
		test.append(11);
		
		System.out.print("count: ");
		System.out.println(test.count());
		
		System.out.print("size 1st: ");
		System.out.println(test.size());
		
		System.out.print("first: ");
		System.out.println(test.first());
		
		System.out.print("last: ");
		System.out.println(test.last());
		
		test.remove(1);
		test.remove(2);
		test.remove(3);
		test.remove(4);
		test.remove(5);
		test.remove(6);
		test.remove(7);
		test.remove(8);
		test.remove(9);
		
		System.out.print("size 2nd: ");
		System.out.println(test.size());
		
		System.out.print(test.toString());
	}

}
