package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("tb")
public class class496 implements class494 {

    @ObfuscatedName("tb.aq")
    public final Map field5049;

    public class496(Map arg0) {
        this.field5049 = arg0;
    }

    @ObfuscatedName("tb.aq(B)Lsb;")
    public class493 method8080() {
        return null;
    }

    @ObfuscatedName("tb.ad(I)[B")
    public byte[] method8076() throws UnsupportedEncodingException {
        return this.method8097().getBytes("UTF-8");
    }

    @ObfuscatedName("tb.ai(I)Ljava/lang/String;")
    public String method8097() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field5049.entrySet().iterator();
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
