package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("rf")
public class class461 {

    @ObfuscatedName("rf.am")
    public final Map field4921 = new HashMap();

    @ObfuscatedName("rf.ax")
    public final Map field4924 = new HashMap();

    @ObfuscatedName("rf.aq")
    public final DecimalFormat field4925 = new DecimalFormat();

    public class461() {
        this.field4925.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("rf.ac(Ljavax/net/ssl/HttpsURLConnection;B)V")
    public void method7921(HttpsURLConnection arg0) {
        Iterator var2 = this.field4921.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("rf.ae(I)Ljava/util/Map;")
    public Map method7906() {
        return this.field4921;
    }

    @ObfuscatedName("rf.ag(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method7907(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4921.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("rf.am(Ljava/lang/String;I)V")
    public void method7908(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4921.remove(arg0);
        }
    }

    @ObfuscatedName("rf.ax(Lrg;Ljava/lang/String;I)V")
    public void method7909(class460 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method7902(), arg1);
        this.method7907("Authorization", var3);
    }

    @ObfuscatedName("rf.aq(Ljava/lang/String;I)V")
    public void method7910(String arg0) {
        this.method7909(class460.field4917, arg0);
    }

    @ObfuscatedName("rf.af(Ljava/lang/String;B)V")
    public void method7905(String arg0) {
        this.method7909(class460.field4916, arg0);
    }

    @ObfuscatedName("rf.at(Lte;S)V")
    public void method7929(class496 arg0) {
        this.field4921.put("Content-Type", arg0.method8309());
    }

    @ObfuscatedName("rf.au(B)V")
    public void method7912() {
        this.field4921.remove("Content-Type");
    }

    @ObfuscatedName("rf.ar(Lte;I)V")
    public void method7914(class496 arg0) {
        this.method7915(arg0, 1.0F);
    }

    @ObfuscatedName("rf.al(Lte;FB)V")
    public void method7915(class496 arg0, float arg1) {
        this.field4924.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method7916();
    }

    @ObfuscatedName("rf.ad(I)V")
    public void method7916() {
        this.field4921.remove("Accept");
        if (!this.field4924.isEmpty()) {
            this.field4921.put("Accept", this.method7917());
        }
    }

    @ObfuscatedName("rf.ah(I)Ljava/lang/String;")
    public String method7917() {
        ArrayList var1 = new ArrayList(this.field4924.entrySet());
        Collections.sort(var1, new class462(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class496) var4.getKey()).method8309());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4925.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
