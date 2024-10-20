package deob;

import java.net.URL;

@ObfuscatedName("bg")
public class class76 {

    @ObfuscatedName("bg.j")
    public static int field925 = 0;

    @ObfuscatedName("bg.r")
    public static int field931 = 0;

    @ObfuscatedName("bg.b")
    public static int[] field927 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bg.d")
    public static int[] field928 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bg.u")
    public int field938;

    @ObfuscatedName("bg.l")
    public int field934;

    @ObfuscatedName("bg.o")
    public int field926;

    @ObfuscatedName("bg.c")
    public String field929;

    @ObfuscatedName("bg.e")
    public String field933;

    @ObfuscatedName("bg.g")
    public int field924;

    @ObfuscatedName("bg.a")
    public int field935;

    @ObfuscatedName("bq.v(I)Z")
    public static boolean method687() {
        try {
            if (Statics.field1521 == null) {
                Statics.field1521 = Statics.field2759.method2189(new URL(Statics.field59));
            } else if (Statics.field1521.method2204()) {
                byte[] var0 = Statics.field1521.method2203();
                class383 var1 = new class383(var0);
                var1.method5970();
                field925 = var1.method5967();
                Statics.field1133 = new class76[field925];
                int var2 = 0;
                while (var2 < field925) {
                    class76 var3 = Statics.field1133[var2] = new class76();
                    var3.field938 = var1.method5967();
                    var3.field934 = var1.method5970();
                    var3.field929 = var1.method5974();
                    var3.field933 = var1.method5974();
                    var3.field924 = var1.method5965();
                    var3.field926 = var1.method6102();
                    var3.field935 = var2++;
                }
                method709(Statics.field1133, 0, Statics.field1133.length - 1, field928, field927);
                Statics.field1521 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1521 = null;
        }
        return false;
    }

    @ObfuscatedName("aq.n(III)V")
    public static void method343(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field928[var5] != arg0) {
                var2[var4] = field928[var5];
                var3[var4] = field927[var5];
                var4++;
            }
        }
        field928 = var2;
        field927 = var3;
        method709(Statics.field1133, 0, Statics.field1133.length - 1, field928, field927);
    }

    @ObfuscatedName("bu.f([Lbg;II[I[II)V")
    public static void method709(class76[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class76 var8 = arg0[var7];
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
                        var11 = arg0[var6].field935;
                        var12 = var8.field935;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field926;
                        var12 = var8.field926;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1454() ? 1 : 0;
                        var12 = var8.method1454() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field938;
                        var12 = var8.field938;
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
                        var15 = arg0[var5].field935;
                        var16 = var8.field935;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field926;
                        var16 = var8.field926;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1454() ? 1 : 0;
                        var16 = var8.method1454() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field938;
                        var16 = var8.field938;
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
                class76 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method709(arg0, arg1, var6, arg3, arg4);
        method709(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("if.y(IZIZI)V")
    public static void method4385(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1133 != null) {
            method5514(0, Statics.field1133.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("mb.p(IIIZIZI)V")
    public static void method5514(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class76 var8 = Statics.field1133[var6];
        Statics.field1133[var6] = Statics.field1133[arg1];
        Statics.field1133[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class76 var10 = Statics.field1133[var9];
            int var11 = method139(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method139(var10, var8, arg4, arg5);
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
                class76 var14 = Statics.field1133[var9];
                Statics.field1133[var9] = Statics.field1133[var7];
                Statics.field1133[var7++] = var14;
            }
        }
        Statics.field1133[arg1] = Statics.field1133[var7];
        Statics.field1133[var7] = var8;
        method5514(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method5514(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("o.j(Lbg;Lbg;IZI)I")
    public static int method139(class76 arg0, class76 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field926;
            int var5 = arg1.field926;
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
            return arg0.field924 - arg1.field924;
        } else if (arg2 == 3) {
            if (arg0.field933.equals("-")) {
                if (arg1.field933.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field933.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field933.compareTo(arg1.field933);
            }
        } else if (arg2 == 4) {
            return arg0.method1457() ? (arg1.method1457() ? 0 : 1) : (arg1.method1457() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1455() ? (arg1.method1455() ? 0 : 1) : (arg1.method1455() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1456() ? (arg1.method1456() ? 0 : 1) : (arg1.method1456() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1454() ? (arg1.method1454() ? 0 : 1) : (arg1.method1454() ? -1 : 0);
        } else {
            return arg0.field938 - arg1.field938;
        }
    }

    @ObfuscatedName("es.r(I)Lbg;")
    public static class76 method2572() {
        field931 = 0;
        return method1715();
    }

    @ObfuscatedName("cm.b(I)Lbg;")
    public static class76 method1715() {
        return field931 < field925 ? Statics.field1133[++field931 - 1] : null;
    }

    @ObfuscatedName("bg.d(I)Z")
    public boolean method1454() {
        return (0x1 & this.field934) != 0;
    }

    @ObfuscatedName("bg.s(I)Z")
    public boolean method1455() {
        return (0x2 & this.field934) != 0;
    }

    @ObfuscatedName("bg.u(I)Z")
    public boolean method1456() {
        return (0x4 & this.field934) != 0;
    }

    @ObfuscatedName("bg.l(I)Z")
    public boolean method1457() {
        return (0x8 & this.field934) != 0;
    }

    @ObfuscatedName("bg.o(I)Z")
    public boolean method1458() {
        return (0x20000000 & this.field934) != 0;
    }

    @ObfuscatedName("bg.c(S)Z")
    public boolean method1475() {
        return (0x2000000 & this.field934) != 0;
    }

    @ObfuscatedName("bg.e(B)Z")
    public boolean method1460() {
        return (0x40000000 & this.field934) != 0;
    }
}
