package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eo")
public class class154 {

    @ObfuscatedName("eo.e")
    public static int field2539 = 0;

    @ObfuscatedName("eo.o")
    public static class175 field2554 = new class175(4096);

    @ObfuscatedName("eo.a")
    public static int field2542 = 0;

    @ObfuscatedName("eo.h")
    public static class175 field2543 = new class175(32);

    @ObfuscatedName("eo.j")
    public static int field2557 = 0;

    @ObfuscatedName("eo.f")
    public static class172 field2558 = new class172();

    @ObfuscatedName("eo.q")
    public static class175 field2546 = new class175(4096);

    @ObfuscatedName("eo.l")
    public static int field2547 = 0;

    @ObfuscatedName("eo.d")
    public static class175 field2560 = new class175(4096);

    @ObfuscatedName("eo.z")
    public static int field2549 = 0;

    @ObfuscatedName("eo.w")
    public static class126 field2550 = new class126(8);

    @ObfuscatedName("eo.x")
    public static int field2552 = 0;

    @ObfuscatedName("eo.y")
    public static CRC32 field2553 = new CRC32();

    @ObfuscatedName("eo.p")
    public static class155[] field2538 = new class155[256];

    @ObfuscatedName("eo.s")
    public static byte field2555 = 0;

    @ObfuscatedName("eo.m")
    public static int field2544 = 0;

    @ObfuscatedName("eo.c")
    public static int field2556 = 0;

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cd.b(ZI)V")
    public static void method2024(boolean arg0) {
        if (Statics.field2559 == null) {
            return;
        }
        try {
            class126 var1 = new class126(4);
            var1.method2422(arg0 ? 2 : 3);
            var1.method2451(0);
            Statics.field2559.method1362(var1.field2026, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2559.method1381();
            } catch (Exception var4) {
            }
            field2556++;
            Statics.field2559 = null;
        }
    }

    @ObfuscatedName("w.e(Lbm;ZI)V")
    public static void method128(class70 arg0, boolean arg1) {
        if (Statics.field2559 != null) {
            try {
                Statics.field2559.method1381();
            } catch (Exception var10) {
            }
            Statics.field2559 = null;
        }
        Statics.field2559 = arg0;
        method2024(arg1);
        field2550.field2027 = 0;
        Statics.field1612 = null;
        Statics.field2551 = null;
        field2552 = 0;
        while (true) {
            class156 var3 = (class156) field2543.method3294();
            if (var3 == null) {
                while (true) {
                    class156 var4 = (class156) field2560.method3294();
                    if (var4 == null) {
                        if (field2555 != 0) {
                            try {
                                class126 var5 = new class126(4);
                                var5.method2422(4);
                                var5.method2422(field2555);
                                var5.method2423(0);
                                Statics.field2559.method1362(var5.field2026, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2559.method1381();
                                } catch (Exception var8) {
                                }
                                field2556++;
                                Statics.field2559 = null;
                            }
                        }
                        field2539 = 0;
                        Statics.field2540 = class121.method2221();
                        return;
                    }
                    field2558.method3270(var4);
                    field2546.method3292(var4, var4.field2810);
                    field2547++;
                    field2549--;
                }
            }
            field2554.method3292(var3, var3.field2810);
            field2542++;
            field2557--;
        }
    }

    @ObfuscatedName("cd.g(Lew;IIIBZB)V")
    public static void method2022(class155 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class156 var8 = (class156) field2554.method3291(var6);
        if (var8 != null) {
            return;
        }
        class156 var9 = (class156) field2543.method3291(var6);
        if (var9 != null) {
            return;
        }
        class156 var10 = (class156) field2546.method3291(var6);
        if (var10 == null) {
            if (!arg5) {
                class156 var11 = (class156) field2560.method3291(var6);
                if (var11 != null) {
                    return;
                }
            }
            class156 var12 = new class156();
            var12.field2576 = arg0;
            var12.field2575 = arg3;
            var12.field2577 = arg4;
            if (arg5) {
                field2554.method3292(var12, var6);
                field2542++;
            } else {
                field2558.method3274(var12);
                field2546.method3292(var12, var6);
                field2547++;
            }
        } else if (arg5) {
            var10.method3287();
            field2554.method3292(var10, var6);
            field2547--;
            field2542++;
        }
    }

    @ObfuscatedName("eq.a(ZZI)I")
    public static int method2960(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2557 + field2542;
        }
        if (arg1) {
            var2 += field2549 + field2547;
        }
        return var2;
    }
}
