package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cu")
public class class82 {

    @ObfuscatedName("cu.s")
    public static int field1317 = 4;

    @ObfuscatedName("cu.f")
    public boolean field1314;

    @ObfuscatedName("cu.m")
    public boolean field1315;

    @ObfuscatedName("cu.h")
    public int field1316 = 1;

    @ObfuscatedName("cu.t")
    public LinkedHashMap field1312 = new LinkedHashMap();

    public class82() {
        this.method1458(true);
    }

    public class82(class177 arg0) {
        if (arg0 == null || arg0.field2403 == null) {
            this.method1458(true);
        } else {
            int var2 = arg0.method2965();
            if (var2 >= 0 && var2 <= field1317) {
                if (arg0.method2965() == 1) {
                    this.field1314 = true;
                }
                if (var2 > 1) {
                    this.field1315 = arg0.method2965() == 1;
                }
                if (var2 > 3) {
                    this.field1316 = arg0.method2965();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2965();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2970();
                        int var6 = arg0.method2970();
                        this.field1312.put(var5, var6);
                    }
                }
            } else {
                this.method1458(true);
            }
        }
    }

    @ObfuscatedName("cu.s(ZI)V")
    public void method1458(boolean arg0) {
    }

    @ObfuscatedName("cu.c(I)Lfs;")
    public class177 method1466() {
        class177 var1 = new class177(100);
        var1.method3129(field1317);
        var1.method3129(this.field1314 ? 1 : 0);
        var1.method3129(this.field1315 ? 1 : 0);
        var1.method3129(this.field1316);
        var1.method3129(this.field1312.size());
        Iterator var2 = this.field1312.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2953((Integer) var3.getKey());
            var1.method2953((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ad.f(I)Lcu;")
    public static class82 method494() {
        class125 var0 = null;
        class82 var1 = new class82();
        try {
            var0 = class157.method46("", Statics.field3687.field3216, false);
            byte[] var2 = new byte[(int) var0.method2188()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2198(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class82(new class177(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2184();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("am.m(I)V")
    public static void method221() {
        class125 var0 = null;
        try {
            var0 = class157.method46("", Statics.field3687.field3216, true);
            class177 var1 = Statics.field1375.method1466();
            var0.method2208(var1.field2403, 0, var1.field2402);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2184();
            }
        } catch (Exception var4) {
        }
    }
}
