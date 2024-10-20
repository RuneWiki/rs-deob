package deob;

import java.net.URL;

@ObfuscatedName("au")
public class class30 {

    @ObfuscatedName("au.j")
    public static int field671 = 0;

    @ObfuscatedName("au.g")
    public static int field673 = 0;

    @ObfuscatedName("au.s")
    public static int[] field672 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("au.r")
    public static int[] field678 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("au.k")
    public int field676;

    @ObfuscatedName("au.f")
    public int field677;

    @ObfuscatedName("au.a")
    public int field669;

    @ObfuscatedName("au.v")
    public String field679;

    @ObfuscatedName("au.d")
    public String field680;

    @ObfuscatedName("au.o")
    public int field668;

    @ObfuscatedName("au.q")
    public int field682;

    @ObfuscatedName("ae.b(I)Z")
    public static boolean method604() {
        try {
            if (Statics.field1476 == null) {
                Statics.field1476 = new class27(Statics.field2640, new URL(Statics.field16));
            } else {
                byte[] var0 = Statics.field1476.method577();
                if (var0 != null) {
                    class154 var1 = new class154(var0);
                    field671 = var1.method2671();
                    Statics.field61 = new class30[field671];
                    int var2 = 0;
                    while (var2 < field671) {
                        class30 var3 = Statics.field61[var2] = new class30();
                        var3.field676 = var1.method2671();
                        var3.field677 = var1.method2815();
                        var3.field679 = var1.method2677();
                        var3.field680 = var1.method2677();
                        var3.field668 = var1.method2669();
                        var3.field669 = var1.method2699();
                        var3.field682 = var2++;
                    }
                    method193(Statics.field61, 0, Statics.field61.length - 1, field678, field672);
                    Statics.field1476 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1476 = null;
        }
        return false;
    }

    @ObfuscatedName("n.e(III)V")
    public static void method226(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field678[var5] != arg0) {
                var2[var4] = field678[var5];
                var3[var4] = field672[var5];
                var4++;
            }
        }
        field678 = var2;
        field672 = var3;
        method193(Statics.field61, 0, Statics.field61.length - 1, field678, field672);
    }

    @ObfuscatedName("d.c([Lau;II[I[II)V")
    public static void method193(class30[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field682;
                        var12 = var8.field682;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field669;
                        var12 = var8.field669;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method608() ? 1 : 0;
                        var12 = var8.method608() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field676;
                        var12 = var8.field676;
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
                        var15 = arg0[var5].field682;
                        var16 = var8.field682;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field669;
                        var16 = var8.field669;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method608() ? 1 : 0;
                        var16 = var8.method608() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field676;
                        var16 = var8.field676;
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
        method193(arg0, arg1, var6, arg3, arg4);
        method193(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("c.l(IIIZIZI)V")
    public static void method28(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class30 var8 = Statics.field61[var6];
        Statics.field61[var6] = Statics.field61[arg1];
        Statics.field61[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method215(Statics.field61[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class30 var10 = Statics.field61[var9];
                Statics.field61[var9] = Statics.field61[var7];
                Statics.field61[var7++] = var10;
            }
        }
        Statics.field61[arg1] = Statics.field61[var7];
        Statics.field61[var7] = var8;
        method28(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method28(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("z.y(Lau;Lau;IZIZI)I")
    public static int method215(class30 arg0, class30 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = Statics.method903(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = Statics.method903(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("gf.t(I)Lau;")
    public static class30 method3293() {
        field673 = 0;
        class30 var0;
        if (field673 < field671) {
            var0 = Statics.field61[++field673 - 1];
        } else {
            var0 = null;
        }
        return var0;
    }

    @ObfuscatedName("au.k(I)Z")
    public boolean method608() {
        return (0x1 & this.field677) != 0;
    }

    @ObfuscatedName("au.f(B)Z")
    public boolean method609() {
        return (0x2 & this.field677) != 0;
    }

    @ObfuscatedName("au.a(B)Z")
    public boolean method610() {
        return (0x4 & this.field677) != 0;
    }

    @ObfuscatedName("au.v(B)Z")
    public boolean method641() {
        return (0x8 & this.field677) != 0;
    }

    @ObfuscatedName("au.d(I)Z")
    public boolean method612() {
        return (0x20000000 & this.field677) != 0;
    }

    @ObfuscatedName("au.o(I)Z")
    public boolean method634() {
        return (0x2000000 & this.field677) != 0;
    }
}
