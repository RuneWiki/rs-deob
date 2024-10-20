package deob;

import java.util.HashMap;

@ObfuscatedName("tt")
public class class499 {

    @ObfuscatedName("tt.ac")
    public class374 field4991;

    @ObfuscatedName("tt.al")
    public class374 field4994;

    @ObfuscatedName("tt.ak")
    public HashMap field4992;

    public class499(class374 arg0, class374 arg1) {
        this.field4991 = arg0;
        this.field4994 = arg1;
        this.field4992 = new HashMap();
    }

    @ObfuscatedName("tt.ac([Ltc;I)Ljava/util/HashMap;")
    public HashMap method8042(class500[] arg0) {
        HashMap var2 = new HashMap();
        class500[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class500 var5 = var3[var4];
            if (this.field4992.containsKey(var5)) {
                var2.put(var5, this.field4992.get(var5));
            } else {
                class374 var6 = this.field4991;
                class374 var7 = this.field4994;
                String var8 = var5.field4999;
                class409 var9;
                if (var6.method6285(var8, "")) {
                    int var10 = var6.method6279(var8);
                    int var11 = var6.method6268(var10, "");
                    class409 var12;
                    if (class545.method3115(var6, var10, var11)) {
                        byte[] var13 = var7.method6342(var10, var11);
                        class409 var14;
                        if (var13 == null) {
                            var14 = null;
                        } else {
                            class409 var15 = new class409(var13, Statics.field3506, Statics.field2854, Statics.field443, Statics.field5247, Statics.field4323, Statics.field4559);
                            Statics.method6787();
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
                    this.field4992.put(var5, var9);
                    var2.put(var5, var9);
                }
            }
        }
        return var2;
    }
}
