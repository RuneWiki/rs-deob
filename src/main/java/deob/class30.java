package deob;

import java.net.URL;

@ObfuscatedName("as")
public class class30 {

    @ObfuscatedName("as.r")
    public static int field673 = 0;

    @ObfuscatedName("as.c")
    public static int field674 = 0;

    @ObfuscatedName("as.p")
    public static int[] field675 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("as.g")
    public static int[] field687 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("as.q")
    public int field677;

    @ObfuscatedName("as.l")
    public int field678;

    @ObfuscatedName("as.y")
    public int field679;

    @ObfuscatedName("as.e")
    public String field680;

    @ObfuscatedName("as.x")
    public String field668;

    @ObfuscatedName("as.f")
    public int field672;

    @ObfuscatedName("as.s")
    public int field670;

    @ObfuscatedName("ck.n(B)Z")
    public static boolean method1481() {
        try {
            if (Statics.field3081 == null) {
                Statics.field3081 = new class27(Statics.field160, new URL(Statics.field1630));
            } else {
                byte[] var0 = Statics.field3081.method609();
                if (var0 != null) {
                    class161 var1 = new class161(var0);
                    field673 = var1.method2887();
                    Statics.field681 = new class30[field673];
                    int var2 = 0;
                    while (var2 < field673) {
                        class30 var3 = Statics.field681[var2] = new class30();
                        var3.field677 = var1.method2887();
                        var3.field678 = var1.method2785();
                        var3.field680 = var1.method2847();
                        var3.field668 = var1.method2847();
                        var3.field672 = var1.method2823();
                        var3.field679 = var1.method2783();
                        var3.field670 = var2++;
                    }
                    method1824(Statics.field681, 0, Statics.field681.length - 1, field687, field675);
                    Statics.field3081 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3081 = null;
        }
        return false;
    }

    @ObfuscatedName("a.d(IIB)V")
    public static void method208(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field687[var5] != arg0) {
                var2[var4] = field687[var5];
                var3[var4] = field675[var5];
                var4++;
            }
        }
        field687 = var2;
        field675 = var3;
        method1824(Statics.field681, 0, Statics.field681.length - 1, field687, field675);
    }

    @ObfuscatedName("ch.m([Las;II[I[II)V")
    public static void method1824(class30[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field670;
                        var12 = var8.field670;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field679;
                        var12 = var8.field679;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method634() ? 1 : 0;
                        var12 = var8.method634() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field677;
                        var12 = var8.field677;
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
                        var15 = arg0[var5].field670;
                        var16 = var8.field670;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field679;
                        var16 = var8.field679;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method634() ? 1 : 0;
                        var16 = var8.method634() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field677;
                        var16 = var8.field677;
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
        method1824(arg0, arg1, var6, arg3, arg4);
        method1824(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("av.h(IIIZIZI)V")
    public static void method614(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class30 var8 = Statics.field681[var6];
        Statics.field681[var6] = Statics.field681[arg1];
        Statics.field681[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class30 var10 = Statics.field681[var9];
            int var11 = method732(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method732(var10, var8, arg4, arg5);
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
                class30 var14 = Statics.field681[var9];
                Statics.field681[var9] = Statics.field681[var7];
                Statics.field681[var7++] = var14;
            }
        }
        Statics.field681[arg1] = Statics.field681[var7];
        Statics.field681[var7] = var8;
        method614(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method614(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("am.w(Las;Las;IZB)I")
    public static int method732(class30 arg0, class30 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field679;
            int var5 = arg1.field679;
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
            return arg0.field672 - arg1.field672;
        } else if (arg2 == 3) {
            if (arg0.field668.equals("-")) {
                if (arg1.field668.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field668.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field668.compareTo(arg1.field668);
            }
        } else if (arg2 == 4) {
            return arg0.method637() ? (arg1.method637() ? 0 : 1) : (arg1.method637() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method650() ? (arg1.method650() ? 0 : 1) : (arg1.method650() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method636() ? (arg1.method636() ? 0 : 1) : (arg1.method636() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method634() ? (arg1.method634() ? 0 : 1) : (arg1.method634() ? -1 : 0);
        } else {
            return arg0.field677 - arg1.field677;
        }
    }

    @ObfuscatedName("as.r(I)Z")
    public boolean method634() {
        return (0x1 & this.field678) != 0;
    }

    @ObfuscatedName("as.c(I)Z")
    public boolean method650() {
        return (0x2 & this.field678) != 0;
    }

    @ObfuscatedName("as.z(I)Z")
    public boolean method636() {
        return (0x4 & this.field678) != 0;
    }

    @ObfuscatedName("as.q(I)Z")
    public boolean method637() {
        return (0x8 & this.field678) != 0;
    }

    @ObfuscatedName("as.l(I)Z")
    public boolean method639() {
        return (0x20000000 & this.field678) != 0;
    }

    @ObfuscatedName("as.y(I)Z")
    public boolean method664() {
        return (0x2000000 & this.field678) != 0;
    }
}
