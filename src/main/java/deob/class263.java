package deob;

import java.util.HashMap;

@ObfuscatedName("jb")
public class class263 {

    @ObfuscatedName("jb.n")
    public class236 field3645;

    @ObfuscatedName("jb.p")
    public class236 field3642;

    @ObfuscatedName("jb.i")
    public HashMap field3643;

    public class263(class236 arg0, class236 arg1) {
        this.field3645 = arg0;
        this.field3642 = arg1;
        this.field3643 = new HashMap();
    }

    @ObfuscatedName("jb.n([Ljj;I)Ljava/util/HashMap;")
    public HashMap method4455(class262[] arg0) {
        HashMap var2 = new HashMap();
        class262[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class262 var5 = var3[var4];
            if (this.field3643.containsKey(var5)) {
                var2.put(var5, this.field3643.get(var5));
            } else {
                class264 var6 = class287.method3821(this.field3645, this.field3642, var5.field3634, "");
                if (var6 != null) {
                    this.field3643.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
