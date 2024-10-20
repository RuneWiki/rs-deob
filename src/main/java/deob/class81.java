package deob;

import java.net.URL;

@ObfuscatedName("cf")
public class class81 {

    @ObfuscatedName("cf.q")
    public static int field1046 = 0;

    @ObfuscatedName("cf.k")
    public static int field1047 = 0;

    @ObfuscatedName("cf.c")
    public static int[] field1048 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cf.u")
    public static int[] field1050 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cf.e")
    public int field1049;

    @ObfuscatedName("cf.o")
    public int field1051;

    @ObfuscatedName("cf.n")
    public int field1053;

    @ObfuscatedName("cf.x")
    public String field1055;

    @ObfuscatedName("cf.p")
    public String field1054;

    @ObfuscatedName("cf.r")
    public int field1044;

    @ObfuscatedName("cf.y")
    public int field1056;

    @ObfuscatedName("ey.f(B)Z")
    public static boolean method3130() {
        try {
            if (Statics.field3214 == null) {
                Statics.field3214 = Statics.field402.method3134(new URL(Statics.field1437));
            } else if (Statics.field3214.method3148()) {
                byte[] var0 = Statics.field3214.method3149();
                class311 var1 = new class311(var0);
                var1.method5330();
                field1046 = var1.method5163();
                Statics.field3829 = new class81[field1046];
                int var2 = 0;
                while (var2 < field1046) {
                    class81 var3 = Statics.field3829[var2] = new class81();
                    var3.field1049 = var1.method5163();
                    var3.field1051 = var1.method5330();
                    var3.field1055 = var1.method5189();
                    var3.field1054 = var1.method5189();
                    var3.field1044 = var1.method5276();
                    var3.field1053 = var1.method5183();
                    var3.field1056 = var2++;
                }
                method3483(Statics.field3829, 0, Statics.field3829.length - 1, field1050, field1048);
                Statics.field3214 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3214 = null;
        }
        return false;
    }

    @ObfuscatedName("cc.b(III)V")
    public static void method1813(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1050[var5] != arg0) {
                var2[var4] = field1050[var5];
                var3[var4] = field1048[var5];
                var4++;
            }
        }
        field1050 = var2;
        field1048 = var3;
        method3483(Statics.field3829, 0, Statics.field3829.length - 1, field1050, field1048);
    }

    @ObfuscatedName("gc.l([Lcf;II[I[IB)V")
    public static void method3483(class81[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1056;
                        var12 = var8.field1056;
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
                        var11 = arg0[var6].method1725() ? 1 : 0;
                        var12 = var8.method1725() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1049;
                        var12 = var8.field1049;
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
                        var15 = arg0[var5].field1056;
                        var16 = var8.field1056;
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
                        var15 = arg0[var5].method1725() ? 1 : 0;
                        var16 = var8.method1725() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1049;
                        var16 = var8.field1049;
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
        method3483(arg0, arg1, var6, arg3, arg4);
        method3483(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("cf.m(IZIZI)V")
    public static void method1731(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field3829 != null) {
            method16(0, Statics.field3829.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("b.z(IIIZIZI)V")
    public static void method16(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field3829[var6];
        Statics.field3829[var6] = Statics.field3829[arg1];
        Statics.field3829[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method342(Statics.field3829[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class81 var10 = Statics.field3829[var9];
                Statics.field3829[var9] = Statics.field3829[var7];
                Statics.field3829[var7++] = var10;
            }
        }
        Statics.field3829[arg1] = Statics.field3829[var7];
        Statics.field3829[var7] = var8;
        method16(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method16(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ay.q(Lcf;Lcf;IZIZI)I")
    public static int method342(class81 arg0, class81 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method441(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method441(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("au.k(Lcf;Lcf;IZI)I")
    public static int method441(class81 arg0, class81 arg1, int arg2, boolean arg3) {
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
            return arg0.field1044 - arg1.field1044;
        } else if (arg2 == 3) {
            if (arg0.field1054.equals("-")) {
                if (arg1.field1054.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1054.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1054.compareTo(arg1.field1054);
            }
        } else if (arg2 == 4) {
            return arg0.method1705() ? (arg1.method1705() ? 0 : 1) : (arg1.method1705() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1718() ? (arg1.method1718() ? 0 : 1) : (arg1.method1718() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1693() ? (arg1.method1693() ? 0 : 1) : (arg1.method1693() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1725() ? (arg1.method1725() ? 0 : 1) : (arg1.method1725() ? -1 : 0);
        } else {
            return arg0.field1049 - arg1.field1049;
        }
    }

    @ObfuscatedName("ec.c(I)Lcf;")
    public static class81 method3118() {
        field1047 = 0;
        return method3328();
    }

    @ObfuscatedName("fn.u(I)Lcf;")
    public static class81 method3328() {
        return field1047 < field1046 ? Statics.field3829[++field1047 - 1] : null;
    }

    @ObfuscatedName("cf.t(I)Z")
    public boolean method1725() {
        return (0x1 & this.field1051) != 0;
    }

    @ObfuscatedName("cf.e(I)Z")
    public boolean method1718() {
        return (0x2 & this.field1051) != 0;
    }

    @ObfuscatedName("cf.o(I)Z")
    public boolean method1693() {
        return (0x4 & this.field1051) != 0;
    }

    @ObfuscatedName("cf.n(I)Z")
    public boolean method1705() {
        return (0x8 & this.field1051) != 0;
    }

    @ObfuscatedName("cf.x(I)Z")
    public boolean method1695() {
        return (0x20000000 & this.field1051) != 0;
    }

    @ObfuscatedName("cf.p(B)Z")
    public boolean method1696() {
        return (0x2000000 & this.field1051) != 0;
    }

    @ObfuscatedName("cf.r(B)Z")
    public boolean method1697() {
        return (0x40000000 & this.field1051) != 0;
    }
}
