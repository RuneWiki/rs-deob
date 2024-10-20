package deob;

import java.net.URL;

@ObfuscatedName("aa")
public class class30 {

    @ObfuscatedName("aa.v")
    public static int field680 = 0;

    @ObfuscatedName("aa.l")
    public static int field681 = 0;

    @ObfuscatedName("aa.c")
    public static int[] field676 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("aa.u")
    public static int[] field697 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("aa.z")
    public int field685;

    @ObfuscatedName("aa.y")
    public int field695;

    @ObfuscatedName("aa.j")
    public int field687;

    @ObfuscatedName("aa.f")
    public String field688;

    @ObfuscatedName("aa.p")
    public String field689;

    @ObfuscatedName("aa.i")
    public int field690;

    @ObfuscatedName("aa.s")
    public int field691;

    @ObfuscatedName("e.o(I)Z")
    public static boolean method560() {
        try {
            if (Statics.field686 == null) {
                Statics.field686 = new class27(Statics.field1347, new URL(Statics.field2196));
            } else {
                byte[] var0 = Statics.field686.method568();
                if (var0 != null) {
                    class154 var1 = new class154(var0);
                    field680 = var1.method2554();
                    Statics.field692 = new class30[field680];
                    int var2 = 0;
                    while (var2 < field680) {
                        class30 var3 = Statics.field692[var2] = new class30();
                        var3.field685 = var1.method2554();
                        var3.field695 = var1.method2557();
                        var3.field688 = var1.method2606();
                        var3.field689 = var1.method2606();
                        var3.field690 = var1.method2552();
                        var3.field687 = var1.method2555();
                        var3.field691 = var2++;
                    }
                    method88(Statics.field692, 0, Statics.field692.length - 1, field697, field676);
                    Statics.field686 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field686 = null;
        }
        return false;
    }

    @ObfuscatedName("t.m(IIS)V")
    public static void method206(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field697[var5] != arg0) {
                var2[var4] = field697[var5];
                var3[var4] = field676[var5];
                var4++;
            }
        }
        field697 = var2;
        field676 = var3;
        method88(Statics.field692, 0, Statics.field692.length - 1, field697, field676);
    }

    @ObfuscatedName("c.b([Laa;II[I[II)V")
    public static void method88(class30[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class30 var8 = arg0[var7];
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
                        var11 = arg0[var6].field691;
                        var12 = var8.field691;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field687;
                        var12 = var8.field687;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method595() ? 1 : 0;
                        var12 = var8.method595() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field685;
                        var12 = var8.field685;
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
                        var15 = arg0[var5].field691;
                        var16 = var8.field691;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field687;
                        var16 = var8.field687;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method595() ? 1 : 0;
                        var16 = var8.method595() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field685;
                        var16 = var8.field685;
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
                class30 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method88(arg0, arg1, var6, arg3, arg4);
        method88(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("at.g(IIIZIZS)V")
    public static void method761(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class30 var8 = Statics.field692[var6];
        Statics.field692[var6] = Statics.field692[arg1];
        Statics.field692[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2469(Statics.field692[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class30 var10 = Statics.field692[var9];
                Statics.field692[var9] = Statics.field692[var7];
                Statics.field692[var7++] = var10;
            }
        }
        Statics.field692[arg1] = Statics.field692[var7];
        Statics.field692[var7] = var8;
        method761(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method761(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("et.l(Laa;Laa;IZIZB)I")
    public static int method2469(class30 arg0, class30 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method1588(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method1588(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("cx.c(Laa;Laa;IZB)I")
    public static int method1588(class30 arg0, class30 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field687;
            int var5 = arg1.field687;
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
            return arg0.field690 - arg1.field690;
        } else if (arg2 == 3) {
            if (arg0.field689.equals("-")) {
                if (arg1.field689.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field689.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field689.compareTo(arg1.field689);
            }
        } else if (arg2 == 4) {
            return arg0.method615() ? (arg1.method615() ? 0 : 1) : (arg1.method615() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method596() ? (arg1.method596() ? 0 : 1) : (arg1.method596() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method597() ? (arg1.method597() ? 0 : 1) : (arg1.method597() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method595() ? (arg1.method595() ? 0 : 1) : (arg1.method595() ? -1 : 0);
        } else {
            return arg0.field685 - arg1.field685;
        }
    }

    @ObfuscatedName("bj.u(B)Laa;")
    public static class30 method1355() {
        return field681 < field680 ? Statics.field692[++field681 - 1] : null;
    }

    @ObfuscatedName("aa.k(I)Z")
    public boolean method595() {
        return (0x1 & this.field695) != 0;
    }

    @ObfuscatedName("aa.z(I)Z")
    public boolean method596() {
        return (0x2 & this.field695) != 0;
    }

    @ObfuscatedName("aa.y(I)Z")
    public boolean method597() {
        return (0x4 & this.field695) != 0;
    }

    @ObfuscatedName("aa.j(S)Z")
    public boolean method615() {
        return (0x8 & this.field695) != 0;
    }

    @ObfuscatedName("aa.f(B)Z")
    public boolean method599() {
        return (0x20000000 & this.field695) != 0;
    }

    @ObfuscatedName("aa.p(B)Z")
    public boolean method609() {
        return (0x2000000 & this.field695) != 0;
    }
}
