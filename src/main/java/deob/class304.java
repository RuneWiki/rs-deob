package deob;

import java.util.HashMap;

@ObfuscatedName("kv")
public class class304 {

    @ObfuscatedName("kv.h")
    public class245 field3714;

    @ObfuscatedName("kv.v")
    public class245 field3711;

    @ObfuscatedName("kv.x")
    public HashMap field3712;

    public class304(class245 arg0, class245 arg1) {
        this.field3714 = arg0;
        this.field3711 = arg1;
        this.field3712 = new HashMap();
    }

    @ObfuscatedName("kv.h([Lkr;S)Ljava/util/HashMap;")
    public HashMap method4941(class303[] arg0) {
        HashMap var2 = new HashMap();
        class303[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class303 var5 = var3[var4];
            if (this.field3712.containsKey(var5)) {
                var2.put(var5, this.field3712.get(var5));
            } else {
                class306 var6 = class337.method3256(this.field3714, this.field3711, var5.field3707, "");
                if (var6 != null) {
                    this.field3712.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
