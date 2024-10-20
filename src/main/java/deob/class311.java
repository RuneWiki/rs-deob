package deob;

import java.util.HashMap;

@ObfuscatedName("kp")
public class class311 {

    @ObfuscatedName("kp.c")
    public class262 field3883;

    @ObfuscatedName("kp.i")
    public class262 field3884;

    @ObfuscatedName("kp.o")
    public HashMap field3885;

    public class311(class262 arg0, class262 arg1) {
        this.field3883 = arg0;
        this.field3884 = arg1;
        this.field3885 = new HashMap();
    }

    @ObfuscatedName("kp.c([Lkd;I)Ljava/util/HashMap;")
    public HashMap method5091(class310[] arg0) {
        HashMap var2 = new HashMap();
        class310[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class310 var5 = var3[var4];
            if (this.field3885.containsKey(var5)) {
                var2.put(var5, this.field3885.get(var5));
            } else {
                class262 var6 = this.field3883;
                class262 var7 = this.field3884;
                String var8 = var5.field3877;
                int var9 = var6.method4245(var8);
                int var10 = var6.method4207(var9, "");
                class312 var11;
                if (Statics.method4828(var6, var9, var10)) {
                    var11 = Statics.method4399(var7.method4190(var9, var10));
                } else {
                    var11 = null;
                }
                if (var11 != null) {
                    this.field3885.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
