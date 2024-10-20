package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ea")
public class class150 {

    @ObfuscatedName("ea.c")
    public static int field2493 = 0;

    @ObfuscatedName("ea.v")
    public static class174 field2504 = new class174(4096);

    @ObfuscatedName("ea.q")
    public static int field2495 = 0;

    @ObfuscatedName("ea.s")
    public static class174 field2500 = new class174(32);

    @ObfuscatedName("ea.g")
    public static int field2498 = 0;

    @ObfuscatedName("ea.u")
    public static class181 field2499 = new class181();

    @ObfuscatedName("ea.d")
    public static class174 field2505 = new class174(4096);

    @ObfuscatedName("ea.y")
    public static int field2501 = 0;

    @ObfuscatedName("ea.e")
    public static class174 field2502 = new class174(4096);

    @ObfuscatedName("ea.l")
    public static int field2503 = 0;

    @ObfuscatedName("ea.t")
    public static class107 field2496 = new class107(8);

    @ObfuscatedName("ea.b")
    public static int field2497 = 0;

    @ObfuscatedName("ea.r")
    public static CRC32 field2506 = new CRC32();

    @ObfuscatedName("ea.f")
    public static class147[] field2507 = new class147[256];

    @ObfuscatedName("ea.k")
    public static byte field2508 = 0;

    @ObfuscatedName("ea.p")
    public static int field2509 = 0;

    @ObfuscatedName("ea.n")
    public static int field2510 = 0;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eq.i(ZB)V")
    public static void method2734(boolean arg0) {
        if (Statics.field2492 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2137(arg0 ? 2 : 3);
            var1.method2283(0);
            Statics.field2492.method2599(var1.field1841, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2492.method2612();
            } catch (Exception var4) {
            }
            field2510++;
            Statics.field2492 = null;
        }
    }

    @ObfuscatedName("ex.c(Ldi;ZS)V")
    public static void method2708(class130 arg0, boolean arg1) {
        if (Statics.field2492 != null) {
            try {
                Statics.field2492.method2612();
            } catch (Exception var10) {
            }
            Statics.field2492 = null;
        }
        Statics.field2492 = arg0;
        method2734(arg1);
        field2496.field1837 = 0;
        Statics.field620 = null;
        Statics.field238 = null;
        field2497 = 0;
        while (true) {
            class151 var3 = (class151) field2500.method3220();
            if (var3 == null) {
                while (true) {
                    class151 var4 = (class151) field2502.method3220();
                    if (var4 == null) {
                        if (field2508 != 0) {
                            try {
                                class107 var5 = new class107(4);
                                var5.method2137(4);
                                var5.method2137(field2508);
                                var5.method2235(0);
                                Statics.field2492.method2599(var5.field1841, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2492.method2612();
                                } catch (Exception var8) {
                                }
                                field2510++;
                                Statics.field2492 = null;
                            }
                        }
                        field2493 = 0;
                        Statics.field2494 = class103.method1055();
                        return;
                    }
                    field2499.method3294(var4);
                    field2505.method3229(var4, var4.field2871);
                    field2501++;
                    field2503--;
                }
            }
            field2504.method3229(var3, var3.field2871);
            field2495++;
            field2498--;
        }
    }

    @ObfuscatedName("eq.h(Lef;IB)V")
    public static void method2728(class147 arg0, int arg1) {
        if (Statics.field1448 == null) {
            method1067((class147) null, 255, 255, 0, (byte) 0, true);
            field2507[arg1] = arg0;
        } else {
            Statics.field1448.field1837 = arg1 * 8 + 5;
            int var2 = Statics.field1448.method2156();
            int var3 = Statics.field1448.method2156();
            arg0.method2825(var2, var3);
        }
    }

    @ObfuscatedName("ba.v(Lef;IIIBZI)V")
    public static void method1067(class147 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class151 var8 = (class151) field2504.method3218(var6);
        if (var8 != null) {
            return;
        }
        class151 var9 = (class151) field2500.method3218(var6);
        if (var9 != null) {
            return;
        }
        class151 var10 = (class151) field2505.method3218(var6);
        if (var10 == null) {
            if (!arg5) {
                class151 var11 = (class151) field2502.method3218(var6);
                if (var11 != null) {
                    return;
                }
            }
            class151 var12 = new class151();
            var12.field2518 = arg0;
            var12.field2514 = arg3;
            var12.field2515 = arg4;
            if (arg5) {
                field2504.method3229(var12, var6);
                field2495++;
            } else {
                field2499.method3297(var12);
                field2505.method3229(var12, var6);
                field2501++;
            }
        } else if (arg5) {
            var10.method3305();
            field2504.method3229(var10, var6);
            field2501--;
            field2495++;
        }
    }

    @ObfuscatedName("dc.q(III)V")
    public static void method2545(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class151 var4 = (class151) field2505.method3218(var2);
        if (var4 != null) {
            field2499.method3294(var4);
        }
    }

    @ObfuscatedName("client.s(III)I")
    public static int method238(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field620 != null && Statics.field620.field2871 == var2 ? Statics.field238.field1837 * 99 / (Statics.field238.field1841.length - Statics.field620.field2515) + 1 : 0;
    }

    @ObfuscatedName("du.g(I)V")
    public static void method2382() {
        if (Statics.field2492 != null) {
            Statics.field2492.method2612();
        }
    }
}
