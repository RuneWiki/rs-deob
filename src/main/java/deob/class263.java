package deob;

import java.util.HashMap;

@ObfuscatedName("jl")
public class class263 {

    @ObfuscatedName("jl.p")
    public class236 field3634;

    @ObfuscatedName("jl.m")
    public class236 field3635;

    @ObfuscatedName("jl.e")
    public HashMap field3636;

    public class263(class236 arg0, class236 arg1) {
        this.field3634 = arg0;
        this.field3635 = arg1;
        this.field3636 = new HashMap();
    }

    @ObfuscatedName("jl.p([Ljq;I)Ljava/util/HashMap;")
    public HashMap method4304(class262[] arg0) {
        HashMap var2 = new HashMap();
        class262[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class262 var5 = var3[var4];
            if (this.field3636.containsKey(var5)) {
                var2.put(var5, this.field3636.get(var5));
            } else {
                class264 var6 = class287.method3675(this.field3634, this.field3635, var5.field3630, "");
                if (var6 != null) {
                    this.field3636.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
