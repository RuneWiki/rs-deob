package deob;

import java.util.HashMap;

@ObfuscatedName("ke")
public class class303 {

    @ObfuscatedName("ke.a")
    public class255 field3759;

    @ObfuscatedName("ke.s")
    public class255 field3760;

    @ObfuscatedName("ke.g")
    public HashMap field3761;

    public class303(class255 arg0, class255 arg1) {
        this.field3759 = arg0;
        this.field3760 = arg1;
        this.field3761 = new HashMap();
    }

    @ObfuscatedName("ke.a([Lkw;I)Ljava/util/HashMap;")
    public HashMap method5301(class302[] arg0) {
        HashMap var2 = new HashMap();
        class302[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class302 var5 = var3[var4];
            if (this.field3761.containsKey(var5)) {
                var2.put(var5, this.field3761.get(var5));
            } else {
                class255 var6 = this.field3759;
                class255 var7 = this.field3760;
                String var8 = var5.field3751;
                int var9 = var6.method4439(var8);
                int var10 = var6.method4444(var9, "");
                class305 var11 = class329.method2537(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3761.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
