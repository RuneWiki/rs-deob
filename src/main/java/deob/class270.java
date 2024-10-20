package deob;

import java.util.HashMap;

@ObfuscatedName("ju")
public class class270 {

    @ObfuscatedName("ju.d")
    public class243 field3696;

    @ObfuscatedName("ju.x")
    public class243 field3694;

    @ObfuscatedName("ju.k")
    public HashMap field3693;

    public class270(class243 arg0, class243 arg1) {
        this.field3696 = arg0;
        this.field3694 = arg1;
        this.field3693 = new HashMap();
    }

    @ObfuscatedName("ju.d([Ljk;I)Ljava/util/HashMap;")
    public HashMap method4567(class269[] arg0) {
        HashMap var2 = new HashMap();
        class269[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class269 var5 = var3[var4];
            if (this.field3693.containsKey(var5)) {
                var2.put(var5, this.field3693.get(var5));
            } else {
                class271 var6 = class296.method1454(this.field3696, this.field3694, var5.field3690, "");
                if (var6 != null) {
                    this.field3693.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
