package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("qf")
public class class420 {

    @ObfuscatedName("qf.at")
    public final Map field4600 = new HashMap();

    @ObfuscatedName("qf.ac")
    public final Map field4601 = new HashMap();

    @ObfuscatedName("qf.ai")
    public final DecimalFormat field4597 = new DecimalFormat();

    public class420() {
        this.field4597.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("qf.au(Ljavax/net/ssl/HttpsURLConnection;B)V")
    public void method7094(HttpsURLConnection arg0) {
        Iterator var2 = this.field4600.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("qf.ae(I)Ljava/util/Map;")
    public Map method7095() {
        return this.field4600;
    }

    @ObfuscatedName("qf.ao(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method7096(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4600.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("qf.at(Ljava/lang/String;I)V")
    public void method7131(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4600.remove(arg0);
        }
    }

    @ObfuscatedName("qf.ac(Lqn;Ljava/lang/String;B)V")
    public void method7106(class419 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method7091(), arg1);
        this.method7096("Authorization", var3);
    }

    @ObfuscatedName("qf.ai(Ljava/lang/String;I)V")
    public void method7099(String arg0) {
        this.method7106(class419.field4594, arg0);
    }

    @ObfuscatedName("qf.az(Ljava/lang/String;I)V")
    public void method7135(String arg0) {
        this.method7106(class419.field4595, arg0);
    }

    @ObfuscatedName("qf.ap(Lre;I)V")
    public void method7105(class461 arg0) {
        this.field4600.put("Content-Type", arg0.method7642());
    }

    @ObfuscatedName("qf.aa(B)V")
    public void method7102() {
        this.field4600.remove("Content-Type");
    }

    @ObfuscatedName("qf.af(Lre;B)V")
    public void method7103(class461 arg0) {
        this.method7115(arg0, 1.0F);
    }

    @ObfuscatedName("qf.ad(Lre;FI)V")
    public void method7115(class461 arg0, float arg1) {
        this.field4601.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method7110();
    }

    @ObfuscatedName("qf.aq(I)V")
    public void method7110() {
        this.field4600.remove("Accept");
        if (!this.field4601.isEmpty()) {
            this.field4600.put("Accept", this.method7129());
        }
    }

    @ObfuscatedName("qf.al(B)Ljava/lang/String;")
    public String method7129() {
        ArrayList var1 = new ArrayList(this.field4601.entrySet());
        Collections.sort(var1, new class421(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class461) var4.getKey()).method7642());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4597.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
