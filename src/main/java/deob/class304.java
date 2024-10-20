package deob;

import java.util.HashMap;

@ObfuscatedName("kn")
public class class304 {

    @ObfuscatedName("kn.f")
    public class245 field3702;

    @ObfuscatedName("kn.b")
    public class245 field3703;

    @ObfuscatedName("kn.l")
    public HashMap field3701;

    public class304(class245 arg0, class245 arg1) {
        this.field3702 = arg0;
        this.field3703 = arg1;
        this.field3701 = new HashMap();
    }

    @ObfuscatedName("kn.f([Lko;I)Ljava/util/HashMap;")
    public HashMap method5009(class303[] arg0) {
        HashMap var2 = new HashMap();
        class303[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class303 var5 = var3[var4];
            if (this.field3701.containsKey(var5)) {
                var2.put(var5, this.field3701.get(var5));
            } else {
                class306 var6 = class337.method2945(this.field3702, this.field3703, var5.field3697, "");
                if (var6 != null) {
                    this.field3701.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
