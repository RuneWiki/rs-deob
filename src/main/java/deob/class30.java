package deob;

import java.net.URL;

@ObfuscatedName("af")
public class class30 {

    @ObfuscatedName("af.h")
    public static int field677 = 0;

    @ObfuscatedName("af.n")
    public static int field682 = 0;

    @ObfuscatedName("af.f")
    public static int[] field679 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("af.a")
    public static int[] field678 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("af.x")
    public int field681;

    @ObfuscatedName("af.z")
    public int field676;

    @ObfuscatedName("af.p")
    public int field683;

    @ObfuscatedName("af.s")
    public String field684;

    @ObfuscatedName("af.o")
    public String field685;

    @ObfuscatedName("af.y")
    public int field686;

    @ObfuscatedName("af.w")
    public int field687;

    @ObfuscatedName("w.b(I)Z")
    public static boolean method198() {
        try {
            if (Statics.field1063 == null) {
                Statics.field1063 = new class27(Statics.field580, new URL(Statics.field1568));
            } else {
                byte[] var0 = Statics.field1063.method619();
                if (var0 != null) {
                    class154 var1 = new class154(var0);
                    field677 = var1.method2801();
                    Statics.field674 = new class30[field677];
                    int var2 = 0;
                    while (var2 < field677) {
                        class30 var3 = Statics.field674[var2] = new class30();
                        var3.field681 = var1.method2801();
                        var3.field676 = var1.method2683();
                        var3.field684 = var1.method2686();
                        var3.field685 = var1.method2686();
                        var3.field686 = var1.method2678();
                        var3.field683 = var1.method2681();
                        var3.field687 = var2++;
                    }
                    method12(Statics.field674, 0, Statics.field674.length - 1, field678, field679);
                    Statics.field1063 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1063 = null;
        }
        return false;
    }

    @ObfuscatedName("c.l(III)V")
    public static void method215(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field678[var5] != arg0) {
                var2[var4] = field678[var5];
                var3[var4] = field679[var5];
                var4++;
            }
        }
        field678 = var2;
        field679 = var3;
        method12(Statics.field674, 0, Statics.field674.length - 1, field678, field679);
    }

    @ObfuscatedName("b.i([Laf;II[I[IS)V")
    public static void method12(class30[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field687;
                        var12 = var8.field687;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field683;
                        var12 = var8.field683;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method660() ? 1 : 0;
                        var12 = var8.method660() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field681;
                        var12 = var8.field681;
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
                        var15 = arg0[var5].field687;
                        var16 = var8.field687;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field683;
                        var16 = var8.field683;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method660() ? 1 : 0;
                        var16 = var8.method660() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field681;
                        var16 = var8.field681;
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
        method12(arg0, arg1, var6, arg3, arg4);
        method12(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("co.t(IIIZIZI)V")
    public static void method1894(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class30 var8 = Statics.field674[var6];
        Statics.field674[var6] = Statics.field674[arg1];
        Statics.field674[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method112(Statics.field674[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class30 var10 = Statics.field674[var9];
                Statics.field674[var9] = Statics.field674[var7];
                Statics.field674[var7++] = var10;
            }
        }
        Statics.field674[arg1] = Statics.field674[var7];
        Statics.field674[var7] = var8;
        method1894(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1894(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("f.k(Laf;Laf;IZIZI)I")
    public static int method112(class30 arg0, class30 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method203(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method203(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("m.x(Laf;Laf;IZI)I")
    public static int method203(class30 arg0, class30 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field683;
            int var5 = arg1.field683;
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
            return arg0.field686 - arg1.field686;
        } else if (arg2 == 3) {
            if (arg0.field685.equals("-")) {
                if (arg1.field685.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field685.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field685.compareTo(arg1.field685);
            }
        } else if (arg2 == 4) {
            return arg0.method648() ? (arg1.method648() ? 0 : 1) : (arg1.method648() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method661() ? (arg1.method661() ? 0 : 1) : (arg1.method661() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method644() ? (arg1.method644() ? 0 : 1) : (arg1.method644() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method660() ? (arg1.method660() ? 0 : 1) : (arg1.method660() ? -1 : 0);
        } else {
            return arg0.field681 - arg1.field681;
        }
    }

    @ObfuscatedName("t.z(I)Laf;")
    public static class30 method41() {
        field682 = 0;
        return method1443();
    }

    @ObfuscatedName("bu.p(I)Laf;")
    public static class30 method1443() {
        return field682 < field677 ? Statics.field674[++field682 - 1] : null;
    }

    @ObfuscatedName("af.s(I)Z")
    public boolean method660() {
        return (0x1 & this.field676) != 0;
    }

    @ObfuscatedName("af.o(B)Z")
    public boolean method661() {
        return (0x2 & this.field676) != 0;
    }

    @ObfuscatedName("af.y(I)Z")
    public boolean method644() {
        return (0x4 & this.field676) != 0;
    }

    @ObfuscatedName("af.w(B)Z")
    public boolean method648() {
        return (0x8 & this.field676) != 0;
    }

    @ObfuscatedName("af.m(I)Z")
    public boolean method649() {
        return (0x20000000 & this.field676) != 0;
    }

    @ObfuscatedName("af.u(I)Z")
    public boolean method650() {
        return (0x2000000 & this.field676) != 0;
    }
}
