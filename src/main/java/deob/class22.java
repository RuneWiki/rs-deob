package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@ObfuscatedName("y")
public class class22 {

    @ObfuscatedName("y.c")
    public final int field118;

    @ObfuscatedName("y.p")
    public final String field120;

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
        this.field120 = var2.toString();
    }

    public class22(String arg0) {
        this.field118 = 400;
        this.field120 = "";
    }

    @ObfuscatedName("y.c(I)I")
    public int method300() {
        return this.field118;
    }

    @ObfuscatedName("y.p(I)Ljava/lang/String;")
    public String method301() {
        return this.field120;
    }
}
