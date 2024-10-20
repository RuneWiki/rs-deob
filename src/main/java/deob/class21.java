package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("as")
public class class21 {

    @ObfuscatedName("as.aq")
    public final int field89;

    @ObfuscatedName("as.ad")
    public final Map field90;

    @ObfuscatedName("as.ag")
    public final String field91;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field89 = arg0.getResponseCode();
        arg0.getResponseMessage();
        this.field90 = arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field89 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field91 = var2.toString();
    }

    public class21(String arg0) {
        this.field89 = 400;
        this.field90 = null;
        this.field91 = "";
    }

    @ObfuscatedName("as.aq(I)I")
    public int method284() {
        return this.field89;
    }

    @ObfuscatedName("as.ad(I)Ljava/util/Map;")
    public Map method292() {
        return this.field90;
    }

    @ObfuscatedName("as.ag(I)Ljava/lang/String;")
    public String method283() {
        return this.field91;
    }
}
