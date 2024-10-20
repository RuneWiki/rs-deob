package deob;

import java.net.URL;

@ObfuscatedName("x")
public class class26 {

    @ObfuscatedName("x.s")
    public static int field648 = 0;

    @ObfuscatedName("x.y")
    public static int field651 = 0;

    @ObfuscatedName("x.t")
    public static int[] field632 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("x.w")
    public static int[] field639 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("x.d")
    public int field653;

    @ObfuscatedName("x.l")
    public int field641;

    @ObfuscatedName("x.n")
    public int field642;

    @ObfuscatedName("x.q")
    public String field636;

    @ObfuscatedName("x.f")
    public String field644;

    @ObfuscatedName("x.v")
    public int field645;

    @ObfuscatedName("x.a")
    public int field640;

    @ObfuscatedName("y.o(I)Z")
    public static boolean method91() {
        try {
            if (Statics.field3154 == null) {
                Statics.field3154 = new class19(Statics.field2024, new URL(Statics.field2163));
            } else {
                byte[] var0 = Statics.field3154.method198();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field648 = var1.method2339();
                    Statics.field638 = new class26[field648];
                    int var2 = 0;
                    while (var2 < field648) {
                        class26 var3 = Statics.field638[var2] = new class26();
                        var3.field653 = var1.method2339();
                        var3.field641 = var1.method2342();
                        var3.field636 = var1.method2528();
                        var3.field644 = var1.method2528();
                        var3.field645 = var1.method2427();
                        var3.field642 = var1.method2340();
                        var3.field640 = var2++;
                    }
                    method87(Statics.field638, 0, Statics.field638.length - 1, field639, field632);
                    Statics.field3154 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3154 = null;
        }
        return false;
    }

    @ObfuscatedName("da.e(III)V")
    public static void method2216(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field639[var5] != arg0) {
                var2[var4] = field639[var5];
                var3[var4] = field632[var5];
                var4++;
            }
        }
        field639 = var2;
        field632 = var3;
        method87(Statics.field638, 0, Statics.field638.length - 1, field639, field632);
    }

    @ObfuscatedName("s.u([Lx;II[I[IB)V")
    public static void method87(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field640;
                        var12 = var8.field640;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field642;
                        var12 = var8.field642;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method606() ? 1 : 0;
                        var12 = var8.method606() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field653;
                        var12 = var8.field653;
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
                        var15 = arg0[var5].field640;
                        var16 = var8.field640;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field642;
                        var16 = var8.field642;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method606() ? 1 : 0;
                        var16 = var8.method606() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field653;
                        var16 = var8.field653;
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
        method87(arg0, arg1, var6, arg3, arg4);
        method87(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("x.b(IIIZIZI)V")
    public static void method642(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field638[var6];
        Statics.field638[var6] = Statics.field638[arg1];
        Statics.field638[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class26 var10 = Statics.field638[var9];
            int var11 = method2022(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method2022(var10, var8, arg4, arg5);
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
                class26 var14 = Statics.field638[var9];
                Statics.field638[var9] = Statics.field638[var7];
                Statics.field638[var7++] = var14;
            }
        }
        Statics.field638[arg1] = Statics.field638[var7];
        Statics.field638[var7] = var8;
        method642(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method642(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cz.p(Lx;Lx;IZI)I")
    public static int method2022(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field642;
            int var5 = arg1.field642;
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
            return arg0.field645 - arg1.field645;
        } else if (arg2 == 3) {
            if (arg0.field644.equals("-")) {
                if (arg1.field644.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field644.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field644.compareTo(arg1.field644);
            }
        } else if (arg2 == 4) {
            return arg0.method608() ? (arg1.method608() ? 0 : 1) : (arg1.method608() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method616() ? (arg1.method616() ? 0 : 1) : (arg1.method616() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method635() ? (arg1.method635() ? 0 : 1) : (arg1.method635() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method606() ? (arg1.method606() ? 0 : 1) : (arg1.method606() ? -1 : 0);
        } else {
            return arg0.field653 - arg1.field653;
        }
    }

    @ObfuscatedName("es.s(I)Lx;")
    public static class26 method2949() {
        return field651 < field648 ? Statics.field638[++field651 - 1] : null;
    }

    @ObfuscatedName("x.y(I)Z")
    public boolean method606() {
        return (0x1 & this.field641) != 0;
    }

    @ObfuscatedName("x.t(B)Z")
    public boolean method616() {
        return (0x2 & this.field641) != 0;
    }

    @ObfuscatedName("x.w(I)Z")
    public boolean method635() {
        return (0x4 & this.field641) != 0;
    }

    @ObfuscatedName("x.h(I)Z")
    public boolean method608() {
        return (0x8 & this.field641) != 0;
    }

    @ObfuscatedName("x.d(I)Z")
    public boolean method609() {
        return (0x20000000 & this.field641) != 0;
    }
}
