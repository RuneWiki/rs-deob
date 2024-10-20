package deob;

import java.util.HashMap;

@ObfuscatedName("jy")
public class class263 {

    @ObfuscatedName("jy.d")
    public class236 field3611;

    @ObfuscatedName("jy.q")
    public class236 field3612;

    @ObfuscatedName("jy.x")
    public HashMap field3613;

    public class263(class236 arg0, class236 arg1) {
        this.field3611 = arg0;
        this.field3612 = arg1;
        this.field3613 = new HashMap();
    }

    @ObfuscatedName("jy.d([Ljf;B)Ljava/util/HashMap;")
    public HashMap method4339(class262[] arg0) {
        HashMap var2 = new HashMap();
        class262[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class262 var5 = var3[var4];
            if (this.field3613.containsKey(var5)) {
                var2.put(var5, this.field3613.get(var5));
            } else {
                class264 var6 = class287.method4524(this.field3611, this.field3612, var5.field3607, "");
                if (var6 != null) {
                    this.field3613.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
