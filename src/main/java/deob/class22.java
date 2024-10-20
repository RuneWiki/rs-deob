package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@ObfuscatedName("t")
public class class22 {

    @ObfuscatedName("t.n")
    public final int field106;

    @ObfuscatedName("t.c")
    public final String field110;

    public class22(HttpURLConnection arg0) throws IOException {
        this.field106 = arg0.getResponseCode();
        arg0.getResponseMessage();
        arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field106 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
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
        this.field106 = 400;
        this.field110 = "";
    }

    @ObfuscatedName("t.n(I)I")
    public int method312() {
        return this.field106;
    }

    @ObfuscatedName("t.c(I)Ljava/lang/String;")
    public String method311() {
        return this.field110;
    }
}
