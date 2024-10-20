package deob;

import java.net.URL;

@ObfuscatedName("bd")
public class class61 {

    @ObfuscatedName("bd.q")
    public static int field773 = 0;

    @ObfuscatedName("bd.i")
    public static int field786 = 0;

    @ObfuscatedName("bd.k")
    public static int[] field778 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bd.o")
    public static int[] field779 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bd.d")
    public int field780;

    @ObfuscatedName("bd.a")
    public int field781;

    @ObfuscatedName("bd.m")
    public int field782;

    @ObfuscatedName("bd.u")
    public String field783;

    @ObfuscatedName("bd.l")
    public String field784;

    @ObfuscatedName("bd.z")
    public int field785;

    @ObfuscatedName("bd.r")
    public int field776;

    @ObfuscatedName("c.s(B)Z")
    public static boolean method19() {
        try {
            if (Statics.field2909 == null) {
                Statics.field2909 = Statics.field1771.method2369(new URL(Statics.field3292));
            } else if (Statics.field2909.method2384()) {
                byte[] var0 = Statics.field2909.method2394();
                class444 var1 = new class444(var0);
                var1.method6934();
                field773 = var1.method7120();
                Statics.field775 = new class61[field773];
                int var2 = 0;
                while (var2 < field773) {
                    class61 var3 = Statics.field775[var2] = new class61();
                    var3.field780 = var1.method7120();
                    var3.field781 = var1.method6934();
                    var3.field783 = var1.method6975();
                    var3.field784 = var1.method6975();
                    var3.field785 = var1.method6929();
                    var3.field782 = var1.method6932();
                    var3.field776 = var2++;
                }
                method4402(Statics.field775, 0, Statics.field775.length - 1, field779, field778);
                Statics.field2909 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2909 = null;
        }
        return false;
    }

    @ObfuscatedName("kk.h(IIB)V")
    public static void method4944(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field779[var5] != arg0) {
                var2[var4] = field779[var5];
                var3[var4] = field778[var5];
                var4++;
            }
        }
        field779 = var2;
        field778 = var3;
        method4402(Statics.field775, 0, Statics.field775.length - 1, field779, field778);
    }

    @ObfuscatedName("hz.w([Lbd;II[I[IB)V")
    public static void method4402(class61[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class61 var8 = arg0[var7];
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
                        var11 = arg0[var6].field776;
                        var12 = var8.field776;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field782;
                        var12 = var8.field782;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1482() ? 1 : 0;
                        var12 = var8.method1482() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field780;
                        var12 = var8.field780;
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
                        var15 = arg0[var5].field776;
                        var16 = var8.field776;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field782;
                        var16 = var8.field782;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1482() ? 1 : 0;
                        var16 = var8.method1482() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field780;
                        var16 = var8.field780;
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
                class61 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method4402(arg0, arg1, var6, arg3, arg4);
        method4402(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("cb.v(IZIZB)V")
    public static void method1950(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field775 != null) {
            method5092(0, Statics.field775.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ki.c(IIIZIZI)V")
    public static void method5092(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class61 var8 = Statics.field775[var6];
        Statics.field775[var6] = Statics.field775[arg1];
        Statics.field775[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2917(Statics.field775[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class61 var10 = Statics.field775[var9];
                Statics.field775[var9] = Statics.field775[var7];
                Statics.field775[var7++] = var10;
            }
        }
        Statics.field775[arg1] = Statics.field775[var7];
        Statics.field775[var7] = var8;
        method5092(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method5092(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("fc.q(Lbd;Lbd;IZIZS)I")
    public static int method2917(class61 arg0, class61 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method6808(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method6808(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("pv.i(Lbd;Lbd;IZI)I")
    public static int method6808(class61 arg0, class61 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field782;
            int var5 = arg1.field782;
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
            return arg0.field785 - arg1.field785;
        } else if (arg2 == 3) {
            if (arg0.field784.equals("-")) {
                if (arg1.field784.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field784.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field784.compareTo(arg1.field784);
            }
        } else if (arg2 == 4) {
            return arg0.method1498() ? (arg1.method1498() ? 0 : 1) : (arg1.method1498() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1489() ? (arg1.method1489() ? 0 : 1) : (arg1.method1489() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1487() ? (arg1.method1487() ? 0 : 1) : (arg1.method1487() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1482() ? (arg1.method1482() ? 0 : 1) : (arg1.method1482() ? -1 : 0);
        } else {
            return arg0.field780 - arg1.field780;
        }
    }

    @ObfuscatedName("br.k(S)Lbd;")
    public static class61 method1757() {
        field786 = 0;
        return method1608();
    }

    @ObfuscatedName("bg.o(I)Lbd;")
    public static class61 method1608() {
        return field786 < field773 ? Statics.field775[++field786 - 1] : null;
    }

    @ObfuscatedName("bd.n(I)Z")
    public boolean method1482() {
        return (0x1 & this.field781) != 0;
    }

    @ObfuscatedName("bd.d(I)Z")
    public boolean method1489() {
        return (0x2 & this.field781) != 0;
    }

    @ObfuscatedName("bd.a(B)Z")
    public boolean method1487() {
        return (0x4 & this.field781) != 0;
    }

    @ObfuscatedName("bd.m(I)Z")
    public boolean method1498() {
        return (0x8 & this.field781) != 0;
    }

    @ObfuscatedName("bd.u(B)Z")
    public boolean method1486() {
        return (0x20000000 & this.field781) != 0;
    }

    @ObfuscatedName("bd.l(B)Z")
    public boolean method1502() {
        return (0x2000000 & this.field781) != 0;
    }

    @ObfuscatedName("bd.z(I)Z")
    public boolean method1488() {
        return (0x40000000 & this.field781) != 0;
    }
}
