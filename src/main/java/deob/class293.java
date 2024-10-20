package deob;

import java.util.HashMap;

@ObfuscatedName("ko")
public class class293 {

    @ObfuscatedName("ko.a")
    public class234 field3654;

    @ObfuscatedName("ko.t")
    public class234 field3652;

    @ObfuscatedName("ko.n")
    public HashMap field3653;

    public class293(class234 arg0, class234 arg1) {
        this.field3654 = arg0;
        this.field3652 = arg1;
        this.field3653 = new HashMap();
    }

    @ObfuscatedName("ko.a([Lkq;B)Ljava/util/HashMap;")
    public HashMap method4966(class292[] arg0) {
        HashMap var2 = new HashMap();
        class292[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class292 var5 = var3[var4];
            if (this.field3653.containsKey(var5)) {
                var2.put(var5, this.field3653.get(var5));
            } else {
                class234 var6 = this.field3654;
                class234 var7 = this.field3652;
                String var8 = var5.field3648;
                int var9 = var6.method3891(var8);
                int var10 = var6.method3870(var9, "");
                class295 var11 = class326.method4665(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3653.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
