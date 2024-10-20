package deob;

@ObfuscatedName("bs")
public class class67 {

    @ObfuscatedName("bs.w")
    public static int field974 = 0;

    @ObfuscatedName("bs.d")
    public static int field971 = 0;

    @ObfuscatedName("bs.n")
    public static int[] field983 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bs.s")
    public static int[] field977 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bs.a")
    public int field985;

    @ObfuscatedName("bs.r")
    public int field979;

    @ObfuscatedName("bs.k")
    public int field981;

    @ObfuscatedName("bs.m")
    public String field978;

    @ObfuscatedName("bs.q")
    public String field982;

    @ObfuscatedName("bs.x")
    public int field984;

    @ObfuscatedName("bs.u")
    public int field987;

    @ObfuscatedName("cl.h(III)V")
    public static void method1803(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field977[var5] != arg0) {
                var2[var4] = field977[var5];
                var3[var4] = field983[var5];
                var4++;
            }
        }
        field977 = var2;
        field983 = var3;
        method2351(Statics.field973, 0, Statics.field973.length - 1, field977, field983);
    }

    @ObfuscatedName("df.e([Lbs;II[I[IB)V")
    public static void method2351(class67[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class67 var8 = arg0[var7];
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
                        var11 = arg0[var6].field987;
                        var12 = var8.field987;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field981;
                        var12 = var8.field981;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1486() ? 1 : 0;
                        var12 = var8.method1486() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field985;
                        var12 = var8.field985;
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
                        var15 = arg0[var5].field987;
                        var16 = var8.field987;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field981;
                        var16 = var8.field981;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1486() ? 1 : 0;
                        var16 = var8.method1486() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field985;
                        var16 = var8.field985;
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
                class67 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2351(arg0, arg1, var6, arg3, arg4);
        method2351(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("m.b(IIIZIZI)V")
    public static void method145(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class67 var8 = Statics.field973[var6];
        Statics.field973[var6] = Statics.field973[arg1];
        Statics.field973[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method1732(Statics.field973[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class67 var10 = Statics.field973[var9];
                Statics.field973[var9] = Statics.field973[var7];
                Statics.field973[var7++] = var10;
            }
        }
        Statics.field973[arg1] = Statics.field973[var7];
        Statics.field973[var7] = var8;
        method145(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method145(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bk.l(Lbs;Lbs;IZIZB)I")
    public static int method1732(class67 arg0, class67 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method1689(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method1689(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ba.w(Lbs;Lbs;IZB)I")
    public static int method1689(class67 arg0, class67 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field981;
            int var5 = arg1.field981;
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
            return arg0.field984 - arg1.field984;
        } else if (arg2 == 3) {
            if (arg0.field982.equals("-")) {
                if (arg1.field982.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field982.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field982.compareTo(arg1.field982);
            }
        } else if (arg2 == 4) {
            return arg0.method1508() ? (arg1.method1508() ? 0 : 1) : (arg1.method1508() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1514() ? (arg1.method1514() ? 0 : 1) : (arg1.method1514() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1488() ? (arg1.method1488() ? 0 : 1) : (arg1.method1488() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1486() ? (arg1.method1486() ? 0 : 1) : (arg1.method1486() ? -1 : 0);
        } else {
            return arg0.field985 - arg1.field985;
        }
    }

    @ObfuscatedName("g.d(I)Lbs;")
    public static class67 method113() {
        field971 = 0;
        return method3008();
    }

    @ObfuscatedName("eq.n(I)Lbs;")
    public static class67 method3008() {
        return field971 < field974 ? Statics.field973[++field971 - 1] : null;
    }

    @ObfuscatedName("bs.s(I)Z")
    public boolean method1486() {
        return (0x1 & this.field979) != 0;
    }

    @ObfuscatedName("bs.g(I)Z")
    public boolean method1514() {
        return (0x2 & this.field979) != 0;
    }

    @ObfuscatedName("bs.k(I)Z")
    public boolean method1488() {
        return (0x4 & this.field979) != 0;
    }

    @ObfuscatedName("bs.m(I)Z")
    public boolean method1508() {
        return (0x8 & this.field979) != 0;
    }

    @ObfuscatedName("bs.q(I)Z")
    public boolean method1490() {
        return (0x20000000 & this.field979) != 0;
    }

    @ObfuscatedName("bs.x(I)Z")
    public boolean method1491() {
        return (0x2000000 & this.field979) != 0;
    }
}
