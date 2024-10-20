package deob;

import java.net.URL;

@ObfuscatedName("bv")
public class class67 {

    @ObfuscatedName("bv.i")
    public static int field983 = 0;

    @ObfuscatedName("bv.t")
    public static int field981 = 0;

    @ObfuscatedName("bv.p")
    public static int[] field985 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bv.l")
    public static int[] field987 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bv.c")
    public int field992;

    @ObfuscatedName("bv.d")
    public int field979;

    @ObfuscatedName("bv.w")
    public int field989;

    @ObfuscatedName("bv.a")
    public String field986;

    @ObfuscatedName("bv.z")
    public String field991;

    @ObfuscatedName("bv.e")
    public int field984;

    @ObfuscatedName("bv.q")
    public int field993;

    @ObfuscatedName("k.v(B)Z")
    public static boolean method44() {
        try {
            if (Statics.field2051 == null) {
                Statics.field2051 = Statics.field1490.method2869(new URL(Statics.field843));
            } else if (Statics.field2051.method2876()) {
                byte[] var0 = Statics.field2051.method2882();
                class185 var1 = new class185(var0);
                var1.method3279();
                field983 = var1.method3276();
                Statics.field982 = new class67[field983];
                int var2 = 0;
                while (var2 < field983) {
                    class67 var3 = Statics.field982[var2] = new class67();
                    var3.field992 = var1.method3276();
                    var3.field979 = var1.method3279();
                    var3.field986 = var1.method3490();
                    var3.field991 = var1.method3490();
                    var3.field984 = var1.method3274();
                    var3.field989 = var1.method3277();
                    var3.field993 = var2++;
                }
                method534(Statics.field982, 0, Statics.field982.length - 1, field987, field985);
                Statics.field2051 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2051 = null;
        }
        return false;
    }

    @ObfuscatedName("bi.s(III)V")
    public static void method953(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field987[var5] != arg0) {
                var2[var4] = field987[var5];
                var3[var4] = field985[var5];
                var4++;
            }
        }
        field987 = var2;
        field985 = var3;
        method534(Statics.field982, 0, Statics.field982.length - 1, field987, field985);
    }

    @ObfuscatedName("af.o([Lbv;II[I[II)V")
    public static void method534(class67[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class67 var8 = arg0[var7];
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
                        var11 = arg0[var6].field993;
                        var12 = var8.field993;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field989;
                        var12 = var8.field989;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1483() ? 1 : 0;
                        var12 = var8.method1483() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field992;
                        var12 = var8.field992;
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
                        var15 = arg0[var5].field993;
                        var16 = var8.field993;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field989;
                        var16 = var8.field989;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1483() ? 1 : 0;
                        var16 = var8.method1483() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field992;
                        var16 = var8.field992;
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
                class67 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method534(arg0, arg1, var6, arg3, arg4);
        method534(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("bm.k(IZIZB)V")
    public static void method1660(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field982 != null) {
            method2917(0, Statics.field982.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ee.u(IIIZIZI)V")
    public static void method2917(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class67 var8 = Statics.field982[var6];
        Statics.field982[var6] = Statics.field982[arg1];
        Statics.field982[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method4361(Statics.field982[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class67 var10 = Statics.field982[var9];
                Statics.field982[var9] = Statics.field982[var7];
                Statics.field982[var7++] = var10;
            }
        }
        Statics.field982[arg1] = Statics.field982[var7];
        Statics.field982[var7] = var8;
        method2917(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2917(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("is.i(Lbv;Lbv;IZIZI)I")
    public static int method4361(class67 arg0, class67 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method3159(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method3159(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("fk.t(Lbv;Lbv;IZI)I")
    public static int method3159(class67 arg0, class67 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field989;
            int var5 = arg1.field989;
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
            return arg0.field984 - arg1.field984;
        } else if (arg2 == 3) {
            if (arg0.field991.equals("-")) {
                if (arg1.field991.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field991.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field991.compareTo(arg1.field991);
            }
        } else if (arg2 == 4) {
            return arg0.method1499() ? (arg1.method1499() ? 0 : 1) : (arg1.method1499() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1516() ? (arg1.method1516() ? 0 : 1) : (arg1.method1516() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1475() ? (arg1.method1475() ? 0 : 1) : (arg1.method1475() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1483() ? (arg1.method1483() ? 0 : 1) : (arg1.method1483() ? -1 : 0);
        } else {
            return arg0.field992 - arg1.field992;
        }
    }

    @ObfuscatedName("fc.c(I)Lbv;")
    public static class67 method3241() {
        field981 = 0;
        return method2901();
    }

    @ObfuscatedName("eu.w(B)Lbv;")
    public static class67 method2901() {
        return field981 < field983 ? Statics.field982[++field981 - 1] : null;
    }

    @ObfuscatedName("bv.a(S)Z")
    public boolean method1483() {
        return (0x1 & this.field979) != 0;
    }

    @ObfuscatedName("bv.z(I)Z")
    public boolean method1516() {
        return (0x2 & this.field979) != 0;
    }

    @ObfuscatedName("bv.e(I)Z")
    public boolean method1475() {
        return (0x4 & this.field979) != 0;
    }

    @ObfuscatedName("bv.q(I)Z")
    public boolean method1499() {
        return (0x8 & this.field979) != 0;
    }

    @ObfuscatedName("bv.j(I)Z")
    public boolean method1476() {
        return (0x20000000 & this.field979) != 0;
    }

    @ObfuscatedName("bv.y(I)Z")
    public boolean method1474() {
        return (0x2000000 & this.field979) != 0;
    }
}
