package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("sv")
public class class483 implements class481 {

    @ObfuscatedName("sv.aq")
    public final Map field4887;

    public class483(Map arg0) {
        this.field4887 = arg0;
    }

    @ObfuscatedName("sv.aq(B)Lsp;")
    public class480 method7947() {
        return null;
    }

    @ObfuscatedName("sv.aw(I)[B")
    public byte[] method7944() throws UnsupportedEncodingException {
        return this.method7961().getBytes("UTF-8");
    }

    @ObfuscatedName("sv.aa(B)Ljava/lang/String;")
    public String method7961() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field4887.entrySet().iterator();
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
