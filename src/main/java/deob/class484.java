package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("si")
public class class484 implements class482 {

    @ObfuscatedName("si.az")
    public final Map field4915;

    public class484(Map arg0) {
        this.field4915 = arg0;
    }

    @ObfuscatedName("si.az(I)Lsv;")
    public class481 method7808() {
        return null;
    }

    @ObfuscatedName("si.ah(B)[B")
    public byte[] method7807() throws UnsupportedEncodingException {
        return this.method7824().getBytes("UTF-8");
    }

    @ObfuscatedName("si.aw(I)Ljava/lang/String;")
    public String method7824() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field4915.entrySet().iterator();
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
