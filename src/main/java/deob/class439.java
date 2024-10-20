package deob;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfuscatedName("qw")
public class class439 {

    @ObfuscatedName("qw.ai")
    public final Map field4708 = new HashMap();

    @ObfuscatedName("qw.ar")
    public final Map field4706 = new HashMap();

    @ObfuscatedName("qw.as")
    public final DecimalFormat field4707 = new DecimalFormat();

    public class439() {
        this.field4707.setMaximumFractionDigits(2);
    }

    @ObfuscatedName("qw.aq(Ljavax/net/ssl/HttpsURLConnection;I)V")
    public void method7390(HttpsURLConnection arg0) {
        Iterator var2 = this.field4708.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            arg0.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
        }
    }

    @ObfuscatedName("qw.aw(I)Ljava/util/Map;")
    public Map method7412() {
        return this.field4708;
    }

    @ObfuscatedName("qw.al(Ljava/lang/String;Ljava/lang/String;B)V")
    public void method7392(String arg0, String arg1) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4708.put(arg0, arg1 == null ? "" : arg1);
        }
    }

    @ObfuscatedName("qw.ai(Ljava/lang/String;B)V")
    public void method7393(String arg0) {
        if (arg0 != null && !arg0.isEmpty()) {
            this.field4708.remove(arg0);
        }
    }

    @ObfuscatedName("qw.ar(Lqn;Ljava/lang/String;I)V")
    public void method7394(class438 arg0, String arg1) {
        String var3 = String.format("%s %s", arg0.method7385(), arg1);
        this.method7392("Authorization", var3);
    }

    @ObfuscatedName("qw.as(Ljava/lang/String;I)V")
    public void method7395(String arg0) {
        this.method7394(class438.field4700, arg0);
    }

    @ObfuscatedName("qw.aa(Ljava/lang/String;B)V")
    public void method7396(String arg0) {
        this.method7394(class438.field4699, arg0);
    }

    @ObfuscatedName("qw.az(Lsp;S)V")
    public void method7397(class480 arg0) {
        this.field4708.put("Content-Type", arg0.method7937());
    }

    @ObfuscatedName("qw.ao(B)V")
    public void method7404() {
        this.field4708.remove("Content-Type");
    }

    @ObfuscatedName("qw.au(Lsp;I)V")
    public void method7399(class480 arg0) {
        this.method7403(arg0, 1.0F);
    }

    @ObfuscatedName("qw.ak(Lsp;FB)V")
    public void method7403(class480 arg0, float arg1) {
        this.field4706.put(arg0, Math.max(0.0F, Math.min(1.0F, arg1)));
        this.method7433();
    }

    @ObfuscatedName("qw.ah(I)V")
    public void method7433() {
        this.field4708.remove("Accept");
        if (!this.field4706.isEmpty()) {
            this.field4708.put("Accept", this.method7402());
        }
    }

    @ObfuscatedName("qw.aj(B)Ljava/lang/String;")
    public String method7402() {
        ArrayList var1 = new ArrayList(this.field4706.entrySet());
        Collections.sort(var1, new class440(this));
        StringBuilder var2 = new StringBuilder();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            Entry var4 = (Entry) var3.next();
            if (var2.length() > 0) {
                var2.append(",");
            }
            var2.append(((class480) var4.getKey()).method7937());
            float var5 = (Float) var4.getValue();
            if (var5 < 1.0F) {
                String var6 = this.field4707.format((double) var5);
                var2.append(";q=").append(var6);
            }
        }
        return var2.toString();
    }
}
