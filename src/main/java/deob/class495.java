package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("tw")
public class class495 implements class493 {

    @ObfuscatedName("tw.ak")
    public final Map field5016;

    public class495(Map arg0) {
        this.field5016 = arg0;
    }

    @ObfuscatedName("tw.ak(B)Lsd;")
    public class492 method8141() {
        return null;
    }

    @ObfuscatedName("tw.al(B)[B")
    public byte[] method8140() throws UnsupportedEncodingException {
        return this.method8156().getBytes("UTF-8");
    }

    @ObfuscatedName("tw.ac(B)Ljava/lang/String;")
    public String method8156() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field5016.entrySet().iterator();
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
