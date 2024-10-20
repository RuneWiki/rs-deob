package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("oo")
public class class403 implements class401 {

    @ObfuscatedName("oo.p")
    public final Map field4479;

    public class403(Map arg0) {
        this.field4479 = arg0;
    }

    @ObfuscatedName("oo.c(I)[B")
    public byte[] method6625() throws UnsupportedEncodingException {
        return this.method6639().getBytes("UTF-8");
    }

    @ObfuscatedName("oo.n(I)Ljava/lang/String;")
    public String method6639() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field4479.entrySet().iterator();
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
