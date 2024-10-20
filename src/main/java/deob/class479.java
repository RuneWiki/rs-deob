package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("sq")
public class class479 implements class477 {

    @ObfuscatedName("sq.ac")
    public final Map field4823;

    public class479(Map arg0) {
        this.field4823 = arg0;
    }

    @ObfuscatedName("sq.ac(B)Lst;")
    public class476 method7722() {
        return null;
    }

    @ObfuscatedName("sq.al(B)[B")
    public byte[] method7718() throws UnsupportedEncodingException {
        return this.method7737().getBytes("UTF-8");
    }

    @ObfuscatedName("sq.am(I)Ljava/lang/String;")
    public String method7737() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field4823.entrySet().iterator();
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
