package com.example.demo;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;

public class WebApiData {

    public static Double parse(String responceBody) {
        JSONObject jsonObj = new JSONObject(responceBody);
        return jsonObj.getJSONArray("rates").getJSONObject(0).getDouble("mid");
    }

    public static void main(String[] args) {
        double result;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://api.nbp.pl/api/exchangerates/rates/a/gbp/?format=json")).build();

        result = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body).thenApply(WebApiData::parse).join();
        // System.out::println
        System.out.println(result);

    }
}