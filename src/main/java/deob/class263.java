package deob;

import java.util.HashMap;

@ObfuscatedName("jo")
public class class263 {

    @ObfuscatedName("jo.i")
    public class236 field3637;

    @ObfuscatedName("jo.w")
    public class236 field3638;

    @ObfuscatedName("jo.a")
    public HashMap field3639;

    public class263(class236 arg0, class236 arg1) {
        this.field3637 = arg0;
        this.field3638 = arg1;
        this.field3639 = new HashMap();
    }

    @ObfuscatedName("jo.i([Ljr;B)Ljava/util/HashMap;")
    public HashMap method4373(class262[] arg0) {
        HashMap var2 = new HashMap();
        class262[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class262 var5 = var3[var4];
            if (this.field3639.containsKey(var5)) {
                var2.put(var5, this.field3639.get(var5));
            } else {
                class236 var6 = this.field3637;
                class236 var7 = this.field3638;
                String var8 = var5.field3632;
                int var9 = var6.method3800(var8);
                int var10 = var6.method3785(var9, "");
                class264 var11;
                if (class287.method3742(var6, var9, var10)) {
                    byte[] var12 = var7.method3768(var9, var10);
                    class264 var13;
                    if (var12 == null) {
                        var13 = null;
                    } else {
                        class264 var14 = new class264(var12, Statics.field3800, Statics.field3801, Statics.field240, Statics.field3147, Statics.field3746, Statics.field2610);
                        class287.method105();
                        var13 = var14;
                    }
                    var11 = var13;
                } else {
                    var11 = null;
                }
                if (var11 != null) {
                    this.field3639.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
