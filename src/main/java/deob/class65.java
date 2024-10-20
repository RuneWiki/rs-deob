package deob;

import java.net.URL;

@ObfuscatedName("bt")
public class class65 {

    @ObfuscatedName("bt.j")
    public static int field798 = 0;

    @ObfuscatedName("bt.y")
    public static int field799 = 0;

    @ObfuscatedName("bt.d")
    public static int[] field800 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bt.n")
    public static int[] field801 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bt.l")
    public int field806;

    @ObfuscatedName("bt.s")
    public int field803;

    @ObfuscatedName("bt.p")
    public int field809;

    @ObfuscatedName("bt.b")
    public String field805;

    @ObfuscatedName("bt.o")
    public String field804;

    @ObfuscatedName("bt.u")
    public int field796;

    @ObfuscatedName("bt.z")
    public int field808;

    @ObfuscatedName("lp.a(I)Z")
    public static boolean method5927() {
        try {
            if (Statics.field1275 == null) {
                Statics.field1275 = Statics.field318.method2565(new URL(Statics.field1535));
            } else if (Statics.field1275.method2596()) {
                byte[] var0 = Statics.field1275.method2609();
                class464 var1 = new class464(var0);
                var1.method7720();
                field798 = var1.method7716();
                Statics.field4595 = new class65[field798];
                int var2 = 0;
                while (var2 < field798) {
                    class65 var3 = Statics.field4595[var2] = new class65();
                    var3.field806 = var1.method7716();
                    var3.field803 = var1.method7720();
                    var3.field805 = var1.method7725();
                    var3.field804 = var1.method7725();
                    var3.field796 = var1.method7735();
                    var3.field809 = var1.method7798();
                    var3.field808 = var2++;
                }
                method77(Statics.field4595, 0, Statics.field4595.length - 1, field801, field800);
                Statics.field1275 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1275 = null;
        }
        return false;
    }

    @ObfuscatedName("jd.f(III)V")
    public static void method4888(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field801[var5] != arg0) {
                var2[var4] = field801[var5];
                var3[var4] = field800[var5];
                var4++;
            }
        }
        field801 = var2;
        field800 = var3;
        method77(Statics.field4595, 0, Statics.field4595.length - 1, field801, field800);
    }

    @ObfuscatedName("l.c([Lbt;II[I[II)V")
    public static void method77(class65[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class65 var8 = arg0[var7];
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
                        var11 = arg0[var6].field808;
                        var12 = var8.field808;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field809;
                        var12 = var8.field809;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1654() ? 1 : 0;
                        var12 = var8.method1654() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field806;
                        var12 = var8.field806;
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
                        var15 = arg0[var5].field808;
                        var16 = var8.field808;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field809;
                        var16 = var8.field809;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1654() ? 1 : 0;
                        var16 = var8.method1654() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field806;
                        var16 = var8.field806;
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
                class65 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method77(arg0, arg1, var6, arg3, arg4);
        method77(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("fj.x(IZIZB)V")
    public static void method3218(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field4595 != null) {
            method6004(0, Statics.field4595.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("mo.h(IIIZIZB)V")
    public static void method6004(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class65 var8 = Statics.field4595[var6];
        Statics.field4595[var6] = Statics.field4595[arg1];
        Statics.field4595[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method3290(Statics.field4595[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class65 var10 = Statics.field4595[var9];
                Statics.field4595[var9] = Statics.field4595[var7];
                Statics.field4595[var7++] = var10;
            }
        }
        Statics.field4595[arg1] = Statics.field4595[var7];
        Statics.field4595[var7] = var8;
        method6004(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method6004(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("gy.j(Lbt;Lbt;IZIZI)I")
    public static int method3290(class65 arg0, class65 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method4852(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method4852(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("jj.y(Lbt;Lbt;IZI)I")
    public static int method4852(class65 arg0, class65 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field809;
            int var5 = arg1.field809;
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
            return arg0.field796 - arg1.field796;
        } else if (arg2 == 3) {
            if (arg0.field804.equals("-")) {
                if (arg1.field804.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field804.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field804.compareTo(arg1.field804);
            }
        } else if (arg2 == 4) {
            return arg0.method1644() ? (arg1.method1644() ? 0 : 1) : (arg1.method1644() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1646() ? (arg1.method1646() ? 0 : 1) : (arg1.method1646() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1647() ? (arg1.method1647() ? 0 : 1) : (arg1.method1647() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1654() ? (arg1.method1654() ? 0 : 1) : (arg1.method1654() ? -1 : 0);
        } else {
            return arg0.field806 - arg1.field806;
        }
    }

    @ObfuscatedName("ae.d(I)Lbt;")
    public static class65 method583() {
        field799 = 0;
        return Statics.method4151();
    }

    @ObfuscatedName("bt.r(I)Z")
    public boolean method1654() {
        return (0x1 & this.field803) != 0;
    }

    @ObfuscatedName("bt.l(I)Z")
    public boolean method1646() {
        return (0x2 & this.field803) != 0;
    }

    @ObfuscatedName("bt.s(B)Z")
    public boolean method1647() {
        return (0x4 & this.field803) != 0;
    }

    @ObfuscatedName("bt.p(B)Z")
    public boolean method1644() {
        return (0x8 & this.field803) != 0;
    }

    @ObfuscatedName("bt.b(I)Z")
    public boolean method1649() {
        return (0x20000000 & this.field803) != 0;
    }

    @ObfuscatedName("bt.o(I)Z")
    public boolean method1661() {
        return (0x2000000 & this.field803) != 0;
    }

    @ObfuscatedName("bt.u(B)Z")
    public boolean method1687() {
        return (0x40000000 & this.field803) != 0;
    }

    @ObfuscatedName("bt.z(B)Z")
    public boolean method1652() {
        return (0x100 & this.field803) != 0;
    }

    @ObfuscatedName("bt.t(I)Z")
    public boolean method1676() {
        return (0x8000000 & this.field803) != 0;
    }
}
