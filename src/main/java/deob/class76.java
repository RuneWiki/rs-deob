package deob;

import java.net.URL;

@ObfuscatedName("bk")
public class class76 {

    @ObfuscatedName("bk.o")
    public static int field910 = 0;

    @ObfuscatedName("bk.m")
    public static int field909 = 0;

    @ObfuscatedName("bk.r")
    public static int[] field914 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bk.h")
    public static int[] field911 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bk.z")
    public int field913;

    @ObfuscatedName("bk.b")
    public int field916;

    @ObfuscatedName("bk.i")
    public int field906;

    @ObfuscatedName("bk.k")
    public String field917;

    @ObfuscatedName("bk.g")
    public String field908;

    @ObfuscatedName("bk.t")
    public int field918;

    @ObfuscatedName("bk.x")
    public int field919;

    @ObfuscatedName("gy.f(B)Z")
    public static boolean method3794() {
        try {
            if (Statics.field912 == null) {
                Statics.field912 = Statics.field3561.method2224(new URL(Statics.field1937));
            } else if (Statics.field912.method2239()) {
                byte[] var0 = Statics.field912.method2234();
                class384 var1 = new class384(var0);
                var1.method5965();
                field910 = var1.method5899();
                Statics.field907 = new class76[field910];
                int var2 = 0;
                while (var2 < field910) {
                    class76 var3 = Statics.field907[var2] = new class76();
                    var3.field913 = var1.method5899();
                    var3.field916 = var1.method5965();
                    var3.field917 = var1.method5906();
                    var3.field908 = var1.method5906();
                    var3.field918 = var1.method5902();
                    var3.field906 = var1.method6109();
                    var3.field919 = var2++;
                }
                method2361(Statics.field907, 0, Statics.field907.length - 1, field911, field914);
                Statics.field912 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field912 = null;
        }
        return false;
    }

    @ObfuscatedName("bk.e(III)V")
    public static void method1545(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field911[var5] != arg0) {
                var2[var4] = field911[var5];
                var3[var4] = field914[var5];
                var4++;
            }
        }
        field911 = var2;
        field914 = var3;
        method2361(Statics.field907, 0, Statics.field907.length - 1, field911, field914);
    }

    @ObfuscatedName("ej.v([Lbk;II[I[IB)V")
    public static void method2361(class76[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class76 var8 = arg0[var7];
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
                        var11 = arg0[var6].field919;
                        var12 = var8.field919;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field906;
                        var12 = var8.field906;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1530() ? 1 : 0;
                        var12 = var8.method1530() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field913;
                        var12 = var8.field913;
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
                        var15 = arg0[var5].field919;
                        var16 = var8.field919;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field906;
                        var16 = var8.field906;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1530() ? 1 : 0;
                        var16 = var8.method1530() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field913;
                        var16 = var8.field913;
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
                class76 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2361(arg0, arg1, var6, arg3, arg4);
        method2361(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("fj.y(IZIZI)V")
    public static void method3288(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field907 != null) {
            method248(0, Statics.field907.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("aq.j(IIIZIZI)V")
    public static void method248(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class76 var8 = Statics.field907[var6];
        Statics.field907[var6] = Statics.field907[arg1];
        Statics.field907[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method998(Statics.field907[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class76 var10 = Statics.field907[var9];
                Statics.field907[var9] = Statics.field907[var7];
                Statics.field907[var7++] = var10;
            }
        }
        Statics.field907[arg1] = Statics.field907[var7];
        Statics.field907[var7] = var8;
        method248(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method248(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bn.o(Lbk;Lbk;IZIZB)I")
    public static int method998(class76 arg0, class76 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method3315(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method3315(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("fh.m(Lbk;Lbk;IZI)I")
    public static int method3315(class76 arg0, class76 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field906;
            int var5 = arg1.field906;
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
            return arg0.field918 - arg1.field918;
        } else if (arg2 == 3) {
            if (arg0.field908.equals("-")) {
                if (arg1.field908.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field908.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field908.compareTo(arg1.field908);
            }
        } else if (arg2 == 4) {
            return arg0.method1500() ? (arg1.method1500() ? 0 : 1) : (arg1.method1500() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1492() ? (arg1.method1492() ? 0 : 1) : (arg1.method1492() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1493() ? (arg1.method1493() ? 0 : 1) : (arg1.method1493() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1530() ? (arg1.method1530() ? 0 : 1) : (arg1.method1530() ? -1 : 0);
        } else {
            return arg0.field913 - arg1.field913;
        }
    }

    @ObfuscatedName("al.r(B)Lbk;")
    public static class76 method324() {
        field909 = 0;
        return method1097();
    }

    @ObfuscatedName("client.h(B)Lbk;")
    public static class76 method1097() {
        return field909 < field910 ? Statics.field907[++field909 - 1] : null;
    }

    @ObfuscatedName("bk.d(I)Z")
    public boolean method1530() {
        return (0x1 & this.field916) != 0;
    }

    @ObfuscatedName("bk.z(I)Z")
    public boolean method1492() {
        return (0x2 & this.field916) != 0;
    }

    @ObfuscatedName("bk.b(I)Z")
    public boolean method1493() {
        return (0x4 & this.field916) != 0;
    }

    @ObfuscatedName("bk.i(I)Z")
    public boolean method1500() {
        return (0x8 & this.field916) != 0;
    }

    @ObfuscatedName("bk.k(I)Z")
    public boolean method1519() {
        return (0x20000000 & this.field916) != 0;
    }

    @ObfuscatedName("bk.g(I)Z")
    public boolean method1532() {
        return (0x2000000 & this.field916) != 0;
    }

    @ObfuscatedName("bk.t(S)Z")
    public boolean method1521() {
        return (0x40000000 & this.field916) != 0;
    }
}
