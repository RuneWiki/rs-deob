package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bt")
public class class73 {

    @ObfuscatedName("bt.a")
    public static int field1040 = 6;

    @ObfuscatedName("bt.g")
    public boolean field1030;

    @ObfuscatedName("bt.x")
    public boolean field1031;

    @ObfuscatedName("bt.h")
    public int field1037 = 1;

    @ObfuscatedName("bt.f")
    public String field1028 = null;

    @ObfuscatedName("bt.p")
    public boolean field1034 = false;

    @ObfuscatedName("bt.m")
    public LinkedHashMap field1032 = new LinkedHashMap();

    public class73() {
        this.method1679(true);
    }

    public class73(class190 arg0) {
        if (arg0 == null || arg0.field2420 == null) {
            this.method1679(true);
        } else {
            int var2 = arg0.method3443();
            if (var2 >= 0 && var2 <= field1040) {
                if (arg0.method3443() == 1) {
                    this.field1030 = true;
                }
                if (var2 > 1) {
                    this.field1031 = arg0.method3443() == 1;
                }
                if (var2 > 3) {
                    this.field1037 = arg0.method3443();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3443();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3460();
                        int var6 = arg0.method3460();
                        this.field1032.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1028 = arg0.method3463();
                }
                if (var2 > 5) {
                    this.field1034 = arg0.method3462();
                }
            } else {
                this.method1679(true);
            }
        }
    }

    @ObfuscatedName("bt.a(ZB)V")
    public void method1679(boolean arg0) {
    }

    @ObfuscatedName("bt.s(I)Lgx;")
    public class190 method1665() {
        class190 var1 = new class190(100);
        var1.method3439(field1040);
        var1.method3439(this.field1030 ? 1 : 0);
        var1.method3439(this.field1031 ? 1 : 0);
        var1.method3439(this.field1037);
        var1.method3439(this.field1032.size());
        Iterator var2 = this.field1032.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3442((Integer) var3.getKey());
            var1.method3442((Integer) var3.getValue());
        }
        var1.method3446(this.field1028 == null ? "" : this.field1028);
        var1.method3445(this.field1034);
        return var1;
    }

    @ObfuscatedName("bh.g(I)Lbt;")
    public static class73 method1160() {
        class118 var0 = null;
        class73 var1 = new class73();
        try {
            var0 = class163.method3143("", Statics.field39.field3224, false);
            byte[] var2 = new byte[(int) var0.method2543()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2544(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class73(new class190(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2541();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("el.x(I)V")
    public static void method3157() {
        class118 var0 = null;
        try {
            var0 = class163.method3143("", Statics.field39.field3224, true);
            class190 var1 = Statics.field27.method1665();
            var0.method2540(var1.field2420, 0, var1.field2419);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2542(true);
            }
        } catch (Exception var4) {
        }
    }
}
