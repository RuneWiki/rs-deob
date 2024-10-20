package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ey")
public class class153 {

    @ObfuscatedName("ey.g")
    public static int field2532 = 0;

    @ObfuscatedName("ey.t")
    public static class175 field2544 = new class175(4096);

    @ObfuscatedName("ey.f")
    public static int field2540 = 0;

    @ObfuscatedName("ey.c")
    public static class175 field2553 = new class175(32);

    @ObfuscatedName("ey.p")
    public static int field2537 = 0;

    @ObfuscatedName("ey.s")
    public static class172 field2531 = new class172();

    @ObfuscatedName("ey.k")
    public static class175 field2548 = new class175(4096);

    @ObfuscatedName("ey.m")
    public static int field2538 = 0;

    @ObfuscatedName("ey.y")
    public static class175 field2541 = new class175(4096);

    @ObfuscatedName("ey.b")
    public static int field2542 = 0;

    @ObfuscatedName("ey.z")
    public static class127 field2534 = new class127(8);

    @ObfuscatedName("ey.h")
    public static int field2546 = 0;

    @ObfuscatedName("ey.u")
    public static CRC32 field2536 = new CRC32();

    @ObfuscatedName("ey.e")
    public static class154[] field2549 = new class154[256];

    @ObfuscatedName("ey.n")
    public static byte field2550 = 0;

    @ObfuscatedName("ey.q")
    public static int field2551 = 0;

    @ObfuscatedName("ey.w")
    public static int field2552 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.d(ZS)V")
    public static void method1539(boolean arg0) {
        if (Statics.field2535 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2386(arg0 ? 2 : 3);
            var1.method2460(0);
            Statics.field2535.method1361(var1.field2035, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2535.method1356();
            } catch (Exception var4) {
            }
            field2552++;
            Statics.field2535 = null;
        }
    }

    @ObfuscatedName("aa.g(Lbr;ZB)V")
    public static void method667(class70 arg0, boolean arg1) {
        if (Statics.field2535 != null) {
            try {
                Statics.field2535.method1356();
            } catch (Exception var10) {
            }
            Statics.field2535 = null;
        }
        Statics.field2535 = arg0;
        method1539(arg1);
        field2534.field2042 = 0;
        Statics.field2543 = null;
        Statics.field2545 = null;
        field2546 = 0;
        while (true) {
            class155 var3 = (class155) field2553.method3257();
            if (var3 == null) {
                while (true) {
                    class155 var4 = (class155) field2541.method3257();
                    if (var4 == null) {
                        if (field2550 != 0) {
                            try {
                                class127 var5 = new class127(4);
                                var5.method2386(4);
                                var5.method2386(field2550);
                                var5.method2387(0);
                                Statics.field2535.method1361(var5.field2035, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2535.method1356();
                                } catch (Exception var8) {
                                }
                                field2552++;
                                Statics.field2535 = null;
                            }
                        }
                        field2532 = 0;
                        Statics.field2533 = class121.method1250();
                        return;
                    }
                    field2531.method3223(var4);
                    field2548.method3268(var4, var4.field2818);
                    field2538++;
                    field2542--;
                }
            }
            field2544.method3268(var3, var3.field2818);
            field2540++;
            field2537--;
        }
    }

    @ObfuscatedName("bs.a(Leo;IIIBZB)V")
    public static void method1321(class154 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class155 var8 = (class155) field2544.method3255(var6);
        if (var8 != null) {
            return;
        }
        class155 var9 = (class155) field2553.method3255(var6);
        if (var9 != null) {
            return;
        }
        class155 var10 = (class155) field2548.method3255(var6);
        if (var10 == null) {
            if (!arg5) {
                class155 var11 = (class155) field2541.method3255(var6);
                if (var11 != null) {
                    return;
                }
            }
            class155 var12 = new class155();
            var12.field2571 = arg0;
            var12.field2567 = arg3;
            var12.field2569 = arg4;
            if (arg5) {
                field2544.method3268(var12, var6);
                field2540++;
            } else {
                field2531.method3226(var12);
                field2548.method3268(var12, var6);
                field2538++;
            }
        } else if (arg5) {
            var10.method3248();
            field2544.method3268(var10, var6);
            field2538--;
            field2540++;
        }
    }

    @ObfuscatedName("bi.t(III)I")
    public static int method1255(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2543 != null && Statics.field2543.field2818 == var2 ? Statics.field2545.field2042 * 99 / (Statics.field2545.field2035.length - Statics.field2543.field2569) + 1 : 0;
    }

    @ObfuscatedName("t.f(ZZI)I")
    public static int method39(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2540 + field2537;
        }
        if (arg1) {
            var2 += field2542 + field2538;
        }
        return var2;
    }

    @ObfuscatedName("eh.c(S)V")
    public static void method2863() {
        if (Statics.field2535 != null) {
            Statics.field2535.method1356();
        }
    }
}
