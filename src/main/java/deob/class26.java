package deob;

import java.net.URL;

@ObfuscatedName("j")
public class class26 {

    @ObfuscatedName("j.d")
    public static int field637 = 0;

    @ObfuscatedName("j.n")
    public static int field638 = 0;

    @ObfuscatedName("j.m")
    public static int[] field650 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("j.g")
    public static int[] field640 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("j.r")
    public int field641;

    @ObfuscatedName("j.k")
    public int field642;

    @ObfuscatedName("j.o")
    public int field639;

    @ObfuscatedName("j.q")
    public String field644;

    @ObfuscatedName("j.p")
    public String field632;

    @ObfuscatedName("j.h")
    public int field651;

    @ObfuscatedName("j.e")
    public int field647;

    @ObfuscatedName("a.f(I)Z")
    public static boolean method616() {
        try {
            if (Statics.field3051 == null) {
                Statics.field3051 = new class19(Statics.field137, new URL(Statics.field1237));
            } else {
                byte[] var0 = Statics.field3051.method202();
                if (var0 != null) {
                    class120 var1 = new class120(var0);
                    field637 = var1.method2387();
                    Statics.field636 = new class26[field637];
                    int var2 = 0;
                    while (var2 < field637) {
                        class26 var3 = Statics.field636[var2] = new class26();
                        var3.field641 = var1.method2387();
                        var3.field642 = var1.method2527();
                        var3.field644 = var1.method2499();
                        var3.field632 = var1.method2499();
                        var3.field651 = var1.method2385();
                        var3.field639 = var1.method2388();
                        var3.field647 = var2++;
                    }
                    method3715(Statics.field636, 0, Statics.field636.length - 1, field640, field650);
                    Statics.field3051 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3051 = null;
        }
        return false;
    }

    @ObfuscatedName("dh.u(III)V")
    public static void method2188(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field640[var5] != arg0) {
                var2[var4] = field640[var5];
                var3[var4] = field650[var5];
                var4++;
            }
        }
        field640 = var2;
        field650 = var3;
        method3715(Statics.field636, 0, Statics.field636.length - 1, field640, field650);
    }

    @ObfuscatedName("ho.x([Lj;II[I[IB)V")
    public static void method3715(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field647;
                        var12 = var8.field647;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field639;
                        var12 = var8.field639;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method639() ? 1 : 0;
                        var12 = var8.method639() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field641;
                        var12 = var8.field641;
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
                        var15 = arg0[var5].field647;
                        var16 = var8.field647;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field639;
                        var16 = var8.field639;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method639() ? 1 : 0;
                        var16 = var8.method639() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field641;
                        var16 = var8.field641;
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
        method3715(arg0, arg1, var6, arg3, arg4);
        method3715(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("z.b(IZIZI)V")
    public static void method625(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field636 != null) {
            method1044(0, Statics.field636.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("at.l(IIIZIZI)V")
    public static void method1044(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field636[var6];
        Statics.field636[var6] = Statics.field636[arg1];
        Statics.field636[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method591(Statics.field636[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field636[var9];
                Statics.field636[var9] = Statics.field636[var7];
                Statics.field636[var7++] = var10;
            }
        }
        Statics.field636[arg1] = Statics.field636[var7];
        Statics.field636[var7] = var8;
        method1044(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method1044(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("y.d(Lj;Lj;IZIZI)I")
    public static int method591(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = Statics.method3696(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = Statics.method3696(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("l.m(I)Lj;")
    public static class26 method50() {
        field638 = 0;
        class26 var0;
        if (field638 < field637) {
            var0 = Statics.field636[++field638 - 1];
        } else {
            var0 = null;
        }
        return var0;
    }

    @ObfuscatedName("j.g(I)Z")
    public boolean method639() {
        return (0x1 & this.field642) != 0;
    }

    @ObfuscatedName("j.s(B)Z")
    public boolean method629() {
        return (0x2 & this.field642) != 0;
    }

    @ObfuscatedName("j.r(B)Z")
    public boolean method628() {
        return (0x4 & this.field642) != 0;
    }

    @ObfuscatedName("j.k(I)Z")
    public boolean method632() {
        return (0x8 & this.field642) != 0;
    }

    @ObfuscatedName("j.o(I)Z")
    public boolean method636() {
        return (0x20000000 & this.field642) != 0;
    }

    @ObfuscatedName("j.q(B)Z")
    public boolean method663() {
        return (0x2000000 & this.field642) != 0;
    }
}
