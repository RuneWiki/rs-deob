package deob;

import java.util.HashMap;

@ObfuscatedName("km")
public class class299 {

    @ObfuscatedName("km.f")
    public class250 field3746;

    @ObfuscatedName("km.l")
    public class250 field3744;

    @ObfuscatedName("km.w")
    public HashMap field3745;

    public class299(class250 arg0, class250 arg1) {
        this.field3746 = arg0;
        this.field3744 = arg1;
        this.field3745 = new HashMap();
    }

    @ObfuscatedName("km.f([Lkq;I)Ljava/util/HashMap;")
    public HashMap method5186(class298[] arg0) {
        HashMap var2 = new HashMap();
        class298[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class298 var5 = var3[var4];
            if (this.field3745.containsKey(var5)) {
                var2.put(var5, this.field3745.get(var5));
            } else {
                class250 var6 = this.field3746;
                class250 var7 = this.field3744;
                String var8 = var5.field3737;
                int var9 = var6.method4312(var8);
                int var10 = var6.method4291(var9, "");
                class301 var11 = class325.method708(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3745.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
