package deob;

import java.util.HashMap;

@ObfuscatedName("mu")
public class class358 {

    @ObfuscatedName("mu.v")
    public class275 field4050;

    @ObfuscatedName("mu.n")
    public class275 field4051;

    @ObfuscatedName("mu.f")
    public HashMap field4052;

    public class358(class275 arg0, class275 arg1) {
        this.field4050 = arg0;
        this.field4051 = arg1;
        this.field4052 = new HashMap();
    }

    @ObfuscatedName("mu.v([Lmv;I)Ljava/util/HashMap;")
    public HashMap method5727(class359[] arg0) {
        HashMap var2 = new HashMap();
        class359[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class359 var5 = var3[var4];
            if (this.field4052.containsKey(var5)) {
                var2.put(var5, this.field4052.get(var5));
            } else {
                class300 var6 = class397.method5364(this.field4050, this.field4051, var5.field4060, "");
                if (var6 != null) {
                    this.field4052.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
