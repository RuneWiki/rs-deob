package deob;

import java.net.URL;

@ObfuscatedName("af")
public class class30 {

    @ObfuscatedName("af.h")
    public static int field698 = 0;

    @ObfuscatedName("af.u")
    public static int field701 = 0;

    @ObfuscatedName("af.k")
    public static int[] field709 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("af.g")
    public static int[] field695 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("af.e")
    public int field703;

    @ObfuscatedName("af.q")
    public int field700;

    @ObfuscatedName("af.v")
    public int field705;

    @ObfuscatedName("af.l")
    public String field706;

    @ObfuscatedName("af.s")
    public String field707;

    @ObfuscatedName("af.r")
    public int field708;

    @ObfuscatedName("af.m")
    public int field696;

    @ObfuscatedName("dg.x(I)Z")
    public static boolean method1988() {
        try {
            if (Statics.field702 == null) {
                Statics.field702 = new class27(Statics.field1194, new URL(Statics.field34));
            } else {
                byte[] var0 = Statics.field702.method602();
                if (var0 != null) {
                    class154 var1 = new class154(var0);
                    field698 = var1.method2745();
                    Statics.field704 = new class30[field698];
                    int var2 = 0;
                    while (var2 < field698) {
                        class30 var3 = Statics.field704[var2] = new class30();
                        var3.field703 = var1.method2745();
                        var3.field700 = var1.method2644();
                        var3.field706 = var1.method2699();
                        var3.field707 = var1.method2699();
                        var3.field708 = var1.method2701();
                        var3.field705 = var1.method2695();
                        var3.field696 = var2++;
                    }
                    method2120(Statics.field704, 0, Statics.field704.length - 1, field695, field709);
                    Statics.field702 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field702 = null;
        }
        return false;
    }

    @ObfuscatedName("bv.j(IIB)V")
    public static void method1135(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field695[var5] != arg0) {
                var2[var4] = field695[var5];
                var3[var4] = field709[var5];
                var4++;
            }
        }
        field695 = var2;
        field709 = var3;
        method2120(Statics.field704, 0, Statics.field704.length - 1, field695, field709);
    }

    @ObfuscatedName("dk.c([Laf;II[I[II)V")
    public static void method2120(class30[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field696;
                        var12 = var8.field696;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field705;
                        var12 = var8.field705;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method672() ? 1 : 0;
                        var12 = var8.method672() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field703;
                        var12 = var8.field703;
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
                        var15 = arg0[var5].field696;
                        var16 = var8.field696;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field705;
                        var16 = var8.field705;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method672() ? 1 : 0;
                        var16 = var8.method672() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field703;
                        var16 = var8.field703;
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
        method2120(arg0, arg1, var6, arg3, arg4);
        method2120(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("b.d(IIIZIZB)V")
    public static void method219(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class30 var8 = Statics.field704[var6];
        Statics.field704[var6] = Statics.field704[arg1];
        Statics.field704[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class30 var10 = Statics.field704[var9];
            int var11 = method49(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method49(var10, var8, arg4, arg5);
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
                class30 var14 = Statics.field704[var9];
                Statics.field704[var9] = Statics.field704[var7];
                Statics.field704[var7++] = var14;
            }
        }
        Statics.field704[arg1] = Statics.field704[var7];
        Statics.field704[var7] = var8;
        method219(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method219(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("d.w(Laf;Laf;IZS)I")
    public static int method49(class30 arg0, class30 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field705;
            int var5 = arg1.field705;
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
            return arg0.field708 - arg1.field708;
        } else if (arg2 == 3) {
            if (arg0.field707.equals("-")) {
                if (arg1.field707.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field707.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field707.compareTo(arg1.field707);
            }
        } else if (arg2 == 4) {
            return arg0.method637() ? (arg1.method637() ? 0 : 1) : (arg1.method637() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method628() ? (arg1.method628() ? 0 : 1) : (arg1.method628() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method631() ? (arg1.method631() ? 0 : 1) : (arg1.method631() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method672() ? (arg1.method672() ? 0 : 1) : (arg1.method672() ? -1 : 0);
        } else {
            return arg0.field703 - arg1.field703;
        }
    }

    @ObfuscatedName("fb.u(B)Laf;")
    public static class30 method2996() {
        field701 = 0;
        return method2164();
    }

    @ObfuscatedName("dt.y(B)Laf;")
    public static class30 method2164() {
        return field701 < field698 ? Statics.field704[++field701 - 1] : null;
    }

    @ObfuscatedName("af.e(I)Z")
    public boolean method672() {
        return (0x1 & this.field700) != 0;
    }

    @ObfuscatedName("af.q(I)Z")
    public boolean method628() {
        return (0x2 & this.field700) != 0;
    }

    @ObfuscatedName("af.v(I)Z")
    public boolean method631() {
        return (0x4 & this.field700) != 0;
    }

    @ObfuscatedName("af.l(I)Z")
    public boolean method637() {
        return (0x8 & this.field700) != 0;
    }

    @ObfuscatedName("af.s(I)Z")
    public boolean method662() {
        return (0x20000000 & this.field700) != 0;
    }

    @ObfuscatedName("af.r(B)Z")
    public boolean method630() {
        return (0x2000000 & this.field700) != 0;
    }
}
