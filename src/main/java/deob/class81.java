package deob;

import java.net.URL;

@ObfuscatedName("cq")
public class class81 {

    @ObfuscatedName("cq.k")
    public static int field1279 = 0;

    @ObfuscatedName("cq.v")
    public static int field1278 = 0;

    @ObfuscatedName("cq.z")
    public static int[] field1292 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cq.r")
    public static int[] field1282 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cq.d")
    public int field1284;

    @ObfuscatedName("cq.o")
    public int field1285;

    @ObfuscatedName("cq.l")
    public int field1286;

    @ObfuscatedName("cq.h")
    public String field1291;

    @ObfuscatedName("cq.s")
    public String field1288;

    @ObfuscatedName("cq.c")
    public int field1280;

    @ObfuscatedName("cq.m")
    public int field1290;

    @ObfuscatedName("eb.e(S)Z")
    public static boolean method2752() {
        try {
            if (Statics.field1289 == null) {
                Statics.field1289 = Statics.field340.method1004(new URL(Statics.field806));
            } else if (Statics.field1289.method1502()) {
                byte[] var0 = Statics.field1289.method1503();
                class175 var1 = new class175(var0);
                var1.method2933();
                field1279 = var1.method3091();
                Statics.field649 = new class81[field1279];
                int var2 = 0;
                while (var2 < field1279) {
                    class81 var3 = Statics.field649[var2] = new class81();
                    var3.field1284 = var1.method3091();
                    var3.field1285 = var1.method2933();
                    var3.field1291 = var1.method3113();
                    var3.field1288 = var1.method3113();
                    var3.field1280 = var1.method2928();
                    var3.field1286 = var1.method2931();
                    var3.field1290 = var2++;
                }
                method2850(Statics.field649, 0, Statics.field649.length - 1, field1282, field1292);
                Statics.field1289 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1289 = null;
        }
        return false;
    }

    @ObfuscatedName("hj.n(III)V")
    public static void method3787(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1282[var5] != arg0) {
                var2[var4] = field1282[var5];
                var3[var4] = field1292[var5];
                var4++;
            }
        }
        field1282 = var2;
        field1292 = var3;
        method2850(Statics.field649, 0, Statics.field649.length - 1, field1282, field1292);
    }

    @ObfuscatedName("fg.g([Lcq;II[I[II)V")
    public static void method2850(class81[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1290;
                        var12 = var8.field1290;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1286;
                        var12 = var8.field1286;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1430() ? 1 : 0;
                        var12 = var8.method1430() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1284;
                        var12 = var8.field1284;
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
                        var15 = arg0[var5].field1290;
                        var16 = var8.field1290;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1286;
                        var16 = var8.field1286;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1430() ? 1 : 0;
                        var16 = var8.method1430() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1284;
                        var16 = var8.field1284;
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
        method2850(arg0, arg1, var6, arg3, arg4);
        method2850(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("p.y(IZIZB)V")
    public static void method147(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field649 != null) {
            method1424(0, Statics.field649.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cp.w(IIIZIZI)V")
    public static void method1424(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field649[var6];
        Statics.field649[var6] = Statics.field649[arg1];
        Statics.field649[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2173(Statics.field649[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class81 var10 = Statics.field649[var9];
                Statics.field649[var9] = Statics.field649[var7];
                Statics.field649[var7++] = var10;
            }
        }
        Statics.field649[arg1] = Statics.field649[var7];
        Statics.field649[var7] = var8;
        method1424(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1424(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("do.k(Lcq;Lcq;IZIZS)I")
    public static int method2173(class81 arg0, class81 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method1406(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method1406(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("be.v(Lcq;Lcq;IZI)I")
    public static int method1406(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1286;
            int var5 = arg1.field1286;
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
            return arg0.field1280 - arg1.field1280;
        } else if (arg2 == 3) {
            if (arg0.field1288.equals("-")) {
                if (arg1.field1288.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1288.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1288.compareTo(arg1.field1288);
            }
        } else if (arg2 == 4) {
            return arg0.method1433() ? (arg1.method1433() ? 0 : 1) : (arg1.method1433() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1462() ? (arg1.method1462() ? 0 : 1) : (arg1.method1462() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1432() ? (arg1.method1432() ? 0 : 1) : (arg1.method1432() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1430() ? (arg1.method1430() ? 0 : 1) : (arg1.method1430() ? -1 : 0);
        } else {
            return arg0.field1284 - arg1.field1284;
        }
    }

    @ObfuscatedName("cq.z(S)Z")
    public boolean method1430() {
        return (0x1 & this.field1285) != 0;
    }

    @ObfuscatedName("cq.r(I)Z")
    public boolean method1462() {
        return (0x2 & this.field1285) != 0;
    }

    @ObfuscatedName("cq.u(B)Z")
    public boolean method1432() {
        return (0x4 & this.field1285) != 0;
    }

    @ObfuscatedName("cq.d(I)Z")
    public boolean method1433() {
        return (0x8 & this.field1285) != 0;
    }

    @ObfuscatedName("cq.o(I)Z")
    public boolean method1434() {
        return (0x20000000 & this.field1285) != 0;
    }

    @ObfuscatedName("cq.s(B)Z")
    public boolean method1435() {
        return (0x2000000 & this.field1285) != 0;
    }
}
