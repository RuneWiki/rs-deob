package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("ad")
public class class21 {

    @ObfuscatedName("ad.ak")
    public final int field107;

    @ObfuscatedName("ad.al")
    public final Map field111;

    @ObfuscatedName("ad.aj")
    public final String field108;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field107 = arg0.getResponseCode();
        arg0.getResponseMessage();
        this.field111 = arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field107 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field108 = var2.toString();
    }

    public class21(String arg0) {
        this.field107 = 400;
        this.field111 = null;
        this.field108 = "";
    }

    @ObfuscatedName("ad.ak(B)I")
    public int method265() {
        return this.field107;
    }

    @ObfuscatedName("ad.al(B)Ljava/util/Map;")
    public Map method266() {
        return this.field111;
    }

    @ObfuscatedName("ad.aj(I)Ljava/lang/String;")
    public String method267() {
        return this.field108;
    }
}
