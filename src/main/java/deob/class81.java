package deob;

import java.net.URL;

@ObfuscatedName("cw")
public class class81 {

    @ObfuscatedName("cw.r")
    public static int field1310 = 0;

    @ObfuscatedName("cw.v")
    public static int field1311 = 0;

    @ObfuscatedName("cw.y")
    public static int[] field1319 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cw.j")
    public static int[] field1313 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cw.e")
    public int field1315;

    @ObfuscatedName("cw.o")
    public int field1316;

    @ObfuscatedName("cw.z")
    public int field1317;

    @ObfuscatedName("cw.l")
    public String field1318;

    @ObfuscatedName("cw.c")
    public String field1325;

    @ObfuscatedName("cw.m")
    public int field1320;

    @ObfuscatedName("cw.b")
    public int field1321;

    @ObfuscatedName("w.i(I)Z")
    public static boolean method5() {
        try {
            if (Statics.field1312 == null) {
                Statics.field1312 = new class78(Statics.field721, new URL(Statics.field444));
            } else {
                byte[] var0 = Statics.field1312.method1401();
                if (var0 != null) {
                    class174 var1 = new class174(var0);
                    field1310 = var1.method2882();
                    Statics.field1309 = new class81[field1310];
                    int var2 = 0;
                    while (var2 < field1310) {
                        class81 var3 = Statics.field1309[var2] = new class81();
                        var3.field1315 = var1.method2882();
                        var3.field1316 = var1.method2885();
                        var3.field1318 = var1.method2884();
                        var3.field1325 = var1.method2884();
                        var3.field1320 = var1.method3061();
                        var3.field1317 = var1.method3013();
                        var3.field1321 = var2++;
                    }
                    method42(Statics.field1309, 0, Statics.field1309.length - 1, field1313, field1319);
                    Statics.field1312 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1312 = null;
        }
        return false;
    }

    @ObfuscatedName("cr.w(III)V")
    public static void method1616(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1313[var5] != arg0) {
                var2[var4] = field1313[var5];
                var3[var4] = field1319[var5];
                var4++;
            }
        }
        field1313 = var2;
        field1319 = var3;
        method42(Statics.field1309, 0, Statics.field1309.length - 1, field1313, field1319);
    }

    @ObfuscatedName("k.a([Lcw;II[I[II)V")
    public static void method42(class81[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1321;
                        var12 = var8.field1321;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1317;
                        var12 = var8.field1317;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1433() ? 1 : 0;
                        var12 = var8.method1433() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1315;
                        var12 = var8.field1315;
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
                        var15 = arg0[var5].field1321;
                        var16 = var8.field1321;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1317;
                        var16 = var8.field1317;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1433() ? 1 : 0;
                        var16 = var8.method1433() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1315;
                        var16 = var8.field1315;
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
        method42(arg0, arg1, var6, arg3, arg4);
        method42(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("b.t(IIIZIZS)V")
    public static void method104(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field1309[var6];
        Statics.field1309[var6] = Statics.field1309[arg1];
        Statics.field1309[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method3997(Statics.field1309[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class81 var10 = Statics.field1309[var9];
                Statics.field1309[var9] = Statics.field1309[var7];
                Statics.field1309[var7++] = var10;
            }
        }
        Statics.field1309[arg1] = Statics.field1309[var7];
        Statics.field1309[var7] = var8;
        method104(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method104(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ir.s(Lcw;Lcw;IZIZI)I")
    public static int method3997(class81 arg0, class81 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method2649(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method2649(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ey.r(Lcw;Lcw;IZI)I")
    public static int method2649(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1317;
            int var5 = arg1.field1317;
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
            return arg0.field1320 - arg1.field1320;
        } else if (arg2 == 3) {
            if (arg0.field1325.equals("-")) {
                if (arg1.field1325.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1325.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1325.compareTo(arg1.field1325);
            }
        } else if (arg2 == 4) {
            return arg0.method1436() ? (arg1.method1436() ? 0 : 1) : (arg1.method1436() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1434() ? (arg1.method1434() ? 0 : 1) : (arg1.method1434() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1432() ? (arg1.method1432() ? 0 : 1) : (arg1.method1432() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1433() ? (arg1.method1433() ? 0 : 1) : (arg1.method1433() ? -1 : 0);
        } else {
            return arg0.field1315 - arg1.field1315;
        }
    }

    @ObfuscatedName("cl.v(I)Lcw;")
    public static class81 method1482() {
        field1311 = 0;
        return method1423();
    }

    @ObfuscatedName("cd.y(B)Lcw;")
    public static class81 method1423() {
        return field1311 < field1310 ? Statics.field1309[++field1311 - 1] : null;
    }

    @ObfuscatedName("cw.j(I)Z")
    public boolean method1433() {
        return (0x1 & this.field1316) != 0;
    }

    @ObfuscatedName("cw.k(I)Z")
    public boolean method1434() {
        return (0x2 & this.field1316) != 0;
    }

    @ObfuscatedName("cw.e(B)Z")
    public boolean method1432() {
        return (0x4 & this.field1316) != 0;
    }

    @ObfuscatedName("cw.o(B)Z")
    public boolean method1436() {
        return (0x8 & this.field1316) != 0;
    }

    @ObfuscatedName("cw.z(I)Z")
    public boolean method1444() {
        return (0x20000000 & this.field1316) != 0;
    }

    @ObfuscatedName("cw.l(I)Z")
    public boolean method1438() {
        return (0x2000000 & this.field1316) != 0;
    }
}
