package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fc")
public class class171 {

    @ObfuscatedName("fc.l")
    public static int field2704 = 0;

    @ObfuscatedName("fc.u")
    public static class196 field2694 = new class196(4096);

    @ObfuscatedName("fc.k")
    public static int field2695 = 0;

    @ObfuscatedName("fc.j")
    public static class196 field2692 = new class196(32);

    @ObfuscatedName("fc.i")
    public static int field2697 = 0;

    @ObfuscatedName("fc.x")
    public static class203 field2698 = new class203();

    @ObfuscatedName("fc.g")
    public static class196 field2702 = new class196(4096);

    @ObfuscatedName("fc.e")
    public static int field2700 = 0;

    @ObfuscatedName("fc.p")
    public static class196 field2710 = new class196(4096);

    @ObfuscatedName("fc.a")
    public static int field2696 = 0;

    @ObfuscatedName("fc.s")
    public static class119 field2703 = new class119(8);

    @ObfuscatedName("fc.h")
    public static int field2712 = 0;

    @ObfuscatedName("fc.b")
    public static CRC32 field2699 = new CRC32();

    @ObfuscatedName("fc.d")
    public static class168[] field2707 = new class168[256];

    @ObfuscatedName("fc.q")
    public static byte field2708 = 0;

    @ObfuscatedName("fc.o")
    public static int field2701 = 0;

    @ObfuscatedName("fc.w")
    public static int field2706 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.m(ZI)V")
    public static void method662(boolean arg0) {
        if (Statics.field3140 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2366(arg0 ? 2 : 3);
            var1.method2381(0);
            Statics.field3140.method2866(var1.field1959, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3140.method2883();
            } catch (Exception var4) {
            }
            field2706++;
            Statics.field3140 = null;
        }
    }

    @ObfuscatedName("eg.l(Leq;ZB)V")
    public static void method2995(class143 arg0, boolean arg1) {
        if (Statics.field3140 != null) {
            try {
                Statics.field3140.method2883();
            } catch (Exception var10) {
            }
            Statics.field3140 = null;
        }
        Statics.field3140 = arg0;
        method662(arg1);
        field2703.field1955 = 0;
        Statics.field1976 = null;
        Statics.field1345 = null;
        field2712 = 0;
        while (true) {
            class172 var3 = (class172) field2692.method3574();
            if (var3 == null) {
                while (true) {
                    class172 var4 = (class172) field2710.method3574();
                    if (var4 == null) {
                        if (field2708 != 0) {
                            try {
                                class119 var5 = new class119(4);
                                var5.method2366(4);
                                var5.method2366(field2708);
                                var5.method2466(0);
                                Statics.field3140.method2866(var5.field1959, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3140.method2883();
                                } catch (Exception var8) {
                                }
                                field2706++;
                                Statics.field3140 = null;
                            }
                        }
                        field2704 = 0;
                        Statics.field2693 = class115.method2177();
                        return;
                    }
                    field2698.method3671(var4);
                    field2702.method3572(var4, var4.field3095);
                    field2700++;
                    field2696--;
                }
            }
            field2694.method3572(var3, var3.field3095);
            field2695++;
            field2697--;
        }
    }

    @ObfuscatedName("j.y(Lfl;IIIBZB)V")
    public static void method86(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2694.method3571(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2692.method3571(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2702.method3571(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2710.method3571(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2714 = arg0;
            var12.field2719 = arg3;
            var12.field2715 = arg4;
            if (arg5) {
                field2694.method3572(var12, var6);
                field2695++;
            } else {
                field2698.method3670(var12);
                field2702.method3572(var12, var6);
                field2700++;
            }
        } else if (arg5) {
            var10.method3685();
            field2694.method3572(var10, var6);
            field2700--;
            field2695++;
        }
    }

    @ObfuscatedName("br.u(ZZI)I")
    public static int method1272(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2697 + field2695;
        }
        if (arg1) {
            var2 += field2700 + field2696;
        }
        return var2;
    }
}
