package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("a")
public class class9 {

    @ObfuscatedName("a.n")
    public static int field134 = 4;

    @ObfuscatedName("a.z")
    public boolean field127;

    @ObfuscatedName("a.y")
    public boolean field128;

    @ObfuscatedName("a.e")
    public int field137 = 1;

    @ObfuscatedName("a.g")
    public LinkedHashMap field135 = new LinkedHashMap();

    public class9() {
        this.method95(true);
    }

    public class9(class111 arg0) {
        if (arg0 == null || arg0.field1888 == null) {
            this.method95(true);
        } else {
            int var2 = arg0.method2228();
            if (var2 >= 0 && var2 <= field134) {
                if (arg0.method2228() == 1) {
                    this.field127 = true;
                }
                if (var2 > 1) {
                    this.field128 = arg0.method2228() == 1;
                }
                if (var2 > 3) {
                    this.field137 = arg0.method2228();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2228();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2233();
                        int var6 = arg0.method2233();
                        this.field135.put(var5, var6);
                    }
                }
            } else {
                this.method95(true);
            }
        }
    }

    @ObfuscatedName("a.n(ZI)V")
    public void method95(boolean arg0) {
    }

    @ObfuscatedName("a.d(I)Ldl;")
    public class111 method98() {
        class111 var1 = new class111(100);
        var1.method2213(field134);
        var1.method2213(this.field127 ? 1 : 0);
        var1.method2213(this.field128 ? 1 : 0);
        var1.method2213(this.field137);
        var1.method2213(this.field135.size());
        Iterator var2 = this.field135.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2216((Integer) var3.getKey());
            var1.method2216((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("bh.z(I)V")
    public static void method1415() {
        class218 var0 = null;
        try {
            var0 = class141.method654("", Statics.field243.field2182, true);
            class111 var1 = Statics.field608.method98();
            var0.method3739(var1.field1888, 0, var1.field1889);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3740();
            }
        } catch (Exception var4) {
        }
    }
}
