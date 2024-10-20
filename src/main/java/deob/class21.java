package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("af")
public class class21 {

    @ObfuscatedName("af.aj")
    public final int field112;

    @ObfuscatedName("af.al")
    public final Map field111;

    @ObfuscatedName("af.ac")
    public final String field117;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field112 = arg0.getResponseCode();
        arg0.getResponseMessage();
        this.field111 = arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field112 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field117 = var2.toString();
    }

    public class21(String arg0) {
        this.field112 = 400;
        this.field111 = null;
        this.field117 = "";
    }

    @ObfuscatedName("af.aj(I)I")
    public int method279() {
        return this.field112;
    }

    @ObfuscatedName("af.al(I)Ljava/util/Map;")
    public Map method277() {
        return this.field111;
    }

    @ObfuscatedName("af.ac(I)Ljava/lang/String;")
    public String method280() {
        return this.field117;
    }
}
