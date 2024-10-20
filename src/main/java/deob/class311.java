package deob;

import java.util.HashMap;

@ObfuscatedName("kc")
public class class311 {

    @ObfuscatedName("kc.o")
    public class262 field3893;

    @ObfuscatedName("kc.k")
    public class262 field3891;

    @ObfuscatedName("kc.t")
    public HashMap field3892;

    public class311(class262 arg0, class262 arg1) {
        this.field3893 = arg0;
        this.field3891 = arg1;
        this.field3892 = new HashMap();
    }

    @ObfuscatedName("kc.o([Lkp;I)Ljava/util/HashMap;")
    public HashMap method5069(class310[] arg0) {
        HashMap var2 = new HashMap();
        class310[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class310 var5 = var3[var4];
            if (this.field3892.containsKey(var5)) {
                var2.put(var5, this.field3892.get(var5));
            } else {
                class262 var6 = this.field3893;
                class262 var7 = this.field3891;
                String var8 = var5.field3886;
                int var9 = var6.method4175(var8);
                int var10 = var6.method4176(var9, "");
                class312 var11 = class333.method5066(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3892.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
