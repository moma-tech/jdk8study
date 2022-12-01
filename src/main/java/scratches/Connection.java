package scratches;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * scraches.Connection Stream
 * Http Url Connecition
 * Created by ivan on 17-6-15.
 **/
public class Connection {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.baidu.com");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection;
            if (urlConnection instanceof HttpURLConnection) {
                connection = (HttpURLConnection) urlConnection;
            } else {
                System.out.println("请输入 URL 地址");
                return;
            }
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            StringBuilder urlString = new StringBuilder();
            String current;
            while ((current = in.readLine()) != null) {
                urlString.append(current);
            }
            System.out.println(urlString.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    ~~~THE HTML~~~
     */
}
