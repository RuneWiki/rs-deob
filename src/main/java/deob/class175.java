package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fd")
public class class175 {

    @ObfuscatedName("fd.g")
    public static int field2770 = 0;

    @ObfuscatedName("fd.e")
    public static class200 field2772 = new class200(4096);

    @ObfuscatedName("fd.h")
    public static int field2782 = 0;

    @ObfuscatedName("fd.s")
    public static class200 field2778 = new class200(32);

    @ObfuscatedName("fd.k")
    public static int field2775 = 0;

    @ObfuscatedName("fd.u")
    public static class207 field2773 = new class207();

    @ObfuscatedName("fd.n")
    public static class200 field2777 = new class200(4096);

    @ObfuscatedName("fd.b")
    public static int field2769 = 0;

    @ObfuscatedName("fd.m")
    public static class200 field2779 = new class200(4096);

    @ObfuscatedName("fd.q")
    public static int field2780 = 0;

    @ObfuscatedName("fd.o")
    public static class123 field2776 = new class123(8);

    @ObfuscatedName("fd.f")
    public static int field2783 = 0;

    @ObfuscatedName("fd.i")
    public static CRC32 field2784 = new CRC32();

    @ObfuscatedName("fd.j")
    public static class172[] field2787 = new class172[256];

    @ObfuscatedName("fd.x")
    public static byte field2774 = 0;

    @ObfuscatedName("fd.t")
    public static int field2786 = 0;

    @ObfuscatedName("fd.y")
    public static int field2788 = 0;

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.l(I)Z")
    public static boolean method3099() {
        long var0 = class119.method1224();
        int var2 = (int) (var0 - Statics.field2771);
        Statics.field2771 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2770 += var2;
        if (field2780 == 0 && field2775 == 0 && field2769 == 0 && field2782 == 0) {
            return true;
        } else if (Statics.field2791 == null) {
            return false;
        } else {
            try {
                if (field2770 > 30000) {
                    throw new IOException();
                }
                while (field2775 < 20 && field2782 > 0) {
                    class176 var3 = (class176) field2772.method3687();
                    class123 var4 = new class123(4);
                    var4.method2640(1);
                    var4.method2706((int) var3.field3176);
                    Statics.field2791.method2981(var4.field2052, 0, 4);
                    field2778.method3688(var3, var3.field3176);
                    field2782--;
                    field2775++;
                }
                while (field2780 < 20 && field2769 > 0) {
                    class176 var5 = (class176) field2773.method3777();
                    class123 var6 = new class123(4);
                    var6.method2640(0);
                    var6.method2706((int) var5.field3176);
                    Statics.field2791.method2981(var6.field2052, 0, 4);
                    var5.method3793();
                    field2779.method3688(var5, var5.field3176);
                    field2769--;
                    field2780++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2791.method2987();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2770 = 0;
                    byte var9 = 0;
                    if (Statics.field2781 == null) {
                        var9 = 8;
                    } else if (field2783 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2776.field2051;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2791.method2978(field2776.field2052, field2776.field2051, var10);
                        if (field2774 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2776.field2052[field2776.field2051 + var11] ^= field2774;
                            }
                        }
                        field2776.field2051 += var10;
                        if (field2776.field2051 < var9) {
                            break;
                        }
                        if (Statics.field2781 == null) {
                            field2776.field2051 = 0;
                            int var12 = field2776.method2490();
                            int var13 = field2776.method2492();
                            int var14 = field2776.method2490();
                            int var15 = field2776.method2477();
                            long var16 = (long) ((var12 << 16) + var13);
                            class176 var18 = (class176) field2778.method3684(var16);
                            Statics.field739 = true;
                            if (var18 == null) {
                                var18 = (class176) field2779.method3684(var16);
                                Statics.field739 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2781 = var18;
                            Statics.field2369 = new class123(var15 + var19 + Statics.field2781.field2794);
                            Statics.field2369.method2640(var14);
                            Statics.field2369.method2585(var15);
                            field2783 = 8;
                            field2776.field2051 = 0;
                        } else if (field2783 == 0) {
                            if (field2776.field2052[0] == -1) {
                                field2783 = 1;
                                field2776.field2051 = 0;
                            } else {
                                Statics.field2781 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2369.field2052.length - Statics.field2781.field2794;
                        int var21 = 512 - field2783;
                        if (var21 > var20 - Statics.field2369.field2051) {
                            var21 = var20 - Statics.field2369.field2051;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2791.method2978(Statics.field2369.field2052, Statics.field2369.field2051, var21);
                        if (field2774 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2369.field2052[Statics.field2369.field2051 + var22] ^= field2774;
                            }
                        }
                        Statics.field2369.field2051 += var21;
                        field2783 += var21;
                        if (Statics.field2369.field2051 == var20) {
                            if (Statics.field2781.field3176 == 16711935L) {
                                Statics.field2339 = Statics.field2369;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class172 var24 = field2787[var23];
                                    if (var24 != null) {
                                        Statics.field2339.field2051 = var23 * 8 + 5;
                                        int var25 = Statics.field2339.method2477();
                                        int var26 = Statics.field2339.method2477();
                                        var24.method3284(var25, var26);
                                    }
                                }
                            } else {
                                field2784.reset();
                                field2784.update(Statics.field2369.field2052, 0, var20);
                                int var27 = (int) field2784.getValue();
                                if (Statics.field2781.field2793 != var27) {
                                    try {
                                        Statics.field2791.method2977();
                                    } catch (Exception var32) {
                                    }
                                    field2786++;
                                    Statics.field2791 = null;
                                    field2774 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2786 = 0;
                                field2788 = 0;
                                Statics.field2781.field2796.method3285((int) (Statics.field2781.field3176 & 0xFFFFL), Statics.field2369.field2052, (Statics.field2781.field3176 & 0xFF0000L) == 16711680L, Statics.field739);
                            }
                            Statics.field2781.method3815();
                            if (Statics.field739) {
                                field2775--;
                            } else {
                                field2780--;
                            }
                            field2783 = 0;
                            Statics.field2781 = null;
                            Statics.field2369 = null;
                        } else {
                            if (field2783 != 512) {
                                break;
                            }
                            field2783 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2791.method2977();
                } catch (Exception var31) {
                }
                field2788++;
                Statics.field2791 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("fk.g(ZS)V")
    public static void method3117(boolean arg0) {
        if (Statics.field2791 == null) {
            return;
        }
        try {
            class123 var1 = new class123(4);
            var1.method2640(arg0 ? 2 : 3);
            var1.method2706(0);
            Statics.field2791.method2981(var1.field2052, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2791.method2977();
            } catch (Exception var4) {
            }
            field2788++;
            Statics.field2791 = null;
        }
    }

    @ObfuscatedName("cw.r(Les;ZI)V")
    public static void method1633(class147 arg0, boolean arg1) {
        if (Statics.field2791 != null) {
            try {
                Statics.field2791.method2977();
            } catch (Exception var10) {
            }
            Statics.field2791 = null;
        }
        Statics.field2791 = arg0;
        method3117(arg1);
        field2776.field2051 = 0;
        Statics.field2781 = null;
        Statics.field2369 = null;
        field2783 = 0;
        while (true) {
            class176 var3 = (class176) field2778.method3687();
            if (var3 == null) {
                while (true) {
                    class176 var4 = (class176) field2779.method3687();
                    if (var4 == null) {
                        if (field2774 != 0) {
                            try {
                                class123 var5 = new class123(4);
                                var5.method2640(4);
                                var5.method2640(field2774);
                                var5.method2476(0);
                                Statics.field2791.method2981(var5.field2052, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2791.method2977();
                                } catch (Exception var8) {
                                }
                                field2788++;
                                Statics.field2791 = null;
                            }
                        }
                        field2770 = 0;
                        Statics.field2771 = class119.method1224();
                        return;
                    }
                    field2773.method3791(var4);
                    field2777.method3688(var4, var4.field3176);
                    field2769++;
                    field2780--;
                }
            }
            field2772.method3688(var3, var3.field3176);
            field2782++;
            field2775--;
        }
    }

    @ObfuscatedName("dz.e(Lfq;II)V")
    public static void method2412(class172 arg0, int arg1) {
        if (Statics.field2339 == null) {
            method2776((class172) null, 255, 255, 0, (byte) 0, true);
            field2787[arg1] = arg0;
        } else {
            Statics.field2339.field2051 = arg1 * 8 + 5;
            int var2 = Statics.field2339.method2477();
            int var3 = Statics.field2339.method2477();
            arg0.method3284(var2, var3);
        }
    }

    @ObfuscatedName("dr.h(Lfq;IIIBZI)V")
    public static void method2776(class172 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class176 var8 = (class176) field2772.method3684(var6);
        if (var8 != null) {
            return;
        }
        class176 var9 = (class176) field2778.method3684(var6);
        if (var9 != null) {
            return;
        }
        class176 var10 = (class176) field2777.method3684(var6);
        if (var10 == null) {
            if (!arg5) {
                class176 var11 = (class176) field2779.method3684(var6);
                if (var11 != null) {
                    return;
                }
            }
            class176 var12 = new class176();
            var12.field2796 = arg0;
            var12.field2793 = arg3;
            var12.field2794 = arg4;
            if (arg5) {
                field2772.method3688(var12, var6);
                field2782++;
            } else {
                field2773.method3781(var12);
                field2777.method3688(var12, var6);
                field2769++;
            }
        } else if (arg5) {
            var10.method3793();
            field2772.method3688(var10, var6);
            field2769--;
            field2782++;
        }
    }

    @ObfuscatedName("l.s(III)V")
    public static void method4(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class176 var4 = (class176) field2777.method3684(var2);
        if (var4 != null) {
            field2773.method3791(var4);
        }
    }

    @ObfuscatedName("db.k(III)I")
    public static int method2404(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2781 != null && Statics.field2781.field3176 == var2 ? Statics.field2369.field2051 * 99 / (Statics.field2369.field2052.length - Statics.field2781.field2794) + 1 : 0;
    }

    @ObfuscatedName("fh.u(ZZB)I")
    public static int method3305(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2782 + field2775;
        }
        if (arg1) {
            var2 += field2780 + field2769;
        }
        return var2;
    }

    @ObfuscatedName("dw.n(B)V")
    public static void method2348() {
        if (Statics.field2791 != null) {
            Statics.field2791.method2977();
        }
    }
}
