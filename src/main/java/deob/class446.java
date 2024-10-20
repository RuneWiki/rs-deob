package deob;

import java.util.HashMap;

@ObfuscatedName("qq")
public class class446 {

    @ObfuscatedName("qq.f")
    public class337 field4821;

    @ObfuscatedName("qq.w")
    public class337 field4822;

    @ObfuscatedName("qq.v")
    public HashMap field4820;

    public class446(class337 arg0, class337 arg1) {
        this.field4821 = arg0;
        this.field4822 = arg1;
        this.field4820 = new HashMap();
    }

    @ObfuscatedName("qq.f([Lqy;I)Ljava/util/HashMap;")
    public HashMap method7662(class447[] arg0) {
        HashMap var2 = new HashMap();
        class447[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class447 var5 = var3[var4];
            if (this.field4820.containsKey(var5)) {
                var2.put(var5, this.field4820.get(var5));
            } else {
                class372 var6 = class489.method1085(this.field4821, this.field4822, var5.field4829, "");
                if (var6 != null) {
                    this.field4820.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
