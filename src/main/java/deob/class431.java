package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("pt")
public class class431 implements class429 {

    @ObfuscatedName("pt.f")
    public final Map field4685;

    public class431(Map arg0) {
        this.field4685 = arg0;
    }

    @ObfuscatedName("pt.f(B)Lpf;")
    public class428 method7402() {
        return null;
    }

    @ObfuscatedName("pt.w(B)[B")
    public byte[] method7401() throws UnsupportedEncodingException {
        return this.method7418().getBytes("UTF-8");
    }

    @ObfuscatedName("pt.i(B)Ljava/lang/String;")
    public String method7418() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field4685.entrySet().iterator();
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
