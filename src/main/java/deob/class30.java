package deob;

import java.net.URL;

@ObfuscatedName("ah")
public class class30 {

    @ObfuscatedName("ah.o")
    public static int field709 = 0;

    @ObfuscatedName("ah.l")
    public static int field698 = 0;

    @ObfuscatedName("ah.n")
    public static int[] field699 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ah.m")
    public static int[] field700 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ah.j")
    public int field701;

    @ObfuscatedName("ah.s")
    public int field692;

    @ObfuscatedName("ah.q")
    public int field702;

    @ObfuscatedName("ah.d")
    public String field704;

    @ObfuscatedName("ah.p")
    public String field705;

    @ObfuscatedName("ah.y")
    public int field706;

    @ObfuscatedName("ah.a")
    public int field707;

    @ObfuscatedName("ar.f(I)Z")
    public static boolean method717() {
        try {
            if (Statics.field177 == null) {
                Statics.field177 = new class27(Statics.field1756, new URL(Statics.field781));
            } else {
                byte[] var0 = Statics.field177.method563();
                if (var0 != null) {
                    class154 var1 = new class154(var0);
                    field709 = var1.method2668();
                    Statics.field703 = new class30[field709];
                    int var2 = 0;
                    while (var2 < field709) {
                        class30 var3 = Statics.field703[var2] = new class30();
                        var3.field701 = var1.method2668();
                        var3.field692 = var1.method2695();
                        var3.field704 = var1.method2674();
                        var3.field705 = var1.method2674();
                        var3.field706 = var1.method2666();
                        var3.field702 = var1.method2669();
                        var3.field707 = var2++;
                    }
                    method26(Statics.field703, 0, Statics.field703.length - 1, field700, field699);
                    Statics.field177 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field177 = null;
        }
        return false;
    }

    @ObfuscatedName("g.i(IIB)V")
    public static void method187(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field700[var5] != arg0) {
                var2[var4] = field700[var5];
                var3[var4] = field699[var5];
                var4++;
            }
        }
        field700 = var2;
        field699 = var3;
        method26(Statics.field703, 0, Statics.field703.length - 1, field700, field699);
    }

    @ObfuscatedName("h.u([Lah;II[I[IB)V")
    public static void method26(class30[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class30 var8 = arg0[var7];
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
                        var11 = arg0[var6].field707;
                        var12 = var8.field707;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field702;
                        var12 = var8.field702;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method629() ? 1 : 0;
                        var12 = var8.method629() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field701;
                        var12 = var8.field701;
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
                        var15 = arg0[var5].field707;
                        var16 = var8.field707;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field702;
                        var16 = var8.field702;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method629() ? 1 : 0;
                        var16 = var8.method629() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field701;
                        var16 = var8.field701;
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
                class30 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method26(arg0, arg1, var6, arg3, arg4);
        method26(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("p.r(IZIZI)V")
    public static void method165(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field703 != null) {
            method3104(0, Statics.field703.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fz.o(IIIZIZI)V")
    public static void method3104(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class30 var8 = Statics.field703[var6];
        Statics.field703[var6] = Statics.field703[arg1];
        Statics.field703[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class30 var10 = Statics.field703[var9];
            int var11 = method591(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method591(var10, var8, arg4, arg5);
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
                class30 var14 = Statics.field703[var9];
                Statics.field703[var9] = Statics.field703[var7];
                Statics.field703[var7++] = var14;
            }
        }
        Statics.field703[arg1] = Statics.field703[var7];
        Statics.field703[var7] = var8;
        method3104(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3104(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("aq.l(Lah;Lah;IZI)I")
    public static int method591(class30 arg0, class30 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field702;
            int var5 = arg1.field702;
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
            return arg0.field706 - arg1.field706;
        } else if (arg2 == 3) {
            if (arg0.field705.equals("-")) {
                if (arg1.field705.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field705.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field705.compareTo(arg1.field705);
            }
        } else if (arg2 == 4) {
            return arg0.method596() ? (arg1.method596() ? 0 : 1) : (arg1.method596() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method594() ? (arg1.method594() ? 0 : 1) : (arg1.method594() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method595() ? (arg1.method595() ? 0 : 1) : (arg1.method595() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method629() ? (arg1.method629() ? 0 : 1) : (arg1.method629() ? -1 : 0);
        } else {
            return arg0.field701 - arg1.field701;
        }
    }

    @ObfuscatedName("u.n(I)Lah;")
    public static class30 method18() {
        field698 = 0;
        return method1395();
    }

    @ObfuscatedName("bs.m(B)Lah;")
    public static class30 method1395() {
        return field698 < field709 ? Statics.field703[++field698 - 1] : null;
    }

    @ObfuscatedName("ah.w(I)Z")
    public boolean method629() {
        return (0x1 & this.field692) != 0;
    }

    @ObfuscatedName("ah.j(S)Z")
    public boolean method594() {
        return (0x2 & this.field692) != 0;
    }

    @ObfuscatedName("ah.s(B)Z")
    public boolean method595() {
        return (0x4 & this.field692) != 0;
    }

    @ObfuscatedName("ah.q(I)Z")
    public boolean method596() {
        return (0x8 & this.field692) != 0;
    }

    @ObfuscatedName("ah.d(I)Z")
    public boolean method597() {
        return (0x20000000 & this.field692) != 0;
    }

    @ObfuscatedName("ah.p(I)Z")
    public boolean method616() {
        return (0x2000000 & this.field692) != 0;
    }
}
