package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("gv")
public class class186 {

    @ObfuscatedName("gv.e")
    public static int field2747 = 0;

    @ObfuscatedName("gv.k")
    public static class126 field2748 = new class126(4096);

    @ObfuscatedName("gv.g")
    public static int field2766 = 0;

    @ObfuscatedName("gv.n")
    public static class126 field2750 = new class126(32);

    @ObfuscatedName("gv.a")
    public static int field2749 = 0;

    @ObfuscatedName("gv.q")
    public static class121 field2752 = new class121();

    @ObfuscatedName("gv.w")
    public static class126 field2758 = new class126(4096);

    @ObfuscatedName("gv.v")
    public static int field2754 = 0;

    @ObfuscatedName("gv.h")
    public static class126 field2755 = new class126(4096);

    @ObfuscatedName("gv.p")
    public static int field2764 = 0;

    @ObfuscatedName("gv.m")
    public static class154 field2753 = new class154(8);

    @ObfuscatedName("gv.u")
    public static int field2746 = 0;

    @ObfuscatedName("gv.x")
    public static CRC32 field2761 = new CRC32();

    @ObfuscatedName("gv.y")
    public static class185[] field2762 = new class185[256];

    @ObfuscatedName("gv.s")
    public static byte field2763 = 0;

    @ObfuscatedName("gv.t")
    public static int field2756 = 0;

    @ObfuscatedName("gv.z")
    public static int field2765 = 0;

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gv.i(ZI)V")
    public static void method3154(boolean arg0) {
        if (Statics.field2751 == null) {
            return;
        }
        try {
            class154 var1 = new class154(4);
            var1.method2746(arg0 ? 2 : 3);
            var1.method2561(0);
            Statics.field2751.method1912(var1.field2094, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2751.method1915();
            } catch (Exception var4) {
            }
            field2765++;
            Statics.field2751 = null;
        }
    }

    @ObfuscatedName("fv.e(Ldh;ZI)V")
    public static void method2988(class111 arg0, boolean arg1) {
        if (Statics.field2751 != null) {
            try {
                Statics.field2751.method1915();
            } catch (Exception var10) {
            }
            Statics.field2751 = null;
        }
        Statics.field2751 = arg0;
        method3154(arg1);
        field2753.field2091 = 0;
        Statics.field2150 = null;
        Statics.field2759 = null;
        field2746 = 0;
        while (true) {
            class182 var3 = (class182) field2750.method2163();
            if (var3 == null) {
                while (true) {
                    class182 var4 = (class182) field2755.method2163();
                    if (var4 == null) {
                        if (field2763 != 0) {
                            try {
                                class154 var5 = new class154(4);
                                var5.method2746(4);
                                var5.method2746(field2763);
                                var5.method2560(0);
                                Statics.field2751.method1912(var5.field2094, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2751.method1915();
                                } catch (Exception var8) {
                                }
                                field2765++;
                                Statics.field2751 = null;
                            }
                        }
                        field2747 = 0;
                        Statics.field1639 = class156.method1307();
                        return;
                    }
                    field2752.method2109(var4);
                    field2758.method2162(var4, var4.field1879);
                    field2754++;
                    field2764--;
                }
            }
            field2748.method2162(var3, var3.field1879);
            field2766++;
            field2749--;
        }
    }

    @ObfuscatedName("fs.f(Lgm;IIIBZB)V")
    public static void method3005(class185 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class182 var8 = (class182) field2748.method2161(var6);
        if (var8 != null) {
            return;
        }
        class182 var9 = (class182) field2750.method2161(var6);
        if (var9 != null) {
            return;
        }
        class182 var10 = (class182) field2758.method2161(var6);
        if (var10 == null) {
            if (!arg5) {
                class182 var11 = (class182) field2755.method2161(var6);
                if (var11 != null) {
                    return;
                }
            }
            class182 var12 = new class182();
            var12.field2699 = arg0;
            var12.field2698 = arg3;
            var12.field2702 = arg4;
            if (arg5) {
                field2748.method2162(var12, var6);
                field2766++;
            } else {
                field2752.method2108(var12);
                field2758.method2162(var12, var6);
                field2754++;
            }
        } else if (arg5) {
            var10.method2238();
            field2748.method2162(var10, var6);
            field2754--;
            field2766++;
        }
    }

    @ObfuscatedName("de.k(III)V")
    public static void method1893(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class182 var4 = (class182) field2758.method2161(var2);
        if (var4 != null) {
            field2752.method2109(var4);
        }
    }
}
