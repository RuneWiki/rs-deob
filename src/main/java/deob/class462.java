package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("rl")
public class class462 {

    @ObfuscatedName("rl.aj")
    public final Map field4952 = new HashMap();

    @ObfuscatedName("rl.ai")
    public final Map field4953 = new HashMap();

    @ObfuscatedName("rl.ay")
    public final DecimalFormat field4955 = new DecimalFormat();

    public class462() {
        this.field4955.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("rl.ap(Ljavax/net/ssl/HttpsURLConnection;I)V")
    public void method8157(HttpsURLConnection arg0) {
        Iterator var2 = this.field4952.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("rl.aw(I)Ljava/util/Map;")
    public Map method8158() {
        return this.field4952;
    }

    @ObfuscatedName("rl.ak(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method8159(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4952.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("rl.aj(Ljava/lang/String;I)V")
    public void method8160(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4952.remove(arg0);
        }
    }

    @ObfuscatedName("rl.ai(Lrv;Ljava/lang/String;I)V")
    public void method8161(class461 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method8151(), arg1);
        this.method8159("Authorization", var3);
    }

    @ObfuscatedName("rl.ay(Ljava/lang/String;B)V")
    public void method8184(String arg0) {
        this.method8161(class461.field4950, arg0);
    }

    @ObfuscatedName("rl.as(Ljava/lang/String;I)V")
    public void method8163(String arg0) {
        this.method8161(class461.field4947, arg0);
    }

    @ObfuscatedName("rl.ae(Ltz;I)V")
    public void method8164(class503 arg0) {
        this.field4952.put("Content-Type", arg0.method8603());
    }

    @ObfuscatedName("rl.am(I)V")
    public void method8179() {
        this.field4952.remove("Content-Type");
    }

    @ObfuscatedName("rl.at(Ltz;B)V")
    public void method8166(class503 arg0) {
        this.method8173(arg0, 1.0F);
    }

    @ObfuscatedName("rl.au(Ltz;FB)V")
    public void method8173(class503 arg0, float arg1) {
        this.field4953.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method8185();
    }

    @ObfuscatedName("rl.an(I)V")
    public void method8185() {
        this.field4952.remove("Accept");
        if (!this.field4953.isEmpty()) {
            this.field4952.put("Accept", this.method8183());
        }
    }

    @ObfuscatedName("rl.ao(B)Ljava/lang/String;")
    public String method8183() {
        ArrayList var1 = new ArrayList(this.field4953.entrySet());
        Collections.sort(var1, new class463(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class503) var4.getKey()).method8603());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4955.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
