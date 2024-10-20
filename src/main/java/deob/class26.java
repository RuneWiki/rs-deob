package deob;

import java.net.URL;

@ObfuscatedName("x")
public class class26 {

    @ObfuscatedName("x.u")
    public static int field648 = 0;

    @ObfuscatedName("x.m")
    public static int field649 = 0;

    @ObfuscatedName("x.y")
    public static int[] field650 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("x.p")
    public static int[] field651 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("x.g")
    public int field652;

    @ObfuscatedName("x.v")
    public int field643;

    @ObfuscatedName("x.l")
    public int field655;

    @ObfuscatedName("x.e")
    public String field654;

    @ObfuscatedName("x.a")
    public String field656;

    @ObfuscatedName("x.w")
    public int field657;

    @ObfuscatedName("x.d")
    public int field658;

    @ObfuscatedName("r.o(I)Z")
    public static boolean method548() {
        try {
            if (Statics.field2654 == null) {
                Statics.field2654 = new class19(Statics.field2177, new URL(Statics.field1986));
            } else {
                byte[] var0 = Statics.field2654.method179();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field648 = var1.method2292();
                    Statics.field647 = new class26[field648];
                    int var2 = 0;
                    while (var2 < field648) {
                        class26 var3 = Statics.field647[var2] = new class26();
                        var3.field652 = var1.method2292();
                        var3.field643 = var1.method2295();
                        var3.field654 = var1.method2344();
                        var3.field656 = var1.method2344();
                        var3.field657 = var1.method2290();
                        var3.field655 = var1.method2293();
                        var3.field658 = var2++;
                    }
                    method2649(Statics.field647, 0, Statics.field647.length - 1, field651, field650);
                    Statics.field2654 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2654 = null;
        }
        return false;
    }

    @ObfuscatedName("g.f(IIB)V")
    public static void method113(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field651[var5] != arg0) {
                var2[var4] = field651[var5];
                var3[var4] = field650[var5];
                var4++;
            }
        }
        field651 = var2;
        field650 = var3;
        method2649(Statics.field647, 0, Statics.field647.length - 1, field651, field650);
    }

    @ObfuscatedName("eq.i([Lx;II[I[II)V")
    public static void method2649(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field658;
                        var12 = var8.field658;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field655;
                        var12 = var8.field655;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method576() ? 1 : 0;
                        var12 = var8.method576() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field652;
                        var12 = var8.field652;
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
                        var15 = arg0[var5].field655;
                        var16 = var8.field655;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method576() ? 1 : 0;
                        var16 = var8.method576() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field652;
                        var16 = var8.field652;
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
        method2649(arg0, arg1, var6, arg3, arg4);
        method2649(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("d.h(IZIZI)V")
    public static void method173(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field647 != null) {
            method2676(0, Statics.field647.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("er.q(IIIZIZI)V")
    public static void method2676(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field647[var6];
        Statics.field647[var6] = Statics.field647[arg1];
        Statics.field647[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method151(Statics.field647[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field647[var9];
                Statics.field647[var9] = Statics.field647[var7];
                Statics.field647[var7++] = var10;
            }
        }
        Statics.field647[arg1] = Statics.field647[var7];
        Statics.field647[var7] = var8;
        method2676(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2676(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("a.u(Lx;Lx;IZIZB)I")
    public static int method151(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method2(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method2(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("o.m(Lx;Lx;IZB)I")
    public static int method2(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field655;
            int var5 = arg1.field655;
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
            return arg0.field657 - arg1.field657;
        } else if (arg2 == 3) {
            if (arg0.field656.equals("-")) {
                if (arg1.field656.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field656.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field656.compareTo(arg1.field656);
            }
        } else if (arg2 == 4) {
            return arg0.method579() ? (arg1.method579() ? 0 : 1) : (arg1.method579() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method577() ? (arg1.method577() ? 0 : 1) : (arg1.method577() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method578() ? (arg1.method578() ? 0 : 1) : (arg1.method578() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method576() ? (arg1.method576() ? 0 : 1) : (arg1.method576() ? -1 : 0);
        } else {
            return arg0.field652 - arg1.field652;
        }
    }

    @ObfuscatedName("x.y(B)Z")
    public boolean method576() {
        return (0x1 & this.field643) != 0;
    }

    @ObfuscatedName("x.p(I)Z")
    public boolean method577() {
        return (0x2 & this.field643) != 0;
    }

    @ObfuscatedName("x.t(I)Z")
    public boolean method578() {
        return (0x4 & this.field643) != 0;
    }

    @ObfuscatedName("x.g(I)Z")
    public boolean method579() {
        return (0x8 & this.field643) != 0;
    }
}
