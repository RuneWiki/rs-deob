package deob;

import java.util.HashMap;

@ObfuscatedName("jc")
public class class264 {

    @ObfuscatedName("jc.j")
    public class237 field3625;

    @ObfuscatedName("jc.h")
    public class237 field3622;

    @ObfuscatedName("jc.f")
    public HashMap field3624;

    public class264(class237 arg0, class237 arg1) {
        this.field3625 = arg0;
        this.field3622 = arg1;
        this.field3624 = new HashMap();
    }

    @ObfuscatedName("jc.j([Ljy;I)Ljava/util/HashMap;")
    public HashMap method4401(class263[] arg0) {
        HashMap var2 = new HashMap();
        class263[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class263 var5 = var3[var4];
            if (this.field3624.containsKey(var5)) {
                var2.put(var5, this.field3624.get(var5));
            } else {
                class265 var6 = class288.method336(this.field3625, this.field3622, var5.field3609, "");
                if (var6 != null) {
                    this.field3624.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
