package deob;

import java.util.HashMap;

@ObfuscatedName("ov")
public class class398 {

    @ObfuscatedName("ov.c")
    public class307 field4413;

    @ObfuscatedName("ov.l")
    public class307 field4414;

    @ObfuscatedName("ov.s")
    public HashMap field4417;

    public class398(class307 arg0, class307 arg1) {
        this.field4413 = arg0;
        this.field4414 = arg1;
        this.field4417 = new HashMap();
    }

    @ObfuscatedName("ov.c([Lox;I)Ljava/util/HashMap;")
    public HashMap method6414(class399[] arg0) {
        HashMap var2 = new HashMap();
        class399[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class399 var5 = var3[var4];
            if (this.field4417.containsKey(var5)) {
                var2.put(var5, this.field4417.get(var5));
            } else {
                class307 var6 = this.field4413;
                class307 var7 = this.field4414;
                String var8 = var5.field4425;
                int var9 = var6.method5046(var8);
                int var10 = var6.method5047(var9, "");
                class332 var11 = class435.method1898(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field4417.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
