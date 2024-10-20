package deob;

import java.net.URL;

@ObfuscatedName("bu")
public class class72 {

    @ObfuscatedName("bu.f")
    public static int field1016 = 0;

    @ObfuscatedName("bu.p")
    public static int field1012 = 0;

    @ObfuscatedName("bu.m")
    public static int[] field1017 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bu.q")
    public static int[] field1019 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bu.n")
    public int field1021;

    @ObfuscatedName("bu.e")
    public int field1022;

    @ObfuscatedName("bu.r")
    public int field1018;

    @ObfuscatedName("bu.t")
    public String field1020;

    @ObfuscatedName("bu.l")
    public String field1025;

    @ObfuscatedName("bu.o")
    public int field1026;

    @ObfuscatedName("bu.u")
    public int field1027;

    @ObfuscatedName("af.a(I)Z")
    public static boolean method375() {
        try {
            if (Statics.field1024 == null) {
                Statics.field1024 = Statics.field2474.method3086(new URL(Statics.field32));
            } else if (Statics.field1024.method3096()) {
                byte[] var0 = Statics.field1024.method3097();
                class190 var1 = new class190(var0);
                var1.method3460();
                field1016 = var1.method3610();
                Statics.field3859 = new class72[field1016];
                int var2 = 0;
                while (var2 < field1016) {
                    class72 var3 = Statics.field3859[var2] = new class72();
                    var3.field1021 = var1.method3610();
                    var3.field1022 = var1.method3460();
                    var3.field1020 = var1.method3647();
                    var3.field1025 = var1.method3647();
                    var3.field1026 = var1.method3443();
                    var3.field1018 = var1.method3458();
                    var3.field1027 = var2++;
                }
                method4285(Statics.field3859, 0, Statics.field3859.length - 1, field1019, field1017);
                Statics.field1024 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1024 = null;
        }
        return false;
    }

    @ObfuscatedName("ep.s(III)V")
    public static void method3066(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1019[var5] != arg0) {
                var2[var4] = field1019[var5];
                var3[var4] = field1017[var5];
                var4++;
            }
        }
        field1019 = var2;
        field1017 = var3;
        method4285(Statics.field3859, 0, Statics.field3859.length - 1, field1019, field1017);
    }

    @ObfuscatedName("if.g([Lbu;II[I[II)V")
    public static void method4285(class72[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1027;
                        var12 = var8.field1027;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1018;
                        var12 = var8.field1018;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1629() ? 1 : 0;
                        var12 = var8.method1629() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1021;
                        var12 = var8.field1021;
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
                        var15 = arg0[var5].field1027;
                        var16 = var8.field1027;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1018;
                        var16 = var8.field1018;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1629() ? 1 : 0;
                        var16 = var8.method1629() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1021;
                        var16 = var8.field1021;
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
        method4285(arg0, arg1, var6, arg3, arg4);
        method4285(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ef.x(IZIZI)V")
    public static void method3079(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field3859 != null) {
            method3782(0, Statics.field3859.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("gc.h(IIIZIZB)V")
    public static void method3782(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class72 var8 = Statics.field3859[var6];
        Statics.field3859[var6] = Statics.field3859[arg1];
        Statics.field3859[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method1600(Statics.field3859[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class72 var10 = Statics.field3859[var9];
                Statics.field3859[var9] = Statics.field3859[var7];
                Statics.field3859[var7++] = var10;
            }
        }
        Statics.field3859[arg1] = Statics.field3859[var7];
        Statics.field3859[var7] = var8;
        method3782(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3782(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bq.f(Lbu;Lbu;IZIZI)I")
    public static int method1600(class72 arg0, class72 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method51(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method51(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("h.p(Lbu;Lbu;IZI)I")
    public static int method51(class72 arg0, class72 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1018;
            int var5 = arg1.field1018;
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
            return arg0.field1026 - arg1.field1026;
        } else if (arg2 == 3) {
            if (arg0.field1025.equals("-")) {
                if (arg1.field1025.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1025.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1025.compareTo(arg1.field1025);
            }
        } else if (arg2 == 4) {
            return arg0.method1620() ? (arg1.method1620() ? 0 : 1) : (arg1.method1620() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1651() ? (arg1.method1651() ? 0 : 1) : (arg1.method1651() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1619() ? (arg1.method1619() ? 0 : 1) : (arg1.method1619() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1629() ? (arg1.method1629() ? 0 : 1) : (arg1.method1629() ? -1 : 0);
        } else {
            return arg0.field1021 - arg1.field1021;
        }
    }

    @ObfuscatedName("co.m(I)Lbu;")
    public static class72 method2080() {
        field1012 = 0;
        return method4583();
    }

    @ObfuscatedName("ip.q(I)Lbu;")
    public static class72 method4583() {
        return field1012 < field1016 ? Statics.field3859[++field1012 - 1] : null;
    }

    @ObfuscatedName("bu.b(I)Z")
    public boolean method1629() {
        return (0x1 & this.field1022) != 0;
    }

    @ObfuscatedName("bu.n(I)Z")
    public boolean method1651() {
        return (0x2 & this.field1022) != 0;
    }

    @ObfuscatedName("bu.e(I)Z")
    public boolean method1619() {
        return (0x4 & this.field1022) != 0;
    }

    @ObfuscatedName("bu.r(I)Z")
    public boolean method1620() {
        return (0x8 & this.field1022) != 0;
    }

    @ObfuscatedName("bu.t(I)Z")
    public boolean method1621() {
        return (0x20000000 & this.field1022) != 0;
    }

    @ObfuscatedName("bu.l(I)Z")
    public boolean method1622() {
        return (0x2000000 & this.field1022) != 0;
    }
}
