package deob;

import java.net.URL;

@ObfuscatedName("an")
public class class28 {

    @ObfuscatedName("an.l")
    public static int field647 = 0;

    @ObfuscatedName("an.j")
    public static int field662 = 0;

    @ObfuscatedName("an.r")
    public static int[] field649 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("an.x")
    public static int[] field650 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("an.v")
    public int field651;

    @ObfuscatedName("an.h")
    public int field652;

    @ObfuscatedName("an.u")
    public int field653;

    @ObfuscatedName("an.y")
    public String field655;

    @ObfuscatedName("an.p")
    public String field646;

    @ObfuscatedName("an.s")
    public int field656;

    @ObfuscatedName("an.f")
    public int field657;

    @ObfuscatedName("i.m(B)Z")
    public static boolean method177() {
        try {
            if (Statics.field3229 == null) {
                Statics.field3229 = new class19(Statics.field901, new URL(Statics.field474));
            } else {
                byte[] var0 = Statics.field3229.method180();
                if (var0 != null) {
                    class123 var1 = new class123(var0);
                    field647 = var1.method2548();
                    Statics.field3211 = new class28[field647];
                    int var2 = 0;
                    while (var2 < field647) {
                        class28 var3 = Statics.field3211[var2] = new class28();
                        var3.field651 = var1.method2548();
                        var3.field652 = var1.method2419();
                        var3.field655 = var1.method2422();
                        var3.field646 = var1.method2422();
                        var3.field656 = var1.method2398();
                        var3.field653 = var1.method2417();
                        var3.field657 = var2++;
                    }
                    method2136(Statics.field3211, 0, Statics.field3211.length - 1, field650, field649);
                    Statics.field3229 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3229 = null;
        }
        return false;
    }

    @ObfuscatedName("cw.e([Lan;II[I[IB)V")
    public static void method2136(class28[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field657;
                        var12 = var8.field657;
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
                        var11 = arg0[var6].method605() ? 1 : 0;
                        var12 = var8.method605() ? 1 : 0;
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
                        var15 = arg0[var5].field657;
                        var16 = var8.field657;
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
                        var15 = arg0[var5].method605() ? 1 : 0;
                        var16 = var8.method605() ? 1 : 0;
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
        method2136(arg0, arg1, var6, arg3, arg4);
        method2136(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("o.o(IIIZIZI)V")
    public static void method40(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class28 var8 = Statics.field3211[var6];
        Statics.field3211[var6] = Statics.field3211[arg1];
        Statics.field3211[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class28 var10 = Statics.field3211[var9];
            int var11 = method2909(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method2909(var10, var8, arg4, arg5);
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
                class28 var14 = Statics.field3211[var9];
                Statics.field3211[var9] = Statics.field3211[var7];
                Statics.field3211[var7++] = var14;
            }
        }
        Statics.field3211[arg1] = Statics.field3211[var7];
        Statics.field3211[var7] = var8;
        method40(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method40(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ez.g(Lan;Lan;IZB)I")
    public static int method2909(class28 arg0, class28 arg1, int arg2, boolean arg3) {
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
            return arg0.field656 - arg1.field656;
        } else if (arg2 == 3) {
            if (arg0.field646.equals("-")) {
                if (arg1.field646.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field646.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field646.compareTo(arg1.field646);
            }
        } else if (arg2 == 4) {
            return arg0.method608() ? (arg1.method608() ? 0 : 1) : (arg1.method608() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method609() ? (arg1.method609() ? 0 : 1) : (arg1.method609() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method607() ? (arg1.method607() ? 0 : 1) : (arg1.method607() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method605() ? (arg1.method605() ? 0 : 1) : (arg1.method605() ? -1 : 0);
        } else {
            return arg0.field651 - arg1.field651;
        }
    }

    @ObfuscatedName("aa.j(B)Lan;")
    public static class28 method659() {
        return field662 < field647 ? Statics.field3211[++field662 - 1] : null;
    }

    @ObfuscatedName("an.r(B)Z")
    public boolean method605() {
        return (0x1 & this.field652) != 0;
    }

    @ObfuscatedName("an.x(B)Z")
    public boolean method609() {
        return (0x2 & this.field652) != 0;
    }

    @ObfuscatedName("an.k(I)Z")
    public boolean method607() {
        return (0x4 & this.field652) != 0;
    }

    @ObfuscatedName("an.v(B)Z")
    public boolean method608() {
        return (0x8 & this.field652) != 0;
    }

    @ObfuscatedName("an.h(B)Z")
    public boolean method613() {
        return (0x20000000 & this.field652) != 0;
    }

    @ObfuscatedName("an.u(I)Z")
    public boolean method621() {
        return (0x2000000 & this.field652) != 0;
    }
}
