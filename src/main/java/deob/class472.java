package deob;

import java.util.HashMap;

@ObfuscatedName("sr")
public class class472 {

    @ObfuscatedName("sr.at")
    public class357 field4889;

    @ObfuscatedName("sr.an")
    public class357 field4890;

    @ObfuscatedName("sr.av")
    public HashMap field4891;

    public class472(class357 arg0, class357 arg1) {
        this.field4889 = arg0;
        this.field4890 = arg1;
        this.field4891 = new HashMap();
    }

    @ObfuscatedName("sr.at([Lsb;B)Ljava/util/HashMap;")
    public HashMap method7826(class473[] arg0) {
        HashMap var2 = new HashMap();
        class473[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class473 var5 = var3[var4];
            if (this.field4891.containsKey(var5)) {
                var2.put(var5, this.field4891.get(var5));
            } else {
                class392 var6 = class516.method7894(this.field4889, this.field4890, var5.field4898, "");
                if (var6 != null) {
                    this.field4891.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
