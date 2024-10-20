package deob;

import java.util.HashMap;

@ObfuscatedName("jk")
public class class274 {

    @ObfuscatedName("jk.n")
    public class247 field3714;

    @ObfuscatedName("jk.v")
    public class247 field3715;

    @ObfuscatedName("jk.y")
    public HashMap field3718;

    public class274(class247 arg0, class247 arg1) {
        this.field3714 = arg0;
        this.field3715 = arg1;
        this.field3718 = new HashMap();
    }

    @ObfuscatedName("jk.n([Ljf;I)Ljava/util/HashMap;")
    public HashMap method4527(class273[] arg0) {
        HashMap var2 = new HashMap();
        class273[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class273 var5 = var3[var4];
            if (this.field3718.containsKey(var5)) {
                var2.put(var5, this.field3718.get(var5));
            } else {
                class275 var6 = class300.method3910(this.field3714, this.field3715, var5.field3706, "");
                if (var6 != null) {
                    this.field3718.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
