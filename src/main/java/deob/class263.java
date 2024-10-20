package deob;

import java.util.HashMap;

@ObfuscatedName("jf")
public class class263 {

    @ObfuscatedName("jf.d")
    public class236 field3638;

    @ObfuscatedName("jf.k")
    public class236 field3637;

    @ObfuscatedName("jf.e")
    public HashMap field3640;

    public class263(class236 arg0, class236 arg1) {
        this.field3638 = arg0;
        this.field3637 = arg1;
        this.field3640 = new HashMap();
    }

    @ObfuscatedName("jf.d([Ljk;I)Ljava/util/HashMap;")
    public HashMap method4462(class262[] arg0) {
        HashMap var2 = new HashMap();
        class262[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class262 var5 = var3[var4];
            if (this.field3640.containsKey(var5)) {
                var2.put(var5, this.field3640.get(var5));
            } else {
                class264 var6 = class288.method642(this.field3638, this.field3637, var5.field3631, "");
                if (var6 != null) {
                    this.field3640.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
