package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("pu")
public class class391 {

    @ObfuscatedName("pu.ab")
    public final Map field4466 = new HashMap();

    @ObfuscatedName("pu.an")
    public final Map field4469 = new HashMap();

    @ObfuscatedName("pu.ao")
    public final DecimalFormat field4470 = new DecimalFormat();

    public class391() {
        this.field4470.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("pu.aj(Ljavax/net/ssl/HttpsURLConnection;I)V")
    public void method6754(HttpsURLConnection arg0) {
        Iterator var2 = this.field4466.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("pu.al(B)Ljava/util/Map;")
    public Map method6755() {
        return this.field4466;
    }

    @ObfuscatedName("pu.ac(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method6758(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4466.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("pu.ab(Ljava/lang/String;I)V")
    public void method6757(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4466.remove(arg0);
        }
    }

    @ObfuscatedName("pu.an(Loy;Ljava/lang/String;B)V")
    public void method6792(class390 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method6750(), arg1);
        this.method6758("Authorization", var3);
    }

    @ObfuscatedName("pu.ao(Ljava/lang/String;I)V")
    public void method6759(String arg0) {
        this.method6792(class390.field4464, arg0);
    }

    @ObfuscatedName("pu.av(Ljava/lang/String;I)V")
    public void method6756(String arg0) {
        this.method6792(class390.field4462, arg0);
    }

    @ObfuscatedName("pu.aq(Lqn;B)V")
    public void method6761(class432 arg0) {
        this.field4466.put("Content-Type", arg0.method7299());
    }

    @ObfuscatedName("pu.ap(B)V")
    public void method6762() {
        this.field4466.remove("Content-Type");
    }

    @ObfuscatedName("pu.ar(Lqn;I)V")
    public void method6763(class432 arg0) {
        this.method6766(arg0, 1.0F);
    }

    @ObfuscatedName("pu.ak(Lqn;FB)V")
    public void method6766(class432 arg0, float arg1) {
        this.field4469.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method6765();
    }

    @ObfuscatedName("pu.ax(B)V")
    public void method6765() {
        this.field4466.remove("Accept");
        if (!this.field4469.isEmpty()) {
            this.field4466.put("Accept", this.method6760());
        }
    }

    @ObfuscatedName("pu.as(B)Ljava/lang/String;")
    public String method6760() {
        ArrayList var1 = new ArrayList(this.field4469.entrySet());
        Collections.sort(var1, new class392(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class432) var4.getKey()).method7299());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4470.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
