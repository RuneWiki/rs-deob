package deob;

import java.util.HashMap;

@ObfuscatedName("jy")
public class class263 {

    @ObfuscatedName("jy.a")
    public class236 field3634;

    @ObfuscatedName("jy.j")
    public class236 field3633;

    @ObfuscatedName("jy.n")
    public HashMap field3635;

    public class263(class236 arg0, class236 arg1) {
        this.field3634 = arg0;
        this.field3633 = arg1;
        this.field3635 = new HashMap();
    }

    @ObfuscatedName("jy.a([Ljk;I)Ljava/util/HashMap;")
    public HashMap method4325(class262[] arg0) {
        HashMap var2 = new HashMap();
        class262[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class262 var5 = var3[var4];
            if (this.field3635.containsKey(var5)) {
                var2.put(var5, this.field3635.get(var5));
            } else {
                class236 var6 = this.field3634;
                class236 var7 = this.field3633;
                String var8 = var5.field3631;
                int var9 = var6.method3777(var8);
                int var10 = var6.method3827(var9, "");
                class264 var11;
                if (class287.method3873(var6, var9, var10)) {
                    byte[] var12 = var7.method3787(var9, var10);
                    class264 var13;
                    if (var12 == null) {
                        var13 = null;
                    } else {
                        class264 var14 = new class264(var12, Statics.field3796, Statics.field440, Statics.field3798, Statics.field1406, Statics.field3797, Statics.field2415);
                        class287.method131();
                        var13 = var14;
                    }
                    var11 = var13;
                } else {
                    var11 = null;
                }
                if (var11 != null) {
                    this.field3635.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
