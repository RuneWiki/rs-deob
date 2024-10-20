package deob;

import java.util.HashMap;

@ObfuscatedName("jl")
public class class266 {

    @ObfuscatedName("jl.w")
    public class239 field3649;

    @ObfuscatedName("jl.o")
    public class239 field3647;

    @ObfuscatedName("jl.x")
    public HashMap field3646;

    public class266(class239 arg0, class239 arg1) {
        this.field3649 = arg0;
        this.field3647 = arg1;
        this.field3646 = new HashMap();
    }

    @ObfuscatedName("jl.w([Ljg;I)Ljava/util/HashMap;")
    public HashMap method4388(class265[] arg0) {
        HashMap var2 = new HashMap();
        class265[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class265 var5 = var3[var4];
            if (this.field3646.containsKey(var5)) {
                var2.put(var5, this.field3646.get(var5));
            } else {
                class239 var6 = this.field3649;
                class239 var7 = this.field3647;
                String var8 = var5.field3642;
                int var9 = var6.method3742(var8);
                int var10 = var6.method3743(var9, "");
                class267 var11;
                if (class290.method3719(var6, var9, var10)) {
                    var11 = class290.method130(var7.method3754(var9, var10));
                } else {
                    var11 = null;
                }
                if (var11 != null) {
                    this.field3646.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
