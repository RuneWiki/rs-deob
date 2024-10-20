package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("gq")
public class class186 {

    @ObfuscatedName("gq.e")
    public static int field2752 = 0;

    @ObfuscatedName("gq.l")
    public static class126 field2754 = new class126(4096);

    @ObfuscatedName("gq.y")
    public static int field2751 = 0;

    @ObfuscatedName("gq.j")
    public static class126 field2759 = new class126(32);

    @ObfuscatedName("gq.g")
    public static int field2757 = 0;

    @ObfuscatedName("gq.s")
    public static class121 field2758 = new class121();

    @ObfuscatedName("gq.r")
    public static class126 field2770 = new class126(4096);

    @ObfuscatedName("gq.t")
    public static int field2760 = 0;

    @ObfuscatedName("gq.k")
    public static class126 field2767 = new class126(4096);

    @ObfuscatedName("gq.f")
    public static int field2764 = 0;

    @ObfuscatedName("gq.d")
    public static class154 field2769 = new class154(8);

    @ObfuscatedName("gq.q")
    public static int field2765 = 0;

    @ObfuscatedName("gq.x")
    public static CRC32 field2766 = new CRC32();

    @ObfuscatedName("gq.n")
    public static class185[] field2756 = new class185[256];

    @ObfuscatedName("gq.w")
    public static byte field2768 = 0;

    @ObfuscatedName("gq.h")
    public static int field2762 = 0;

    @ObfuscatedName("gq.u")
    public static int field2755 = 0;

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dm.b(ZI)V")
    public static void method2021(boolean arg0) {
        if (Statics.field2763 == null) {
            return;
        }
        try {
            class154 var1 = new class154(4);
            var1.method2780(arg0 ? 2 : 3);
            var1.method2656(0);
            Statics.field2763.method1996(var1.field2084, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2763.method2006();
            } catch (Exception var4) {
            }
            field2755++;
            Statics.field2763 = null;
        }
    }

    @ObfuscatedName("af.e(Ldx;ZI)V")
    public static void method671(class111 arg0, boolean arg1) {
        if (Statics.field2763 != null) {
            try {
                Statics.field2763.method2006();
            } catch (Exception var10) {
            }
            Statics.field2763 = null;
        }
        Statics.field2763 = arg0;
        method2021(arg1);
        field2769.field2079 = 0;
        Statics.field2761 = null;
        Statics.field794 = null;
        field2765 = 0;
        while (true) {
            class182 var3 = (class182) field2759.method2262();
            if (var3 == null) {
                while (true) {
                    class182 var4 = (class182) field2767.method2262();
                    if (var4 == null) {
                        if (field2768 != 0) {
                            try {
                                class154 var5 = new class154(4);
                                var5.method2780(4);
                                var5.method2780(field2768);
                                var5.method2793(0);
                                Statics.field2763.method1996(var5.field2084, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2763.method2006();
                                } catch (Exception var8) {
                                }
                                field2755++;
                                Statics.field2763 = null;
                            }
                        }
                        field2752 = 0;
                        Statics.field2753 = class156.method81();
                        return;
                    }
                    field2758.method2211(var4);
                    field2770.method2267(var4, var4.field1864);
                    field2760++;
                    field2764--;
                }
            }
            field2754.method2267(var3, var3.field1864);
            field2751++;
            field2757--;
        }
    }

    @ObfuscatedName("bg.c(Lgz;IIIBZS)V")
    public static void method1153(class185 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class182 var8 = (class182) field2754.method2259(var6);
        if (var8 != null) {
            return;
        }
        class182 var9 = (class182) field2759.method2259(var6);
        if (var9 != null) {
            return;
        }
        class182 var10 = (class182) field2770.method2259(var6);
        if (var10 == null) {
            if (!arg5) {
                class182 var11 = (class182) field2767.method2259(var6);
                if (var11 != null) {
                    return;
                }
            }
            class182 var12 = new class182();
            var12.field2711 = arg0;
            var12.field2707 = arg3;
            var12.field2708 = arg4;
            if (arg5) {
                field2754.method2267(var12, var6);
                field2751++;
            } else {
                field2758.method2210(var12);
                field2770.method2267(var12, var6);
                field2760++;
            }
        } else if (arg5) {
            var10.method2343();
            field2754.method2267(var10, var6);
            field2760--;
            field2751++;
        }
    }

    @ObfuscatedName("cw.l(III)V")
    public static void method1882(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class182 var4 = (class182) field2770.method2259(var2);
        if (var4 != null) {
            field2758.method2211(var4);
        }
    }

    @ObfuscatedName("aq.y(IIB)I")
    public static int method581(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2761 != null && Statics.field2761.field1864 == var2 ? Statics.field794.field2079 * 99 / (Statics.field794.field2084.length - Statics.field2761.field2708) + 1 : 0;
    }

    @ObfuscatedName("f.j(ZZI)I")
    public static int method173(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2757 + field2751;
        }
        if (arg1) {
            var2 += field2764 + field2760;
        }
        return var2;
    }

    @ObfuscatedName("bf.t(I)V")
    public static void method1039() {
        if (Statics.field2763 != null) {
            Statics.field2763.method2006();
        }
    }
}
