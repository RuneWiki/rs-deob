package deob;

import java.net.URL;

@ObfuscatedName("i")
public class class26 {

    @ObfuscatedName("i.m")
    public static int field645 = 0;

    @ObfuscatedName("i.b")
    public static int field653 = 0;

    @ObfuscatedName("i.p")
    public static int[] field644 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("i.t")
    public static int[] field638 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("i.x")
    public int field646;

    @ObfuscatedName("i.k")
    public int field642;

    @ObfuscatedName("i.z")
    public int field648;

    @ObfuscatedName("i.v")
    public String field657;

    @ObfuscatedName("i.j")
    public String field650;

    @ObfuscatedName("i.f")
    public int field651;

    @ObfuscatedName("i.c")
    public int field643;

    @ObfuscatedName("eu.l(B)Z")
    public static boolean method2956() {
        try {
            if (Statics.field2024 == null) {
                Statics.field2024 = new class19(Statics.field93, new URL(Statics.field671));
            } else {
                byte[] var0 = Statics.field2024.method190();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field645 = var1.method2440();
                    Statics.field660 = new class26[field645];
                    int var2 = 0;
                    while (var2 < field645) {
                        class26 var3 = Statics.field660[var2] = new class26();
                        var3.field646 = var1.method2440();
                        var3.field642 = var1.method2393();
                        var3.field657 = var1.method2396();
                        var3.field650 = var1.method2396();
                        var3.field651 = var1.method2388();
                        var3.field648 = var1.method2391();
                        var3.field643 = var2++;
                    }
                    method1534(Statics.field660, 0, Statics.field660.length - 1, field638, field644);
                    Statics.field2024 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2024 = null;
        }
        return false;
    }

    @ObfuscatedName("aa.e(III)V")
    public static void method974(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field638[var5] != arg0) {
                var2[var4] = field638[var5];
                var3[var4] = field644[var5];
                var4++;
            }
        }
        field638 = var2;
        field644 = var3;
        method1534(Statics.field660, 0, Statics.field660.length - 1, field638, field644);
    }

    @ObfuscatedName("bo.q([Li;II[I[IB)V")
    public static void method1534(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field643;
                        var12 = var8.field643;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field648;
                        var12 = var8.field648;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method607() ? 1 : 0;
                        var12 = var8.method607() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field646;
                        var12 = var8.field646;
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
                        var15 = arg0[var5].field643;
                        var16 = var8.field643;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field648;
                        var16 = var8.field648;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method607() ? 1 : 0;
                        var16 = var8.method607() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field646;
                        var16 = var8.field646;
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
        method1534(arg0, arg1, var6, arg3, arg4);
        method1534(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("fu.o(IIIZIZB)V")
    public static void method3291(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field660[var6];
        Statics.field660[var6] = Statics.field660[arg1];
        Statics.field660[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method724(Statics.field660[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field660[var9];
                Statics.field660[var9] = Statics.field660[var7];
                Statics.field660[var7++] = var10;
            }
        }
        Statics.field660[arg1] = Statics.field660[var7];
        Statics.field660[var7] = var8;
        method3291(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3291(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ar.g(Li;Li;IZIZB)I")
    public static int method724(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method667(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method667(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ao.m(Li;Li;IZB)I")
    public static int method667(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field648;
            int var5 = arg1.field648;
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
            if (arg0.field650.equals("-")) {
                if (arg1.field650.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field650.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field650.compareTo(arg1.field650);
            }
        } else if (arg2 == 4) {
            return arg0.method636() ? (arg1.method636() ? 0 : 1) : (arg1.method636() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method605() ? (arg1.method605() ? 0 : 1) : (arg1.method605() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method606() ? (arg1.method606() ? 0 : 1) : (arg1.method606() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method607() ? (arg1.method607() ? 0 : 1) : (arg1.method607() ? -1 : 0);
        } else {
            return arg0.field646 - arg1.field646;
        }
    }

    @ObfuscatedName("dl.b(I)Li;")
    public static class26 method2580() {
        return field653 < field645 ? Statics.field660[++field653 - 1] : null;
    }

    @ObfuscatedName("i.p(I)Z")
    public boolean method607() {
        return (0x1 & this.field642) != 0;
    }

    @ObfuscatedName("i.t(S)Z")
    public boolean method605() {
        return (0x2 & this.field642) != 0;
    }

    @ObfuscatedName("i.w(B)Z")
    public boolean method606() {
        return (0x4 & this.field642) != 0;
    }

    @ObfuscatedName("i.x(I)Z")
    public boolean method636() {
        return (0x8 & this.field642) != 0;
    }

    @ObfuscatedName("i.k(I)Z")
    public boolean method608() {
        return (0x20000000 & this.field642) != 0;
    }
}
