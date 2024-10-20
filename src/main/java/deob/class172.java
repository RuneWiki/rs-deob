package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fj")
public class class172 {

    @ObfuscatedName("fj.x")
    public static int field2736 = 0;

    @ObfuscatedName("fj.p")
    public static class197 field2753 = new class197(4096);

    @ObfuscatedName("fj.e")
    public static int field2740 = 0;

    @ObfuscatedName("fj.y")
    public static class197 field2750 = new class197(32);

    @ObfuscatedName("fj.m")
    public static int field2738 = 0;

    @ObfuscatedName("fj.c")
    public static class204 field2742 = new class204();

    @ObfuscatedName("fj.v")
    public static class197 field2739 = new class197(4096);

    @ObfuscatedName("fj.l")
    public static int field2741 = 0;

    @ObfuscatedName("fj.z")
    public static class197 field2735 = new class197(4096);

    @ObfuscatedName("fj.s")
    public static int field2737 = 0;

    @ObfuscatedName("fj.a")
    public static class120 field2734 = new class120(8);

    @ObfuscatedName("fj.u")
    public static int field2746 = 0;

    @ObfuscatedName("fj.o")
    public static CRC32 field2747 = new CRC32();

    @ObfuscatedName("fj.k")
    public static class169[] field2748 = new class169[256];

    @ObfuscatedName("fj.f")
    public static byte field2749 = 0;

    @ObfuscatedName("fj.r")
    public static int field2754 = 0;

    @ObfuscatedName("fj.n")
    public static int field2751 = 0;

    public class172() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.w(I)Z")
    public static boolean method111() {
        long var0 = Statics.method162();
        int var2 = (int) (var0 - Statics.field2199);
        Statics.field2199 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2736 += var2;
        if (field2737 == 0 && field2738 == 0 && field2741 == 0 && field2740 == 0) {
            return true;
        } else if (Statics.field2743 == null) {
            return false;
        } else {
            try {
                if (field2736 > 30000) {
                    throw new IOException();
                }
                while (field2738 < 20 && field2740 > 0) {
                    class173 var3 = (class173) field2753.method3554();
                    class120 var4 = new class120(4);
                    var4.method2430(1);
                    var4.method2510((int) var3.field3124);
                    Statics.field2743.method2844(var4.field2013, 0, 4);
                    field2750.method3556(var3, var3.field3124);
                    field2740--;
                    field2738++;
                }
                while (field2737 < 20 && field2741 > 0) {
                    class173 var5 = (class173) field2742.method3645();
                    class120 var6 = new class120(4);
                    var6.method2430(0);
                    var6.method2510((int) var5.field3124);
                    Statics.field2743.method2844(var6.field2013, 0, 4);
                    var5.method3658();
                    field2735.method3556(var5, var5.field3124);
                    field2741--;
                    field2737++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2743.method2842();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2736 = 0;
                    byte var9 = 0;
                    if (Statics.field591 == null) {
                        var9 = 8;
                    } else if (field2746 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2734.field2012;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2743.method2843(field2734.field2013, field2734.field2012, var10);
                        if (field2749 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2734.field2013[field2734.field2012 + var11] ^= field2749;
                            }
                        }
                        field2734.field2012 += var10;
                        if (field2734.field2012 < var9) {
                            break;
                        }
                        if (Statics.field591 == null) {
                            field2734.field2012 = 0;
                            int var12 = field2734.method2363();
                            int var13 = field2734.method2365();
                            int var14 = field2734.method2363();
                            int var15 = field2734.method2368();
                            long var16 = (long) ((var12 << 16) + var13);
                            class173 var18 = (class173) field2750.method3555(var16);
                            Statics.field2744 = true;
                            if (var18 == null) {
                                var18 = (class173) field2735.method3555(var16);
                                Statics.field2744 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field591 = var18;
                            Statics.field214 = new class120(var15 + var19 + Statics.field591.field2757);
                            Statics.field214.method2430(var14);
                            Statics.field214.method2351(var15);
                            field2746 = 8;
                            field2734.field2012 = 0;
                        } else if (field2746 == 0) {
                            if (field2734.field2013[0] == -1) {
                                field2746 = 1;
                                field2734.field2012 = 0;
                            } else {
                                Statics.field591 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field214.field2013.length - Statics.field591.field2757;
                        int var21 = 512 - field2746;
                        if (var21 > var20 - Statics.field214.field2012) {
                            var21 = var20 - Statics.field214.field2012;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2743.method2843(Statics.field214.field2013, Statics.field214.field2012, var21);
                        if (field2749 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field214.field2013[Statics.field214.field2012 + var22] ^= field2749;
                            }
                        }
                        Statics.field214.field2012 += var21;
                        field2746 += var21;
                        if (Statics.field214.field2012 == var20) {
                            if (Statics.field591.field3124 == 16711935L) {
                                Statics.field182 = Statics.field214;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class169 var24 = field2748[var23];
                                    if (var24 != null) {
                                        Statics.field182.field2012 = var23 * 8 + 5;
                                        int var25 = Statics.field182.method2368();
                                        int var26 = Statics.field182.method2368();
                                        var24.method3155(var25, var26);
                                    }
                                }
                            } else {
                                field2747.reset();
                                field2747.update(Statics.field214.field2013, 0, var20);
                                int var27 = (int) field2747.getValue();
                                if (Statics.field591.field2758 != var27) {
                                    try {
                                        Statics.field2743.method2847();
                                    } catch (Exception var32) {
                                    }
                                    field2754++;
                                    Statics.field2743 = null;
                                    field2749 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2754 = 0;
                                field2751 = 0;
                                Statics.field591.field2756.method3156((int) (Statics.field591.field3124 & 0xFFFFL), Statics.field214.field2013, (Statics.field591.field3124 & 0xFF0000L) == 16711680L, Statics.field2744);
                            }
                            Statics.field591.method3684();
                            if (Statics.field2744) {
                                field2738--;
                            } else {
                                field2737--;
                            }
                            field2746 = 0;
                            Statics.field591 = null;
                            Statics.field214 = null;
                        } else {
                            if (field2746 != 512) {
                                break;
                            }
                            field2746 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2743.method2847();
                } catch (Exception var31) {
                }
                field2751++;
                Statics.field2743 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("bt.x(ZI)V")
    public static void method1578(boolean arg0) {
        if (Statics.field2743 == null) {
            return;
        }
        try {
            class120 var1 = new class120(4);
            var1.method2430(arg0 ? 2 : 3);
            var1.method2510(0);
            Statics.field2743.method2844(var1.field2013, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2743.method2847();
            } catch (Exception var4) {
            }
            field2751++;
            Statics.field2743 = null;
        }
    }

    @ObfuscatedName("ff.t(Lfn;II)V")
    public static void method3054(class169 arg0, int arg1) {
        if (Statics.field182 == null) {
            method3015((class169) null, 255, 255, 0, (byte) 0, true);
            field2748[arg1] = arg0;
        } else {
            Statics.field182.field2012 = arg1 * 8 + 5;
            int var2 = Statics.field182.method2368();
            int var3 = Statics.field182.method2368();
            arg0.method3155(var2, var3);
        }
    }

    @ObfuscatedName("fh.p(Lfn;IIIBZB)V")
    public static void method3015(class169 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class173 var8 = (class173) field2753.method3555(var6);
        if (var8 != null) {
            return;
        }
        class173 var9 = (class173) field2750.method3555(var6);
        if (var9 != null) {
            return;
        }
        class173 var10 = (class173) field2739.method3555(var6);
        if (var10 == null) {
            if (!arg5) {
                class173 var11 = (class173) field2735.method3555(var6);
                if (var11 != null) {
                    return;
                }
            }
            class173 var12 = new class173();
            var12.field2756 = arg0;
            var12.field2758 = arg3;
            var12.field2757 = arg4;
            if (arg5) {
                field2753.method3556(var12, var6);
                field2740++;
            } else {
                field2742.method3654(var12);
                field2739.method3556(var12, var6);
                field2741++;
            }
        } else if (arg5) {
            var10.method3658();
            field2753.method3556(var10, var6);
            field2741--;
            field2740++;
        }
    }

    @ObfuscatedName("eg.e(III)V")
    public static void method2972(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class173 var4 = (class173) field2739.method3555(var2);
        if (var4 != null) {
            field2742.method3656(var4);
        }
    }

    @ObfuscatedName("dd.y(I)V")
    public static void method2289() {
        if (Statics.field2743 != null) {
            Statics.field2743.method2847();
        }
    }
}
