package deob;

import java.net.URL;

@ObfuscatedName("co")
public class class79 {

    @ObfuscatedName("co.v")
    public static int field1283 = 0;

    @ObfuscatedName("co.p")
    public static int field1284 = 0;

    @ObfuscatedName("co.e")
    public static int[] field1285 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("co.d")
    public static int[] field1287 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("co.z")
    public int field1282;

    @ObfuscatedName("co.n")
    public int field1280;

    @ObfuscatedName("co.u")
    public int field1289;

    @ObfuscatedName("co.t")
    public String field1290;

    @ObfuscatedName("co.a")
    public String field1291;

    @ObfuscatedName("co.i")
    public int field1292;

    @ObfuscatedName("co.h")
    public int field1293;

    @ObfuscatedName("bm.w(S)Z")
    public static boolean method1017() {
        try {
            if (Statics.field865 == null) {
                Statics.field865 = Statics.field764.method2710(new URL(Statics.field2526));
            } else if (Statics.field865.method2711()) {
                byte[] var0 = Statics.field865.method2713();
                class174 var1 = new class174(var0);
                var1.method3131();
                field1283 = var1.method3178();
                Statics.field3665 = new class79[field1283];
                int var2 = 0;
                while (var2 < field1283) {
                    class79 var3 = Statics.field3665[var2] = new class79();
                    var3.field1282 = var1.method3178();
                    var3.field1280 = var1.method3131();
                    var3.field1290 = var1.method3111();
                    var3.field1291 = var1.method3111();
                    var3.field1292 = var1.method2971();
                    var3.field1289 = var1.method2974();
                    var3.field1293 = var2++;
                }
                method1761(Statics.field3665, 0, Statics.field3665.length - 1, field1287, field1285);
                Statics.field865 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field865 = null;
        }
        return false;
    }

    @ObfuscatedName("bc.s(III)V")
    public static void method995(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1287[var5] != arg0) {
                var2[var4] = field1287[var5];
                var3[var4] = field1285[var5];
                var4++;
            }
        }
        field1287 = var2;
        field1285 = var3;
        method1761(Statics.field3665, 0, Statics.field3665.length - 1, field1287, field1285);
    }

    @ObfuscatedName("ct.q([Lco;II[I[II)V")
    public static void method1761(class79[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1293;
                        var12 = var8.field1293;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1289;
                        var12 = var8.field1289;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1432() ? 1 : 0;
                        var12 = var8.method1432() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1282;
                        var12 = var8.field1282;
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
                        var15 = arg0[var5].field1293;
                        var16 = var8.field1293;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1289;
                        var16 = var8.field1289;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1432() ? 1 : 0;
                        var16 = var8.method1432() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1282;
                        var16 = var8.field1282;
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
        method1761(arg0, arg1, var6, arg3, arg4);
        method1761(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("v.o(IIIZIZI)V")
    public static void method16(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class79 var8 = Statics.field3665[var6];
        Statics.field3665[var6] = Statics.field3665[arg1];
        Statics.field3665[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class79 var10 = Statics.field3665[var9];
            int var11 = method2210(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method2210(var10, var8, arg4, arg5);
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
                class79 var14 = Statics.field3665[var9];
                Statics.field3665[var9] = Statics.field3665[var7];
                Statics.field3665[var7++] = var14;
            }
        }
        Statics.field3665[arg1] = Statics.field3665[var7];
        Statics.field3665[var7] = var8;
        method16(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method16(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("dw.g(Lco;Lco;IZB)I")
    public static int method2210(class79 arg0, class79 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1289;
            int var5 = arg1.field1289;
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
            return arg0.field1292 - arg1.field1292;
        } else if (arg2 == 3) {
            if (arg0.field1291.equals("-")) {
                if (arg1.field1291.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1291.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1291.compareTo(arg1.field1291);
            }
        } else if (arg2 == 4) {
            return arg0.method1431() ? (arg1.method1431() ? 0 : 1) : (arg1.method1431() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1433() ? (arg1.method1433() ? 0 : 1) : (arg1.method1433() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1434() ? (arg1.method1434() ? 0 : 1) : (arg1.method1434() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1432() ? (arg1.method1432() ? 0 : 1) : (arg1.method1432() ? -1 : 0);
        } else {
            return arg0.field1282 - arg1.field1282;
        }
    }

    @ObfuscatedName("da.v(I)Lco;")
    public static class79 method2251() {
        field1284 = 0;
        class79 var0;
        if (field1284 < field1283) {
            var0 = Statics.field3665[++field1284 - 1];
        } else {
            var0 = null;
        }
        return var0;
    }

    @ObfuscatedName("co.p(I)Z")
    public boolean method1432() {
        return (0x1 & this.field1280) != 0;
    }

    @ObfuscatedName("co.e(I)Z")
    public boolean method1433() {
        return (0x2 & this.field1280) != 0;
    }

    @ObfuscatedName("co.d(I)Z")
    public boolean method1434() {
        return (0x4 & this.field1280) != 0;
    }

    @ObfuscatedName("co.x(I)Z")
    public boolean method1431() {
        return (0x8 & this.field1280) != 0;
    }

    @ObfuscatedName("co.u(I)Z")
    public boolean method1436() {
        return (0x20000000 & this.field1280) != 0;
    }

    @ObfuscatedName("co.i(I)Z")
    public boolean method1437() {
        return (0x2000000 & this.field1280) != 0;
    }
}
