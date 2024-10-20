package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("av")
public class class21 {

    @ObfuscatedName("av.ap")
    public final int field80;

    @ObfuscatedName("av.aw")
    public final String field79;

    @ObfuscatedName("av.ak")
    public final Map field78;

    @ObfuscatedName("av.aj")
    public final String field81;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field80 = arg0.getResponseCode();
        this.field79 = arg0.getResponseMessage();
        this.field78 = arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field80 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field81 = var2.toString();
    }

    public class21(String arg0) {
        this.field80 = 400;
        this.field79 = arg0;
        this.field78 = null;
        this.field81 = "";
    }

    @ObfuscatedName("av.ap(I)I")
    public int method292() {
        return this.field80;
    }

    @ObfuscatedName("av.aw(I)Ljava/lang/String;")
    public String method290() {
        return this.field79;
    }

    @ObfuscatedName("av.ak(I)Ljava/util/Map;")
    public Map method296() {
        return this.field78;
    }

    @ObfuscatedName("av.aj(B)Ljava/lang/String;")
    public String method301() {
        return this.field81;
    }
}
