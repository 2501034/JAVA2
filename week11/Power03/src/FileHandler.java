import org.apache.commons.io.FileUtils;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileHandler implements Constants{

    protected ArrayList<Customer> readData(File file) {
        ArrayList<Customer> customers = new ArrayList<>();
        try{
            List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);
            for (String line : lines) {
                line = line.trim().replaceAll(",", "");

                StringTokenizer tokenizer = new StringTokenizer(line, " ");

                String customID = tokenizer.nextToken();
                String name = tokenizer.nextToken();
                int usage = Integer.parseInt(tokenizer.nextToken());

                Customer customer;

                if (customID.charAt(0) == '9')
                    customer = new Special(name, customID, usage);
                else
                    customer = new Normal(name, customID, usage);

                customers.add(customer);
            }

            if (customers.isEmpty()) {
                System.out.println("데이터가 없습니다.");
                System.exit(-1);
            }else {
                System.out.printf("%d개의 데이터를 읽었습니다.\n",customers.size());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return customers;
    }
}
