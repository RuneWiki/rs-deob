package deob;

import java.util.HashMap;

@ObfuscatedName("kv")
public class class297 {

    @ObfuscatedName("kv.z")
    public class248 field3682;

    @ObfuscatedName("kv.w")
    public class248 field3680;

    @ObfuscatedName("kv.s")
    public HashMap field3681;

    public class297(class248 arg0, class248 arg1) {
        this.field3682 = arg0;
        this.field3680 = arg1;
        this.field3681 = new HashMap();
    }

    @ObfuscatedName("kv.z([Lkc;B)Ljava/util/HashMap;")
    public HashMap method5079(class296[] arg0) {
        HashMap var2 = new HashMap();
        class296[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class296 var5 = var3[var4];
            if (this.field3681.containsKey(var5)) {
                var2.put(var5, this.field3681.get(var5));
            } else {
                class248 var6 = this.field3682;
                class248 var7 = this.field3680;
                String var8 = var5.field3667;
                int var9 = var6.method4264(var8);
                int var10 = var6.method4265(var9, "");
                class299 var11 = class320.method979(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3681.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
