package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("rt")
public class class457 {

    @ObfuscatedName("rt.az")
    public final Map field4870 = new HashMap();

    @ObfuscatedName("rt.af")
    public final Map field4873 = new HashMap();

    @ObfuscatedName("rt.aa")
    public final DecimalFormat field4872 = new DecimalFormat();

    public class457() {
        this.field4872.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("rt.ak(Ljavax/net/ssl/HttpsURLConnection;I)V")
    public void method7703(HttpsURLConnection arg0) {
        Iterator var2 = this.field4870.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("rt.al(I)Ljava/util/Map;")
    public Map method7704() {
        return this.field4870;
    }

    @ObfuscatedName("rt.aj(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method7739(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4870.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("rt.az(Ljava/lang/String;B)V")
    public void method7706(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4870.remove(arg0);
        }
    }

    @ObfuscatedName("rt.af(Lru;Ljava/lang/String;I)V")
    public void method7705(class456 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method7697(), arg1);
        this.method7739("Authorization", var3);
    }

    @ObfuscatedName("rt.aa(Ljava/lang/String;I)V")
    public void method7708(String arg0) {
        this.method7705(class456.field4863, arg0);
    }

    @ObfuscatedName("rt.at(Ljava/lang/String;B)V")
    public void method7709(String arg0) {
        this.method7705(class456.field4862, arg0);
    }

    @ObfuscatedName("rt.ab(Lsd;B)V")
    public void method7710(class492 arg0) {
        this.field4870.put("Content-Type", arg0.method8138());
    }

    @ObfuscatedName("rt.ac(I)V")
    public void method7711() {
        this.field4870.remove("Content-Type");
    }

    @ObfuscatedName("rt.ao(Lsd;I)V")
    public void method7712(class492 arg0) {
        this.method7713(arg0, 1.0F);
    }

    @ObfuscatedName("rt.ah(Lsd;FI)V")
    public void method7713(class492 arg0, float arg1) {
        this.field4873.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method7728();
    }

    @ObfuscatedName("rt.av(B)V")
    public void method7728() {
        this.field4870.remove("Accept");
        if (!this.field4873.isEmpty()) {
            this.field4870.put("Accept", this.method7736());
        }
    }

    @ObfuscatedName("rt.aq(B)Ljava/lang/String;")
    public String method7736() {
        ArrayList var1 = new ArrayList(this.field4873.entrySet());
        Collections.sort(var1, new class458(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class492) var4.getKey()).method8138());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4872.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
