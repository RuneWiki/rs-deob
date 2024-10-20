package deob;

import java.util.HashMap;

@ObfuscatedName("ku")
public class class293 {

    @ObfuscatedName("ku.c")
    public class234 field3650;

    @ObfuscatedName("ku.x")
    public class234 field3647;

    @ObfuscatedName("ku.t")
    public HashMap field3646;

    public class293(class234 arg0, class234 arg1) {
        this.field3650 = arg0;
        this.field3647 = arg1;
        this.field3646 = new HashMap();
    }

    @ObfuscatedName("ku.c([Lkn;B)Ljava/util/HashMap;")
    public HashMap method4937(class292[] arg0) {
        HashMap var2 = new HashMap();
        class292[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class292 var5 = var3[var4];
            if (this.field3646.containsKey(var5)) {
                var2.put(var5, this.field3646.get(var5));
            } else {
                class295 var6 = class326.method2833(this.field3650, this.field3647, var5.field3639, "");
                if (var6 != null) {
                    this.field3646.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
