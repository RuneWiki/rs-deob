package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("rw")
public class class458 {

    @ObfuscatedName("rw.ak")
    public final Map field4893 = new HashMap();

    @ObfuscatedName("rw.ap")
    public final Map field4894 = new HashMap();

    @ObfuscatedName("rw.an")
    public final DecimalFormat field4896 = new DecimalFormat();

    public class458() {
        this.field4896.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("rw.aq(Ljavax/net/ssl/HttpsURLConnection;I)V")
    public void method7672(HttpsURLConnection arg0) {
        Iterator var2 = this.field4893.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("rw.ad(I)Ljava/util/Map;")
    public Map method7689() {
        return this.field4893;
    }

    @ObfuscatedName("rw.ag(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method7692(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4893.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("rw.ak(Ljava/lang/String;I)V")
    public void method7706(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4893.remove(arg0);
        }
    }

    @ObfuscatedName("rw.ap(Lrr;Ljava/lang/String;I)V")
    public void method7703(class457 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method7670(), arg1);
        this.method7692("Authorization", var3);
    }

    @ObfuscatedName("rw.an(Ljava/lang/String;I)V")
    public void method7709(String arg0) {
        this.method7703(class457.field4890, arg0);
    }

    @ObfuscatedName("rw.aj(Ljava/lang/String;I)V")
    public void method7697(String arg0) {
        this.method7703(class457.field4887, arg0);
    }

    @ObfuscatedName("rw.av(Lsb;B)V")
    public void method7671(class493 arg0) {
        this.field4893.put("Content-Type", arg0.method8073());
    }

    @ObfuscatedName("rw.ab(I)V")
    public void method7704() {
        this.field4893.remove("Content-Type");
    }

    @ObfuscatedName("rw.ai(Lsb;I)V")
    public void method7681(class493 arg0) {
        this.method7705(arg0, 1.0F);
    }

    @ObfuscatedName("rw.ae(Lsb;FI)V")
    public void method7705(class493 arg0, float arg1) {
        this.field4894.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method7682();
    }

    @ObfuscatedName("rw.au(S)V")
    public void method7682() {
        this.field4893.remove("Accept");
        if (!this.field4894.isEmpty()) {
            this.field4893.put("Accept", this.method7676());
        }
    }

    @ObfuscatedName("rw.ah(B)Ljava/lang/String;")
    public String method7676() {
        ArrayList var1 = new ArrayList(this.field4894.entrySet());
        Collections.sort(var1, new class459(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class493) var4.getKey()).method8073());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4896.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
