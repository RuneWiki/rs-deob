package deob;

import java.net.URL;

@ObfuscatedName("t")
public class class24 {

    @ObfuscatedName("t.g")
    public static int field587 = 0;

    @ObfuscatedName("t.f")
    public static int field588 = 0;

    @ObfuscatedName("t.m")
    public static int[] field589 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("t.a")
    public static int[] field590 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("t.l")
    public int field601;

    @ObfuscatedName("t.u")
    public int field586;

    @ObfuscatedName("t.q")
    public int field583;

    @ObfuscatedName("t.k")
    public String field594;

    @ObfuscatedName("t.x")
    public String field595;

    @ObfuscatedName("t.r")
    public int field596;

    @ObfuscatedName("t.j")
    public int field600;

    @ObfuscatedName("y.n(I)Z")
    public static boolean method30() {
        try {
            if (Statics.field2796 == null) {
                Statics.field2796 = new class18(Statics.field969, new URL(Statics.field188));
            } else {
                byte[] var0 = Statics.field2796.method174();
                if (var0 != null) {
                    class111 var1 = new class111(var0);
                    field587 = var1.method2231();
                    Statics.field591 = new class24[field587];
                    int var2 = 0;
                    while (var2 < field587) {
                        class24 var3 = Statics.field591[var2] = new class24();
                        var3.field601 = var1.method2231();
                        var3.field586 = var1.method2233();
                        var3.field594 = var1.method2290();
                        var3.field595 = var1.method2290();
                        var3.field596 = var1.method2228();
                        var3.field583 = var1.method2242();
                        var3.field600 = var2++;
                    }
                    method870(Statics.field591, 0, Statics.field591.length - 1, field590, field589);
                    Statics.field2796 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2796 = null;
        }
        return false;
    }

    @ObfuscatedName("d.d(III)V")
    public static void method12(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field590[var5] != arg0) {
                var2[var4] = field590[var5];
                var3[var4] = field589[var5];
                var4++;
            }
        }
        field590 = var2;
        field589 = var3;
        method870(Statics.field591, 0, Statics.field591.length - 1, field590, field589);
    }

    @ObfuscatedName("aq.z([Lt;II[I[IB)V")
    public static void method870(class24[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class24 var8 = arg0[var7];
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
                        var11 = arg0[var6].field600;
                        var12 = var8.field600;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field583;
                        var12 = var8.field583;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method560() ? 1 : 0;
                        var12 = var8.method560() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field601;
                        var12 = var8.field601;
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
                        var15 = arg0[var5].field600;
                        var16 = var8.field600;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field583;
                        var16 = var8.field583;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method560() ? 1 : 0;
                        var16 = var8.method560() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field601;
                        var16 = var8.field601;
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
                class24 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method870(arg0, arg1, var6, arg3, arg4);
        method870(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ay.y(IZIZI)V")
    public static void method884(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field591 != null) {
            method676(0, Statics.field591.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ao.e(IIIZIZS)V")
    public static void method676(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class24 var8 = Statics.field591[var6];
        Statics.field591[var6] = Statics.field591[arg1];
        Statics.field591[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method78(Statics.field591[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class24 var10 = Statics.field591[var9];
                Statics.field591[var9] = Statics.field591[var7];
                Statics.field591[var7++] = var10;
            }
        }
        Statics.field591[arg1] = Statics.field591[var7];
        Statics.field591[var7] = var8;
        method676(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method676(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("g.g(Lt;Lt;IZIZI)I")
    public static int method78(class24 arg0, class24 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method3144(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method3144(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("fy.f(Lt;Lt;IZI)I")
    public static int method3144(class24 arg0, class24 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field583;
            int var5 = arg1.field583;
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
            return arg0.field596 - arg1.field596;
        } else if (arg2 == 3) {
            if (arg0.field595.equals("-")) {
                if (arg1.field595.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field595.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field595.compareTo(arg1.field595);
            }
        } else if (arg2 == 4) {
            return arg0.method552() ? (arg1.method552() ? 0 : 1) : (arg1.method552() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method580() ? (arg1.method580() ? 0 : 1) : (arg1.method580() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method586() ? (arg1.method586() ? 0 : 1) : (arg1.method586() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method560() ? (arg1.method560() ? 0 : 1) : (arg1.method560() ? -1 : 0);
        } else {
            return arg0.field601 - arg1.field601;
        }
    }

    @ObfuscatedName("dm.m(S)Lt;")
    public static class24 method2479() {
        field588 = 0;
        return method2711();
    }

    @ObfuscatedName("ek.a(I)Lt;")
    public static class24 method2711() {
        return field588 < field587 ? Statics.field591[++field588 - 1] : null;
    }

    @ObfuscatedName("t.h(B)Z")
    public boolean method560() {
        return (0x1 & this.field586) != 0;
    }

    @ObfuscatedName("t.l(I)Z")
    public boolean method580() {
        return (0x2 & this.field586) != 0;
    }

    @ObfuscatedName("t.u(I)Z")
    public boolean method586() {
        return (0x4 & this.field586) != 0;
    }

    @ObfuscatedName("t.q(I)Z")
    public boolean method552() {
        return (0x8 & this.field586) != 0;
    }
}
