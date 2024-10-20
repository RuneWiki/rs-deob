package deob;

import java.net.URL;

@ObfuscatedName("q")
public class class26 {

    @ObfuscatedName("q.s")
    public static int field632 = 0;

    @ObfuscatedName("q.p")
    public static int field644 = 0;

    @ObfuscatedName("q.r")
    public static int[] field627 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("q.k")
    public static int[] field633 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("q.n")
    public int field636;

    @ObfuscatedName("q.z")
    public int field637;

    @ObfuscatedName("q.c")
    public int field638;

    @ObfuscatedName("q.b")
    public String field639;

    @ObfuscatedName("q.w")
    public String field640;

    @ObfuscatedName("q.g")
    public int field642;

    @ObfuscatedName("q.x")
    public int field634;

    @ObfuscatedName("am.i(B)Z")
    public static boolean method874() {
        try {
            if (Statics.field3140 == null) {
                Statics.field3140 = new class19(Statics.field1158, new URL(Statics.field1965));
            } else {
                byte[] var0 = Statics.field3140.method172();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field632 = var1.method2312();
                    Statics.field631 = new class26[field632];
                    int var2 = 0;
                    while (var2 < field632) {
                        class26 var3 = Statics.field631[var2] = new class26();
                        var3.field636 = var1.method2312();
                        var3.field637 = var1.method2315();
                        var3.field639 = var1.method2318();
                        var3.field640 = var1.method2318();
                        var3.field642 = var1.method2310();
                        var3.field638 = var1.method2313();
                        var3.field634 = var2++;
                    }
                    method49(Statics.field631, 0, Statics.field631.length - 1, field633, field627);
                    Statics.field3140 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3140 = null;
        }
        return false;
    }

    @ObfuscatedName("ak.v(III)V")
    public static void method582(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field633[var5] != arg0) {
                var2[var4] = field633[var5];
                var3[var4] = field627[var5];
                var4++;
            }
        }
        field633 = var2;
        field627 = var3;
        method49(Statics.field631, 0, Statics.field631.length - 1, field633, field627);
    }

    @ObfuscatedName("h.f([Lq;II[I[IS)V")
    public static void method49(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field638;
                        var12 = var8.field638;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method551() ? 1 : 0;
                        var12 = var8.method551() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field636;
                        var12 = var8.field636;
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
                        var15 = arg0[var5].field638;
                        var16 = var8.field638;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method551() ? 1 : 0;
                        var16 = var8.method551() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field636;
                        var16 = var8.field636;
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
        method49(arg0, arg1, var6, arg3, arg4);
        method49(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("q.h(IIIZIZI)V")
    public static void method579(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field631[var6];
        Statics.field631[var6] = Statics.field631[arg1];
        Statics.field631[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class26 var10 = Statics.field631[var9];
            int var11 = method974(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method974(var10, var8, arg4, arg5);
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
                class26 var14 = Statics.field631[var9];
                Statics.field631[var9] = Statics.field631[var7];
                Statics.field631[var7++] = var14;
            }
        }
        Statics.field631[arg1] = Statics.field631[var7];
        Statics.field631[var7] = var8;
        method579(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method579(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ao.a(Lq;Lq;IZI)I")
    public static int method974(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field638;
            int var5 = arg1.field638;
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
            return arg0.field642 - arg1.field642;
        } else if (arg2 == 3) {
            if (arg0.field640.equals("-")) {
                if (arg1.field640.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field640.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field640.compareTo(arg1.field640);
            }
        } else if (arg2 == 4) {
            return arg0.method554() ? (arg1.method554() ? 0 : 1) : (arg1.method554() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method552() ? (arg1.method552() ? 0 : 1) : (arg1.method552() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method550() ? (arg1.method550() ? 0 : 1) : (arg1.method550() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method551() ? (arg1.method551() ? 0 : 1) : (arg1.method551() ? -1 : 0);
        } else {
            return arg0.field636 - arg1.field636;
        }
    }

    @ObfuscatedName("q.s(I)Z")
    public boolean method551() {
        return (0x1 & this.field637) != 0;
    }

    @ObfuscatedName("q.p(I)Z")
    public boolean method552() {
        return (0x2 & this.field637) != 0;
    }

    @ObfuscatedName("q.r(I)Z")
    public boolean method550() {
        return (0x4 & this.field637) != 0;
    }

    @ObfuscatedName("q.k(I)Z")
    public boolean method554() {
        return (0x8 & this.field637) != 0;
    }
}
