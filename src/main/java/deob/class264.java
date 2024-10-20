package deob;

import java.util.HashMap;

@ObfuscatedName("jt")
public class class264 {

    @ObfuscatedName("jt.i")
    public class237 field3633;

    @ObfuscatedName("jt.j")
    public class237 field3632;

    @ObfuscatedName("jt.a")
    public HashMap field3631;

    public class264(class237 arg0, class237 arg1) {
        this.field3633 = arg0;
        this.field3632 = arg1;
        this.field3631 = new HashMap();
    }

    @ObfuscatedName("jt.i([Ljz;I)Ljava/util/HashMap;")
    public HashMap method4375(class263[] arg0) {
        HashMap var2 = new HashMap();
        class263[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class263 var5 = var3[var4];
            if (this.field3631.containsKey(var5)) {
                var2.put(var5, this.field3631.get(var5));
            } else {
                class265 var6 = class288.method1458(this.field3633, this.field3632, var5.field3624, "");
                if (var6 != null) {
                    this.field3631.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
