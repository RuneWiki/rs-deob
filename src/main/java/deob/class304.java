package deob;

import java.util.HashMap;

@ObfuscatedName("ki")
public class class304 {

    @ObfuscatedName("ki.n")
    public class245 field3704;

    @ObfuscatedName("ki.v")
    public class245 field3702;

    @ObfuscatedName("ki.d")
    public HashMap field3703;

    public class304(class245 arg0, class245 arg1) {
        this.field3704 = arg0;
        this.field3702 = arg1;
        this.field3703 = new HashMap();
    }

    @ObfuscatedName("ki.n([Lkq;I)Ljava/util/HashMap;")
    public HashMap method5067(class303[] arg0) {
        HashMap var2 = new HashMap();
        class303[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class303 var5 = var3[var4];
            if (this.field3703.containsKey(var5)) {
                var2.put(var5, this.field3703.get(var5));
            } else {
                class245 var6 = this.field3704;
                class245 var7 = this.field3702;
                String var8 = var5.field3698;
                int var9 = var6.method4001(var8);
                int var10 = var6.method4002(var9, "");
                byte[] var11 = var6.method4032(var9, var10);
                boolean var12;
                if (var11 == null) {
                    var12 = false;
                } else {
                    class337.method190(var11);
                    var12 = true;
                }
                class306 var13;
                if (var12) {
                    byte[] var14 = var7.method4032(var9, var10);
                    class306 var15;
                    if (var14 == null) {
                        var15 = null;
                    } else {
                        class306 var16 = new class306(var14, Statics.field1342, Statics.field3925, Statics.field3926, Statics.field2580, Statics.field3496, Statics.field15);
                        Statics.field1342 = null;
                        Statics.field3925 = null;
                        Statics.field3926 = null;
                        Statics.field2580 = null;
                        Statics.field3496 = null;
                        Statics.field15 = (byte[][]) null;
                        var15 = var16;
                    }
                    var13 = var15;
                } else {
                    var13 = null;
                }
                if (var13 != null) {
                    this.field3703.put(var5, var13);
                    var2.put(var5, var13);
                }
            }
        }
        return var2;
    }
}
