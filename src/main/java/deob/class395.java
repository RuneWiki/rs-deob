package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("pc")
public class class395 {

    @ObfuscatedName("pc.ac")
    public final Map field4522 = new HashMap();

    @ObfuscatedName("pc.au")
    public final Map field4526 = new HashMap();

    @ObfuscatedName("pc.ab")
    public final DecimalFormat field4527 = new DecimalFormat();

    public class395() {
        this.field4527.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("pc.af(Ljavax/net/ssl/HttpsURLConnection;I)V")
    public void method6975(HttpsURLConnection arg0) {
        Iterator var2 = this.field4522.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("pc.an(I)Ljava/util/Map;")
    public Map method6976() {
        return this.field4522;
    }

    @ObfuscatedName("pc.aw(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method6977(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4522.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("pc.ac(Ljava/lang/String;S)V")
    public void method7007(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4522.remove(arg0);
        }
    }

    @ObfuscatedName("pc.au(Lpm;Ljava/lang/String;B)V")
    public void method6979(class394 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method6971(), arg1);
        this.method6977("Authorization", var3);
    }

    @ObfuscatedName("pc.ab(Ljava/lang/String;B)V")
    public void method6995(String arg0) {
        this.method6979(class394.field4520, arg0);
    }

    @ObfuscatedName("pc.aq(Ljava/lang/String;I)V")
    public void method6981(String arg0) {
        this.method6979(class394.field4519, arg0);
    }

    @ObfuscatedName("pc.al(Lqz;I)V")
    public void method6982(class436 arg0) {
        this.field4522.put("Content-Type", arg0.method7596());
    }

    @ObfuscatedName("pc.at(I)V")
    public void method6983() {
        this.field4522.remove("Content-Type");
    }

    @ObfuscatedName("pc.aa(Lqz;B)V")
    public void method6984(class436 arg0) {
        this.method6985(arg0, 1.0F);
    }

    @ObfuscatedName("pc.ay(Lqz;FI)V")
    public void method6985(class436 arg0, float arg1) {
        this.field4526.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method6986();
    }

    @ObfuscatedName("pc.ao(I)V")
    public void method6986() {
        this.field4522.remove("Accept");
        if (!this.field4526.isEmpty()) {
            this.field4522.put("Accept", this.method7015());
        }
    }

    @ObfuscatedName("pc.ax(I)Ljava/lang/String;")
    public String method7015() {
        ArrayList var1 = new ArrayList(this.field4526.entrySet());
        Collections.sort(var1, new class396(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class436) var4.getKey()).method7596());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4527.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
