package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("qy")
public class class440 {

    @ObfuscatedName("qy.at")
    public final Map field4743 = new HashMap();

    @ObfuscatedName("qy.an")
    public final Map field4742 = new HashMap();

    @ObfuscatedName("qy.ao")
    public final DecimalFormat field4745 = new DecimalFormat();

    public class440() {
        this.field4745.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("qy.az(Ljavax/net/ssl/HttpsURLConnection;I)V")
    public void method7262(HttpsURLConnection arg0) {
        Iterator var2 = this.field4743.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("qy.ah(B)Ljava/util/Map;")
    public Map method7264() {
        return this.field4743;
    }

    @ObfuscatedName("qy.af(Ljava/lang/String;Ljava/lang/String;B)V")
    public void method7282(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4743.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("qy.at(Ljava/lang/String;B)V")
    public void method7265(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4743.remove(arg0);
        }
    }

    @ObfuscatedName("qy.an(Lqg;Ljava/lang/String;I)V")
    public void method7266(class439 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method7258(), arg1);
        this.method7282("Authorization", var3);
    }

    @ObfuscatedName("qy.ao(Ljava/lang/String;B)V")
    public void method7267(String arg0) {
        this.method7266(class439.field4736, arg0);
    }

    @ObfuscatedName("qy.ab(Ljava/lang/String;I)V")
    public void method7286(String arg0) {
        this.method7266(class439.field4737, arg0);
    }

    @ObfuscatedName("qy.aw(Lsv;I)V")
    public void method7270(class481 arg0) {
        this.field4743.put("Content-Type", arg0.method7803());
    }

    @ObfuscatedName("qy.ad(I)V")
    public void method7303() {
        this.field4743.remove("Content-Type");
    }

    @ObfuscatedName("qy.al(Lsv;I)V")
    public void method7271(class481 arg0) {
        this.method7272(arg0, 1.0F);
    }

    @ObfuscatedName("qy.as(Lsv;FI)V")
    public void method7272(class481 arg0, float arg1) {
        this.field4742.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method7273();
    }

    @ObfuscatedName("qy.ag(B)V")
    public void method7273() {
        this.field4743.remove("Accept");
        if (!this.field4742.isEmpty()) {
            this.field4743.put("Accept", this.method7298());
        }
    }

    @ObfuscatedName("qy.ai(I)Ljava/lang/String;")
    public String method7298() {
        ArrayList var1 = new ArrayList(this.field4742.entrySet());
        Collections.sort(var1, new class441(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class481) var4.getKey()).method7803());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4745.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
