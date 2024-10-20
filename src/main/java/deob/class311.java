package deob;

import java.util.HashMap;

@ObfuscatedName("kn")
public class class311 {

    @ObfuscatedName("kn.t")
    public class262 field3887;

    @ObfuscatedName("kn.q")
    public class262 field3890;

    @ObfuscatedName("kn.i")
    public HashMap field3888;

    public class311(class262 arg0, class262 arg1) {
        this.field3887 = arg0;
        this.field3890 = arg1;
        this.field3888 = new HashMap();
    }

    @ObfuscatedName("kn.t([Lkq;B)Ljava/util/HashMap;")
    public HashMap method5052(class310[] arg0) {
        HashMap var2 = new HashMap();
        class310[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class310 var5 = var3[var4];
            if (this.field3888.containsKey(var5)) {
                var2.put(var5, this.field3888.get(var5));
            } else {
                class312 var6 = class333.method2939(this.field3887, this.field3890, var5.field3883, "");
                if (var6 != null) {
                    this.field3888.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
