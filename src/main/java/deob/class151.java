package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ew")
public class class151 {

    @ObfuscatedName("ew.s")
    public static int field2531 = 0;

    @ObfuscatedName("ew.o")
    public static class175 field2515 = new class175(4096);

    @ObfuscatedName("ew.k")
    public static int field2516 = 0;

    @ObfuscatedName("ew.m")
    public static class175 field2517 = new class175(32);

    @ObfuscatedName("ew.i")
    public static int field2518 = 0;

    @ObfuscatedName("ew.t")
    public static class182 field2519 = new class182();

    @ObfuscatedName("ew.l")
    public static class175 field2520 = new class175(4096);

    @ObfuscatedName("ew.p")
    public static int field2521 = 0;

    @ObfuscatedName("ew.r")
    public static class175 field2522 = new class175(4096);

    @ObfuscatedName("ew.j")
    public static int field2514 = 0;

    @ObfuscatedName("ew.n")
    public static class107 field2524 = new class107(8);

    @ObfuscatedName("ew.d")
    public static int field2525 = 0;

    @ObfuscatedName("ew.w")
    public static CRC32 field2526 = new CRC32();

    @ObfuscatedName("ew.x")
    public static class148[] field2529 = new class148[256];

    @ObfuscatedName("ew.e")
    public static byte field2527 = 0;

    @ObfuscatedName("ew.a")
    public static int field2513 = 0;

    @ObfuscatedName("ew.y")
    public static int field2523 = 0;

    public class151() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.g(ZI)V")
    public static void method610(boolean arg0) {
        if (Statics.field2533 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2079(arg0 ? 2 : 3);
            var1.method2261(0);
            Statics.field2533.method2509(var1.field1854, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2533.method2524();
            } catch (Exception var4) {
            }
            field2523++;
            Statics.field2533 = null;
        }
    }

    @ObfuscatedName("er.s(Ldt;ZI)V")
    public static void method2629(class130 arg0, boolean arg1) {
        if (Statics.field2533 != null) {
            try {
                Statics.field2533.method2524();
            } catch (Exception var10) {
            }
            Statics.field2533 = null;
        }
        Statics.field2533 = arg0;
        method610(arg1);
        field2524.field1851 = 0;
        Statics.field2062 = null;
        Statics.field1899 = null;
        field2525 = 0;
        while (true) {
            class152 var3 = (class152) field2517.method3154();
            if (var3 == null) {
                while (true) {
                    class152 var4 = (class152) field2522.method3154();
                    if (var4 == null) {
                        if (field2527 != 0) {
                            try {
                                class107 var5 = new class107(4);
                                var5.method2079(4);
                                var5.method2079(field2527);
                                var5.method2177(0);
                                Statics.field2533.method2509(var5.field1854, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2533.method2524();
                                } catch (Exception var8) {
                                }
                                field2523++;
                                Statics.field2533 = null;
                            }
                        }
                        field2531 = 0;
                        Statics.field2528 = class103.method1837();
                        return;
                    }
                    field2519.method3240(var4);
                    field2520.method3152(var4, var4.field2884);
                    field2521++;
                    field2514--;
                }
            }
            field2515.method3152(var3, var3.field2884);
            field2516++;
            field2518--;
        }
    }

    @ObfuscatedName("cu.v(Led;IIIBZI)V")
    public static void method1816(class148 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class152 var8 = (class152) field2515.method3155(var6);
        if (var8 != null) {
            return;
        }
        class152 var9 = (class152) field2517.method3155(var6);
        if (var9 != null) {
            return;
        }
        class152 var10 = (class152) field2520.method3155(var6);
        if (var10 == null) {
            if (!arg5) {
                class152 var11 = (class152) field2522.method3155(var6);
                if (var11 != null) {
                    return;
                }
            }
            class152 var12 = new class152();
            var12.field2537 = arg0;
            var12.field2536 = arg3;
            var12.field2538 = arg4;
            if (arg5) {
                field2515.method3152(var12, var6);
                field2516++;
            } else {
                field2519.method3239(var12);
                field2520.method3152(var12, var6);
                field2521++;
            }
        } else if (arg5) {
            var10.method3257();
            field2515.method3152(var10, var6);
            field2521--;
            field2516++;
        }
    }
}
