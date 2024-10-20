package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("qb")
public class class421 {

    @ObfuscatedName("qb.am")
    public final Map field4601 = new HashMap();

    @ObfuscatedName("qb.as")
    public final Map field4602 = new HashMap();

    @ObfuscatedName("qb.aj")
    public final DecimalFormat field4603 = new DecimalFormat();

    public class421() {
        this.field4603.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("qb.aw(Ljavax/net/ssl/HttpsURLConnection;B)V")
    public void method7055(HttpsURLConnection arg0) {
        Iterator var2 = this.field4601.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("qb.ay(I)Ljava/util/Map;")
    public Map method7074() {
        return this.field4601;
    }

    @ObfuscatedName("qb.ar(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method7057(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4601.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("qb.am(Ljava/lang/String;B)V")
    public void method7058(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4601.remove(arg0);
        }
    }

    @ObfuscatedName("qb.as(Lqc;Ljava/lang/String;I)V")
    public void method7076(class420 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method7048(), arg1);
        this.method7057("Authorization", var3);
    }

    @ObfuscatedName("qb.aj(Ljava/lang/String;I)V")
    public void method7060(String arg0) {
        this.method7076(class420.field4597, arg0);
    }

    @ObfuscatedName("qb.ag(Ljava/lang/String;I)V")
    public void method7061(String arg0) {
        this.method7076(class420.field4593, arg0);
    }

    @ObfuscatedName("qb.az(Lrs;I)V")
    public void method7062(class462 arg0) {
        this.field4601.put("Content-Type", arg0.method7617());
    }

    @ObfuscatedName("qb.av(I)V")
    public void method7063() {
        this.field4601.remove("Content-Type");
    }

    @ObfuscatedName("qb.ap(Lrs;B)V")
    public void method7064(class462 arg0) {
        this.method7065(arg0, 1.0F);
    }

    @ObfuscatedName("qb.aq(Lrs;FI)V")
    public void method7065(class462 arg0, float arg1) {
        this.field4602.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method7088();
    }

    @ObfuscatedName("qb.at(B)V")
    public void method7088() {
        this.field4601.remove("Accept");
        if (!this.field4602.isEmpty()) {
            this.field4601.put("Accept", this.method7067());
        }
    }

    @ObfuscatedName("qb.ah(I)Ljava/lang/String;")
    public String method7067() {
        ArrayList var1 = new ArrayList(this.field4602.entrySet());
        Collections.sort(var1, new class422(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class462) var4.getKey()).method7617());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4603.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
