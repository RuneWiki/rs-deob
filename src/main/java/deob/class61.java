package deob;

import java.net.URL;

@ObfuscatedName("bi")
public class class61 {

    @ObfuscatedName("bi.o")
    public static int field801 = 0;

    @ObfuscatedName("bi.i")
    public static int field792 = 0;

    @ObfuscatedName("bi.w")
    public static int[] field793 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bi.v")
    public static int[] field794 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bi.y")
    public int field795;

    @ObfuscatedName("bi.u")
    public int field796;

    @ObfuscatedName("bi.h")
    public int field797;

    @ObfuscatedName("bi.q")
    public String field798;

    @ObfuscatedName("bi.x")
    public String field799;

    @ObfuscatedName("bi.p")
    public int field800;

    @ObfuscatedName("bi.n")
    public int field789;

    @ObfuscatedName("i.c(B)Z")
    public static boolean method40() {
        try {
            if (Statics.field2773 == null) {
                Statics.field2773 = Statics.field24.method2287(new URL(Statics.field2547));
            } else if (Statics.field2773.method2299()) {
                byte[] var0 = Statics.field2773.method2307();
                class421 var1 = new class421(var0);
                var1.method6669();
                field801 = var1.method6666();
                Statics.field246 = new class61[field801];
                int var2 = 0;
                while (var2 < field801) {
                    class61 var3 = Statics.field246[var2] = new class61();
                    var3.field795 = var1.method6666();
                    var3.field796 = var1.method6669();
                    var3.field798 = var1.method6674();
                    var3.field799 = var1.method6674();
                    var3.field800 = var1.method6686();
                    var3.field797 = var1.method6830();
                    var3.field789 = var2++;
                }
                method2200(Statics.field246, 0, Statics.field246.length - 1, field794, field793);
                Statics.field2773 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2773 = null;
        }
        return false;
    }

    @ObfuscatedName("bd.l(III)V")
    public static void method1019(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field794[var5] != arg0) {
                var2[var4] = field794[var5];
                var3[var4] = field793[var5];
                var4++;
            }
        }
        field794 = var2;
        field793 = var3;
        method2200(Statics.field246, 0, Statics.field246.length - 1, field794, field793);
    }

    @ObfuscatedName("ci.s([Lbi;II[I[IB)V")
    public static void method2200(class61[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class61 var8 = arg0[var7];
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
                        var11 = arg0[var6].field789;
                        var12 = var8.field789;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field797;
                        var12 = var8.field797;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1542() ? 1 : 0;
                        var12 = var8.method1542() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field795;
                        var12 = var8.field795;
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
                        var15 = arg0[var5].field789;
                        var16 = var8.field789;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field797;
                        var16 = var8.field797;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1542() ? 1 : 0;
                        var16 = var8.method1542() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field795;
                        var16 = var8.field795;
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
                class61 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2200(arg0, arg1, var6, arg3, arg4);
        method2200(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("hg.r(IIIZIZI)V")
    public static void method3947(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class61 var8 = Statics.field246[var6];
        Statics.field246[var6] = Statics.field246[arg1];
        Statics.field246[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class61 var10 = Statics.field246[var9];
            int var11 = method2106(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method2106(var10, var8, arg4, arg5);
                    if (arg5) {
                        var12 = -var13;
                    } else {
                        var12 = var13;
                    }
                }
            } else if (arg3) {
                var12 = -var11;
            } else {
                var12 = var11;
            }
            if (var12 <= 0) {
                class61 var14 = Statics.field246[var9];
                Statics.field246[var9] = Statics.field246[var7];
                Statics.field246[var7++] = var14;
            }
        }
        Statics.field246[arg1] = Statics.field246[var7];
        Statics.field246[var7] = var8;
        method3947(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3947(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cc.o(Lbi;Lbi;IZB)I")
    public static int method2106(class61 arg0, class61 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field797;
            int var5 = arg1.field797;
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
            return arg0.field800 - arg1.field800;
        } else if (arg2 == 3) {
            if (arg0.field799.equals("-")) {
                if (arg1.field799.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field799.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field799.compareTo(arg1.field799);
            }
        } else if (arg2 == 4) {
            return arg0.method1569() ? (arg1.method1569() ? 0 : 1) : (arg1.method1569() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1556() ? (arg1.method1556() ? 0 : 1) : (arg1.method1556() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1565() ? (arg1.method1565() ? 0 : 1) : (arg1.method1565() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1542() ? (arg1.method1542() ? 0 : 1) : (arg1.method1542() ? -1 : 0);
        } else {
            return arg0.field795 - arg1.field795;
        }
    }

    @ObfuscatedName("jj.i(B)Lbi;")
    public static class61 method4729() {
        field792 = 0;
        return method2480();
    }

    @ObfuscatedName("di.w(S)Lbi;")
    public static class61 method2480() {
        return field792 < field801 ? Statics.field246[++field792 - 1] : null;
    }

    @ObfuscatedName("bi.v(B)Z")
    public boolean method1542() {
        return (0x1 & this.field796) != 0;
    }

    @ObfuscatedName("bi.a(I)Z")
    public boolean method1556() {
        return (0x2 & this.field796) != 0;
    }

    @ObfuscatedName("bi.y(B)Z")
    public boolean method1565() {
        return (0x4 & this.field796) != 0;
    }

    @ObfuscatedName("bi.u(B)Z")
    public boolean method1569() {
        return (0x8 & this.field796) != 0;
    }

    @ObfuscatedName("bi.h(I)Z")
    public boolean method1544() {
        return (0x20000000 & this.field796) != 0;
    }

    @ObfuscatedName("bi.q(I)Z")
    public boolean method1572() {
        return (0x2000000 & this.field796) != 0;
    }

    @ObfuscatedName("bi.x(B)Z")
    public boolean method1547() {
        return (0x40000000 & this.field796) != 0;
    }
}
