package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("aw")
public class class21 {

    @ObfuscatedName("aw.ac")
    public final int field109;

    @ObfuscatedName("aw.al")
    public final Map field105;

    @ObfuscatedName("aw.ak")
    public final String field107;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field109 = arg0.getResponseCode();
        arg0.getResponseMessage();
        this.field105 = arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field109 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field107 = var2.toString();
    }

    public class21(String arg0) {
        this.field109 = 400;
        this.field105 = null;
        this.field107 = "";
    }

    @ObfuscatedName("aw.ac(I)I")
    public int method278() {
        return this.field109;
    }

    @ObfuscatedName("aw.al(B)Ljava/util/Map;")
    public Map method279() {
        return this.field105;
    }

    @ObfuscatedName("aw.ak(I)Ljava/lang/String;")
    public String method280() {
        return this.field107;
    }
}
