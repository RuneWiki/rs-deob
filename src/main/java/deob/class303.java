package deob;

import java.util.HashMap;

@ObfuscatedName("kf")
public class class303 {

    @ObfuscatedName("kf.x")
    public class244 field3670;

    @ObfuscatedName("kf.m")
    public class244 field3669;

    @ObfuscatedName("kf.k")
    public HashMap field3668;

    public class303(class244 arg0, class244 arg1) {
        this.field3670 = arg0;
        this.field3669 = arg1;
        this.field3668 = new HashMap();
    }

    @ObfuscatedName("kf.x([Lka;I)Ljava/util/HashMap;")
    public HashMap method4962(class302[] arg0) {
        HashMap var2 = new HashMap();
        class302[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class302 var5 = var3[var4];
            if (this.field3668.containsKey(var5)) {
                var2.put(var5, this.field3668.get(var5));
            } else {
                class305 var6 = class336.method575(this.field3670, this.field3669, var5.field3661, "");
                if (var6 != null) {
                    this.field3668.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
