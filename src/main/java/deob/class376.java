package deob;

import java.util.HashMap;

@ObfuscatedName("nu")
public class class376 {

    @ObfuscatedName("nu.i")
    public class290 field4191;

    @ObfuscatedName("nu.w")
    public class290 field4190;

    @ObfuscatedName("nu.s")
    public HashMap field4192;

    public class376(class290 arg0, class290 arg1) {
        this.field4191 = arg0;
        this.field4190 = arg1;
        this.field4192 = new HashMap();
    }

    @ObfuscatedName("nu.i([Lny;I)Ljava/util/HashMap;")
    public HashMap method5995(class377[] arg0) {
        HashMap var2 = new HashMap();
        class377[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class377 var5 = var3[var4];
            if (this.field4192.containsKey(var5)) {
                var2.put(var5, this.field4192.get(var5));
            } else {
                class315 var6 = class415.method6504(this.field4191, this.field4190, var5.field4198, "");
                if (var6 != null) {
                    this.field4192.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
