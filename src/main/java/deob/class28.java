package deob;

import java.net.URL;

@ObfuscatedName("al")
public class class28 {

    @ObfuscatedName("al.j")
    public static int field657 = 0;

    @ObfuscatedName("al.m")
    public static int field644 = 0;

    @ObfuscatedName("al.y")
    public static int[] field645 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("al.u")
    public static int[] field646 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("al.l")
    public int field647;

    @ObfuscatedName("al.b")
    public int field649;

    @ObfuscatedName("al.g")
    public int field656;

    @ObfuscatedName("al.e")
    public String field650;

    @ObfuscatedName("al.p")
    public String field648;

    @ObfuscatedName("al.s")
    public int field655;

    @ObfuscatedName("al.w")
    public int field653;

    @ObfuscatedName("j.k(I)Z")
    public static boolean method51() {
        try {
            if (Statics.field1623 == null) {
                Statics.field1623 = new class19(Statics.field700, new URL(Statics.field285));
            } else {
                byte[] var0 = Statics.field1623.method178();
                if (var0 != null) {
                    class123 var1 = new class123(var0);
                    field657 = var1.method2547();
                    Statics.field1172 = new class28[field657];
                    int var2 = 0;
                    while (var2 < field657) {
                        class28 var3 = Statics.field1172[var2] = new class28();
                        var3.field647 = var1.method2547();
                        var3.field649 = var1.method2432();
                        var3.field650 = var1.method2435();
                        var3.field648 = var1.method2435();
                        var3.field655 = var1.method2427();
                        var3.field656 = var1.method2430();
                        var3.field653 = var2++;
                    }
                    method3023(Statics.field1172, 0, Statics.field1172.length - 1, field646, field645);
                    Statics.field1623 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1623 = null;
        }
        return false;
    }

    @ObfuscatedName("hx.q(III)V")
    public static void method3746(int arg0, int arg1) {
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
        method3023(Statics.field1172, 0, Statics.field1172.length - 1, field646, field645);
    }

    @ObfuscatedName("fn.f([Lal;II[I[II)V")
    public static void method3023(class28[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field653;
                        var12 = var8.field653;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field656;
                        var12 = var8.field656;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method612() ? 1 : 0;
                        var12 = var8.method612() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field647;
                        var12 = var8.field647;
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
                        var15 = arg0[var5].field656;
                        var16 = var8.field656;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method612() ? 1 : 0;
                        var16 = var8.method612() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field647;
                        var16 = var8.field647;
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
        method3023(arg0, arg1, var6, arg3, arg4);
        method3023(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("r.c(IIIZIZB)V")
    public static void method175(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class28 var8 = Statics.field1172[var6];
        Statics.field1172[var6] = Statics.field1172[arg1];
        Statics.field1172[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method3753(Statics.field1172[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class28 var10 = Statics.field1172[var9];
                Statics.field1172[var9] = Statics.field1172[var7];
                Statics.field1172[var7++] = var10;
            }
        }
        Statics.field1172[arg1] = Statics.field1172[var7];
        Statics.field1172[var7] = var8;
        method175(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method175(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("hw.v(Lal;Lal;IZIZI)I")
    public static int method3753(class28 arg0, class28 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method136(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method136(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("g.j(Lal;Lal;IZB)I")
    public static int method136(class28 arg0, class28 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field656;
            int var5 = arg1.field656;
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
            return arg0.field655 - arg1.field655;
        } else if (arg2 == 3) {
            if (arg0.field648.equals("-")) {
                if (arg1.field648.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field648.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field648.compareTo(arg1.field648);
            }
        } else if (arg2 == 4) {
            return arg0.method615() ? (arg1.method615() ? 0 : 1) : (arg1.method615() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method613() ? (arg1.method613() ? 0 : 1) : (arg1.method613() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method640() ? (arg1.method640() ? 0 : 1) : (arg1.method640() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method612() ? (arg1.method612() ? 0 : 1) : (arg1.method612() ? -1 : 0);
        } else {
            return arg0.field647 - arg1.field647;
        }
    }

    @ObfuscatedName("al.m(I)Z")
    public boolean method612() {
        return (0x1 & this.field649) != 0;
    }

    @ObfuscatedName("al.y(B)Z")
    public boolean method613() {
        return (0x2 & this.field649) != 0;
    }

    @ObfuscatedName("al.u(S)Z")
    public boolean method640() {
        return (0x4 & this.field649) != 0;
    }

    @ObfuscatedName("al.h(B)Z")
    public boolean method615() {
        return (0x8 & this.field649) != 0;
    }

    @ObfuscatedName("al.l(B)Z")
    public boolean method616() {
        return (0x20000000 & this.field649) != 0;
    }

    @ObfuscatedName("al.b(I)Z")
    public boolean method617() {
        return (0x2000000 & this.field649) != 0;
    }
}
