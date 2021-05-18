import java.io.*;
import java.math.*;

public class tuntilaskuri  {
        public static void main(String[] args) throws IOException {

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ohjelma laskee yhteen haluamasi ajanjakson aikana tehdyt työtunnit sekä keskimääräisen työpäivän pituuden.");

            System.out.println("Kuinka monta työpäivää:");

            Integer tyopaivat = 0;
            Double tyotunnit = 0.0;
            Double tunnit_yht = 0.0;
            Double keskiarvo = 0.0;

            tyopaivat = Integer.valueOf(in.readLine());

            double taulukko[] = new double[tyopaivat];

            try {
                for (var i = 0; i < taulukko.length; i++) {
                    System.out.print("Anna " + i + "." + " päivän työtunnit:");
                    tyotunnit = Double.valueOf(in.readLine());
                    taulukko[i] = tyotunnit;
                    tunnit_yht += tyotunnit;
                }

                keskiarvo = tunnit_yht / taulukko.length;
                System.out.println("Tehdyt työtunnit yhteensä: " + tunnit_yht);
                System.out.println("Keskimääräinen työpäivän pituus: " + keskiarvo);
                System.out.println(taulukko);

            }

            catch (Exception e) {
                System.out.print("Antamasi syöte on virheellinen...");
            }
        }
}
