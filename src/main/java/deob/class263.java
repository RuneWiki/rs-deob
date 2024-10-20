package deob;

import java.util.HashMap;

@ObfuscatedName("jy")
public class class263 {

    @ObfuscatedName("jy.e")
    public class236 field3619;

    @ObfuscatedName("jy.o")
    public class236 field3615;

    @ObfuscatedName("jy.m")
    public HashMap field3616;

    public class263(class236 arg0, class236 arg1) {
        this.field3619 = arg0;
        this.field3615 = arg1;
        this.field3616 = new HashMap();
    }

    @ObfuscatedName("jy.e([Ljn;I)Ljava/util/HashMap;")
    public HashMap method4382(class262[] arg0) {
        HashMap var2 = new HashMap();
        class262[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class262 var5 = var3[var4];
            if (this.field3616.containsKey(var5)) {
                var2.put(var5, this.field3616.get(var5));
            } else {
                class264 var6 = Statics.method4661(this.field3619, this.field3615, var5.field3609, "");
                if (var6 != null) {
                    this.field3616.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
