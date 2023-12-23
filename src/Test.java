import java.io.*;
public class Test {
    public static void main(String[] args) {
        String file = "src\\Personaggi.csv";
        BufferedReader reader = null;
        String line;
        String[][] tabel;
        try{
            int i=0;
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){
                String[] row = line.split(",");
                for(String index:row){
                    System.out.printf("%-10s", index);
                }
                System.out.println();
                for(int j=0;j<row.length;j++) tabel[i][j] = row[j];
                i++;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}