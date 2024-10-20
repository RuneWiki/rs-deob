package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ec")
public class class150 {

    @ObfuscatedName("ec.r")
    public static int field2495 = 0;

    @ObfuscatedName("ec.w")
    public static class174 field2504 = new class174(4096);

    @ObfuscatedName("ec.m")
    public static int field2498 = 0;

    @ObfuscatedName("ec.j")
    public static class174 field2499 = new class174(32);

    @ObfuscatedName("ec.g")
    public static int field2512 = 0;

    @ObfuscatedName("ec.p")
    public static class181 field2494 = new class181();

    @ObfuscatedName("ec.o")
    public static class174 field2502 = new class174(4096);

    @ObfuscatedName("ec.b")
    public static int field2500 = 0;

    @ObfuscatedName("ec.x")
    public static class174 field2513 = new class174(4096);

    @ObfuscatedName("ec.n")
    public static int field2497 = 0;

    @ObfuscatedName("ec.v")
    public static class107 field2506 = new class107(8);

    @ObfuscatedName("ec.u")
    public static int field2507 = 0;

    @ObfuscatedName("ec.i")
    public static CRC32 field2508 = new CRC32();

    @ObfuscatedName("ec.e")
    public static class147[] field2509 = new class147[256];

    @ObfuscatedName("ec.a")
    public static byte field2510 = 0;

    @ObfuscatedName("ec.c")
    public static int field2501 = 0;

    @ObfuscatedName("ec.f")
    public static int field2496 = 0;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ew.k(ZI)V")
    public static void method2662(boolean arg0) {
        if (Statics.field2514 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2097(arg0 ? 2 : 3);
            var1.method2182(0);
            Statics.field2514.method2556(var1.field1865, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2514.method2552();
            } catch (Exception var4) {
            }
            field2496++;
            Statics.field2514 = null;
        }
    }

    @ObfuscatedName("cs.r(Ldy;ZI)V")
    public static void method1854(class130 arg0, boolean arg1) {
        if (Statics.field2514 != null) {
            try {
                Statics.field2514.method2552();
            } catch (Exception var10) {
            }
            Statics.field2514 = null;
        }
        Statics.field2514 = arg0;
        method2662(arg1);
        field2506.field1863 = 0;
        Statics.field2880 = null;
        Statics.field513 = null;
        field2507 = 0;
        while (true) {
            class151 var3 = (class151) field2499.method3166();
            if (var3 == null) {
                while (true) {
                    class151 var4 = (class151) field2513.method3166();
                    if (var4 == null) {
                        if (field2510 != 0) {
                            try {
                                class107 var5 = new class107(4);
                                var5.method2097(4);
                                var5.method2097(field2510);
                                var5.method2098(0);
                                Statics.field2514.method2556(var5.field1865, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2514.method2552();
                                } catch (Exception var8) {
                                }
                                field2496++;
                                Statics.field2514 = null;
                            }
                        }
                        field2495 = 0;
                        Statics.field2505 = class103.method470();
                        return;
                    }
                    field2494.method3243(var4);
                    field2502.method3164(var4, var4.field2877);
                    field2500++;
                    field2497--;
                }
            }
            field2504.method3164(var3, var3.field2877);
            field2498++;
            field2512--;
        }
    }

    @ObfuscatedName("cu.y(Let;IIIBZI)V")
    public static void method2054(class147 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class151 var8 = (class151) field2504.method3163(var6);
        if (var8 != null) {
            return;
        }
        class151 var9 = (class151) field2499.method3163(var6);
        if (var9 != null) {
            return;
        }
        class151 var10 = (class151) field2502.method3163(var6);
        if (var10 == null) {
            if (!arg5) {
                class151 var11 = (class151) field2513.method3163(var6);
                if (var11 != null) {
                    return;
                }
            }
            class151 var12 = new class151();
            var12.field2518 = arg0;
            var12.field2517 = arg3;
            var12.field2522 = arg4;
            if (arg5) {
                field2504.method3164(var12, var6);
                field2498++;
            } else {
                field2494.method3242(var12);
                field2502.method3164(var12, var6);
                field2500++;
            }
        } else if (arg5) {
            var10.method3256();
            field2504.method3164(var10, var6);
            field2500--;
            field2498++;
        }
    }

    @ObfuscatedName("e.w(ZZB)I")
    public static int method472(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2512 + field2498;
        }
        if (arg1) {
            var2 += field2500 + field2497;
        }
        return var2;
    }
}
