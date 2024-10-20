package deob;

import java.util.HashMap;

@ObfuscatedName("ra")
public class class460 {

    @ObfuscatedName("ra.af")
    public class344 field4875;

    @ObfuscatedName("ra.an")
    public class344 field4873;

    @ObfuscatedName("ra.aw")
    public HashMap field4874;

    public class460(class344 arg0, class344 arg1) {
        this.field4875 = arg0;
        this.field4873 = arg1;
        this.field4874 = new HashMap();
    }

    @ObfuscatedName("ra.af([Lri;B)Ljava/util/HashMap;")
    public HashMap method7912(class461[] arg0) {
        HashMap var2 = new HashMap();
        class461[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class461 var5 = var3[var4];
            if (this.field4874.containsKey(var5)) {
                var2.put(var5, this.field4874.get(var5));
            } else {
                class379 var6 = class504.method7310(this.field4875, this.field4873, var5.field4882, "");
                if (var6 != null) {
                    this.field4874.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
