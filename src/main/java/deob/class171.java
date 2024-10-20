package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fe")
public class class171 {

    @ObfuscatedName("fe.v")
    public static int field2712 = 0;

    @ObfuscatedName("fe.h")
    public static class196 field2725 = new class196(4096);

    @ObfuscatedName("fe.a")
    public static int field2709 = 0;

    @ObfuscatedName("fe.s")
    public static class196 field2710 = new class196(32);

    @ObfuscatedName("fe.p")
    public static int field2718 = 0;

    @ObfuscatedName("fe.r")
    public static class203 field2722 = new class203();

    @ObfuscatedName("fe.k")
    public static class196 field2713 = new class196(4096);

    @ObfuscatedName("fe.d")
    public static int field2714 = 0;

    @ObfuscatedName("fe.n")
    public static class196 field2715 = new class196(4096);

    @ObfuscatedName("fe.z")
    public static int field2716 = 0;

    @ObfuscatedName("fe.w")
    public static class119 field2717 = new class119(8);

    @ObfuscatedName("fe.x")
    public static int field2708 = 0;

    @ObfuscatedName("fe.l")
    public static CRC32 field2720 = new CRC32();

    @ObfuscatedName("fe.m")
    public static class168[] field2721 = new class168[256];

    @ObfuscatedName("fe.e")
    public static byte field2706 = 0;

    @ObfuscatedName("fe.u")
    public static int field2723 = 0;

    @ObfuscatedName("fe.y")
    public static int field2707 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fy.i(ZI)V")
    public static void method2993(boolean arg0) {
        if (Statics.field2724 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2296(arg0 ? 2 : 3);
            var1.method2298(0);
            Statics.field2724.method2778(var1.field1988, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2724.method2779();
            } catch (Exception var4) {
            }
            field2707++;
            Statics.field2724 = null;
        }
    }

    @ObfuscatedName("cy.v(Lfg;II)V")
    public static void method1910(class168 arg0, int arg1) {
        if (Statics.field714 == null) {
            method2897((class168) null, 255, 255, 0, (byte) 0, true);
            field2721[arg1] = arg0;
        } else {
            Statics.field714.field1984 = arg1 * 8 + 5;
            int var2 = Statics.field714.method2315();
            int var3 = Statics.field714.method2315();
            arg0.method3090(var2, var3);
        }
    }

    @ObfuscatedName("ex.f(Lfg;IIIBZI)V")
    public static void method2897(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2725.method3509(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2710.method3509(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2713.method3509(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2715.method3509(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2729 = arg0;
            var12.field2727 = arg3;
            var12.field2728 = arg4;
            if (arg5) {
                field2725.method3495(var12, var6);
                field2709++;
            } else {
                field2722.method3595(var12);
                field2713.method3495(var12, var6);
                field2714++;
            }
        } else if (arg5) {
            var10.method3605();
            field2725.method3495(var10, var6);
            field2714--;
            field2709++;
        }
    }

    @ObfuscatedName("eo.h(IIB)I")
    public static int method2893(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1057 != null && Statics.field1057.field3099 == var2 ? Statics.field2071.field1984 * 99 / (Statics.field2071.field1988.length - Statics.field1057.field2728) + 1 : 0;
    }

    @ObfuscatedName("w.a(B)V")
    public static void method158() {
        if (Statics.field2724 != null) {
            Statics.field2724.method2779();
        }
    }
}
