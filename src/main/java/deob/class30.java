package deob;

import java.net.URL;

@ObfuscatedName("al")
public class class30 {

    @ObfuscatedName("al.p")
    public static int field676 = 0;

    @ObfuscatedName("al.j")
    public static int field677 = 0;

    @ObfuscatedName("al.m")
    public static int[] field685 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("al.a")
    public static int[] field679 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("al.s")
    public int field673;

    @ObfuscatedName("al.k")
    public int field681;

    @ObfuscatedName("al.f")
    public int field682;

    @ObfuscatedName("al.o")
    public String field683;

    @ObfuscatedName("al.q")
    public String field684;

    @ObfuscatedName("al.c")
    public int field688;

    @ObfuscatedName("al.b")
    public int field686;

    @ObfuscatedName("fk.x(I)Z")
    public static boolean method2989() {
        try {
            if (Statics.field232 == null) {
                Statics.field232 = new class27(Statics.field1794, new URL(Statics.field279));
            } else {
                byte[] var0 = Statics.field232.method618();
                if (var0 != null) {
                    class154 var1 = new class154(var0);
                    field676 = var1.method2833();
                    Statics.field754 = new class30[field676];
                    int var2 = 0;
                    while (var2 < field676) {
                        class30 var3 = Statics.field754[var2] = new class30();
                        var3.field673 = var1.method2833();
                        var3.field681 = var1.method2803();
                        var3.field683 = var1.method2709();
                        var3.field684 = var1.method2709();
                        var3.field688 = var1.method2878();
                        var3.field682 = var1.method2704();
                        var3.field686 = var2++;
                    }
                    method101(Statics.field754, 0, Statics.field754.length - 1, field679, field685);
                    Statics.field232 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field232 = null;
        }
        return false;
    }

    @ObfuscatedName("gn.n(IIB)V")
    public static void method3285(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field679[var5] != arg0) {
                var2[var4] = field679[var5];
                var3[var4] = field685[var5];
                var4++;
            }
        }
        field679 = var2;
        field685 = var3;
        method101(Statics.field754, 0, Statics.field754.length - 1, field679, field685);
    }

    @ObfuscatedName("m.g([Lal;II[I[II)V")
    public static void method101(class30[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field686;
                        var12 = var8.field686;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field682;
                        var12 = var8.field682;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method655() ? 1 : 0;
                        var12 = var8.method655() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field673;
                        var12 = var8.field673;
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
                        var15 = arg0[var5].field686;
                        var16 = var8.field686;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field682;
                        var16 = var8.field682;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method655() ? 1 : 0;
                        var16 = var8.method655() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field673;
                        var16 = var8.field673;
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
        method101(arg0, arg1, var6, arg3, arg4);
        method101(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("az.v(IZIZI)V")
    public static void method860(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field754 != null) {
            method69(0, Statics.field754.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("y.y(IIIZIZI)V")
    public static void method69(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class30 var8 = Statics.field754[var6];
        Statics.field754[var6] = Statics.field754[arg1];
        Statics.field754[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2684(Statics.field754[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class30 var10 = Statics.field754[var9];
                Statics.field754[var9] = Statics.field754[var7];
                Statics.field754[var7++] = var10;
            }
        }
        Statics.field754[arg1] = Statics.field754[var7];
        Statics.field754[var7] = var8;
        method69(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method69(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ec.p(Lal;Lal;IZIZI)I")
    public static int method2684(class30 arg0, class30 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method621(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method621(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ab.j(Lal;Lal;IZI)I")
    public static int method621(class30 arg0, class30 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field682;
            int var5 = arg1.field682;
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
            if (arg0.field684.equals("-")) {
                if (arg1.field684.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field684.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field684.compareTo(arg1.field684);
            }
        } else if (arg2 == 4) {
            return arg0.method678() ? (arg1.method678() ? 0 : 1) : (arg1.method678() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method646() ? (arg1.method646() ? 0 : 1) : (arg1.method646() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method647() ? (arg1.method647() ? 0 : 1) : (arg1.method647() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method655() ? (arg1.method655() ? 0 : 1) : (arg1.method655() ? -1 : 0);
        } else {
            return arg0.field673 - arg1.field673;
        }
    }

    @ObfuscatedName("fr.s(I)Lal;")
    public static class30 method3147() {
        field677 = 0;
        return method160();
    }

    @ObfuscatedName("k.k(B)Lal;")
    public static class30 method160() {
        return field677 < field676 ? Statics.field754[++field677 - 1] : null;
    }

    @ObfuscatedName("al.f(B)Z")
    public boolean method655() {
        return (0x1 & this.field681) != 0;
    }

    @ObfuscatedName("al.o(I)Z")
    public boolean method646() {
        return (0x2 & this.field681) != 0;
    }

    @ObfuscatedName("al.q(I)Z")
    public boolean method647() {
        return (0x4 & this.field681) != 0;
    }

    @ObfuscatedName("al.c(S)Z")
    public boolean method678() {
        return (0x8 & this.field681) != 0;
    }

    @ObfuscatedName("al.b(I)Z")
    public boolean method649() {
        return (0x20000000 & this.field681) != 0;
    }

    @ObfuscatedName("al.w(I)Z")
    public boolean method650() {
        return (0x2000000 & this.field681) != 0;
    }
}
