package deob;

import java.net.URL;

@ObfuscatedName("z")
public class class24 {

    @ObfuscatedName("z.t")
    public static int field614 = 0;

    @ObfuscatedName("z.s")
    public static int field609 = 0;

    @ObfuscatedName("z.c")
    public static int[] field615 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("z.d")
    public static int[] field613 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("z.m")
    public int field617;

    @ObfuscatedName("z.h")
    public int field622;

    @ObfuscatedName("z.n")
    public int field619;

    @ObfuscatedName("z.x")
    public String field618;

    @ObfuscatedName("z.o")
    public String field621;

    @ObfuscatedName("z.r")
    public int field624;

    @ObfuscatedName("z.y")
    public int field623;

    @ObfuscatedName("w.p(I)Z")
    public static boolean method36() {
        try {
            if (Statics.field163 == null) {
                Statics.field163 = new class18(Statics.field1983, new URL(Statics.field1967));
            } else {
                byte[] var0 = Statics.field163.method171();
                if (var0 != null) {
                    class111 var1 = new class111(var0);
                    field614 = var1.method2177();
                    Statics.field612 = new class24[field614];
                    int var2 = 0;
                    while (var2 < field614) {
                        class24 var3 = Statics.field612[var2] = new class24();
                        var3.field617 = var1.method2177();
                        var3.field622 = var1.method2350();
                        var3.field618 = var1.method2265();
                        var3.field621 = var1.method2265();
                        var3.field624 = var1.method2314();
                        var3.field619 = var1.method2319();
                        var3.field623 = var2++;
                    }
                    method166(Statics.field612, 0, Statics.field612.length - 1, field613, field615);
                    Statics.field163 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field163 = null;
        }
        return false;
    }

    @ObfuscatedName("j.k(III)V")
    public static void method518(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field613[var5] != arg0) {
                var2[var4] = field613[var5];
                var3[var4] = field615[var5];
                var4++;
            }
        }
        field613 = var2;
        field615 = var3;
        method166(Statics.field612, 0, Statics.field612.length - 1, field613, field615);
    }

    @ObfuscatedName("y.e([Lz;II[I[II)V")
    public static void method166(class24[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class24 var8 = arg0[var7];
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
                        var11 = arg0[var6].field623;
                        var12 = var8.field623;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field619;
                        var12 = var8.field619;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method524() ? 1 : 0;
                        var12 = var8.method524() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field617;
                        var12 = var8.field617;
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
                        var15 = arg0[var5].field623;
                        var16 = var8.field623;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field619;
                        var16 = var8.field619;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method524() ? 1 : 0;
                        var16 = var8.method524() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field617;
                        var16 = var8.field617;
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
                class24 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method166(arg0, arg1, var6, arg3, arg4);
        method166(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("o.f(IZIZI)V")
    public static void method163(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field612 != null) {
            Statics.method2411(0, Statics.field612.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("al.t(Lz;Lz;IZIZI)I")
    public static int method637(class24 arg0, class24 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method3364(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method3364(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("fd.s(Lz;Lz;IZI)I")
    public static int method3364(class24 arg0, class24 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field619;
            int var5 = arg1.field619;
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
            return arg0.field624 - arg1.field624;
        } else if (arg2 == 3) {
            if (arg0.field621.equals("-")) {
                if (arg1.field621.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field621.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field621.compareTo(arg1.field621);
            }
        } else if (arg2 == 4) {
            return arg0.method527() ? (arg1.method527() ? 0 : 1) : (arg1.method527() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method559() ? (arg1.method559() ? 0 : 1) : (arg1.method559() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method526() ? (arg1.method526() ? 0 : 1) : (arg1.method526() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method524() ? (arg1.method524() ? 0 : 1) : (arg1.method524() ? -1 : 0);
        } else {
            return arg0.field617 - arg1.field617;
        }
    }

    @ObfuscatedName("hj.c(I)Lz;")
    public static class24 method3587() {
        field609 = 0;
        return method2502();
    }

    @ObfuscatedName("dm.d(I)Lz;")
    public static class24 method2502() {
        return field609 < field614 ? Statics.field612[++field609 - 1] : null;
    }

    @ObfuscatedName("z.v(I)Z")
    public boolean method524() {
        return (0x1 & this.field622) != 0;
    }

    @ObfuscatedName("z.m(B)Z")
    public boolean method559() {
        return (0x2 & this.field622) != 0;
    }

    @ObfuscatedName("z.h(I)Z")
    public boolean method526() {
        return (0x4 & this.field622) != 0;
    }

    @ObfuscatedName("z.n(B)Z")
    public boolean method527() {
        return (0x8 & this.field622) != 0;
    }
}
