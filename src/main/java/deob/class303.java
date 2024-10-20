package deob;

import java.util.HashMap;

@ObfuscatedName("kl")
public class class303 {

    @ObfuscatedName("kl.z")
    public class244 field3691;

    @ObfuscatedName("kl.k")
    public class244 field3694;

    @ObfuscatedName("kl.s")
    public HashMap field3693;

    public class303(class244 arg0, class244 arg1) {
        this.field3691 = arg0;
        this.field3694 = arg1;
        this.field3693 = new HashMap();
    }

    @ObfuscatedName("kl.z([Lkz;I)Ljava/util/HashMap;")
    public HashMap method5031(class302[] arg0) {
        HashMap var2 = new HashMap();
        class302[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class302 var5 = var3[var4];
            if (this.field3693.containsKey(var5)) {
                var2.put(var5, this.field3693.get(var5));
            } else {
                class305 var6 = class336.method5521(this.field3691, this.field3694, var5.field3687, "");
                if (var6 != null) {
                    this.field3693.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
