package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ew")
public class class151 {

    @ObfuscatedName("ew.y")
    public static int field2519 = 0;

    @ObfuscatedName("ew.g")
    public static class175 field2510 = new class175(4096);

    @ObfuscatedName("ew.h")
    public static int field2511 = 0;

    @ObfuscatedName("ew.l")
    public static class175 field2512 = new class175(32);

    @ObfuscatedName("ew.e")
    public static int field2517 = 0;

    @ObfuscatedName("ew.u")
    public static class182 field2514 = new class182();

    @ObfuscatedName("ew.j")
    public static class175 field2515 = new class175(4096);

    @ObfuscatedName("ew.c")
    public static int field2516 = 0;

    @ObfuscatedName("ew.d")
    public static class175 field2518 = new class175(4096);

    @ObfuscatedName("ew.v")
    public static int field2522 = 0;

    @ObfuscatedName("ew.a")
    public static class107 field2507 = new class107(8);

    @ObfuscatedName("ew.p")
    public static int field2520 = 0;

    @ObfuscatedName("ew.r")
    public static CRC32 field2521 = new CRC32();

    @ObfuscatedName("ew.b")
    public static class148[] field2525 = new class148[256];

    @ObfuscatedName("ew.x")
    public static byte field2523 = 0;

    @ObfuscatedName("ew.q")
    public static int field2524 = 0;

    @ObfuscatedName("ew.o")
    public static int field2508 = 0;

    public class151() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dj.k(ZI)V")
    public static void method2405(boolean arg0) {
        if (Statics.field2513 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2124(arg0 ? 2 : 3);
            var1.method2126(0);
            Statics.field2513.method2571(var1.field1844, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2513.method2584();
            } catch (Exception var4) {
            }
            field2508++;
            Statics.field2513 = null;
        }
    }

    @ObfuscatedName("dk.y(Ldk;ZI)V")
    public static void method2592(class130 arg0, boolean arg1) {
        if (Statics.field2513 != null) {
            try {
                Statics.field2513.method2584();
            } catch (Exception var10) {
            }
            Statics.field2513 = null;
        }
        Statics.field2513 = arg0;
        method2405(arg1);
        field2507.field1838 = 0;
        Statics.field880 = null;
        Statics.field169 = null;
        field2520 = 0;
        while (true) {
            class152 var3 = (class152) field2512.method3252();
            if (var3 == null) {
                while (true) {
                    class152 var4 = (class152) field2518.method3252();
                    if (var4 == null) {
                        if (field2523 != 0) {
                            try {
                                class107 var5 = new class107(4);
                                var5.method2124(4);
                                var5.method2124(field2523);
                                var5.method2132(0);
                                Statics.field2513.method2571(var5.field1844, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2513.method2584();
                                } catch (Exception var8) {
                                }
                                field2508++;
                                Statics.field2513 = null;
                            }
                        }
                        field2519 = 0;
                        Statics.field2509 = class103.method16();
                        return;
                    }
                    field2514.method3344(var4);
                    field2515.method3253(var4, var4.field2879);
                    field2516++;
                    field2522--;
                }
            }
            field2510.method3253(var3, var3.field2879);
            field2511++;
            field2517--;
        }
    }

    @ObfuscatedName("eu.s(Lem;IIIBZI)V")
    public static void method2859(class148 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class152 var8 = (class152) field2510.method3244(var6);
        if (var8 != null) {
            return;
        }
        class152 var9 = (class152) field2512.method3244(var6);
        if (var9 != null) {
            return;
        }
        class152 var10 = (class152) field2515.method3244(var6);
        if (var10 == null) {
            if (!arg5) {
                class152 var11 = (class152) field2518.method3244(var6);
                if (var11 != null) {
                    return;
                }
            }
            class152 var12 = new class152();
            var12.field2531 = arg0;
            var12.field2529 = arg3;
            var12.field2530 = arg4;
            if (arg5) {
                field2510.method3253(var12, var6);
                field2511++;
            } else {
                field2514.method3331(var12);
                field2515.method3253(var12, var6);
                field2516++;
            }
        } else if (arg5) {
            var10.method3346();
            field2510.method3253(var10, var6);
            field2516--;
            field2511++;
        }
    }

    @ObfuscatedName("dw.g(III)V")
    public static void method2385(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class152 var4 = (class152) field2515.method3244(var2);
        if (var4 != null) {
            field2514.method3344(var4);
        }
    }

    @ObfuscatedName("fh.h(III)I")
    public static int method3077(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field880 != null && Statics.field880.field2879 == var2 ? Statics.field169.field1838 * 99 / (Statics.field169.field1844.length - Statics.field880.field2530) + 1 : 0;
    }

    @ObfuscatedName("ca.l(ZZI)I")
    public static int method1874(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2517 + field2511;
        }
        if (arg1) {
            var2 += field2522 + field2516;
        }
        return var2;
    }
}
