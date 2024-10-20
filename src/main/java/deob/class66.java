package deob;

import java.net.URL;

@ObfuscatedName("bb")
public class class66 {

    @ObfuscatedName("bb.n")
    public static int field956 = 0;

    @ObfuscatedName("bb.h")
    public static int field957 = 0;

    @ObfuscatedName("bb.x")
    public static int[] field970 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bb.j")
    public static int[] field959 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bb.l")
    public int field961;

    @ObfuscatedName("bb.d")
    public int field962;

    @ObfuscatedName("bb.s")
    public int field958;

    @ObfuscatedName("bb.p")
    public String field964;

    @ObfuscatedName("bb.g")
    public String field965;

    @ObfuscatedName("bb.y")
    public int field953;

    @ObfuscatedName("bb.c")
    public int field967;

    @ObfuscatedName("ih.w(B)Z")
    public static boolean method4358() {
        try {
            if (Statics.field960 == null) {
                Statics.field960 = Statics.field553.method2884(new URL(Statics.field522));
            } else if (Statics.field960.method2898()) {
                byte[] var0 = Statics.field960.method2897();
                class183 var1 = new class183(var0);
                var1.method3267();
                field956 = var1.method3268();
                Statics.field1915 = new class66[field956];
                int var2 = 0;
                while (var2 < field956) {
                    class66 var3 = Statics.field1915[var2] = new class66();
                    var3.field961 = var1.method3268();
                    var3.field962 = var1.method3267();
                    var3.field964 = var1.method3271();
                    var3.field965 = var1.method3271();
                    var3.field953 = var1.method3436();
                    var3.field958 = var1.method3498();
                    var3.field967 = var2++;
                }
                method2904(Statics.field1915, 0, Statics.field1915.length - 1, field959, field970);
                Statics.field960 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field960 = null;
        }
        return false;
    }

    @ObfuscatedName("k.m(III)V")
    public static void method285(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field959[var5] != arg0) {
                var2[var4] = field959[var5];
                var3[var4] = field970[var5];
                var4++;
            }
        }
        field959 = var2;
        field970 = var3;
        method2904(Statics.field1915, 0, Statics.field1915.length - 1, field959, field970);
    }

    @ObfuscatedName("er.q([Lbb;II[I[IB)V")
    public static void method2904(class66[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class66 var8 = arg0[var7];
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
                        var11 = arg0[var6].field967;
                        var12 = var8.field967;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field958;
                        var12 = var8.field958;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1487() ? 1 : 0;
                        var12 = var8.method1487() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field961;
                        var12 = var8.field961;
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
                        var15 = arg0[var5].field967;
                        var16 = var8.field967;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field958;
                        var16 = var8.field958;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1487() ? 1 : 0;
                        var16 = var8.method1487() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field961;
                        var16 = var8.field961;
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
                class66 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2904(arg0, arg1, var6, arg3, arg4);
        method2904(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ek.x(IZIZB)V")
    public static void method2927(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1915 != null) {
            method2385(0, Statics.field1915.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dr.j(IIIZIZI)V")
    public static void method2385(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class66 var8 = Statics.field1915[var6];
        Statics.field1915[var6] = Statics.field1915[arg1];
        Statics.field1915[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method72(Statics.field1915[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class66 var10 = Statics.field1915[var9];
                Statics.field1915[var9] = Statics.field1915[var7];
                Statics.field1915[var7++] = var10;
            }
        }
        Statics.field1915[arg1] = Statics.field1915[var7];
        Statics.field1915[var7] = var8;
        method2385(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2385(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("h.a(Lbb;Lbb;IZIZI)I")
    public static int method72(class66 arg0, class66 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method4011(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method4011(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("hy.l(Lbb;Lbb;IZB)I")
    public static int method4011(class66 arg0, class66 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field958;
            int var5 = arg1.field958;
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
            return arg0.field953 - arg1.field953;
        } else if (arg2 == 3) {
            if (arg0.field965.equals("-")) {
                if (arg1.field965.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field965.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field965.compareTo(arg1.field965);
            }
        } else if (arg2 == 4) {
            return arg0.method1490() ? (arg1.method1490() ? 0 : 1) : (arg1.method1490() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1513() ? (arg1.method1513() ? 0 : 1) : (arg1.method1513() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1489() ? (arg1.method1489() ? 0 : 1) : (arg1.method1489() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1487() ? (arg1.method1487() ? 0 : 1) : (arg1.method1487() ? -1 : 0);
        } else {
            return arg0.field961 - arg1.field961;
        }
    }

    @ObfuscatedName("ks.d(I)Lbb;")
    public static class66 method5093() {
        field957 = 0;
        return method2491();
    }

    @ObfuscatedName("dj.s(I)Lbb;")
    public static class66 method2491() {
        return field957 < field956 ? Statics.field1915[++field957 - 1] : null;
    }

    @ObfuscatedName("bb.p(B)Z")
    public boolean method1487() {
        return (0x1 & this.field962) != 0;
    }

    @ObfuscatedName("bb.g(B)Z")
    public boolean method1513() {
        return (0x2 & this.field962) != 0;
    }

    @ObfuscatedName("bb.y(I)Z")
    public boolean method1489() {
        return (0x4 & this.field962) != 0;
    }

    @ObfuscatedName("bb.c(I)Z")
    public boolean method1490() {
        return (0x8 & this.field962) != 0;
    }

    @ObfuscatedName("bb.e(I)Z")
    public boolean method1523() {
        return (0x20000000 & this.field962) != 0;
    }

    @ObfuscatedName("bb.t(I)Z")
    public boolean method1491() {
        return (0x2000000 & this.field962) != 0;
    }
}
