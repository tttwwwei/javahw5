package homework12_7;

import java.io.*;
public class p_35 {
	public static void main(String[] args)
	{
		try
		{
			FileWriter fw = new FileWriter("");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("GoodBye!");
			
			pw.close();
			
			System.out.println("資料已經寫入檔案了");
		}
		catch (IOException e)
		{
			System.out.println("輸出入錯誤");
		}
	}
}
