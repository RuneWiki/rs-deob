package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@ObfuscatedName("b")
public class class22 {

    @ObfuscatedName("b.c")
    public final int field118;

    @ObfuscatedName("b.v")
    public final String field117;

    public class22(HttpURLConnection arg0) throws IOException {
        this.field118 = arg0.getResponseCode();
        arg0.getResponseMessage();
        arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field118 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field117 = var2.toString();
    }

    public class22(String arg0) {
        this.field118 = 400;
        this.field117 = "";
    }

    @ObfuscatedName("b.c(B)I")
    public int method253() {
        return this.field118;
    }

    @ObfuscatedName("b.v(I)Ljava/lang/String;")
    public String method257() {
        return this.field117;
    }
}
