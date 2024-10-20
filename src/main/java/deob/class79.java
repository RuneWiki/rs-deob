package deob;

import java.net.URL;

@ObfuscatedName("cg")
public class class79 {

    @ObfuscatedName("cg.s")
    public static int field1284 = 0;

    @ObfuscatedName("cg.r")
    public static int field1285 = 0;

    @ObfuscatedName("cg.g")
    public static int[] field1286 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cg.v")
    public static int[] field1281 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cg.y")
    public int field1289;

    @ObfuscatedName("cg.o")
    public int field1290;

    @ObfuscatedName("cg.i")
    public int field1291;

    @ObfuscatedName("cg.u")
    public String field1292;

    @ObfuscatedName("cg.b")
    public String field1296;

    @ObfuscatedName("cg.f")
    public int field1294;

    @ObfuscatedName("cg.j")
    public int field1299;

    @ObfuscatedName("i.d(B)Z")
    public static boolean method64() {
        try {
            if (Statics.field1293 == null) {
                Statics.field1293 = Statics.field833.method2715(new URL(Statics.field2393));
            } else if (Statics.field1293.method2736()) {
                byte[] var0 = Statics.field1293.method2730();
                class174 var1 = new class174(var0);
                var1.method2960();
                field1284 = var1.method3035();
                Statics.field2110 = new class79[field1284];
                int var2 = 0;
                while (var2 < field1284) {
                    class79 var3 = Statics.field2110[var2] = new class79();
                    var3.field1289 = var1.method3035();
                    var3.field1290 = var1.method2960();
                    var3.field1292 = var1.method2964();
                    var3.field1296 = var1.method2964();
                    var3.field1294 = var1.method2955();
                    var3.field1291 = var1.method2958();
                    var3.field1299 = var2++;
                }
                method1991(Statics.field2110, 0, Statics.field2110.length - 1, field1281, field1286);
                Statics.field1293 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1293 = null;
        }
        return false;
    }

    @ObfuscatedName("ax.k(III)V")
    public static void method600(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1281[var5] != arg0) {
                var2[var4] = field1281[var5];
                var3[var4] = field1286[var5];
                var4++;
            }
        }
        field1281 = var2;
        field1286 = var3;
        method1991(Statics.field2110, 0, Statics.field2110.length - 1, field1281, field1286);
    }

    @ObfuscatedName("di.e([Lcg;II[I[IB)V")
    public static void method1991(class79[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class79 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1291;
                        var12 = var8.field1291;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1504() ? 1 : 0;
                        var12 = var8.method1504() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1289;
                        var12 = var8.field1289;
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
                        var15 = arg0[var5].field1291;
                        var16 = var8.field1291;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1504() ? 1 : 0;
                        var16 = var8.method1504() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1289;
                        var16 = var8.field1289;
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
                class79 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1991(arg0, arg1, var6, arg3, arg4);
        method1991(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("by.p(IZIZI)V")
    public static void method736(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field2110 != null) {
            method709(0, Statics.field2110.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bf.q(IIIZIZI)V")
    public static void method709(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class79 var8 = Statics.field2110[var6];
        Statics.field2110[var6] = Statics.field2110[arg1];
        Statics.field2110[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class79 var10 = Statics.field2110[var9];
            int var11 = method2748(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method2748(var10, var8, arg4, arg5);
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
                class79 var14 = Statics.field2110[var9];
                Statics.field2110[var9] = Statics.field2110[var7];
                Statics.field2110[var7++] = var14;
            }
        }
        Statics.field2110[arg1] = Statics.field2110[var7];
        Statics.field2110[var7] = var8;
        method709(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method709(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("er.s(Lcg;Lcg;IZB)I")
    public static int method2748(class79 arg0, class79 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1291;
            int var5 = arg1.field1291;
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
            return arg0.field1294 - arg1.field1294;
        } else if (arg2 == 3) {
            if (arg0.field1296.equals("-")) {
                if (arg1.field1296.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1296.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1296.compareTo(arg1.field1296);
            }
        } else if (arg2 == 4) {
            return arg0.method1497() ? (arg1.method1497() ? 0 : 1) : (arg1.method1497() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1480() ? (arg1.method1480() ? 0 : 1) : (arg1.method1480() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1481() ? (arg1.method1481() ? 0 : 1) : (arg1.method1481() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1504() ? (arg1.method1504() ? 0 : 1) : (arg1.method1504() ? -1 : 0);
        } else {
            return arg0.field1289 - arg1.field1289;
        }
    }

    @ObfuscatedName("ck.r(I)Lcg;")
    public static class79 method1635() {
        return field1285 < field1284 ? Statics.field2110[++field1285 - 1] : null;
    }

    @ObfuscatedName("cg.g(I)Z")
    public boolean method1504() {
        return (0x1 & this.field1290) != 0;
    }

    @ObfuscatedName("cg.v(S)Z")
    public boolean method1480() {
        return (0x2 & this.field1290) != 0;
    }

    @ObfuscatedName("cg.t(B)Z")
    public boolean method1481() {
        return (0x4 & this.field1290) != 0;
    }

    @ObfuscatedName("cg.y(B)Z")
    public boolean method1497() {
        return (0x8 & this.field1290) != 0;
    }

    @ObfuscatedName("cg.o(B)Z")
    public boolean method1483() {
        return (0x20000000 & this.field1290) != 0;
    }

    @ObfuscatedName("cg.i(S)Z")
    public boolean method1501() {
        return (0x2000000 & this.field1290) != 0;
    }
}
