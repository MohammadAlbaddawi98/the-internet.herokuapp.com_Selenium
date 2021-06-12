package testcases;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class StatusCodes {
    @Test
    public void StatusCodes200() throws IOException {
        HttpURLConnection.setFollowRedirects(false);
        HttpURLConnection con = (HttpURLConnection) new URL("http://the-internet.herokuapp.com/status_codes/200").openConnection();
        con.setRequestMethod("HEAD");

        int code = con.getResponseCode();
        Assert.assertEquals(code, 200);
    }

    @Test
    public void StatusCodes301() throws IOException {
        HttpURLConnection.setFollowRedirects(false);
        HttpURLConnection con = (HttpURLConnection) new URL("http://the-internet.herokuapp.com/status_codes/301").openConnection();
        con.setRequestMethod("HEAD");

        int code = con.getResponseCode();
        Assert.assertEquals(code, 301);
    }

    @Test
    public void StatusCodes404() throws IOException {
        HttpURLConnection.setFollowRedirects(false);
        HttpURLConnection con = (HttpURLConnection) new URL("http://the-internet.herokuapp.com/status_codes/404").openConnection();
        con.setRequestMethod("HEAD");

        int code = con.getResponseCode();

        Assert.assertEquals(code, 404);
    }

    @Test
    public void StatusCodes500() throws IOException {
        HttpURLConnection.setFollowRedirects(false);
        HttpURLConnection con = (HttpURLConnection) new URL("http://the-internet.herokuapp.com/status_codes/500").openConnection();
        con.setRequestMethod("HEAD");

        int code = con.getResponseCode();

        Assert.assertEquals(code, 500);
    }
}
