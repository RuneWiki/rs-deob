package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("po")
public class class421 implements class419 {

    @ObfuscatedName("po.f")
    public final Map field4610;

    public class421(Map arg0) {
        this.field4610 = arg0;
    }

    @ObfuscatedName("po.a(B)[B")
    public byte[] method7138() throws UnsupportedEncodingException {
        return this.method7149().getBytes("UTF-8");
    }

    @ObfuscatedName("po.c(B)Ljava/lang/String;")
    public String method7149() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field4610.entrySet().iterator();
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
