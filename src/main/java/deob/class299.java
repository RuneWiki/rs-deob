package deob;

import java.util.HashMap;

@ObfuscatedName("ks")
public class class299 {

    @ObfuscatedName("ks.f")
    public class250 field3743;

    @ObfuscatedName("ks.h")
    public class250 field3740;

    @ObfuscatedName("ks.e")
    public HashMap field3742;

    public class299(class250 arg0, class250 arg1) {
        this.field3743 = arg0;
        this.field3740 = arg1;
        this.field3742 = new HashMap();
    }

    @ObfuscatedName("ks.f([Lkn;I)Ljava/util/HashMap;")
    public HashMap method5105(class298[] arg0) {
        HashMap var2 = new HashMap();
        class298[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class298 var5 = var3[var4];
            if (this.field3742.containsKey(var5)) {
                var2.put(var5, this.field3742.get(var5));
            } else {
                class250 var6 = this.field3743;
                class250 var7 = this.field3740;
                String var8 = var5.field3734;
                int var9 = var6.method4285(var8);
                int var10 = var6.method4286(var9, "");
                class301 var11;
                if (class325.method91(var6, var9, var10)) {
                    var11 = class325.method518(var7.method4267(var9, var10));
                } else {
                    var11 = null;
                }
                if (var11 != null) {
                    this.field3742.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
