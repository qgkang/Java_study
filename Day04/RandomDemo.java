import java.util.Scanner;
import java.util.Random;
public class RandomDemo{
	public static void main(String[] args) {
			System.out.println("--------Random name--------");
			String[] students = new String[3];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("store"+i+"name:");
			students[i] = sc.next();
		}

		for (int i = 0; i < students.length; i++) {
			String name = students[i];
			System.out.println("the"+i+"name" + name);
		}

		int index = new Random().nextInt(students.length);
		String name = students[index];
		System.out.println("Random name:" + name);
	}
}
