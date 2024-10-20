package deob;

import java.util.HashMap;

@ObfuscatedName("kc")
public class class299 {

    @ObfuscatedName("kc.g")
    public class250 field3752;

    @ObfuscatedName("kc.r")
    public class250 field3751;

    @ObfuscatedName("kc.e")
    public HashMap field3753;

    public class299(class250 arg0, class250 arg1) {
        this.field3752 = arg0;
        this.field3751 = arg1;
        this.field3753 = new HashMap();
    }

    @ObfuscatedName("kc.g([Lkm;I)Ljava/util/HashMap;")
    public HashMap method5321(class298[] arg0) {
        HashMap var2 = new HashMap();
        class298[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class298 var5 = var3[var4];
            if (this.field3753.containsKey(var5)) {
                var2.put(var5, this.field3753.get(var5));
            } else {
                class250 var6 = this.field3752;
                class250 var7 = this.field3751;
                String var8 = var5.field3749;
                int var9 = var6.method4432(var8);
                int var10 = var6.method4454(var9, "");
                class301 var11;
                if (class325.method213(var6, var9, var10)) {
                    byte[] var12 = var7.method4438(var9, var10);
                    class301 var13;
                    if (var12 == null) {
                        var13 = null;
                    } else {
                        class301 var14 = new class301(var12, Statics.field3891, Statics.field3893, Statics.field3896, Statics.field3335, Statics.field3895, Statics.field3898);
                        Statics.field3891 = null;
                        Statics.field3893 = null;
                        Statics.field3896 = null;
                        Statics.field3335 = null;
                        Statics.field3895 = null;
                        Statics.field3898 = (byte[][]) null;
                        var13 = var14;
                    }
                    var11 = var13;
                } else {
                    var11 = null;
                }
                if (var11 != null) {
                    this.field3753.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
