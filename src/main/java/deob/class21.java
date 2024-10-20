package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("aa")
public class class21 {

    @ObfuscatedName("aa.az")
    public final int field90;

    @ObfuscatedName("aa.ah")
    public final Map field95;

    @ObfuscatedName("aa.af")
    public final String field91;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field90 = arg0.getResponseCode();
        arg0.getResponseMessage();
        this.field95 = arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field90 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
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
        this.field90 = 400;
        this.field95 = null;
        this.field91 = "";
    }

    @ObfuscatedName("aa.az(B)I")
    public int method268() {
        return this.field90;
    }

    @ObfuscatedName("aa.ah(I)Ljava/util/Map;")
    public Map method274() {
        return this.field95;
    }

    @ObfuscatedName("aa.af(I)Ljava/lang/String;")
    public String method270() {
        return this.field91;
    }
}
