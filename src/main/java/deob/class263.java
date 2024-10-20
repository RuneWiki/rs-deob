package deob;

import java.util.HashMap;

@ObfuscatedName("jd")
public class class263 {

    @ObfuscatedName("jd.w")
    public class236 field3637;

    @ObfuscatedName("jd.s")
    public class236 field3639;

    @ObfuscatedName("jd.q")
    public HashMap field3638;

    public class263(class236 arg0, class236 arg1) {
        this.field3637 = arg0;
        this.field3639 = arg1;
        this.field3638 = new HashMap();
    }

    @ObfuscatedName("jd.w([Ljz;I)Ljava/util/HashMap;")
    public HashMap method4489(class262[] arg0) {
        HashMap var2 = new HashMap();
        class262[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class262 var5 = var3[var4];
            if (this.field3638.containsKey(var5)) {
                var2.put(var5, this.field3638.get(var5));
            } else {
                class264 var6 = class288.method75(this.field3637, this.field3639, var5.field3630, "");
                if (var6 != null) {
                    this.field3638.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
