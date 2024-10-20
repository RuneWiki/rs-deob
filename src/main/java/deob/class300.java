package deob;

import java.util.HashMap;

@ObfuscatedName("kz")
public class class300 {

    @ObfuscatedName("kz.m")
    public class245 field3746;

    @ObfuscatedName("kz.f")
    public class245 field3744;

    @ObfuscatedName("kz.q")
    public HashMap field3747;

    public class300(class245 arg0, class245 arg1) {
        this.field3746 = arg0;
        this.field3744 = arg1;
        this.field3747 = new HashMap();
    }

    @ObfuscatedName("kz.m([Lkx;I)Ljava/util/HashMap;")
    public HashMap method5184(class299[] arg0) {
        HashMap var2 = new HashMap();
        class299[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class299 var5 = var3[var4];
            if (this.field3747.containsKey(var5)) {
                var2.put(var5, this.field3747.get(var5));
            } else {
                class245 var6 = this.field3746;
                class245 var7 = this.field3744;
                String var8 = var5.field3733;
                int var9 = var6.method4174(var8);
                int var10 = var6.method4175(var9, "");
                class302 var11 = class329.method5358(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3747.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
