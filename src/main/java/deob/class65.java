package deob;

import java.net.URL;

@ObfuscatedName("bz")
public class class65 {

    @ObfuscatedName("bz.q")
    public static int field813 = 0;

    @ObfuscatedName("bz.f")
    public static int field811 = 0;

    @ObfuscatedName("bz.r")
    public static int[] field817 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bz.u")
    public static int[] field816 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bz.j")
    public int field812;

    @ObfuscatedName("bz.g")
    public int field818;

    @ObfuscatedName("bz.i")
    public int field819;

    @ObfuscatedName("bz.o")
    public String field820;

    @ObfuscatedName("bz.n")
    public String field815;

    @ObfuscatedName("bz.k")
    public int field821;

    @ObfuscatedName("bz.a")
    public int field823;

    @ObfuscatedName("am.h(B)Z")
    public static boolean method422() {
        try {
            if (Statics.field1 == null) {
                Statics.field1 = Statics.field1850.method2608(new URL(Statics.field42));
            } else if (Statics.field1.method2647()) {
                byte[] var0 = Statics.field1.method2644();
                class467 var1 = new class467(var0);
                var1.method7946();
                field813 = var1.method7794();
                Statics.field814 = new class65[field813];
                int var2 = 0;
                while (var2 < field813) {
                    class65 var3 = Statics.field814[var2] = new class65();
                    var3.field812 = var1.method7794();
                    var3.field818 = var1.method7946();
                    var3.field820 = var1.method7801();
                    var3.field815 = var1.method7801();
                    var3.field821 = var1.method7792();
                    var3.field819 = var1.method7795();
                    var3.field823 = var2++;
                }
                method7201(Statics.field814, 0, Statics.field814.length - 1, field816, field817);
                Statics.field1 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1 = null;
        }
        return false;
    }

    @ObfuscatedName("b.e(IIB)V")
    public static void method68(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field816[var5] != arg0) {
                var2[var4] = field816[var5];
                var3[var4] = field817[var5];
                var4++;
            }
        }
        field816 = var2;
        field817 = var3;
        method7201(Statics.field814, 0, Statics.field814.length - 1, field816, field817);
    }

    @ObfuscatedName("ph.v([Lbz;II[I[IB)V")
    public static void method7201(class65[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field823;
                        var12 = var8.field823;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field819;
                        var12 = var8.field819;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1637() ? 1 : 0;
                        var12 = var8.method1637() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field812;
                        var12 = var8.field812;
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
                        var15 = arg0[var5].field823;
                        var16 = var8.field823;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field819;
                        var16 = var8.field819;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1637() ? 1 : 0;
                        var16 = var8.method1637() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field812;
                        var16 = var8.field812;
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
        method7201(arg0, arg1, var6, arg3, arg4);
        method7201(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("pe.x(IZIZI)V")
    public static void method7181(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field814 != null) {
            method4804(0, Statics.field814.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ig.m(IIIZIZI)V")
    public static void method4804(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class65 var8 = Statics.field814[var6];
        Statics.field814[var6] = Statics.field814[arg1];
        Statics.field814[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2922(Statics.field814[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class65 var10 = Statics.field814[var9];
                Statics.field814[var9] = Statics.field814[var7];
                Statics.field814[var7++] = var10;
            }
        }
        Statics.field814[arg1] = Statics.field814[var7];
        Statics.field814[var7] = var8;
        method4804(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method4804(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ec.q(Lbz;Lbz;IZIZI)I")
    public static int method2922(class65 arg0, class65 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method2641(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method2641(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("dw.f(Lbz;Lbz;IZI)I")
    public static int method2641(class65 arg0, class65 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field819;
            int var5 = arg1.field819;
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
            return arg0.field821 - arg1.field821;
        } else if (arg2 == 3) {
            if (arg0.field815.equals("-")) {
                if (arg1.field815.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field815.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field815.compareTo(arg1.field815);
            }
        } else if (arg2 == 4) {
            return arg0.method1640() ? (arg1.method1640() ? 0 : 1) : (arg1.method1640() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1677() ? (arg1.method1677() ? 0 : 1) : (arg1.method1677() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1639() ? (arg1.method1639() ? 0 : 1) : (arg1.method1639() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1637() ? (arg1.method1637() ? 0 : 1) : (arg1.method1637() ? -1 : 0);
        } else {
            return arg0.field812 - arg1.field812;
        }
    }

    @ObfuscatedName("ko.r(I)Lbz;")
    public static class65 method5291() {
        field811 = 0;
        return method2715();
    }

    @ObfuscatedName("dy.u(I)Lbz;")
    public static class65 method2715() {
        return field811 < field813 ? Statics.field814[++field811 - 1] : null;
    }

    @ObfuscatedName("bz.b(I)Z")
    public boolean method1637() {
        return (0x1 & this.field818) != 0;
    }

    @ObfuscatedName("bz.j(I)Z")
    public boolean method1677() {
        return (0x2 & this.field818) != 0;
    }

    @ObfuscatedName("bz.g(B)Z")
    public boolean method1639() {
        return (0x4 & this.field818) != 0;
    }

    @ObfuscatedName("bz.i(I)Z")
    public boolean method1640() {
        return (0x8 & this.field818) != 0;
    }

    @ObfuscatedName("bz.o(I)Z")
    public boolean method1682() {
        return (0x20000000 & this.field818) != 0;
    }

    @ObfuscatedName("bz.n(I)Z")
    public boolean method1642() {
        return (0x2000000 & this.field818) != 0;
    }

    @ObfuscatedName("bz.k(B)Z")
    public boolean method1698() {
        return (0x40000000 & this.field818) != 0;
    }

    @ObfuscatedName("bz.a(B)Z")
    public boolean method1696() {
        return (0x100 & this.field818) != 0;
    }

    @ObfuscatedName("bz.s(I)Z")
    public boolean method1645() {
        return (0x8000000 & this.field818) != 0;
    }
}
