package deob;

import java.util.HashMap;

@ObfuscatedName("pe")
public class class418 {

    @ObfuscatedName("pe.c")
    public class317 field4614;

    @ObfuscatedName("pe.p")
    public class317 field4613;

    @ObfuscatedName("pe.f")
    public HashMap field4615;

    public class418(class317 arg0, class317 arg1) {
        this.field4614 = arg0;
        this.field4613 = arg1;
        this.field4615 = new HashMap();
    }

    @ObfuscatedName("pe.c([Lpc;I)Ljava/util/HashMap;")
    public HashMap method6901(class419[] arg0) {
        HashMap var2 = new HashMap();
        class419[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class419 var5 = var3[var4];
            if (this.field4615.containsKey(var5)) {
                var2.put(var5, this.field4615.get(var5));
            } else {
                class351 var6 = class459.method6113(this.field4614, this.field4613, var5.field4622, "");
                if (var6 != null) {
                    this.field4615.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
