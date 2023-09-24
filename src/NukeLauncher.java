import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NukeLauncher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Launch nukes? (Y/N)");
        String response = br.readLine().toUpperCase();

        while(!response.equals("Y") && !response.equals("N")) {
            response = br.readLine().toUpperCase();
        }

        if (response.equals("Y")) {
            System.out.println("Nuke launched!");
            return;
        }

        System.out.println("See you next time!");
    }
}
