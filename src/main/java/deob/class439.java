package deob;

import java.util.HashMap;

@ObfuscatedName("pz")
public class class439 {

    @ObfuscatedName("pz.h")
    public class333 field4801;

    @ObfuscatedName("pz.e")
    public class333 field4798;

    @ObfuscatedName("pz.v")
    public HashMap field4797;

    public class439(class333 arg0, class333 arg1) {
        this.field4801 = arg0;
        this.field4798 = arg1;
        this.field4797 = new HashMap();
    }

    @ObfuscatedName("pz.h([Lpt;I)Ljava/util/HashMap;")
    public HashMap method7476(class440[] arg0) {
        HashMap var2 = new HashMap();
        class440[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class440 var5 = var3[var4];
            if (this.field4797.containsKey(var5)) {
                var2.put(var5, this.field4797.get(var5));
            } else {
                class333 var6 = this.field4801;
                class333 var7 = this.field4798;
                String var8 = var5.field4808;
                int var9 = var6.method5861(var8);
                int var10 = var6.method5868(var9, "");
                class368 var11 = class482.method6718(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field4797.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
