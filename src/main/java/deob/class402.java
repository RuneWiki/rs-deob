package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ov")
public class class402 implements class400 {

    @ObfuscatedName("ov.q")
    public final Map field4441;

    public class402(Map arg0) {
        this.field4441 = arg0;
    }

    @ObfuscatedName("ov.o(I)[B")
    public byte[] method6363() throws UnsupportedEncodingException {
        return this.method6379().getBytes("UTF-8");
    }

    @ObfuscatedName("ov.l(I)Ljava/lang/String;")
    public String method6379() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field4441.entrySet().iterator();
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
