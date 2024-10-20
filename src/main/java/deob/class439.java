package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("qa")
public class class439 implements class437 {

    @ObfuscatedName("qa.af")
    public final Map field4713;

    public class439(Map arg0) {
        this.field4713 = arg0;
    }

    @ObfuscatedName("qa.af(I)Lqz;")
    public class436 method7604() {
        return null;
    }

    @ObfuscatedName("qa.an(I)[B")
    public byte[] method7602() throws UnsupportedEncodingException {
        return this.method7619().getBytes("UTF-8");
    }

    @ObfuscatedName("qa.au(I)Ljava/lang/String;")
    public String method7619() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field4713.entrySet().iterator();
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
