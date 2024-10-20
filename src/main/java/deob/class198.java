package deob;

@ObfuscatedName("gg")
public class class198 extends class130 {

    @ObfuscatedName("gg.s")
    public static boolean field2935 = false;

    @ObfuscatedName("gg.h")
    public static class125 field2932 = new class125(64);

    @ObfuscatedName("gg.a")
    public static class125 field2903 = new class125(500);

    @ObfuscatedName("gg.g")
    public static class125 field2904 = new class125(30);

    @ObfuscatedName("gg.k")
    public static class125 field2941 = new class125(30);

    @ObfuscatedName("gg.u")
    public static class77[] field2906 = new class77[4];

    @ObfuscatedName("gg.b")
    public int field2943;

    @ObfuscatedName("gg.x")
    public int[] field2949;

    @ObfuscatedName("gg.r")
    public int[] field2909;

    @ObfuscatedName("gg.n")
    public String field2910 = "null";

    @ObfuscatedName("gg.m")
    public short[] field2948;

    @ObfuscatedName("gg.j")
    public short[] field2912;

    @ObfuscatedName("gg.w")
    public short[] field2913;

    @ObfuscatedName("gg.p")
    public short[] field2914;

    @ObfuscatedName("gg.o")
    public int field2915 = 1;

    @ObfuscatedName("gg.i")
    public int field2916 = 1;

    @ObfuscatedName("gg.z")
    public int field2917 = 2;

    @ObfuscatedName("gg.e")
    public boolean field2934 = true;

    @ObfuscatedName("gg.d")
    public int field2911 = -1;

    @ObfuscatedName("gg.t")
    public int field2920 = -1;

    @ObfuscatedName("gg.q")
    public boolean field2921 = false;

    @ObfuscatedName("gg.y")
    public boolean field2922 = false;

    @ObfuscatedName("gg.l")
    public int field2923 = -1;

    @ObfuscatedName("gg.v")
    public int field2924 = 16;

    @ObfuscatedName("gg.az")
    public int field2925 = 0;

    @ObfuscatedName("gg.ai")
    public int field2926 = 0;

    @ObfuscatedName("gg.ad")
    public String[] field2927 = new String[5];

    @ObfuscatedName("gg.aa")
    public int field2907 = -1;

    @ObfuscatedName("gg.ao")
    public int field2908 = -1;

    @ObfuscatedName("gg.ax")
    public boolean field2930 = false;

    @ObfuscatedName("gg.ae")
    public boolean field2931 = true;

    @ObfuscatedName("gg.al")
    public int field2929 = 128;

    @ObfuscatedName("gg.an")
    public int field2933 = 128;

    @ObfuscatedName("gg.aw")
    public int field2918 = 128;

    @ObfuscatedName("gg.ah")
    public int field2901 = 0;

    @ObfuscatedName("gg.ar")
    public int field2936 = 0;

    @ObfuscatedName("gg.ay")
    public int field2937 = 0;

    @ObfuscatedName("gg.as")
    public boolean field2905 = false;

    @ObfuscatedName("gg.aq")
    public boolean field2902 = false;

    @ObfuscatedName("gg.af")
    public int field2940 = -1;

    @ObfuscatedName("gg.aj")
    public int[] field2939;

    @ObfuscatedName("gg.ap")
    public int field2942 = -1;

    @ObfuscatedName("gg.ac")
    public int field2928 = -1;

    @ObfuscatedName("gg.at")
    public int field2944 = -1;

    @ObfuscatedName("gg.av")
    public int field2945 = 0;

    @ObfuscatedName("gg.am")
    public int field2946 = 0;

    @ObfuscatedName("gg.ak")
    public int field2947 = 0;

    @ObfuscatedName("gg.au")
    public int[] field2938;

    @ObfuscatedName("eo.s(IB)Lgg;")
    public static class198 method2454(int arg0) {
        class198 var1 = (class198) field2932.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2919.method2986(6, arg0);
        class198 var3 = new class198();
        var3.field2943 = arg0;
        if (var2 != null) {
            var3.method3280(new class154(var2));
        }
        var3.method3309();
        if (var3.field2902) {
            var3.field2917 = 0;
            var3.field2934 = false;
        }
        field2932.method2123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gg.c(I)V")
    public void method3309() {
        if (this.field2911 == -1) {
            this.field2911 = 0;
            if (this.field2949 != null && (this.field2909 == null || this.field2909[0] == 10)) {
                this.field2911 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2927[var1] != null) {
                    this.field2911 = 1;
                }
            }
        }
        if (this.field2940 == -1) {
            this.field2940 = this.field2917 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gg.f(Lea;B)V")
    public void method3280(class154 arg0) {
        while (true) {
            int var2 = arg0.method2545();
            if (var2 == 0) {
                return;
            }
            this.method3281(arg0, var2);
        }
    }

    @ObfuscatedName("gg.g(Lea;II)V")
    public void method3281(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2545();
            if (var3 > 0) {
                if (this.field2949 == null || field2935) {
                    this.field2909 = new int[var3];
                    this.field2949 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2949[var4] = arg0.method2541();
                        this.field2909[var4] = arg0.method2545();
                    }
                } else {
                    arg0.field2098 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2910 = arg0.method2734();
        } else if (arg1 == 5) {
            int var5 = arg0.method2545();
            if (var5 > 0) {
                if (this.field2949 == null || field2935) {
                    this.field2909 = null;
                    this.field2949 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2949[var6] = arg0.method2541();
                    }
                } else {
                    arg0.field2098 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2915 = arg0.method2545();
        } else if (arg1 == 15) {
            this.field2916 = arg0.method2545();
        } else if (arg1 == 17) {
            this.field2917 = 0;
            this.field2934 = false;
        } else if (arg1 == 18) {
            this.field2934 = false;
        } else if (arg1 == 19) {
            this.field2911 = arg0.method2545();
        } else if (arg1 == 21) {
            this.field2920 = 0;
        } else if (arg1 == 22) {
            this.field2921 = true;
        } else if (arg1 == 23) {
            this.field2922 = true;
        } else if (arg1 == 24) {
            this.field2923 = arg0.method2541();
            if (this.field2923 == 65535) {
                this.field2923 = -1;
            }
        } else if (arg1 == 27) {
            this.field2917 = 1;
        } else if (arg1 == 28) {
            this.field2924 = arg0.method2545();
        } else if (arg1 == 29) {
            this.field2925 = arg0.method2657();
        } else if (arg1 == 39) {
            this.field2926 = arg0.method2657() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2927[arg1 - 30] = arg0.method2734();
            if (this.field2927[arg1 - 30].equalsIgnoreCase(class174.field2486)) {
                this.field2927[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2545();
            this.field2948 = new short[var7];
            this.field2912 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2948[var8] = (short) arg0.method2541();
                this.field2912[var8] = (short) arg0.method2541();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2545();
            this.field2913 = new short[var9];
            this.field2914 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2913[var10] = (short) arg0.method2541();
                this.field2914[var10] = (short) arg0.method2541();
            }
        } else if (arg1 == 60) {
            this.field2907 = arg0.method2541();
        } else if (arg1 == 62) {
            this.field2930 = true;
        } else if (arg1 == 64) {
            this.field2931 = false;
        } else if (arg1 == 65) {
            this.field2929 = arg0.method2541();
        } else if (arg1 == 66) {
            this.field2933 = arg0.method2541();
        } else if (arg1 == 67) {
            this.field2918 = arg0.method2541();
        } else if (arg1 == 68) {
            this.field2908 = arg0.method2541();
        } else if (arg1 == 69) {
            arg0.method2545();
        } else if (arg1 == 70) {
            this.field2901 = arg0.method2672();
        } else if (arg1 == 71) {
            this.field2936 = arg0.method2672();
        } else if (arg1 == 72) {
            this.field2937 = arg0.method2672();
        } else if (arg1 == 73) {
            this.field2905 = true;
        } else if (arg1 == 74) {
            this.field2902 = true;
        } else if (arg1 == 75) {
            this.field2940 = arg0.method2545();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2942 = arg0.method2541();
            if (this.field2942 == 65535) {
                this.field2942 = -1;
            }
            this.field2928 = arg0.method2541();
            if (this.field2928 == 65535) {
                this.field2928 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2541();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2545();
            this.field2939 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2939[var15] = arg0.method2541();
                if (this.field2939[var15] == 65535) {
                    this.field2939[var15] = -1;
                }
            }
            this.field2939[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2944 = arg0.method2541();
            this.field2945 = arg0.method2545();
        } else if (arg1 == 79) {
            this.field2946 = arg0.method2541();
            this.field2947 = arg0.method2541();
            this.field2945 = arg0.method2545();
            int var11 = arg0.method2545();
            this.field2938 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2938[var12] = arg0.method2541();
            }
        } else if (arg1 == 81) {
            this.field2920 = arg0.method2545() * 256;
        }
    }

    @ObfuscatedName("gg.k(IB)Z")
    public final boolean method3282(int arg0) {
        if (this.field2909 != null) {
            for (int var4 = 0; var4 < this.field2909.length; var4++) {
                if (this.field2909[var4] == arg0) {
                    return Statics.field3088.method2988(this.field2949[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2949 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2949.length; var3++) {
                var2 &= Statics.field3088.method2988(this.field2949[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gg.u(I)Z")
    public final boolean method3296() {
        if (this.field2949 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2949.length; var2++) {
            var1 &= Statics.field3088.method2988(this.field2949[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gg.b(II[[IIIIB)Lcm;")
    public final class90 method3283(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2909 == null) {
            var7 = (long) ((this.field2943 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2943 << 10) + (arg0 << 3) + arg1);
        }
        class90 var9 = (class90) field2904.method2121(var7);
        if (var9 == null) {
            class77 var10 = this.method3287(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2921) {
                var10.field1269 = (short) (this.field2925 + 64);
                var10.field1258 = (short) (this.field2926 + 768);
                var10.method1382();
                var9 = var10;
            } else {
                var9 = var10.method1371(this.field2925 + 64, this.field2926 + 768, -50, -10, -50);
            }
            field2904.method2123(var9, var7);
        }
        if (this.field2921) {
            var9 = ((class77) var9).method1356();
        }
        if (this.field2920 >= 0) {
            if (var9 instanceof class83) {
                var9 = ((class83) var9).method1483(arg2, arg3, arg4, arg5, true, this.field2920);
            } else if (var9 instanceof class77) {
                var9 = ((class77) var9).method1424(arg2, arg3, arg4, arg5, true, this.field2920);
            }
        }
        return var9;
    }

    @ObfuscatedName("gg.x(II[[IIIII)Lcz;")
    public final class83 method3285(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2909 == null) {
            var7 = (long) ((this.field2943 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2943 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field2941.method2121(var7);
        if (var9 == null) {
            class77 var10 = this.method3287(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1371(this.field2925 + 64, this.field2926 + 768, -50, -10, -50);
            field2941.method2123(var9, var7);
        }
        if (this.field2920 >= 0) {
            var9 = var9.method1483(arg2, arg3, arg4, arg5, true, this.field2920);
        }
        return var9;
    }

    @ObfuscatedName("gg.r(II[[IIIILgx;IB)Lcz;")
    public final class83 method3286(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class202 arg6, int arg7) {
        long var9;
        if (this.field2909 == null) {
            var9 = (long) ((this.field2943 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2943 << 10) + (arg0 << 3) + arg1);
        }
        class83 var11 = (class83) field2941.method2121(var9);
        if (var11 == null) {
            class77 var12 = this.method3287(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1371(this.field2925 + 64, this.field2926 + 768, -50, -10, -50);
            field2941.method2123(var11, var9);
        }
        if (arg6 == null && this.field2920 == -1) {
            return var11;
        }
        class83 var13;
        if (arg6 == null) {
            var13 = var11.method1444(true);
        } else {
            var13 = arg6.method3429(var11, arg7, arg1);
        }
        if (this.field2920 >= 0) {
            var13 = var13.method1483(arg2, arg3, arg4, arg5, false, this.field2920);
        }
        return var13;
    }

    @ObfuscatedName("gg.n(III)Lbu;")
    public final class77 method3287(int arg0, int arg1) {
        class77 var3 = null;
        if (this.field2909 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2949 == null) {
                return null;
            }
            boolean var4 = this.field2930;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2949.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2949[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class77) field2903.method2121((long) var7);
                if (var3 == null) {
                    var3 = class77.method1351(Statics.field3088, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1366();
                    }
                    field2903.method2123(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2906[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class77(field2906, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2909.length; var9++) {
                if (this.field2909[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2949[var8];
            boolean var11 = this.field2930 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class77) field2903.method2121((long) var10);
            if (var3 == null) {
                var3 = class77.method1351(Statics.field3088, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1366();
                }
                field2903.method2123(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2929 == 128 && this.field2933 == 128 && this.field2918 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2901 == 0 && this.field2936 == 0 && this.field2937 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class77 var14 = new class77(var3, arg1 == 0 && !var12 && !var13, this.field2948 == null, this.field2913 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1362(256);
            var14.method1392(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1359();
        } else if (var15 == 2) {
            var14.method1354();
        } else if (var15 == 3) {
            var14.method1411();
        }
        if (this.field2948 != null) {
            for (int var16 = 0; var16 < this.field2948.length; var16++) {
                var14.method1364(this.field2948[var16], this.field2912[var16]);
            }
        }
        if (this.field2913 != null) {
            for (int var17 = 0; var17 < this.field2913.length; var17++) {
                var14.method1365(this.field2913[var17], this.field2914[var17]);
            }
        }
        if (var12) {
            var14.method1374(this.field2929, this.field2933, this.field2918);
        }
        if (var13) {
            var14.method1392(this.field2901, this.field2936, this.field2937);
        }
        return var14;
    }

    @ObfuscatedName("gg.m(I)Lgg;")
    public final class198 method3288() {
        int var1 = -1;
        if (this.field2942 != -1) {
            var1 = class166.method175(this.field2942);
        } else if (this.field2928 != -1) {
            var1 = class166.field2176[this.field2928];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2939.length - 1) {
            var2 = this.field2939[var1];
        } else {
            var2 = this.field2939[this.field2939.length - 1];
        }
        return var2 == -1 ? null : method2454(var2);
    }

    @ObfuscatedName("gg.j(I)Z")
    public boolean method3289() {
        if (this.field2939 == null) {
            return this.field2944 != -1 || this.field2938 != null;
        }
        for (int var1 = 0; var1 < this.field2939.length; var1++) {
            if (this.field2939[var1] != -1) {
                class198 var2 = method2454(this.field2939[var1]);
                if (var2.field2944 != -1 || var2.field2938 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
