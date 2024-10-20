package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fd")
public class class171 {

    @ObfuscatedName("fd.p")
    public static int field2692 = 0;

    @ObfuscatedName("fd.l")
    public static class196 field2713 = new class196(4096);

    @ObfuscatedName("fd.y")
    public static int field2695 = 0;

    @ObfuscatedName("fd.w")
    public static class196 field2708 = new class196(32);

    @ObfuscatedName("fd.u")
    public static int field2705 = 0;

    @ObfuscatedName("fd.a")
    public static class203 field2698 = new class203();

    @ObfuscatedName("fd.e")
    public static class196 field2699 = new class196(4096);

    @ObfuscatedName("fd.b")
    public static int field2700 = 0;

    @ObfuscatedName("fd.o")
    public static class196 field2701 = new class196(4096);

    @ObfuscatedName("fd.m")
    public static int field2694 = 0;

    @ObfuscatedName("fd.n")
    public static class119 field2703 = new class119(8);

    @ObfuscatedName("fd.t")
    public static int field2702 = 0;

    @ObfuscatedName("fd.h")
    public static CRC32 field2706 = new CRC32();

    @ObfuscatedName("fd.q")
    public static class168[] field2707 = new class168[256];

    @ObfuscatedName("fd.r")
    public static byte field2696 = 0;

    @ObfuscatedName("fd.s")
    public static int field2709 = 0;

    @ObfuscatedName("fd.g")
    public static int field2710 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.d(ZI)V")
    public static void method3(boolean arg0) {
        if (Statics.field2691 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2388(arg0 ? 2 : 3);
            var1.method2344(0);
            Statics.field2691.method2851(var1.field1973, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2691.method2846();
            } catch (Exception var4) {
            }
            field2710++;
            Statics.field2691 = null;
        }
    }

    @ObfuscatedName("k.p(Leb;ZI)V")
    public static void method158(class143 arg0, boolean arg1) {
        if (Statics.field2691 != null) {
            try {
                Statics.field2691.method2846();
            } catch (Exception var10) {
            }
            Statics.field2691 = null;
        }
        Statics.field2691 = arg0;
        method3(arg1);
        field2703.field1966 = 0;
        Statics.field782 = null;
        Statics.field2704 = null;
        field2702 = 0;
        while (true) {
            class172 var3 = (class172) field2708.method3591();
            if (var3 == null) {
                while (true) {
                    class172 var4 = (class172) field2701.method3591();
                    if (var4 == null) {
                        if (field2696 != 0) {
                            try {
                                class119 var5 = new class119(4);
                                var5.method2388(4);
                                var5.method2388(field2696);
                                var5.method2343(0);
                                Statics.field2691.method2851(var5.field1973, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2691.method2846();
                                } catch (Exception var8) {
                                }
                                field2710++;
                                Statics.field2691 = null;
                            }
                        }
                        field2692 = 0;
                        Statics.field2693 = class115.method2142();
                        return;
                    }
                    field2698.method3666(var4);
                    field2699.method3596(var4, var4.field3107);
                    field2700++;
                    field2694--;
                }
            }
            field2713.method3596(var3, var3.field3107);
            field2695++;
            field2705--;
        }
    }

    @ObfuscatedName("w.v(Lfe;IIIBZI)V")
    public static void method95(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2713.method3588(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2708.method3588(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2699.method3588(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2701.method3588(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2715 = arg0;
            var12.field2717 = arg3;
            var12.field2716 = arg4;
            if (arg5) {
                field2713.method3596(var12, var6);
                field2695++;
            } else {
                field2698.method3670(var12);
                field2699.method3596(var12, var6);
                field2700++;
            }
        } else if (arg5) {
            var10.method3680();
            field2713.method3596(var10, var6);
            field2700--;
            field2695++;
        }
    }
}
