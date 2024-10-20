package deob;

import java.util.HashMap;

@ObfuscatedName("po")
public class class417 {

    @ObfuscatedName("po.o")
    public class316 field4578;

    @ObfuscatedName("po.q")
    public class316 field4577;

    @ObfuscatedName("po.l")
    public HashMap field4579;

    public class417(class316 arg0, class316 arg1) {
        this.field4578 = arg0;
        this.field4577 = arg1;
        this.field4579 = new HashMap();
    }

    @ObfuscatedName("po.o([Lpi;I)Ljava/util/HashMap;")
    public HashMap method6638(class418[] arg0) {
        HashMap var2 = new HashMap();
        class418[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class418 var5 = var3[var4];
            if (this.field4579.containsKey(var5)) {
                var2.put(var5, this.field4579.get(var5));
            } else {
                class350 var6 = class454.method5326(this.field4578, this.field4577, var5.field4589, "");
                if (var6 != null) {
                    this.field4579.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
