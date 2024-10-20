package deob;

import java.util.HashMap;

@ObfuscatedName("ki")
public class class293 {

    @ObfuscatedName("ki.f")
    public class234 field3659;

    @ObfuscatedName("ki.i")
    public class234 field3655;

    @ObfuscatedName("ki.y")
    public HashMap field3656;

    public class293(class234 arg0, class234 arg1) {
        this.field3659 = arg0;
        this.field3655 = arg1;
        this.field3656 = new HashMap();
    }

    @ObfuscatedName("ki.f([Lkk;I)Ljava/util/HashMap;")
    public HashMap method4951(class292[] arg0) {
        HashMap var2 = new HashMap();
        class292[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class292 var5 = var3[var4];
            if (this.field3656.containsKey(var5)) {
                var2.put(var5, this.field3656.get(var5));
            } else {
                class294 var6 = class326.method5428(this.field3659, this.field3655, var5.field3645, "");
                if (var6 != null) {
                    this.field3656.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
