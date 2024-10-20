package deob;

import java.util.HashMap;

@ObfuscatedName("kf")
public class class293 {

    @ObfuscatedName("kf.u")
    public class234 field3668;

    @ObfuscatedName("kf.f")
    public class234 field3669;

    @ObfuscatedName("kf.b")
    public HashMap field3670;

    public class293(class234 arg0, class234 arg1) {
        this.field3668 = arg0;
        this.field3669 = arg1;
        this.field3670 = new HashMap();
    }

    @ObfuscatedName("kf.u([Lka;B)Ljava/util/HashMap;")
    public HashMap method4973(class292[] arg0) {
        HashMap var2 = new HashMap();
        class292[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class292 var5 = var3[var4];
            if (this.field3670.containsKey(var5)) {
                var2.put(var5, this.field3670.get(var5));
            } else {
                class234 var6 = this.field3668;
                class234 var7 = this.field3669;
                String var8 = var5.field3665;
                int var9 = var6.method3917(var8);
                int var10 = var6.method3901(var9, "");
                class295 var11 = class326.method1044(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3670.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
