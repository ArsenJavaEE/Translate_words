package parsePac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseDemo {

	public static void main(String[] args) throws IOException {
		// создать объект BufferedReader, используя System.in

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int i;
		int sum = 0;
		System.out.println(" Введите числа от 0 до quit.\n");
		do {
			str = br.readLine();
			try {
				i = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				System.out.println(" Неправильный формат");
				i = 0;
			}
			sum += i;
			System.out.println(" Текущая сумма: " + sum);
		} while (i != 0);

	}

}
