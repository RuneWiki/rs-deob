package deob;

import java.net.URL;

@ObfuscatedName("o")
public class class26 {

    @ObfuscatedName("o.l")
    public static int field627 = 0;

    @ObfuscatedName("o.r")
    public static int field625 = 0;

    @ObfuscatedName("o.g")
    public static int[] field629 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("o.h")
    public static int[] field630 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("o.j")
    public int field632;

    @ObfuscatedName("o.a")
    public int field638;

    @ObfuscatedName("o.b")
    public int field628;

    @ObfuscatedName("o.c")
    public String field635;

    @ObfuscatedName("o.v")
    public String field636;

    @ObfuscatedName("o.p")
    public int field637;

    @ObfuscatedName("o.i")
    public int field634;

    @ObfuscatedName("ej.z(I)Z")
    public static boolean method2762() {
        try {
            if (Statics.field622 == null) {
                Statics.field622 = new class19(Statics.field606, new URL(Statics.field3165));
            } else {
                byte[] var0 = Statics.field622.method182();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field627 = var1.method2415();
                    Statics.field626 = new class26[field627];
                    int var2 = 0;
                    while (var2 < field627) {
                        class26 var3 = Statics.field626[var2] = new class26();
                        var3.field632 = var1.method2415();
                        var3.field638 = var1.method2306();
                        var3.field635 = var1.method2309();
                        var3.field636 = var1.method2309();
                        var3.field637 = var1.method2457();
                        var3.field628 = var1.method2494();
                        var3.field634 = var2++;
                    }
                    method1992(Statics.field626, 0, Statics.field626.length - 1, field630, field629);
                    Statics.field622 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field622 = null;
        }
        return false;
    }

    @ObfuscatedName("q.q(III)V")
    public static void method13(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field630[var5] != arg0) {
                var2[var4] = field630[var5];
                var3[var4] = field629[var5];
                var4++;
            }
        }
        field630 = var2;
        field629 = var3;
        method1992(Statics.field626, 0, Statics.field626.length - 1, field630, field629);
    }

    @ObfuscatedName("cx.k([Lo;II[I[IB)V")
    public static void method1992(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field634;
                        var12 = var8.field634;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field628;
                        var12 = var8.field628;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method591() ? 1 : 0;
                        var12 = var8.method591() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field632;
                        var12 = var8.field632;
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
                        var15 = arg0[var5].field634;
                        var16 = var8.field634;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field628;
                        var16 = var8.field628;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method591() ? 1 : 0;
                        var16 = var8.method591() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field632;
                        var16 = var8.field632;
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
        method1992(arg0, arg1, var6, arg3, arg4);
        method1992(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("by.f(IIIZIZB)V")
    public static void method1443(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field626[var6];
        Statics.field626[var6] = Statics.field626[arg1];
        Statics.field626[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method974(Statics.field626[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field626[var9];
                Statics.field626[var9] = Statics.field626[var7];
                Statics.field626[var7++] = var10;
            }
        }
        Statics.field626[arg1] = Statics.field626[var7];
        Statics.field626[var7] = var8;
        method1443(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1443(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ag.d(Lo;Lo;IZIZI)I")
    public static int method974(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method566(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method566(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("y.l(Lo;Lo;IZI)I")
    public static int method566(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field628;
            int var5 = arg1.field628;
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
            return arg0.field637 - arg1.field637;
        } else if (arg2 == 3) {
            if (arg0.field636.equals("-")) {
                if (arg1.field636.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field636.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field636.compareTo(arg1.field636);
            }
        } else if (arg2 == 4) {
            return arg0.method573() ? (arg1.method573() ? 0 : 1) : (arg1.method573() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method571() ? (arg1.method571() ? 0 : 1) : (arg1.method571() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method594() ? (arg1.method594() ? 0 : 1) : (arg1.method594() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method591() ? (arg1.method591() ? 0 : 1) : (arg1.method591() ? -1 : 0);
        } else {
            return arg0.field632 - arg1.field632;
        }
    }

    @ObfuscatedName("o.r(B)Z")
    public boolean method591() {
        return (0x1 & this.field638) != 0;
    }

    @ObfuscatedName("o.g(I)Z")
    public boolean method571() {
        return (0x2 & this.field638) != 0;
    }

    @ObfuscatedName("o.h(S)Z")
    public boolean method594() {
        return (0x4 & this.field638) != 0;
    }

    @ObfuscatedName("o.n(I)Z")
    public boolean method573() {
        return (0x8 & this.field638) != 0;
    }
}
