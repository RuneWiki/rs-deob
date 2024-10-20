package deob;

import java.util.HashMap;

@ObfuscatedName("sr")
public class class484 {

    @ObfuscatedName("sr.au")
    public class359 field4953;

    @ObfuscatedName("sr.ae")
    public class359 field4951;

    @ObfuscatedName("sr.ao")
    public HashMap field4950;

    public class484(class359 arg0, class359 arg1) {
        this.field4953 = arg0;
        this.field4951 = arg1;
        this.field4950 = new HashMap();
    }

    @ObfuscatedName("sr.au([Lsp;I)Ljava/util/HashMap;")
    public HashMap method7977(class485[] arg0) {
        HashMap var2 = new HashMap();
        class485[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class485 var5 = var3[var4];
            if (this.field4950.containsKey(var5)) {
                var2.put(var5, this.field4950.get(var5));
            } else {
                class359 var6 = this.field4953;
                class359 var7 = this.field4951;
                String var8 = var5.field4960;
                class394 var9;
                if (var6.method6150(var8, "")) {
                    int var10 = var6.method6167(var8);
                    int var11 = var6.method6145(var10, "");
                    var9 = class530.method5206(var6, var7, var10, var11);
                } else {
                    var9 = null;
                }
                if (var9 != null) {
                    this.field4950.put(var5, var9);
                    var2.put(var5, var9);
                }
            }
        }
        return var2;
    }
}
