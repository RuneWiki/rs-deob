package deob;

import java.util.HashMap;

@ObfuscatedName("oy")
public class class416 {

    @ObfuscatedName("oy.c")
    public class315 field4575;

    @ObfuscatedName("oy.v")
    public class315 field4572;

    @ObfuscatedName("oy.q")
    public HashMap field4574;

    public class416(class315 arg0, class315 arg1) {
        this.field4575 = arg0;
        this.field4572 = arg1;
        this.field4574 = new HashMap();
    }

    @ObfuscatedName("oy.c([Lpd;B)Ljava/util/HashMap;")
    public HashMap method6728(class417[] arg0) {
        HashMap var2 = new HashMap();
        class417[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class417 var5 = var3[var4];
            if (this.field4574.containsKey(var5)) {
                var2.put(var5, this.field4574.get(var5));
            } else {
                class349 var6 = class457.method4726(this.field4575, this.field4572, var5.field4583, "");
                if (var6 != null) {
                    this.field4574.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
