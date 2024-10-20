package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("gh")
public class class188 {

    @ObfuscatedName("gh.c")
    public static int field2753 = 0;

    @ObfuscatedName("gh.q")
    public static class147 field2773 = new class147(4096);

    @ObfuscatedName("gh.t")
    public static int field2756 = 0;

    @ObfuscatedName("gh.p")
    public static class147 field2757 = new class147(32);

    @ObfuscatedName("gh.u")
    public static int field2769 = 0;

    @ObfuscatedName("gh.z")
    public static class141 field2759 = new class141();

    @ObfuscatedName("gh.l")
    public static class147 field2772 = new class147(4096);

    @ObfuscatedName("gh.v")
    public static int field2768 = 0;

    @ObfuscatedName("gh.g")
    public static class147 field2762 = new class147(4096);

    @ObfuscatedName("gh.w")
    public static int field2763 = 0;

    @ObfuscatedName("gh.k")
    public static class130 field2764 = new class130(8);

    @ObfuscatedName("gh.j")
    public static int field2766 = 0;

    @ObfuscatedName("gh.a")
    public static CRC32 field2767 = new CRC32();

    @ObfuscatedName("gh.h")
    public static class187[] field2758 = new class187[256];

    @ObfuscatedName("gh.b")
    public static byte field2765 = 0;

    @ObfuscatedName("gh.f")
    public static int field2770 = 0;

    @ObfuscatedName("gh.o")
    public static int field2771 = 0;

    public class188() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.c(Ldx;ZB)V")
    public static void method1113(class111 arg0, boolean arg1) {
        if (Statics.field2760 != null) {
            try {
                Statics.field2760.method1972();
            } catch (Exception var10) {
            }
            Statics.field2760 = null;
        }
        Statics.field2760 = arg0;
        Statics.method1980(arg1);
        field2764.field1956 = 0;
        Statics.field2882 = null;
        Statics.field2752 = null;
        field2766 = 0;
        while (true) {
            class184 var3 = (class184) field2757.method2614();
            if (var3 == null) {
                while (true) {
                    class184 var4 = (class184) field2762.method2614();
                    if (var4 == null) {
                        if (field2765 != 0) {
                            try {
                                class130 var5 = new class130(4);
                                var5.method2215(4);
                                var5.method2215(field2765);
                                var5.method2216(0);
                                Statics.field2760.method1953(var5.field1955, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2760.method1972();
                                } catch (Exception var8) {
                                }
                                field2771++;
                                Statics.field2760 = null;
                            }
                        }
                        field2753 = 0;
                        Statics.field2754 = class132.method1336();
                        return;
                    }
                    field2759.method2552(var4);
                    field2772.method2612(var4, var4.field2034);
                    field2768++;
                    field2763--;
                }
            }
            field2773.method2612(var3, var3.field2034);
            field2756++;
            field2769--;
        }
    }

    @ObfuscatedName("fk.n(Lgf;II)V")
    public static void method2906(class187 arg0, int arg1) {
        if (Statics.field36 == null) {
            method3061((class187) null, 255, 255, 0, (byte) 0, true);
            field2758[arg1] = arg0;
        } else {
            Statics.field36.field1956 = arg1 * 8 + 5;
            int var2 = Statics.field36.method2246();
            int var3 = Statics.field36.method2246();
            arg0.method3175(var2, var3);
        }
    }

    @ObfuscatedName("fq.q(Lgf;IIIBZB)V")
    public static void method3061(class187 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class184 var8 = (class184) field2773.method2611(var6);
        if (var8 != null) {
            return;
        }
        class184 var9 = (class184) field2757.method2611(var6);
        if (var9 != null) {
            return;
        }
        class184 var10 = (class184) field2772.method2611(var6);
        if (var10 == null) {
            if (!arg5) {
                class184 var11 = (class184) field2762.method2611(var6);
                if (var11 != null) {
                    return;
                }
            }
            class184 var12 = new class184();
            var12.field2705 = arg0;
            var12.field2708 = arg3;
            var12.field2706 = arg4;
            if (arg5) {
                field2773.method2612(var12, var6);
                field2756++;
            } else {
                field2759.method2550(var12);
                field2772.method2612(var12, var6);
                field2768++;
            }
        } else if (arg5) {
            var10.method2689();
            field2773.method2612(var10, var6);
            field2768--;
            field2756++;
        }
    }
}
