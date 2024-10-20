package deob;

import java.util.HashMap;

@ObfuscatedName("te")
public class class516 {

    @ObfuscatedName("te.aq")
    public class388 field5211;

    @ObfuscatedName("te.ad")
    public class388 field5212;

    @ObfuscatedName("te.ag")
    public HashMap field5213;

    public class516(class388 arg0, class388 arg1) {
        this.field5211 = arg0;
        this.field5212 = arg1;
        this.field5213 = new HashMap();
    }

    @ObfuscatedName("te.aq([Lty;I)Ljava/util/HashMap;")
    public HashMap method8413(class517[] arg0) {
        HashMap var2 = new HashMap();
        class517[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class517 var5 = var3[var4];
            if (this.field5213.containsKey(var5)) {
                var2.put(var5, this.field5213.get(var5));
            } else {
                class432 var6 = class562.method7661(this.field5211, this.field5212, var5.field5221, "");
                if (var6 != null) {
                    this.field5213.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
