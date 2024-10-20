package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("sz")
public class class480 implements class478 {

    @ObfuscatedName("sz.am")
    public final Map field4856;

    public class480(Map arg0) {
        this.field4856 = arg0;
    }

    @ObfuscatedName("sz.am(I)Lsy;")
    public class477 method7936() {
        return null;
    }

    @ObfuscatedName("sz.ap(I)[B")
    public byte[] method7935() throws UnsupportedEncodingException {
        return this.method7954().getBytes("UTF-8");
    }

    @ObfuscatedName("sz.ag(I)Ljava/lang/String;")
    public String method7954() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field4856.entrySet().iterator();
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
