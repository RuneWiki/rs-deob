package deob;

import java.util.HashMap;

@ObfuscatedName("tc")
public class class519 {

    @ObfuscatedName("tc.ac")
    public class391 field5251;

    @ObfuscatedName("tc.ae")
    public class391 field5250;

    @ObfuscatedName("tc.ag")
    public HashMap field5249;

    public class519(class391 arg0, class391 arg1) {
        this.field5251 = arg0;
        this.field5250 = arg1;
        this.field5249 = new HashMap();
    }

    @ObfuscatedName("tc.ac([Ltw;B)Ljava/util/HashMap;")
    public HashMap method8634(class520[] arg0) {
        HashMap var2 = new HashMap();
        class520[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class520 var5 = var3[var4];
            if (this.field5249.containsKey(var5)) {
                var2.put(var5, this.field5249.get(var5));
            } else {
                class391 var6 = this.field5251;
                class391 var7 = this.field5250;
                String var8 = var5.field5254;
                class435 var9;
                if (var6.method6799(var8, "")) {
                    int var10 = var6.method6797(var8);
                    int var11 = var6.method6806(var10, "");
                    class435 var12;
                    if (class566.method8328(var6, var10, var11)) {
                        byte[] var13 = var7.method6782(var10, var11);
                        class435 var14;
                        if (var13 == null) {
                            var14 = null;
                        } else {
                            class435 var15 = new class435(var13, Statics.field4920, Statics.field988, Statics.field4598, Statics.field2922, Statics.field5524, Statics.field3699);
                            class566.method3270();
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
                    this.field5249.put(var5, var9);
                    var2.put(var5, var9);
                }
            }
        }
        return var2;
    }
}
