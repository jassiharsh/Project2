package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {

        FileReader fr = null;
        BufferedReader br = null;
        try {
        fr = new FileReader("C:\\Users\\jassi\\OneDrive\\Desktop\\PIIT\\Test.txt");

    }catch (FileNotFoundException e) {
        e.printStackTrace();
    }
        try {
            br = new BufferedReader(fr);
            String str = " ";
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        }catch (Exception exception) {
            exception.printStackTrace();
        }finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            fr.close();
    }
    }
}
