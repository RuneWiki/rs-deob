package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("nx")
public class class388 {

    @ObfuscatedName("nx.s")
    public final Map field4505 = new HashMap();

    @ObfuscatedName("nx.z")
    public final Map field4507 = new HashMap();

    @ObfuscatedName("nx.j")
    public final DecimalFormat field4509 = new DecimalFormat();

    public class388() {
        this.field4509.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("nx.f(Ljavax/net/ssl/HttpsURLConnection;I)V")
    public void method6844(HttpsURLConnection arg0) {
        Iterator var2 = this.field4505.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("nx.w(B)Ljava/util/Map;")
    public Map method6845() {
        return this.field4505;
    }

    @ObfuscatedName("nx.v(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method6882(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4505.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("nx.s(Ljava/lang/String;I)V")
    public void method6847(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4505.remove(arg0);
        }
    }

    @ObfuscatedName("nx.z(Lnb;Ljava/lang/String;I)V")
    public void method6876(class387 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method6837(), arg1);
        this.method6882("Authorization", var3);
    }

    @ObfuscatedName("nx.j(Ljava/lang/String;I)V")
    public void method6871(String arg0) {
        this.method6876(class387.field4500, arg0);
    }

    @ObfuscatedName("nx.i(Ljava/lang/String;I)V")
    public void method6874(String arg0) {
        this.method6876(class387.field4499, arg0);
    }

    @ObfuscatedName("nx.n(Lpf;I)V")
    public void method6851(class428 arg0) {
        this.field4505.put("Content-Type", arg0.method7397());
    }

    @ObfuscatedName("nx.l(S)V")
    public void method6852() {
        this.field4505.remove("Content-Type");
    }

    @ObfuscatedName("nx.k(Lpf;I)V")
    public void method6853(class428 arg0) {
        this.method6854(arg0, 1.0F);
    }

    @ObfuscatedName("nx.c(Lpf;FI)V")
    public void method6854(class428 arg0, float arg1) {
        this.field4507.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method6870();
    }

    @ObfuscatedName("nx.r(I)V")
    public void method6870() {
        this.field4505.remove("Accept");
        if (!this.field4507.isEmpty()) {
            this.field4505.put("Accept", this.method6856());
        }
    }

    @ObfuscatedName("nx.b(I)Ljava/lang/String;")
    public String method6856() {
        ArrayList var1 = new ArrayList(this.field4507.entrySet());
        Collections.sort(var1, new class389(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class428) var4.getKey()).method7397());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4509.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
