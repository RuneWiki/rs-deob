package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("pn")
public class class424 implements class422 {

    @ObfuscatedName("pn.e")
    public final Map field4661;

    public class424(Map arg0) {
        this.field4661 = arg0;
    }

    @ObfuscatedName("pn.h(B)[B")
    public byte[] method7203() throws UnsupportedEncodingException {
        return this.method7213().getBytes("UTF-8");
    }

    @ObfuscatedName("pn.v(I)Ljava/lang/String;")
    public String method7213() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field4661.entrySet().iterator();
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
