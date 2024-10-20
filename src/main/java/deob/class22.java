package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@ObfuscatedName("i")
public class class22 {

    @ObfuscatedName("i.a")
    public final int field113;

    @ObfuscatedName("i.f")
    public final String field112;

    public class22(HttpURLConnection arg0) throws IOException {
        this.field113 = arg0.getResponseCode();
        arg0.getResponseMessage();
        arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field113 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field112 = var2.toString();
    }

    public class22(String arg0) {
        this.field113 = 400;
        this.field112 = "";
    }

    @ObfuscatedName("i.a(B)I")
    public int method290() {
        return this.field113;
    }

    @ObfuscatedName("i.f(I)Ljava/lang/String;")
    public String method291() {
        return this.field112;
    }
}
