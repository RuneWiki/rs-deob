package deob;

import java.net.URL;

@ObfuscatedName("be")
public class class72 {

    @ObfuscatedName("be.b")
    public static int field995 = 0;

    @ObfuscatedName("be.e")
    public static int field996 = 0;

    @ObfuscatedName("be.x")
    public static int[] field997 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("be.a")
    public static int[] field998 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("be.c")
    public int field1005;

    @ObfuscatedName("be.o")
    public int field1000;

    @ObfuscatedName("be.v")
    public int field999;

    @ObfuscatedName("be.k")
    public String field1002;

    @ObfuscatedName("be.s")
    public String field1004;

    @ObfuscatedName("be.l")
    public int field991;

    @ObfuscatedName("be.t")
    public int field1003;

    @ObfuscatedName("bo.f(I)Z")
    public static boolean method1048() {
        try {
            if (Statics.field1190 == null) {
                Statics.field1190 = Statics.field3767.method3027(new URL(Statics.field1511));
            } else if (Statics.field1190.method3035()) {
                byte[] var0 = Statics.field1190.method3039();
                class300 var1 = new class300(var0);
                var1.method5192();
                field995 = var1.method5112();
                Statics.field1994 = new class72[field995];
                int var2 = 0;
                while (var2 < field995) {
                    class72 var3 = Statics.field1994[var2] = new class72();
                    var3.field1005 = var1.method5112();
                    var3.field1000 = var1.method5192();
                    var3.field1002 = var1.method5119();
                    var3.field1004 = var1.method5119();
                    var3.field991 = var1.method5110();
                    var3.field999 = var1.method5113();
                    var3.field1003 = var2++;
                }
                method3338(Statics.field1994, 0, Statics.field1994.length - 1, field998, field997);
                Statics.field1190 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1190 = null;
        }
        return false;
    }

    @ObfuscatedName("cw.i(III)V")
    public static void method2271(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field998[var5] != arg0) {
                var2[var4] = field998[var5];
                var3[var4] = field997[var5];
                var4++;
            }
        }
        field998 = var2;
        field997 = var3;
        method3338(Statics.field1994, 0, Statics.field1994.length - 1, field998, field997);
    }

    @ObfuscatedName("gb.y([Lbe;II[I[II)V")
    public static void method3338(class72[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class72 var8 = arg0[var7];
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
                        var11 = arg0[var6].field1003;
                        var12 = var8.field1003;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field999;
                        var12 = var8.field999;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1596() ? 1 : 0;
                        var12 = var8.method1596() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1005;
                        var12 = var8.field1005;
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
                        var15 = arg0[var5].field1003;
                        var16 = var8.field1003;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field999;
                        var16 = var8.field999;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1596() ? 1 : 0;
                        var16 = var8.method1596() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1005;
                        var16 = var8.field1005;
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
                class72 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method3338(arg0, arg1, var6, arg3, arg4);
        method3338(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("bn.w(IZIZB)V")
    public static void method1138(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1994 != null) {
            method4621(0, Statics.field1994.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("jp.p(IIIZIZI)V")
    public static void method4621(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class72 var8 = Statics.field1994[var6];
        Statics.field1994[var6] = Statics.field1994[arg1];
        Statics.field1994[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class72 var10 = Statics.field1994[var9];
            int var11 = method1135(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method1135(var10, var8, arg4, arg5);
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
                class72 var14 = Statics.field1994[var9];
                Statics.field1994[var9] = Statics.field1994[var7];
                Statics.field1994[var7++] = var14;
            }
        }
        Statics.field1994[arg1] = Statics.field1994[var7];
        Statics.field1994[var7] = var8;
        method4621(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method4621(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bn.b(Lbe;Lbe;IZI)I")
    public static int method1135(class72 arg0, class72 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field999;
            int var5 = arg1.field999;
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
            return arg0.field991 - arg1.field991;
        } else if (arg2 == 3) {
            if (arg0.field1004.equals("-")) {
                if (arg1.field1004.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1004.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1004.compareTo(arg1.field1004);
            }
        } else if (arg2 == 4) {
            return arg0.method1612() ? (arg1.method1612() ? 0 : 1) : (arg1.method1612() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1614() ? (arg1.method1614() ? 0 : 1) : (arg1.method1614() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1595() ? (arg1.method1595() ? 0 : 1) : (arg1.method1595() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1596() ? (arg1.method1596() ? 0 : 1) : (arg1.method1596() ? -1 : 0);
        } else {
            return arg0.field1005 - arg1.field1005;
        }
    }

    @ObfuscatedName("ct.e(B)Lbe;")
    public static class72 method2081() {
        field996 = 0;
        return method4871();
    }

    @ObfuscatedName("jg.x(I)Lbe;")
    public static class72 method4871() {
        return field996 < field995 ? Statics.field1994[++field996 - 1] : null;
    }

    @ObfuscatedName("be.a(S)Z")
    public boolean method1596() {
        return (0x1 & this.field1000) != 0;
    }

    @ObfuscatedName("be.d(I)Z")
    public boolean method1614() {
        return (0x2 & this.field1000) != 0;
    }

    @ObfuscatedName("be.c(I)Z")
    public boolean method1595() {
        return (0x4 & this.field1000) != 0;
    }

    @ObfuscatedName("be.o(I)Z")
    public boolean method1612() {
        return (0x8 & this.field1000) != 0;
    }

    @ObfuscatedName("be.l(I)Z")
    public boolean method1597() {
        return (0x20000000 & this.field1000) != 0;
    }

    @ObfuscatedName("be.t(I)Z")
    public boolean method1598() {
        return (0x2000000 & this.field1000) != 0;
    }

    @ObfuscatedName("be.j(I)Z")
    public boolean method1607() {
        return (0x40000000 & this.field1000) != 0;
    }
}
