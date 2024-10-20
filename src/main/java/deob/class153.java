package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ek")
public class class153 {

    @ObfuscatedName("ek.m")
    public static int field2529 = 0;

    @ObfuscatedName("ek.k")
    public static class175 field2536 = new class175(4096);

    @ObfuscatedName("ek.n")
    public static int field2526 = 0;

    @ObfuscatedName("ek.s")
    public static class175 field2527 = new class175(32);

    @ObfuscatedName("ek.x")
    public static int field2525 = 0;

    @ObfuscatedName("ek.b")
    public static class172 field2522 = new class172();

    @ObfuscatedName("ek.j")
    public static class175 field2537 = new class175(4096);

    @ObfuscatedName("ek.p")
    public static int field2530 = 0;

    @ObfuscatedName("ek.l")
    public static class175 field2531 = new class175(4096);

    @ObfuscatedName("ek.i")
    public static int field2533 = 0;

    @ObfuscatedName("ek.c")
    public static class127 field2540 = new class127(8);

    @ObfuscatedName("ek.a")
    public static int field2538 = 0;

    @ObfuscatedName("ek.u")
    public static CRC32 field2539 = new CRC32();

    @ObfuscatedName("ek.v")
    public static class154[] field2532 = new class154[256];

    @ObfuscatedName("ek.w")
    public static byte field2541 = 0;

    @ObfuscatedName("ek.h")
    public static int field2542 = 0;

    @ObfuscatedName("ek.q")
    public static int field2543 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eq.y(ZB)V")
    public static void method2962(boolean arg0) {
        if (Statics.field2528 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2444(arg0 ? 2 : 3);
            var1.method2446(0);
            Statics.field2528.method1383(var1.field2037, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2528.method1391();
            } catch (Exception var4) {
            }
            field2543++;
            Statics.field2528 = null;
        }
    }

    @ObfuscatedName("eq.m(Lby;ZI)V")
    public static void method2954(class70 arg0, boolean arg1) {
        if (Statics.field2528 != null) {
            try {
                Statics.field2528.method1391();
            } catch (Exception var10) {
            }
            Statics.field2528 = null;
        }
        Statics.field2528 = arg0;
        method2962(arg1);
        field2540.field2036 = 0;
        Statics.field2535 = null;
        Statics.field2523 = null;
        field2538 = 0;
        while (true) {
            class155 var3 = (class155) field2527.method3335();
            if (var3 == null) {
                while (true) {
                    class155 var4 = (class155) field2531.method3335();
                    if (var4 == null) {
                        if (field2541 != 0) {
                            try {
                                class127 var5 = new class127(4);
                                var5.method2444(4);
                                var5.method2444(field2541);
                                var5.method2445(0);
                                Statics.field2528.method1383(var5.field2037, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2528.method1391();
                                } catch (Exception var8) {
                                }
                                field2543++;
                                Statics.field2528 = null;
                            }
                        }
                        field2529 = 0;
                        Statics.field2524 = class121.method1389();
                        return;
                    }
                    field2522.method3314(var4);
                    field2537.method3334(var4, var4.field2819);
                    field2530++;
                    field2533--;
                }
            }
            field2536.method3334(var3, var3.field2819);
            field2526++;
            field2525--;
        }
    }

    @ObfuscatedName("ax.d(Lee;II)V")
    public static void method575(class154 arg0, int arg1) {
        if (Statics.field1845 == null) {
            method1((class154) null, 255, 255, 0, (byte) 0, true);
            field2532[arg1] = arg0;
        } else {
            Statics.field1845.field2036 = arg1 * 8 + 5;
            int var2 = Statics.field1845.method2628();
            int var3 = Statics.field1845.method2628();
            arg0.method3099(var2, var3);
        }
    }

    @ObfuscatedName("y.k(Lee;IIIBZB)V")
    public static void method1(class154 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class155 var8 = (class155) field2536.method3337(var6);
        if (var8 != null) {
            return;
        }
        class155 var9 = (class155) field2527.method3337(var6);
        if (var9 != null) {
            return;
        }
        class155 var10 = (class155) field2537.method3337(var6);
        if (var10 == null) {
            if (!arg5) {
                class155 var11 = (class155) field2531.method3337(var6);
                if (var11 != null) {
                    return;
                }
            }
            class155 var12 = new class155();
            var12.field2559 = arg0;
            var12.field2560 = arg3;
            var12.field2556 = arg4;
            if (arg5) {
                field2536.method3334(var12, var6);
                field2526++;
            } else {
                field2522.method3301(var12);
                field2537.method3334(var12, var6);
                field2530++;
            }
        } else if (arg5) {
            var10.method3327();
            field2536.method3334(var10, var6);
            field2530--;
            field2526++;
        }
    }

    @ObfuscatedName("eq.n(I)V")
    public static void method2964() {
        if (Statics.field2528 != null) {
            Statics.field2528.method1391();
        }
    }
}
