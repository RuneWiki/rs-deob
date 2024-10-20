package deob;

import java.net.URL;

@ObfuscatedName("ci")
public class class81 {

    @ObfuscatedName("ci.t")
    public static int field1299 = 0;

    @ObfuscatedName("ci.p")
    public static int field1298 = 0;

    @ObfuscatedName("ci.d")
    public static int[] field1307 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ci.n")
    public static int[] field1302 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ci.o")
    public int field1303;

    @ObfuscatedName("ci.q")
    public int field1300;

    @ObfuscatedName("ci.u")
    public int field1305;

    @ObfuscatedName("ci.k")
    public String field1311;

    @ObfuscatedName("ci.e")
    public String field1304;

    @ObfuscatedName("ci.r")
    public int field1308;

    @ObfuscatedName("ci.l")
    public int field1309;

    @ObfuscatedName("cx.s(I)Z")
    public static boolean method1641() {
        try {
            if (Statics.field14 == null) {
                Statics.field14 = new class78(Statics.field719, new URL(Statics.field2653));
            } else {
                byte[] var0 = Statics.field14.method1392();
                if (var0 != null) {
                    class177 var1 = new class177(var0);
                    field1299 = var1.method2967();
                    Statics.field1294 = new class81[field1299];
                    int var2 = 0;
                    while (var2 < field1299) {
                        class81 var3 = Statics.field1294[var2] = new class81();
                        var3.field1303 = var1.method2967();
                        var3.field1300 = var1.method2970();
                        var3.field1311 = var1.method2973();
                        var3.field1304 = var1.method2973();
                        var3.field1308 = var1.method2965();
                        var3.field1305 = var1.method3157();
                        var3.field1309 = var2++;
                    }
                    method149(Statics.field1294, 0, Statics.field1294.length - 1, field1302, field1307);
                    Statics.field14 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field14 = null;
        }
        return false;
    }

    @ObfuscatedName("fr.c(III)V")
    public static void method2810(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1302[var5] != arg0) {
                var2[var4] = field1302[var5];
                var3[var4] = field1307[var5];
                var4++;
            }
        }
        field1302 = var2;
        field1307 = var3;
        method149(Statics.field1294, 0, Statics.field1294.length - 1, field1302, field1307);
    }

    @ObfuscatedName("g.f([Lci;II[I[II)V")
    public static void method149(class81[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1309;
                        var12 = var8.field1309;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1305;
                        var12 = var8.field1305;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1441() ? 1 : 0;
                        var12 = var8.method1441() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1303;
                        var12 = var8.field1303;
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
                        var15 = arg0[var5].field1309;
                        var16 = var8.field1309;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1305;
                        var16 = var8.field1305;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1441() ? 1 : 0;
                        var16 = var8.method1441() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1303;
                        var16 = var8.field1303;
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
        method149(arg0, arg1, var6, arg3, arg4);
        method149(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("fo.m(IIIZIZI)V")
    public static void method2900(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field1294[var6];
        Statics.field1294[var6] = Statics.field1294[arg1];
        Statics.field1294[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class81 var10 = Statics.field1294[var9];
            int var11 = method2(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method2(var10, var8, arg4, arg5);
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
                class81 var14 = Statics.field1294[var9];
                Statics.field1294[var9] = Statics.field1294[var7];
                Statics.field1294[var7++] = var14;
            }
        }
        Statics.field1294[arg1] = Statics.field1294[var7];
        Statics.field1294[var7] = var8;
        method2900(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2900(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("c.h(Lci;Lci;IZB)I")
    public static int method2(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1305;
            int var5 = arg1.field1305;
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
            return arg0.field1308 - arg1.field1308;
        } else if (arg2 == 3) {
            if (arg0.field1304.equals("-")) {
                if (arg1.field1304.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1304.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1304.compareTo(arg1.field1304);
            }
        } else if (arg2 == 4) {
            return arg0.method1419() ? (arg1.method1419() ? 0 : 1) : (arg1.method1419() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1450() ? (arg1.method1450() ? 0 : 1) : (arg1.method1450() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1418() ? (arg1.method1418() ? 0 : 1) : (arg1.method1418() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1441() ? (arg1.method1441() ? 0 : 1) : (arg1.method1441() ? -1 : 0);
        } else {
            return arg0.field1303 - arg1.field1303;
        }
    }

    @ObfuscatedName("bc.t(B)Lci;")
    public static class81 method821() {
        field1298 = 0;
        class81 var0;
        if (field1298 < field1299) {
            var0 = Statics.field1294[++field1298 - 1];
        } else {
            var0 = null;
        }
        return var0;
    }

    @ObfuscatedName("ci.p(B)Z")
    public boolean method1441() {
        return (0x1 & this.field1300) != 0;
    }

    @ObfuscatedName("ci.d(I)Z")
    public boolean method1450() {
        return (0x2 & this.field1300) != 0;
    }

    @ObfuscatedName("ci.n(I)Z")
    public boolean method1418() {
        return (0x4 & this.field1300) != 0;
    }

    @ObfuscatedName("ci.z(B)Z")
    public boolean method1419() {
        return (0x8 & this.field1300) != 0;
    }

    @ObfuscatedName("ci.o(B)Z")
    public boolean method1426() {
        return (0x20000000 & this.field1300) != 0;
    }

    @ObfuscatedName("ci.u(I)Z")
    public boolean method1430() {
        return (0x2000000 & this.field1300) != 0;
    }
}
