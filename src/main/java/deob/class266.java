package deob;

import java.util.HashMap;

@ObfuscatedName("jt")
public class class266 {

    @ObfuscatedName("jt.s")
    public class239 field3652;

    @ObfuscatedName("jt.c")
    public class239 field3651;

    @ObfuscatedName("jt.f")
    public HashMap field3650;

    public class266(class239 arg0, class239 arg1) {
        this.field3652 = arg0;
        this.field3651 = arg1;
        this.field3650 = new HashMap();
    }

    @ObfuscatedName("jt.s([Ljk;I)Ljava/util/HashMap;")
    public HashMap method4467(class265[] arg0) {
        HashMap var2 = new HashMap();
        class265[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class265 var5 = var3[var4];
            if (this.field3650.containsKey(var5)) {
                var2.put(var5, this.field3650.get(var5));
            } else {
                class267 var6 = class290.method2429(this.field3652, this.field3651, var5.field3641, "");
                if (var6 != null) {
                    this.field3650.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
