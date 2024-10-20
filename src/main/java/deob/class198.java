package deob;

@ObfuscatedName("gt")
public class class198 extends class130 {

    @ObfuscatedName("gt.x")
    public static boolean field2946 = false;

    @ObfuscatedName("gt.v")
    public static class125 field2901 = new class125(64);

    @ObfuscatedName("gt.y")
    public static class125 field2925 = new class125(500);

    @ObfuscatedName("gt.p")
    public static class125 field2903 = new class125(30);

    @ObfuscatedName("gt.j")
    public static class125 field2904 = new class125(30);

    @ObfuscatedName("gt.m")
    public static class77[] field2905 = new class77[4];

    @ObfuscatedName("gt.a")
    public int field2922;

    @ObfuscatedName("gt.i")
    public int[] field2902;

    @ObfuscatedName("gt.s")
    public int[] field2948;

    @ObfuscatedName("gt.k")
    public String field2913 = "null";

    @ObfuscatedName("gt.f")
    public short[] field2910;

    @ObfuscatedName("gt.o")
    public short[] field2907;

    @ObfuscatedName("gt.q")
    public short[] field2912;

    @ObfuscatedName("gt.c")
    public short[] field2929;

    @ObfuscatedName("gt.b")
    public int field2914 = 1;

    @ObfuscatedName("gt.w")
    public int field2933 = 1;

    @ObfuscatedName("gt.l")
    public int field2916 = 2;

    @ObfuscatedName("gt.r")
    public boolean field2937 = true;

    @ObfuscatedName("gt.u")
    public int field2918 = -1;

    @ObfuscatedName("gt.e")
    public int field2919 = -1;

    @ObfuscatedName("gt.h")
    public boolean field2920 = false;

    @ObfuscatedName("gt.d")
    public boolean field2915 = false;

    @ObfuscatedName("gt.z")
    public int field2921 = -1;

    @ObfuscatedName("gt.t")
    public int field2923 = 16;

    @ObfuscatedName("gt.ab")
    public int field2924 = 0;

    @ObfuscatedName("gt.ac")
    public int field2930 = 0;

    @ObfuscatedName("gt.au")
    public String[] field2898 = new String[5];

    @ObfuscatedName("gt.al")
    public int field2927 = -1;

    @ObfuscatedName("gt.ae")
    public int field2928 = -1;

    @ObfuscatedName("gt.ad")
    public boolean field2909 = false;

    @ObfuscatedName("gt.aq")
    public boolean field2906 = true;

    @ObfuscatedName("gt.aa")
    public int field2931 = 128;

    @ObfuscatedName("gt.af")
    public int field2932 = 128;

    @ObfuscatedName("gt.as")
    public int field2899 = 128;

    @ObfuscatedName("gt.ao")
    public int field2934 = 0;

    @ObfuscatedName("gt.ax")
    public int field2935 = 0;

    @ObfuscatedName("gt.an")
    public int field2936 = 0;

    @ObfuscatedName("gt.ag")
    public boolean field2944 = false;

    @ObfuscatedName("gt.aj")
    public boolean field2938 = false;

    @ObfuscatedName("gt.ar")
    public int field2939 = -1;

    @ObfuscatedName("gt.az")
    public int[] field2940;

    @ObfuscatedName("gt.av")
    public int field2941 = -1;

    @ObfuscatedName("gt.ap")
    public int field2942 = -1;

    @ObfuscatedName("gt.aw")
    public int field2943 = -1;

    @ObfuscatedName("gt.ay")
    public int field2911 = 0;

    @ObfuscatedName("gt.ai")
    public int field2908 = 0;

    @ObfuscatedName("gt.at")
    public int field2917 = 0;

    @ObfuscatedName("gt.ah")
    public int[] field2947;

    @ObfuscatedName("gt.g(I)V")
    public void method3452() {
        if (this.field2918 == -1) {
            this.field2918 = 0;
            if (this.field2902 != null && (this.field2948 == null || this.field2948[0] == 10)) {
                this.field2918 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2898[var1] != null) {
                    this.field2918 = 1;
                }
            }
        }
        if (this.field2939 == -1) {
            this.field2939 = this.field2916 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gt.v(Leq;I)V")
    public void method3487(class154 arg0) {
        while (true) {
            int var2 = arg0.method2878();
            if (var2 == 0) {
                return;
            }
            this.method3470(arg0, var2);
        }
    }

    @ObfuscatedName("gt.y(Leq;II)V")
    public void method3470(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2878();
            if (var3 > 0) {
                if (this.field2902 == null || field2946) {
                    this.field2948 = new int[var3];
                    this.field2902 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2902[var4] = arg0.method2833();
                        this.field2948[var4] = arg0.method2878();
                    }
                } else {
                    arg0.field2087 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2913 = arg0.method2709();
        } else if (arg1 == 5) {
            int var5 = arg0.method2878();
            if (var5 > 0) {
                if (this.field2902 == null || field2946) {
                    this.field2948 = null;
                    this.field2902 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2902[var6] = arg0.method2833();
                    }
                } else {
                    arg0.field2087 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2914 = arg0.method2878();
        } else if (arg1 == 15) {
            this.field2933 = arg0.method2878();
        } else if (arg1 == 17) {
            this.field2916 = 0;
            this.field2937 = false;
        } else if (arg1 == 18) {
            this.field2937 = false;
        } else if (arg1 == 19) {
            this.field2918 = arg0.method2878();
        } else if (arg1 == 21) {
            this.field2919 = 0;
        } else if (arg1 == 22) {
            this.field2920 = true;
        } else if (arg1 == 23) {
            this.field2915 = true;
        } else if (arg1 == 24) {
            this.field2921 = arg0.method2833();
            if (this.field2921 == 65535) {
                this.field2921 = -1;
            }
        } else if (arg1 == 27) {
            this.field2916 = 1;
        } else if (arg1 == 28) {
            this.field2923 = arg0.method2878();
        } else if (arg1 == 29) {
            this.field2924 = arg0.method2788();
        } else if (arg1 == 39) {
            this.field2930 = arg0.method2788();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2898[arg1 - 30] = arg0.method2709();
            if (this.field2898[arg1 - 30].equalsIgnoreCase(class174.field2361)) {
                this.field2898[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2878();
            this.field2910 = new short[var7];
            this.field2907 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2910[var8] = (short) arg0.method2833();
                this.field2907[var8] = (short) arg0.method2833();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2878();
            this.field2912 = new short[var9];
            this.field2929 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2912[var10] = (short) arg0.method2833();
                this.field2929[var10] = (short) arg0.method2833();
            }
        } else if (arg1 == 60) {
            this.field2927 = arg0.method2833();
        } else if (arg1 == 62) {
            this.field2909 = true;
        } else if (arg1 == 64) {
            this.field2906 = false;
        } else if (arg1 == 65) {
            this.field2931 = arg0.method2833();
        } else if (arg1 == 66) {
            this.field2932 = arg0.method2833();
        } else if (arg1 == 67) {
            this.field2899 = arg0.method2833();
        } else if (arg1 == 68) {
            this.field2928 = arg0.method2833();
        } else if (arg1 == 69) {
            arg0.method2878();
        } else if (arg1 == 70) {
            this.field2934 = arg0.method2704();
        } else if (arg1 == 71) {
            this.field2935 = arg0.method2704();
        } else if (arg1 == 72) {
            this.field2936 = arg0.method2704();
        } else if (arg1 == 73) {
            this.field2944 = true;
        } else if (arg1 == 74) {
            this.field2938 = true;
        } else if (arg1 == 75) {
            this.field2939 = arg0.method2878();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2941 = arg0.method2833();
            if (this.field2941 == 65535) {
                this.field2941 = -1;
            }
            this.field2942 = arg0.method2833();
            if (this.field2942 == 65535) {
                this.field2942 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2833();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2878();
            this.field2940 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2940[var15] = arg0.method2833();
                if (this.field2940[var15] == 65535) {
                    this.field2940[var15] = -1;
                }
            }
            this.field2940[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2943 = arg0.method2833();
            this.field2911 = arg0.method2878();
        } else if (arg1 == 79) {
            this.field2908 = arg0.method2833();
            this.field2917 = arg0.method2833();
            this.field2911 = arg0.method2878();
            int var11 = arg0.method2878();
            this.field2947 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2947[var12] = arg0.method2833();
            }
        } else if (arg1 == 81) {
            this.field2919 = arg0.method2878() * 256;
        }
    }

    @ObfuscatedName("gt.p(IB)Z")
    public final boolean method3455(int arg0) {
        if (this.field2948 != null) {
            for (int var4 = 0; var4 < this.field2948.length; var4++) {
                if (this.field2948[var4] == arg0) {
                    return Statics.field2900.method3154(this.field2902[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2902 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2902.length; var3++) {
                var2 &= Statics.field2900.method3154(this.field2902[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gt.j(I)Z")
    public final boolean method3492() {
        if (this.field2902 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2902.length; var2++) {
            var1 &= Statics.field2900.method3154(this.field2902[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gt.s(II[[IIIIB)Lcl;")
    public final class90 method3454(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2948 == null) {
            var7 = (long) ((this.field2922 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2922 << 10) + (arg0 << 3) + arg1);
        }
        class90 var9 = (class90) field2903.method2275(var7);
        if (var9 == null) {
            class77 var10 = this.method3460(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2920) {
                var10.field1268 = (short) (this.field2924 + 64);
                var10.field1269 = (short) (this.field2930 * 25 + 768);
                var10.method1485();
                var9 = var10;
            } else {
                var9 = var10.method1546(this.field2924 + 64, this.field2930 * 25 + 768, -50, -10, -50);
            }
            field2903.method2282(var9, var7);
        }
        if (this.field2920) {
            var9 = ((class77) var9).method1482();
        }
        if (this.field2919 >= 0) {
            if (var9 instanceof class83) {
                var9 = ((class83) var9).method1576(arg2, arg3, arg4, arg5, true, this.field2919);
            } else if (var9 instanceof class77) {
                var9 = ((class77) var9).method1492(arg2, arg3, arg4, arg5, true, this.field2919);
            }
        }
        return var9;
    }

    @ObfuscatedName("gt.k(II[[IIIII)Lcj;")
    public final class83 method3483(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2948 == null) {
            var7 = (long) ((this.field2922 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2922 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field2904.method2275(var7);
        if (var9 == null) {
            class77 var10 = this.method3460(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1546(this.field2924 + 64, this.field2930 * 25 + 768, -50, -10, -50);
            field2904.method2282(var9, var7);
        }
        if (this.field2919 >= 0) {
            var9 = var9.method1576(arg2, arg3, arg4, arg5, true, this.field2919);
        }
        return var9;
    }

    @ObfuscatedName("gt.f(II[[IIIILgk;II)Lcj;")
    public final class83 method3459(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class202 arg6, int arg7) {
        long var9;
        if (this.field2948 == null) {
            var9 = (long) ((this.field2922 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2922 << 10) + (arg0 << 3) + arg1);
        }
        class83 var11 = (class83) field2904.method2275(var9);
        if (var11 == null) {
            class77 var12 = this.method3460(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1546(this.field2924 + 64, this.field2930 * 25 + 768, -50, -10, -50);
            field2904.method2282(var11, var9);
        }
        if (arg6 == null && this.field2919 == -1) {
            return var11;
        }
        class83 var13;
        if (arg6 == null) {
            var13 = var11.method1619(true);
        } else {
            var13 = arg6.method3610(var11, arg7, arg1);
        }
        if (this.field2919 >= 0) {
            var13 = var13.method1576(arg2, arg3, arg4, arg5, false, this.field2919);
        }
        return var13;
    }

    @ObfuscatedName("gt.o(III)Lbc;")
    public final class77 method3460(int arg0, int arg1) {
        class77 var3 = null;
        if (this.field2948 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2902 == null) {
                return null;
            }
            boolean var4 = this.field2909;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2902.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2902[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class77) field2925.method2275((long) var7);
                if (var3 == null) {
                    var3 = class77.method1469(Statics.field2900, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1502();
                    }
                    field2925.method2282(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2905[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class77(field2905, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2948.length; var9++) {
                if (this.field2948[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2902[var8];
            boolean var11 = this.field2909 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class77) field2925.method2275((long) var10);
            if (var3 == null) {
                var3 = class77.method1469(Statics.field2900, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1502();
                }
                field2925.method2282(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2931 == 128 && this.field2932 == 128 && this.field2899 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2934 == 0 && this.field2935 == 0 && this.field2936 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class77 var14 = new class77(var3, arg1 == 0 && !var12 && !var13, this.field2910 == null, this.field2912 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1479(256);
            var14.method1480(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1476();
        } else if (var15 == 2) {
            var14.method1477();
        } else if (var15 == 3) {
            var14.method1506();
        }
        if (this.field2910 != null) {
            for (int var16 = 0; var16 < this.field2910.length; var16++) {
                var14.method1539(this.field2910[var16], this.field2907[var16]);
            }
        }
        if (this.field2912 != null) {
            for (int var17 = 0; var17 < this.field2912.length; var17++) {
                var14.method1534(this.field2912[var17], this.field2929[var17]);
            }
        }
        if (var12) {
            var14.method1484(this.field2931, this.field2932, this.field2899);
        }
        if (var13) {
            var14.method1480(this.field2934, this.field2935, this.field2936);
        }
        return var14;
    }

    @ObfuscatedName("gt.q(I)Lgt;")
    public final class198 method3493() {
        int var1 = -1;
        if (this.field2941 != -1) {
            var1 = class166.method203(this.field2941);
        } else if (this.field2942 != -1) {
            var1 = class166.field2166[this.field2942];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2940.length - 1) {
            var2 = this.field2940[var1];
        } else {
            var2 = this.field2940[this.field2940.length - 1];
        }
        return var2 == -1 ? null : Statics.method935(var2);
    }

    @ObfuscatedName("dg.c(B)V")
    public static void method2131() {
        field2901.method2277();
        field2925.method2277();
        field2903.method2277();
        field2904.method2277();
    }

    @ObfuscatedName("gt.b(B)Z")
    public boolean method3465() {
        if (this.field2940 == null) {
            return this.field2943 != -1 || this.field2947 != null;
        }
        for (int var1 = 0; var1 < this.field2940.length; var1++) {
            if (this.field2940[var1] != -1) {
                class198 var2 = Statics.method935(this.field2940[var1]);
                if (var2.field2943 != -1 || var2.field2947 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
