package deob;

import java.net.URL;

@ObfuscatedName("bo")
public class class61 {

    @ObfuscatedName("bo.w")
    public static int field796 = 0;

    @ObfuscatedName("bo.s")
    public static int field797 = 0;

    @ObfuscatedName("bo.q")
    public static int[] field798 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bo.m")
    public static int[] field799 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bo.j")
    public int field794;

    @ObfuscatedName("bo.v")
    public int field801;

    @ObfuscatedName("bo.h")
    public int field802;

    @ObfuscatedName("bo.t")
    public String field803;

    @ObfuscatedName("bo.u")
    public String field792;

    @ObfuscatedName("bo.d")
    public int field805;

    @ObfuscatedName("bo.b")
    public int field806;

    @ObfuscatedName("dr.c(I)Z")
    public static boolean method2651() {
        try {
            if (Statics.field2485 == null) {
                Statics.field2485 = Statics.field1337.method2554(new URL(Statics.field2880));
            } else if (Statics.field2485.method2596()) {
                byte[] var0 = Statics.field2485.method2589();
                class445 var1 = new class445(var0);
                var1.method7201();
                field796 = var1.method7198();
                Statics.field795 = new class61[field796];
                int var2 = 0;
                while (var2 < field796) {
                    class61 var3 = Statics.field795[var2] = new class61();
                    var3.field794 = var1.method7198();
                    var3.field801 = var1.method7201();
                    var3.field803 = var1.method7206();
                    var3.field792 = var1.method7206();
                    var3.field805 = var1.method7196();
                    var3.field802 = var1.method7199();
                    var3.field806 = var2++;
                }
                method2225(Statics.field795, 0, Statics.field795.length - 1, field799, field798);
                Statics.field2485 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2485 = null;
        }
        return false;
    }

    @ObfuscatedName("ps.p(III)V")
    public static void method7063(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field799[var5] != arg0) {
                var2[var4] = field799[var5];
                var3[var4] = field798[var5];
                var4++;
            }
        }
        field799 = var2;
        field798 = var3;
        method2225(Statics.field795, 0, Statics.field795.length - 1, field799, field798);
    }

    @ObfuscatedName("cw.f([Lbo;II[I[II)V")
    public static void method2225(class61[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field806;
                        var12 = var8.field806;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field802;
                        var12 = var8.field802;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1676() ? 1 : 0;
                        var12 = var8.method1676() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field794;
                        var12 = var8.field794;
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
                        var15 = arg0[var5].field806;
                        var16 = var8.field806;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field802;
                        var16 = var8.field802;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1676() ? 1 : 0;
                        var16 = var8.method1676() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field794;
                        var16 = var8.field794;
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
        method2225(arg0, arg1, var6, arg3, arg4);
        method2225(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("en.n(IZIZI)V")
    public static void method2947(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field795 != null) {
            method2968(0, Statics.field795.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("er.k(IIIZIZI)V")
    public static void method2968(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class61 var8 = Statics.field795[var6];
        Statics.field795[var6] = Statics.field795[arg1];
        Statics.field795[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method3216(Statics.field795[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class61 var10 = Statics.field795[var9];
                Statics.field795[var9] = Statics.field795[var7];
                Statics.field795[var7++] = var10;
            }
        }
        Statics.field795[arg1] = Statics.field795[var7];
        Statics.field795[var7] = var8;
        method2968(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2968(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("fa.w(Lbo;Lbo;IZIZI)I")
    public static int method3216(class61 arg0, class61 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method5346(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method5346(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("kf.s(Lbo;Lbo;IZB)I")
    public static int method5346(class61 arg0, class61 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field802;
            int var5 = arg1.field802;
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
            return arg0.field805 - arg1.field805;
        } else if (arg2 == 3) {
            if (arg0.field792.equals("-")) {
                if (arg1.field792.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field792.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field792.compareTo(arg1.field792);
            }
        } else if (arg2 == 4) {
            return arg0.method1642() ? (arg1.method1642() ? 0 : 1) : (arg1.method1642() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1640() ? (arg1.method1640() ? 0 : 1) : (arg1.method1640() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1641() ? (arg1.method1641() ? 0 : 1) : (arg1.method1641() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1676() ? (arg1.method1676() ? 0 : 1) : (arg1.method1676() ? -1 : 0);
        } else {
            return arg0.field794 - arg1.field794;
        }
    }

    @ObfuscatedName("ef.q(B)Lbo;")
    public static class61 method2962() {
        field797 = 0;
        return method5520();
    }

    @ObfuscatedName("lh.m(I)Lbo;")
    public static class61 method5520() {
        return field797 < field796 ? Statics.field795[++field797 - 1] : null;
    }

    @ObfuscatedName("bo.x(B)Z")
    public boolean method1676() {
        return (0x1 & this.field801) != 0;
    }

    @ObfuscatedName("bo.j(I)Z")
    public boolean method1640() {
        return (0x2 & this.field801) != 0;
    }

    @ObfuscatedName("bo.v(I)Z")
    public boolean method1641() {
        return (0x4 & this.field801) != 0;
    }

    @ObfuscatedName("bo.h(B)Z")
    public boolean method1642() {
        return (0x8 & this.field801) != 0;
    }

    @ObfuscatedName("bo.t(I)Z")
    public boolean method1681() {
        return (0x20000000 & this.field801) != 0;
    }

    @ObfuscatedName("bo.u(I)Z")
    public boolean method1644() {
        return (0x2000000 & this.field801) != 0;
    }

    @ObfuscatedName("bo.d(I)Z")
    public boolean method1650() {
        return (0x40000000 & this.field801) != 0;
    }

    @ObfuscatedName("bo.b(B)Z")
    public boolean method1646() {
        return (0x100 & this.field801) != 0;
    }

    @ObfuscatedName("bo.a(I)Z")
    public boolean method1688() {
        return (0x8000000 & this.field801) != 0;
    }
}
