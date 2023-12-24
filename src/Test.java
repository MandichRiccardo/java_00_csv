import java.io.*;
public class Test {
    public static void main(String[] args) {
        String file = "src\\Personaggi.csv";
        BufferedReader reader = null;
        String line;
        String[][] tabel;
        boolean exist = false;
        try{
            reader = new BufferedReader(new FileReader(file));
            int tot = 0;
            for(int j=0;(line = reader.readLine()) != null;j++){
                exist = true;
                tot = j;
            }
            tabel = new String[tot][];
            int i=0;
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
        try{
            System.out.println("iniziativa di " + tabel[1][0] + ":\t" + tabel[1][1]);
        }catch (Exception e){
            System.out.println("il file non ha nessuna riga");
        }
    }
}