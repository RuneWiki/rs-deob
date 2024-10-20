package deob;

import java.util.HashMap;

@ObfuscatedName("of")
public class class415 {

    @ObfuscatedName("of.v")
    public class316 field4515;

    @ObfuscatedName("of.c")
    public class316 field4517;

    @ObfuscatedName("of.i")
    public HashMap field4516;

    public class415(class316 arg0, class316 arg1) {
        this.field4515 = arg0;
        this.field4517 = arg1;
        this.field4516 = new HashMap();
    }

    @ObfuscatedName("of.v([Low;I)Ljava/util/HashMap;")
    public HashMap method6739(class416[] arg0) {
        HashMap var2 = new HashMap();
        class416[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class416 var5 = var3[var4];
            if (this.field4516.containsKey(var5)) {
                var2.put(var5, this.field4516.get(var5));
            } else {
                class344 var6 = class452.method6897(this.field4515, this.field4517, var5.field4526, "");
                if (var6 != null) {
                    this.field4516.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
