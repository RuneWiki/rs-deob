package deob;

import java.util.HashMap;

@ObfuscatedName("sz")
public class class485 {

    @ObfuscatedName("sz.aw")
    public class360 field4947;

    @ObfuscatedName("sz.ay")
    public class360 field4946;

    @ObfuscatedName("sz.ar")
    public HashMap field4948;

    public class485(class360 arg0, class360 arg1) {
        this.field4947 = arg0;
        this.field4946 = arg1;
        this.field4948 = new HashMap();
    }

    @ObfuscatedName("sz.aw([Lsg;I)Ljava/util/HashMap;")
    public HashMap method7932(class486[] arg0) {
        HashMap var2 = new HashMap();
        class486[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class486 var5 = var3[var4];
            if (this.field4948.containsKey(var5)) {
                var2.put(var5, this.field4948.get(var5));
            } else {
                class360 var6 = this.field4947;
                class360 var7 = this.field4946;
                String var8 = var5.field4955;
                class395 var9;
                if (var6.method6135(var8, "")) {
                    int var10 = var6.method6129(var8);
                    int var11 = var6.method6134(var10, "");
                    var9 = class529.method6975(var6, var7, var10, var11);
                } else {
                    var9 = null;
                }
                if (var9 != null) {
                    this.field4948.put(var5, var9);
                    var2.put(var5, var9);
                }
            }
        }
        return var2;
    }
}
