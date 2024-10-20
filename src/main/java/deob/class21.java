package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("ai")
public class class21 {

    @ObfuscatedName("ai.at")
    public final int field108;

    @ObfuscatedName("ai.an")
    public final Map field106;

    @ObfuscatedName("ai.av")
    public final String field104;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field108 = arg0.getResponseCode();
        arg0.getResponseMessage();
        this.field106 = arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field108 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field104 = var2.toString();
    }

    public class21(String arg0) {
        this.field108 = 400;
        this.field106 = null;
        this.field104 = "";
    }

    @ObfuscatedName("ai.at(I)I")
    public int method292() {
        return this.field108;
    }

    @ObfuscatedName("ai.an(B)Ljava/util/Map;")
    public Map method291() {
        return this.field106;
    }

    @ObfuscatedName("ai.av(I)Ljava/lang/String;")
    public String method295() {
        return this.field104;
    }
}
