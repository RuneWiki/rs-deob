package deob;

import java.net.URL;

@ObfuscatedName("c")
public class class26 {

    @ObfuscatedName("c.w")
    public static int field647 = 0;

    @ObfuscatedName("c.u")
    public static int field655 = 0;

    @ObfuscatedName("c.a")
    public static int[] field651 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("c.e")
    public static int[] field646 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("c.o")
    public int field656;

    @ObfuscatedName("c.m")
    public int field648;

    @ObfuscatedName("c.x")
    public int field649;

    @ObfuscatedName("c.k")
    public String field650;

    @ObfuscatedName("c.n")
    public String field639;

    @ObfuscatedName("c.j")
    public int field653;

    @ObfuscatedName("c.t")
    public int field645;

    @ObfuscatedName("k.d(I)Z")
    public static boolean method161() {
        try {
            if (Statics.field2249 == null) {
                Statics.field2249 = new class19(Statics.field2001, new URL(Statics.field295));
            } else {
                byte[] var0 = Statics.field2249.method196();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field647 = var1.method2359();
                    Statics.field642 = new class26[field647];
                    int var2 = 0;
                    while (var2 < field647) {
                        class26 var3 = Statics.field642[var2] = new class26();
                        var3.field656 = var1.method2359();
                        var3.field648 = var1.method2362();
                        var3.field650 = var1.method2365();
                        var3.field639 = var1.method2365();
                        var3.field653 = var1.method2357();
                        var3.field649 = var1.method2360();
                        var3.field645 = var2++;
                    }
                    method2983(Statics.field642, 0, Statics.field642.length - 1, field646, field651);
                    Statics.field2249 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2249 = null;
        }
        return false;
    }

    @ObfuscatedName("aq.p(III)V")
    public static void method823(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field646[var5] != arg0) {
                var2[var4] = field646[var5];
                var3[var4] = field651[var5];
                var4++;
            }
        }
        field646 = var2;
        field651 = var3;
        method2983(Statics.field642, 0, Statics.field642.length - 1, field646, field651);
    }

    @ObfuscatedName("er.v([Lc;II[I[II)V")
    public static void method2983(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field649;
                        var12 = var8.field649;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method581() ? 1 : 0;
                        var12 = var8.method581() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field656;
                        var12 = var8.field656;
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
                        var15 = arg0[var5].field649;
                        var16 = var8.field649;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method581() ? 1 : 0;
                        var16 = var8.method581() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field656;
                        var16 = var8.field656;
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
        method2983(arg0, arg1, var6, arg3, arg4);
        method2983(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("r.l(IIIZIZI)V")
    public static void method561(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field642[var6];
        Statics.field642[var6] = Statics.field642[arg1];
        Statics.field642[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method563(Statics.field642[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field642[var9];
                Statics.field642[var9] = Statics.field642[var7];
                Statics.field642[var7++] = var10;
            }
        }
        Statics.field642[arg1] = Statics.field642[var7];
        Statics.field642[var7] = var8;
        method561(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method561(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("r.y(Lc;Lc;IZIZI)I")
    public static int method563(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method2239(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method2239(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("dm.w(Lc;Lc;IZB)I")
    public static int method2239(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field649;
            int var5 = arg1.field649;
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
            return arg0.field653 - arg1.field653;
        } else if (arg2 == 3) {
            if (arg0.field639.equals("-")) {
                if (arg1.field639.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field639.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field639.compareTo(arg1.field639);
            }
        } else if (arg2 == 4) {
            return arg0.method584() ? (arg1.method584() ? 0 : 1) : (arg1.method584() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method582() ? (arg1.method582() ? 0 : 1) : (arg1.method582() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method583() ? (arg1.method583() ? 0 : 1) : (arg1.method583() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method581() ? (arg1.method581() ? 0 : 1) : (arg1.method581() ? -1 : 0);
        } else {
            return arg0.field656 - arg1.field656;
        }
    }

    @ObfuscatedName("aw.u(B)Lc;")
    public static class26 method697() {
        field655 = 0;
        class26 var0;
        if (field655 < field647) {
            var0 = Statics.field642[++field655 - 1];
        } else {
            var0 = null;
        }
        return var0;
    }

    @ObfuscatedName("c.a(I)Z")
    public boolean method581() {
        return (0x1 & this.field648) != 0;
    }

    @ObfuscatedName("c.e(I)Z")
    public boolean method582() {
        return (0x2 & this.field648) != 0;
    }

    @ObfuscatedName("c.b(I)Z")
    public boolean method583() {
        return (0x4 & this.field648) != 0;
    }

    @ObfuscatedName("c.o(I)Z")
    public boolean method584() {
        return (0x8 & this.field648) != 0;
    }

    @ObfuscatedName("c.m(I)Z")
    public boolean method585() {
        return (0x20000000 & this.field648) != 0;
    }
}
