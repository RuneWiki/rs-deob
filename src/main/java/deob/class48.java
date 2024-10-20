package deob;

import java.net.URL;

@ObfuscatedName("ag")
public class class48 {

    @ObfuscatedName("ag.n")
    public static int field692 = 0;

    @ObfuscatedName("ag.w")
    public static int field694 = 0;

    @ObfuscatedName("ag.f")
    public static int[] field695 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ag.o")
    public static int[] field696 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ag.r")
    public int field697;

    @ObfuscatedName("ag.p")
    public int field700;

    @ObfuscatedName("ag.h")
    public int field699;

    @ObfuscatedName("ag.k")
    public String field701;

    @ObfuscatedName("ag.a")
    public String field690;

    @ObfuscatedName("ag.q")
    public int field702;

    @ObfuscatedName("ag.u")
    public int field703;

    @ObfuscatedName("jq.s(B)Z")
    public static boolean method4398() {
        try {
            if (Statics.field1135 == null) {
                Statics.field1135 = Statics.field1992.method2007(new URL(Statics.field3776));
            } else if (Statics.field1135.method2023()) {
                byte[] var0 = Statics.field1135.method2022();
                class385 var1 = new class385(var0);
                var1.method6182();
                field692 = var1.method6053();
                Statics.field86 = new class48[field692];
                int var2 = 0;
                while (var2 < field692) {
                    class48 var3 = Statics.field86[var2] = new class48();
                    var3.field697 = var1.method6053();
                    var3.field700 = var1.method6182();
                    var3.field701 = var1.method5967();
                    var3.field690 = var1.method5967();
                    var3.field702 = var1.method5958();
                    var3.field699 = var1.method5961();
                    var3.field703 = var2++;
                }
                method1929(Statics.field86, 0, Statics.field86.length - 1, field696, field695);
                Statics.field1135 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1135 = null;
        }
        return false;
    }

    @ObfuscatedName("kq.t(III)V")
    public static void method4678(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field696[var5] != arg0) {
                var2[var4] = field696[var5];
                var3[var4] = field695[var5];
                var4++;
            }
        }
        field696 = var2;
        field695 = var3;
        method1929(Statics.field86, 0, Statics.field86.length - 1, field696, field695);
    }

    @ObfuscatedName("ci.v([Lag;II[I[II)V")
    public static void method1929(class48[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class48 var8 = arg0[var7];
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
                        var11 = arg0[var6].field703;
                        var12 = var8.field703;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field699;
                        var12 = var8.field699;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1296() ? 1 : 0;
                        var12 = var8.method1296() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field697;
                        var12 = var8.field697;
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
                        var15 = arg0[var5].field703;
                        var16 = var8.field703;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field699;
                        var16 = var8.field699;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1296() ? 1 : 0;
                        var16 = var8.method1296() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field697;
                        var16 = var8.field697;
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
                class48 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1929(arg0, arg1, var6, arg3, arg4);
        method1929(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("lm.j(IZIZI)V")
    public static void method5197(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field86 != null) {
            method5772(0, Statics.field86.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("nt.l(IIIZIZB)V")
    public static void method5772(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class48 var8 = Statics.field86[var6];
        Statics.field86[var6] = Statics.field86[arg1];
        Statics.field86[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (Statics.method1622(Statics.field86[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class48 var10 = Statics.field86[var9];
                Statics.field86[var9] = Statics.field86[var7];
                Statics.field86[var7++] = var10;
            }
        }
        Statics.field86[arg1] = Statics.field86[var7];
        Statics.field86[var7] = var8;
        method5772(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method5772(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("gi.f(B)Lag;")
    public static class48 method3302() {
        field694 = 0;
        return method2147();
    }

    @ObfuscatedName("da.o(I)Lag;")
    public static class48 method2147() {
        return field694 < field692 ? Statics.field86[++field694 - 1] : null;
    }

    @ObfuscatedName("ag.x(I)Z")
    public boolean method1296() {
        return (0x1 & this.field700) != 0;
    }

    @ObfuscatedName("ag.r(B)Z")
    public boolean method1297() {
        return (0x2 & this.field700) != 0;
    }

    @ObfuscatedName("ag.p(B)Z")
    public boolean method1298() {
        return (0x4 & this.field700) != 0;
    }

    @ObfuscatedName("ag.h(I)Z")
    public boolean method1299() {
        return (0x8 & this.field700) != 0;
    }

    @ObfuscatedName("ag.k(I)Z")
    public boolean method1300() {
        return (0x20000000 & this.field700) != 0;
    }

    @ObfuscatedName("ag.a(I)Z")
    public boolean method1312() {
        return (0x2000000 & this.field700) != 0;
    }

    @ObfuscatedName("ag.q(B)Z")
    public boolean method1319() {
        return (0x40000000 & this.field700) != 0;
    }
}
