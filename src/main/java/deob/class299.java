package deob;

import java.util.HashMap;

@ObfuscatedName("ke")
public class class299 {

    @ObfuscatedName("ke.v")
    public class250 field3713;

    @ObfuscatedName("ke.s")
    public class250 field3712;

    @ObfuscatedName("ke.o")
    public HashMap field3714;

    public class299(class250 arg0, class250 arg1) {
        this.field3713 = arg0;
        this.field3712 = arg1;
        this.field3714 = new HashMap();
    }

    @ObfuscatedName("ke.v([Lki;I)Ljava/util/HashMap;")
    public HashMap method5139(class298[] arg0) {
        HashMap var2 = new HashMap();
        class298[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class298 var5 = var3[var4];
            if (this.field3714.containsKey(var5)) {
                var2.put(var5, this.field3714.get(var5));
            } else {
                class301 var6 = Statics.method4254(this.field3713, this.field3712, var5.field3704, "");
                if (var6 != null) {
                    this.field3714.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
