package deob;

import java.util.HashMap;

@ObfuscatedName("nd")
public class class376 {

    @ObfuscatedName("nd.l")
    public class290 field4190;

    @ObfuscatedName("nd.q")
    public class290 field4188;

    @ObfuscatedName("nd.f")
    public HashMap field4187;

    public class376(class290 arg0, class290 arg1) {
        this.field4190 = arg0;
        this.field4188 = arg1;
        this.field4187 = new HashMap();
    }

    @ObfuscatedName("nd.l([Lnx;I)Ljava/util/HashMap;")
    public HashMap method6026(class377[] arg0) {
        HashMap var2 = new HashMap();
        class377[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class377 var5 = var3[var4];
            if (this.field4187.containsKey(var5)) {
                var2.put(var5, this.field4187.get(var5));
            } else {
                class290 var6 = this.field4190;
                class290 var7 = this.field4188;
                String var8 = var5.field4197;
                int var9 = var6.method4771(var8);
                int var10 = var6.method4848(var9, "");
                class315 var11 = class415.method2057(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field4187.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
