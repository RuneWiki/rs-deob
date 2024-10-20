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
public class class432 {

    @ObfuscatedName("qf.ao")
    public final Map field4638 = new HashMap();

    @ObfuscatedName("qf.ab")
    public final Map field4639 = new HashMap();

    @ObfuscatedName("qf.au")
    public final DecimalFormat field4641 = new DecimalFormat();

    public class432() {
        this.field4641.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("qf.at(Ljavax/net/ssl/HttpsURLConnection;I)V")
    public void method7243(HttpsURLConnection arg0) {
        Iterator var2 = this.field4638.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("qf.ah(I)Ljava/util/Map;")
    public Map method7238() {
        return this.field4638;
    }

    @ObfuscatedName("qf.ar(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method7239(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4638.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("qf.ao(Ljava/lang/String;B)V")
    public void method7240(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4638.remove(arg0);
        }
    }

    @ObfuscatedName("qf.ab(Lqr;Ljava/lang/String;I)V")
    public void method7261(class431 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method7233(), arg1);
        this.method7239("Authorization", var3);
    }

    @ObfuscatedName("qf.au(Ljava/lang/String;S)V")
    public void method7242(String arg0) {
        this.method7261(class431.field4635, arg0);
    }

    @ObfuscatedName("qf.aa(Ljava/lang/String;I)V")
    public void method7262(String arg0) {
        this.method7261(class431.field4634, arg0);
    }

    @ObfuscatedName("qf.ac(Lsi;B)V")
    public void method7266(class473 arg0) {
        this.field4638.put("Content-Type", arg0.method7785());
    }

    @ObfuscatedName("qf.al(B)V")
    public void method7245() {
        this.field4638.remove("Content-Type");
    }

    @ObfuscatedName("qf.az(Lsi;B)V")
    public void method7246(class473 arg0) {
        this.method7247(arg0, 1.0F);
    }

    @ObfuscatedName("qf.ap(Lsi;FI)V")
    public void method7247(class473 arg0, float arg1) {
        this.field4639.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method7248();
    }

    @ObfuscatedName("qf.av(I)V")
    public void method7248() {
        this.field4638.remove("Accept");
        if (!this.field4639.isEmpty()) {
            this.field4638.put("Accept", this.method7249());
        }
    }

    @ObfuscatedName("qf.ax(I)Ljava/lang/String;")
    public String method7249() {
        ArrayList var1 = new ArrayList(this.field4639.entrySet());
        Collections.sort(var1, new class433(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class473) var4.getKey()).method7785());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4641.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
