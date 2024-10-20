package deob;

import java.net.URL;

@ObfuscatedName("cb")
public class class81 {

    @ObfuscatedName("cb.v")
    public static int field1268 = 0;

    @ObfuscatedName("cb.t")
    public static int field1275 = 0;

    @ObfuscatedName("cb.p")
    public static int[] field1270 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cb.l")
    public static int[] field1271 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cb.k")
    public int field1278;

    @ObfuscatedName("cb.r")
    public int field1274;

    @ObfuscatedName("cb.b")
    public int field1273;

    @ObfuscatedName("cb.x")
    public String field1276;

    @ObfuscatedName("cb.o")
    public String field1267;

    @ObfuscatedName("cb.j")
    public int field1272;

    @ObfuscatedName("cb.m")
    public int field1279;

    @ObfuscatedName("ao.i(B)Z")
    public static boolean method552() {
        try {
            if (Statics.field1280 == null) {
                Statics.field1280 = new class78(Statics.field683, new URL(Statics.field21));
            } else {
                byte[] var0 = Statics.field1280.method1399();
                if (var0 != null) {
                    class174 var1 = new class174(var0);
                    field1268 = var1.method2932();
                    Statics.field1277 = new class81[field1268];
                    int var2 = 0;
                    while (var2 < field1268) {
                        class81 var3 = Statics.field1277[var2] = new class81();
                        var3.field1278 = var1.method2932();
                        var3.field1274 = var1.method2927();
                        var3.field1276 = var1.method2938();
                        var3.field1267 = var1.method2938();
                        var3.field1272 = var1.method2930();
                        var3.field1273 = var1.method2933();
                        var3.field1279 = var2++;
                    }
                    method3975(Statics.field1277, 0, Statics.field1277.length - 1, field1271, field1270);
                    Statics.field1280 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1280 = null;
        }
        return false;
    }

    @ObfuscatedName("av.h(III)V")
    public static void method464(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1271[var5] != arg0) {
                var2[var4] = field1271[var5];
                var3[var4] = field1270[var5];
                var4++;
            }
        }
        field1271 = var2;
        field1270 = var3;
        method3975(Statics.field1277, 0, Statics.field1277.length - 1, field1271, field1270);
    }

    @ObfuscatedName("il.u([Lcb;II[I[II)V")
    public static void method3975(class81[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1279;
                        var12 = var8.field1279;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1273;
                        var12 = var8.field1273;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1427() ? 1 : 0;
                        var12 = var8.method1427() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1278;
                        var12 = var8.field1278;
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
                        var15 = arg0[var5].field1279;
                        var16 = var8.field1279;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1273;
                        var16 = var8.field1273;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1427() ? 1 : 0;
                        var16 = var8.method1427() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1278;
                        var16 = var8.field1278;
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
        method3975(arg0, arg1, var6, arg3, arg4);
        method3975(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ax.q(IZIZI)V")
    public static void method322(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1277 != null) {
            method3649(0, Statics.field1277.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("hz.g(IIIZIZI)V")
    public static void method3649(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field1277[var6];
        Statics.field1277[var6] = Statics.field1277[arg1];
        Statics.field1277[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class81 var10 = Statics.field1277[var9];
            int var11 = method317(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method317(var10, var8, arg4, arg5);
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
                class81 var14 = Statics.field1277[var9];
                Statics.field1277[var9] = Statics.field1277[var7];
                Statics.field1277[var7++] = var14;
            }
        }
        Statics.field1277[arg1] = Statics.field1277[var7];
        Statics.field1277[var7] = var8;
        method3649(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3649(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("aj.v(Lcb;Lcb;IZB)I")
    public static int method317(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1273;
            int var5 = arg1.field1273;
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
            return arg0.field1272 - arg1.field1272;
        } else if (arg2 == 3) {
            if (arg0.field1267.equals("-")) {
                if (arg1.field1267.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1267.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1267.compareTo(arg1.field1267);
            }
        } else if (arg2 == 4) {
            return arg0.method1459() ? (arg1.method1459() ? 0 : 1) : (arg1.method1459() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1429() ? (arg1.method1429() ? 0 : 1) : (arg1.method1429() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1430() ? (arg1.method1430() ? 0 : 1) : (arg1.method1430() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1427() ? (arg1.method1427() ? 0 : 1) : (arg1.method1427() ? -1 : 0);
        } else {
            return arg0.field1278 - arg1.field1278;
        }
    }

    @ObfuscatedName("ah.t(B)Lcb;")
    public static class81 method198() {
        field1275 = 0;
        return method3826();
    }

    @ObfuscatedName("hu.p(I)Lcb;")
    public static class81 method3826() {
        return field1275 < field1268 ? Statics.field1277[++field1275 - 1] : null;
    }

    @ObfuscatedName("cb.l(I)Z")
    public boolean method1427() {
        return (0x1 & this.field1274) != 0;
    }

    @ObfuscatedName("cb.a(B)Z")
    public boolean method1429() {
        return (0x2 & this.field1274) != 0;
    }

    @ObfuscatedName("cb.k(I)Z")
    public boolean method1430() {
        return (0x4 & this.field1274) != 0;
    }

    @ObfuscatedName("cb.b(B)Z")
    public boolean method1459() {
        return (0x8 & this.field1274) != 0;
    }

    @ObfuscatedName("cb.x(I)Z")
    public boolean method1432() {
        return (0x20000000 & this.field1274) != 0;
    }

    @ObfuscatedName("cb.o(B)Z")
    public boolean method1433() {
        return (0x2000000 & this.field1274) != 0;
    }
}
