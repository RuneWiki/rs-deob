package deob;

import java.util.HashMap;

@ObfuscatedName("ju")
public class class274 {

    @ObfuscatedName("ju.a")
    public class247 field3704;

    @ObfuscatedName("ju.w")
    public class247 field3702;

    @ObfuscatedName("ju.e")
    public HashMap field3703;

    public class274(class247 arg0, class247 arg1) {
        this.field3704 = arg0;
        this.field3702 = arg1;
        this.field3703 = new HashMap();
    }

    @ObfuscatedName("ju.a([Ljl;I)Ljava/util/HashMap;")
    public HashMap method4499(class273[] arg0) {
        HashMap var2 = new HashMap();
        class273[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class273 var5 = var3[var4];
            if (this.field3703.containsKey(var5)) {
                var2.put(var5, this.field3703.get(var5));
            } else {
                class275 var6 = class300.method4620(this.field3704, this.field3702, var5.field3696, "");
                if (var6 != null) {
                    this.field3703.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
