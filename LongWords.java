import java.util.ArrayList;
import java.util.Scanner;

public class LongWords {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		int count = 0;
		double sum = 0;

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a few  words then press 0 to end?");
			String input = scan.nextLine();

			while (!input.equals("0")) { // compare string using to see if 0 was entered
				list.add(input);

				System.out.println("Enter words press 0 to end?");
				input = scan.nextLine();

			}

			System.out.println(list);
			// splitting the words to loop through all and to print out the words longer
			// than 4 letters
			String[] split = input.split("\\s+");

			for (int i = 0; i < split.length; i++) {
				if (split[i].length() > 4) {
					if (split[i].matches("[a-zA-Z]+")) {
						list.add(split[i]);
					}
					if (split[i].matches("[a-zA-Z]+,")) {
						String temp = "";
						for (int j = 0; j < split[i].length(); j++) {
							if ((split[i].charAt(j)) != ((char) ',')) {
								temp += split[i].charAt(j);

							}
						}

						list.add(temp);

					}
					System.out.println(list);

				}
				// working out the average of the words
				for (String word : list) {
					double length = word.length();
					sum += length;
					count++;
				}
				double average = 0;
				if (count > 0) {
					average = sum / count;
				}
				System.out.println(average);
			}
		}

	}

}
