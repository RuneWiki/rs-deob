package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@ObfuscatedName("d")
public class class22 {

    @ObfuscatedName("d.o")
    public final int field115;

    @ObfuscatedName("d.q")
    public final String field116;

    public class22(HttpURLConnection arg0) throws IOException {
        this.field115 = arg0.getResponseCode();
        arg0.getResponseMessage();
        arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field115 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field116 = var2.toString();
    }

    public class22(String arg0) {
        this.field115 = 400;
        this.field116 = "";
    }

    @ObfuscatedName("d.o(B)I")
    public int method264() {
        return this.field115;
    }

    @ObfuscatedName("d.q(B)Ljava/lang/String;")
    public String method269() {
        return this.field116;
    }
}
