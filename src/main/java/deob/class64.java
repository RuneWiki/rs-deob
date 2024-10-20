package deob;

import java.net.URL;

@ObfuscatedName("bw")
public class class64 {

    @ObfuscatedName("bw.j")
    public static int field811 = 0;

    @ObfuscatedName("bw.i")
    public static int field824 = 0;

    @ObfuscatedName("bw.n")
    public static int[] field813 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bw.l")
    public static int[] field812 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bw.c")
    public int field815;

    @ObfuscatedName("bw.r")
    public int field816;

    @ObfuscatedName("bw.b")
    public int field817;

    @ObfuscatedName("bw.m")
    public String field808;

    @ObfuscatedName("bw.t")
    public String field819;

    @ObfuscatedName("bw.h")
    public int field807;

    @ObfuscatedName("bw.p")
    public int field818;

    @ObfuscatedName("ks.f(I)Z")
    public static boolean method5117() {
        try {
            if (Statics.field1797 == null) {
                Statics.field1797 = Statics.field2910.method2721(new URL(Statics.field2071));
            } else if (Statics.field1797.method2747()) {
                byte[] var0 = Statics.field1797.method2758();
                class474 var1 = new class474(var0);
                var1.method7979();
                field811 = var1.method8032();
                Statics.field1140 = new class64[field811];
                int var2 = 0;
                while (var2 < field811) {
                    class64 var3 = Statics.field1140[var2] = new class64();
                    var3.field815 = var1.method8032();
                    var3.field816 = var1.method7979();
                    var3.field808 = var1.method7983();
                    var3.field819 = var1.method7983();
                    var3.field807 = var1.method7964();
                    var3.field817 = var1.method7967();
                    var3.field818 = var2++;
                }
                method3111(Statics.field1140, 0, Statics.field1140.length - 1, field812, field813);
                Statics.field1797 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1797 = null;
        }
        return false;
    }

    @ObfuscatedName("nk.w(III)V")
    public static void method6472(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field812[var5] != arg0) {
                var2[var4] = field812[var5];
                var3[var4] = field813[var5];
                var4++;
            }
        }
        field812 = var2;
        field813 = var3;
        method3111(Statics.field1140, 0, Statics.field1140.length - 1, field812, field813);
    }

    @ObfuscatedName("fn.v([Lbw;II[I[II)V")
    public static void method3111(class64[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class64 var8 = arg0[var7];
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
                        var11 = arg0[var6].field818;
                        var12 = var8.field818;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field817;
                        var12 = var8.field817;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1685() ? 1 : 0;
                        var12 = var8.method1685() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field815;
                        var12 = var8.field815;
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
                        var15 = arg0[var5].field818;
                        var16 = var8.field818;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field817;
                        var16 = var8.field817;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1685() ? 1 : 0;
                        var16 = var8.method1685() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field815;
                        var16 = var8.field815;
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
                class64 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method3111(arg0, arg1, var6, arg3, arg4);
        method3111(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("cu.s(IZIZI)V")
    public static void method2176(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1140 != null) {
            method2996(0, Statics.field1140.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("eu.z(IIIZIZB)V")
    public static void method2996(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class64 var8 = Statics.field1140[var6];
        Statics.field1140[var6] = Statics.field1140[arg1];
        Statics.field1140[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class64 var10 = Statics.field1140[var9];
            int var11 = method2613(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method2613(var10, var8, arg4, arg5);
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
                class64 var14 = Statics.field1140[var9];
                Statics.field1140[var9] = Statics.field1140[var7];
                Statics.field1140[var7++] = var14;
            }
        }
        Statics.field1140[arg1] = Statics.field1140[var7];
        Statics.field1140[var7] = var8;
        method2996(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2996(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cn.j(Lbw;Lbw;IZI)I")
    public static int method2613(class64 arg0, class64 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field817;
            int var5 = arg1.field817;
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
            return arg0.field807 - arg1.field807;
        } else if (arg2 == 3) {
            if (arg0.field819.equals("-")) {
                if (arg1.field819.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field819.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field819.compareTo(arg1.field819);
            }
        } else if (arg2 == 4) {
            return arg0.method1699() ? (arg1.method1699() ? 0 : 1) : (arg1.method1699() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1733() ? (arg1.method1733() ? 0 : 1) : (arg1.method1733() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1687() ? (arg1.method1687() ? 0 : 1) : (arg1.method1687() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1685() ? (arg1.method1685() ? 0 : 1) : (arg1.method1685() ? -1 : 0);
        } else {
            return arg0.field815 - arg1.field815;
        }
    }

    @ObfuscatedName("dy.i(I)Lbw;")
    public static class64 method2740() {
        field824 = 0;
        return method2588();
    }

    @ObfuscatedName("cg.n(I)Lbw;")
    public static class64 method2588() {
        return field824 < field811 ? Statics.field1140[++field824 - 1] : null;
    }

    @ObfuscatedName("bw.l(I)Z")
    public boolean method1685() {
        return (0x1 & this.field816) != 0;
    }

    @ObfuscatedName("bw.k(I)Z")
    public boolean method1733() {
        return (0x2 & this.field816) != 0;
    }

    @ObfuscatedName("bw.c(I)Z")
    public boolean method1687() {
        return (0x4 & this.field816) != 0;
    }

    @ObfuscatedName("bw.r(B)Z")
    public boolean method1699() {
        return (0x8 & this.field816) != 0;
    }

    @ObfuscatedName("bw.b(I)Z")
    public boolean method1703() {
        return (0x20000000 & this.field816) != 0;
    }

    @ObfuscatedName("bw.m(I)Z")
    public boolean method1689() {
        return (0x2000000 & this.field816) != 0;
    }

    @ObfuscatedName("bw.t(B)Z")
    public boolean method1684() {
        return (0x40000000 & this.field816) != 0;
    }

    @ObfuscatedName("bw.h(I)Z")
    public boolean method1691() {
        return (0x100 & this.field816) != 0;
    }

    @ObfuscatedName("bw.p(B)Z")
    public boolean method1692() {
        return (0x8000000 & this.field816) != 0;
    }
}
