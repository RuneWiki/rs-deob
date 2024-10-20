package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fv")
public class class175 {

    @ObfuscatedName("fv.e")
    public static int field2750 = 0;

    @ObfuscatedName("fv.t")
    public static class200 field2752 = new class200(4096);

    @ObfuscatedName("fv.v")
    public static int field2749 = 0;

    @ObfuscatedName("fv.b")
    public static class200 field2754 = new class200(32);

    @ObfuscatedName("fv.m")
    public static int field2755 = 0;

    @ObfuscatedName("fv.k")
    public static class207 field2759 = new class207();

    @ObfuscatedName("fv.c")
    public static class200 field2757 = new class200(4096);

    @ObfuscatedName("fv.w")
    public static int field2770 = 0;

    @ObfuscatedName("fv.l")
    public static class200 field2761 = new class200(4096);

    @ObfuscatedName("fv.h")
    public static int field2758 = 0;

    @ObfuscatedName("fv.x")
    public static class123 field2771 = new class123(8);

    @ObfuscatedName("fv.o")
    public static int field2763 = 0;

    @ObfuscatedName("fv.q")
    public static CRC32 field2760 = new CRC32();

    @ObfuscatedName("fv.a")
    public static class172[] field2753 = new class172[256];

    @ObfuscatedName("fv.z")
    public static byte field2765 = 0;

    @ObfuscatedName("fv.p")
    public static int field2766 = 0;

    @ObfuscatedName("fv.y")
    public static int field2767 = 0;

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.f(ZB)V")
    public static void method169(boolean arg0) {
        if (Statics.field2756 == null) {
            return;
        }
        try {
            class123 var1 = new class123(4);
            var1.method2384(arg0 ? 2 : 3);
            var1.method2386(0);
            Statics.field2756.method2859(var1.field2053, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2756.method2860();
            } catch (Exception var4) {
            }
            field2767++;
            Statics.field2756 = null;
        }
    }

    @ObfuscatedName("s.e(Lfu;IIIBZI)V")
    public static void method597(class172 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class176 var8 = (class176) field2752.method3605(var6);
        if (var8 != null) {
            return;
        }
        class176 var9 = (class176) field2754.method3605(var6);
        if (var9 != null) {
            return;
        }
        class176 var10 = (class176) field2757.method3605(var6);
        if (var10 == null) {
            if (!arg5) {
                class176 var11 = (class176) field2761.method3605(var6);
                if (var11 != null) {
                    return;
                }
            }
            class176 var12 = new class176();
            var12.field2777 = arg0;
            var12.field2775 = arg3;
            var12.field2776 = arg4;
            if (arg5) {
                field2752.method3606(var12, var6);
                field2749++;
            } else {
                field2759.method3710(var12);
                field2757.method3606(var12, var6);
                field2770++;
            }
        } else if (arg5) {
            var10.method3724();
            field2752.method3606(var10, var6);
            field2770--;
            field2749++;
        }
    }

    @ObfuscatedName("ae.n(III)V")
    public static void method672(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class176 var4 = (class176) field2757.method3605(var2);
        if (var4 != null) {
            field2759.method3711(var4);
        }
    }

    @ObfuscatedName("bj.t(III)I")
    public static int method1576(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field96 != null && Statics.field96.field3167 == var2 ? Statics.field708.field2052 * 99 / (Statics.field708.field2053.length - Statics.field96.field2776) + 1 : 0;
    }

    @ObfuscatedName("c.v(ZZS)I")
    public static int method97(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2755 + field2749;
        }
        if (arg1) {
            var2 += field2770 + field2758;
        }
        return var2;
    }
}
