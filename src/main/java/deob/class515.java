package deob;

import java.util.HashMap;

@ObfuscatedName("tz")
public class class515 {

    @ObfuscatedName("tz.ak")
    public class387 field5185;

    @ObfuscatedName("tz.al")
    public class387 field5183;

    @ObfuscatedName("tz.aj")
    public HashMap field5184;

    public class515(class387 arg0, class387 arg1) {
        this.field5185 = arg0;
        this.field5183 = arg1;
        this.field5184 = new HashMap();
    }

    @ObfuscatedName("tz.ak([Ltc;I)Ljava/util/HashMap;")
    public HashMap method8472(class516[] arg0) {
        HashMap var2 = new HashMap();
        class516[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class516 var5 = var3[var4];
            if (this.field5184.containsKey(var5)) {
                var2.put(var5, this.field5184.get(var5));
            } else {
                class387 var6 = this.field5185;
                class387 var7 = this.field5183;
                String var8 = var5.field5192;
                class431 var9;
                if (var6.method6589(var8, "")) {
                    int var10 = var6.method6587(var8);
                    int var11 = var6.method6647(var10, "");
                    class431 var12;
                    if (class561.method2638(var6, var10, var11)) {
                        byte[] var13 = var7.method6573(var10, var11);
                        class431 var14;
                        if (var13 == null) {
                            var14 = null;
                        } else {
                            class431 var15 = new class431(var13, Statics.field5452, Statics.field5455, Statics.field5454, Statics.field5457, Statics.field1489, Statics.field1976);
                            Statics.field5452 = null;
                            Statics.field5455 = null;
                            Statics.field5454 = null;
                            Statics.field5457 = null;
                            Statics.field1489 = null;
                            Statics.field1976 = (byte[][]) null;
                            var14 = var15;
                        }
                        var12 = var14;
                    } else {
                        var12 = null;
                    }
                    var9 = var12;
                } else {
                    var9 = null;
                }
                if (var9 != null) {
                    this.field5184.put(var5, var9);
                    var2.put(var5, var9);
                }
            }
        }
        return var2;
    }
}
