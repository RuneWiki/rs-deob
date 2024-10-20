package deob;

import java.util.HashMap;

@ObfuscatedName("kv")
public class class303 {

    @ObfuscatedName("kv.m")
    public class244 field3693;

    @ObfuscatedName("kv.o")
    public class244 field3691;

    @ObfuscatedName("kv.q")
    public HashMap field3690;

    public class303(class244 arg0, class244 arg1) {
        this.field3693 = arg0;
        this.field3691 = arg1;
        this.field3690 = new HashMap();
    }

    @ObfuscatedName("kv.m([Lke;B)Ljava/util/HashMap;")
    public HashMap method5043(class302[] arg0) {
        HashMap var2 = new HashMap();
        class302[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class302 var5 = var3[var4];
            if (this.field3690.containsKey(var5)) {
                var2.put(var5, this.field3690.get(var5));
            } else {
                class244 var6 = this.field3693;
                class244 var7 = this.field3691;
                String var8 = var5.field3686;
                int var9 = var6.method3909(var8);
                int var10 = var6.method3910(var9, "");
                class305 var11 = class336.method3098(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3690.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
