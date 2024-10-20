package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("aj")
public class class21 {

    @ObfuscatedName("aj.af")
    public final int field110;

    @ObfuscatedName("aj.an")
    public final Map field109;

    @ObfuscatedName("aj.aw")
    public final String field108;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field110 = arg0.getResponseCode();
        arg0.getResponseMessage();
        this.field109 = arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field110 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
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
        this.field110 = 400;
        this.field109 = null;
        this.field108 = "";
    }

    @ObfuscatedName("aj.af(I)I")
    public int method289() {
        return this.field110;
    }

    @ObfuscatedName("aj.an(I)Ljava/util/Map;")
    public Map method290() {
        return this.field109;
    }

    @ObfuscatedName("aj.aw(I)Ljava/lang/String;")
    public String method291() {
        return this.field108;
    }
}
