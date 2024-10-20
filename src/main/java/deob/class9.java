package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("j")
public class class9 {

    @ObfuscatedName("j.a")
    public static int field131 = 4;

    @ObfuscatedName("j.f")
    public boolean field132;

    @ObfuscatedName("j.s")
    public boolean field133;

    @ObfuscatedName("j.y")
    public int field134 = 1;

    @ObfuscatedName("j.e")
    public LinkedHashMap field135 = new LinkedHashMap();

    public class9() {
        this.method115(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1981 == null) {
            this.method115(true);
        } else {
            int var2 = arg0.method2412();
            if (var2 >= 0 && var2 <= field131) {
                if (arg0.method2412() == 1) {
                    this.field132 = true;
                }
                if (var2 > 1) {
                    this.field133 = arg0.method2412() == 1;
                }
                if (var2 > 3) {
                    this.field134 = arg0.method2412();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2412();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2350();
                        int var6 = arg0.method2350();
                        this.field135.put(var5, var6);
                    }
                }
            } else {
                this.method115(true);
            }
        }
    }

    @ObfuscatedName("j.a(ZB)V")
    public void method115(boolean arg0) {
    }

    @ObfuscatedName("j.r(B)Lds;")
    public class119 method116() {
        class119 var1 = new class119(100);
        var1.method2330(field131);
        var1.method2330(this.field132 ? 1 : 0);
        var1.method2330(this.field133 ? 1 : 0);
        var1.method2330(this.field134);
        var1.method2330(this.field135.size());
        Iterator var2 = this.field135.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2496((Integer) var3.getKey());
            var1.method2496((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("cg.f(S)Lj;")
    public static class9 method2140() {
        class227 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class149.method2708("", Statics.field275.field2273, false);
            byte[] var2 = new byte[(int) var0.method3864()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3865(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class119(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3876();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("da.s(B)V")
    public static void method2269() {
        class227 var0 = null;
        try {
            var0 = class149.method2708("", Statics.field275.field2273, true);
            class119 var1 = Statics.field1549.method116();
            var0.method3862(var1.field1981, 0, var1.field1980);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3876();
            }
        } catch (Exception var4) {
        }
    }
}
