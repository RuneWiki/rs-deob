package deob;

import java.net.URL;

@ObfuscatedName("a")
public class class26 {

    @ObfuscatedName("a.g")
    public static int field654 = 0;

    @ObfuscatedName("a.o")
    public static int field659 = 0;

    @ObfuscatedName("a.s")
    public static int[] field665 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("a.k")
    public static int[] field658 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("a.c")
    public int field655;

    @ObfuscatedName("a.l")
    public int field660;

    @ObfuscatedName("a.p")
    public int field661;

    @ObfuscatedName("a.d")
    public String field662;

    @ObfuscatedName("a.i")
    public String field663;

    @ObfuscatedName("a.x")
    public int field664;

    @ObfuscatedName("a.j")
    public int field657;

    @ObfuscatedName("al.h(S)Z")
    public static boolean method689() {
        try {
            if (Statics.field2265 == null) {
                Statics.field2265 = new class19(Statics.field2158, new URL(Statics.field694));
            } else {
                byte[] var0 = Statics.field2265.method195();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    field654 = var1.method2385();
                    Statics.field651 = new class26[field654];
                    int var2 = 0;
                    while (var2 < field654) {
                        class26 var3 = Statics.field651[var2] = new class26();
                        var3.field655 = var1.method2385();
                        var3.field660 = var1.method2388();
                        var3.field662 = var1.method2391();
                        var3.field663 = var1.method2391();
                        var3.field664 = var1.method2383();
                        var3.field661 = var1.method2386();
                        var3.field657 = var2++;
                    }
                    Statics.method999(Statics.field651, 0, Statics.field651.length - 1, field658, field665);
                    Statics.field2265 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2265 = null;
        }
        return false;
    }

    @ObfuscatedName("s.q(III)V")
    public static void method107(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field658[var5] != arg0) {
                var2[var4] = field658[var5];
                var3[var4] = field665[var5];
                var4++;
            }
        }
        field658 = var2;
        field665 = var3;
        Statics.method999(Statics.field651, 0, Statics.field651.length - 1, field658, field665);
    }

    @ObfuscatedName("dk.n(IIIZIZI)V")
    public static void method2309(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class26 var8 = Statics.field651[var6];
        Statics.field651[var6] = Statics.field651[arg1];
        Statics.field651[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method163(Statics.field651[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class26 var10 = Statics.field651[var9];
                Statics.field651[var9] = Statics.field651[var7];
                Statics.field651[var7++] = var10;
            }
        }
        Statics.field651[arg1] = Statics.field651[var7];
        Statics.field651[var7] = var8;
        method2309(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2309(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("d.f(La;La;IZIZI)I")
    public static int method163(class26 arg0, class26 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method3266(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method3266(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("fy.g(La;La;IZI)I")
    public static int method3266(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field661;
            int var5 = arg1.field661;
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
            return arg0.field664 - arg1.field664;
        } else if (arg2 == 3) {
            if (arg0.field663.equals("-")) {
                if (arg1.field663.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field663.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field663.compareTo(arg1.field663);
            }
        } else if (arg2 == 4) {
            return arg0.method593() ? (arg1.method593() ? 0 : 1) : (arg1.method593() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method603() ? (arg1.method603() ? 0 : 1) : (arg1.method603() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method610() ? (arg1.method610() ? 0 : 1) : (arg1.method610() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method590() ? (arg1.method590() ? 0 : 1) : (arg1.method590() ? -1 : 0);
        } else {
            return arg0.field655 - arg1.field655;
        }
    }

    @ObfuscatedName("z.o(B)La;")
    public static class26 method569() {
        field659 = 0;
        class26 var0;
        if (field659 < field654) {
            var0 = Statics.field651[++field659 - 1];
        } else {
            var0 = null;
        }
        return var0;
    }

    @ObfuscatedName("a.s(I)Z")
    public boolean method590() {
        return (0x1 & this.field660) != 0;
    }

    @ObfuscatedName("a.k(I)Z")
    public boolean method603() {
        return (0x2 & this.field660) != 0;
    }

    @ObfuscatedName("a.b(I)Z")
    public boolean method610() {
        return (0x4 & this.field660) != 0;
    }

    @ObfuscatedName("a.c(B)Z")
    public boolean method593() {
        return (0x8 & this.field660) != 0;
    }
}
