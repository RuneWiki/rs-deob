package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("gd")
public class class186 {

    @ObfuscatedName("gd.j")
    public static int field2742 = 0;

    @ObfuscatedName("gd.d")
    public static class126 field2744 = new class126(4096);

    @ObfuscatedName("gd.w")
    public static int field2745 = 0;

    @ObfuscatedName("gd.h")
    public static class126 field2746 = new class126(32);

    @ObfuscatedName("gd.u")
    public static int field2760 = 0;

    @ObfuscatedName("gd.k")
    public static class121 field2748 = new class121();

    @ObfuscatedName("gd.g")
    public static class126 field2758 = new class126(4096);

    @ObfuscatedName("gd.y")
    public static int field2750 = 0;

    @ObfuscatedName("gd.e")
    public static class126 field2751 = new class126(4096);

    @ObfuscatedName("gd.q")
    public static int field2752 = 0;

    @ObfuscatedName("gd.s")
    public static class154 field2753 = new class154(8);

    @ObfuscatedName("gd.m")
    public static int field2754 = 0;

    @ObfuscatedName("gd.f")
    public static CRC32 field2741 = new CRC32();

    @ObfuscatedName("gd.t")
    public static class185[] field2756 = new class185[256];

    @ObfuscatedName("gd.z")
    public static byte field2757 = 0;

    @ObfuscatedName("gd.p")
    public static int field2747 = 0;

    @ObfuscatedName("gd.n")
    public static int field2759 = 0;

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.j(Ldc;ZI)V")
    public static void method2568(class111 arg0, boolean arg1) {
        if (Statics.field2749 != null) {
            try {
                Statics.field2749.method1991();
            } catch (Exception var10) {
            }
            Statics.field2749 = null;
        }
        Statics.field2749 = arg0;
        Statics.method861(arg1);
        field2753.field2086 = 0;
        Statics.field2809 = null;
        Statics.field1197 = null;
        field2754 = 0;
        while (true) {
            class182 var3 = (class182) field2746.method2233();
            if (var3 == null) {
                while (true) {
                    class182 var4 = (class182) field2751.method2233();
                    if (var4 == null) {
                        if (field2757 != 0) {
                            try {
                                class154 var5 = new class154(4);
                                var5.method2651(4);
                                var5.method2651(field2757);
                                var5.method2625(0);
                                Statics.field2749.method1993(var5.field2091, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2749.method1991();
                                } catch (Exception var8) {
                                }
                                field2759++;
                                Statics.field2749 = null;
                            }
                        }
                        field2742 = 0;
                        Statics.field2743 = class156.method1888();
                        return;
                    }
                    field2748.method2178(var4);
                    field2758.method2245(var4, var4.field1885);
                    field2750++;
                    field2752--;
                }
            }
            field2744.method2245(var3, var3.field1885);
            field2745++;
            field2760--;
        }
    }

    @ObfuscatedName("cx.c(Lgn;II)V")
    public static void method1856(class185 arg0, int arg1) {
        if (Statics.field3183 == null) {
            method703((class185) null, 255, 255, 0, (byte) 0, true);
            field2756[arg1] = arg0;
        } else {
            Statics.field3183.field2086 = arg1 * 8 + 5;
            int var2 = Statics.field3183.method2644();
            int var3 = Statics.field3183.method2644();
            arg0.method3199(var2, var3);
        }
    }

    @ObfuscatedName("ah.d(Lgn;IIIBZB)V")
    public static void method703(class185 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class182 var8 = (class182) field2744.method2247(var6);
        if (var8 != null) {
            return;
        }
        class182 var9 = (class182) field2746.method2247(var6);
        if (var9 != null) {
            return;
        }
        class182 var10 = (class182) field2758.method2247(var6);
        if (var10 == null) {
            if (!arg5) {
                class182 var11 = (class182) field2751.method2247(var6);
                if (var11 != null) {
                    return;
                }
            }
            class182 var12 = new class182();
            var12.field2696 = arg0;
            var12.field2693 = arg3;
            var12.field2695 = arg4;
            if (arg5) {
                field2744.method2245(var12, var6);
                field2745++;
            } else {
                field2748.method2177(var12);
                field2758.method2245(var12, var6);
                field2750++;
            }
        } else if (arg5) {
            var10.method2318();
            field2744.method2245(var10, var6);
            field2750--;
            field2745++;
        }
    }

    @ObfuscatedName("fw.w(ZZI)I")
    public static int method3078(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2760 + field2745;
        }
        if (arg1) {
            var2 += field2752 + field2750;
        }
        return var2;
    }
}
