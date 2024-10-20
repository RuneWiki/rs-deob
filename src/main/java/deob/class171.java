package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fd")
public class class171 {

    @ObfuscatedName("fd.q")
    public static int field2705 = 0;

    @ObfuscatedName("fd.f")
    public static class196 field2702 = new class196(4096);

    @ObfuscatedName("fd.d")
    public static int field2703 = 0;

    @ObfuscatedName("fd.l")
    public static class196 field2720 = new class196(32);

    @ObfuscatedName("fd.r")
    public static int field2711 = 0;

    @ObfuscatedName("fd.g")
    public static class203 field2706 = new class203();

    @ObfuscatedName("fd.h")
    public static class196 field2718 = new class196(4096);

    @ObfuscatedName("fd.n")
    public static int field2708 = 0;

    @ObfuscatedName("fd.j")
    public static class196 field2709 = new class196(4096);

    @ObfuscatedName("fd.a")
    public static int field2707 = 0;

    @ObfuscatedName("fd.v")
    public static class119 field2712 = new class119(8);

    @ObfuscatedName("fd.i")
    public static int field2713 = 0;

    @ObfuscatedName("fd.u")
    public static CRC32 field2714 = new CRC32();

    @ObfuscatedName("fd.m")
    public static class168[] field2715 = new class168[256];

    @ObfuscatedName("fd.s")
    public static byte field2701 = 0;

    @ObfuscatedName("fd.x")
    public static int field2717 = 0;

    @ObfuscatedName("fd.y")
    public static int field2700 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fo.z(ZI)V")
    public static void method2901(boolean arg0) {
        if (Statics.field971 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2285(arg0 ? 2 : 3);
            var1.method2288(0);
            Statics.field971.method2769(var1.field1987, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field971.method2765();
            } catch (Exception var4) {
            }
            field2700++;
            Statics.field971 = null;
        }
    }

    @ObfuscatedName("w.q(Lfz;IIIBZI)V")
    public static void method568(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2702.method3462(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2720.method3462(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2718.method3462(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2709.method3462(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2730 = arg0;
            var12.field2725 = arg3;
            var12.field2726 = arg4;
            if (arg5) {
                field2702.method3470(var12, var6);
                field2703++;
            } else {
                field2706.method3556(var12);
                field2718.method3470(var12, var6);
                field2708++;
            }
        } else if (arg5) {
            var10.method3565();
            field2702.method3470(var10, var6);
            field2708--;
            field2703++;
        }
    }

    @ObfuscatedName("fk.k(IIB)V")
    public static void method2899(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class172 var4 = (class172) field2718.method3462(var2);
        if (var4 != null) {
            field2706.method3547(var4);
        }
    }

    @ObfuscatedName("h.f(III)I")
    public static int method119(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1353 != null && Statics.field1353.field3102 == var2 ? Statics.field2214.field1986 * 99 / (Statics.field2214.field1987.length - Statics.field1353.field2726) + 1 : 0;
    }

    @ObfuscatedName("as.d(I)V")
    public static void method928() {
        if (Statics.field971 != null) {
            Statics.field971.method2765();
        }
    }
}
