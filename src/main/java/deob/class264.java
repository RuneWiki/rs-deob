package deob;

import java.util.HashMap;

@ObfuscatedName("jy")
public class class264 {

    @ObfuscatedName("jy.e")
    public class237 field3628;

    @ObfuscatedName("jy.n")
    public class237 field3625;

    @ObfuscatedName("jy.g")
    public HashMap field3627;

    public class264(class237 arg0, class237 arg1) {
        this.field3628 = arg0;
        this.field3625 = arg1;
        this.field3627 = new HashMap();
    }

    @ObfuscatedName("jy.e([Ljn;I)Ljava/util/HashMap;")
    public HashMap method4439(class263[] arg0) {
        HashMap var2 = new HashMap();
        class263[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class263 var5 = var3[var4];
            if (this.field3627.containsKey(var5)) {
                var2.put(var5, this.field3627.get(var5));
            } else {
                class237 var6 = this.field3628;
                class237 var7 = this.field3625;
                String var8 = var5.field3620;
                int var9 = var6.method3829(var8);
                int var10 = var6.method3834(var9, "");
                class265 var11 = class288.method3771(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3627.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
