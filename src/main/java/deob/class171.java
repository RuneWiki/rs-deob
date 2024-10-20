package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ff")
public class class171 {

    @ObfuscatedName("ff.q")
    public static int field2708 = 0;

    @ObfuscatedName("ff.l")
    public static class196 field2710 = new class196(4096);

    @ObfuscatedName("ff.r")
    public static int field2711 = 0;

    @ObfuscatedName("ff.u")
    public static class196 field2712 = new class196(32);

    @ObfuscatedName("ff.j")
    public static int field2729 = 0;

    @ObfuscatedName("ff.w")
    public static class203 field2714 = new class203();

    @ObfuscatedName("ff.y")
    public static class196 field2715 = new class196(4096);

    @ObfuscatedName("ff.o")
    public static int field2716 = 0;

    @ObfuscatedName("ff.h")
    public static class196 field2709 = new class196(4096);

    @ObfuscatedName("ff.e")
    public static int field2718 = 0;

    @ObfuscatedName("ff.m")
    public static class119 field2719 = new class119(8);

    @ObfuscatedName("ff.s")
    public static int field2720 = 0;

    @ObfuscatedName("ff.z")
    public static CRC32 field2721 = new CRC32();

    @ObfuscatedName("ff.a")
    public static class168[] field2713 = new class168[256];

    @ObfuscatedName("ff.t")
    public static byte field2723 = 0;

    @ObfuscatedName("ff.k")
    public static int field2724 = 0;

    @ObfuscatedName("ff.f")
    public static int field2725 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("es.n(ZI)V")
    public static void method2952(boolean arg0) {
        if (Statics.field2722 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2345(arg0 ? 2 : 3);
            var1.method2347(0);
            Statics.field2722.method2838(var1.field1987, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2722.method2832();
            } catch (Exception var4) {
            }
            field2725++;
            Statics.field2722 = null;
        }
    }

    @ObfuscatedName("db.q(Lfn;IIIBZB)V")
    public static void method2653(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2710.method3518(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2712.method3518(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2715.method3518(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2709.method3518(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2732 = arg0;
            var12.field2731 = arg3;
            var12.field2733 = arg4;
            if (arg5) {
                field2710.method3524(var12, var6);
                field2711++;
            } else {
                field2714.method3600(var12);
                field2715.method3524(var12, var6);
                field2716++;
            }
        } else if (arg5) {
            var10.method3618();
            field2710.method3524(var10, var6);
            field2716--;
            field2711++;
        }
    }

    @ObfuscatedName("ck.c(III)I")
    public static int method1785(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1039 != null && Statics.field1039.field3112 == var2 ? Statics.field976.field1982 * 99 / (Statics.field976.field1987.length - Statics.field1039.field2733) + 1 : 0;
    }

    @ObfuscatedName("ao.l(ZZS)I")
    public static int method798(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2729 + field2711;
        }
        if (arg1) {
            var2 += field2718 + field2716;
        }
        return var2;
    }
}
