package deob;

import java.util.HashMap;

@ObfuscatedName("mk")
public class class359 {

    @ObfuscatedName("mk.f")
    public class276 field4053;

    @ObfuscatedName("mk.e")
    public class276 field4052;

    @ObfuscatedName("mk.v")
    public HashMap field4054;

    public class359(class276 arg0, class276 arg1) {
        this.field4053 = arg0;
        this.field4052 = arg1;
        this.field4054 = new HashMap();
    }

    @ObfuscatedName("mk.f([Lmb;B)Ljava/util/HashMap;")
    public HashMap method5642(class360[] arg0) {
        HashMap var2 = new HashMap();
        class360[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class360 var5 = var3[var4];
            if (this.field4054.containsKey(var5)) {
                var2.put(var5, this.field4054.get(var5));
            } else {
                class301 var6 = class398.method3303(this.field4053, this.field4052, var5.field4063, "");
                if (var6 != null) {
                    this.field4054.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
