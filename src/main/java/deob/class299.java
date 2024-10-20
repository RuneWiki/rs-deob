package deob;

import java.util.HashMap;

@ObfuscatedName("ks")
public class class299 {

    @ObfuscatedName("ks.y")
    public class250 field3722;

    @ObfuscatedName("ks.c")
    public class250 field3723;

    @ObfuscatedName("ks.n")
    public HashMap field3721;

    public class299(class250 arg0, class250 arg1) {
        this.field3722 = arg0;
        this.field3723 = arg1;
        this.field3721 = new HashMap();
    }

    @ObfuscatedName("ks.y([Lkw;I)Ljava/util/HashMap;")
    public HashMap method5127(class298[] arg0) {
        HashMap var2 = new HashMap();
        class298[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class298 var5 = var3[var4];
            if (this.field3721.containsKey(var5)) {
                var2.put(var5, this.field3721.get(var5));
            } else {
                class301 var6 = class325.method3571(this.field3722, this.field3723, var5.field3718, "");
                if (var6 != null) {
                    this.field3721.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
