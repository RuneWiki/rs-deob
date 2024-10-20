package deob;

@ObfuscatedName("b")
public class class26 {

    @ObfuscatedName("b.y")
    public static int field643 = 0;

    @ObfuscatedName("b.m")
    public static int field644 = 0;

    @ObfuscatedName("b.c")
    public static int[] field645 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("b.v")
    public static int[] field646 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("b.z")
    public int field651;

    @ObfuscatedName("b.s")
    public int field648;

    @ObfuscatedName("b.j")
    public int field639;

    @ObfuscatedName("b.q")
    public String field650;

    @ObfuscatedName("b.a")
    public String field640;

    @ObfuscatedName("b.d")
    public int field649;

    @ObfuscatedName("b.u")
    public int field653;

    @ObfuscatedName("q.x(III)V")
    public static void method157(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field646[var5] != arg0) {
                var2[var4] = field646[var5];
                var3[var4] = field645[var5];
                var4++;
            }
        }
        field646 = var2;
        field645 = var3;
        method173(Statics.field3063, 0, Statics.field3063.length - 1, field646, field645);
    }

    @ObfuscatedName("d.t([Lb;II[I[II)V")
    public static void method173(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field653;
                        var12 = var8.field653;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field639;
                        var12 = var8.field639;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method632() ? 1 : 0;
                        var12 = var8.method632() ? 1 : 0;
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
                        var15 = arg0[var5].field653;
                        var16 = var8.field653;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field639;
                        var16 = var8.field639;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method632() ? 1 : 0;
                        var16 = var8.method632() ? 1 : 0;
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
                class26 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method173(arg0, arg1, var6, arg3, arg4);
        method173(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("p.p(IIIZIZI)V")
    public static void method43(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field3063[var6];
        Statics.field3063[var6] = Statics.field3063[arg1];
        Statics.field3063[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method1957(Statics.field3063[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field3063[var9];
                Statics.field3063[var9] = Statics.field3063[var7];
                Statics.field3063[var7++] = var10;
            }
        }
        Statics.field3063[arg1] = Statics.field3063[var7];
        Statics.field3063[var7] = var8;
        method43(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method43(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cn.e(Lb;Lb;IZIZI)I")
    public static int method1957(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method763(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method763(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("al.y(Lb;Lb;IZI)I")
    public static int method763(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field639;
            int var5 = arg1.field639;
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
            return arg0.field649 - arg1.field649;
        } else if (arg2 == 3) {
            if (arg0.field640.equals("-")) {
                if (arg1.field640.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field640.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field640.compareTo(arg1.field640);
            }
        } else if (arg2 == 4) {
            return arg0.method639() ? (arg1.method639() ? 0 : 1) : (arg1.method639() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method610() ? (arg1.method610() ? 0 : 1) : (arg1.method610() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method619() ? (arg1.method619() ? 0 : 1) : (arg1.method619() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method632() ? (arg1.method632() ? 0 : 1) : (arg1.method632() ? -1 : 0);
        } else {
            return arg0.field651 - arg1.field651;
        }
    }

    @ObfuscatedName("p.m(I)Lb;")
    public static class26 method48() {
        return field644 < field643 ? Statics.field3063[++field644 - 1] : null;
    }

    @ObfuscatedName("b.c(I)Z")
    public boolean method632() {
        return (0x1 & this.field648) != 0;
    }

    @ObfuscatedName("b.v(I)Z")
    public boolean method610() {
        return (0x2 & this.field648) != 0;
    }

    @ObfuscatedName("b.l(I)Z")
    public boolean method619() {
        return (0x4 & this.field648) != 0;
    }

    @ObfuscatedName("b.z(B)Z")
    public boolean method639() {
        return (0x8 & this.field648) != 0;
    }

    @ObfuscatedName("b.s(I)Z")
    public boolean method614() {
        return (0x20000000 & this.field648) != 0;
    }

    @ObfuscatedName("b.j(B)Z")
    public boolean method623() {
        return (0x2000000 & this.field648) != 0;
    }
}
