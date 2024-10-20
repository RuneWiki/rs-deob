package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("aw")
public class class21 {

    @ObfuscatedName("aw.at")
    public final int field102;

    @ObfuscatedName("aw.ah")
    public final Map field98;

    @ObfuscatedName("aw.ar")
    public final String field100;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field102 = arg0.getResponseCode();
        arg0.getResponseMessage();
        this.field98 = arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field102 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field100 = var2.toString();
    }

    public class21(String arg0) {
        this.field102 = 400;
        this.field98 = null;
        this.field100 = "";
    }

    @ObfuscatedName("aw.at(B)I")
    public int method291() {
        return this.field102;
    }

    @ObfuscatedName("aw.ah(I)Ljava/util/Map;")
    public Map method295() {
        return this.field98;
    }

    @ObfuscatedName("aw.ar(I)Ljava/lang/String;")
    public String method293() {
        return this.field100;
    }
}
