package deob;

import java.net.URL;

@ObfuscatedName("bb")
public class class66 {

    @ObfuscatedName("bb.q")
    public static int field946 = 0;

    @ObfuscatedName("bb.k")
    public static int field945 = 0;

    @ObfuscatedName("bb.i")
    public static int[] field940 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bb.x")
    public static int[] field947 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bb.p")
    public int field948;

    @ObfuscatedName("bb.b")
    public int field949;

    @ObfuscatedName("bb.n")
    public int field956;

    @ObfuscatedName("bb.f")
    public String field951;

    @ObfuscatedName("bb.g")
    public String field952;

    @ObfuscatedName("bb.m")
    public int field953;

    @ObfuscatedName("bb.r")
    public int field944;

    @ObfuscatedName("u.z(I)Z")
    public static boolean method37() {
        try {
            if (Statics.field440 == null) {
                Statics.field440 = Statics.field250.method2879(new URL(Statics.field220));
            } else if (Statics.field440.method2887()) {
                byte[] var0 = Statics.field440.method2886();
                class183 var1 = new class183(var0);
                var1.method3374();
                field946 = var1.method3253();
                Statics.field950 = new class66[field946];
                int var2 = 0;
                while (var2 < field946) {
                    class66 var3 = Statics.field950[var2] = new class66();
                    var3.field948 = var1.method3253();
                    var3.field949 = var1.method3374();
                    var3.field951 = var1.method3441();
                    var3.field952 = var1.method3441();
                    var3.field953 = var1.method3247();
                    var3.field956 = var1.method3254();
                    var3.field944 = var2++;
                }
                method263(Statics.field950, 0, Statics.field950.length - 1, field947, field940);
                Statics.field440 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field440 = null;
        }
        return false;
    }

    @ObfuscatedName("el.w(IIB)V")
    public static void method2962(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field947[var5] != arg0) {
                var2[var4] = field947[var5];
                var3[var4] = field940[var5];
                var4++;
            }
        }
        field947 = var2;
        field940 = var3;
        method263(Statics.field950, 0, Statics.field950.length - 1, field947, field940);
    }

    @ObfuscatedName("d.s([Lbb;II[I[II)V")
    public static void method263(class66[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field944;
                        var12 = var8.field944;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field956;
                        var12 = var8.field956;
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
                        var11 = arg0[var6].field948;
                        var12 = var8.field948;
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
                        var15 = arg0[var5].field944;
                        var16 = var8.field944;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field956;
                        var16 = var8.field956;
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
                        var15 = arg0[var5].field948;
                        var16 = var8.field948;
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
        method263(arg0, arg1, var6, arg3, arg4);
        method263(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ds.l(IIIZIZB)V")
    public static void method2577(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class66 var8 = Statics.field950[var6];
        Statics.field950[var6] = Statics.field950[arg1];
        Statics.field950[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2299(Statics.field950[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class66 var10 = Statics.field950[var9];
                Statics.field950[var9] = Statics.field950[var7];
                Statics.field950[var7++] = var10;
            }
        }
        Statics.field950[arg1] = Statics.field950[var7];
        Statics.field950[var7] = var8;
        method2577(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2577(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("dy.u(Lbb;Lbb;IZIZI)I")
    public static int method2299(class66 arg0, class66 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method409(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method409(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("af.q(Lbb;Lbb;IZB)I")
    public static int method409(class66 arg0, class66 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field956;
            int var5 = arg1.field956;
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
            if (arg0.field952.equals("-")) {
                if (arg1.field952.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field952.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field952.compareTo(arg1.field952);
            }
        } else if (arg2 == 4) {
            return arg0.method1462() ? (arg1.method1462() ? 0 : 1) : (arg1.method1462() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1460() ? (arg1.method1460() ? 0 : 1) : (arg1.method1460() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1461() ? (arg1.method1461() ? 0 : 1) : (arg1.method1461() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1482() ? (arg1.method1482() ? 0 : 1) : (arg1.method1482() ? -1 : 0);
        } else {
            return arg0.field948 - arg1.field948;
        }
    }

    @ObfuscatedName("ik.i(I)Lbb;")
    public static class66 method4223() {
        return field945 < field946 ? Statics.field950[++field945 - 1] : null;
    }

    @ObfuscatedName("bb.x(B)Z")
    public boolean method1482() {
        return (0x1 & this.field949) != 0;
    }

    @ObfuscatedName("bb.e(I)Z")
    public boolean method1460() {
        return (0x2 & this.field949) != 0;
    }

    @ObfuscatedName("bb.p(B)Z")
    public boolean method1461() {
        return (0x4 & this.field949) != 0;
    }

    @ObfuscatedName("bb.b(I)Z")
    public boolean method1462() {
        return (0x8 & this.field949) != 0;
    }

    @ObfuscatedName("bb.n(I)Z")
    public boolean method1463() {
        return (0x20000000 & this.field949) != 0;
    }

    @ObfuscatedName("bb.f(I)Z")
    public boolean method1470() {
        return (0x2000000 & this.field949) != 0;
    }
}
