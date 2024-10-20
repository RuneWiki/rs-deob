package deob;

import java.net.URL;

@ObfuscatedName("w")
public class class26 {

    @ObfuscatedName("w.q")
    public static int field636 = 0;

    @ObfuscatedName("w.h")
    public static int field634 = 0;

    @ObfuscatedName("w.d")
    public static int[] field638 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("w.c")
    public static int[] field639 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("w.m")
    public int field640;

    @ObfuscatedName("w.e")
    public int field650;

    @ObfuscatedName("w.z")
    public int field641;

    @ObfuscatedName("w.t")
    public String field643;

    @ObfuscatedName("w.b")
    public String field644;

    @ObfuscatedName("w.l")
    public int field645;

    @ObfuscatedName("w.s")
    public int field646;

    @ObfuscatedName("dz.i(I)Z")
    public static boolean method2288() {
        try {
            if (Statics.field629 == null) {
                Statics.field629 = new class19(Statics.field2889, new URL(Statics.field1057));
            } else {
                byte[] var0 = Statics.field629.method169();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field636 = var1.method2347();
                    Statics.field212 = new class26[field636];
                    int var2 = 0;
                    while (var2 < field636) {
                        class26 var3 = Statics.field212[var2] = new class26();
                        var3.field640 = var1.method2347();
                        var3.field650 = var1.method2350();
                        var3.field643 = var1.method2356();
                        var3.field644 = var1.method2356();
                        var3.field645 = var1.method2380();
                        var3.field641 = var1.method2348();
                        var3.field646 = var2++;
                    }
                    method3272(Statics.field212, 0, Statics.field212.length - 1, field639, field638);
                    Statics.field629 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field629 = null;
        }
        return false;
    }

    @ObfuscatedName("db.v(IIB)V")
    public static void method2609(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field639[var5] != arg0) {
                var2[var4] = field639[var5];
                var3[var4] = field638[var5];
                var4++;
            }
        }
        field639 = var2;
        field638 = var3;
        method3272(Statics.field212, 0, Statics.field212.length - 1, field639, field638);
    }

    @ObfuscatedName("fv.r([Lw;II[I[II)V")
    public static void method3272(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field646;
                        var12 = var8.field646;
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
                        var11 = arg0[var6].method606() ? 1 : 0;
                        var12 = var8.method606() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field640;
                        var12 = var8.field640;
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
                        var15 = arg0[var5].field646;
                        var16 = var8.field646;
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
                        var15 = arg0[var5].method606() ? 1 : 0;
                        var16 = var8.method606() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field640;
                        var16 = var8.field640;
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
        method3272(arg0, arg1, var6, arg3, arg4);
        method3272(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("cn.n(IZIZI)V")
    public static void method2144(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field212 != null) {
            method138(0, Statics.field212.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("e.x(IIIZIZI)V")
    public static void method138(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field212[var6];
        Statics.field212[var6] = Statics.field212[arg1];
        Statics.field212[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method575(Statics.field212[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field212[var9];
                Statics.field212[var9] = Statics.field212[var7];
                Statics.field212[var7++] = var10;
            }
        }
        Statics.field212[arg1] = Statics.field212[var7];
        Statics.field212[var7] = var8;
        method138(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method138(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("k.q(Lw;Lw;IZIZI)I")
    public static int method575(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = Statics.method2989(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = Statics.method2989(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("h.d(I)Lw;")
    public static class26 method97() {
        field634 = 0;
        return method152();
    }

    @ObfuscatedName("t.c(I)Lw;")
    public static class26 method152() {
        return field634 < field636 ? Statics.field212[++field634 - 1] : null;
    }

    @ObfuscatedName("w.y(I)Z")
    public boolean method606() {
        return (0x1 & this.field650) != 0;
    }

    @ObfuscatedName("w.m(I)Z")
    public boolean method608() {
        return (0x2 & this.field650) != 0;
    }

    @ObfuscatedName("w.e(I)Z")
    public boolean method621() {
        return (0x4 & this.field650) != 0;
    }

    @ObfuscatedName("w.z(I)Z")
    public boolean method625() {
        return (0x8 & this.field650) != 0;
    }
}
