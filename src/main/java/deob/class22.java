package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@ObfuscatedName("p")
public class class22 {

    @ObfuscatedName("p.h")
    public final int field122;

    @ObfuscatedName("p.e")
    public final String field123;

    public class22(HttpURLConnection arg0) throws IOException {
        this.field122 = arg0.getResponseCode();
        arg0.getResponseMessage();
        arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field122 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field123 = var2.toString();
    }

    public class22(String arg0) {
        this.field122 = 400;
        this.field123 = "";
    }

    @ObfuscatedName("p.h(I)I")
    public int method288() {
        return this.field122;
    }

    @ObfuscatedName("p.e(I)Ljava/lang/String;")
    public String method289() {
        return this.field123;
    }
}
