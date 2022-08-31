import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
            String str = "Простой текст. ";
            String str2 = "Ещё напишу что-нибудь.";
            FileOutputStream fos = new FileOutputStream("C://papka/1.txt");
            byte[] buffer = str.getBytes();
            fos.write(buffer);
            buffer = str2.getBytes();
           fos.write(buffer);
        FileOutputStream fos1 = new FileOutputStream("C://papka/2.txt");
        fos1.write(buffer);
    }
}