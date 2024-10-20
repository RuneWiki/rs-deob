package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@ObfuscatedName("g")
public class class22 {

    @ObfuscatedName("g.c")
    public final int field122;

    @ObfuscatedName("g.l")
    public final String field119;

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
        this.field119 = var2.toString();
    }

    public class22(String arg0) {
        this.field122 = 400;
        this.field119 = "";
    }

    @ObfuscatedName("g.c(I)I")
    public int method290() {
        return this.field122;
    }

    @ObfuscatedName("g.l(I)Ljava/lang/String;")
    public String method291() {
        return this.field119;
    }
}
