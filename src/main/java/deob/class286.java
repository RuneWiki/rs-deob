package deob;

import java.util.HashMap;

@ObfuscatedName("js")
public class class286 {

    @ObfuscatedName("js.s")
    public class247 field3759;

    @ObfuscatedName("js.g")
    public class247 field3758;

    @ObfuscatedName("js.m")
    public HashMap field3757;

    public class286(class247 arg0, class247 arg1) {
        this.field3759 = arg0;
        this.field3758 = arg1;
        this.field3757 = new HashMap();
    }

    @ObfuscatedName("js.s([Ljx;B)Ljava/util/HashMap;")
    public HashMap method4986(class285[] arg0) {
        HashMap var2 = new HashMap();
        class285[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class285 var5 = var3[var4];
            if (this.field3757.containsKey(var5)) {
                var2.put(var5, this.field3757.get(var5));
            } else {
                class247 var6 = this.field3759;
                class247 var7 = this.field3758;
                String var8 = var5.field3750;
                int var9 = var6.method4201(var8);
                int var10 = var6.method4217(var9, "");
                class287 var11;
                if (class311.method456(var6, var9, var10)) {
                    byte[] var12 = var7.method4231(var9, var10);
                    class287 var13;
                    if (var12 == null) {
                        var13 = null;
                    } else {
                        class287 var14 = new class287(var12, Statics.field2699, Statics.field3477, Statics.field709, Statics.field3912, Statics.field3787, Statics.field3913);
                        class311.method4929();
                        var13 = var14;
                    }
                    var11 = var13;
                } else {
                    var11 = null;
                }
                if (var11 != null) {
                    this.field3757.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
