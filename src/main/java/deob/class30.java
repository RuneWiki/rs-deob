package deob;

import java.net.URL;

@ObfuscatedName("aa")
public class class30 {

    @ObfuscatedName("aa.g")
    public static int field683 = 0;

    @ObfuscatedName("aa.k")
    public static int field679 = 0;

    @ObfuscatedName("aa.u")
    public static int[] field674 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("aa.b")
    public static int[] field681 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("aa.r")
    public int field682;

    @ObfuscatedName("aa.n")
    public int field684;

    @ObfuscatedName("aa.m")
    public int field685;

    @ObfuscatedName("aa.j")
    public String field686;

    @ObfuscatedName("aa.w")
    public String field678;

    @ObfuscatedName("aa.p")
    public int field688;

    @ObfuscatedName("aa.o")
    public int field689;

    @ObfuscatedName("r.s(I)Z")
    public static boolean method128() {
        try {
            if (Statics.field675 == null) {
                Statics.field675 = new class27(Statics.field253, new URL(Statics.field55));
            } else {
                byte[] var0 = Statics.field675.method570();
                if (var0 != null) {
                    class154 var1 = new class154(var0);
                    field683 = var1.method2541();
                    Statics.field677 = new class30[field683];
                    int var2 = 0;
                    while (var2 < field683) {
                        class30 var3 = Statics.field677[var2] = new class30();
                        var3.field682 = var1.method2541();
                        var3.field684 = var1.method2550();
                        var3.field686 = var1.method2734();
                        var3.field678 = var1.method2734();
                        var3.field688 = var1.method2545();
                        var3.field685 = var1.method2672();
                        var3.field689 = var2++;
                    }
                    Statics.method816(Statics.field677, 0, Statics.field677.length - 1, field681, field674);
                    Statics.field675 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field675 = null;
        }
        return false;
    }

    @ObfuscatedName("ff.c(III)V")
    public static void method2772(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field681[var5] != arg0) {
                var2[var4] = field681[var5];
                var3[var4] = field674[var5];
                var4++;
            }
        }
        field681 = var2;
        field674 = var3;
        Statics.method816(Statics.field677, 0, Statics.field677.length - 1, field681, field674);
    }

    @ObfuscatedName("fj.g(IIIZIZI)V")
    public static void method2762(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class30 var8 = Statics.field677[var6];
        Statics.field677[var6] = Statics.field677[arg1];
        Statics.field677[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class30 var10 = Statics.field677[var9];
            int var11 = method3618(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method3618(var10, var8, arg4, arg5);
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
                class30 var14 = Statics.field677[var9];
                Statics.field677[var9] = Statics.field677[var7];
                Statics.field677[var7++] = var14;
            }
        }
        Statics.field677[arg1] = Statics.field677[var7];
        Statics.field677[var7] = var8;
        method2762(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2762(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("hn.k(Laa;Laa;IZI)I")
    public static int method3618(class30 arg0, class30 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field685;
            int var5 = arg1.field685;
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
            return arg0.field688 - arg1.field688;
        } else if (arg2 == 3) {
            if (arg0.field678.equals("-")) {
                if (arg1.field678.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field678.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field678.compareTo(arg1.field678);
            }
        } else if (arg2 == 4) {
            return arg0.method598() ? (arg1.method598() ? 0 : 1) : (arg1.method598() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method596() ? (arg1.method596() ? 0 : 1) : (arg1.method596() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method597() ? (arg1.method597() ? 0 : 1) : (arg1.method597() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method619() ? (arg1.method619() ? 0 : 1) : (arg1.method619() ? -1 : 0);
        } else {
            return arg0.field682 - arg1.field682;
        }
    }

    @ObfuscatedName("aa.u(I)Z")
    public boolean method619() {
        return (0x1 & this.field684) != 0;
    }

    @ObfuscatedName("aa.b(B)Z")
    public boolean method596() {
        return (0x2 & this.field684) != 0;
    }

    @ObfuscatedName("aa.x(B)Z")
    public boolean method597() {
        return (0x4 & this.field684) != 0;
    }

    @ObfuscatedName("aa.r(B)Z")
    public boolean method598() {
        return (0x8 & this.field684) != 0;
    }

    @ObfuscatedName("aa.n(I)Z")
    public boolean method632() {
        return (0x20000000 & this.field684) != 0;
    }

    @ObfuscatedName("aa.m(I)Z")
    public boolean method607() {
        return (0x2000000 & this.field684) != 0;
    }
}
