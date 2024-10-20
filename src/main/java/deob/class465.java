package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("rx")
public class class465 implements class463 {

    @ObfuscatedName("rx.aw")
    public final Map field4783;

    public class465(Map arg0) {
        this.field4783 = arg0;
    }

    @ObfuscatedName("rx.aw(I)Lrs;")
    public class462 method7620() {
        return null;
    }

    @ObfuscatedName("rx.ay(I)[B")
    public byte[] method7619() throws UnsupportedEncodingException {
        return this.method7636().getBytes("UTF-8");
    }

    @ObfuscatedName("rx.ag(I)Ljava/lang/String;")
    public String method7636() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field4783.entrySet().iterator();
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
