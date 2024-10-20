package deob;

import java.net.URL;

@ObfuscatedName("as")
public class class28 {

    @ObfuscatedName("as.s")
    public static int field664 = 0;

    @ObfuscatedName("as.k")
    public static int field665 = 0;

    @ObfuscatedName("as.u")
    public static int[] field666 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("as.n")
    public static int[] field667 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("as.m")
    public int field668;

    @ObfuscatedName("as.q")
    public int field669;

    @ObfuscatedName("as.p")
    public int field670;

    @ObfuscatedName("as.w")
    public String field671;

    @ObfuscatedName("as.o")
    public String field681;

    @ObfuscatedName("as.d")
    public int field673;

    @ObfuscatedName("as.f")
    public int field674;

    @ObfuscatedName("r.l(I)Z")
    public static boolean method39() {
        try {
            if (Statics.field2028 == null) {
                Statics.field2028 = new class19(Statics.field2071, new URL(Statics.field224));
            } else {
                byte[] var0 = Statics.field2028.method205();
                if (var0 != null) {
                    class123 var1 = new class123(var0);
                    field664 = var1.method2492();
                    Statics.field663 = new class28[field664];
                    int var2 = 0;
                    while (var2 < field664) {
                        class28 var3 = Statics.field663[var2] = new class28();
                        var3.field668 = var1.method2492();
                        var3.field669 = var1.method2477();
                        var3.field671 = var1.method2520();
                        var3.field681 = var1.method2520();
                        var3.field673 = var1.method2490();
                        var3.field670 = var1.method2493();
                        var3.field674 = var2++;
                    }
                    Statics.method130(Statics.field663, 0, Statics.field663.length - 1, field667, field666);
                    Statics.field2028 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2028 = null;
        }
        return false;
    }

    @ObfuscatedName("ez.g(III)V")
    public static void method2975(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field667[var5] != arg0) {
                var2[var4] = field667[var5];
                var3[var4] = field666[var5];
                var4++;
            }
        }
        field667 = var2;
        field666 = var3;
        Statics.method130(Statics.field663, 0, Statics.field663.length - 1, field667, field666);
    }

    @ObfuscatedName("ac.e(IZIZI)V")
    public static void method659(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field663 != null) {
            method886(0, Statics.field663.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("at.h(IIIZIZI)V")
    public static void method886(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class28 var8 = Statics.field663[var6];
        Statics.field663[var6] = Statics.field663[arg1];
        Statics.field663[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method2783(Statics.field663[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class28 var10 = Statics.field663[var9];
                Statics.field663[var9] = Statics.field663[var7];
                Statics.field663[var7++] = var10;
            }
        }
        Statics.field663[arg1] = Statics.field663[var7];
        Statics.field663[var7] = var8;
        method886(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method886(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("dr.s(Las;Las;IZIZI)I")
    public static int method2783(class28 arg0, class28 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = Statics.method924(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = Statics.method924(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("fc.u(I)Las;")
    public static class28 method3108() {
        field665 = 0;
        return method618();
    }

    @ObfuscatedName("ad.n(I)Las;")
    public static class28 method618() {
        return field665 < field664 ? Statics.field663[++field665 - 1] : null;
    }

    @ObfuscatedName("as.b(B)Z")
    public boolean method625() {
        return (0x1 & this.field669) != 0;
    }

    @ObfuscatedName("as.m(B)Z")
    public boolean method626() {
        return (0x2 & this.field669) != 0;
    }

    @ObfuscatedName("as.q(B)Z")
    public boolean method627() {
        return (0x4 & this.field669) != 0;
    }

    @ObfuscatedName("as.p(I)Z")
    public boolean method628() {
        return (0x8 & this.field669) != 0;
    }

    @ObfuscatedName("as.w(B)Z")
    public boolean method629() {
        return (0x20000000 & this.field669) != 0;
    }

    @ObfuscatedName("as.o(S)Z")
    public boolean method630() {
        return (0x2000000 & this.field669) != 0;
    }
}
