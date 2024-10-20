package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("tl")
public class class497 implements class495 {

    @ObfuscatedName("tl.ab")
    public final Map field5033;

    public class497(Map arg0) {
        this.field5033 = arg0;
    }

    @ObfuscatedName("tl.ab(I)Lsw;")
    public class494 method8173() {
        return null;
    }

    @ObfuscatedName("tl.ay(I)[B")
    public byte[] method8177() throws UnsupportedEncodingException {
        return this.method8187().getBytes("UTF-8");
    }

    @ObfuscatedName("tl.am(I)Ljava/lang/String;")
    public String method8187() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field5033.entrySet().iterator();
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
