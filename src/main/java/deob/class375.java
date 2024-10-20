package deob;

import java.util.HashMap;

@ObfuscatedName("nd")
public class class375 {

    @ObfuscatedName("nd.n")
    public class290 field4170;

    @ObfuscatedName("nd.c")
    public class290 field4166;

    @ObfuscatedName("nd.m")
    public HashMap field4168;

    public class375(class290 arg0, class290 arg1) {
        this.field4170 = arg0;
        this.field4166 = arg1;
        this.field4168 = new HashMap();
    }

    @ObfuscatedName("nd.n([Lnu;I)Ljava/util/HashMap;")
    public HashMap method5982(class376[] arg0) {
        HashMap var2 = new HashMap();
        class376[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class376 var5 = var3[var4];
            if (this.field4168.containsKey(var5)) {
                var2.put(var5, this.field4168.get(var5));
            } else {
                class315 var6 = class414.method4706(this.field4170, this.field4166, var5.field4177, "");
                if (var6 != null) {
                    this.field4168.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
