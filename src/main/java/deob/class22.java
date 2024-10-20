package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@ObfuscatedName("m")
public class class22 {

    @ObfuscatedName("m.i")
    public final int field103;

    @ObfuscatedName("m.w")
    public final String field105;

    public class22(HttpURLConnection arg0) throws IOException {
        this.field103 = arg0.getResponseCode();
        arg0.getResponseMessage();
        arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field103 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field105 = var2.toString();
    }

    public class22(String arg0) {
        this.field103 = 400;
        this.field105 = "";
    }

    @ObfuscatedName("m.i(I)I")
    public int method302() {
        return this.field103;
    }

    @ObfuscatedName("m.w(I)Ljava/lang/String;")
    public String method295() {
        return this.field105;
    }
}
