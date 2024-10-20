package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ei")
public class class150 {

    @ObfuscatedName("ei.u")
    public static int field2500 = 0;

    @ObfuscatedName("ei.j")
    public static class174 field2499 = new class174(4096);

    @ObfuscatedName("ei.o")
    public static int field2496 = 0;

    @ObfuscatedName("ei.n")
    public static class174 field2501 = new class174(32);

    @ObfuscatedName("ei.y")
    public static int field2505 = 0;

    @ObfuscatedName("ei.f")
    public static class180 field2503 = new class180();

    @ObfuscatedName("ei.p")
    public static class174 field2504 = new class174(4096);

    @ObfuscatedName("ei.l")
    public static int field2511 = 0;

    @ObfuscatedName("ei.k")
    public static class174 field2506 = new class174(4096);

    @ObfuscatedName("ei.q")
    public static int field2507 = 0;

    @ObfuscatedName("ei.g")
    public static class107 field2515 = new class107(8);

    @ObfuscatedName("ei.m")
    public static int field2514 = 0;

    @ObfuscatedName("ei.h")
    public static CRC32 field2510 = new CRC32();

    @ObfuscatedName("ei.w")
    public static class147[] field2508 = new class147[256];

    @ObfuscatedName("ei.z")
    public static byte field2512 = 0;

    @ObfuscatedName("ei.v")
    public static int field2513 = 0;

    @ObfuscatedName("ei.s")
    public static int field2502 = 0;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.b(ZI)V")
    public static void method1869(boolean arg0) {
        if (Statics.field2509 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2242(arg0 ? 2 : 3);
            var1.method2123(0);
            Statics.field2509.method2584(var1.field1844, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2509.method2591();
            } catch (Exception var4) {
            }
            field2502++;
            Statics.field2509 = null;
        }
    }

    @ObfuscatedName("z.u(Ldo;ZI)V")
    public static void method512(class130 arg0, boolean arg1) {
        if (Statics.field2509 != null) {
            try {
                Statics.field2509.method2591();
            } catch (Exception var10) {
            }
            Statics.field2509 = null;
        }
        Statics.field2509 = arg0;
        method1869(arg1);
        field2515.field1845 = 0;
        Statics.field2491 = null;
        Statics.field971 = null;
        field2514 = 0;
        while (true) {
            class151 var3 = (class151) field2501.method3150();
            if (var3 == null) {
                while (true) {
                    class151 var4 = (class151) field2506.method3150();
                    if (var4 == null) {
                        if (field2512 != 0) {
                            try {
                                class107 var5 = new class107(4);
                                var5.method2242(4);
                                var5.method2242(field2512);
                                var5.method2277(0);
                                Statics.field2509.method2584(var5.field1844, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2509.method2591();
                                } catch (Exception var8) {
                                }
                                field2502++;
                                Statics.field2509 = null;
                            }
                        }
                        field2500 = 0;
                        Statics.field2498 = class103.method29();
                        return;
                    }
                    field2503.method3228(var4);
                    field2504.method3147(var4, var4.field2861);
                    field2511++;
                    field2507--;
                }
            }
            field2499.method3147(var3, var3.field2861);
            field2496++;
            field2505--;
        }
    }

    @ObfuscatedName("aj.x(Lef;II)V")
    public static void method692(class147 arg0, int arg1) {
        if (Statics.field681 == null) {
            method114((class147) null, 255, 255, 0, (byte) 0, true);
            field2508[arg1] = arg0;
        } else {
            Statics.field681.field1845 = arg1 * 8 + 5;
            int var2 = Statics.field681.method2139();
            int var3 = Statics.field681.method2139();
            arg0.method2774(var2, var3);
        }
    }

    @ObfuscatedName("p.j(Lef;IIIBZI)V")
    public static void method114(class147 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class151 var8 = (class151) field2499.method3157(var6);
        if (var8 != null) {
            return;
        }
        class151 var9 = (class151) field2501.method3157(var6);
        if (var9 != null) {
            return;
        }
        class151 var10 = (class151) field2504.method3157(var6);
        if (var10 == null) {
            if (!arg5) {
                class151 var11 = (class151) field2506.method3157(var6);
                if (var11 != null) {
                    return;
                }
            }
            class151 var12 = new class151();
            var12.field2517 = arg0;
            var12.field2518 = arg3;
            var12.field2520 = arg4;
            if (arg5) {
                field2499.method3147(var12, var6);
                field2496++;
            } else {
                field2503.method3227(var12);
                field2504.method3147(var12, var6);
                field2511++;
            }
        } else if (arg5) {
            var10.method3243();
            field2499.method3147(var10, var6);
            field2511--;
            field2496++;
        }
    }

    @ObfuscatedName("dy.o(III)V")
    public static void method2572(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class151 var4 = (class151) field2504.method3157(var2);
        if (var4 != null) {
            field2503.method3228(var4);
        }
    }

    @ObfuscatedName("f.n(ZZI)I")
    public static int method91(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2505 + field2496;
        }
        if (arg1) {
            var2 += field2511 + field2507;
        }
        return var2;
    }
}
