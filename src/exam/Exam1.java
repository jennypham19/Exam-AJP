package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		HashMap<String, String> list = new HashMap<String, String>();
		String name = null;
		String phone;
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Ten sinh vien: ");
				name = sc.nextLine();
				System.out.print("So dien thoai: ");
				phone = sc.nextLine();
				if (name.equalsIgnoreCase("x") || phone.equalsIgnoreCase("x")) {
					break;
				}else {
					list.put(name, phone);
				}
			}
			sc.close();
			System.out.println("Danh sach la: ");
			for (Map.Entry<String, String> m : list.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
