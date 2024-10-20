package deob;

import java.util.HashMap;

@ObfuscatedName("tg")
public class class504 {

    @ObfuscatedName("tg.az")
    public class379 field5082;

    @ObfuscatedName("tg.ah")
    public class379 field5080;

    @ObfuscatedName("tg.af")
    public HashMap field5079;

    public class504(class379 arg0, class379 arg1) {
        this.field5082 = arg0;
        this.field5080 = arg1;
        this.field5079 = new HashMap();
    }

    @ObfuscatedName("tg.az([Lty;I)Ljava/util/HashMap;")
    public HashMap method8151(class505[] arg0) {
        HashMap var2 = new HashMap();
        class505[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class505 var5 = var3[var4];
            if (this.field5079.containsKey(var5)) {
                var2.put(var5, this.field5079.get(var5));
            } else {
                class379 var6 = this.field5082;
                class379 var7 = this.field5080;
                String var8 = var5.field5089;
                class414 var9;
                if (var6.method6411(var8, "")) {
                    int var10 = var6.method6386(var8);
                    int var11 = var6.method6345(var10, "");
                    byte[] var12 = var6.method6328(var10, var11);
                    boolean var13;
                    if (var12 == null) {
                        var13 = false;
                    } else {
                        class550.method7827(var12);
                        var13 = true;
                    }
                    class414 var14;
                    if (var13) {
                        byte[] var15 = var7.method6328(var10, var11);
                        class414 var16;
                        if (var15 == null) {
                            var16 = null;
                        } else {
                            class414 var17 = new class414(var15, Statics.field5344, Statics.field5348, Statics.field5346, Statics.field4802, Statics.field1518, Statics.field5347);
                            Statics.field5344 = null;
                            Statics.field5348 = null;
                            Statics.field5346 = null;
                            Statics.field4802 = null;
                            Statics.field1518 = null;
                            Statics.field5347 = (byte[][]) null;
                            var16 = var17;
                        }
                        var14 = var16;
                    } else {
                        var14 = null;
                    }
                    var9 = var14;
                } else {
                    var9 = null;
                }
                if (var9 != null) {
                    this.field5079.put(var5, var9);
                    var2.put(var5, var9);
                }
            }
        }
        return var2;
    }
}
