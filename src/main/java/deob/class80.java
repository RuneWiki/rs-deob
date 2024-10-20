package deob;

import java.net.URL;

@ObfuscatedName("cp")
public class class80 {

    @ObfuscatedName("cp.n")
    public static int field1309 = 0;

    @ObfuscatedName("cp.q")
    public static int field1302 = 0;

    @ObfuscatedName("cp.b")
    public static int[] field1303 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cp.k")
    public static int[] field1304 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cp.d")
    public int field1300;

    @ObfuscatedName("cp.l")
    public int field1312;

    @ObfuscatedName("cp.t")
    public int field1307;

    @ObfuscatedName("cp.y")
    public String field1305;

    @ObfuscatedName("cp.v")
    public String field1297;

    @ObfuscatedName("cp.c")
    public int field1310;

    @ObfuscatedName("cp.z")
    public int field1306;

    @ObfuscatedName("bg.i(I)Z")
    public static boolean method1400() {
        try {
            if (Statics.field897 == null) {
                Statics.field897 = Statics.field265.method2730(new URL(Statics.field322));
            } else if (Statics.field897.method2738()) {
                byte[] var0 = Statics.field897.method2734();
                class175 var1 = new class175(var0);
                var1.method2998();
                field1309 = var1.method2995();
                Statics.field1301 = new class80[field1309];
                int var2 = 0;
                while (var2 < field1309) {
                    class80 var3 = Statics.field1301[var2] = new class80();
                    var3.field1300 = var1.method2995();
                    var3.field1312 = var1.method2998();
                    var3.field1305 = var1.method3002();
                    var3.field1297 = var1.method3002();
                    var3.field1310 = var1.method2999();
                    var3.field1307 = var1.method2996();
                    var3.field1306 = var2++;
                }
                method3597(Statics.field1301, 0, Statics.field1301.length - 1, field1304, field1303);
                Statics.field897 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field897 = null;
        }
        return false;
    }

    @ObfuscatedName("q.j(IIB)V")
    public static void method16(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1304[var5] != arg0) {
                var2[var4] = field1304[var5];
                var3[var4] = field1303[var5];
                var4++;
            }
        }
        field1304 = var2;
        field1303 = var3;
        method3597(Statics.field1301, 0, Statics.field1301.length - 1, field1304, field1303);
    }

    @ObfuscatedName("gy.a([Lcp;II[I[II)V")
    public static void method3597(class80[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class80 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1306;
                        var12 = var8.field1306;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1307;
                        var12 = var8.field1307;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1412() ? 1 : 0;
                        var12 = var8.method1412() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1300;
                        var12 = var8.field1300;
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
                        var15 = arg0[var5].field1306;
                        var16 = var8.field1306;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1307;
                        var16 = var8.field1307;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1412() ? 1 : 0;
                        var16 = var8.method1412() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1300;
                        var16 = var8.field1300;
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
                class80 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method3597(arg0, arg1, var6, arg3, arg4);
        method3597(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ak.r(IZIZI)V")
    public static void method646(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1301 != null) {
            method3645(0, Statics.field1301.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("hh.o(IIIZIZI)V")
    public static void method3645(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class80 var8 = Statics.field1301[var6];
        Statics.field1301[var6] = Statics.field1301[arg1];
        Statics.field1301[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method1016(Statics.field1301[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class80 var10 = Statics.field1301[var9];
                Statics.field1301[var9] = Statics.field1301[var7];
                Statics.field1301[var7++] = var10;
            }
        }
        Statics.field1301[arg1] = Statics.field1301[var7];
        Statics.field1301[var7] = var8;
        method3645(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3645(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bm.n(Lcp;Lcp;IZIZI)I")
    public static int method1016(class80 arg0, class80 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method989(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method989(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ba.q(Lcp;Lcp;IZB)I")
    public static int method989(class80 arg0, class80 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1307;
            int var5 = arg1.field1307;
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
            return arg0.field1310 - arg1.field1310;
        } else if (arg2 == 3) {
            if (arg0.field1297.equals("-")) {
                if (arg1.field1297.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1297.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1297.compareTo(arg1.field1297);
            }
        } else if (arg2 == 4) {
            return arg0.method1415() ? (arg1.method1415() ? 0 : 1) : (arg1.method1415() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1418() ? (arg1.method1418() ? 0 : 1) : (arg1.method1418() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1414() ? (arg1.method1414() ? 0 : 1) : (arg1.method1414() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1412() ? (arg1.method1412() ? 0 : 1) : (arg1.method1412() ? -1 : 0);
        } else {
            return arg0.field1300 - arg1.field1300;
        }
    }

    @ObfuscatedName("fk.b(S)Lcp;")
    public static class80 method2897() {
        return field1302 < field1309 ? Statics.field1301[++field1302 - 1] : null;
    }

    @ObfuscatedName("cp.k(I)Z")
    public boolean method1412() {
        return (0x1 & this.field1312) != 0;
    }

    @ObfuscatedName("cp.s(I)Z")
    public boolean method1418() {
        return (0x2 & this.field1312) != 0;
    }

    @ObfuscatedName("cp.d(I)Z")
    public boolean method1414() {
        return (0x4 & this.field1312) != 0;
    }

    @ObfuscatedName("cp.l(B)Z")
    public boolean method1415() {
        return (0x8 & this.field1312) != 0;
    }

    @ObfuscatedName("cp.c(I)Z")
    public boolean method1416() {
        return (0x20000000 & this.field1312) != 0;
    }

    @ObfuscatedName("cp.u(B)Z")
    public boolean method1413() {
        return (0x2000000 & this.field1312) != 0;
    }
}
