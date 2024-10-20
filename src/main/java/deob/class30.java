package deob;

import java.net.URL;

@ObfuscatedName("az")
public class class30 {

    @ObfuscatedName("az.p")
    public static int field670 = 0;

    @ObfuscatedName("az.u")
    public static int field675 = 0;

    @ObfuscatedName("az.z")
    public static int[] field676 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("az.l")
    public static int[] field677 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("az.g")
    public int field681;

    @ObfuscatedName("az.w")
    public int field679;

    @ObfuscatedName("az.r")
    public int field672;

    @ObfuscatedName("az.s")
    public String field680;

    @ObfuscatedName("az.k")
    public String field674;

    @ObfuscatedName("az.e")
    public int field683;

    @ObfuscatedName("az.j")
    public int field684;

    @ObfuscatedName("gc.d(I)Z")
    public static boolean method3393() {
        try {
            if (Statics.field1979 == null) {
                Statics.field1979 = new class27(Statics.field897, new URL(Statics.field65));
            } else {
                byte[] var0 = Statics.field1979.method576();
                if (var0 != null) {
                    class130 var1 = new class130(var0);
                    field670 = var1.method2232();
                    Statics.field673 = new class30[field670];
                    int var2 = 0;
                    while (var2 < field670) {
                        class30 var3 = Statics.field673[var2] = new class30();
                        var3.field681 = var1.method2232();
                        var3.field679 = var1.method2246();
                        var3.field680 = var1.method2314();
                        var3.field674 = var1.method2314();
                        var3.field683 = var1.method2379();
                        var3.field672 = var1.method2254();
                        var3.field684 = var2++;
                    }
                    method575(Statics.field673, 0, Statics.field673.length - 1, field677, field676);
                    Statics.field1979 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1979 = null;
        }
        return false;
    }

    @ObfuscatedName("i.c(III)V")
    public static void method195(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field677[var5] != arg0) {
                var2[var4] = field677[var5];
                var3[var4] = field676[var5];
                var4++;
            }
        }
        field677 = var2;
        field676 = var3;
        method575(Statics.field673, 0, Statics.field673.length - 1, field677, field676);
    }

    @ObfuscatedName("am.n([Laz;II[I[IS)V")
    public static void method575(class30[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field684;
                        var12 = var8.field684;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field672;
                        var12 = var8.field672;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method602() ? 1 : 0;
                        var12 = var8.method602() ? 1 : 0;
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
                        var15 = arg0[var5].field684;
                        var16 = var8.field684;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field672;
                        var16 = var8.field672;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method602() ? 1 : 0;
                        var16 = var8.method602() ? 1 : 0;
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
        method575(arg0, arg1, var6, arg3, arg4);
        method575(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("dc.q(IZIZI)V")
    public static void method2151(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field673 != null) {
            method149(0, Statics.field673.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("g.t(IIIZIZI)V")
    public static void method149(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class30 var8 = Statics.field673[var6];
        Statics.field673[var6] = Statics.field673[arg1];
        Statics.field673[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method103(Statics.field673[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class30 var10 = Statics.field673[var9];
                Statics.field673[var9] = Statics.field673[var7];
                Statics.field673[var7++] = var10;
            }
        }
        Statics.field673[arg1] = Statics.field673[var7];
        Statics.field673[var7] = var8;
        method149(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method149(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("z.p(Laz;Laz;IZIZI)I")
    public static int method103(class30 arg0, class30 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method890(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method890(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ah.u(Laz;Laz;IZB)I")
    public static int method890(class30 arg0, class30 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field672;
            int var5 = arg1.field672;
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
            return arg0.field683 - arg1.field683;
        } else if (arg2 == 3) {
            if (arg0.field674.equals("-")) {
                if (arg1.field674.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field674.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field674.compareTo(arg1.field674);
            }
        } else if (arg2 == 4) {
            return arg0.method605() ? (arg1.method605() ? 0 : 1) : (arg1.method605() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method603() ? (arg1.method603() ? 0 : 1) : (arg1.method603() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method604() ? (arg1.method604() ? 0 : 1) : (arg1.method604() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method602() ? (arg1.method602() ? 0 : 1) : (arg1.method602() ? -1 : 0);
        } else {
            return arg0.field681 - arg1.field681;
        }
    }

    @ObfuscatedName("ee.w(B)Laz;")
    public static class30 method2487() {
        return field675 < field670 ? Statics.field673[++field675 - 1] : null;
    }

    @ObfuscatedName("az.r(I)Z")
    public boolean method602() {
        return (0x1 & this.field679) != 0;
    }

    @ObfuscatedName("az.s(I)Z")
    public boolean method603() {
        return (0x2 & this.field679) != 0;
    }

    @ObfuscatedName("az.k(I)Z")
    public boolean method604() {
        return (0x4 & this.field679) != 0;
    }

    @ObfuscatedName("az.e(I)Z")
    public boolean method605() {
        return (0x8 & this.field679) != 0;
    }

    @ObfuscatedName("az.j(B)Z")
    public boolean method617() {
        return (0x20000000 & this.field679) != 0;
    }

    @ObfuscatedName("az.i(I)Z")
    public boolean method607() {
        return (0x2000000 & this.field679) != 0;
    }
}
