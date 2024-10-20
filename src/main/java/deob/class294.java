package deob;

import java.util.HashMap;

@ObfuscatedName("ku")
public class class294 {

    @ObfuscatedName("ku.q")
    public class234 field3689;

    @ObfuscatedName("ku.w")
    public class234 field3688;

    @ObfuscatedName("ku.e")
    public HashMap field3691;

    public class294(class234 arg0, class234 arg1) {
        this.field3689 = arg0;
        this.field3688 = arg1;
        this.field3691 = new HashMap();
    }

    @ObfuscatedName("ku.q([Lkd;I)Ljava/util/HashMap;")
    public HashMap method4902(class293[] arg0) {
        HashMap var2 = new HashMap();
        class293[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class293 var5 = var3[var4];
            if (this.field3691.containsKey(var5)) {
                var2.put(var5, this.field3691.get(var5));
            } else {
                class296 var6 = class327.method4839(this.field3689, this.field3688, var5.field3683, "");
                if (var6 != null) {
                    this.field3691.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
