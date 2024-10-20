package deob;

import java.net.URL;

@ObfuscatedName("cg")
public class class81 {

    @ObfuscatedName("cg.i")
    public static int field1305 = 0;

    @ObfuscatedName("cg.j")
    public static int field1306 = 0;

    @ObfuscatedName("cg.m")
    public static int[] field1304 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cg.u")
    public static int[] field1308 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cg.v")
    public int field1314;

    @ObfuscatedName("cg.h")
    public int field1303;

    @ObfuscatedName("cg.a")
    public int field1310;

    @ObfuscatedName("cg.p")
    public String field1313;

    @ObfuscatedName("cg.q")
    public String field1317;

    @ObfuscatedName("cg.l")
    public int field1315;

    @ObfuscatedName("cg.c")
    public int field1316;

    @ObfuscatedName("c.w(I)Z")
    public static boolean method104() {
        try {
            if (Statics.field1312 == null) {
                Statics.field1312 = new class78(Statics.field723, new URL(Statics.field835));
            } else {
                byte[] var0 = Statics.field1312.method1384();
                if (var0 != null) {
                    class177 var1 = new class177(var0);
                    field1305 = var1.method2886();
                    Statics.field520 = new class81[field1305];
                    int var2 = 0;
                    while (var2 < field1305) {
                        class81 var3 = Statics.field520[var2] = new class81();
                        var3.field1314 = var1.method2886();
                        var3.field1303 = var1.method2904();
                        var3.field1313 = var1.method2892();
                        var3.field1317 = var1.method2892();
                        var3.field1315 = var1.method2931();
                        var3.field1310 = var1.method2887();
                        var3.field1316 = var2++;
                    }
                    method469(Statics.field520, 0, Statics.field520.length - 1, field1308, field1304);
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

    @ObfuscatedName("bk.o(III)V")
    public static void method975(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1308[var5] != arg0) {
                var2[var4] = field1308[var5];
                var3[var4] = field1304[var5];
                var4++;
            }
        }
        field1308 = var2;
        field1304 = var3;
        method469(Statics.field520, 0, Statics.field520.length - 1, field1308, field1304);
    }

    @ObfuscatedName("ae.x([Lcg;II[I[II)V")
    public static void method469(class81[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1316;
                        var12 = var8.field1316;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1310;
                        var12 = var8.field1310;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1442() ? 1 : 0;
                        var12 = var8.method1442() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1314;
                        var12 = var8.field1314;
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
                        var15 = arg0[var5].field1316;
                        var16 = var8.field1316;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1310;
                        var16 = var8.field1310;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1442() ? 1 : 0;
                        var16 = var8.method1442() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1314;
                        var16 = var8.field1314;
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
        method469(arg0, arg1, var6, arg3, arg4);
        method469(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("al.k(IZIZI)V")
    public static void method620(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field520 != null) {
            method1652(0, Statics.field520.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cp.f(IIIZIZI)V")
    public static void method1652(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field520[var6];
        Statics.field520[var6] = Statics.field520[arg1];
        Statics.field520[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class81 var10 = Statics.field520[var9];
            int var11 = method1008(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method1008(var10, var8, arg4, arg5);
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
                class81 var14 = Statics.field520[var9];
                Statics.field520[var9] = Statics.field520[var7];
                Statics.field520[var7++] = var14;
            }
        }
        Statics.field520[arg1] = Statics.field520[var7];
        Statics.field520[var7] = var8;
        method1652(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1652(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bw.i(Lcg;Lcg;IZI)I")
    public static int method1008(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1310;
            int var5 = arg1.field1310;
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
            return arg0.field1315 - arg1.field1315;
        } else if (arg2 == 3) {
            if (arg0.field1317.equals("-")) {
                if (arg1.field1317.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1317.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1317.compareTo(arg1.field1317);
            }
        } else if (arg2 == 4) {
            return arg0.method1416() ? (arg1.method1416() ? 0 : 1) : (arg1.method1416() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1409() ? (arg1.method1409() ? 0 : 1) : (arg1.method1409() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1411() ? (arg1.method1411() ? 0 : 1) : (arg1.method1411() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1442() ? (arg1.method1442() ? 0 : 1) : (arg1.method1442() ? -1 : 0);
        } else {
            return arg0.field1314 - arg1.field1314;
        }
    }

    @ObfuscatedName("bo.m(I)Lcg;")
    public static class81 method704() {
        return field1306 < field1305 ? Statics.field520[++field1306 - 1] : null;
    }

    @ObfuscatedName("cg.u(I)Z")
    public boolean method1442() {
        return (0x1 & this.field1303) != 0;
    }

    @ObfuscatedName("cg.h(I)Z")
    public boolean method1409() {
        return (0x2 & this.field1303) != 0;
    }

    @ObfuscatedName("cg.a(I)Z")
    public boolean method1411() {
        return (0x4 & this.field1303) != 0;
    }

    @ObfuscatedName("cg.p(I)Z")
    public boolean method1416() {
        return (0x8 & this.field1303) != 0;
    }

    @ObfuscatedName("cg.q(I)Z")
    public boolean method1413() {
        return (0x20000000 & this.field1303) != 0;
    }

    @ObfuscatedName("cg.l(B)Z")
    public boolean method1414() {
        return (0x2000000 & this.field1303) != 0;
    }
}
