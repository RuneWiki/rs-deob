package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("qv")
public class class435 {

    @ObfuscatedName("qv.ax")
    public final Map field4643 = new HashMap();

    @ObfuscatedName("qv.ao")
    public final Map field4644 = new HashMap();

    @ObfuscatedName("qv.ah")
    public final DecimalFormat field4645 = new DecimalFormat();

    public class435() {
        this.field4645.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("qv.ac(Ljavax/net/ssl/HttpsURLConnection;B)V")
    public void method7161(HttpsURLConnection arg0) {
        Iterator var2 = this.field4643.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("qv.al(I)Ljava/util/Map;")
    public Map method7198() {
        return this.field4643;
    }

    @ObfuscatedName("qv.ak(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method7193(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4643.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("qv.ax(Ljava/lang/String;I)V")
    public void method7164(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4643.remove(arg0);
        }
    }

    @ObfuscatedName("qv.ao(Lqf;Ljava/lang/String;B)V")
    public void method7187(class434 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method7157(), arg1);
        this.method7193("Authorization", var3);
    }

    @ObfuscatedName("qv.ah(Ljava/lang/String;I)V")
    public void method7165(String arg0) {
        this.method7187(class434.field4638, arg0);
    }

    @ObfuscatedName("qv.ar(Ljava/lang/String;I)V")
    public void method7185(String arg0) {
        this.method7187(class434.field4637, arg0);
    }

    @ObfuscatedName("qv.ab(Lst;I)V")
    public void method7168(class476 arg0) {
        this.field4643.put("Content-Type", arg0.method7714());
    }

    @ObfuscatedName("qv.am(B)V")
    public void method7169() {
        this.field4643.remove("Content-Type");
    }

    @ObfuscatedName("qv.av(Lst;I)V")
    public void method7170(class476 arg0) {
        this.method7171(arg0, 1.0F);
    }

    @ObfuscatedName("qv.ag(Lst;FI)V")
    public void method7171(class476 arg0, float arg1) {
        this.field4644.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method7172();
    }

    @ObfuscatedName("qv.aa(B)V")
    public void method7172() {
        this.field4643.remove("Accept");
        if (!this.field4644.isEmpty()) {
            this.field4643.put("Accept", this.method7173());
        }
    }

    @ObfuscatedName("qv.ap(B)Ljava/lang/String;")
    public String method7173() {
        ArrayList var1 = new ArrayList(this.field4644.entrySet());
        Collections.sort(var1, new class436(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class476) var4.getKey()).method7714());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4645.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
