package deob;

import java.net.URL;

@ObfuscatedName("bg")
public class class72 {

    @ObfuscatedName("bg.g")
    public static int field1006 = 0;

    @ObfuscatedName("bg.d")
    public static int field1010 = 0;

    @ObfuscatedName("bg.l")
    public static int[] field1011 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bg.j")
    public static int[] field1012 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bg.p")
    public int field1014;

    @ObfuscatedName("bg.h")
    public int field1017;

    @ObfuscatedName("bg.v")
    public int field1016;

    @ObfuscatedName("bg.n")
    public String field1020;

    @ObfuscatedName("bg.x")
    public String field1009;

    @ObfuscatedName("bg.w")
    public int field1019;

    @ObfuscatedName("bg.k")
    public int field1018;

    @ObfuscatedName("ex.c(I)Z")
    public static boolean method3170() {
        try {
            if (Statics.field1013 == null) {
                Statics.field1013 = Statics.field114.method3086(new URL(Statics.field3308));
            } else if (Statics.field1013.method3091()) {
                byte[] var0 = Statics.field1013.method3092();
                class301 var1 = new class301(var0);
                var1.method5134();
                field1006 = var1.method5124();
                Statics.field1313 = new class72[field1006];
                int var2 = 0;
                while (var2 < field1006) {
                    class72 var3 = Statics.field1313[var2] = new class72();
                    var3.field1014 = var1.method5124();
                    var3.field1017 = var1.method5134();
                    var3.field1020 = var1.method5138();
                    var3.field1009 = var1.method5138();
                    var3.field1019 = var1.method5129();
                    var3.field1016 = var1.method5132();
                    var3.field1018 = var2++;
                }
                method1880(Statics.field1313, 0, Statics.field1313.length - 1, field1012, field1011);
                Statics.field1013 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1013 = null;
        }
        return false;
    }

    @ObfuscatedName("dw.t(III)V")
    public static void method2317(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1012[var5] != arg0) {
                var2[var4] = field1012[var5];
                var3[var4] = field1011[var5];
                var4++;
            }
        }
        field1012 = var2;
        field1011 = var3;
        method1880(Statics.field1313, 0, Statics.field1313.length - 1, field1012, field1011);
    }

    @ObfuscatedName("bo.o([Lbg;II[I[IB)V")
    public static void method1880(class72[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class72 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1018;
                        var12 = var8.field1018;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1016;
                        var12 = var8.field1016;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1595() ? 1 : 0;
                        var12 = var8.method1595() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1014;
                        var12 = var8.field1014;
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
                        var15 = arg0[var5].field1018;
                        var16 = var8.field1018;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1016;
                        var16 = var8.field1016;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1595() ? 1 : 0;
                        var16 = var8.method1595() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1014;
                        var16 = var8.field1014;
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
                class72 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1880(arg0, arg1, var6, arg3, arg4);
        method1880(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("u.e(IZIZB)V")
    public static void method283(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1313 != null) {
            method1042(0, Statics.field1313.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("be.i(IIIZIZI)V")
    public static void method1042(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class72 var8 = Statics.field1313[var6];
        Statics.field1313[var6] = Statics.field1313[arg1];
        Statics.field1313[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method13(Statics.field1313[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class72 var10 = Statics.field1313[var9];
                Statics.field1313[var9] = Statics.field1313[var7];
                Statics.field1313[var7++] = var10;
            }
        }
        Statics.field1313[arg1] = Statics.field1313[var7];
        Statics.field1313[var7] = var8;
        method1042(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1042(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("t.g(Lbg;Lbg;IZIZI)I")
    public static int method13(class72 arg0, class72 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method931(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method931(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("bc.d(Lbg;Lbg;IZB)I")
    public static int method931(class72 arg0, class72 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1016;
            int var5 = arg1.field1016;
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
            return arg0.field1019 - arg1.field1019;
        } else if (arg2 == 3) {
            if (arg0.field1009.equals("-")) {
                if (arg1.field1009.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1009.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1009.compareTo(arg1.field1009);
            }
        } else if (arg2 == 4) {
            return arg0.method1617() ? (arg1.method1617() ? 0 : 1) : (arg1.method1617() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1590() ? (arg1.method1590() ? 0 : 1) : (arg1.method1590() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1593() ? (arg1.method1593() ? 0 : 1) : (arg1.method1593() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1595() ? (arg1.method1595() ? 0 : 1) : (arg1.method1595() ? -1 : 0);
        } else {
            return arg0.field1014 - arg1.field1014;
        }
    }

    @ObfuscatedName("as.l(I)Lbg;")
    public static class72 method533() {
        field1010 = 0;
        return method5471();
    }

    @ObfuscatedName("kn.j(I)Lbg;")
    public static class72 method5471() {
        return field1010 < field1006 ? Statics.field1313[++field1010 - 1] : null;
    }

    @ObfuscatedName("bg.m(B)Z")
    public boolean method1595() {
        return (0x1 & this.field1017) != 0;
    }

    @ObfuscatedName("bg.p(B)Z")
    public boolean method1590() {
        return (0x2 & this.field1017) != 0;
    }

    @ObfuscatedName("bg.h(I)Z")
    public boolean method1593() {
        return (0x4 & this.field1017) != 0;
    }

    @ObfuscatedName("bg.v(I)Z")
    public boolean method1617() {
        return (0x8 & this.field1017) != 0;
    }

    @ObfuscatedName("bg.n(B)Z")
    public boolean method1615() {
        return (0x20000000 & this.field1017) != 0;
    }

    @ObfuscatedName("bg.x(I)Z")
    public boolean method1596() {
        return (0x2000000 & this.field1017) != 0;
    }

    @ObfuscatedName("bg.w(I)Z")
    public boolean method1597() {
        return (0x40000000 & this.field1017) != 0;
    }
}
