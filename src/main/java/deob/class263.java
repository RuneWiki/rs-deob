package deob;

import java.util.HashMap;

@ObfuscatedName("ju")
public class class263 {

    @ObfuscatedName("ju.i")
    public class236 field3631;

    @ObfuscatedName("ju.c")
    public class236 field3632;

    @ObfuscatedName("ju.e")
    public HashMap field3630;

    public class263(class236 arg0, class236 arg1) {
        this.field3631 = arg0;
        this.field3632 = arg1;
        this.field3630 = new HashMap();
    }

    @ObfuscatedName("ju.i([Ljk;I)Ljava/util/HashMap;")
    public HashMap method4361(class262[] arg0) {
        HashMap var2 = new HashMap();
        class262[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class262 var5 = var3[var4];
            if (this.field3630.containsKey(var5)) {
                var2.put(var5, this.field3630.get(var5));
            } else {
                class264 var6 = Statics.method444(this.field3631, this.field3632, var5.field3625, "");
                if (var6 != null) {
                    this.field3630.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
