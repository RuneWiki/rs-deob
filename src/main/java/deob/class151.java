package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ee")
public class class151 {

    @ObfuscatedName("ee.x")
    public static int field2497 = 0;

    @ObfuscatedName("ee.i")
    public static class175 field2508 = new class175(4096);

    @ObfuscatedName("ee.d")
    public static int field2499 = 0;

    @ObfuscatedName("ee.q")
    public static class175 field2500 = new class175(32);

    @ObfuscatedName("ee.m")
    public static int field2501 = 0;

    @ObfuscatedName("ee.a")
    public static class182 field2502 = new class182();

    @ObfuscatedName("ee.w")
    public static class175 field2507 = new class175(4096);

    @ObfuscatedName("ee.e")
    public static int field2505 = 0;

    @ObfuscatedName("ee.o")
    public static class175 field2498 = new class175(4096);

    @ObfuscatedName("ee.v")
    public static int field2506 = 0;

    @ObfuscatedName("ee.r")
    public static class107 field2504 = new class107(8);

    @ObfuscatedName("ee.u")
    public static int field2509 = 0;

    @ObfuscatedName("ee.t")
    public static CRC32 field2510 = new CRC32();

    @ObfuscatedName("ee.g")
    public static class148[] field2495 = new class148[256];

    @ObfuscatedName("ee.s")
    public static byte field2512 = 0;

    @ObfuscatedName("ee.y")
    public static int field2513 = 0;

    @ObfuscatedName("ee.p")
    public static int field2514 = 0;

    public class151() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.n(ZI)V")
    public static void method695(boolean arg0) {
        if (Statics.field2496 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2124(arg0 ? 2 : 3);
            var1.method2126(0);
            Statics.field2496.method2552(var1.field1829, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2496.method2548();
            } catch (Exception var4) {
            }
            field2514++;
            Statics.field2496 = null;
        }
    }

    @ObfuscatedName("w.x(Ldd;ZI)V")
    public static void method114(class130 arg0, boolean arg1) {
        if (Statics.field2496 != null) {
            try {
                Statics.field2496.method2548();
            } catch (Exception var10) {
            }
            Statics.field2496 = null;
        }
        Statics.field2496 = arg0;
        method695(arg1);
        field2504.field1826 = 0;
        Statics.field2776 = null;
        Statics.field730 = null;
        field2509 = 0;
        while (true) {
            class152 var3 = (class152) field2500.method3153();
            if (var3 == null) {
                while (true) {
                    class152 var4 = (class152) field2498.method3153();
                    if (var4 == null) {
                        if (field2512 != 0) {
                            try {
                                class107 var5 = new class107(4);
                                var5.method2124(4);
                                var5.method2124(field2512);
                                var5.method2125(0);
                                Statics.field2496.method2552(var5.field1829, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2496.method2548();
                                } catch (Exception var8) {
                                }
                                field2514++;
                                Statics.field2496 = null;
                            }
                        }
                        field2497 = 0;
                        Statics.field2503 = class103.method1066();
                        return;
                    }
                    field2502.method3238(var4);
                    field2507.method3156(var4, var4.field2888);
                    field2505++;
                    field2506--;
                }
            }
            field2508.method3156(var3, var3.field2888);
            field2499++;
            field2501--;
        }
    }

    @ObfuscatedName("o.k(Leh;II)V")
    public static void method133(class148 arg0, int arg1) {
        if (Statics.field2065 == null) {
            method2776((class148) null, 255, 255, 0, (byte) 0, true);
            field2495[arg1] = arg0;
        } else {
            Statics.field2065.field1826 = arg1 * 8 + 5;
            int var2 = Statics.field2065.method2183();
            int var3 = Statics.field2065.method2183();
            arg0.method2770(var2, var3);
        }
    }

    @ObfuscatedName("ez.i(Leh;IIIBZI)V")
    public static void method2776(class148 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class152 var8 = (class152) field2508.method3149(var6);
        if (var8 != null) {
            return;
        }
        class152 var9 = (class152) field2500.method3149(var6);
        if (var9 != null) {
            return;
        }
        class152 var10 = (class152) field2507.method3149(var6);
        if (var10 == null) {
            if (!arg5) {
                class152 var11 = (class152) field2498.method3149(var6);
                if (var11 != null) {
                    return;
                }
            }
            class152 var12 = new class152();
            var12.field2520 = arg0;
            var12.field2517 = arg3;
            var12.field2516 = arg4;
            if (arg5) {
                field2508.method3156(var12, var6);
                field2499++;
            } else {
                field2502.method3244(var12);
                field2507.method3156(var12, var6);
                field2505++;
            }
        } else if (arg5) {
            var10.method3253();
            field2508.method3156(var10, var6);
            field2505--;
            field2499++;
        }
    }

    @ObfuscatedName("b.d(IIB)V")
    public static void method537(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class152 var4 = (class152) field2507.method3149(var2);
        if (var4 != null) {
            field2502.method3238(var4);
        }
    }

    @ObfuscatedName("ba.q(III)I")
    public static int method1369(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2776 != null && Statics.field2776.field2888 == var2 ? Statics.field730.field1826 * 99 / (Statics.field730.field1829.length - Statics.field2776.field2516) + 1 : 0;
    }
}
