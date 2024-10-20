package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("gj")
public class class186 {

    @ObfuscatedName("gj.m")
    public static int field2757 = 0;

    @ObfuscatedName("gj.g")
    public static class126 field2774 = new class126(4096);

    @ObfuscatedName("gj.h")
    public static int field2766 = 0;

    @ObfuscatedName("gj.v")
    public static class126 field2759 = new class126(32);

    @ObfuscatedName("gj.l")
    public static int field2762 = 0;

    @ObfuscatedName("gj.c")
    public static class121 field2763 = new class121();

    @ObfuscatedName("gj.u")
    public static class126 field2760 = new class126(4096);

    @ObfuscatedName("gj.k")
    public static int field2765 = 0;

    @ObfuscatedName("gj.z")
    public static class126 field2767 = new class126(4096);

    @ObfuscatedName("gj.y")
    public static int field2768 = 0;

    @ObfuscatedName("gj.p")
    public static class154 field2776 = new class154(8);

    @ObfuscatedName("gj.s")
    public static int field2769 = 0;

    @ObfuscatedName("gj.d")
    public static CRC32 field2770 = new CRC32();

    @ObfuscatedName("gj.n")
    public static class185[] field2771 = new class185[256];

    @ObfuscatedName("gj.q")
    public static byte field2761 = 0;

    @ObfuscatedName("gj.t")
    public static int field2773 = 0;

    @ObfuscatedName("gj.r")
    public static int field2764 = 0;

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.o(ZI)V")
    public static void method202(boolean arg0) {
        if (Statics.field2775 == null) {
            return;
        }
        try {
            class154 var1 = new class154(4);
            var1.method2641(arg0 ? 2 : 3);
            var1.method2539(0);
            Statics.field2775.method1904(var1.field2108, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2775.method1915();
            } catch (Exception var4) {
            }
            field2764++;
            Statics.field2775 = null;
        }
    }

    @ObfuscatedName("fa.m(Ldj;ZI)V")
    public static void method2918(class111 arg0, boolean arg1) {
        if (Statics.field2775 != null) {
            try {
                Statics.field2775.method1915();
            } catch (Exception var10) {
            }
            Statics.field2775 = null;
        }
        Statics.field2775 = arg0;
        method202(arg1);
        field2776.field2105 = 0;
        Statics.field2359 = null;
        Statics.field2052 = null;
        field2769 = 0;
        while (true) {
            class182 var3 = (class182) field2759.method2148();
            if (var3 == null) {
                while (true) {
                    class182 var4 = (class182) field2767.method2148();
                    if (var4 == null) {
                        if (field2761 != 0) {
                            try {
                                class154 var5 = new class154(4);
                                var5.method2641(4);
                                var5.method2641(field2761);
                                var5.method2538(0);
                                Statics.field2775.method1904(var5.field2108, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2775.method1915();
                                } catch (Exception var8) {
                                }
                                field2764++;
                                Statics.field2775 = null;
                            }
                        }
                        field2757 = 0;
                        Statics.field2758 = class156.method2009();
                        return;
                    }
                    field2763.method2100(var4);
                    field2760.method2143(var4, var4.field1894);
                    field2765++;
                    field2768--;
                }
            }
            field2774.method2143(var3, var3.field1894);
            field2766++;
            field2762--;
        }
    }

    @ObfuscatedName("g.b(Lgk;IIIBZB)V")
    public static void method41(class185 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class182 var8 = (class182) field2774.method2151(var6);
        if (var8 != null) {
            return;
        }
        class182 var9 = (class182) field2759.method2151(var6);
        if (var9 != null) {
            return;
        }
        class182 var10 = (class182) field2760.method2151(var6);
        if (var10 == null) {
            if (!arg5) {
                class182 var11 = (class182) field2767.method2151(var6);
                if (var11 != null) {
                    return;
                }
            }
            class182 var12 = new class182();
            var12.field2709 = arg0;
            var12.field2710 = arg3;
            var12.field2711 = arg4;
            if (arg5) {
                field2774.method2143(var12, var6);
                field2766++;
            } else {
                field2763.method2093(var12);
                field2760.method2143(var12, var6);
                field2765++;
            }
        } else if (arg5) {
            var10.method2232();
            field2774.method2143(var10, var6);
            field2765--;
            field2766++;
        }
    }

    @ObfuscatedName("fu.g(IIB)V")
    public static void method2827(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class182 var4 = (class182) field2760.method2151(var2);
        if (var4 != null) {
            field2763.method2100(var4);
        }
    }

    @ObfuscatedName("gh.c(I)V")
    public static void method3445() {
        if (Statics.field2775 != null) {
            Statics.field2775.method1915();
        }
    }
}
