package deob;

import java.net.URL;

@ObfuscatedName("ch")
public class class81 {

    @ObfuscatedName("ch.g")
    public static int field1291 = 0;

    @ObfuscatedName("ch.c")
    public static int field1292 = 0;

    @ObfuscatedName("ch.l")
    public static int[] field1293 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ch.w")
    public static int[] field1294 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ch.o")
    public int field1304;

    @ObfuscatedName("ch.m")
    public int field1302;

    @ObfuscatedName("ch.i")
    public int field1296;

    @ObfuscatedName("ch.s")
    public String field1297;

    @ObfuscatedName("ch.r")
    public String field1299;

    @ObfuscatedName("ch.e")
    public int field1300;

    @ObfuscatedName("ch.a")
    public int field1301;

    @ObfuscatedName("bo.j(I)Z")
    public static boolean method1058() {
        try {
            if (Statics.field835 == null) {
                Statics.field835 = Statics.field265.method1040(new URL(Statics.field778));
            } else if (Statics.field835.method1476()) {
                byte[] var0 = Statics.field835.method1479();
                class175 var1 = new class175(var0);
                var1.method2908();
                field1291 = var1.method3023();
                Statics.field1290 = new class81[field1291];
                int var2 = 0;
                while (var2 < field1291) {
                    class81 var3 = Statics.field1290[var2] = new class81();
                    var3.field1304 = var1.method3023();
                    var3.field1302 = var1.method2908();
                    var3.field1297 = var1.method2911();
                    var3.field1299 = var1.method2911();
                    var3.field1300 = var1.method2903();
                    var3.field1296 = var1.method3077();
                    var3.field1301 = var2++;
                }
                method1052(Statics.field1290, 0, Statics.field1290.length - 1, field1294, field1293);
                Statics.field835 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field835 = null;
        }
        return false;
    }

    @ObfuscatedName("m.h(IIS)V")
    public static void method46(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1294[var5] != arg0) {
                var2[var4] = field1294[var5];
                var3[var4] = field1293[var5];
                var4++;
            }
        }
        field1294 = var2;
        field1293 = var3;
        method1052(Statics.field1290, 0, Statics.field1290.length - 1, field1294, field1293);
    }

    @ObfuscatedName("bm.f([Lch;II[I[II)V")
    public static void method1052(class81[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1301;
                        var12 = var8.field1301;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1296;
                        var12 = var8.field1296;
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
                        var11 = arg0[var6].field1304;
                        var12 = var8.field1304;
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
                        var15 = arg0[var5].field1301;
                        var16 = var8.field1301;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1296;
                        var16 = var8.field1296;
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
                        var15 = arg0[var5].field1304;
                        var16 = var8.field1304;
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
        method1052(arg0, arg1, var6, arg3, arg4);
        method1052(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("av.p(IZIZI)V")
    public static void method255(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1290 != null) {
            method1061(0, Statics.field1290.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bo.x(IIIZIZB)V")
    public static void method1061(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class81 var8 = Statics.field1290[var6];
        Statics.field1290[var6] = Statics.field1290[arg1];
        Statics.field1290[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class81 var10 = Statics.field1290[var9];
            int var11 = method472(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method472(var10, var8, arg4, arg5);
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
                class81 var14 = Statics.field1290[var9];
                Statics.field1290[var9] = Statics.field1290[var7];
                Statics.field1290[var7++] = var14;
            }
        }
        Statics.field1290[arg1] = Statics.field1290[var7];
        Statics.field1290[var7] = var8;
        method1061(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1061(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("as.g(Lch;Lch;IZI)I")
    public static int method472(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1296;
            int var5 = arg1.field1296;
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
            return arg0.field1300 - arg1.field1300;
        } else if (arg2 == 3) {
            if (arg0.field1299.equals("-")) {
                if (arg1.field1299.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1299.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1299.compareTo(arg1.field1299);
            }
        } else if (arg2 == 4) {
            return arg0.method1420() ? (arg1.method1420() ? 0 : 1) : (arg1.method1420() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1418() ? (arg1.method1418() ? 0 : 1) : (arg1.method1418() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1419() ? (arg1.method1419() ? 0 : 1) : (arg1.method1419() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1441() ? (arg1.method1441() ? 0 : 1) : (arg1.method1441() ? -1 : 0);
        } else {
            return arg0.field1304 - arg1.field1304;
        }
    }

    @ObfuscatedName("ch.c(B)Z")
    public boolean method1441() {
        return (0x1 & this.field1302) != 0;
    }

    @ObfuscatedName("ch.l(I)Z")
    public boolean method1418() {
        return (0x2 & this.field1302) != 0;
    }

    @ObfuscatedName("ch.w(B)Z")
    public boolean method1419() {
        return (0x4 & this.field1302) != 0;
    }

    @ObfuscatedName("ch.b(I)Z")
    public boolean method1420() {
        return (0x8 & this.field1302) != 0;
    }

    @ObfuscatedName("ch.o(I)Z")
    public boolean method1421() {
        return (0x20000000 & this.field1302) != 0;
    }

    @ObfuscatedName("ch.m(S)Z")
    public boolean method1422() {
        return (0x2000000 & this.field1302) != 0;
    }
}
