package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@ObfuscatedName("o")
public class class22 {

    @ObfuscatedName("o.l")
    public final int field113;

    @ObfuscatedName("o.q")
    public final String field108;

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
        this.field108 = var2.toString();
    }

    public class22(String arg0) {
        this.field113 = 400;
        this.field108 = "";
    }

    @ObfuscatedName("o.l(I)I")
    public int method310() {
        return this.field113;
    }

    @ObfuscatedName("o.q(I)Ljava/lang/String;")
    public String method305() {
        return this.field108;
    }
}
