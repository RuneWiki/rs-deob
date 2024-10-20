package deob;

import java.net.URL;

@ObfuscatedName("ak")
public class class28 {

    @ObfuscatedName("ak.a")
    public static int field674 = 0;

    @ObfuscatedName("ak.b")
    public static int field680 = 0;

    @ObfuscatedName("ak.u")
    public static int[] field676 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ak.o")
    public static int[] field682 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ak.i")
    public int field675;

    @ObfuscatedName("ak.q")
    public int field677;

    @ObfuscatedName("ak.g")
    public int field678;

    @ObfuscatedName("ak.j")
    public String field686;

    @ObfuscatedName("ak.w")
    public String field683;

    @ObfuscatedName("ak.x")
    public int field684;

    @ObfuscatedName("ak.f")
    public int field685;

    @ObfuscatedName("hy.e(I)Z")
    public static boolean method3958() {
        try {
            if (Statics.field673 == null) {
                Statics.field673 = new class19(Statics.field1870, new URL(Statics.field651));
            } else {
                byte[] var0 = Statics.field673.method161();
                if (var0 != null) {
                    class123 var1 = new class123(var0);
                    field674 = var1.method2466();
                    Statics.field2033 = new class28[field674];
                    int var2 = 0;
                    while (var2 < field674) {
                        class28 var3 = Statics.field2033[var2] = new class28();
                        var3.field675 = var1.method2466();
                        var3.field677 = var1.method2468();
                        var3.field686 = var1.method2471();
                        var3.field683 = var1.method2471();
                        var3.field684 = var1.method2464();
                        var3.field678 = var1.method2467();
                        var3.field685 = var2++;
                    }
                    method1646(Statics.field2033, 0, Statics.field2033.length - 1, field682, field676);
                    Statics.field673 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field673 = null;
        }
        return false;
    }

    @ObfuscatedName("dl.l(III)V")
    public static void method2386(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field682[var5] != arg0) {
                var2[var4] = field682[var5];
                var3[var4] = field676[var5];
                var4++;
            }
        }
        field682 = var2;
        field676 = var3;
        method1646(Statics.field2033, 0, Statics.field2033.length - 1, field682, field676);
    }

    @ObfuscatedName("ck.c([Lak;II[I[II)V")
    public static void method1646(class28[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class28 var8 = arg0[var7];
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
                        var11 = arg0[var6].field685;
                        var12 = var8.field685;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field678;
                        var12 = var8.field678;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method595() ? 1 : 0;
                        var12 = var8.method595() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field675;
                        var12 = var8.field675;
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
                        var15 = arg0[var5].field685;
                        var16 = var8.field685;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field678;
                        var16 = var8.field678;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method595() ? 1 : 0;
                        var16 = var8.method595() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field675;
                        var16 = var8.field675;
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
                class28 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1646(arg0, arg1, var6, arg3, arg4);
        method1646(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ec.h(IIIZIZI)V")
    public static void method2864(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class28 var8 = Statics.field2033[var6];
        Statics.field2033[var6] = Statics.field2033[arg1];
        Statics.field2033[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class28 var10 = Statics.field2033[var9];
            int var11 = method159(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method159(var10, var8, arg4, arg5);
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
                class28 var14 = Statics.field2033[var9];
                Statics.field2033[var9] = Statics.field2033[var7];
                Statics.field2033[var7++] = var14;
            }
        }
        Statics.field2033[arg1] = Statics.field2033[var7];
        Statics.field2033[var7] = var8;
        method2864(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2864(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("t.r(Lak;Lak;IZI)I")
    public static int method159(class28 arg0, class28 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field678;
            int var5 = arg1.field678;
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
            return arg0.field684 - arg1.field684;
        } else if (arg2 == 3) {
            if (arg0.field683.equals("-")) {
                if (arg1.field683.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field683.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field683.compareTo(arg1.field683);
            }
        } else if (arg2 == 4) {
            return arg0.method598() ? (arg1.method598() ? 0 : 1) : (arg1.method598() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method596() ? (arg1.method596() ? 0 : 1) : (arg1.method596() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method597() ? (arg1.method597() ? 0 : 1) : (arg1.method597() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method595() ? (arg1.method595() ? 0 : 1) : (arg1.method595() ? -1 : 0);
        } else {
            return arg0.field675 - arg1.field675;
        }
    }

    @ObfuscatedName("ac.a(B)Lak;")
    public static class28 method1087() {
        return field680 < field674 ? Statics.field2033[++field680 - 1] : null;
    }

    @ObfuscatedName("ak.b(I)Z")
    public boolean method595() {
        return (0x1 & this.field677) != 0;
    }

    @ObfuscatedName("ak.u(I)Z")
    public boolean method596() {
        return (0x2 & this.field677) != 0;
    }

    @ObfuscatedName("ak.o(I)Z")
    public boolean method597() {
        return (0x4 & this.field677) != 0;
    }

    @ObfuscatedName("ak.p(I)Z")
    public boolean method598() {
        return (0x8 & this.field677) != 0;
    }

    @ObfuscatedName("ak.i(I)Z")
    public boolean method599() {
        return (0x20000000 & this.field677) != 0;
    }

    @ObfuscatedName("ak.q(I)Z")
    public boolean method600() {
        return (0x2000000 & this.field677) != 0;
    }
}
