package deob;

@ObfuscatedName("i")
public class class26 {

    @ObfuscatedName("i.c")
    public static int field635 = 0;

    @ObfuscatedName("i.a")
    public static int field636 = 0;

    @ObfuscatedName("i.q")
    public static int[] field650 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("i.m")
    public static int[] field638 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("i.k")
    public int field641;

    @ObfuscatedName("i.o")
    public int field640;

    @ObfuscatedName("i.f")
    public int field644;

    @ObfuscatedName("i.s")
    public String field642;

    @ObfuscatedName("i.z")
    public String field643;

    @ObfuscatedName("i.b")
    public int field651;

    @ObfuscatedName("i.p")
    public int field645;

    @ObfuscatedName("bm.d(III)V")
    public static void method1055(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field638[var5] != arg0) {
                var2[var4] = field638[var5];
                var3[var4] = field650[var5];
                var4++;
            }
        }
        field638 = var2;
        field650 = var3;
        method657(Statics.field634, 0, Statics.field634.length - 1, field638, field650);
    }

    @ObfuscatedName("ae.g([Li;II[I[IB)V")
    public static void method657(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class26 var8 = arg0[var7];
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
                        var11 = arg0[var6].field645;
                        var12 = var8.field645;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field644;
                        var12 = var8.field644;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method609() ? 1 : 0;
                        var12 = var8.method609() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field641;
                        var12 = var8.field641;
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
                        var15 = arg0[var5].field645;
                        var16 = var8.field645;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field644;
                        var16 = var8.field644;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method609() ? 1 : 0;
                        var16 = var8.method609() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field641;
                        var16 = var8.field641;
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
                class26 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method657(arg0, arg1, var6, arg3, arg4);
        method657(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ct.w(IIIZIZI)V")
    public static void method1927(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field634[var6];
        Statics.field634[var6] = Statics.field634[arg1];
        Statics.field634[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class26 var10 = Statics.field634[var9];
            int var11 = method872(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method872(var10, var8, arg4, arg5);
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
                class26 var14 = Statics.field634[var9];
                Statics.field634[var9] = Statics.field634[var7];
                Statics.field634[var7++] = var14;
            }
        }
        Statics.field634[arg1] = Statics.field634[var7];
        Statics.field634[var7] = var8;
        method1927(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1927(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("an.e(Li;Li;IZB)I")
    public static int method872(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field644;
            int var5 = arg1.field644;
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
            return arg0.field651 - arg1.field651;
        } else if (arg2 == 3) {
            if (arg0.field643.equals("-")) {
                if (arg1.field643.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field643.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field643.compareTo(arg1.field643);
            }
        } else if (arg2 == 4) {
            return arg0.method594() ? (arg1.method594() ? 0 : 1) : (arg1.method594() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method592() ? (arg1.method592() ? 0 : 1) : (arg1.method592() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method604() ? (arg1.method604() ? 0 : 1) : (arg1.method604() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method609() ? (arg1.method609() ? 0 : 1) : (arg1.method609() ? -1 : 0);
        } else {
            return arg0.field641 - arg1.field641;
        }
    }

    @ObfuscatedName("i.c(I)Z")
    public boolean method609() {
        return (0x1 & this.field640) != 0;
    }

    @ObfuscatedName("i.a(I)Z")
    public boolean method592() {
        return (0x2 & this.field640) != 0;
    }

    @ObfuscatedName("i.q(I)Z")
    public boolean method604() {
        return (0x4 & this.field640) != 0;
    }

    @ObfuscatedName("i.m(I)Z")
    public boolean method594() {
        return (0x8 & this.field640) != 0;
    }
}
