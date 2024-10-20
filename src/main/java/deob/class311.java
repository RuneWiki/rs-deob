package deob;

import java.util.HashMap;

@ObfuscatedName("kp")
public class class311 {

    @ObfuscatedName("kp.d")
    public class262 field3877;

    @ObfuscatedName("kp.z")
    public class262 field3880;

    @ObfuscatedName("kp.n")
    public HashMap field3879;

    public class311(class262 arg0, class262 arg1) {
        this.field3877 = arg0;
        this.field3880 = arg1;
        this.field3879 = new HashMap();
    }

    @ObfuscatedName("kp.d([Lkr;I)Ljava/util/HashMap;")
    public HashMap method5146(class310[] arg0) {
        HashMap var2 = new HashMap();
        class310[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class310 var5 = var3[var4];
            if (this.field3879.containsKey(var5)) {
                var2.put(var5, this.field3879.get(var5));
            } else {
                class262 var6 = this.field3877;
                class262 var7 = this.field3880;
                String var8 = var5.field3875;
                int var9 = var6.method4290(var8);
                int var10 = var6.method4292(var9, "");
                class312 var11 = class333.method2893(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3879.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
