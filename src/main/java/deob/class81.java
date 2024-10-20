package deob;

import java.net.URL;

@ObfuscatedName("ct")
public class class81 {

    @ObfuscatedName("ct.o")
    public static int field1057 = 0;

    @ObfuscatedName("ct.x")
    public static int field1048 = 0;

    @ObfuscatedName("ct.w")
    public static int[] field1050 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ct.g")
    public static int[] field1049 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ct.n")
    public int field1044;

    @ObfuscatedName("ct.d")
    public int field1052;

    @ObfuscatedName("ct.h")
    public int field1053;

    @ObfuscatedName("ct.a")
    public String field1054;

    @ObfuscatedName("ct.q")
    public String field1055;

    @ObfuscatedName("ct.c")
    public int field1056;

    @ObfuscatedName("ct.f")
    public int field1051;

    @ObfuscatedName("ba.z(I)Z")
    public static boolean method1049() {
        try {
            if (Statics.field370 == null) {
                Statics.field370 = Statics.field2005.method3155(new URL(Statics.field3772));
            } else if (Statics.field370.method3162()) {
                byte[] var0 = Statics.field370.method3163();
                class310 var1 = new class310(var0);
                var1.method5270();
                field1057 = var1.method5195();
                Statics.field2523 = new class81[field1057];
                int var2 = 0;
                while (var2 < field1057) {
                    class81 var3 = Statics.field2523[var2] = new class81();
                    var3.field1044 = var1.method5195();
                    var3.field1052 = var1.method5270();
                    var3.field1054 = var1.method5202();
                    var3.field1055 = var1.method5202();
                    var3.field1056 = var1.method5193();
                    var3.field1053 = var1.method5196();
                    var3.field1051 = var2++;
                }
                method2730(Statics.field2523, 0, Statics.field2523.length - 1, field1049, field1050);
                Statics.field370 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field370 = null;
        }
        return false;
    }

    @ObfuscatedName("an.k(III)V")
    public static void method314(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1049[var5] != arg0) {
                var2[var4] = field1049[var5];
                var3[var4] = field1050[var5];
                var4++;
            }
        }
        field1049 = var2;
        field1050 = var3;
        method2730(Statics.field2523, 0, Statics.field2523.length - 1, field1049, field1050);
    }

    @ObfuscatedName("eu.s([Lct;II[I[II)V")
    public static void method2730(class81[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class81 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1051;
                        var12 = var8.field1051;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1053;
                        var12 = var8.field1053;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1650() ? 1 : 0;
                        var12 = var8.method1650() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1044;
                        var12 = var8.field1044;
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
                        var15 = arg0[var5].field1051;
                        var16 = var8.field1051;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1053;
                        var16 = var8.field1053;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1650() ? 1 : 0;
                        var16 = var8.method1650() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1044;
                        var16 = var8.field1044;
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
                class81 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2730(arg0, arg1, var6, arg3, arg4);
        method2730(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("em.t(IZIZB)V")
    public static void method2943(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field2523 != null) {
            method534(0, Statics.field2523.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("al.i(IIIZIZI)V")
    public static void method534(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field2523[var6];
        Statics.field2523[var6] = Statics.field2523[arg1];
        Statics.field2523[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method3134(Statics.field2523[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class81 var10 = Statics.field2523[var9];
                Statics.field2523[var9] = Statics.field2523[var7];
                Statics.field2523[var7++] = var10;
            }
        }
        Statics.field2523[arg1] = Statics.field2523[var7];
        Statics.field2523[var7] = var8;
        method534(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method534(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ej.o(Lct;Lct;IZIZB)I")
    public static int method3134(class81 arg0, class81 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method19(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method19(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("s.x(Lct;Lct;IZI)I")
    public static int method19(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1053;
            int var5 = arg1.field1053;
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
            return arg0.field1056 - arg1.field1056;
        } else if (arg2 == 3) {
            if (arg0.field1055.equals("-")) {
                if (arg1.field1055.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1055.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1055.compareTo(arg1.field1055);
            }
        } else if (arg2 == 4) {
            return arg0.method1654() ? (arg1.method1654() ? 0 : 1) : (arg1.method1654() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1652() ? (arg1.method1652() ? 0 : 1) : (arg1.method1652() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1697() ? (arg1.method1697() ? 0 : 1) : (arg1.method1697() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1650() ? (arg1.method1650() ? 0 : 1) : (arg1.method1650() ? -1 : 0);
        } else {
            return arg0.field1044 - arg1.field1044;
        }
    }

    @ObfuscatedName("df.w(I)Lct;")
    public static class81 method2411() {
        field1048 = 0;
        return method703();
    }

    @ObfuscatedName("ak.g(B)Lct;")
    public static class81 method703() {
        return field1048 < field1057 ? Statics.field2523[++field1048 - 1] : null;
    }

    @ObfuscatedName("ct.m(B)Z")
    public boolean method1650() {
        return (0x1 & this.field1052) != 0;
    }

    @ObfuscatedName("ct.n(I)Z")
    public boolean method1652() {
        return (0x2 & this.field1052) != 0;
    }

    @ObfuscatedName("ct.d(I)Z")
    public boolean method1697() {
        return (0x4 & this.field1052) != 0;
    }

    @ObfuscatedName("ct.h(I)Z")
    public boolean method1654() {
        return (0x8 & this.field1052) != 0;
    }

    @ObfuscatedName("ct.a(B)Z")
    public boolean method1687() {
        return (0x20000000 & this.field1052) != 0;
    }

    @ObfuscatedName("ct.q(I)Z")
    public boolean method1656() {
        return (0x2000000 & this.field1052) != 0;
    }

    @ObfuscatedName("ct.c(I)Z")
    public boolean method1657() {
        return (0x40000000 & this.field1052) != 0;
    }
}
