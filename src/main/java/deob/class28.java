package deob;

@ObfuscatedName("ay")
public class class28 {

    @ObfuscatedName("ay.b")
    public static int field652 = 0;

    @ObfuscatedName("ay.m")
    public static int field660 = 0;

    @ObfuscatedName("ay.k")
    public static int[] field664 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ay.c")
    public static int[] field655 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ay.l")
    public int field651;

    @ObfuscatedName("ay.h")
    public int field657;

    @ObfuscatedName("ay.i")
    public int field653;

    @ObfuscatedName("ay.u")
    public String field659;

    @ObfuscatedName("ay.x")
    public String field667;

    @ObfuscatedName("ay.d")
    public int field661;

    @ObfuscatedName("ay.o")
    public int field658;

    @ObfuscatedName("e.e(III)V")
    public static void method8(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field655[var5] != arg0) {
                var2[var4] = field655[var5];
                var3[var4] = field664[var5];
                var4++;
            }
        }
        field655 = var2;
        field664 = var3;
        method1148(Statics.field650, 0, Statics.field650.length - 1, field655, field664);
    }

    @ObfuscatedName("ba.n([Lay;II[I[IB)V")
    public static void method1148(class28[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class28 var8 = arg0[var7];
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
                        var11 = arg0[var6].field658;
                        var12 = var8.field658;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field653;
                        var12 = var8.field653;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method631() ? 1 : 0;
                        var12 = var8.method631() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field651;
                        var12 = var8.field651;
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
                        var15 = arg0[var5].field658;
                        var16 = var8.field658;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field653;
                        var16 = var8.field653;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method631() ? 1 : 0;
                        var16 = var8.method631() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field651;
                        var16 = var8.field651;
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
                class28 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1148(arg0, arg1, var6, arg3, arg4);
        method1148(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ei.t(IIIZIZI)V")
    public static void method2811(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class28 var8 = Statics.field650[var6];
        Statics.field650[var6] = Statics.field650[arg1];
        Statics.field650[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class28 var10 = Statics.field650[var9];
            int var11 = method2109(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method2109(var10, var8, arg4, arg5);
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
                class28 var14 = Statics.field650[var9];
                Statics.field650[var9] = Statics.field650[var7];
                Statics.field650[var7++] = var14;
            }
        }
        Statics.field650[arg1] = Statics.field650[var7];
        Statics.field650[var7] = var8;
        method2811(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2811(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cc.v(Lay;Lay;IZI)I")
    public static int method2109(class28 arg0, class28 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field653;
            int var5 = arg1.field653;
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
            return arg0.field661 - arg1.field661;
        } else if (arg2 == 3) {
            if (arg0.field667.equals("-")) {
                if (arg1.field667.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field667.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field667.compareTo(arg1.field667);
            }
        } else if (arg2 == 4) {
            return arg0.method614() ? (arg1.method614() ? 0 : 1) : (arg1.method614() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method612() ? (arg1.method612() ? 0 : 1) : (arg1.method612() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method613() ? (arg1.method613() ? 0 : 1) : (arg1.method613() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method631() ? (arg1.method631() ? 0 : 1) : (arg1.method631() ? -1 : 0);
        } else {
            return arg0.field651 - arg1.field651;
        }
    }

    @ObfuscatedName("ao.b(B)Lay;")
    public static class28 method756() {
        return field660 < field652 ? Statics.field650[++field660 - 1] : null;
    }

    @ObfuscatedName("ay.m(I)Z")
    public boolean method631() {
        return (0x1 & this.field657) != 0;
    }

    @ObfuscatedName("ay.k(B)Z")
    public boolean method612() {
        return (0x2 & this.field657) != 0;
    }

    @ObfuscatedName("ay.c(I)Z")
    public boolean method613() {
        return (0x4 & this.field657) != 0;
    }

    @ObfuscatedName("ay.w(I)Z")
    public boolean method614() {
        return (0x8 & this.field657) != 0;
    }

    @ObfuscatedName("ay.l(I)Z")
    public boolean method615() {
        return (0x20000000 & this.field657) != 0;
    }

    @ObfuscatedName("ay.h(B)Z")
    public boolean method633() {
        return (0x2000000 & this.field657) != 0;
    }
}
