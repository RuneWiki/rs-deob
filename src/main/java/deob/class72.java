package deob;

import java.net.URL;

@ObfuscatedName("bp")
public class class72 {

    @ObfuscatedName("bp.p")
    public static int field1017 = 0;

    @ObfuscatedName("bp.h")
    public static int field1006 = 0;

    @ObfuscatedName("bp.y")
    public static int[] field1009 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bp.w")
    public static int[] field1012 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bp.k")
    public int field1011;

    @ObfuscatedName("bp.x")
    public int field1005;

    @ObfuscatedName("bp.o")
    public int field1013;

    @ObfuscatedName("bp.e")
    public String field1014;

    @ObfuscatedName("bp.n")
    public String field1016;

    @ObfuscatedName("bp.r")
    public int field1008;

    @ObfuscatedName("bp.c")
    public int field1010;

    @ObfuscatedName("ax.u(I)Z")
    public static boolean method724() {
        try {
            if (Statics.field642 == null) {
                Statics.field642 = Statics.field2527.method3056(new URL(Statics.field1915));
            } else if (Statics.field642.method3070()) {
                byte[] var0 = Statics.field642.method3071();
                class300 var1 = new class300(var0);
                var1.method5277();
                field1017 = var1.method5337();
                Statics.field2752 = new class72[field1017];
                int var2 = 0;
                while (var2 < field1017) {
                    class72 var3 = Statics.field2752[var2] = new class72();
                    var3.field1011 = var1.method5337();
                    var3.field1005 = var1.method5277();
                    var3.field1014 = var1.method5147();
                    var3.field1016 = var1.method5147();
                    var3.field1008 = var1.method5138();
                    var3.field1013 = var1.method5141();
                    var3.field1010 = var2++;
                }
                method3241(Statics.field2752, 0, Statics.field2752.length - 1, field1012, field1009);
                Statics.field642 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field642 = null;
        }
        return false;
    }

    @ObfuscatedName("jo.f(III)V")
    public static void method4659(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1012[var5] != arg0) {
                var2[var4] = field1012[var5];
                var3[var4] = field1009[var5];
                var4++;
            }
        }
        field1012 = var2;
        field1009 = var3;
        method3241(Statics.field2752, 0, Statics.field2752.length - 1, field1012, field1009);
    }

    @ObfuscatedName("fp.b([Lbp;II[I[II)V")
    public static void method3241(class72[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class72 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1010;
                        var12 = var8.field1010;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1013;
                        var12 = var8.field1013;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1602() ? 1 : 0;
                        var12 = var8.method1602() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1011;
                        var12 = var8.field1011;
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
                        var15 = arg0[var5].field1010;
                        var16 = var8.field1010;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1013;
                        var16 = var8.field1013;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1602() ? 1 : 0;
                        var16 = var8.method1602() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1011;
                        var16 = var8.field1011;
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
                class72 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method3241(arg0, arg1, var6, arg3, arg4);
        method3241(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ae.g(IZIZB)V")
    public static void method661(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field2752 != null) {
            method601(0, Statics.field2752.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ac.z(IIIZIZB)V")
    public static void method601(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class72 var8 = Statics.field2752[var6];
        Statics.field2752[var6] = Statics.field2752[arg1];
        Statics.field2752[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method655(Statics.field2752[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class72 var10 = Statics.field2752[var9];
                Statics.field2752[var9] = Statics.field2752[var7];
                Statics.field2752[var7++] = var10;
            }
        }
        Statics.field2752[arg1] = Statics.field2752[var7];
        Statics.field2752[var7] = var8;
        method601(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method601(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("at.p(Lbp;Lbp;IZIZI)I")
    public static int method655(class72 arg0, class72 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method3151(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method3151(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ed.h(Lbp;Lbp;IZB)I")
    public static int method3151(class72 arg0, class72 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field1013;
            int var5 = arg1.field1013;
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
            return arg0.field1008 - arg1.field1008;
        } else if (arg2 == 3) {
            if (arg0.field1016.equals("-")) {
                if (arg1.field1016.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1016.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1016.compareTo(arg1.field1016);
            }
        } else if (arg2 == 4) {
            return arg0.method1605() ? (arg1.method1605() ? 0 : 1) : (arg1.method1605() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1622() ? (arg1.method1622() ? 0 : 1) : (arg1.method1622() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1604() ? (arg1.method1604() ? 0 : 1) : (arg1.method1604() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1602() ? (arg1.method1602() ? 0 : 1) : (arg1.method1602() ? -1 : 0);
        } else {
            return arg0.field1011 - arg1.field1011;
        }
    }

    @ObfuscatedName("hc.y(B)Lbp;")
    public static class72 method3730() {
        field1006 = 0;
        return method12();
    }

    @ObfuscatedName("f.w(I)Lbp;")
    public static class72 method12() {
        return field1006 < field1017 ? Statics.field2752[++field1006 - 1] : null;
    }

    @ObfuscatedName("bp.i(I)Z")
    public boolean method1602() {
        return (0x1 & this.field1005) != 0;
    }

    @ObfuscatedName("bp.k(B)Z")
    public boolean method1622() {
        return (0x2 & this.field1005) != 0;
    }

    @ObfuscatedName("bp.x(I)Z")
    public boolean method1604() {
        return (0x4 & this.field1005) != 0;
    }

    @ObfuscatedName("bp.o(I)Z")
    public boolean method1605() {
        return (0x8 & this.field1005) != 0;
    }

    @ObfuscatedName("bp.e(B)Z")
    public boolean method1606() {
        return (0x20000000 & this.field1005) != 0;
    }

    @ObfuscatedName("bp.n(I)Z")
    public boolean method1607() {
        return (0x2000000 & this.field1005) != 0;
    }

    @ObfuscatedName("bp.c(B)Z")
    public boolean method1608() {
        return (0x40000000 & this.field1005) != 0;
    }
}
