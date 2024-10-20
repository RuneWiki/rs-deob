package deob;

import java.util.HashMap;

@ObfuscatedName("kb")
public class class299 {

    @ObfuscatedName("kb.c")
    public class250 field3723;

    @ObfuscatedName("kb.q")
    public class250 field3724;

    @ObfuscatedName("kb.m")
    public HashMap field3725;

    public class299(class250 arg0, class250 arg1) {
        this.field3723 = arg0;
        this.field3724 = arg1;
        this.field3725 = new HashMap();
    }

    @ObfuscatedName("kb.c([Lkq;I)Ljava/util/HashMap;")
    public HashMap method5130(class298[] arg0) {
        HashMap var2 = new HashMap();
        class298[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class298 var5 = var3[var4];
            if (this.field3725.containsKey(var5)) {
                var2.put(var5, this.field3725.get(var5));
            } else {
                class250 var6 = this.field3723;
                class250 var7 = this.field3724;
                String var8 = var5.field3711;
                int var9 = var6.method4228(var8);
                int var10 = var6.method4255(var9, "");
                class301 var11;
                if (class325.method2825(var6, var9, var10)) {
                    var11 = class325.method287(var7.method4210(var9, var10));
                } else {
                    var11 = null;
                }
                if (var11 != null) {
                    this.field3725.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
