package deob;

import java.util.HashMap;

@ObfuscatedName("mj")
public class class357 {

    @ObfuscatedName("mj.f")
    public class253 field4054;

    @ObfuscatedName("mj.o")
    public class253 field4053;

    @ObfuscatedName("mj.u")
    public HashMap field4052;

    public class357(class253 arg0, class253 arg1) {
        this.field4054 = arg0;
        this.field4053 = arg1;
        this.field4052 = new HashMap();
    }

    @ObfuscatedName("mj.f([Lmv;I)Ljava/util/HashMap;")
    public HashMap method5606(class358[] arg0) {
        HashMap var2 = new HashMap();
        class358[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class358 var5 = var3[var4];
            if (this.field4052.containsKey(var5)) {
                var2.put(var5, this.field4052.get(var5));
            } else {
                class299 var6 = class396.method5055(this.field4054, this.field4053, var5.field4058, "");
                if (var6 != null) {
                    this.field4052.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
