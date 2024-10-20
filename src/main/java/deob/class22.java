package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@ObfuscatedName("y")
public class class22 {

    @ObfuscatedName("y.v")
    public final int field112;

    @ObfuscatedName("y.c")
    public final String field110;

    public class22(HttpURLConnection arg0) throws IOException {
        this.field112 = arg0.getResponseCode();
        arg0.getResponseMessage();
        arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field112 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field110 = var2.toString();
    }

    public class22(String arg0) {
        this.field112 = 400;
        this.field110 = "";
    }

    @ObfuscatedName("y.v(I)I")
    public int method294() {
        return this.field112;
    }

    @ObfuscatedName("y.c(B)Ljava/lang/String;")
    public String method292() {
        return this.field110;
    }
}
