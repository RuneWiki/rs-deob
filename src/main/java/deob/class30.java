package deob;

import java.net.URL;

@ObfuscatedName("as")
public class class30 {

    @ObfuscatedName("as.j")
    public static int field678 = 0;

    @ObfuscatedName("as.q")
    public static int field671 = 0;

    @ObfuscatedName("as.d")
    public static int[] field675 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("as.n")
    public static int[] field670 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("as.s")
    public int field672;

    @ObfuscatedName("as.g")
    public int field676;

    @ObfuscatedName("as.i")
    public int field677;

    @ObfuscatedName("as.v")
    public String field673;

    @ObfuscatedName("as.a")
    public String field679;

    @ObfuscatedName("as.h")
    public int field680;

    @ObfuscatedName("as.p")
    public int field667;

    @ObfuscatedName("n.k(I)Z")
    public static boolean method115() {
        try {
            if (Statics.field674 == null) {
                Statics.field674 = new class27(Statics.field1094, new URL(Statics.field215));
            } else {
                byte[] var0 = Statics.field674.method617();
                if (var0 != null) {
                    class161 var1 = new class161(var0);
                    field678 = var1.method2735();
                    Statics.field185 = new class30[field678];
                    int var2 = 0;
                    while (var2 < field678) {
                        class30 var3 = Statics.field185[var2] = new class30();
                        var3.field672 = var1.method2735();
                        var3.field676 = var1.method2868();
                        var3.field673 = var1.method2740();
                        var3.field679 = var1.method2740();
                        var3.field680 = var1.method2733();
                        var3.field677 = var1.method2736();
                        var3.field667 = var2++;
                    }
                    Statics.method1848(Statics.field185, 0, Statics.field185.length - 1, field670, field675);
                    Statics.field674 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field674 = null;
        }
        return false;
    }

    @ObfuscatedName("hh.y(III)V")
    public static void method3725(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field670[var5] != arg0) {
                var2[var4] = field670[var5];
                var3[var4] = field675[var5];
                var4++;
            }
        }
        field670 = var2;
        field675 = var3;
        Statics.method1848(Statics.field185, 0, Statics.field185.length - 1, field670, field675);
    }

    @ObfuscatedName("fz.r(IIIZIZB)V")
    public static void method3057(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class30 var8 = Statics.field185[var6];
        Statics.field185[var6] = Statics.field185[arg1];
        Statics.field185[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class30 var10 = Statics.field185[var9];
            int var11 = method694(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method694(var10, var8, arg4, arg5);
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
                class30 var14 = Statics.field185[var9];
                Statics.field185[var9] = Statics.field185[var7];
                Statics.field185[var7++] = var14;
            }
        }
        Statics.field185[arg1] = Statics.field185[var7];
        Statics.field185[var7] = var8;
        method3057(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3057(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ah.w(Las;Las;IZB)I")
    public static int method694(class30 arg0, class30 arg1, int arg2, boolean arg3) {
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
            if (arg0.field679.equals("-")) {
                if (arg1.field679.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field679.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field679.compareTo(arg1.field679);
            }
        } else if (arg2 == 4) {
            return arg0.method652() ? (arg1.method652() ? 0 : 1) : (arg1.method652() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method675() ? (arg1.method675() ? 0 : 1) : (arg1.method675() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method651() ? (arg1.method651() ? 0 : 1) : (arg1.method651() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method649() ? (arg1.method649() ? 0 : 1) : (arg1.method649() ? -1 : 0);
        } else {
            return arg0.field672 - arg1.field672;
        }
    }

    @ObfuscatedName("q.j(B)Las;")
    public static class30 method92() {
        field671 = 0;
        class30 var0;
        if (field671 < field678) {
            var0 = Statics.field185[++field671 - 1];
        } else {
            var0 = null;
        }
        return var0;
    }

    @ObfuscatedName("as.c(B)Z")
    public boolean method649() {
        return (0x1 & this.field676) != 0;
    }

    @ObfuscatedName("as.g(S)Z")
    public boolean method675() {
        return (0x2 & this.field676) != 0;
    }

    @ObfuscatedName("as.i(I)Z")
    public boolean method651() {
        return (0x4 & this.field676) != 0;
    }

    @ObfuscatedName("as.v(I)Z")
    public boolean method652() {
        return (0x8 & this.field676) != 0;
    }

    @ObfuscatedName("as.a(B)Z")
    public boolean method658() {
        return (0x20000000 & this.field676) != 0;
    }

    @ObfuscatedName("as.h(I)Z")
    public boolean method654() {
        return (0x2000000 & this.field676) != 0;
    }
}
