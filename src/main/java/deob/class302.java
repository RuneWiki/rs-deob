package deob;

import java.util.HashMap;

@ObfuscatedName("kd")
public class class302 {

    @ObfuscatedName("kd.n")
    public class254 field3742;

    @ObfuscatedName("kd.h")
    public class254 field3744;

    @ObfuscatedName("kd.l")
    public HashMap field3741;

    public class302(class254 arg0, class254 arg1) {
        this.field3742 = arg0;
        this.field3744 = arg1;
        this.field3741 = new HashMap();
    }

    @ObfuscatedName("kd.n([Lkh;B)Ljava/util/HashMap;")
    public HashMap method5311(class301[] arg0) {
        HashMap var2 = new HashMap();
        class301[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class301 var5 = var3[var4];
            if (this.field3741.containsKey(var5)) {
                var2.put(var5, this.field3741.get(var5));
            } else {
                class254 var6 = this.field3742;
                class254 var7 = this.field3744;
                String var8 = var5.field3730;
                int var9 = var6.method4472(var8);
                int var10 = var6.method4473(var9, "");
                class304 var11 = class328.method1720(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3741.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
