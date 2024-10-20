package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("rb")
public class class452 implements class450 {

    @ObfuscatedName("rb.at")
    public final Map field4724;

    public class452(Map arg0) {
        this.field4724 = arg0;
    }

    @ObfuscatedName("rb.at(I)Lro;")
    public class449 method7523() {
        return null;
    }

    @ObfuscatedName("rb.an(I)[B")
    public byte[] method7522() throws UnsupportedEncodingException {
        return this.method7534().getBytes("UTF-8");
    }

    @ObfuscatedName("rb.ab(I)Ljava/lang/String;")
    public String method7534() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field4724.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            String var4 = URLEncoder.encode((String) var3.getKey(), "UTF-8");
            String var5 = URLEncoder.encode((String) var3.getValue(), "UTF-8");
            var1.append(var4).append("=").append(var5).append("&");
        }
        if (var1.length() == 0) {
            return "";
        } else {
            var1.deleteCharAt(var1.length() - 1);
            var1.insert(0, "?");
            return var1.toString();
        }
    }
}
