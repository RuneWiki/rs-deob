package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("ay")
public class class21 {

    @ObfuscatedName("ay.ac")
    public final int field82;

    @ObfuscatedName("ay.ae")
    public final Map field83;

    @ObfuscatedName("ay.ag")
    public final String field86;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field82 = arg0.getResponseCode();
        arg0.getResponseMessage();
        this.field83 = arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field82 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field86 = var2.toString();
    }

    public class21(String arg0) {
        this.field82 = 400;
        this.field83 = null;
        this.field86 = "";
    }

    @ObfuscatedName("ay.ac(I)I")
    public int method284() {
        return this.field82;
    }

    @ObfuscatedName("ay.ae(I)Ljava/util/Map;")
    public Map method289() {
        return this.field83;
    }

    @ObfuscatedName("ay.ag(I)Ljava/lang/String;")
    public String method286() {
        return this.field86;
    }
}
