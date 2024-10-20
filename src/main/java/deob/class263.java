package deob;

import java.util.HashMap;

@ObfuscatedName("jn")
public class class263 {

    @ObfuscatedName("jn.c")
    public class236 field3618;

    @ObfuscatedName("jn.o")
    public class236 field3616;

    @ObfuscatedName("jn.i")
    public HashMap field3615;

    public class263(class236 arg0, class236 arg1) {
        this.field3618 = arg0;
        this.field3616 = arg1;
        this.field3615 = new HashMap();
    }

    @ObfuscatedName("jn.c([Ljp;I)Ljava/util/HashMap;")
    public HashMap method4311(class262[] arg0) {
        HashMap var2 = new HashMap();
        class262[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class262 var5 = var3[var4];
            if (this.field3615.containsKey(var5)) {
                var2.put(var5, this.field3615.get(var5));
            } else {
                class236 var6 = this.field3618;
                class236 var7 = this.field3616;
                String var8 = var5.field3607;
                int var9 = var6.method3730(var8);
                int var10 = var6.method3731(var9, "");
                class264 var11 = class287.method4090(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3615.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
