package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("j")
public class class9 {

    @ObfuscatedName("j.k")
    public static int field130 = 4;

    @ObfuscatedName("j.o")
    public boolean field127;

    @ObfuscatedName("j.z")
    public boolean field128;

    @ObfuscatedName("j.c")
    public int field129 = 1;

    @ObfuscatedName("j.d")
    public LinkedHashMap field126 = new LinkedHashMap();

    public class9() {
        this.method99(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1960 == null) {
            this.method99(true);
        } else {
            int var2 = arg0.method2330();
            if (var2 >= 0 && var2 <= field130) {
                if (arg0.method2330() == 1) {
                    this.field127 = true;
                }
                if (var2 > 1) {
                    this.field128 = arg0.method2330() == 1;
                }
                if (var2 > 3) {
                    this.field129 = arg0.method2330();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2330();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2415();
                        int var6 = arg0.method2415();
                        this.field126.put(var5, var6);
                    }
                }
            } else {
                this.method99(true);
            }
        }
    }

    @ObfuscatedName("j.k(ZI)V")
    public void method99(boolean arg0) {
    }

    @ObfuscatedName("j.h(I)Ldk;")
    public class119 method100() {
        class119 var1 = new class119(100);
        var1.method2315(field130);
        var1.method2315(this.field127 ? 1 : 0);
        var1.method2315(this.field128 ? 1 : 0);
        var1.method2315(this.field129);
        var1.method2315(this.field126.size());
        Iterator var2 = this.field126.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2318((Integer) var3.getKey());
            var1.method2318((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("bv.o(I)Lj;")
    public static class9 method1459() {
        class227 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class149.method694("", Statics.field471.field2263, false);
            byte[] var2 = new byte[(int) var0.method3872()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3868(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class119(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3865();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("c.z(I)V")
    public static void method40() {
        class227 var0 = null;
        try {
            var0 = class149.method694("", Statics.field471.field2263, true);
            class119 var1 = Statics.field1639.method100();
            var0.method3864(var1.field1960, 0, var1.field1949);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3865();
            }
        } catch (Exception var4) {
        }
    }
}
