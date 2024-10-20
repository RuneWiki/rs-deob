package deob;

import java.util.HashMap;

@ObfuscatedName("tz")
public class class517 {

    @ObfuscatedName("tz.ab")
    public class389 field5215;

    @ObfuscatedName("tz.ay")
    public class389 field5216;

    @ObfuscatedName("tz.an")
    public HashMap field5214;

    public class517(class389 arg0, class389 arg1) {
        this.field5215 = arg0;
        this.field5216 = arg1;
        this.field5214 = new HashMap();
    }

    @ObfuscatedName("tz.ab([Lto;B)Ljava/util/HashMap;")
    public HashMap method8490(class518[] arg0) {
        HashMap var2 = new HashMap();
        class518[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class518 var5 = var3[var4];
            if (this.field5214.containsKey(var5)) {
                var2.put(var5, this.field5214.get(var5));
            } else {
                class389 var6 = this.field5215;
                class389 var7 = this.field5216;
                String var8 = var5.field5224;
                class433 var9;
                if (var6.method6728(var8, "")) {
                    int var10 = var6.method6654(var8);
                    int var11 = var6.method6655(var10, "");
                    var9 = class564.method653(var6, var7, var10, var11);
                } else {
                    var9 = null;
                }
                if (var9 != null) {
                    this.field5214.put(var5, var9);
                    var2.put(var5, var9);
                }
            }
        }
        return var2;
    }
}
