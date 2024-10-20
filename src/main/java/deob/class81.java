package deob;

import java.net.URL;

@ObfuscatedName("cx")
public class class81 {

    @ObfuscatedName("cx.e")
    public static int field1284 = 0;

    @ObfuscatedName("cx.l")
    public static int field1290 = 0;

    @ObfuscatedName("cx.s")
    public static int[] field1289 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cx.w")
    public static int[] field1304 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cx.m")
    public int field1293;

    @ObfuscatedName("cx.u")
    public int field1294;

    @ObfuscatedName("cx.g")
    public int field1295;

    @ObfuscatedName("cx.k")
    public String field1297;

    @ObfuscatedName("cx.t")
    public String field1287;

    @ObfuscatedName("cx.c")
    public int field1298;

    @ObfuscatedName("cx.o")
    public int field1299;

    @ObfuscatedName("ha.a(B)Z")
    public static boolean method3733() {
        try {
            if (Statics.field1655 == null) {
                Statics.field1655 = new class78(Statics.field697, new URL(Statics.field734));
            } else {
                byte[] var0 = Statics.field1655.method1341();
                if (var0 != null) {
                    class174 var1 = new class174(var0);
                    field1284 = var1.method2873();
                    Statics.field1292 = new class81[field1284];
                    int var2 = 0;
                    while (var2 < field1284) {
                        class81 var3 = Statics.field1292[var2] = new class81();
                        var3.field1293 = var1.method2873();
                        var3.field1294 = var1.method2876();
                        var3.field1297 = var1.method2879();
                        var3.field1287 = var1.method2879();
                        var3.field1298 = var1.method2871();
                        var3.field1295 = var1.method2906();
                        var3.field1299 = var2++;
                    }
                    method3127(Statics.field1292, 0, Statics.field1292.length - 1, field1304, field1289);
                    Statics.field1655 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1655 = null;
        }
        return false;
    }

    @ObfuscatedName("ak.j(IIB)V")
    public static void method231(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1304[var5] != arg0) {
                var2[var4] = field1304[var5];
                var3[var4] = field1289[var5];
                var4++;
            }
        }
        field1304 = var2;
        field1289 = var3;
        method3127(Statics.field1292, 0, Statics.field1292.length - 1, field1304, field1289);
    }

    @ObfuscatedName("ff.n([Lcx;II[I[II)V")
    public static void method3127(class81[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1299;
                        var12 = var8.field1299;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1295;
                        var12 = var8.field1295;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1417() ? 1 : 0;
                        var12 = var8.method1417() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1293;
                        var12 = var8.field1293;
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
                        var15 = arg0[var5].field1299;
                        var16 = var8.field1299;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1295;
                        var16 = var8.field1295;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1417() ? 1 : 0;
                        var16 = var8.method1417() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1293;
                        var16 = var8.field1293;
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
        method3127(arg0, arg1, var6, arg3, arg4);
        method3127(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("dq.r(IIIZIZI)V")
    public static void method2256(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field1292[var6];
        Statics.field1292[var6] = Statics.field1292[arg1];
        Statics.field1292[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class81 var10 = Statics.field1292[var9];
            int var11 = method1364(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method1364(var10, var8, arg4, arg5);
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
                class81 var14 = Statics.field1292[var9];
                Statics.field1292[var9] = Statics.field1292[var7];
                Statics.field1292[var7++] = var14;
            }
        }
        Statics.field1292[arg1] = Statics.field1292[var7];
        Statics.field1292[var7] = var8;
        method2256(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2256(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cs.v(Lcx;Lcx;IZI)I")
    public static int method1364(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1295;
            int var5 = arg1.field1295;
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
            return arg0.field1298 - arg1.field1298;
        } else if (arg2 == 3) {
            if (arg0.field1287.equals("-")) {
                if (arg1.field1287.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1287.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1287.compareTo(arg1.field1287);
            }
        } else if (arg2 == 4) {
            return arg0.method1407() ? (arg1.method1407() ? 0 : 1) : (arg1.method1407() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1376() ? (arg1.method1376() ? 0 : 1) : (arg1.method1376() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1377() ? (arg1.method1377() ? 0 : 1) : (arg1.method1377() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1417() ? (arg1.method1417() ? 0 : 1) : (arg1.method1417() ? -1 : 0);
        } else {
            return arg0.field1293 - arg1.field1293;
        }
    }

    @ObfuscatedName("ap.e(B)Lcx;")
    public static class81 method237() {
        field1290 = 0;
        class81 var0;
        if (field1290 < field1284) {
            var0 = Statics.field1292[++field1290 - 1];
        } else {
            var0 = null;
        }
        return var0;
    }

    @ObfuscatedName("cx.l(I)Z")
    public boolean method1417() {
        return (0x1 & this.field1294) != 0;
    }

    @ObfuscatedName("cx.s(I)Z")
    public boolean method1376() {
        return (0x2 & this.field1294) != 0;
    }

    @ObfuscatedName("cx.w(I)Z")
    public boolean method1377() {
        return (0x4 & this.field1294) != 0;
    }

    @ObfuscatedName("cx.p(I)Z")
    public boolean method1407() {
        return (0x8 & this.field1294) != 0;
    }

    @ObfuscatedName("cx.m(I)Z")
    public boolean method1383() {
        return (0x20000000 & this.field1294) != 0;
    }

    @ObfuscatedName("cx.u(I)Z")
    public boolean method1380() {
        return (0x2000000 & this.field1294) != 0;
    }
}
