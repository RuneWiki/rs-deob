package deob;

import java.util.HashMap;

@ObfuscatedName("tv")
public class class503 {

    @ObfuscatedName("tv.aq")
    public class378 field5051;

    @ObfuscatedName("tv.aw")
    public class378 field5050;

    @ObfuscatedName("tv.al")
    public HashMap field5052;

    public class503(class378 arg0, class378 arg1) {
        this.field5051 = arg0;
        this.field5050 = arg1;
        this.field5052 = new HashMap();
    }

    @ObfuscatedName("tv.aq([Ltu;I)Ljava/util/HashMap;")
    public HashMap method8264(class504[] arg0) {
        HashMap var2 = new HashMap();
        class504[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class504 var5 = var3[var4];
            if (this.field5052.containsKey(var5)) {
                var2.put(var5, this.field5052.get(var5));
            } else {
                class378 var6 = this.field5051;
                class378 var7 = this.field5050;
                String var8 = var5.field5060;
                class413 var9;
                if (var6.method6496(var8, "")) {
                    int var10 = var6.method6435(var8);
                    int var11 = var6.method6436(var10, "");
                    class413 var12;
                    if (class549.method2926(var6, var10, var11)) {
                        var12 = class549.method8535(var7.method6489(var10, var11));
                    } else {
                        var12 = null;
                    }
                    var9 = var12;
                } else {
                    var9 = null;
                }
                if (var9 != null) {
                    this.field5052.put(var5, var9);
                    var2.put(var5, var9);
                }
            }
        }
        return var2;
    }
}
