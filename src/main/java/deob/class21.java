package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfuscatedName("as")
public class class21 {

    @ObfuscatedName("as.au")
    public final int field105;

    @ObfuscatedName("as.ae")
    public final Map field103;

    @ObfuscatedName("as.ao")
    public final String field104;

    public class21(HttpURLConnection arg0) throws IOException {
        this.field105 = arg0.getResponseCode();
        arg0.getResponseMessage();
        this.field103 = arg0.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field105 >= 300 ? arg0.getErrorStream() : arg0.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);
            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }
            var3.close();
        }
        this.field104 = var2.toString();
    }

    public class21(String arg0) {
        this.field105 = 400;
        this.field103 = null;
        this.field104 = "";
    }

    @ObfuscatedName("as.au(S)I")
    public int method290() {
        return this.field105;
    }

    @ObfuscatedName("as.ae(B)Ljava/util/Map;")
    public Map method292() {
        return this.field103;
    }

    @ObfuscatedName("as.ao(I)Ljava/lang/String;")
    public String method293() {
        return this.field104;
    }
}
