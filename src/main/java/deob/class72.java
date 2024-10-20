package deob;

import java.net.URL;

@ObfuscatedName("bl")
public class class72 {

    @ObfuscatedName("bl.a")
    public static int field1004 = 0;

    @ObfuscatedName("bl.c")
    public static int field998 = 0;

    @ObfuscatedName("bl.z")
    public static int[] field999 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bl.j")
    public static int[] field1000 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bl.t")
    public int field1001;

    @ObfuscatedName("bl.f")
    public int field1002;

    @ObfuscatedName("bl.i")
    public int field1003;

    @ObfuscatedName("bl.m")
    public String field993;

    @ObfuscatedName("bl.v")
    public String field1005;

    @ObfuscatedName("bl.r")
    public int field1006;

    @ObfuscatedName("bl.x")
    public int field996;

    @ObfuscatedName("ff.n(I)Z")
    public static boolean method3401() {
        try {
            if (Statics.field1417 == null) {
                Statics.field1417 = Statics.field1853.method3086(new URL(Statics.field217));
            } else if (Statics.field1417.method3097()) {
                byte[] var0 = Statics.field1417.method3102();
                class190 var1 = new class190(var0);
                var1.method3562();
                field1004 = var1.method3513();
                Statics.field997 = new class72[field1004];
                int var2 = 0;
                while (var2 < field1004) {
                    class72 var3 = Statics.field997[var2] = new class72();
                    var3.field1001 = var1.method3513();
                    var3.field1002 = var1.method3562();
                    var3.field993 = var1.method3520();
                    var3.field1005 = var1.method3520();
                    var3.field1006 = var1.method3511();
                    var3.field1003 = var1.method3514();
                    var3.field996 = var2++;
                }
                method80(Statics.field997, 0, Statics.field997.length - 1, field1000, field999);
                Statics.field1417 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1417 = null;
        }
        return false;
    }

    @ObfuscatedName("eo.h(III)V")
    public static void method3121(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1000[var5] != arg0) {
                var2[var4] = field1000[var5];
                var3[var4] = field999[var5];
                var4++;
            }
        }
        field1000 = var2;
        field999 = var3;
        method80(Statics.field997, 0, Statics.field997.length - 1, field1000, field999);
    }

    @ObfuscatedName("j.l([Lbl;II[I[IB)V")
    public static void method80(class72[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field996;
                        var12 = var8.field996;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1003;
                        var12 = var8.field1003;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1621() ? 1 : 0;
                        var12 = var8.method1621() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1001;
                        var12 = var8.field1001;
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
                        var15 = arg0[var5].field996;
                        var16 = var8.field996;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1003;
                        var16 = var8.field1003;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1621() ? 1 : 0;
                        var16 = var8.method1621() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1001;
                        var16 = var8.field1001;
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
        method80(arg0, arg1, var6, arg3, arg4);
        method80(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("fw.g(IZIZI)V")
    public static void method3383(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field997 != null) {
            method1228(0, Statics.field997.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("client.b(IIIZIZI)V")
    public static void method1228(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class72 var8 = Statics.field997[var6];
        Statics.field997[var6] = Statics.field997[arg1];
        Statics.field997[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class72 var10 = Statics.field997[var9];
            int var11 = method4651(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method4651(var10, var8, arg4, arg5);
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
                class72 var14 = Statics.field997[var9];
                Statics.field997[var9] = Statics.field997[var7];
                Statics.field997[var7++] = var14;
            }
        }
        Statics.field997[arg1] = Statics.field997[var7];
        Statics.field997[var7] = var8;
        method1228(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1228(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("jb.a(Lbl;Lbl;IZI)I")
    public static int method4651(class72 arg0, class72 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1003;
            int var5 = arg1.field1003;
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
            return arg0.field1006 - arg1.field1006;
        } else if (arg2 == 3) {
            if (arg0.field1005.equals("-")) {
                if (arg1.field1005.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1005.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1005.compareTo(arg1.field1005);
            }
        } else if (arg2 == 4) {
            return arg0.method1604() ? (arg1.method1604() ? 0 : 1) : (arg1.method1604() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1617() ? (arg1.method1617() ? 0 : 1) : (arg1.method1617() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1602() ? (arg1.method1602() ? 0 : 1) : (arg1.method1602() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1621() ? (arg1.method1621() ? 0 : 1) : (arg1.method1621() ? -1 : 0);
        } else {
            return arg0.field1001 - arg1.field1001;
        }
    }

    @ObfuscatedName("cn.c(I)Lbl;")
    public static class72 method2035() {
        field998 = 0;
        return method134();
    }

    @ObfuscatedName("f.z(I)Lbl;")
    public static class72 method134() {
        return field998 < field1004 ? Statics.field997[++field998 - 1] : null;
    }

    @ObfuscatedName("bl.j(I)Z")
    public boolean method1621() {
        return (0x1 & this.field1002) != 0;
    }

    @ObfuscatedName("bl.d(B)Z")
    public boolean method1617() {
        return (0x2 & this.field1002) != 0;
    }

    @ObfuscatedName("bl.i(I)Z")
    public boolean method1602() {
        return (0x4 & this.field1002) != 0;
    }

    @ObfuscatedName("bl.m(B)Z")
    public boolean method1604() {
        return (0x8 & this.field1002) != 0;
    }

    @ObfuscatedName("bl.v(I)Z")
    public boolean method1603() {
        return (0x20000000 & this.field1002) != 0;
    }

    @ObfuscatedName("bl.r(I)Z")
    public boolean method1601() {
        return (0x2000000 & this.field1002) != 0;
    }
}
