package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fz")
public class class162 {

    @ObfuscatedName("fz.a")
    public static int field2583 = 0;

    @ObfuscatedName("fz.c")
    public static class186 field2590 = new class186(4096);

    @ObfuscatedName("fz.u")
    public static int field2584 = 0;

    @ObfuscatedName("fz.w")
    public static class186 field2585 = new class186(32);

    @ObfuscatedName("fz.i")
    public static int field2592 = 0;

    @ObfuscatedName("fz.r")
    public static class193 field2587 = new class193();

    @ObfuscatedName("fz.f")
    public static class186 field2588 = new class186(4096);

    @ObfuscatedName("fz.g")
    public static int field2586 = 0;

    @ObfuscatedName("fz.o")
    public static class186 field2594 = new class186(4096);

    @ObfuscatedName("fz.h")
    public static int field2591 = 0;

    @ObfuscatedName("fz.m")
    public static class111 field2593 = new class111(8);

    @ObfuscatedName("fz.z")
    public static int field2589 = 0;

    @ObfuscatedName("fz.q")
    public static CRC32 field2596 = new CRC32();

    @ObfuscatedName("fz.b")
    public static class159[] field2597 = new class159[256];

    @ObfuscatedName("fz.x")
    public static byte field2598 = 0;

    @ObfuscatedName("fz.n")
    public static int field2599 = 0;

    @ObfuscatedName("fz.v")
    public static int field2600 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.e(ZB)V")
    public static void method203(boolean arg0) {
        if (Statics.field2581 == null) {
            return;
        }
        try {
            class111 var1 = new class111(4);
            var1.method2366(arg0 ? 2 : 3);
            var1.method2163(0);
            Statics.field2581.method2663(var1.field1835, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2581.method2659();
            } catch (Exception var4) {
            }
            field2600++;
            Statics.field2581 = null;
        }
    }

    @ObfuscatedName("cl.a(Leo;ZB)V")
    public static void method2009(class135 arg0, boolean arg1) {
        if (Statics.field2581 != null) {
            try {
                Statics.field2581.method2659();
            } catch (Exception var10) {
            }
            Statics.field2581 = null;
        }
        Statics.field2581 = arg0;
        method203(arg1);
        field2593.field1834 = 0;
        Statics.field1466 = null;
        Statics.field616 = null;
        field2589 = 0;
        while (true) {
            class163 var3 = (class163) field2585.method3341();
            if (var3 == null) {
                while (true) {
                    class163 var4 = (class163) field2594.method3341();
                    if (var4 == null) {
                        if (field2598 != 0) {
                            try {
                                class111 var5 = new class111(4);
                                var5.method2366(4);
                                var5.method2366(field2598);
                                var5.method2190(0);
                                Statics.field2581.method2663(var5.field1835, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2581.method2659();
                                } catch (Exception var8) {
                                }
                                field2600++;
                                Statics.field2581 = null;
                            }
                        }
                        field2583 = 0;
                        Statics.field2582 = class107.method635();
                        return;
                    }
                    field2587.method3422(var4);
                    field2588.method3338(var4, var4.field2963);
                    field2586++;
                    field2591--;
                }
            }
            field2590.method3338(var3, var3.field2963);
            field2584++;
            field2592--;
        }
    }

    @ObfuscatedName("cf.l(Lfo;IIIBZI)V")
    public static void method1652(class159 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class163 var8 = (class163) field2590.method3339(var6);
        if (var8 != null) {
            return;
        }
        class163 var9 = (class163) field2585.method3339(var6);
        if (var9 != null) {
            return;
        }
        class163 var10 = (class163) field2588.method3339(var6);
        if (var10 == null) {
            if (!arg5) {
                class163 var11 = (class163) field2594.method3339(var6);
                if (var11 != null) {
                    return;
                }
            }
            class163 var12 = new class163();
            var12.field2604 = arg0;
            var12.field2607 = arg3;
            var12.field2603 = arg4;
            if (arg5) {
                field2590.method3338(var12, var6);
                field2584++;
            } else {
                field2587.method3429(var12);
                field2588.method3338(var12, var6);
                field2586++;
            }
        } else if (arg5) {
            var10.method3440();
            field2590.method3338(var10, var6);
            field2586--;
            field2584++;
        }
    }

    @ObfuscatedName("ae.c(III)I")
    public static int method627(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1466 != null && Statics.field1466.field2963 == var2 ? Statics.field616.field1834 * 99 / (Statics.field616.field1835.length - Statics.field1466.field2603) + 1 : 0;
    }

    @ObfuscatedName("em.u(ZZI)I")
    public static int method2771(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2592 + field2584;
        }
        if (arg1) {
            var2 += field2591 + field2586;
        }
        return var2;
    }
}
