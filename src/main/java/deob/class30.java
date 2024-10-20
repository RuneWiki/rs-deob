package deob;

import java.net.URL;

@ObfuscatedName("ah")
public class class30 {

    @ObfuscatedName("ah.k")
    public static int field669 = 0;

    @ObfuscatedName("ah.j")
    public static int field674 = 0;

    @ObfuscatedName("ah.s")
    public static int[] field671 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ah.o")
    public static int[] field672 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ah.c")
    public int field665;

    @ObfuscatedName("ah.m")
    public int field675;

    @ObfuscatedName("ah.h")
    public int field680;

    @ObfuscatedName("ah.r")
    public String field676;

    @ObfuscatedName("ah.u")
    public String field668;

    @ObfuscatedName("ah.i")
    public int field678;

    @ObfuscatedName("ah.z")
    public int field670;

    @ObfuscatedName("y.p(B)Z")
    public static boolean method193() {
        try {
            if (Statics.field139 == null) {
                Statics.field139 = new class27(Statics.field900, new URL(Statics.field137));
            } else {
                byte[] var0 = Statics.field139.method579();
                if (var0 != null) {
                    class154 var1 = new class154(var0);
                    field669 = var1.method2595();
                    Statics.field53 = new class30[field669];
                    int var2 = 0;
                    while (var2 < field669) {
                        class30 var3 = Statics.field53[var2] = new class30();
                        var3.field665 = var1.method2595();
                        var3.field675 = var1.method2598();
                        var3.field676 = var1.method2625();
                        var3.field668 = var1.method2625();
                        var3.field678 = var1.method2593();
                        var3.field680 = var1.method2739();
                        var3.field670 = var2++;
                    }
                    method95(Statics.field53, 0, Statics.field53.length - 1, field672, field671);
                    Statics.field139 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field139 = null;
        }
        return false;
    }

    @ObfuscatedName("j.g(IIB)V")
    public static void method89(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field672[var5] != arg0) {
                var2[var4] = field672[var5];
                var3[var4] = field671[var5];
                var4++;
            }
        }
        field672 = var2;
        field671 = var3;
        method95(Statics.field53, 0, Statics.field53.length - 1, field672, field671);
    }

    @ObfuscatedName("j.x([Lah;II[I[II)V")
    public static void method95(class30[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class30 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field670;
                        var12 = var8.field670;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field680;
                        var12 = var8.field680;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method650() ? 1 : 0;
                        var12 = var8.method650() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field665;
                        var12 = var8.field665;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field670;
                        var16 = var8.field670;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field680;
                        var16 = var8.field680;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method650() ? 1 : 0;
                        var16 = var8.method650() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field665;
                        var16 = var8.field665;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class30 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method95(arg0, arg1, var6, arg3, arg4);
        method95(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("fe.q(IZIZI)V")
    public static void method3005(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field53 != null) {
            method251(0, Statics.field53.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("b.d(IIIZIZB)V")
    public static void method251(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class30 var8 = Statics.field53[var6];
        Statics.field53[var6] = Statics.field53[arg1];
        Statics.field53[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method1949(Statics.field53[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class30 var10 = Statics.field53[var9];
                Statics.field53[var9] = Statics.field53[var7];
                Statics.field53[var7++] = var10;
            }
        }
        Statics.field53[arg1] = Statics.field53[var7];
        Statics.field53[var7] = var8;
        method251(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method251(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("dl.k(Lah;Lah;IZIZI)I")
    public static int method1949(class30 arg0, class30 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method1909(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method1909(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("dw.j(Lah;Lah;IZI)I")
    public static int method1909(class30 arg0, class30 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field680;
            int var5 = arg1.field680;
            if (!arg3) {
                if (var4 == -1) {
                    var4 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var4 - var5;
        } else if (arg2 == 2) {
            return arg0.field678 - arg1.field678;
        } else if (arg2 == 3) {
            if (arg0.field668.equals("-")) {
                if (arg1.field668.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field668.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field668.compareTo(arg1.field668);
            }
        } else if (arg2 == 4) {
            return arg0.method610() ? (arg1.method610() ? 0 : 1) : (arg1.method610() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method608() ? (arg1.method608() ? 0 : 1) : (arg1.method608() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method626() ? (arg1.method626() ? 0 : 1) : (arg1.method626() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method650() ? (arg1.method650() ? 0 : 1) : (arg1.method650() ? -1 : 0);
        } else {
            return arg0.field665 - arg1.field665;
        }
    }

    @ObfuscatedName("en.s(I)Lah;")
    public static class30 method2326() {
        field674 = 0;
        class30 var0;
        if (field674 < field669) {
            var0 = Statics.field53[++field674 - 1];
        } else {
            var0 = null;
        }
        return var0;
    }

    @ObfuscatedName("ah.o(I)Z")
    public boolean method650() {
        return (0x1 & this.field675) != 0;
    }

    @ObfuscatedName("ah.a(I)Z")
    public boolean method608() {
        return (0x2 & this.field675) != 0;
    }

    @ObfuscatedName("ah.c(I)Z")
    public boolean method626() {
        return (0x4 & this.field675) != 0;
    }

    @ObfuscatedName("ah.u(I)Z")
    public boolean method610() {
        return (0x8 & this.field675) != 0;
    }

    @ObfuscatedName("ah.i(I)Z")
    public boolean method611() {
        return (0x20000000 & this.field675) != 0;
    }

    @ObfuscatedName("ah.z(B)Z")
    public boolean method612() {
        return (0x2000000 & this.field675) != 0;
    }
}
