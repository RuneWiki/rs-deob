package deob;

import java.util.HashMap;

@ObfuscatedName("jp")
public class class270 {

    @ObfuscatedName("jp.m")
    public class243 field3694;

    @ObfuscatedName("jp.p")
    public class243 field3689;

    @ObfuscatedName("jp.i")
    public HashMap field3691;

    public class270(class243 arg0, class243 arg1) {
        this.field3694 = arg0;
        this.field3689 = arg1;
        this.field3691 = new HashMap();
    }

    @ObfuscatedName("jp.m([Ljd;I)Ljava/util/HashMap;")
    public HashMap method4544(class269[] arg0) {
        HashMap var2 = new HashMap();
        class269[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class269 var5 = var3[var4];
            if (this.field3691.containsKey(var5)) {
                var2.put(var5, this.field3691.get(var5));
            } else {
                class271 var6 = class296.method4720(this.field3694, this.field3689, var5.field3681, "");
                if (var6 != null) {
                    this.field3691.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
