package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fm")
public class class171 {

    @ObfuscatedName("fm.d")
    public static int field2709 = 0;

    @ObfuscatedName("fm.w")
    public static class196 field2691 = new class196(4096);

    @ObfuscatedName("fm.e")
    public static int field2692 = 0;

    @ObfuscatedName("fm.c")
    public static class196 field2688 = new class196(32);

    @ObfuscatedName("fm.a")
    public static int field2710 = 0;

    @ObfuscatedName("fm.q")
    public static class203 field2699 = new class203();

    @ObfuscatedName("fm.m")
    public static class196 field2689 = new class196(4096);

    @ObfuscatedName("fm.n")
    public static int field2697 = 0;

    @ObfuscatedName("fm.k")
    public static class196 field2698 = new class196(4096);

    @ObfuscatedName("fm.o")
    public static int field2705 = 0;

    @ObfuscatedName("fm.z")
    public static class119 field2701 = new class119(8);

    @ObfuscatedName("fm.p")
    public static int field2702 = 0;

    @ObfuscatedName("fm.x")
    public static CRC32 field2703 = new CRC32();

    @ObfuscatedName("fm.j")
    public static class168[] field2704 = new class168[256];

    @ObfuscatedName("fm.v")
    public static byte field2693 = 0;

    @ObfuscatedName("fm.l")
    public static int field2706 = 0;

    @ObfuscatedName("fm.u")
    public static int field2707 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.y(ZI)V")
    public static void method1749(boolean arg0) {
        if (Statics.field2700 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2354(arg0 ? 2 : 3);
            var1.method2494(0);
            Statics.field2700.method2789(var1.field1974, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2700.method2794();
            } catch (Exception var4) {
            }
            field2707++;
            Statics.field2700 = null;
        }
    }

    @ObfuscatedName("br.d(Lef;ZB)V")
    public static void method1507(class143 arg0, boolean arg1) {
        if (Statics.field2700 != null) {
            try {
                Statics.field2700.method2794();
            } catch (Exception var10) {
            }
            Statics.field2700 = null;
        }
        Statics.field2700 = arg0;
        method1749(arg1);
        field2701.field1973 = 0;
        Statics.field2051 = null;
        Statics.field2591 = null;
        field2702 = 0;
        while (true) {
            class172 var3 = (class172) field2688.method3461();
            if (var3 == null) {
                while (true) {
                    class172 var4 = (class172) field2698.method3461();
                    if (var4 == null) {
                        if (field2693 != 0) {
                            try {
                                class119 var5 = new class119(4);
                                var5.method2354(4);
                                var5.method2354(field2693);
                                var5.method2312(0);
                                Statics.field2700.method2789(var5.field1974, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2700.method2794();
                                } catch (Exception var8) {
                                }
                                field2707++;
                                Statics.field2700 = null;
                            }
                        }
                        field2709 = 0;
                        Statics.field2690 = class115.method671();
                        return;
                    }
                    field2699.method3545(var4);
                    field2689.method3460(var4, var4.field3091);
                    field2697++;
                    field2705--;
                }
            }
            field2691.method3460(var3, var3.field3091);
            field2692++;
            field2710--;
        }
    }

    @ObfuscatedName("au.g(Lfy;II)V")
    public static void method920(class168 arg0, int arg1) {
        if (Statics.field148 == null) {
            method668((class168) null, 255, 255, 0, (byte) 0, true);
            field2704[arg1] = arg0;
        } else {
            Statics.field148.field1973 = arg1 * 8 + 5;
            int var2 = Statics.field148.method2331();
            int var3 = Statics.field148.method2331();
            arg0.method3069(var2, var3);
        }
    }

    @ObfuscatedName("ae.w(Lfy;IIIBZI)V")
    public static void method668(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2691.method3459(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2688.method3459(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2689.method3459(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2698.method3459(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2716 = arg0;
            var12.field2712 = arg3;
            var12.field2715 = arg4;
            if (arg5) {
                field2691.method3460(var12, var6);
                field2692++;
            } else {
                field2699.method3544(var12);
                field2689.method3460(var12, var6);
                field2697++;
            }
        } else if (arg5) {
            var10.method3561();
            field2691.method3460(var10, var6);
            field2697--;
            field2692++;
        }
    }

    @ObfuscatedName("fr.e(III)I")
    public static int method2985(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2051 != null && Statics.field2051.field3091 == var2 ? Statics.field2591.field1973 * 99 / (Statics.field2591.field1974.length - Statics.field2051.field2715) + 1 : 0;
    }
}
