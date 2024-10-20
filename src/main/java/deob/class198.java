package deob;

@ObfuscatedName("gy")
public class class198 extends class130 {

    @ObfuscatedName("gy.i")
    public static boolean field2901 = false;

    @ObfuscatedName("gy.k")
    public static class125 field2895 = new class125(64);

    @ObfuscatedName("gy.g")
    public static class125 field2896 = new class125(500);

    @ObfuscatedName("gy.n")
    public static class125 field2897 = new class125(30);

    @ObfuscatedName("gy.a")
    public static class125 field2898 = new class125(30);

    @ObfuscatedName("gy.q")
    public static class77[] field2899 = new class77[4];

    @ObfuscatedName("gy.w")
    public int field2924;

    @ObfuscatedName("gy.v")
    public int[] field2930;

    @ObfuscatedName("gy.h")
    public int[] field2902;

    @ObfuscatedName("gy.p")
    public String field2917 = "null";

    @ObfuscatedName("gy.l")
    public short[] field2904;

    @ObfuscatedName("gy.c")
    public short[] field2926;

    @ObfuscatedName("gy.m")
    public short[] field2906;

    @ObfuscatedName("gy.r")
    public short[] field2907;

    @ObfuscatedName("gy.u")
    public int field2908 = 1;

    @ObfuscatedName("gy.j")
    public int field2909 = 1;

    @ObfuscatedName("gy.x")
    public int field2910 = 2;

    @ObfuscatedName("gy.d")
    public boolean field2911 = true;

    @ObfuscatedName("gy.y")
    public int field2912 = -1;

    @ObfuscatedName("gy.s")
    public int field2905 = -1;

    @ObfuscatedName("gy.t")
    public boolean field2929 = false;

    @ObfuscatedName("gy.z")
    public boolean field2915 = false;

    @ObfuscatedName("gy.b")
    public int field2914 = -1;

    @ObfuscatedName("gy.o")
    public int field2893 = 16;

    @ObfuscatedName("gy.ak")
    public int field2918 = 0;

    @ObfuscatedName("gy.ai")
    public int field2919 = 0;

    @ObfuscatedName("gy.aq")
    public String[] field2920 = new String[5];

    @ObfuscatedName("gy.an")
    public int field2922 = -1;

    @ObfuscatedName("gy.ay")
    public int field2940 = -1;

    @ObfuscatedName("gy.ap")
    public boolean field2923 = false;

    @ObfuscatedName("gy.aj")
    public boolean field2916 = true;

    @ObfuscatedName("gy.aw")
    public int field2925 = 128;

    @ObfuscatedName("gy.am")
    public int field2927 = 128;

    @ObfuscatedName("gy.av")
    public int field2913 = 128;

    @ObfuscatedName("gy.af")
    public int field2900 = 0;

    @ObfuscatedName("gy.az")
    public int field2928 = 0;

    @ObfuscatedName("gy.aa")
    public int field2938 = 0;

    @ObfuscatedName("gy.ad")
    public boolean field2931 = false;

    @ObfuscatedName("gy.ab")
    public boolean field2932 = false;

    @ObfuscatedName("gy.al")
    public int field2933 = -1;

    @ObfuscatedName("gy.as")
    public int[] field2934;

    @ObfuscatedName("gy.ar")
    public int field2935 = -1;

    @ObfuscatedName("gy.at")
    public int field2936 = -1;

    @ObfuscatedName("gy.ax")
    public int field2937 = -1;

    @ObfuscatedName("gy.ao")
    public int field2921 = 0;

    @ObfuscatedName("gy.ah")
    public int field2939 = 0;

    @ObfuscatedName("gy.ac")
    public int field2903 = 0;

    @ObfuscatedName("gy.ae")
    public int[] field2941;

    @ObfuscatedName("bt.i(II)Lgy;")
    public static class198 method1371(int arg0) {
        class198 var1 = (class198) field2895.method2150((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3090.method3014(6, arg0);
        class198 var3 = new class198();
        var3.field2924 = arg0;
        if (var2 != null) {
            var3.method3334(new class154(var2));
        }
        var3.method3333();
        if (var3.field2932) {
            var3.field2910 = 0;
            var3.field2911 = false;
        }
        field2895.method2152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gy.e(I)V")
    public void method3333() {
        if (this.field2912 == -1) {
            this.field2912 = 0;
            if (this.field2930 != null && (this.field2902 == null || this.field2902[0] == 10)) {
                this.field2912 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2920[var1] != null) {
                    this.field2912 = 1;
                }
            }
        }
        if (this.field2933 == -1) {
            this.field2933 = this.field2910 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gy.f(Let;B)V")
    public void method3334(class154 arg0) {
        while (true) {
            int var2 = arg0.method2573();
            if (var2 == 0) {
                return;
            }
            this.method3349(arg0, var2);
        }
    }

    @ObfuscatedName("gy.k(Let;II)V")
    public void method3349(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2573();
            if (var3 > 0) {
                if (this.field2930 == null || field2901) {
                    this.field2902 = new int[var3];
                    this.field2930 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2930[var4] = arg0.method2575();
                        this.field2902[var4] = arg0.method2573();
                    }
                } else {
                    arg0.field2091 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2917 = arg0.method2581();
        } else if (arg1 == 5) {
            int var5 = arg0.method2573();
            if (var5 > 0) {
                if (this.field2930 == null || field2901) {
                    this.field2902 = null;
                    this.field2930 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2930[var6] = arg0.method2575();
                    }
                } else {
                    arg0.field2091 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2908 = arg0.method2573();
        } else if (arg1 == 15) {
            this.field2909 = arg0.method2573();
        } else if (arg1 == 17) {
            this.field2910 = 0;
            this.field2911 = false;
        } else if (arg1 == 18) {
            this.field2911 = false;
        } else if (arg1 == 19) {
            this.field2912 = arg0.method2573();
        } else if (arg1 == 21) {
            this.field2905 = 0;
        } else if (arg1 == 22) {
            this.field2929 = true;
        } else if (arg1 == 23) {
            this.field2915 = true;
        } else if (arg1 == 24) {
            this.field2914 = arg0.method2575();
            if (this.field2914 == 65535) {
                this.field2914 = -1;
            }
        } else if (arg1 == 27) {
            this.field2910 = 1;
        } else if (arg1 == 28) {
            this.field2893 = arg0.method2573();
        } else if (arg1 == 29) {
            this.field2918 = arg0.method2574();
        } else if (arg1 == 39) {
            this.field2919 = arg0.method2574() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2920[arg1 - 30] = arg0.method2581();
            if (this.field2920[arg1 - 30].equalsIgnoreCase(class174.field2409)) {
                this.field2920[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2573();
            this.field2904 = new short[var7];
            this.field2926 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2904[var8] = (short) arg0.method2575();
                this.field2926[var8] = (short) arg0.method2575();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2573();
            this.field2906 = new short[var9];
            this.field2907 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2906[var10] = (short) arg0.method2575();
                this.field2907[var10] = (short) arg0.method2575();
            }
        } else if (arg1 == 60) {
            this.field2922 = arg0.method2575();
        } else if (arg1 == 62) {
            this.field2923 = true;
        } else if (arg1 == 64) {
            this.field2916 = false;
        } else if (arg1 == 65) {
            this.field2925 = arg0.method2575();
        } else if (arg1 == 66) {
            this.field2927 = arg0.method2575();
        } else if (arg1 == 67) {
            this.field2913 = arg0.method2575();
        } else if (arg1 == 68) {
            this.field2940 = arg0.method2575();
        } else if (arg1 == 69) {
            arg0.method2573();
        } else if (arg1 == 70) {
            this.field2900 = arg0.method2576();
        } else if (arg1 == 71) {
            this.field2928 = arg0.method2576();
        } else if (arg1 == 72) {
            this.field2938 = arg0.method2576();
        } else if (arg1 == 73) {
            this.field2931 = true;
        } else if (arg1 == 74) {
            this.field2932 = true;
        } else if (arg1 == 75) {
            this.field2933 = arg0.method2573();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2935 = arg0.method2575();
            if (this.field2935 == 65535) {
                this.field2935 = -1;
            }
            this.field2936 = arg0.method2575();
            if (this.field2936 == 65535) {
                this.field2936 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2575();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2573();
            this.field2934 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2934[var15] = arg0.method2575();
                if (this.field2934[var15] == 65535) {
                    this.field2934[var15] = -1;
                }
            }
            this.field2934[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2937 = arg0.method2575();
            this.field2921 = arg0.method2573();
        } else if (arg1 == 79) {
            this.field2939 = arg0.method2575();
            this.field2903 = arg0.method2575();
            this.field2921 = arg0.method2573();
            int var11 = arg0.method2573();
            this.field2941 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2941[var12] = arg0.method2575();
            }
        } else if (arg1 == 81) {
            this.field2905 = arg0.method2573() * 256;
        }
    }

    @ObfuscatedName("gy.a(IB)Z")
    public final boolean method3336(int arg0) {
        if (this.field2902 != null) {
            for (int var4 = 0; var4 < this.field2902.length; var4++) {
                if (this.field2902[var4] == arg0) {
                    return Statics.field2894.method3016(this.field2930[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2930 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2930.length; var3++) {
                var2 &= Statics.field2894.method3016(this.field2930[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gy.q(I)Z")
    public final boolean method3337() {
        if (this.field2930 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2930.length; var2++) {
            var1 &= Statics.field2894.method3016(this.field2930[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gy.w(II[[IIIII)Lct;")
    public final class90 method3338(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2902 == null) {
            var7 = (long) ((this.field2924 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2924 << 10) + (arg0 << 3) + arg1);
        }
        class90 var9 = (class90) field2897.method2150(var7);
        if (var9 == null) {
            class77 var10 = this.method3341(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2929) {
                var10.field1251 = (short) (this.field2918 + 64);
                var10.field1261 = (short) (this.field2919 + 768);
                var10.method1389();
                var9 = var10;
            } else {
                var9 = var10.method1402(this.field2918 + 64, this.field2919 + 768, -50, -10, -50);
            }
            field2897.method2152(var9, var7);
        }
        if (this.field2929) {
            var9 = ((class77) var9).method1399();
        }
        if (this.field2905 >= 0) {
            if (var9 instanceof class83) {
                var9 = ((class83) var9).method1462(arg2, arg3, arg4, arg5, true, this.field2905);
            } else if (var9 instanceof class77) {
                var9 = ((class77) var9).method1379(arg2, arg3, arg4, arg5, true, this.field2905);
            }
        }
        return var9;
    }

    @ObfuscatedName("gy.v(II[[IIIII)Lch;")
    public final class83 method3368(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2902 == null) {
            var7 = (long) ((this.field2924 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2924 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field2898.method2150(var7);
        if (var9 == null) {
            class77 var10 = this.method3341(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1402(this.field2918 + 64, this.field2919 + 768, -50, -10, -50);
            field2898.method2152(var9, var7);
        }
        if (this.field2905 >= 0) {
            var9 = var9.method1462(arg2, arg3, arg4, arg5, true, this.field2905);
        }
        return var9;
    }

    @ObfuscatedName("gy.h(II[[IIIILgd;II)Lch;")
    public final class83 method3340(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class202 arg6, int arg7) {
        long var9;
        if (this.field2902 == null) {
            var9 = (long) ((this.field2924 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2924 << 10) + (arg0 << 3) + arg1);
        }
        class83 var11 = (class83) field2898.method2150(var9);
        if (var11 == null) {
            class77 var12 = this.method3341(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1402(this.field2918 + 64, this.field2919 + 768, -50, -10, -50);
            field2898.method2152(var11, var9);
        }
        if (arg6 == null && this.field2905 == -1) {
            return var11;
        }
        class83 var13;
        if (arg6 == null) {
            var13 = var11.method1463(true);
        } else {
            var13 = arg6.method3503(var11, arg7, arg1);
        }
        if (this.field2905 >= 0) {
            var13 = var13.method1462(arg2, arg3, arg4, arg5, false, this.field2905);
        }
        return var13;
    }

    @ObfuscatedName("gy.p(III)Lbv;")
    public final class77 method3341(int arg0, int arg1) {
        class77 var3 = null;
        if (this.field2902 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2930 == null) {
                return null;
            }
            boolean var4 = this.field2923;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2930.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2930[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class77) field2896.method2150((long) var7);
                if (var3 == null) {
                    var3 = class77.method1374(Statics.field2894, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1442();
                    }
                    field2896.method2152(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2899[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class77(field2899, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2902.length; var9++) {
                if (this.field2902[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2930[var8];
            boolean var11 = this.field2923 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class77) field2896.method2150((long) var10);
            if (var3 == null) {
                var3 = class77.method1374(Statics.field2894, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1442();
                }
                field2896.method2152(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2925 == 128 && this.field2927 == 128 && this.field2913 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2900 == 0 && this.field2928 == 0 && this.field2938 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class77 var14 = new class77(var3, arg1 == 0 && !var12 && !var13, this.field2904 == null, this.field2906 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1434(256);
            var14.method1385(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1437();
        } else if (var15 == 2) {
            var14.method1448();
        } else if (var15 == 3) {
            var14.method1383();
        }
        if (this.field2904 != null) {
            for (int var16 = 0; var16 < this.field2904.length; var16++) {
                var14.method1405(this.field2904[var16], this.field2926[var16]);
            }
        }
        if (this.field2906 != null) {
            for (int var17 = 0; var17 < this.field2906.length; var17++) {
                var14.method1398(this.field2906[var17], this.field2907[var17]);
            }
        }
        if (var12) {
            var14.method1393(this.field2925, this.field2927, this.field2913);
        }
        if (var13) {
            var14.method1385(this.field2900, this.field2928, this.field2938);
        }
        return var14;
    }

    @ObfuscatedName("gy.l(B)Lgy;")
    public final class198 method3342() {
        int var1 = -1;
        if (this.field2935 != -1) {
            var1 = class166.method1794(this.field2935);
        } else if (this.field2936 != -1) {
            var1 = class166.field2169[this.field2936];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2934.length - 1) {
            var2 = this.field2934[var1];
        } else {
            var2 = this.field2934[this.field2934.length - 1];
        }
        return var2 == -1 ? null : method1371(var2);
    }

    @ObfuscatedName("gy.m(I)Z")
    public boolean method3352() {
        if (this.field2934 == null) {
            return this.field2937 != -1 || this.field2941 != null;
        }
        for (int var1 = 0; var1 < this.field2934.length; var1++) {
            if (this.field2934[var1] != -1) {
                class198 var2 = method1371(this.field2934[var1]);
                if (var2.field2937 != -1 || var2.field2941 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
