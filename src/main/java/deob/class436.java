package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("qp")
public class class436 {

    @ObfuscatedName("qp.aj")
    public final Map field4668 = new HashMap();

    @ObfuscatedName("qp.aq")
    public final Map field4671 = new HashMap();

    @ObfuscatedName("qp.ar")
    public final DecimalFormat field4672 = new DecimalFormat();

    public class436() {
        this.field4672.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("qp.am(Ljavax/net/ssl/HttpsURLConnection;S)V")
    public void method7374(HttpsURLConnection arg0) {
        Iterator var2 = this.field4668.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("qp.ap(B)Ljava/util/Map;")
    public Map method7375() {
        return this.field4668;
    }

    @ObfuscatedName("qp.af(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method7376(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4668.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("qp.aj(Ljava/lang/String;I)V")
    public void method7378(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4668.remove(arg0);
        }
    }

    @ObfuscatedName("qp.aq(Lqo;Ljava/lang/String;I)V")
    public void method7411(class435 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method7370(), arg1);
        this.method7376("Authorization", var3);
    }

    @ObfuscatedName("qp.ar(Ljava/lang/String;I)V")
    public void method7379(String arg0) {
        this.method7411(class435.field4667, arg0);
    }

    @ObfuscatedName("qp.ag(Ljava/lang/String;B)V")
    public void method7382(String arg0) {
        this.method7411(class435.field4666, arg0);
    }

    @ObfuscatedName("qp.ao(Lsy;I)V")
    public void method7381(class477 arg0) {
        this.field4668.put("Content-Type", arg0.method7932());
    }

    @ObfuscatedName("qp.ae(B)V")
    public void method7397() {
        this.field4668.remove("Content-Type");
    }

    @ObfuscatedName("qp.aa(Lsy;I)V")
    public void method7383(class477 arg0) {
        this.method7384(arg0, 1.0F);
    }

    @ObfuscatedName("qp.au(Lsy;FI)V")
    public void method7384(class477 arg0, float arg1) {
        this.field4671.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method7385();
    }

    @ObfuscatedName("qp.an(I)V")
    public void method7385() {
        this.field4668.remove("Accept");
        if (!this.field4671.isEmpty()) {
            this.field4668.put("Accept", this.method7413());
        }
    }

    @ObfuscatedName("qp.ad(B)Ljava/lang/String;")
    public String method7413() {
        ArrayList var1 = new ArrayList(this.field4671.entrySet());
        Collections.sort(var1, new class437(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class477) var4.getKey()).method7932());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4672.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
