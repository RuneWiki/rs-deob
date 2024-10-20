package deob;

import java.net.URL;

@ObfuscatedName("bo")
public class class72 {

    @ObfuscatedName("bo.p")
    public static int field1001 = 0;

    @ObfuscatedName("bo.q")
    public static int field1008 = 0;

    @ObfuscatedName("bo.m")
    public static int[] field1003 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("bo.y")
    public static int[] field996 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("bo.c")
    public int field1002;

    @ObfuscatedName("bo.b")
    public int field1006;

    @ObfuscatedName("bo.o")
    public int field1007;

    @ObfuscatedName("bo.a")
    public String field1004;

    @ObfuscatedName("bo.e")
    public String field1009;

    @ObfuscatedName("bo.w")
    public int field1010;

    @ObfuscatedName("bo.t")
    public int field1011;

    @ObfuscatedName("kd.z(I)Z")
    public static boolean method5273() {
        try {
            if (Statics.field415 == null) {
                Statics.field415 = Statics.field688.method2968(new URL(Statics.field151));
            } else if (Statics.field415.method2985()) {
                byte[] var0 = Statics.field415.method2981();
                class300 var1 = new class300(var0);
                var1.method5085();
                field1001 = var1.method4992();
                Statics.field1000 = new class72[field1001];
                int var2 = 0;
                while (var2 < field1001) {
                    class72 var3 = Statics.field1000[var2] = new class72();
                    var3.field1002 = var1.method4992();
                    var3.field1006 = var1.method5085();
                    var3.field1004 = var1.method4999();
                    var3.field1009 = var1.method4999();
                    var3.field1010 = var1.method4990();
                    var3.field1007 = var1.method4993();
                    var3.field1011 = var2++;
                }
                method177(Statics.field1000, 0, Statics.field1000.length - 1, field996, field1003);
                Statics.field415 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field415 = null;
        }
        return false;
    }

    @ObfuscatedName("gs.n(III)V")
    public static void method3315(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field996[var5] != arg0) {
                var2[var4] = field996[var5];
                var3[var4] = field1003[var5];
                var4++;
            }
        }
        field996 = var2;
        field1003 = var3;
        method177(Statics.field1000, 0, Statics.field1000.length - 1, field996, field1003);
    }

    @ObfuscatedName("w.v([Lbo;II[I[IB)V")
    public static void method177(class72[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field1011;
                        var12 = var8.field1011;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1007;
                        var12 = var8.field1007;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1592() ? 1 : 0;
                        var12 = var8.method1592() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1002;
                        var12 = var8.field1002;
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
                        var15 = arg0[var5].field1011;
                        var16 = var8.field1011;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1007;
                        var16 = var8.field1007;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1592() ? 1 : 0;
                        var16 = var8.method1592() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1002;
                        var16 = var8.field1002;
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
        method177(arg0, arg1, var6, arg3, arg4);
        method177(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("au.u(IZIZB)V")
    public static void method736(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1000 != null) {
            method265(0, Statics.field1000.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("f.r(IIIZIZI)V")
    public static void method265(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class72 var8 = Statics.field1000[var6];
        Statics.field1000[var6] = Statics.field1000[arg1];
        Statics.field1000[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method1018(Statics.field1000[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class72 var10 = Statics.field1000[var9];
                Statics.field1000[var9] = Statics.field1000[var7];
                Statics.field1000[var7++] = var10;
            }
        }
        Statics.field1000[arg1] = Statics.field1000[var7];
        Statics.field1000[var7] = var8;
        method265(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method265(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("bs.p(Lbo;Lbo;IZIZB)I")
    public static int method1018(class72 arg0, class72 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = Statics.method3079(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = Statics.method3079(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("gx.y(I)Lbo;")
    public static class72 method3549() {
        return field1008 < field1001 ? Statics.field1000[++field1008 - 1] : null;
    }

    @ObfuscatedName("bo.i(I)Z")
    public boolean method1592() {
        return (0x1 & this.field1006) != 0;
    }

    @ObfuscatedName("bo.c(I)Z")
    public boolean method1621() {
        return (0x2 & this.field1006) != 0;
    }

    @ObfuscatedName("bo.b(I)Z")
    public boolean method1627() {
        return (0x4 & this.field1006) != 0;
    }

    @ObfuscatedName("bo.o(I)Z")
    public boolean method1593() {
        return (0x8 & this.field1006) != 0;
    }

    @ObfuscatedName("bo.a(I)Z")
    public boolean method1594() {
        return (0x20000000 & this.field1006) != 0;
    }

    @ObfuscatedName("bo.e(B)Z")
    public boolean method1614() {
        return (0x2000000 & this.field1006) != 0;
    }
}
