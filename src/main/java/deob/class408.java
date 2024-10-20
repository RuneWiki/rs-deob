package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("pj")
public class class408 {

    @ObfuscatedName("pj.as")
    public final Map field4542 = new HashMap();

    @ObfuscatedName("pj.ax")
    public final Map field4541 = new HashMap();

    @ObfuscatedName("pj.ap")
    public final DecimalFormat field4540 = new DecimalFormat();

    public class408() {
        this.field4540.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("pj.at(Ljavax/net/ssl/HttpsURLConnection;I)V")
    public void method6985(HttpsURLConnection arg0) {
        Iterator var2 = this.field4542.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("pj.an(I)Ljava/util/Map;")
    public Map method6986() {
        return this.field4542;
    }

    @ObfuscatedName("pj.av(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method6987(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4542.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("pj.as(Ljava/lang/String;I)V")
    public void method6988(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4542.remove(arg0);
        }
    }

    @ObfuscatedName("pj.ax(Lpt;Ljava/lang/String;B)V")
    public void method6989(class407 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method6980(), arg1);
        this.method6987("Authorization", var3);
    }

    @ObfuscatedName("pj.ap(Ljava/lang/String;I)V")
    public void method7023(String arg0) {
        this.method6989(class407.field4537, arg0);
    }

    @ObfuscatedName("pj.ab(Ljava/lang/String;B)V")
    public void method6991(String arg0) {
        this.method6989(class407.field4536, arg0);
    }

    @ObfuscatedName("pj.ak(Lro;I)V")
    public void method6992(class449 arg0) {
        this.field4542.put("Content-Type", arg0.method7516());
    }

    @ObfuscatedName("pj.ae(B)V")
    public void method6990() {
        this.field4542.remove("Content-Type");
    }

    @ObfuscatedName("pj.af(Lro;I)V")
    public void method6994(class449 arg0) {
        this.method7012(arg0, 1.0F);
    }

    @ObfuscatedName("pj.ao(Lro;FB)V")
    public void method7012(class449 arg0, float arg1) {
        this.field4541.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method6996();
    }

    @ObfuscatedName("pj.aa(B)V")
    public void method6996() {
        this.field4542.remove("Accept");
        if (!this.field4541.isEmpty()) {
            this.field4542.put("Accept", this.method7011());
        }
    }

    @ObfuscatedName("pj.aj(I)Ljava/lang/String;")
    public String method7011() {
        ArrayList var1 = new ArrayList(this.field4541.entrySet());
        Collections.sort(var1, new class409(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class449) var4.getKey()).method7516());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4540.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
