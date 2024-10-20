package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ej")
public class class151 {

    @ObfuscatedName("ej.s")
    public static int field2491 = 0;

    @ObfuscatedName("ej.m")
    public static class175 field2497 = new class175(4096);

    @ObfuscatedName("ej.u")
    public static int field2516 = 0;

    @ObfuscatedName("ej.j")
    public static class175 field2496 = new class175(32);

    @ObfuscatedName("ej.b")
    public static int field2507 = 0;

    @ObfuscatedName("ej.v")
    public static class182 field2498 = new class182();

    @ObfuscatedName("ej.y")
    public static class175 field2499 = new class175(4096);

    @ObfuscatedName("ej.w")
    public static int field2500 = 0;

    @ObfuscatedName("ej.x")
    public static class175 field2503 = new class175(4096);

    @ObfuscatedName("ej.k")
    public static int field2492 = 0;

    @ObfuscatedName("ej.f")
    public static class107 field2504 = new class107(8);

    @ObfuscatedName("ej.e")
    public static int field2505 = 0;

    @ObfuscatedName("ej.c")
    public static CRC32 field2501 = new CRC32();

    @ObfuscatedName("ej.n")
    public static class148[] field2508 = new class148[256];

    @ObfuscatedName("ej.d")
    public static byte field2509 = 0;

    @ObfuscatedName("ej.p")
    public static int field2510 = 0;

    @ObfuscatedName("ej.z")
    public static int field2511 = 0;

    public class151() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.g(ZI)V")
    public static void method2232(boolean arg0) {
        if (Statics.field2495 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2087(arg0 ? 2 : 3);
            var1.method2089(0);
            Statics.field2495.method2538(var1.field1839, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2495.method2551();
            } catch (Exception var4) {
            }
            field2511++;
            Statics.field2495 = null;
        }
    }

    @ObfuscatedName("de.s(Ldd;ZI)V")
    public static void method2319(class130 arg0, boolean arg1) {
        if (Statics.field2495 != null) {
            try {
                Statics.field2495.method2551();
            } catch (Exception var10) {
            }
            Statics.field2495 = null;
        }
        Statics.field2495 = arg0;
        method2232(arg1);
        field2504.field1835 = 0;
        Statics.field2494 = null;
        Statics.field541 = null;
        field2505 = 0;
        while (true) {
            class152 var3 = (class152) field2496.method3163();
            if (var3 == null) {
                while (true) {
                    class152 var4 = (class152) field2503.method3163();
                    if (var4 == null) {
                        if (field2509 != 0) {
                            try {
                                class107 var5 = new class107(4);
                                var5.method2087(4);
                                var5.method2087(field2509);
                                var5.method2088(0);
                                Statics.field2495.method2538(var5.field1839, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2495.method2551();
                                } catch (Exception var8) {
                                }
                                field2511++;
                                Statics.field2495 = null;
                            }
                        }
                        field2491 = 0;
                        Statics.field2493 = class103.method494();
                        return;
                    }
                    field2498.method3255(var4);
                    field2499.method3161(var4, var4.field2873);
                    field2500++;
                    field2492--;
                }
            }
            field2497.method3161(var3, var3.field2873);
            field2516++;
            field2507--;
        }
    }

    @ObfuscatedName("dn.h(Leg;II)V")
    public static void method2349(class148 arg0, int arg1) {
        if (Statics.field63 == null) {
            method2630((class148) null, 255, 255, 0, (byte) 0, true);
            field2508[arg1] = arg0;
        } else {
            Statics.field63.field1835 = arg1 * 8 + 5;
            int var2 = Statics.field63.method2286();
            int var3 = Statics.field63.method2286();
            arg0.method2751(var2, var3);
        }
    }

    @ObfuscatedName("ec.m(Leg;IIIBZI)V")
    public static void method2630(class148 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class152 var8 = (class152) field2497.method3171(var6);
        if (var8 != null) {
            return;
        }
        class152 var9 = (class152) field2496.method3171(var6);
        if (var9 != null) {
            return;
        }
        class152 var10 = (class152) field2499.method3171(var6);
        if (var10 == null) {
            if (!arg5) {
                class152 var11 = (class152) field2503.method3171(var6);
                if (var11 != null) {
                    return;
                }
            }
            class152 var12 = new class152();
            var12.field2519 = arg0;
            var12.field2523 = arg3;
            var12.field2520 = arg4;
            if (arg5) {
                field2497.method3161(var12, var6);
                field2516++;
            } else {
                field2498.method3241(var12);
                field2499.method3161(var12, var6);
                field2500++;
            }
        } else if (arg5) {
            var10.method3260();
            field2497.method3161(var10, var6);
            field2500--;
            field2516++;
        }
    }

    @ObfuscatedName("an.u(IIB)I")
    public static int method825(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2494 != null && Statics.field2494.field2873 == var2 ? Statics.field541.field1835 * 99 / (Statics.field541.field1839.length - Statics.field2494.field2520) + 1 : 0;
    }

    @ObfuscatedName("eg.j(ZZB)I")
    public static int method2772(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2516 + field2507;
        }
        if (arg1) {
            var2 += field2500 + field2492;
        }
        return var2;
    }

    @ObfuscatedName("f.b(I)V")
    public static void method163() {
        if (Statics.field2495 != null) {
            Statics.field2495.method2551();
        }
    }
}
