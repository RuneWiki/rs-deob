package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("ay")
public class class21 {

    @ObfuscatedName("ay.aq")
    public final int field101;

    @ObfuscatedName("ay.aw")
    public final Map field97;

    @ObfuscatedName("ay.al")
    public final String field98;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field101 = arg0.getResponseCode();
        arg0.getResponseMessage();
        this.field97 = arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field101 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field98 = var2.toString();
    }

    public class21(String arg0) {
        this.field101 = 400;
        this.field97 = null;
        this.field98 = "";
    }

    @ObfuscatedName("ay.aq(B)I")
    public int method259() {
        return this.field101;
    }

    @ObfuscatedName("ay.aw(I)Ljava/util/Map;")
    public Map method257() {
        return this.field97;
    }

    @ObfuscatedName("ay.al(B)Ljava/lang/String;")
    public String method258() {
        return this.field98;
    }
}
