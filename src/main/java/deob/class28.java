package deob;

import java.net.URL;

@ObfuscatedName("ah")
public class class28 {

    @ObfuscatedName("ah.g")
    public static int field631 = 0;

    @ObfuscatedName("ah.m")
    public static int field642 = 0;

    @ObfuscatedName("ah.f")
    public static int[] field633 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ah.k")
    public static int[] field634 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ah.r")
    public int field627;

    @ObfuscatedName("ah.w")
    public int field638;

    @ObfuscatedName("ah.u")
    public int field637;

    @ObfuscatedName("ah.n")
    public String field635;

    @ObfuscatedName("ah.d")
    public String field639;

    @ObfuscatedName("ah.a")
    public int field640;

    @ObfuscatedName("ah.b")
    public int field641;

    @ObfuscatedName("ax.s(B)Z")
    public static boolean method669() {
        try {
            if (Statics.field3171 == null) {
                Statics.field3171 = new class19(Statics.field122, new URL(Statics.field2948));
            } else {
                byte[] var0 = Statics.field3171.method190();
                if (var0 != null) {
                    class123 var1 = new class123(var0);
                    field631 = var1.method2550();
                    Statics.field630 = new class28[field631];
                    int var2 = 0;
                    while (var2 < field631) {
                        class28 var3 = Statics.field630[var2] = new class28();
                        var3.field627 = var1.method2550();
                        var3.field638 = var1.method2408();
                        var3.field635 = var1.method2385();
                        var3.field639 = var1.method2385();
                        var3.field640 = var1.method2363();
                        var3.field637 = var1.method2356();
                        var3.field641 = var2++;
                    }
                    method534(Statics.field630, 0, Statics.field630.length - 1, field634, field633);
                    Statics.field3171 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3171 = null;
        }
        return false;
    }

    @ObfuscatedName("i.z(III)V")
    public static void method533(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field634[var5] != arg0) {
                var2[var4] = field634[var5];
                var3[var4] = field633[var5];
                var4++;
            }
        }
        field634 = var2;
        field633 = var3;
        method534(Statics.field630, 0, Statics.field630.length - 1, field634, field633);
    }

    @ObfuscatedName("i.t([Lah;II[I[II)V")
    public static void method534(class28[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class28 var8 = arg0[var7];
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
                        var11 = arg0[var6].field641;
                        var12 = var8.field641;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field637;
                        var12 = var8.field637;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method604() ? 1 : 0;
                        var12 = var8.method604() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field627;
                        var12 = var8.field627;
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
                        var15 = arg0[var5].field641;
                        var16 = var8.field641;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field637;
                        var16 = var8.field637;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method604() ? 1 : 0;
                        var16 = var8.method604() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field627;
                        var16 = var8.field627;
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
                class28 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method534(arg0, arg1, var6, arg3, arg4);
        method534(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("bg.y(IZIZI)V")
    public static void method1062(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field630 != null) {
            method2847(0, Statics.field630.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("en.p(IIIZIZB)V")
    public static void method2847(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class28 var8 = Statics.field630[var6];
        Statics.field630[var6] = Statics.field630[arg1];
        Statics.field630[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2737(Statics.field630[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class28 var10 = Statics.field630[var9];
                Statics.field630[var9] = Statics.field630[var7];
                Statics.field630[var7++] = var10;
            }
        }
        Statics.field630[arg1] = Statics.field630[var7];
        Statics.field630[var7] = var8;
        method2847(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2847(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("es.g(Lah;Lah;IZIZI)I")
    public static int method2737(class28 arg0, class28 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method2691(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method2691(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("df.m(Lah;Lah;IZI)I")
    public static int method2691(class28 arg0, class28 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field637;
            int var5 = arg1.field637;
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
            return arg0.field640 - arg1.field640;
        } else if (arg2 == 3) {
            if (arg0.field639.equals("-")) {
                if (arg1.field639.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field639.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field639.compareTo(arg1.field639);
            }
        } else if (arg2 == 4) {
            return arg0.method645() ? (arg1.method645() ? 0 : 1) : (arg1.method645() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method605() ? (arg1.method605() ? 0 : 1) : (arg1.method605() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method606() ? (arg1.method606() ? 0 : 1) : (arg1.method606() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method604() ? (arg1.method604() ? 0 : 1) : (arg1.method604() ? -1 : 0);
        } else {
            return arg0.field627 - arg1.field627;
        }
    }

    @ObfuscatedName("client.f(I)Lah;")
    public static class28 method389() {
        return field642 < field631 ? Statics.field630[++field642 - 1] : null;
    }

    @ObfuscatedName("ah.k(B)Z")
    public boolean method604() {
        return (0x1 & this.field638) != 0;
    }

    @ObfuscatedName("ah.h(I)Z")
    public boolean method605() {
        return (0x2 & this.field638) != 0;
    }

    @ObfuscatedName("ah.r(B)Z")
    public boolean method606() {
        return (0x4 & this.field638) != 0;
    }

    @ObfuscatedName("ah.w(I)Z")
    public boolean method645() {
        return (0x8 & this.field638) != 0;
    }

    @ObfuscatedName("ah.u(I)Z")
    public boolean method628() {
        return (0x20000000 & this.field638) != 0;
    }

    @ObfuscatedName("ah.n(I)Z")
    public boolean method639() {
        return (0x2000000 & this.field638) != 0;
    }
}
