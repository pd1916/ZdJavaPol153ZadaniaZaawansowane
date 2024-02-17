package pl.sdacademy.java.advanced.exercises.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class App {
    public static void main(String[] args) throws MalformedURLException, JsonProcessingException {
        URL nbp = new URL("https://api.nbp.pl/api/exchangerates/tables/a/?format=json");
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(nbp.openConnection().getInputStream()))){
            String tempInputLine;
            while((tempInputLine = br.readLine()) != null) {
                sb.append(tempInputLine);
            }
        } catch(IOException e) {
            System.out.println("Exception: " + e);
        }
        String resultFromApi = sb.toString();

        ObjectMapper om = new ObjectMapper();
        Root root = om.readValue(resultFromApi, Root[].class)[0];

        double usdPrice = root.getRates().stream()
                .filter(rate -> rate.getCode().equalsIgnoreCase("USD"))
                .mapToDouble(Rate::getMid)
                .findFirst()
                .orElse(0);
        System.out.println(usdPrice);
    }
}
