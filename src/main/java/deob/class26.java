package deob;

import java.net.URL;

@ObfuscatedName("g")
public class class26 {

    @ObfuscatedName("g.c")
    public static int field636 = 0;

    @ObfuscatedName("g.p")
    public static int field637 = 0;

    @ObfuscatedName("g.j")
    public static int[] field651 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("g.a")
    public static int[] field639 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("g.h")
    public int field640;

    @ObfuscatedName("g.z")
    public int field632;

    @ObfuscatedName("g.w")
    public int field642;

    @ObfuscatedName("g.l")
    public String field643;

    @ObfuscatedName("g.q")
    public String field644;

    @ObfuscatedName("g.x")
    public int field631;

    @ObfuscatedName("g.s")
    public int field646;

    @ObfuscatedName("bc.v(I)Z")
    public static boolean method1157() {
        try {
            if (Statics.field3126 == null) {
                Statics.field3126 = new class19(Statics.field2031, new URL(Statics.field219));
            } else {
                byte[] var0 = Statics.field3126.method198();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field636 = var1.method2334();
                    Statics.field638 = new class26[field636];
                    int var2 = 0;
                    while (var2 < field636) {
                        class26 var3 = Statics.field638[var2] = new class26();
                        var3.field640 = var1.method2334();
                        var3.field632 = var1.method2354();
                        var3.field643 = var1.method2357();
                        var3.field644 = var1.method2357();
                        var3.field631 = var1.method2400();
                        var3.field642 = var1.method2538();
                        var3.field646 = var2++;
                    }
                    method541(Statics.field638, 0, Statics.field638.length - 1, field639, field651);
                    Statics.field3126 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3126 = null;
        }
        return false;
    }

    @ObfuscatedName("c.f(IIB)V")
    public static void method84(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field639[var5] != arg0) {
                var2[var4] = field639[var5];
                var3[var4] = field651[var5];
                var4++;
            }
        }
        field639 = var2;
        field651 = var3;
        method541(Statics.field638, 0, Statics.field638.length - 1, field639, field651);
    }

    @ObfuscatedName("e.i([Lg;II[I[II)V")
    public static void method541(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field646;
                        var12 = var8.field646;
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
                        var11 = arg0[var6].method599() ? 1 : 0;
                        var12 = var8.method599() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field640;
                        var12 = var8.field640;
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
                        var15 = arg0[var5].field646;
                        var16 = var8.field646;
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
                        var15 = arg0[var5].method599() ? 1 : 0;
                        var16 = var8.method599() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field640;
                        var16 = var8.field640;
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
        method541(arg0, arg1, var6, arg3, arg4);
        method541(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ac.d(IZIZI)V")
    public static void method769(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field638 != null) {
            method888(0, Statics.field638.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("am.o(IIIZIZB)V")
    public static void method888(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field638[var6];
        Statics.field638[var6] = Statics.field638[arg1];
        Statics.field638[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2714(Statics.field638[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field638[var9];
                Statics.field638[var9] = Statics.field638[var7];
                Statics.field638[var7++] = var10;
            }
        }
        Statics.field638[arg1] = Statics.field638[var7];
        Statics.field638[var7] = var8;
        method888(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method888(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ed.c(Lg;Lg;IZIZI)I")
    public static int method2714(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method2919(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method2919(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ek.p(Lg;Lg;IZB)I")
    public static int method2919(class26 arg0, class26 arg1, int arg2, boolean arg3) {
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
            return arg0.field631 - arg1.field631;
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
            return arg0.method581() ? (arg1.method581() ? 0 : 1) : (arg1.method581() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method610() ? (arg1.method610() ? 0 : 1) : (arg1.method610() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method579() ? (arg1.method579() ? 0 : 1) : (arg1.method579() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method599() ? (arg1.method599() ? 0 : 1) : (arg1.method599() ? -1 : 0);
        } else {
            return arg0.field640 - arg1.field640;
        }
    }

    @ObfuscatedName("aw.j(I)Lg;")
    public static class26 method705() {
        field637 = 0;
        class26 var0;
        if (field637 < field636) {
            var0 = Statics.field638[++field637 - 1];
        } else {
            var0 = null;
        }
        return var0;
    }

    @ObfuscatedName("g.a(S)Z")
    public boolean method599() {
        return (0x1 & this.field632) != 0;
    }

    @ObfuscatedName("g.y(I)Z")
    public boolean method610() {
        return (0x2 & this.field632) != 0;
    }

    @ObfuscatedName("g.h(B)Z")
    public boolean method579() {
        return (0x4 & this.field632) != 0;
    }

    @ObfuscatedName("g.z(B)Z")
    public boolean method581() {
        return (0x8 & this.field632) != 0;
    }

    @ObfuscatedName("g.w(I)Z")
    public boolean method582() {
        return (0x20000000 & this.field632) != 0;
    }

    @ObfuscatedName("g.l(B)Z")
    public boolean method591() {
        return (0x2000000 & this.field632) != 0;
    }
}
