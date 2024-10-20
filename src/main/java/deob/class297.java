package deob;

import java.util.HashMap;

@ObfuscatedName("kl")
public class class297 {

    @ObfuscatedName("kl.w")
    public class248 field3695;

    @ObfuscatedName("kl.m")
    public class248 field3690;

    @ObfuscatedName("kl.q")
    public HashMap field3692;

    public class297(class248 arg0, class248 arg1) {
        this.field3695 = arg0;
        this.field3690 = arg1;
        this.field3692 = new HashMap();
    }

    @ObfuscatedName("kl.w([Lkt;I)Ljava/util/HashMap;")
    public HashMap method5095(class296[] arg0) {
        HashMap var2 = new HashMap();
        class296[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class296 var5 = var3[var4];
            if (this.field3692.containsKey(var5)) {
                var2.put(var5, this.field3692.get(var5));
            } else {
                class299 var6 = class320.method5324(this.field3695, this.field3690, var5.field3687, "");
                if (var6 != null) {
                    this.field3692.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
