package pl.javaekspert;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class MyService {

    private static final String GOOGLE_URL = "https://google.pl";
    private final OkHttpClient okHttp;

    public MyService(OkHttpClient okHttp) {
        this.okHttp = okHttp;
    }

    public void get() throws IOException {
        var response = okHttp.newCall(createRequest()).execute();
        System.out.println(response);
    }

    private Request createRequest() {
        return new Request.Builder().url(GOOGLE_URL).get().build();
    }

    public static void main(String[] args) throws IOException {
        new MyService(new OkHttpClient()).get();
    }
}
