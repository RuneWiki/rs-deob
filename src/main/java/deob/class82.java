package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cl")
public class class82 {

    @ObfuscatedName("cl.i")
    public static int field1328 = 4;

    @ObfuscatedName("cl.a")
    public boolean field1336;

    @ObfuscatedName("cl.t")
    public boolean field1329;

    @ObfuscatedName("cl.s")
    public int field1326 = 1;

    @ObfuscatedName("cl.r")
    public LinkedHashMap field1331 = new LinkedHashMap();

    public class82() {
        this.method1477(true);
    }

    public class82(class174 arg0) {
        if (arg0 == null || arg0.field2405 == null) {
            this.method1477(true);
        } else {
            int var2 = arg0.method3061();
            if (var2 >= 0 && var2 <= field1328) {
                if (arg0.method3061() == 1) {
                    this.field1336 = true;
                }
                if (var2 > 1) {
                    this.field1329 = arg0.method3061() == 1;
                }
                if (var2 > 3) {
                    this.field1326 = arg0.method3061();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3061();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2885();
                        int var6 = arg0.method2885();
                        this.field1331.put(var5, var6);
                    }
                }
            } else {
                this.method1477(true);
            }
        }
    }

    @ObfuscatedName("cl.i(ZI)V")
    public void method1477(boolean arg0) {
    }

    @ObfuscatedName("cl.w(I)Lfp;")
    public class174 method1476() {
        class174 var1 = new class174(100);
        var1.method2865(field1328);
        var1.method2865(this.field1336 ? 1 : 0);
        var1.method2865(this.field1329 ? 1 : 0);
        var1.method2865(this.field1326);
        var1.method2865(this.field1331.size());
        Iterator var2 = this.field1331.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2868((Integer) var3.getKey());
            var1.method2868((Integer) var3.getValue());
        }
        return var1;
    }
}
