package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ff")
public class class172 {

    @ObfuscatedName("ff.u")
    public static int field2725 = 0;

    @ObfuscatedName("ff.b")
    public static class197 field2714 = new class197(4096);

    @ObfuscatedName("ff.l")
    public static int field2731 = 0;

    @ObfuscatedName("ff.d")
    public static class197 field2716 = new class197(32);

    @ObfuscatedName("ff.n")
    public static int field2715 = 0;

    @ObfuscatedName("ff.m")
    public static class204 field2718 = new class204();

    @ObfuscatedName("ff.g")
    public static class197 field2719 = new class197(4096);

    @ObfuscatedName("ff.s")
    public static int field2720 = 0;

    @ObfuscatedName("ff.r")
    public static class197 field2721 = new class197(4096);

    @ObfuscatedName("ff.k")
    public static int field2722 = 0;

    @ObfuscatedName("ff.p")
    public static class120 field2724 = new class120(8);

    @ObfuscatedName("ff.e")
    public static int field2712 = 0;

    @ObfuscatedName("ff.w")
    public static CRC32 field2727 = new CRC32();

    @ObfuscatedName("ff.y")
    public static class169[] field2729 = new class169[256];

    @ObfuscatedName("ff.c")
    public static byte field2730 = 0;

    @ObfuscatedName("ff.i")
    public static int field2732 = 0;

    @ObfuscatedName("ff.a")
    public static int field2717 = 0;

    public class172() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fd.f(ZI)V")
    public static void method3025(boolean arg0) {
        if (Statics.field2723 == null) {
            return;
        }
        try {
            class120 var1 = new class120(4);
            var1.method2485(arg0 ? 2 : 3);
            var1.method2372(0);
            Statics.field2723.method2837(var1.field2001, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2723.method2832();
            } catch (Exception var4) {
            }
            field2717++;
            Statics.field2723 = null;
        }
    }

    @ObfuscatedName("ek.u(Leu;ZB)V")
    public static void method2787(class144 arg0, boolean arg1) {
        if (Statics.field2723 != null) {
            try {
                Statics.field2723.method2832();
            } catch (Exception var10) {
            }
            Statics.field2723 = null;
        }
        Statics.field2723 = arg0;
        method3025(arg1);
        field2724.field1999 = 0;
        Statics.field2174 = null;
        Statics.field2713 = null;
        field2712 = 0;
        while (true) {
            class173 var3 = (class173) field2716.method3558();
            if (var3 == null) {
                while (true) {
                    class173 var4 = (class173) field2721.method3558();
                    if (var4 == null) {
                        if (field2730 != 0) {
                            try {
                                class120 var5 = new class120(4);
                                var5.method2485(4);
                                var5.method2485(field2730);
                                var5.method2371(0);
                                Statics.field2723.method2837(var5.field2001, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2723.method2832();
                                } catch (Exception var8) {
                                }
                                field2717++;
                                Statics.field2723 = null;
                            }
                        }
                        field2725 = 0;
                        Statics.field2047 = class116.method2672();
                        return;
                    }
                    field2718.method3645(var4);
                    field2719.method3559(var4, var4.field3116);
                    field2720++;
                    field2722--;
                }
            }
            field2714.method3559(var3, var3.field3116);
            field2731++;
            field2715--;
        }
    }

    @ObfuscatedName("ds.x(Lfo;IB)V")
    public static void method2315(class169 arg0, int arg1) {
        if (Statics.field2728 == null) {
            method1045((class169) null, 255, 255, 0, (byte) 0, true);
            field2729[arg1] = arg0;
        } else {
            Statics.field2728.field1999 = arg1 * 8 + 5;
            int var2 = Statics.field2728.method2527();
            int var3 = Statics.field2728.method2527();
            arg0.method3141(var2, var3);
        }
    }

    @ObfuscatedName("at.b(Lfo;IIIBZI)V")
    public static void method1045(class169 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class173 var8 = (class173) field2714.method3555(var6);
        if (var8 != null) {
            return;
        }
        class173 var9 = (class173) field2716.method3555(var6);
        if (var9 != null) {
            return;
        }
        class173 var10 = (class173) field2719.method3555(var6);
        if (var10 == null) {
            if (!arg5) {
                class173 var11 = (class173) field2721.method3555(var6);
                if (var11 != null) {
                    return;
                }
            }
            class173 var12 = new class173();
            var12.field2742 = arg0;
            var12.field2736 = arg3;
            var12.field2738 = arg4;
            if (arg5) {
                field2714.method3559(var12, var6);
                field2731++;
            } else {
                field2718.method3641(var12);
                field2719.method3559(var12, var6);
                field2720++;
            }
        } else if (arg5) {
            var10.method3655();
            field2714.method3559(var10, var6);
            field2720--;
            field2731++;
        }
    }

    @ObfuscatedName("n.l(III)I")
    public static int method93(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2174 != null && Statics.field2174.field3116 == var2 ? Statics.field2713.field1999 * 99 / (Statics.field2713.field2001.length - Statics.field2174.field2738) + 1 : 0;
    }

    @ObfuscatedName("dl.d(I)V")
    public static void method2324() {
        if (Statics.field2723 != null) {
            Statics.field2723.method2832();
        }
    }
}
