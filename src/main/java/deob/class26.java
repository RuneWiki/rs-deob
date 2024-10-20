package deob;

import java.net.URL;

@ObfuscatedName("w")
public class class26 {

    @ObfuscatedName("w.k")
    public static int field611 = 0;

    @ObfuscatedName("w.i")
    public static int field625 = 0;

    @ObfuscatedName("w.m")
    public static int[] field612 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("w.p")
    public static int[] field606 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("w.e")
    public int field618;

    @ObfuscatedName("w.g")
    public int field610;

    @ObfuscatedName("w.b")
    public int field617;

    @ObfuscatedName("w.f")
    public String field613;

    @ObfuscatedName("w.y")
    public String field619;

    @ObfuscatedName("w.z")
    public int field620;

    @ObfuscatedName("w.t")
    public int field607;

    @ObfuscatedName("al.n(B)Z")
    public static boolean method700() {
        try {
            if (Statics.field614 == null) {
                Statics.field614 = new class19(Statics.field2013, new URL(Statics.field281));
            } else {
                byte[] var0 = Statics.field614.method173();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field611 = var1.method2377();
                    Statics.field616 = new class26[field611];
                    int var2 = 0;
                    while (var2 < field611) {
                        class26 var3 = Statics.field616[var2] = new class26();
                        var3.field618 = var1.method2377();
                        var3.field610 = var1.method2343();
                        var3.field613 = var1.method2492();
                        var3.field619 = var1.method2492();
                        var3.field620 = var1.method2338();
                        var3.field617 = var1.method2341();
                        var3.field607 = var2++;
                    }
                    method3203(Statics.field616, 0, Statics.field616.length - 1, field606, field612);
                    Statics.field614 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field614 = null;
        }
        return false;
    }

    @ObfuscatedName("af.d(III)V")
    public static void method756(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field606[var5] != arg0) {
                var2[var4] = field606[var5];
                var3[var4] = field612[var5];
                var4++;
            }
        }
        field606 = var2;
        field612 = var3;
        method3203(Statics.field616, 0, Statics.field616.length - 1, field606, field612);
    }

    @ObfuscatedName("fx.s([Lw;II[I[IB)V")
    public static void method3203(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field607;
                        var12 = var8.field607;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field617;
                        var12 = var8.field617;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method587() ? 1 : 0;
                        var12 = var8.method587() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field618;
                        var12 = var8.field618;
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
                        var15 = arg0[var5].field607;
                        var16 = var8.field607;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field617;
                        var16 = var8.field617;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method587() ? 1 : 0;
                        var16 = var8.method587() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field618;
                        var16 = var8.field618;
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
        method3203(arg0, arg1, var6, arg3, arg4);
        method3203(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("y.q(IIIZIZI)V")
    public static void method153(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field616[var6];
        Statics.field616[var6] = Statics.field616[arg1];
        Statics.field616[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method44(Statics.field616[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field616[var9];
                Statics.field616[var9] = Statics.field616[var7];
                Statics.field616[var7++] = var10;
            }
        }
        Statics.field616[arg1] = Statics.field616[var7];
        Statics.field616[var7] = var8;
        method153(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method153(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("j.j(Lw;Lw;IZIZB)I")
    public static int method44(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method41(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method41(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("q.k(Lw;Lw;IZB)I")
    public static int method41(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field617;
            int var5 = arg1.field617;
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
            return arg0.field620 - arg1.field620;
        } else if (arg2 == 3) {
            if (arg0.field619.equals("-")) {
                if (arg1.field619.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field619.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field619.compareTo(arg1.field619);
            }
        } else if (arg2 == 4) {
            return arg0.method622() ? (arg1.method622() ? 0 : 1) : (arg1.method622() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method588() ? (arg1.method588() ? 0 : 1) : (arg1.method588() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method589() ? (arg1.method589() ? 0 : 1) : (arg1.method589() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method587() ? (arg1.method587() ? 0 : 1) : (arg1.method587() ? -1 : 0);
        } else {
            return arg0.field618 - arg1.field618;
        }
    }

    @ObfuscatedName("ef.i(I)Lw;")
    public static class26 method2756() {
        field625 = 0;
        return method2111();
    }

    @ObfuscatedName("cq.m(I)Lw;")
    public static class26 method2111() {
        return field625 < field611 ? Statics.field616[++field625 - 1] : null;
    }

    @ObfuscatedName("w.p(I)Z")
    public boolean method587() {
        return (0x1 & this.field610) != 0;
    }

    @ObfuscatedName("w.h(I)Z")
    public boolean method588() {
        return (0x2 & this.field610) != 0;
    }

    @ObfuscatedName("w.e(I)Z")
    public boolean method589() {
        return (0x4 & this.field610) != 0;
    }

    @ObfuscatedName("w.g(I)Z")
    public boolean method622() {
        return (0x8 & this.field610) != 0;
    }
}
