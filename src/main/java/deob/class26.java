package deob;

import java.net.URL;

@ObfuscatedName("h")
public class class26 {

    @ObfuscatedName("h.l")
    public static int field642 = 0;

    @ObfuscatedName("h.m")
    public static int field643 = 0;

    @ObfuscatedName("h.p")
    public static int[] field644 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("h.u")
    public static int[] field645 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("h.v")
    public int field646;

    @ObfuscatedName("h.o")
    public int field650;

    @ObfuscatedName("h.n")
    public int field641;

    @ObfuscatedName("h.k")
    public String field639;

    @ObfuscatedName("h.f")
    public String field658;

    @ObfuscatedName("h.x")
    public int field640;

    @ObfuscatedName("h.j")
    public int field651;

    @ObfuscatedName("j.g(B)Z")
    public static boolean method183() {
        try {
            if (Statics.field2693 == null) {
                Statics.field2693 = new class19(Statics.field107, new URL(Statics.field1999));
            } else {
                byte[] var0 = Statics.field2693.method194();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field642 = var1.method2376();
                    Statics.field647 = new class26[field642];
                    int var2 = 0;
                    while (var2 < field642) {
                        class26 var3 = Statics.field647[var2] = new class26();
                        var3.field646 = var1.method2376();
                        var3.field650 = var1.method2367();
                        var3.field639 = var1.method2370();
                        var3.field658 = var1.method2370();
                        var3.field640 = var1.method2362();
                        var3.field641 = var1.method2365();
                        var3.field651 = var2++;
                    }
                    method2874(Statics.field647, 0, Statics.field647.length - 1, field645, field644);
                    Statics.field2693 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2693 = null;
        }
        return false;
    }

    @ObfuscatedName("l.b(III)V")
    public static void method95(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field645[var5] != arg0) {
                var2[var4] = field645[var5];
                var3[var4] = field644[var5];
                var4++;
            }
        }
        field645 = var2;
        field644 = var3;
        method2874(Statics.field647, 0, Statics.field647.length - 1, field645, field644);
    }

    @ObfuscatedName("ek.w([Lh;II[I[II)V")
    public static void method2874(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field651;
                        var12 = var8.field651;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field641;
                        var12 = var8.field641;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method631() ? 1 : 0;
                        var12 = var8.method631() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field646;
                        var12 = var8.field646;
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
                        var15 = arg0[var5].field651;
                        var16 = var8.field651;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field641;
                        var16 = var8.field641;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method631() ? 1 : 0;
                        var16 = var8.method631() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field646;
                        var16 = var8.field646;
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
        method2874(arg0, arg1, var6, arg3, arg4);
        method2874(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("l.d(IIIZIZI)V")
    public static void method96(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field647[var6];
        Statics.field647[var6] = Statics.field647[arg1];
        Statics.field647[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method940(Statics.field647[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field647[var9];
                Statics.field647[var9] = Statics.field647[var7];
                Statics.field647[var7++] = var10;
            }
        }
        Statics.field647[arg1] = Statics.field647[var7];
        Statics.field647[var7] = var8;
        method96(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method96(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("av.z(Lh;Lh;IZIZI)I")
    public static int method940(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method3182(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method3182(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("fh.l(Lh;Lh;IZI)I")
    public static int method3182(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field641;
            int var5 = arg1.field641;
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
            return arg0.field640 - arg1.field640;
        } else if (arg2 == 3) {
            if (arg0.field658.equals("-")) {
                if (arg1.field658.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field658.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field658.compareTo(arg1.field658);
            }
        } else if (arg2 == 4) {
            return arg0.method609() ? (arg1.method609() ? 0 : 1) : (arg1.method609() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method611() ? (arg1.method611() ? 0 : 1) : (arg1.method611() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method612() ? (arg1.method612() ? 0 : 1) : (arg1.method612() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method631() ? (arg1.method631() ? 0 : 1) : (arg1.method631() ? -1 : 0);
        } else {
            return arg0.field646 - arg1.field646;
        }
    }

    @ObfuscatedName("h.m(I)Z")
    public boolean method631() {
        return (0x1 & this.field650) != 0;
    }

    @ObfuscatedName("h.p(B)Z")
    public boolean method611() {
        return (0x2 & this.field650) != 0;
    }

    @ObfuscatedName("h.u(I)Z")
    public boolean method612() {
        return (0x4 & this.field650) != 0;
    }

    @ObfuscatedName("h.c(I)Z")
    public boolean method609() {
        return (0x8 & this.field650) != 0;
    }

    @ObfuscatedName("h.v(B)Z")
    public boolean method614() {
        return (0x20000000 & this.field650) != 0;
    }
}
