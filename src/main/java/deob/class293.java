package deob;

import java.util.HashMap;

@ObfuscatedName("kr")
public class class293 {

    @ObfuscatedName("kr.z")
    public class234 field3659;

    @ObfuscatedName("kr.n")
    public class234 field3658;

    @ObfuscatedName("kr.v")
    public HashMap field3657;

    public class293(class234 arg0, class234 arg1) {
        this.field3659 = arg0;
        this.field3658 = arg1;
        this.field3657 = new HashMap();
    }

    @ObfuscatedName("kr.z([Lko;I)Ljava/util/HashMap;")
    public HashMap method4830(class292[] arg0) {
        HashMap var2 = new HashMap();
        class292[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class292 var5 = var3[var4];
            if (this.field3657.containsKey(var5)) {
                var2.put(var5, this.field3657.get(var5));
            } else {
                class234 var6 = this.field3659;
                class234 var7 = this.field3658;
                String var8 = var5.field3652;
                int var9 = var6.method3765(var8);
                int var10 = var6.method3745(var9, "");
                class295 var11 = class326.method4568(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3657.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
