package deob;

import java.util.HashMap;

@ObfuscatedName("kx")
public class class297 {

    @ObfuscatedName("kx.b")
    public class256 field3761;

    @ObfuscatedName("kx.q")
    public class256 field3762;

    @ObfuscatedName("kx.o")
    public HashMap field3763;

    public class297(class256 arg0, class256 arg1) {
        this.field3761 = arg0;
        this.field3762 = arg1;
        this.field3763 = new HashMap();
    }

    @ObfuscatedName("kx.b([Lki;I)Ljava/util/HashMap;")
    public HashMap method4984(class296[] arg0) {
        HashMap var2 = new HashMap();
        class296[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class296 var5 = var3[var4];
            if (this.field3763.containsKey(var5)) {
                var2.put(var5, this.field3763.get(var5));
            } else {
                class256 var6 = this.field3761;
                class256 var7 = this.field3762;
                String var8 = var5.field3760;
                int var9 = var6.method4177(var8);
                int var10 = var6.method4228(var9, "");
                class298 var11 = class324.method3084(var6, var7, var9, var10);
                if (var11 != null) {
                    this.field3763.put(var5, var11);
                    var2.put(var5, var11);
                }
            }
        }
        return var2;
    }
}
