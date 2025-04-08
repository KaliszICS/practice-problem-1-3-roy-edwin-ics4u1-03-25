import java.io.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String readFile(String nameOfFile){
		FileReader inputStream = null;
			String results = "";
				try{
			inputStream = new FileReader(nameOfFile);
			int x;
			while((x = inputStream.read()) != -1){
			results += (char)(x);
			}
		}
			catch(IOException e){
			System.out.println(e);
		}
			finally{
			try{
			if(inputStream != null){
			inputStream.close();
			}
		}
			catch(IOException e){
			System.out.println(e);
		}
	}
		return results;
	}

	public static String backwardsReadFile(String nameOfFile){
		FileReader inputStream = null;
		String results = "";
		try{
		inputStream = new FileReader(nameOfFile);
		int x;
		while((x = inputStream.read()) != -1){
	results = (char)(x) + result;
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally{
		try{
		if(inputStream != null){
		inputStream.close();
				}
			}
		catch(IOException e){
		System.out.println(e);
			}
		}
	return results;
	}
}
