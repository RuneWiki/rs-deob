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
public class class459 {

    @ObfuscatedName("rf.au")
    public final Map field4871 = new HashMap();

    @ObfuscatedName("rf.ax")
    public final Map field4872 = new HashMap();

    @ObfuscatedName("rf.ao")
    public final DecimalFormat field4868 = new DecimalFormat();

    public class459() {
        this.field4868.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("rf.ab(Ljavax/net/ssl/HttpsURLConnection;I)V")
    public void method7774(HttpsURLConnection arg0) {
        Iterator var2 = this.field4871.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("rf.ay(B)Ljava/util/Map;")
    public Map method7775() {
        return this.field4871;
    }

    @ObfuscatedName("rf.an(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method7776(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4871.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("rf.au(Ljava/lang/String;I)V")
    public void method7806(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4871.remove(arg0);
        }
    }

    @ObfuscatedName("rf.ax(Lrb;Ljava/lang/String;I)V")
    public void method7778(class458 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method7771(), arg1);
        this.method7776("Authorization", var3);
    }

    @ObfuscatedName("rf.ao(Ljava/lang/String;I)V")
    public void method7779(String arg0) {
        this.method7778(class458.field4865, arg0);
    }

    @ObfuscatedName("rf.am(Ljava/lang/String;B)V")
    public void method7792(String arg0) {
        this.method7778(class458.field4866, arg0);
    }

    @ObfuscatedName("rf.ac(Lsw;I)V")
    public void method7807(class494 arg0) {
        this.field4871.put("Content-Type", arg0.method8171());
    }

    @ObfuscatedName("rf.ae(I)V")
    public void method7782() {
        this.field4871.remove("Content-Type");
    }

    @ObfuscatedName("rf.ad(Lsw;I)V")
    public void method7783(class494 arg0) {
        this.method7784(arg0, 1.0F);
    }

    @ObfuscatedName("rf.aq(Lsw;FI)V")
    public void method7784(class494 arg0, float arg1) {
        this.field4872.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method7785();
    }

    @ObfuscatedName("rf.al(B)V")
    public void method7785() {
        this.field4871.remove("Accept");
        if (!this.field4872.isEmpty()) {
            this.field4871.put("Accept", this.method7786());
        }
    }

    @ObfuscatedName("rf.aj(I)Ljava/lang/String;")
    public String method7786() {
        ArrayList var1 = new ArrayList(this.field4872.entrySet());
        Collections.sort(var1, new class460(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class494) var4.getKey()).method8171());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4868.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
