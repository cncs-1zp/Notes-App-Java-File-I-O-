import java.io.*;

public class TextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.Create a text file
		File file = new File("C:\\Users\\shiva\\eclipse-workspace\\Notes_Management\\src\\text");
		if (file.exists()) {
			System.out.println("File exists: " + file.getAbsolutePath());
		} else {
			System.out.println("File not found.");
		}
		// 2. write on that file
		try {
			FileWriter fw = new FileWriter("C:\\Users\\shiva\\eclipse-workspace\\Notes_Management\\src\\text");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("first line");
			bw.newLine();
			bw.write("second line");
			bw.newLine();
			bw.write("third line");
			bw.newLine();
			bw.flush();
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//3.read line from that text file

	try {
		FileReader fr=new FileReader("C:\\Users\\shiva\\eclipse-workspace\\Notes_Management\\src\\text");
		System.out.println("file exist");
		
		BufferedReader br = new BufferedReader(fr);
		String i=" ";
		while((i=br.readLine())!=null){
			System.out.println(i);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	


	}

}
