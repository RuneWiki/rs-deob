package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("g")
public class class9 {

    @ObfuscatedName("g.a")
    public static int field136 = 4;

    @ObfuscatedName("g.v")
    public boolean field132;

    @ObfuscatedName("g.r")
    public boolean field134;

    @ObfuscatedName("g.z")
    public int field135 = 1;

    @ObfuscatedName("g.t")
    public LinkedHashMap field137 = new LinkedHashMap();

    public class9() {
        this.method110(true);
    }

    public class9(class123 arg0) {
        if (arg0 == null || arg0.field2076 == null) {
            this.method110(true);
        } else {
            int var2 = arg0.method2395();
            if (var2 >= 0 && var2 <= field136) {
                if (arg0.method2395() == 1) {
                    this.field132 = true;
                }
                if (var2 > 1) {
                    this.field134 = arg0.method2395() == 1;
                }
                if (var2 > 3) {
                    this.field135 = arg0.method2395();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2395();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2400();
                        int var6 = arg0.method2400();
                        this.field137.put(var5, var6);
                    }
                }
            } else {
                this.method110(true);
            }
        }
    }

    @ObfuscatedName("g.a(ZI)V")
    public void method110(boolean arg0) {
    }

    @ObfuscatedName("g.d(I)Ldb;")
    public class123 method113() {
        class123 var1 = new class123(100);
        var1.method2380(field136);
        var1.method2380(this.field132 ? 1 : 0);
        var1.method2380(this.field134 ? 1 : 0);
        var1.method2380(this.field135);
        var1.method2380(this.field137.size());
        Iterator var2 = this.field137.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2467((Integer) var3.getKey());
            var1.method2467((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ch.r(B)V")
    public static void method1623() {
        class231 var0 = null;
        try {
            var0 = class153.method2099("", Statics.field549.field2348, true);
            class123 var1 = Statics.field2040.method113();
            var0.method3932(var1.field2076, 0, var1.field2071);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3954();
            }
        } catch (Exception var4) {
        }
    }
}
