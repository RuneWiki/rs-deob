package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("sk")
public class class476 implements class474 {

    @ObfuscatedName("sk.at")
    public final Map field4817;

    public class476(Map arg0) {
        this.field4817 = arg0;
    }

    @ObfuscatedName("sk.at(B)Lsi;")
    public class473 method7788() {
        return null;
    }

    @ObfuscatedName("sk.ah(B)[B")
    public byte[] method7789() throws UnsupportedEncodingException {
        return this.method7803().getBytes("UTF-8");
    }

    @ObfuscatedName("sk.aa(I)Ljava/lang/String;")
    public String method7803() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field4817.entrySet().iterator();
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
