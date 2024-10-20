package deob;

@ObfuscatedName("ay")
public class class33 {

    @ObfuscatedName("ay.g")
    public static byte[] field739 = new byte[2048];

    @ObfuscatedName("ay.h")
    public static byte[] field740 = new byte[2048];

    @ObfuscatedName("ay.z")
    public static class120[] field737 = new class120[2048];

    @ObfuscatedName("ay.r")
    public static int field742 = 0;

    @ObfuscatedName("ay.f")
    public static int[] field743 = new int[2048];

    @ObfuscatedName("ay.s")
    public static int field744 = 0;

    @ObfuscatedName("ay.d")
    public static int[] field745 = new int[2048];

    @ObfuscatedName("ay.l")
    public static int[] field757 = new int[2048];

    @ObfuscatedName("ay.y")
    public static int[] field748 = new int[2048];

    @ObfuscatedName("ay.p")
    public static int[] field741 = new int[2048];

    @ObfuscatedName("ay.k")
    public static int field749 = 0;

    @ObfuscatedName("ay.o")
    public static int[] field750 = new int[2048];

    @ObfuscatedName("ay.b")
    public static class120 field751 = new class120(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fo.t(Ldx;I)V")
    public static final void method2969(class123 arg0) {
        arg0.method2566();
        int var1 = client.field461;
        class3 var2 = Statics.field2302 = client.field406[var1] = new class3();
        var2.field59 = var1;
        int var3 = arg0.method2553(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field848[0] = var5 - Statics.field1566;
        var2.field810 = (var2.field848[0] << 7) + (var2.method31() << 6);
        var2.field840[0] = var6 - Statics.field359;
        var2.field805 = (var2.field840[0] << 7) + (var2.method31() << 6);
        Statics.field755 = var2.field58 = var4;
        if (field737[var1] != null) {
            var2.method13(field737[var1]);
        }
        field742 = 0;
        field743[++field742 - 1] = var1;
        field739[var1] = 0;
        field744 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2553(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field757[var7] = (var9 << 28) + (var10 << 14) + var11;
                field748[var7] = 0;
                field741[var7] = -1;
                field745[++field744 - 1] = var7;
                field739[var7] = 0;
            }
        }
        arg0.method2554();
    }

    @ObfuscatedName("dz.i(Ldx;IS)V")
    public static final void method2234(class123 arg0, int arg1) {
        int var2 = arg0.field2001;
        field749 = 0;
        method1726(arg0);
        for (int var3 = 0; var3 < field749; var3++) {
            int var4 = field750[var3];
            class3 var5 = client.field406[var4];
            int var6 = arg0.method2334();
            if ((var6 & 0x20) != 0) {
                var6 += arg0.method2334() << 8;
            }
            method1708(arg0, var4, var5, var6);
        }
        if (arg0.field2001 - var2 != arg1) {
            throw new RuntimeException(arg0.field2001 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("cg.g(Ldx;B)V")
    public static final void method1726(class123 arg0) {
        int var1 = 0;
        arg0.method2566();
        for (int var2 = 0; var2 < field742; var2++) {
            int var3 = field743[var2];
            if ((field739[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field739[var3] = (byte) (field739[var3] | 0x2);
                } else {
                    int var4 = arg0.method2553(1);
                    if (var4 == 0) {
                        var1 = method2920(arg0);
                        field739[var3] = (byte) (field739[var3] | 0x2);
                    } else {
                        Statics.method2783(arg0, var3);
                    }
                }
            }
        }
        arg0.method2554();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2566();
        for (int var5 = 0; var5 < field742; var5++) {
            int var6 = field743[var5];
            if ((field739[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field739[var6] = (byte) (field739[var6] | 0x2);
                } else {
                    int var7 = arg0.method2553(1);
                    if (var7 == 0) {
                        var1 = method2920(arg0);
                        field739[var6] = (byte) (field739[var6] | 0x2);
                    } else {
                        Statics.method2783(arg0, var6);
                    }
                }
            }
        }
        arg0.method2554();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2566();
        for (int var8 = 0; var8 < field744; var8++) {
            int var9 = field745[var8];
            if ((field739[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field739[var9] = (byte) (field739[var9] | 0x2);
                } else {
                    int var10 = arg0.method2553(1);
                    if (var10 == 0) {
                        var1 = method2920(arg0);
                        field739[var9] = (byte) (field739[var9] | 0x2);
                    } else if (method2246(arg0, var9)) {
                        field739[var9] = (byte) (field739[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method2554();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method2566();
        for (int var11 = 0; var11 < field744; var11++) {
            int var12 = field745[var11];
            if ((field739[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field739[var12] = (byte) (field739[var12] | 0x2);
                } else {
                    int var13 = arg0.method2553(1);
                    if (var13 == 0) {
                        var1 = method2920(arg0);
                        field739[var12] = (byte) (field739[var12] | 0x2);
                    } else if (method2246(arg0, var12)) {
                        field739[var12] = (byte) (field739[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method2554();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field742 = 0;
        field744 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field739[var14] = (byte) (field739[var14] >> 1);
            class3 var15 = client.field406[var14];
            if (var15 == null) {
                field745[++field744 - 1] = var14;
            } else {
                field743[++field742 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("ec.h(Ldx;I)I")
    public static int method2920(class123 arg0) {
        int var1 = arg0.method2553(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2553(5);
        } else if (var1 == 2) {
            var2 = arg0.method2553(8);
        } else {
            var2 = arg0.method2553(11);
        }
        return var2;
    }

    @ObfuscatedName("de.r(Ldx;II)Z")
    public static boolean method2246(class123 arg0, int arg1) {
        int var2 = arg0.method2553(2);
        if (var2 == 0) {
            if (arg0.method2553(1) != 0) {
                method2246(arg0, arg1);
            }
            int var3 = arg0.method2553(6);
            int var4 = arg0.method2553(6);
            boolean var5 = arg0.method2553(1) == 1;
            if (var5) {
                field750[++field749 - 1] = arg1;
            }
            if (client.field406[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field406[arg1] = new class3();
            var6.field59 = arg1;
            if (field737[arg1] != null) {
                var6.method13(field737[arg1]);
            }
            var6.field832 = field748[arg1];
            var6.field829 = field741[arg1];
            int var7 = field757[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field860[0] = field740[arg1];
            var6.field58 = (byte) var8;
            var6.method30((var9 << 6) + var3 - Statics.field1566, (var10 << 6) + var4 - Statics.field359);
            var6.field49 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2553(2);
            int var12 = field757[arg1];
            field757[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2553(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field757[arg1];
            int var17 = (var16 >> 28) + var14 & 0x3;
            int var18 = var16 >> 14 & 0xFF;
            int var19 = var16 & 0xFF;
            if (var15 == 0) {
                var18--;
                var19--;
            }
            if (var15 == 1) {
                var19--;
            }
            if (var15 == 2) {
                var18++;
                var19--;
            }
            if (var15 == 3) {
                var18--;
            }
            if (var15 == 4) {
                var18++;
            }
            if (var15 == 5) {
                var18--;
                var19++;
            }
            if (var15 == 6) {
                var19++;
            }
            if (var15 == 7) {
                var18++;
                var19++;
            }
            field757[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2553(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field757[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field757[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("cb.f(Ldx;ILg;IB)V")
    public static final void method1708(class123 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x80) != 0) {
            int var5 = arg0.method2334();
            byte[] var6 = new byte[var5];
            class120 var7 = new class120(var6);
            arg0.method2319(var6, 0, var5);
            field737[arg1] = var7;
            arg2.method13(var7);
        }
        if ((arg3 & 0x10) != 0) {
            int var8 = arg0.method2310();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2334();
            client.method3(arg2, var8, var9);
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field829 = arg0.method2310();
            if (arg2.field829 == 65535) {
                arg2.field829 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field817 = arg0.method2316();
            if (arg2.field817.charAt(0) == '~') {
                arg2.field817 = arg2.field817.substring(1);
                class12.method683(2, arg2.field40, arg2.field817);
            } else if (Statics.field2302 == arg2) {
                class12.method683(2, arg2.field40, arg2.field817);
            }
            arg2.field818 = false;
            arg2.field821 = 0;
            arg2.field822 = 0;
            arg2.field843 = 150;
        }
        if ((arg3 & 0x2) != 0) {
            int var10 = arg0.method2310();
            int var11 = arg0.method2334();
            arg2.method706(var10, var11, client.field333);
            arg2.field859 = client.field333 + 300;
            arg2.field827 = arg0.method2334();
            arg2.field845 = arg0.method2334();
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field831 = arg0.method2310();
            if (arg2.field857 == 0) {
                arg2.field832 = arg2.field831;
                arg2.field831 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var12 = arg0.method2310();
            class153[] var13 = new class153[] { class153.field2300, class153.field2295, class153.field2294, class153.field2291, class153.field2292 };
            class153 var14 = (class153) class110.method632(var13, arg0.method2334());
            boolean var15 = arg0.method2334() == 1;
            int var16 = arg0.method2334();
            int var17 = arg0.field2001;
            if (arg2.field40 != null && arg2.field60 != null) {
                boolean var18 = false;
                if (var14.field2299 && client.method193(arg2.field40)) {
                    var18 = true;
                }
                if (!var18 && client.field405 == 0 && !arg2.field57) {
                    field751.field2001 = 0;
                    arg0.method2319(field751.field2002, 0, var16);
                    field751.field2001 = 0;
                    String var19 = class224.method3704(class164.method152(class223.method3446(field751)));
                    arg2.field817 = var19.trim();
                    arg2.field821 = var12 >> 8;
                    arg2.field822 = var12 & 0xFF;
                    arg2.field843 = 150;
                    arg2.field818 = var15;
                    arg2.field836 = Statics.field2302 != arg2 && var14.field2299 && client.field300 != "" && var19.toLowerCase().indexOf(client.field300) == -1;
                    int var20;
                    if (var14.field2298) {
                        var20 = var15 ? 91 : 1;
                    } else {
                        var20 = var15 ? 90 : 2;
                    }
                    if (var14.field2297 == -1) {
                        class12.method683(var20, arg2.field40, var19);
                    } else {
                        int var22 = var14.field2297;
                        String var23 = "<img=" + var22 + ">";
                        class12.method683(var20, var23 + arg2.field40, var19);
                    }
                }
            }
            arg0.field2001 = var16 + var17;
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field837 = arg0.method2310();
            int var24 = arg0.method2345();
            arg2.field804 = var24 >> 16;
            arg2.field844 = (var24 & 0xFFFF) + client.field333;
            arg2.field841 = 0;
            arg2.field842 = 0;
            if (arg2.field844 > client.field333) {
                arg2.field841 = -1;
            }
            if (arg2.field837 == 65535) {
                arg2.field837 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field814 = arg0.method2309();
            arg2.field847 = arg0.method2309();
            arg2.field846 = arg0.method2309();
            arg2.field856 = arg0.method2309();
            arg2.field849 = arg0.method2310() + client.field333;
            arg2.field850 = arg0.method2310() + client.field333;
            arg2.field851 = arg0.method2310();
            if (arg2.field49) {
                arg2.field814 += arg2.field45;
                arg2.field847 += arg2.field62;
                arg2.field846 += arg2.field45;
                arg2.field856 += arg2.field62;
                arg2.field857 = 0;
            } else {
                arg2.field814 += arg2.field848[0];
                arg2.field847 += arg2.field840[0];
                arg2.field846 += arg2.field848[0];
                arg2.field856 += arg2.field840[0];
                arg2.field857 = 1;
            }
            arg2.field862 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            int var25 = arg0.method2310();
            int var26 = arg0.method2334();
            arg2.method706(var25, var26, client.field333);
            arg2.field859 = client.field333 + 300;
            arg2.field827 = arg0.method2334();
            arg2.field845 = arg0.method2334();
        }
        if ((arg3 & 0x400) != 0) {
            field740[arg1] = arg0.method2309();
        }
        if ((arg3 & 0x2000) != 0) {
            var4 = arg0.method2309();
        }
        if ((arg3 & 0x1000) != 0) {
            for (int var27 = 0; var27 < 3; var27++) {
                arg2.field41[var27] = arg0.method2316();
            }
        }
        if (!arg2.field49) {
            return;
        }
        if (var4 == 127) {
            arg2.method30(arg2.field45, arg2.field62);
            return;
        }
        byte var28;
        if (var4 == -1) {
            var28 = field740[arg1];
        } else {
            var28 = var4;
        }
        arg2.method12(arg2.field45, arg2.field62, var28);
    }

    @ObfuscatedName("ag.s(B)V")
    public static void method625() {
        field742 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field737[var0] = null;
            field740[var0] = 1;
        }
    }
}
