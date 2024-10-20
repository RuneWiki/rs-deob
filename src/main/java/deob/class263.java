package deob;

import java.util.HashMap;

@ObfuscatedName("jb")
public class class263 {

    @ObfuscatedName("jb.i")
    public class236 field3631;

    @ObfuscatedName("jb.h")
    public class236 field3630;

    @ObfuscatedName("jb.u")
    public HashMap field3632;

    public class263(class236 arg0, class236 arg1) {
        this.field3631 = arg0;
        this.field3630 = arg1;
        this.field3632 = new HashMap();
    }

    @ObfuscatedName("jb.i([Ljy;I)Ljava/util/HashMap;")
    public HashMap method4436(class262[] arg0) {
        HashMap var2 = new HashMap();
        class262[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class262 var5 = var3[var4];
            if (this.field3632.containsKey(var5)) {
                var2.put(var5, this.field3632.get(var5));
            } else {
                class236 var6 = this.field3631;
                class236 var7 = this.field3630;
                String var8 = var5.field3622;
                int var9 = var6.method3851(var8);
                int var10 = var6.method3852(var9, "");
                class264 var11 = class287.method234(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3632.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
