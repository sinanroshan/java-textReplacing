import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter File Path:");
        String path= in.nextLine();
        System.out.println("Enter Key Word:");
        String keyWord= in.nextLine();
        StringBuilder replaceKey = new StringBuilder();
        for(int i=0;i<keyWord.length();i++){
            replaceKey.append("#");
        }
        try
        {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String content = br.readLine();
        while(content!=null){
            String newContent = content.replaceAll(keyWord, replaceKey.toString());
            BufferedWriter newFile = new BufferedWriter(new FileWriter(file));
            newFile.write(newContent);
            newFile.close();
            System.exit(0);
        }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}