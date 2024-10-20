package deob;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("tk")
public class class499 implements class497 {

    @ObfuscatedName("tk.ac")
    public final Map field5094;

    public class499(Map arg0) {
        this.field5094 = arg0;
    }

    @ObfuscatedName("tk.ac(I)Lte;")
    public class496 method8312() {
        return null;
    }

    @ObfuscatedName("tk.ae(I)[B")
    public byte[] method8311() throws UnsupportedEncodingException {
        return this.method8331().getBytes("UTF-8");
    }

    @ObfuscatedName("tk.at(S)Ljava/lang/String;")
    public String method8331() throws UnsupportedEncodingException {
        StringBuilder var1 = new StringBuilder();
        Iterator var2 = this.field5094.entrySet().iterator();
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
