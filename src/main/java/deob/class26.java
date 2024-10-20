package deob;

import java.net.URL;

@ObfuscatedName("b")
public class class26 {

    @ObfuscatedName("b.a")
    public static int field617 = 0;

    @ObfuscatedName("b.h")
    public static int field624 = 0;

    @ObfuscatedName("b.i")
    public static int[] field633 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("b.t")
    public static int[] field620 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("b.s")
    public int field622;

    @ObfuscatedName("b.w")
    public int field623;

    @ObfuscatedName("b.e")
    public int field630;

    @ObfuscatedName("b.z")
    public String field625;

    @ObfuscatedName("b.p")
    public String field634;

    @ObfuscatedName("b.r")
    public int field627;

    @ObfuscatedName("b.g")
    public int field628;

    @ObfuscatedName("ft.j(I)Z")
    public static boolean method2998() {
        try {
            if (Statics.field621 == null) {
                Statics.field621 = new class19(Statics.field631, new URL(Statics.field185));
            } else {
                byte[] var0 = Statics.field621.method209();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field617 = var1.method2374();
                    Statics.field616 = new class26[field617];
                    int var2 = 0;
                    while (var2 < field617) {
                        class26 var3 = Statics.field616[var2] = new class26();
                        var3.field622 = var1.method2374();
                        var3.field623 = var1.method2377();
                        var3.field625 = var1.method2380();
                        var3.field634 = var1.method2380();
                        var3.field627 = var1.method2372();
                        var3.field630 = var1.method2375();
                        var3.field628 = var2++;
                    }
                    method2155(Statics.field616, 0, Statics.field616.length - 1, field620, field633);
                    Statics.field621 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field621 = null;
        }
        return false;
    }

    @ObfuscatedName("cs.f([Lb;II[I[II)V")
    public static void method2155(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field628;
                        var12 = var8.field628;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field630;
                        var12 = var8.field630;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method651() ? 1 : 0;
                        var12 = var8.method651() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field622;
                        var12 = var8.field622;
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
                        var15 = arg0[var5].field628;
                        var16 = var8.field628;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field630;
                        var16 = var8.field630;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method651() ? 1 : 0;
                        var16 = var8.method651() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field622;
                        var16 = var8.field622;
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
        method2155(arg0, arg1, var6, arg3, arg4);
        method2155(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("as.l(IZIZI)V")
    public static void method682(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field616 != null) {
            method181(0, Statics.field616.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("e.u(IIIZIZI)V")
    public static void method181(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field616[var6];
        Statics.field616[var6] = Statics.field616[arg1];
        Statics.field616[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2152(Statics.field616[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field616[var9];
                Statics.field616[var9] = Statics.field616[var7];
                Statics.field616[var7++] = var10;
            }
        }
        Statics.field616[arg1] = Statics.field616[var7];
        Statics.field616[var7] = var8;
        method181(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method181(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cu.a(Lb;Lb;IZIZI)I")
    public static int method2152(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method2691(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method2691(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("dx.h(Lb;Lb;IZB)I")
    public static int method2691(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field630;
            int var5 = arg1.field630;
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
            return arg0.field627 - arg1.field627;
        } else if (arg2 == 3) {
            if (arg0.field634.equals("-")) {
                if (arg1.field634.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field634.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field634.compareTo(arg1.field634);
            }
        } else if (arg2 == 4) {
            return arg0.method663() ? (arg1.method663() ? 0 : 1) : (arg1.method663() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method635() ? (arg1.method635() ? 0 : 1) : (arg1.method635() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method634() ? (arg1.method634() ? 0 : 1) : (arg1.method634() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method651() ? (arg1.method651() ? 0 : 1) : (arg1.method651() ? -1 : 0);
        } else {
            return arg0.field622 - arg1.field622;
        }
    }

    @ObfuscatedName("n.i(I)Lb;")
    public static class26 method205() {
        return field624 < field617 ? Statics.field616[++field624 - 1] : null;
    }

    @ObfuscatedName("b.t(I)Z")
    public boolean method651() {
        return (0x1 & this.field623) != 0;
    }

    @ObfuscatedName("b.k(I)Z")
    public boolean method635() {
        return (0x2 & this.field623) != 0;
    }

    @ObfuscatedName("b.s(I)Z")
    public boolean method634() {
        return (0x4 & this.field623) != 0;
    }

    @ObfuscatedName("b.w(B)Z")
    public boolean method663() {
        return (0x8 & this.field623) != 0;
    }

    @ObfuscatedName("b.e(B)Z")
    public boolean method636() {
        return (0x20000000 & this.field623) != 0;
    }
}
