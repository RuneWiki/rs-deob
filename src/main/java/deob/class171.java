package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fn")
public class class171 {

    @ObfuscatedName("fn.e")
    public static int field2716 = 0;

    @ObfuscatedName("fn.o")
    public static class196 field2704 = new class196(4096);

    @ObfuscatedName("fn.g")
    public static int field2721 = 0;

    @ObfuscatedName("fn.m")
    public static class196 field2706 = new class196(32);

    @ObfuscatedName("fn.b")
    public static int field2707 = 0;

    @ObfuscatedName("fn.p")
    public static class203 field2708 = new class203();

    @ObfuscatedName("fn.t")
    public static class196 field2709 = new class196(4096);

    @ObfuscatedName("fn.w")
    public static int field2723 = 0;

    @ObfuscatedName("fn.x")
    public static class196 field2711 = new class196(4096);

    @ObfuscatedName("fn.k")
    public static int field2719 = 0;

    @ObfuscatedName("fn.j")
    public static class119 field2713 = new class119(8);

    @ObfuscatedName("fn.c")
    public static int field2714 = 0;

    @ObfuscatedName("fn.r")
    public static CRC32 field2710 = new CRC32();

    @ObfuscatedName("fn.a")
    public static class168[] field2717 = new class168[256];

    @ObfuscatedName("fn.h")
    public static byte field2718 = 0;

    @ObfuscatedName("fn.y")
    public static int field2724 = 0;

    @ObfuscatedName("fn.d")
    public static int field2720 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.l(ZB)V")
    public static void method577(boolean arg0) {
        if (Statics.field2176 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2503(arg0 ? 2 : 3);
            var1.method2507(0);
            Statics.field2176.method2840(var1.field1986, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2176.method2823();
            } catch (Exception var4) {
            }
            field2720++;
            Statics.field2176 = null;
        }
    }

    @ObfuscatedName("ae.e(Lew;ZB)V")
    public static void method731(class143 arg0, boolean arg1) {
        if (Statics.field2176 != null) {
            try {
                Statics.field2176.method2823();
            } catch (Exception var10) {
            }
            Statics.field2176 = null;
        }
        Statics.field2176 = arg0;
        method577(arg1);
        field2713.field1988 = 0;
        Statics.field222 = null;
        Statics.field1748 = null;
        field2714 = 0;
        while (true) {
            class172 var3 = (class172) field2706.method3512();
            if (var3 == null) {
                while (true) {
                    class172 var4 = (class172) field2711.method3512();
                    if (var4 == null) {
                        if (field2718 != 0) {
                            try {
                                class119 var5 = new class119(4);
                                var5.method2503(4);
                                var5.method2503(field2718);
                                var5.method2374(0);
                                Statics.field2176.method2840(var5.field1986, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2176.method2823();
                                } catch (Exception var8) {
                                }
                                field2720++;
                                Statics.field2176 = null;
                            }
                        }
                        field2716 = 0;
                        Statics.field2705 = class115.method2266();
                        return;
                    }
                    field2708.method3588(var4);
                    field2709.method3518(var4, var4.field3107);
                    field2723++;
                    field2719--;
                }
            }
            field2704.method3518(var3, var3.field3107);
            field2721++;
            field2707--;
        }
    }

    @ObfuscatedName("ft.q(Lfr;II)V")
    public static void method2962(class168 arg0, int arg1) {
        if (Statics.field693 == null) {
            method2317((class168) null, 255, 255, 0, (byte) 0, true);
            field2717[arg1] = arg0;
        } else {
            Statics.field693.field1988 = arg1 * 8 + 5;
            int var2 = Statics.field693.method2393();
            int var3 = Statics.field693.method2393();
            arg0.method3129(var2, var3);
        }
    }

    @ObfuscatedName("ds.o(Lfr;IIIBZI)V")
    public static void method2317(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2704.method3509(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2706.method3509(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2709.method3509(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2711.method3509(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2729 = arg0;
            var12.field2726 = arg3;
            var12.field2727 = arg4;
            if (arg5) {
                field2704.method3518(var12, var6);
                field2721++;
            } else {
                field2708.method3598(var12);
                field2709.method3518(var12, var6);
                field2723++;
            }
        } else if (arg5) {
            var10.method3603();
            field2704.method3518(var10, var6);
            field2723--;
            field2721++;
        }
    }

    @ObfuscatedName("eb.g(IIB)I")
    public static int method2852(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field222 != null && Statics.field222.field3107 == var2 ? Statics.field1748.field1988 * 99 / (Statics.field1748.field1986.length - Statics.field222.field2727) + 1 : 0;
    }
}
