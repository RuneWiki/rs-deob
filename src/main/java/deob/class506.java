package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("te")
public class class506 implements class504 {

    @ObfuscatedName("te.ap")
    public final Map field5139;

    public class506(Map arg0) {
        this.field5139 = arg0;
    }

    @ObfuscatedName("te.ap(I)Ltz;")
    public class503 method8610() {
        return null;
    }

    @ObfuscatedName("te.aw(B)[B")
    public byte[] method8609() throws UnsupportedEncodingException {
        return this.method8628().getBytes("UTF-8");
    }

    @ObfuscatedName("te.au(I)Ljava/lang/String;")
    public String method8628() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field5139.entrySet().iterator();
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
