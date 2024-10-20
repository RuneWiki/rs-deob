package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("qm")
public class class435 implements class433 {

    @ObfuscatedName("qm.aj")
    public final Map field4646;

    public class435(Map arg0) {
        this.field4646 = arg0;
    }

    @ObfuscatedName("qm.aj(B)Lqn;")
    public class432 method7306() {
        return null;
    }

    @ObfuscatedName("qm.al(B)[B")
    public byte[] method7305() throws UnsupportedEncodingException {
        return this.method7319().getBytes("UTF-8");
    }

    @ObfuscatedName("qm.ap(I)Ljava/lang/String;")
    public String method7319() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field4646.entrySet().iterator();
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
