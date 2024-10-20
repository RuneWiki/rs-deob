package deob;

import java.util.HashMap;

@ObfuscatedName("td")
public class class500 {

    @ObfuscatedName("td.am")
    public class375 field5028;

    @ObfuscatedName("td.ap")
    public class375 field5027;

    @ObfuscatedName("td.af")
    public HashMap field5029;

    public class500(class375 arg0, class375 arg1) {
        this.field5028 = arg0;
        this.field5027 = arg1;
        this.field5029 = new HashMap();
    }

    @ObfuscatedName("td.am([Lti;I)Ljava/util/HashMap;")
    public HashMap method8256(class501[] arg0) {
        HashMap var2 = new HashMap();
        class501[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class501 var5 = var3[var4];
            if (this.field5029.containsKey(var5)) {
                var2.put(var5, this.field5029.get(var5));
            } else {
                class410 var6 = class546.method8019(this.field5028, this.field5027, var5.field5037, "");
                if (var6 != null) {
                    this.field5029.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
