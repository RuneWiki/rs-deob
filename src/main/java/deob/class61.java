package deob;

import java.net.URL;

@ObfuscatedName("bh")
public class class61 {

    @ObfuscatedName("bh.g")
    public static int field774 = 0;

    @ObfuscatedName("bh.z")
    public static int field775 = 0;

    @ObfuscatedName("bh.a")
    public static int[] field776 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bh.u")
    public static int[] field786 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bh.l")
    public int field778;

    @ObfuscatedName("bh.y")
    public int field773;

    @ObfuscatedName("bh.v")
    public int field780;

    @ObfuscatedName("bh.f")
    public String field772;

    @ObfuscatedName("bh.s")
    public String field782;

    @ObfuscatedName("bh.h")
    public int field783;

    @ObfuscatedName("bh.d")
    public int field784;

    @ObfuscatedName("ff.n(I)Z")
    public static boolean method2882() {
        try {
            if (Statics.field4104 == null) {
                Statics.field4104 = Statics.field3193.method2234(new URL(Statics.field3916));
            } else if (Statics.field4104.method2244()) {
                byte[] var0 = Statics.field4104.method2245();
                class400 var1 = new class400(var0);
                var1.method6222();
                field774 = var1.method6219();
                Statics.field4253 = new class61[field774];
                int var2 = 0;
                while (var2 < field774) {
                    class61 var3 = Statics.field4253[var2] = new class61();
                    var3.field778 = var1.method6219();
                    var3.field773 = var1.method6222();
                    var3.field772 = var1.method6226();
                    var3.field782 = var1.method6226();
                    var3.field783 = var1.method6217();
                    var3.field780 = var1.method6220();
                    var3.field784 = var2++;
                }
                method4468(Statics.field4253, 0, Statics.field4253.length - 1, field786, field776);
                Statics.field4104 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field4104 = null;
        }
        return false;
    }

    @ObfuscatedName("fz.c(III)V")
    public static void method2835(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field786[var5] != arg0) {
                var2[var4] = field786[var5];
                var3[var4] = field776[var5];
                var4++;
            }
        }
        field786 = var2;
        field776 = var3;
        method4468(Statics.field4253, 0, Statics.field4253.length - 1, field786, field776);
    }

    @ObfuscatedName("iy.m([Lbh;II[I[IB)V")
    public static void method4468(class61[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field784;
                        var12 = var8.field784;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field780;
                        var12 = var8.field780;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1515() ? 1 : 0;
                        var12 = var8.method1515() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field778;
                        var12 = var8.field778;
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
                        var15 = arg0[var5].field784;
                        var16 = var8.field784;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field780;
                        var16 = var8.field780;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1515() ? 1 : 0;
                        var16 = var8.method1515() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field778;
                        var16 = var8.field778;
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
        method4468(arg0, arg1, var6, arg3, arg4);
        method4468(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("gm.k(IZIZI)V")
    public static void method3531(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field4253 != null) {
            method4220(0, Statics.field4253.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ib.o(IIIZIZB)V")
    public static void method4220(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class61 var8 = Statics.field4253[var6];
        Statics.field4253[var6] = Statics.field4253[arg1];
        Statics.field4253[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2577(Statics.field4253[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class61 var10 = Statics.field4253[var9];
                Statics.field4253[var9] = Statics.field4253[var7];
                Statics.field4253[var7++] = var10;
            }
        }
        Statics.field4253[arg1] = Statics.field4253[var7];
        Statics.field4253[var7] = var8;
        method4220(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method4220(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("en.g(Lbh;Lbh;IZIZI)I")
    public static int method2577(class61 arg0, class61 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method1860(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method1860(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("bv.z(Lbh;Lbh;IZI)I")
    public static int method1860(class61 arg0, class61 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field780;
            int var5 = arg1.field780;
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
            return arg0.field783 - arg1.field783;
        } else if (arg2 == 3) {
            if (arg0.field782.equals("-")) {
                if (arg1.field782.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field782.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field782.compareTo(arg1.field782);
            }
        } else if (arg2 == 4) {
            return arg0.method1521() ? (arg1.method1521() ? 0 : 1) : (arg1.method1521() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1516() ? (arg1.method1516() ? 0 : 1) : (arg1.method1516() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1517() ? (arg1.method1517() ? 0 : 1) : (arg1.method1517() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1515() ? (arg1.method1515() ? 0 : 1) : (arg1.method1515() ? -1 : 0);
        } else {
            return arg0.field778 - arg1.field778;
        }
    }

    @ObfuscatedName("kv.a(I)Lbh;")
    public static class61 method4865() {
        field775 = 0;
        return method3075();
    }

    @ObfuscatedName("fa.u(I)Lbh;")
    public static class61 method3075() {
        return field775 < field774 ? Statics.field4253[++field775 - 1] : null;
    }

    @ObfuscatedName("bh.e(I)Z")
    public boolean method1515() {
        return (0x1 & this.field773) != 0;
    }

    @ObfuscatedName("bh.l(I)Z")
    public boolean method1516() {
        return (0x2 & this.field773) != 0;
    }

    @ObfuscatedName("bh.y(B)Z")
    public boolean method1517() {
        return (0x4 & this.field773) != 0;
    }

    @ObfuscatedName("bh.v(I)Z")
    public boolean method1521() {
        return (0x8 & this.field773) != 0;
    }

    @ObfuscatedName("bh.f(B)Z")
    public boolean method1530() {
        return (0x20000000 & this.field773) != 0;
    }

    @ObfuscatedName("bh.s(I)Z")
    public boolean method1519() {
        return (0x2000000 & this.field773) != 0;
    }

    @ObfuscatedName("bh.h(I)Z")
    public boolean method1518() {
        return (0x40000000 & this.field773) != 0;
    }
}
