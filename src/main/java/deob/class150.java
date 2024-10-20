package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ek")
public class class150 {

    @ObfuscatedName("ek.s")
    public static int field2494 = 0;

    @ObfuscatedName("ek.e")
    public static class174 field2489 = new class174(4096);

    @ObfuscatedName("ek.d")
    public static int field2490 = 0;

    @ObfuscatedName("ek.n")
    public static class174 field2496 = new class174(32);

    @ObfuscatedName("ek.v")
    public static int field2492 = 0;

    @ObfuscatedName("ek.z")
    public static class181 field2508 = new class181();

    @ObfuscatedName("ek.j")
    public static class174 field2493 = new class174(4096);

    @ObfuscatedName("ek.u")
    public static int field2495 = 0;

    @ObfuscatedName("ek.g")
    public static class174 field2488 = new class174(4096);

    @ObfuscatedName("ek.a")
    public static int field2497 = 0;

    @ObfuscatedName("ek.l")
    public static class107 field2499 = new class107(8);

    @ObfuscatedName("ek.x")
    public static int field2500 = 0;

    @ObfuscatedName("ek.y")
    public static CRC32 field2501 = new CRC32();

    @ObfuscatedName("ek.k")
    public static class147[] field2502 = new class147[256];

    @ObfuscatedName("ek.b")
    public static byte field2486 = 0;

    @ObfuscatedName("ek.h")
    public static int field2491 = 0;

    @ObfuscatedName("ek.i")
    public static int field2505 = 0;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("et.t(ZI)V")
    public static void method2692(boolean arg0) {
        if (Statics.field2498 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2214(arg0 ? 2 : 3);
            var1.method2176(0);
            Statics.field2498.method2585(var1.field1831, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2498.method2583();
            } catch (Exception var4) {
            }
            field2505++;
            Statics.field2498 = null;
        }
    }

    @ObfuscatedName("cr.s(Ldf;ZB)V")
    public static void method1745(class130 arg0, boolean arg1) {
        if (Statics.field2498 != null) {
            try {
                Statics.field2498.method2583();
            } catch (Exception var10) {
            }
            Statics.field2498 = null;
        }
        Statics.field2498 = arg0;
        method2692(arg1);
        field2499.field1830 = 0;
        Statics.field2114 = null;
        Statics.field1504 = null;
        field2500 = 0;
        while (true) {
            class151 var3 = (class151) field2496.method3202();
            if (var3 == null) {
                while (true) {
                    class151 var4 = (class151) field2488.method3202();
                    if (var4 == null) {
                        if (field2486 != 0) {
                            try {
                                class107 var5 = new class107(4);
                                var5.method2214(4);
                                var5.method2214(field2486);
                                var5.method2251(0);
                                Statics.field2498.method2585(var5.field1831, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2498.method2583();
                                } catch (Exception var8) {
                                }
                                field2505++;
                                Statics.field2498 = null;
                            }
                        }
                        field2494 = 0;
                        Statics.field2503 = class103.method2037();
                        return;
                    }
                    field2508.method3285(var4);
                    field2493.method3212(var4, var4.field2864);
                    field2495++;
                    field2497--;
                }
            }
            field2489.method3212(var3, var3.field2864);
            field2490++;
            field2492--;
        }
    }

    @ObfuscatedName("dt.f(Leo;II)V")
    public static void method2437(class147 arg0, int arg1) {
        if (Statics.field598 == null) {
            method1576((class147) null, 255, 255, 0, (byte) 0, true);
            field2502[arg1] = arg0;
        } else {
            Statics.field598.field1830 = arg1 * 8 + 5;
            int var2 = Statics.field598.method2106();
            int var3 = Statics.field598.method2106();
            arg0.method2797(var2, var3);
        }
    }

    @ObfuscatedName("bq.e(Leo;IIIBZI)V")
    public static void method1576(class147 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class151 var8 = (class151) field2489.method3204(var6);
        if (var8 != null) {
            return;
        }
        class151 var9 = (class151) field2496.method3204(var6);
        if (var9 != null) {
            return;
        }
        class151 var10 = (class151) field2493.method3204(var6);
        if (var10 == null) {
            if (!arg5) {
                class151 var11 = (class151) field2488.method3204(var6);
                if (var11 != null) {
                    return;
                }
            }
            class151 var12 = new class151();
            var12.field2513 = arg0;
            var12.field2509 = arg3;
            var12.field2511 = arg4;
            if (arg5) {
                field2489.method3212(var12, var6);
                field2490++;
            } else {
                field2508.method3284(var12);
                field2493.method3212(var12, var6);
                field2495++;
            }
        } else if (arg5) {
            var10.method3299();
            field2489.method3212(var10, var6);
            field2495--;
            field2490++;
        }
    }

    @ObfuscatedName("fq.d(III)V")
    public static void method3151(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class151 var4 = (class151) field2493.method3204(var2);
        if (var4 != null) {
            field2508.method3285(var4);
        }
    }

    @ObfuscatedName("cw.n(IIB)I")
    public static int method1929(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2114 != null && Statics.field2114.field2864 == var2 ? Statics.field1504.field1830 * 99 / (Statics.field1504.field1831.length - Statics.field2114.field2511) + 1 : 0;
    }
}
