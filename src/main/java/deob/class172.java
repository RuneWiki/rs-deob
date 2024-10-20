package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fx")
public class class172 {

    @ObfuscatedName("fx.s")
    public static int field2740 = 0;

    @ObfuscatedName("fx.x")
    public static class197 field2730 = new class197(4096);

    @ObfuscatedName("fx.d")
    public static int field2731 = 0;

    @ObfuscatedName("fx.u")
    public static class197 field2727 = new class197(32);

    @ObfuscatedName("fx.o")
    public static int field2733 = 0;

    @ObfuscatedName("fx.b")
    public static class204 field2744 = new class204();

    @ObfuscatedName("fx.k")
    public static class197 field2735 = new class197(4096);

    @ObfuscatedName("fx.c")
    public static int field2746 = 0;

    @ObfuscatedName("fx.l")
    public static class197 field2737 = new class197(4096);

    @ObfuscatedName("fx.t")
    public static int field2738 = 0;

    @ObfuscatedName("fx.m")
    public static class120 field2739 = new class120(8);

    @ObfuscatedName("fx.h")
    public static int field2734 = 0;

    @ObfuscatedName("fx.a")
    public static CRC32 field2741 = new CRC32();

    @ObfuscatedName("fx.g")
    public static class169[] field2747 = new class169[256];

    @ObfuscatedName("fx.y")
    public static byte field2745 = 0;

    @ObfuscatedName("fx.f")
    public static int field2728 = 0;

    @ObfuscatedName("fx.q")
    public static int field2742 = 0;

    public class172() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ev.s(S)Z")
    public static boolean method2697() {
        long var0 = class116.method157();
        int var2 = (int) (var0 - Statics.field2729);
        Statics.field2729 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2740 += var2;
        if (field2738 == 0 && field2733 == 0 && field2746 == 0 && field2731 == 0) {
            return true;
        } else if (Statics.field2732 == null) {
            return false;
        } else {
            try {
                if (field2740 > 30000) {
                    throw new IOException();
                }
                while (field2733 < 20 && field2731 > 0) {
                    class173 var3 = (class173) field2730.method3521();
                    class120 var4 = new class120(4);
                    var4.method2323(1);
                    var4.method2452((int) var3.field3126);
                    Statics.field2732.method2800(var4.field2008, 0, 4);
                    field2727.method3519(var3, var3.field3126);
                    field2731--;
                    field2733++;
                }
                while (field2738 < 20 && field2746 > 0) {
                    class173 var5 = (class173) field2744.method3604();
                    class120 var6 = new class120(4);
                    var6.method2323(0);
                    var6.method2452((int) var5.field3126);
                    Statics.field2732.method2800(var6.field2008, 0, 4);
                    var5.method3617();
                    field2737.method3519(var5, var5.field3126);
                    field2746--;
                    field2738++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2732.method2798();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2740 = 0;
                    byte var9 = 0;
                    if (Statics.field2046 == null) {
                        var9 = 8;
                    } else if (field2734 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2739.field2006;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2732.method2797(field2739.field2008, field2739.field2006, var10);
                        if (field2745 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2739.field2008[field2739.field2006 + var11] ^= field2745;
                            }
                        }
                        field2739.field2006 += var10;
                        if (field2739.field2006 < var9) {
                            break;
                        }
                        if (Statics.field2046 == null) {
                            field2739.field2006 = 0;
                            int var12 = field2739.method2338();
                            int var13 = field2739.method2430();
                            int var14 = field2739.method2338();
                            int var15 = field2739.method2343();
                            long var16 = (long) ((var12 << 16) + var13);
                            class173 var18 = (class173) field2727.method3518(var16);
                            Statics.field167 = true;
                            if (var18 == null) {
                                var18 = (class173) field2737.method3518(var16);
                                Statics.field167 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2046 = var18;
                            Statics.field2736 = new class120(var15 + var19 + Statics.field2046.field2751);
                            Statics.field2736.method2323(var14);
                            Statics.field2736.method2326(var15);
                            field2734 = 8;
                            field2739.field2006 = 0;
                        } else if (field2734 == 0) {
                            if (field2739.field2008[0] == -1) {
                                field2734 = 1;
                                field2739.field2006 = 0;
                            } else {
                                Statics.field2046 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2736.field2008.length - Statics.field2046.field2751;
                        int var21 = 512 - field2734;
                        if (var21 > var20 - Statics.field2736.field2006) {
                            var21 = var20 - Statics.field2736.field2006;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2732.method2797(Statics.field2736.field2008, Statics.field2736.field2006, var21);
                        if (field2745 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2736.field2008[Statics.field2736.field2006 + var22] ^= field2745;
                            }
                        }
                        Statics.field2736.field2006 += var21;
                        field2734 += var21;
                        if (Statics.field2736.field2006 == var20) {
                            if (Statics.field2046.field3126 == 16711935L) {
                                Statics.field2743 = Statics.field2736;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class169 var24 = field2747[var23];
                                    if (var24 != null) {
                                        Statics.field2743.field2006 = var23 * 8 + 5;
                                        int var25 = Statics.field2743.method2343();
                                        int var26 = Statics.field2743.method2343();
                                        var24.method3086(var25, var26);
                                    }
                                }
                            } else {
                                field2741.reset();
                                field2741.update(Statics.field2736.field2008, 0, var20);
                                int var27 = (int) field2741.getValue();
                                if (Statics.field2046.field2749 != var27) {
                                    try {
                                        Statics.field2732.method2796();
                                    } catch (Exception var32) {
                                    }
                                    field2728++;
                                    Statics.field2732 = null;
                                    field2745 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2728 = 0;
                                field2742 = 0;
                                Statics.field2046.field2753.method3087((int) (Statics.field2046.field3126 & 0xFFFFL), Statics.field2736.field2008, (Statics.field2046.field3126 & 0xFF0000L) == 16711680L, Statics.field167);
                            }
                            Statics.field2046.method3639();
                            if (Statics.field167) {
                                field2733--;
                            } else {
                                field2738--;
                            }
                            field2734 = 0;
                            Statics.field2046 = null;
                            Statics.field2736 = null;
                        } else {
                            if (field2734 != 512) {
                                break;
                            }
                            field2734 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2732.method2796();
                } catch (Exception var31) {
                }
                field2742++;
                Statics.field2732 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("dn.j(ZB)V")
    public static void method2285(boolean arg0) {
        if (Statics.field2732 == null) {
            return;
        }
        try {
            class120 var1 = new class120(4);
            var1.method2323(arg0 ? 2 : 3);
            var1.method2452(0);
            Statics.field2732.method2800(var1.field2008, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2732.method2796();
            } catch (Exception var4) {
            }
            field2742++;
            Statics.field2732 = null;
        }
    }

    @ObfuscatedName("cz.p(Lfg;IIIBZS)V")
    public static void method2021(class169 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class173 var8 = (class173) field2730.method3518(var6);
        if (var8 != null) {
            return;
        }
        class173 var9 = (class173) field2727.method3518(var6);
        if (var9 != null) {
            return;
        }
        class173 var10 = (class173) field2735.method3518(var6);
        if (var10 == null) {
            if (!arg5) {
                class173 var11 = (class173) field2737.method3518(var6);
                if (var11 != null) {
                    return;
                }
            }
            class173 var12 = new class173();
            var12.field2753 = arg0;
            var12.field2749 = arg3;
            var12.field2751 = arg4;
            if (arg5) {
                field2730.method3519(var12, var6);
                field2731++;
            } else {
                field2744.method3601(var12);
                field2735.method3519(var12, var6);
                field2746++;
            }
        } else if (arg5) {
            var10.method3617();
            field2730.method3519(var10, var6);
            field2746--;
            field2731++;
        }
    }

    @ObfuscatedName("bm.x(III)I")
    public static int method1546(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2046 != null && Statics.field2046.field3126 == var2 ? Statics.field2736.field2006 * 99 / (Statics.field2736.field2008.length - Statics.field2046.field2751) + 1 : 0;
    }
}
