package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ed")
public class class154 {

    @ObfuscatedName("ed.c")
    public static int field2559 = 0;

    @ObfuscatedName("ed.i")
    public static class175 field2573 = new class175(4096);

    @ObfuscatedName("ed.k")
    public static int field2561 = 0;

    @ObfuscatedName("ed.q")
    public static class175 field2562 = new class175(32);

    @ObfuscatedName("ed.t")
    public static int field2558 = 0;

    @ObfuscatedName("ed.v")
    public static class172 field2565 = new class172();

    @ObfuscatedName("ed.y")
    public static class175 field2574 = new class175(4096);

    @ObfuscatedName("ed.w")
    public static int field2566 = 0;

    @ObfuscatedName("ed.g")
    public static class175 field2567 = new class175(4096);

    @ObfuscatedName("ed.s")
    public static int field2568 = 0;

    @ObfuscatedName("ed.o")
    public static class127 field2569 = new class127(8);

    @ObfuscatedName("ed.u")
    public static int field2570 = 0;

    @ObfuscatedName("ed.d")
    public static CRC32 field2571 = new CRC32();

    @ObfuscatedName("ed.f")
    public static class155[] field2560 = new class155[256];

    @ObfuscatedName("ed.a")
    public static byte field2563 = 0;

    @ObfuscatedName("ed.h")
    public static int field2564 = 0;

    @ObfuscatedName("ed.p")
    public static int field2576 = 0;

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.b(ZI)V")
    public static void method126(boolean arg0) {
        if (Statics.field2577 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2590(arg0 ? 2 : 3);
            var1.method2404(0);
            Statics.field2577.method1352(var1.field2056, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2577.method1350();
            } catch (Exception var4) {
            }
            field2576++;
            Statics.field2577 = null;
        }
    }

    @ObfuscatedName("at.c(Lbi;ZI)V")
    public static void method671(class70 arg0, boolean arg1) {
        if (Statics.field2577 != null) {
            try {
                Statics.field2577.method1350();
            } catch (Exception var10) {
            }
            Statics.field2577 = null;
        }
        Statics.field2577 = arg0;
        method126(arg1);
        field2569.field2051 = 0;
        Statics.field192 = null;
        Statics.field2052 = null;
        field2570 = 0;
        while (true) {
            class156 var3 = (class156) field2562.method3226();
            if (var3 == null) {
                while (true) {
                    class156 var4 = (class156) field2567.method3226();
                    if (var4 == null) {
                        if (field2563 != 0) {
                            try {
                                class127 var5 = new class127(4);
                                var5.method2590(4);
                                var5.method2590(field2563);
                                var5.method2576(0);
                                Statics.field2577.method1352(var5.field2056, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2577.method1350();
                                } catch (Exception var8) {
                                }
                                field2576++;
                                Statics.field2577 = null;
                            }
                        }
                        field2559 = 0;
                        Statics.field1299 = class121.method2318();
                        return;
                    }
                    field2565.method3203(var4);
                    field2574.method3228(var4, var4.field2826);
                    field2566++;
                    field2568--;
                }
            }
            field2573.method3228(var3, var3.field2826);
            field2561++;
            field2558--;
        }
    }

    @ObfuscatedName("b.j(Leu;IIIBZI)V")
    public static void method4(class155 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class156 var8 = (class156) field2573.method3232(var6);
        if (var8 != null) {
            return;
        }
        class156 var9 = (class156) field2562.method3232(var6);
        if (var9 != null) {
            return;
        }
        class156 var10 = (class156) field2574.method3232(var6);
        if (var10 == null) {
            if (!arg5) {
                class156 var11 = (class156) field2567.method3232(var6);
                if (var11 != null) {
                    return;
                }
            }
            class156 var12 = new class156();
            var12.field2595 = arg0;
            var12.field2592 = arg3;
            var12.field2591 = arg4;
            if (arg5) {
                field2573.method3228(var12, var6);
                field2561++;
            } else {
                field2565.method3202(var12);
                field2574.method3228(var12, var6);
                field2566++;
            }
        } else if (arg5) {
            var10.method3223();
            field2573.method3228(var10, var6);
            field2566--;
            field2561++;
        }
    }

    @ObfuscatedName("em.i(III)I")
    public static int method2692(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field192 != null && Statics.field192.field2826 == var2 ? Statics.field2052.field2051 * 99 / (Statics.field2052.field2056.length - Statics.field192.field2591) + 1 : 0;
    }

    @ObfuscatedName("es.k(ZZS)I")
    public static int method2701(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2561 + field2558;
        }
        if (arg1) {
            var2 += field2568 + field2566;
        }
        return var2;
    }

    @ObfuscatedName("ai.q(S)V")
    public static void method767() {
        if (Statics.field2577 != null) {
            Statics.field2577.method1350();
        }
    }
}
