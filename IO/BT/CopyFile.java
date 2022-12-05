package IO.BT;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static List<String> readFileText(String filePath) {
        List <String> list = new ArrayList<>();
        try {
            // Đọc file theo đường dẫn
            File file = new File(filePath);

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        System.out.println(list);
        return list;
    }
    public static int writeFileText(String filePath, List<String> list) throws IOException{
        int count = 0;
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String text : list){
                bufferedWriter.write(text);
                bufferedWriter.newLine();
                count+= text.length();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return(count);
    }

    public static void main(String[] args) throws IOException {
        final String SOURCE = "D:\\Codegym\\Module 2\\BT\\src\\IO\\BT\\source_file.txt";
        String TARGET = "D:\\Codegym\\Module 2\\BT\\src\\IO\\BT\\target_file.txt";
        List<String> list = readFileText(SOURCE);
        System.out.println("Ket qua" +  writeFileText(TARGET,list));
    }
}
