package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("ar")
public class class21 {

    @ObfuscatedName("ar.ab")
    public final int field83;

    @ObfuscatedName("ar.ay")
    public final Map field78;

    @ObfuscatedName("ar.an")
    public final String field80;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field83 = arg0.getResponseCode();
        arg0.getResponseMessage();
        this.field78 = arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field83 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field80 = var2.toString();
    }

    public class21(String arg0) {
        this.field83 = 400;
        this.field78 = null;
        this.field80 = "";
    }

    @ObfuscatedName("ar.ab(I)I")
    public int method266() {
        return this.field83;
    }

    @ObfuscatedName("ar.ay(I)Ljava/util/Map;")
    public Map method267() {
        return this.field78;
    }

    @ObfuscatedName("ar.an(I)Ljava/lang/String;")
    public String method268() {
        return this.field80;
    }
}
