package deob;

import java.net.URL;

@ObfuscatedName("bc")
public class class61 {

    @ObfuscatedName("bc.k")
    public static int field778 = 0;

    @ObfuscatedName("bc.t")
    public static int field779 = 0;

    @ObfuscatedName("bc.a")
    public static int[] field780 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bc.e")
    public static int[] field776 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bc.y")
    public int field790;

    @ObfuscatedName("bc.w")
    public int field781;

    @ObfuscatedName("bc.g")
    public int field783;

    @ObfuscatedName("bc.v")
    public String field785;

    @ObfuscatedName("bc.s")
    public String field786;

    @ObfuscatedName("bc.c")
    public int field787;

    @ObfuscatedName("bc.b")
    public int field788;

    @ObfuscatedName("ft.l(I)Z")
    public static boolean method3170() {
        try {
            if (Statics.field7 == null) {
                Statics.field7 = Statics.field2127.method2275(new URL(Statics.field1274));
            } else if (Statics.field7.method2280()) {
                byte[] var0 = Statics.field7.method2281();
                class401 var1 = new class401(var0);
                var1.method6277();
                field778 = var1.method6284();
                Statics.field4253 = new class61[field778];
                int var2 = 0;
                while (var2 < field778) {
                    class61 var3 = Statics.field4253[var2] = new class61();
                    var3.field790 = var1.method6284();
                    var3.field781 = var1.method6277();
                    var3.field785 = var1.method6474();
                    var3.field786 = var1.method6474();
                    var3.field787 = var1.method6272();
                    var3.field783 = var1.method6308();
                    var3.field788 = var2++;
                }
                method4667(Statics.field4253, 0, Statics.field4253.length - 1, field776, field780);
                Statics.field7 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field7 = null;
        }
        return false;
    }

    @ObfuscatedName("z.q(III)V")
    public static void method293(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field776[var5] != arg0) {
                var2[var4] = field776[var5];
                var3[var4] = field780[var5];
                var4++;
            }
        }
        field776 = var2;
        field780 = var3;
        method4667(Statics.field4253, 0, Statics.field4253.length - 1, field776, field780);
    }

    @ObfuscatedName("ju.f([Lbc;II[I[II)V")
    public static void method4667(class61[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class61 var8 = arg0[var7];
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
                        var11 = arg0[var6].field788;
                        var12 = var8.field788;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field783;
                        var12 = var8.field783;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1535() ? 1 : 0;
                        var12 = var8.method1535() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field790;
                        var12 = var8.field790;
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
                        var15 = arg0[var5].field788;
                        var16 = var8.field788;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field783;
                        var16 = var8.field783;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1535() ? 1 : 0;
                        var16 = var8.method1535() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field790;
                        var16 = var8.field790;
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
                class61 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method4667(arg0, arg1, var6, arg3, arg4);
        method4667(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("er.j(IZIZI)V")
    public static void method2539(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field4253 != null) {
            method3496(0, Statics.field4253.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("gu.m(IIIZIZB)V")
    public static void method3496(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class61 var8 = Statics.field4253[var6];
        Statics.field4253[var6] = Statics.field4253[arg1];
        Statics.field4253[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method963(Statics.field4253[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class61 var10 = Statics.field4253[var9];
                Statics.field4253[var9] = Statics.field4253[var7];
                Statics.field4253[var7++] = var10;
            }
        }
        Statics.field4253[arg1] = Statics.field4253[var7];
        Statics.field4253[var7] = var8;
        method3496(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method3496(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ai.k(Lbc;Lbc;IZIZI)I")
    public static int method963(class61 arg0, class61 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method2802(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method2802(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("fz.t(Lbc;Lbc;IZI)I")
    public static int method2802(class61 arg0, class61 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field783;
            int var5 = arg1.field783;
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
            return arg0.field787 - arg1.field787;
        } else if (arg2 == 3) {
            if (arg0.field786.equals("-")) {
                if (arg1.field786.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field786.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field786.compareTo(arg1.field786);
            }
        } else if (arg2 == 4) {
            return arg0.method1507() ? (arg1.method1507() ? 0 : 1) : (arg1.method1507() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1505() ? (arg1.method1505() ? 0 : 1) : (arg1.method1505() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1506() ? (arg1.method1506() ? 0 : 1) : (arg1.method1506() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1535() ? (arg1.method1535() ? 0 : 1) : (arg1.method1535() ? -1 : 0);
        } else {
            return arg0.field790 - arg1.field790;
        }
    }

    @ObfuscatedName("d.a(I)Lbc;")
    public static class61 method375() {
        field779 = 0;
        return method2155();
    }

    @ObfuscatedName("cu.e(I)Lbc;")
    public static class61 method2155() {
        return field779 < field778 ? Statics.field4253[++field779 - 1] : null;
    }

    @ObfuscatedName("bc.i(I)Z")
    public boolean method1535() {
        return (0x1 & this.field781) != 0;
    }

    @ObfuscatedName("bc.y(B)Z")
    public boolean method1505() {
        return (0x2 & this.field781) != 0;
    }

    @ObfuscatedName("bc.w(B)Z")
    public boolean method1506() {
        return (0x4 & this.field781) != 0;
    }

    @ObfuscatedName("bc.g(I)Z")
    public boolean method1507() {
        return (0x8 & this.field781) != 0;
    }

    @ObfuscatedName("bc.v(B)Z")
    public boolean method1508() {
        return (0x20000000 & this.field781) != 0;
    }

    @ObfuscatedName("bc.s(I)Z")
    public boolean method1509() {
        return (0x2000000 & this.field781) != 0;
    }

    @ObfuscatedName("bc.c(I)Z")
    public boolean method1552() {
        return (0x40000000 & this.field781) != 0;
    }
}
