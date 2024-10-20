package deob;

import java.util.HashMap;

@ObfuscatedName("kr")
public class class311 {

    @ObfuscatedName("kr.g")
    public class262 field3895;

    @ObfuscatedName("kr.e")
    public class262 field3892;

    @ObfuscatedName("kr.b")
    public HashMap field3893;

    public class311(class262 arg0, class262 arg1) {
        this.field3895 = arg0;
        this.field3892 = arg1;
        this.field3893 = new HashMap();
    }

    @ObfuscatedName("kr.g([Lkv;I)Ljava/util/HashMap;")
    public HashMap method5113(class310[] arg0) {
        HashMap var2 = new HashMap();
        class310[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class310 var5 = var3[var4];
            if (this.field3893.containsKey(var5)) {
                var2.put(var5, this.field3893.get(var5));
            } else {
                class262 var6 = this.field3895;
                class262 var7 = this.field3892;
                String var8 = var5.field3890;
                int var9 = var6.method4306(var8);
                int var10 = var6.method4295(var9, "");
                class312 var11;
                if (class333.method5350(var6, var9, var10)) {
                    var11 = class333.method3539(var7.method4294(var9, var10));
                } else {
                    var11 = null;
                }
                if (var11 != null) {
                    this.field3893.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
