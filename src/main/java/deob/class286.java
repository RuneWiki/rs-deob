package deob;

import java.util.HashMap;

@ObfuscatedName("je")
public class class286 {

    @ObfuscatedName("je.p")
    public class247 field3736;

    @ObfuscatedName("je.i")
    public class247 field3737;

    @ObfuscatedName("je.w")
    public HashMap field3738;

    public class286(class247 arg0, class247 arg1) {
        this.field3736 = arg0;
        this.field3737 = arg1;
        this.field3738 = new HashMap();
    }

    @ObfuscatedName("je.p([Ljo;B)Ljava/util/HashMap;")
    public HashMap method4803(class285[] arg0) {
        HashMap var2 = new HashMap();
        class285[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class285 var5 = var3[var4];
            if (this.field3738.containsKey(var5)) {
                var2.put(var5, this.field3738.get(var5));
            } else {
                class247 var6 = this.field3736;
                class247 var7 = this.field3737;
                String var8 = var5.field3728;
                int var9 = var6.method4117(var8);
                int var10 = var6.method4050(var9, "");
                class287 var11 = class311.method34(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3738.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
