package deob;

import java.net.URL;

@ObfuscatedName("e")
public class class26 {

    @ObfuscatedName("e.t")
    public static int field643 = 0;

    @ObfuscatedName("e.j")
    public static int field644 = 0;

    @ObfuscatedName("e.n")
    public static int[] field645 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("e.l")
    public static int[] field641 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("e.w")
    public int field647;

    @ObfuscatedName("e.v")
    public int field646;

    @ObfuscatedName("e.o")
    public int field648;

    @ObfuscatedName("e.p")
    public String field642;

    @ObfuscatedName("e.b")
    public String field651;

    @ObfuscatedName("e.z")
    public int field652;

    @ObfuscatedName("e.k")
    public int field653;

    @ObfuscatedName("db.f(B)Z")
    public static boolean method2234() {
        try {
            if (Statics.field2628 == null) {
                Statics.field2628 = new class19(Statics.field2245, new URL(Statics.field1628));
            } else {
                byte[] var0 = Statics.field2628.method183();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field643 = var1.method2353();
                    Statics.field2727 = new class26[field643];
                    int var2 = 0;
                    while (var2 < field643) {
                        class26 var3 = Statics.field2727[var2] = new class26();
                        var3.field647 = var1.method2353();
                        var3.field646 = var1.method2368();
                        var3.field642 = var1.method2365();
                        var3.field651 = var1.method2365();
                        var3.field652 = var1.method2363();
                        var3.field648 = var1.method2507();
                        var3.field653 = var2++;
                    }
                    method743(Statics.field2727, 0, Statics.field2727.length - 1, field641, field645);
                    Statics.field2628 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2628 = null;
        }
        return false;
    }

    @ObfuscatedName("ex.s(III)V")
    public static void method2670(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field641[var5] != arg0) {
                var2[var4] = field641[var5];
                var3[var4] = field645[var5];
                var4++;
            }
        }
        field641 = var2;
        field645 = var3;
        method743(Statics.field2727, 0, Statics.field2727.length - 1, field641, field645);
    }

    @ObfuscatedName("aq.q([Le;II[I[II)V")
    public static void method743(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class26 var8 = arg0[var7];
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
                        var11 = arg0[var6].field653;
                        var12 = var8.field653;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field648;
                        var12 = var8.field648;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method588() ? 1 : 0;
                        var12 = var8.method588() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field647;
                        var12 = var8.field647;
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
                        var15 = arg0[var5].field653;
                        var16 = var8.field653;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field648;
                        var16 = var8.field648;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method588() ? 1 : 0;
                        var16 = var8.method588() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field647;
                        var16 = var8.field647;
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
                class26 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method743(arg0, arg1, var6, arg3, arg4);
        method743(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("r.g(IIIZIZB)V")
    public static void method182(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field2727[var6];
        Statics.field2727[var6] = Statics.field2727[arg1];
        Statics.field2727[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method571(Statics.field2727[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field2727[var9];
                Statics.field2727[var9] = Statics.field2727[var7];
                Statics.field2727[var7++] = var10;
            }
        }
        Statics.field2727[arg1] = Statics.field2727[var7];
        Statics.field2727[var7] = var8;
        method182(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method182(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("y.m(Le;Le;IZIZI)I")
    public static int method571(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method3014(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method3014(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("fi.t(Le;Le;IZI)I")
    public static int method3014(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field648;
            int var5 = arg1.field648;
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
            return arg0.field652 - arg1.field652;
        } else if (arg2 == 3) {
            if (arg0.field651.equals("-")) {
                if (arg1.field651.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field651.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field651.compareTo(arg1.field651);
            }
        } else if (arg2 == 4) {
            return arg0.method591() ? (arg1.method591() ? 0 : 1) : (arg1.method591() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method589() ? (arg1.method589() ? 0 : 1) : (arg1.method589() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method590() ? (arg1.method590() ? 0 : 1) : (arg1.method590() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method588() ? (arg1.method588() ? 0 : 1) : (arg1.method588() ? -1 : 0);
        } else {
            return arg0.field647 - arg1.field647;
        }
    }

    @ObfuscatedName("az.j(I)Le;")
    public static class26 method695() {
        field644 = 0;
        class26 var0;
        if (field644 < field643) {
            var0 = Statics.field2727[++field644 - 1];
        } else {
            var0 = null;
        }
        return var0;
    }

    @ObfuscatedName("e.n(B)Z")
    public boolean method588() {
        return (0x1 & this.field646) != 0;
    }

    @ObfuscatedName("e.l(B)Z")
    public boolean method589() {
        return (0x2 & this.field646) != 0;
    }

    @ObfuscatedName("e.i(I)Z")
    public boolean method590() {
        return (0x4 & this.field646) != 0;
    }

    @ObfuscatedName("e.w(B)Z")
    public boolean method591() {
        return (0x8 & this.field646) != 0;
    }

    @ObfuscatedName("e.v(I)Z")
    public boolean method592() {
        return (0x20000000 & this.field646) != 0;
    }
}
