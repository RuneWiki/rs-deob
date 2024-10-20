package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@ObfuscatedName("x")
public class class22 {

    @ObfuscatedName("x.s")
    public final int field113;

    @ObfuscatedName("x.h")
    public final String field116;

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
        this.field116 = var2.toString();
    }

    public class22(String arg0) {
        this.field113 = 400;
        this.field116 = "";
    }

    @ObfuscatedName("x.s(S)I")
    public int method290() {
        return this.field113;
    }

    @ObfuscatedName("x.h(I)Ljava/lang/String;")
    public String method287() {
        return this.field116;
    }
}
