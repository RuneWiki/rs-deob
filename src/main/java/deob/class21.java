package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("a")
public class class21 {

    @ObfuscatedName("a.f")
    public final int field124;

    @ObfuscatedName("a.w")
    public final Map field126;

    @ObfuscatedName("a.v")
    public final String field116;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field124 = arg0.getResponseCode();
        arg0.getResponseMessage();
        this.field126 = arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field124 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
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

    public class21(String arg0) {
        this.field124 = 400;
        this.field126 = null;
        this.field116 = "";
    }

    @ObfuscatedName("a.f(B)I")
    public int method293() {
        return this.field124;
    }

    @ObfuscatedName("a.w(B)Ljava/util/Map;")
    public Map method290() {
        return this.field126;
    }

    @ObfuscatedName("a.v(B)Ljava/lang/String;")
    public String method291() {
        return this.field116;
    }
}
