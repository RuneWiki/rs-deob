package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ez")
public class class154 {

    @ObfuscatedName("ez.e")
    public static int field2539 = 0;

    @ObfuscatedName("ez.h")
    public static class175 field2530 = new class175(4096);

    @ObfuscatedName("ez.y")
    public static int field2538 = 0;

    @ObfuscatedName("ez.j")
    public static class175 field2532 = new class175(32);

    @ObfuscatedName("ez.l")
    public static int field2533 = 0;

    @ObfuscatedName("ez.f")
    public static class172 field2534 = new class172();

    @ObfuscatedName("ez.n")
    public static class175 field2535 = new class175(4096);

    @ObfuscatedName("ez.k")
    public static int field2536 = 0;

    @ObfuscatedName("ez.q")
    public static class175 field2528 = new class175(4096);

    @ObfuscatedName("ez.w")
    public static int field2543 = 0;

    @ObfuscatedName("ez.m")
    public static class127 field2540 = new class127(8);

    @ObfuscatedName("ez.u")
    public static int field2541 = 0;

    @ObfuscatedName("ez.x")
    public static CRC32 field2529 = new CRC32();

    @ObfuscatedName("ez.o")
    public static class155[] field2531 = new class155[256];

    @ObfuscatedName("ez.g")
    public static byte field2545 = 0;

    @ObfuscatedName("ez.d")
    public static int field2547 = 0;

    @ObfuscatedName("ez.t")
    public static int field2548 = 0;

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.p(ZI)V")
    public static void method555(boolean arg0) {
        if (Statics.field2713 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2657(arg0 ? 2 : 3);
            var1.method2482(0);
            Statics.field2713.method1408(var1.field2033, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2713.method1414();
            } catch (Exception var4) {
            }
            field2548++;
            Statics.field2713 = null;
        }
    }

    @ObfuscatedName("eh.e(Lbp;ZI)V")
    public static void method3031(class70 arg0, boolean arg1) {
        if (Statics.field2713 != null) {
            try {
                Statics.field2713.method1414();
            } catch (Exception var10) {
            }
            Statics.field2713 = null;
        }
        Statics.field2713 = arg0;
        method555(arg1);
        field2540.field2029 = 0;
        Statics.field1312 = null;
        Statics.field2076 = null;
        field2541 = 0;
        while (true) {
            class156 var3 = (class156) field2532.method3312();
            if (var3 == null) {
                while (true) {
                    class156 var4 = (class156) field2528.method3312();
                    if (var4 == null) {
                        if (field2545 != 0) {
                            try {
                                class127 var5 = new class127(4);
                                var5.method2657(4);
                                var5.method2657(field2545);
                                var5.method2481(0);
                                Statics.field2713.method1408(var5.field2033, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2713.method1414();
                                } catch (Exception var8) {
                                }
                                field2548++;
                                Statics.field2713 = null;
                            }
                        }
                        field2539 = 0;
                        Statics.field2546 = class121.method2();
                        return;
                    }
                    field2534.method3279(var4);
                    field2535.method3310(var4, var4.field2813);
                    field2536++;
                    field2543--;
                }
            }
            field2530.method3310(var3, var3.field2813);
            field2538++;
            field2533--;
        }
    }

    @ObfuscatedName("eb.a(Lep;IB)V")
    public static void method2772(class155 arg0, int arg1) {
        if (Statics.field2544 == null) {
            method1571((class155) null, 255, 255, 0, (byte) 0, true);
            field2531[arg1] = arg0;
        } else {
            Statics.field2544.field2029 = arg1 * 8 + 5;
            int var2 = Statics.field2544.method2617();
            int var3 = Statics.field2544.method2617();
            arg0.method3136(var2, var3);
        }
    }

    @ObfuscatedName("bs.h(Lep;IIIBZI)V")
    public static void method1571(class155 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class156 var8 = (class156) field2530.method3311(var6);
        if (var8 != null) {
            return;
        }
        class156 var9 = (class156) field2532.method3311(var6);
        if (var9 != null) {
            return;
        }
        class156 var10 = (class156) field2535.method3311(var6);
        if (var10 == null) {
            if (!arg5) {
                class156 var11 = (class156) field2528.method3311(var6);
                if (var11 != null) {
                    return;
                }
            }
            class156 var12 = new class156();
            var12.field2562 = arg0;
            var12.field2564 = arg3;
            var12.field2563 = arg4;
            if (arg5) {
                field2530.method3310(var12, var6);
                field2538++;
            } else {
                field2534.method3278(var12);
                field2535.method3310(var12, var6);
                field2536++;
            }
        } else if (arg5) {
            var10.method3305();
            field2530.method3310(var10, var6);
            field2536--;
            field2538++;
        }
    }
}
