package deob;

import java.util.HashMap;

@ObfuscatedName("kz")
public class class294 {

    @ObfuscatedName("kz.c")
    public class235 field3665;

    @ObfuscatedName("kz.t")
    public class235 field3666;

    @ObfuscatedName("kz.o")
    public HashMap field3667;

    public class294(class235 arg0, class235 arg1) {
        this.field3665 = arg0;
        this.field3666 = arg1;
        this.field3667 = new HashMap();
    }

    @ObfuscatedName("kz.c([Lkq;I)Ljava/util/HashMap;")
    public HashMap method4962(class293[] arg0) {
        HashMap var2 = new HashMap();
        class293[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class293 var5 = var3[var4];
            if (this.field3667.containsKey(var5)) {
                var2.put(var5, this.field3667.get(var5));
            } else {
                class235 var6 = this.field3665;
                class235 var7 = this.field3666;
                String var8 = var5.field3656;
                int var9 = var6.method3854(var8);
                int var10 = var6.method3855(var9, "");
                class296 var11 = class327.method3063(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3667.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
