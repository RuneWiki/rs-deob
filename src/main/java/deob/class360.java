package deob;

import java.util.HashMap;

@ObfuscatedName("mt")
public class class360 {

    @ObfuscatedName("mt.s")
    public class277 field4082;

    @ObfuscatedName("mt.t")
    public class277 field4081;

    @ObfuscatedName("mt.v")
    public HashMap field4083;

    public class360(class277 arg0, class277 arg1) {
        this.field4082 = arg0;
        this.field4081 = arg1;
        this.field4083 = new HashMap();
    }

    @ObfuscatedName("mt.s([Lmk;B)Ljava/util/HashMap;")
    public HashMap method5704(class361[] arg0) {
        HashMap var2 = new HashMap();
        class361[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class361 var5 = var3[var4];
            if (this.field4083.containsKey(var5)) {
                var2.put(var5, this.field4083.get(var5));
            } else {
                class302 var6 = class399.method3957(this.field4082, this.field4081, var5.field4090, "");
                if (var6 != null) {
                    this.field4083.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
