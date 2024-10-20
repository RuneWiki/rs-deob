package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("ac")
public class class21 {

    @ObfuscatedName("ac.aw")
    public final int field113;

    @ObfuscatedName("ac.ay")
    public final Map field107;

    @ObfuscatedName("ac.ar")
    public final String field109;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field113 = arg0.getResponseCode();
        arg0.getResponseMessage();
        this.field107 = arg0.getHeaderFields();
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
        this.field109 = var2.toString();
    }

    public class21(String arg0) {
        this.field113 = 400;
        this.field107 = null;
        this.field109 = "";
    }

    @ObfuscatedName("ac.aw(I)I")
    public int method277() {
        return this.field113;
    }

    @ObfuscatedName("ac.ay(B)Ljava/util/Map;")
    public Map method278() {
        return this.field107;
    }

    @ObfuscatedName("ac.ar(I)Ljava/lang/String;")
    public String method279() {
        return this.field109;
    }
}
