package deob;

import java.util.HashMap;

@ObfuscatedName("ul")
public class class526 {

    @ObfuscatedName("ul.ap")
    public class392 field5304;

    @ObfuscatedName("ul.aw")
    public class392 field5305;

    @ObfuscatedName("ul.ak")
    public HashMap field5306;

    public class526(class392 arg0, class392 arg1) {
        this.field5304 = arg0;
        this.field5305 = arg1;
        this.field5306 = new HashMap();
    }

    @ObfuscatedName("ul.ap([Lus;S)Ljava/util/HashMap;")
    public HashMap method8930(class527[] arg0) {
        HashMap var2 = new HashMap();
        class527[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class527 var5 = var3[var4];
            if (this.field5306.containsKey(var5)) {
                var2.put(var5, this.field5306.get(var5));
            } else {
                class436 var6 = class573.method1203(this.field5304, this.field5305, var5.field5313, "");
                if (var6 != null) {
                    this.field5306.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
