// import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Sim {
	public static String convert(int data){
		return String.valueOf(data);
	}
	// public static Integer convert(String data){
	// 	return Integer.valueOf(data);
	// }

	public static void main(String[] args) {
		//file path
		String file = "output.csv";
		Random random = new Random();

		try (CSVWriter writer = new CSVWriter(new FileWriter(file))){
			String header = "customer, IAT, Clock Time, Service Time,Service End\n";
			writer.write(header);
			int customers = 100;
			int clock = 0;
			int s_end = 0;
			for (int i = 1; i <= customers; i++){
				int IAT = random.nextInt(8 - 1 + 1) + 1;
				int Service = random.nextInt(6 - 1 + 1) + 1;
				clock = clock + IAT;
				s_end = clock + Service;
        String data = convert(i) + "," + convert(IAT) + "," + convert(clock) + "," + convert(Service) + "," + convert(s_end) + "\n";
				writer.write(data);
				// writer.close();
			}

			System.out.println("CSV file created");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			BufferedReader reader =  new BufferedReader(new FileReader(file));
			System.out.println(reader.readLine());
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	

}

