package deob;

import java.net.URL;

@ObfuscatedName("as")
public class class28 {

    @ObfuscatedName("as.u")
    public static int field686 = 0;

    @ObfuscatedName("as.d")
    public static int field666 = 0;

    @ObfuscatedName("as.l")
    public static int[] field672 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("as.m")
    public static int[] field682 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("as.y")
    public int field675;

    @ObfuscatedName("as.s")
    public int field671;

    @ObfuscatedName("as.p")
    public int field677;

    @ObfuscatedName("as.v")
    public String field678;

    @ObfuscatedName("as.r")
    public String field670;

    @ObfuscatedName("as.c")
    public int field680;

    @ObfuscatedName("as.w")
    public int field681;

    @ObfuscatedName("db.i(I)Z")
    public static boolean method2188() {
        try {
            if (Statics.field679 == null) {
                Statics.field679 = new class19(Statics.field899, new URL(Statics.field73));
            } else {
                byte[] var0 = Statics.field679.method189();
                if (var0 != null) {
                    class123 var1 = new class123(var0);
                    field686 = var1.method2406();
                    Statics.field1687 = new class28[field686];
                    int var2 = 0;
                    while (var2 < field686) {
                        class28 var3 = Statics.field1687[var2] = new class28();
                        var3.field675 = var1.method2406();
                        var3.field671 = var1.method2409();
                        var3.field678 = var1.method2412();
                        var3.field670 = var1.method2412();
                        var3.field680 = var1.method2404();
                        var3.field677 = var1.method2407();
                        var3.field681 = var2++;
                    }
                    method553(Statics.field1687, 0, Statics.field1687.length - 1, field682, field672);
                    Statics.field679 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field679 = null;
        }
        return false;
    }

    @ObfuscatedName("ac.h(IIB)V")
    public static void method803(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field682[var5] != arg0) {
                var2[var4] = field682[var5];
                var3[var4] = field672[var5];
                var4++;
            }
        }
        field682 = var2;
        field672 = var3;
        method553(Statics.field1687, 0, Statics.field1687.length - 1, field682, field672);
    }

    @ObfuscatedName("b.e([Las;II[I[II)V")
    public static void method553(class28[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field681;
                        var12 = var8.field681;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field677;
                        var12 = var8.field677;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method584() ? 1 : 0;
                        var12 = var8.method584() ? 1 : 0;
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
                        var15 = arg0[var5].field681;
                        var16 = var8.field681;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field677;
                        var16 = var8.field677;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method584() ? 1 : 0;
                        var16 = var8.method584() ? 1 : 0;
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
        method553(arg0, arg1, var6, arg3, arg4);
        method553(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("c.g(IZIZB)V")
    public static void method175(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1687 != null) {
            method2989(0, Statics.field1687.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fa.n(IIIZIZB)V")
    public static void method2989(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class28 var8 = Statics.field1687[var6];
        Statics.field1687[var6] = Statics.field1687[arg1];
        Statics.field1687[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class28 var10 = Statics.field1687[var9];
            int var11 = method178(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method178(var10, var8, arg4, arg5);
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
                class28 var14 = Statics.field1687[var9];
                Statics.field1687[var9] = Statics.field1687[var7];
                Statics.field1687[var7++] = var14;
            }
        }
        Statics.field1687[arg1] = Statics.field1687[var7];
        Statics.field1687[var7] = var8;
        method2989(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2989(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("c.u(Las;Las;IZB)I")
    public static int method178(class28 arg0, class28 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field677;
            int var5 = arg1.field677;
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
            return arg0.field680 - arg1.field680;
        } else if (arg2 == 3) {
            if (arg0.field670.equals("-")) {
                if (arg1.field670.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field670.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field670.compareTo(arg1.field670);
            }
        } else if (arg2 == 4) {
            return arg0.method587() ? (arg1.method587() ? 0 : 1) : (arg1.method587() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method608() ? (arg1.method608() ? 0 : 1) : (arg1.method608() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method613() ? (arg1.method613() ? 0 : 1) : (arg1.method613() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method584() ? (arg1.method584() ? 0 : 1) : (arg1.method584() ? -1 : 0);
        } else {
            return arg0.field675 - arg1.field675;
        }
    }

    @ObfuscatedName("aw.d(I)Las;")
    public static class28 method742() {
        return field666 < field686 ? Statics.field1687[++field666 - 1] : null;
    }

    @ObfuscatedName("as.l(B)Z")
    public boolean method584() {
        return (0x1 & this.field671) != 0;
    }

    @ObfuscatedName("as.m(B)Z")
    public boolean method608() {
        return (0x2 & this.field671) != 0;
    }

    @ObfuscatedName("as.j(I)Z")
    public boolean method613() {
        return (0x4 & this.field671) != 0;
    }

    @ObfuscatedName("as.y(I)Z")
    public boolean method587() {
        return (0x8 & this.field671) != 0;
    }

    @ObfuscatedName("as.s(I)Z")
    public boolean method588() {
        return (0x20000000 & this.field671) != 0;
    }

    @ObfuscatedName("as.p(I)Z")
    public boolean method589() {
        return (0x2000000 & this.field671) != 0;
    }
}
