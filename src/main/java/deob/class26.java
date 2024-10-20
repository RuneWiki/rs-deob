package deob;

import java.net.URL;

@ObfuscatedName("i")
public class class26 {

    @ObfuscatedName("i.u")
    public static int field638 = 0;

    @ObfuscatedName("i.j")
    public static int field654 = 0;

    @ObfuscatedName("i.w")
    public static int[] field640 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("i.y")
    public static int[] field641 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("i.h")
    public int field651;

    @ObfuscatedName("i.e")
    public int field649;

    @ObfuscatedName("i.v")
    public int field645;

    @ObfuscatedName("i.p")
    public String field646;

    @ObfuscatedName("i.m")
    public String field647;

    @ObfuscatedName("i.b")
    public int field648;

    @ObfuscatedName("i.s")
    public int field635;

    @ObfuscatedName("ak.n(B)Z")
    public static boolean method731() {
        try {
            if (Statics.field642 == null) {
                Statics.field642 = new class19(Statics.field162, new URL(Statics.field3157));
            } else {
                byte[] var0 = Statics.field642.method195();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field638 = var1.method2430();
                    Statics.field1157 = new class26[field638];
                    int var2 = 0;
                    while (var2 < field638) {
                        class26 var3 = Statics.field1157[var2] = new class26();
                        var3.field651 = var1.method2430();
                        var3.field649 = var1.method2365();
                        var3.field646 = var1.method2368();
                        var3.field647 = var1.method2368();
                        var3.field648 = var1.method2360();
                        var3.field645 = var1.method2449();
                        var3.field635 = var2++;
                    }
                    method46(Statics.field1157, 0, Statics.field1157.length - 1, field641, field640);
                    Statics.field642 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field642 = null;
        }
        return false;
    }

    @ObfuscatedName("e.q(III)V")
    public static void method130(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field641[var5] != arg0) {
                var2[var4] = field641[var5];
                var3[var4] = field640[var5];
                var4++;
            }
        }
        field641 = var2;
        field640 = var3;
        method46(Statics.field1157, 0, Statics.field1157.length - 1, field641, field640);
    }

    @ObfuscatedName("r.c([Li;II[I[IB)V")
    public static void method46(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field635;
                        var12 = var8.field635;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field645;
                        var12 = var8.field645;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method615() ? 1 : 0;
                        var12 = var8.method615() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field651;
                        var12 = var8.field651;
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
                        var15 = arg0[var5].field635;
                        var16 = var8.field635;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field645;
                        var16 = var8.field645;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method615() ? 1 : 0;
                        var16 = var8.method615() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field651;
                        var16 = var8.field651;
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
        method46(arg0, arg1, var6, arg3, arg4);
        method46(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("av.l(IZIZB)V")
    public static void method837(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1157 != null) {
            method736(0, Statics.field1157.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("an.r(IIIZIZI)V")
    public static void method736(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field1157[var6];
        Statics.field1157[var6] = Statics.field1157[arg1];
        Statics.field1157[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class26 var10 = Statics.field1157[var9];
            int var11 = method3209(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method3209(var10, var8, arg4, arg5);
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
                class26 var14 = Statics.field1157[var9];
                Statics.field1157[var9] = Statics.field1157[var7];
                Statics.field1157[var7++] = var14;
            }
        }
        Statics.field1157[arg1] = Statics.field1157[var7];
        Statics.field1157[var7] = var8;
        method736(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method736(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("fs.u(Li;Li;IZI)I")
    public static int method3209(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field645;
            int var5 = arg1.field645;
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
            return arg0.field648 - arg1.field648;
        } else if (arg2 == 3) {
            if (arg0.field647.equals("-")) {
                if (arg1.field647.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field647.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field647.compareTo(arg1.field647);
            }
        } else if (arg2 == 4) {
            return arg0.method608() ? (arg1.method608() ? 0 : 1) : (arg1.method608() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method607() ? (arg1.method607() ? 0 : 1) : (arg1.method607() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method633() ? (arg1.method633() ? 0 : 1) : (arg1.method633() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method615() ? (arg1.method615() ? 0 : 1) : (arg1.method615() ? -1 : 0);
        } else {
            return arg0.field651 - arg1.field651;
        }
    }

    @ObfuscatedName("ej.j(B)Li;")
    public static class26 method2936() {
        field654 = 0;
        return method903();
    }

    @ObfuscatedName("ax.w(I)Li;")
    public static class26 method903() {
        return field654 < field638 ? Statics.field1157[++field654 - 1] : null;
    }

    @ObfuscatedName("i.y(I)Z")
    public boolean method615() {
        return (0x1 & this.field649) != 0;
    }

    @ObfuscatedName("i.o(I)Z")
    public boolean method607() {
        return (0x2 & this.field649) != 0;
    }

    @ObfuscatedName("i.h(I)Z")
    public boolean method633() {
        return (0x4 & this.field649) != 0;
    }

    @ObfuscatedName("i.e(I)Z")
    public boolean method608() {
        return (0x8 & this.field649) != 0;
    }

    @ObfuscatedName("i.v(I)Z")
    public boolean method609() {
        return (0x20000000 & this.field649) != 0;
    }
}
