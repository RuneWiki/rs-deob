package deob;

import java.util.HashMap;

@ObfuscatedName("oh")
public class class393 {

    @ObfuscatedName("oh.c")
    public class302 field4367;

    @ObfuscatedName("oh.b")
    public class302 field4368;

    @ObfuscatedName("oh.p")
    public HashMap field4369;

    public class393(class302 arg0, class302 arg1) {
        this.field4367 = arg0;
        this.field4368 = arg1;
        this.field4369 = new HashMap();
    }

    @ObfuscatedName("oh.c([Lot;I)Ljava/util/HashMap;")
    public HashMap method6415(class394[] arg0) {
        HashMap var2 = new HashMap();
        class394[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class394 var5 = var3[var4];
            if (this.field4369.containsKey(var5)) {
                var2.put(var5, this.field4369.get(var5));
            } else {
                class302 var6 = this.field4367;
                class302 var7 = this.field4368;
                String var8 = var5.field4376;
                int var9 = var6.method5118(var8);
                int var10 = var6.method5070(var9, "");
                class327 var11;
                if (Statics.method2755(var6, var9, var10)) {
                    byte[] var12 = var7.method5053(var9, var10);
                    class327 var13;
                    if (var12 == null) {
                        var13 = null;
                    } else {
                        class327 var14 = new class327(var12, Statics.field1607, Statics.field2119, Statics.field4579, Statics.field4008, Statics.field4580, Statics.field4218);
                        class433.method2406();
                        var13 = var14;
                    }
                    var11 = var13;
                } else {
                    var11 = null;
                }
                if (var11 != null) {
                    this.field4369.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
