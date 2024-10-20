package deob;

@ObfuscatedName("ga")
public class class198 extends class130 {

    @ObfuscatedName("ga.b")
    public static boolean field2948 = false;

    @ObfuscatedName("ga.l")
    public static class125 field2904 = new class125(64);

    @ObfuscatedName("ga.y")
    public static class125 field2905 = new class125(500);

    @ObfuscatedName("ga.j")
    public static class125 field2912 = new class125(30);

    @ObfuscatedName("ga.g")
    public static class125 field2907 = new class125(30);

    @ObfuscatedName("ga.s")
    public static class77[] field2908 = new class77[4];

    @ObfuscatedName("ga.r")
    public int field2935;

    @ObfuscatedName("ga.t")
    public int[] field2910;

    @ObfuscatedName("ga.k")
    public int[] field2911;

    @ObfuscatedName("ga.f")
    public String field2922 = "null";

    @ObfuscatedName("ga.a")
    public short[] field2913;

    @ObfuscatedName("ga.v")
    public short[] field2914;

    @ObfuscatedName("ga.d")
    public short[] field2915;

    @ObfuscatedName("ga.o")
    public short[] field2916;

    @ObfuscatedName("ga.q")
    public int field2903 = 1;

    @ObfuscatedName("ga.i")
    public int field2918 = 1;

    @ObfuscatedName("ga.x")
    public int field2919 = 2;

    @ObfuscatedName("ga.z")
    public boolean field2920 = true;

    @ObfuscatedName("ga.n")
    public int field2928 = -1;

    @ObfuscatedName("ga.w")
    public int field2950 = -1;

    @ObfuscatedName("ga.h")
    public boolean field2923 = false;

    @ObfuscatedName("ga.u")
    public boolean field2924 = false;

    @ObfuscatedName("ga.m")
    public int field2925 = -1;

    @ObfuscatedName("ga.p")
    public int field2926 = 16;

    @ObfuscatedName("ga.aq")
    public int field2934 = 0;

    @ObfuscatedName("ga.aj")
    public int field2902 = 0;

    @ObfuscatedName("ga.ae")
    public String[] field2929 = new String[5];

    @ObfuscatedName("ga.au")
    public int field2930 = -1;

    @ObfuscatedName("ga.aa")
    public int field2931 = -1;

    @ObfuscatedName("ga.af")
    public boolean field2946 = false;

    @ObfuscatedName("ga.at")
    public boolean field2933 = true;

    @ObfuscatedName("ga.ap")
    public int field2938 = 128;

    @ObfuscatedName("ga.aw")
    public int field2927 = 128;

    @ObfuscatedName("ga.ah")
    public int field2936 = 128;

    @ObfuscatedName("ga.ao")
    public int field2937 = 0;

    @ObfuscatedName("ga.ag")
    public int field2906 = 0;

    @ObfuscatedName("ga.az")
    public int field2939 = 0;

    @ObfuscatedName("ga.ai")
    public boolean field2940 = false;

    @ObfuscatedName("ga.as")
    public boolean field2941 = false;

    @ObfuscatedName("ga.ak")
    public int field2932 = -1;

    @ObfuscatedName("ga.an")
    public int[] field2943;

    @ObfuscatedName("ga.av")
    public int field2942 = -1;

    @ObfuscatedName("ga.ab")
    public int field2945 = -1;

    @ObfuscatedName("ga.ay")
    public int field2909 = -1;

    @ObfuscatedName("ga.am")
    public int field2947 = 0;

    @ObfuscatedName("ga.ar")
    public int field2917 = 0;

    @ObfuscatedName("ga.ad")
    public int field2949 = 0;

    @ObfuscatedName("ga.ax")
    public int[] field2944;

    @ObfuscatedName("cu.b(IB)Lga;")
    public static class198 method1865(int arg0) {
        class198 var1 = (class198) field2904.method2246((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2112.method3126(6, arg0);
        class198 var3 = new class198();
        var3.field2935 = arg0;
        if (var2 != null) {
            var3.method3437(new class154(var2));
        }
        var3.method3474();
        if (var3.field2941) {
            var3.field2919 = 0;
            var3.field2920 = false;
        }
        field2904.method2250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ga.e(I)V")
    public void method3474() {
        if (this.field2928 == -1) {
            this.field2928 = 0;
            if (this.field2910 != null && (this.field2911 == null || this.field2911[0] == 10)) {
                this.field2928 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2929[var1] != null) {
                    this.field2928 = 1;
                }
            }
        }
        if (this.field2932 == -1) {
            this.field2932 = this.field2919 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ga.c(Lec;I)V")
    public void method3437(class154 arg0) {
        while (true) {
            int var2 = arg0.method2669();
            if (var2 == 0) {
                return;
            }
            this.method3438(arg0, var2);
        }
    }

    @ObfuscatedName("ga.l(Lec;II)V")
    public void method3438(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2669();
            if (var3 > 0) {
                if (this.field2910 == null || field2948) {
                    this.field2911 = new int[var3];
                    this.field2910 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2910[var4] = arg0.method2671();
                        this.field2911[var4] = arg0.method2669();
                    }
                } else {
                    arg0.field2079 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2922 = arg0.method2677();
        } else if (arg1 == 5) {
            int var5 = arg0.method2669();
            if (var5 > 0) {
                if (this.field2910 == null || field2948) {
                    this.field2911 = null;
                    this.field2910 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2910[var6] = arg0.method2671();
                    }
                } else {
                    arg0.field2079 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2903 = arg0.method2669();
        } else if (arg1 == 15) {
            this.field2918 = arg0.method2669();
        } else if (arg1 == 17) {
            this.field2919 = 0;
            this.field2920 = false;
        } else if (arg1 == 18) {
            this.field2920 = false;
        } else if (arg1 == 19) {
            this.field2928 = arg0.method2669();
        } else if (arg1 == 21) {
            this.field2950 = 0;
        } else if (arg1 == 22) {
            this.field2923 = true;
        } else if (arg1 == 23) {
            this.field2924 = true;
        } else if (arg1 == 24) {
            this.field2925 = arg0.method2671();
            if (this.field2925 == 65535) {
                this.field2925 = -1;
            }
        } else if (arg1 == 27) {
            this.field2919 = 1;
        } else if (arg1 == 28) {
            this.field2926 = arg0.method2669();
        } else if (arg1 == 29) {
            this.field2934 = arg0.method2670();
        } else if (arg1 == 39) {
            this.field2902 = arg0.method2670() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2929[arg1 - 30] = arg0.method2677();
            if (this.field2929[arg1 - 30].equalsIgnoreCase(class174.field2467)) {
                this.field2929[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2669();
            this.field2913 = new short[var7];
            this.field2914 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2913[var8] = (short) arg0.method2671();
                this.field2914[var8] = (short) arg0.method2671();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2669();
            this.field2915 = new short[var9];
            this.field2916 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2915[var10] = (short) arg0.method2671();
                this.field2916[var10] = (short) arg0.method2671();
            }
        } else if (arg1 == 60) {
            this.field2930 = arg0.method2671();
        } else if (arg1 == 62) {
            this.field2946 = true;
        } else if (arg1 == 64) {
            this.field2933 = false;
        } else if (arg1 == 65) {
            this.field2938 = arg0.method2671();
        } else if (arg1 == 66) {
            this.field2927 = arg0.method2671();
        } else if (arg1 == 67) {
            this.field2936 = arg0.method2671();
        } else if (arg1 == 68) {
            this.field2931 = arg0.method2671();
        } else if (arg1 == 69) {
            arg0.method2669();
        } else if (arg1 == 70) {
            this.field2937 = arg0.method2699();
        } else if (arg1 == 71) {
            this.field2906 = arg0.method2699();
        } else if (arg1 == 72) {
            this.field2939 = arg0.method2699();
        } else if (arg1 == 73) {
            this.field2940 = true;
        } else if (arg1 == 74) {
            this.field2941 = true;
        } else if (arg1 == 75) {
            this.field2932 = arg0.method2669();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2942 = arg0.method2671();
            if (this.field2942 == 65535) {
                this.field2942 = -1;
            }
            this.field2945 = arg0.method2671();
            if (this.field2945 == 65535) {
                this.field2945 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2671();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2669();
            this.field2943 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2943[var15] = arg0.method2671();
                if (this.field2943[var15] == 65535) {
                    this.field2943[var15] = -1;
                }
            }
            this.field2943[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2909 = arg0.method2671();
            this.field2947 = arg0.method2669();
        } else if (arg1 == 79) {
            this.field2917 = arg0.method2671();
            this.field2949 = arg0.method2671();
            this.field2947 = arg0.method2669();
            int var11 = arg0.method2669();
            this.field2944 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2944[var12] = arg0.method2671();
            }
        } else if (arg1 == 81) {
            this.field2950 = arg0.method2669() * 256;
        }
    }

    @ObfuscatedName("ga.y(IB)Z")
    public final boolean method3439(int arg0) {
        if (this.field2911 != null) {
            for (int var4 = 0; var4 < this.field2911.length; var4++) {
                if (this.field2911[var4] == arg0) {
                    return Statics.field2921.method3202(this.field2910[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2910 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2910.length; var3++) {
                var2 &= Statics.field2921.method3202(this.field2910[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ga.j(B)Z")
    public final boolean method3480() {
        if (this.field2910 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2910.length; var2++) {
            var1 &= Statics.field2921.method3202(this.field2910[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ga.t(II[[IIIII)Lcq;")
    public final class90 method3441(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2911 == null) {
            var7 = (long) ((this.field2935 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2935 << 10) + (arg0 << 3) + arg1);
        }
        class90 var9 = (class90) field2912.method2246(var7);
        if (var9 == null) {
            class77 var10 = this.method3444(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2923) {
                var10.field1234 = (short) (this.field2934 + 64);
                var10.field1265 = (short) (this.field2902 + 768);
                var10.method1479();
                var9 = var10;
            } else {
                var9 = var10.method1457(this.field2934 + 64, this.field2902 + 768, -50, -10, -50);
            }
            field2912.method2250(var9, var7);
        }
        if (this.field2923) {
            var9 = ((class77) var9).method1414();
        }
        if (this.field2950 >= 0) {
            if (var9 instanceof class83) {
                var9 = ((class83) var9).method1501(arg2, arg3, arg4, arg5, true, this.field2950);
            } else if (var9 instanceof class77) {
                var9 = ((class77) var9).method1472(arg2, arg3, arg4, arg5, true, this.field2950);
            }
        }
        return var9;
    }

    @ObfuscatedName("ga.k(II[[IIIII)Lco;")
    public final class83 method3465(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2911 == null) {
            var7 = (long) ((this.field2935 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2935 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field2907.method2246(var7);
        if (var9 == null) {
            class77 var10 = this.method3444(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1457(this.field2934 + 64, this.field2902 + 768, -50, -10, -50);
            field2907.method2250(var9, var7);
        }
        if (this.field2950 >= 0) {
            var9 = var9.method1501(arg2, arg3, arg4, arg5, true, this.field2950);
        }
        return var9;
    }

    @ObfuscatedName("ga.f(II[[IIIILgn;II)Lco;")
    public final class83 method3468(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class202 arg6, int arg7) {
        long var9;
        if (this.field2911 == null) {
            var9 = (long) ((this.field2935 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2935 << 10) + (arg0 << 3) + arg1);
        }
        class83 var11 = (class83) field2907.method2246(var9);
        if (var11 == null) {
            class77 var12 = this.method3444(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1457(this.field2934 + 64, this.field2902 + 768, -50, -10, -50);
            field2907.method2250(var11, var9);
        }
        if (arg6 == null && this.field2950 == -1) {
            return var11;
        }
        class83 var13;
        if (arg6 == null) {
            var13 = var11.method1502(true);
        } else {
            var13 = arg6.method3581(var11, arg7, arg1);
        }
        if (this.field2950 >= 0) {
            var13 = var13.method1501(arg2, arg3, arg4, arg5, false, this.field2950);
        }
        return var13;
    }

    @ObfuscatedName("ga.a(III)Lbr;")
    public final class77 method3444(int arg0, int arg1) {
        class77 var3 = null;
        if (this.field2911 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2910 == null) {
                return null;
            }
            boolean var4 = this.field2946;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2910.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2910[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class77) field2905.method2246((long) var7);
                if (var3 == null) {
                    var3 = class77.method1409(Statics.field2921, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1437();
                    }
                    field2905.method2250(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2908[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class77(field2908, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2911.length; var9++) {
                if (this.field2911[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2910[var8];
            boolean var11 = this.field2946 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class77) field2905.method2246((long) var10);
            if (var3 == null) {
                var3 = class77.method1409(Statics.field2921, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1437();
                }
                field2905.method2250(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2938 == 128 && this.field2927 == 128 && this.field2936 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2937 == 0 && this.field2906 == 0 && this.field2939 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class77 var14 = new class77(var3, arg1 == 0 && !var12 && !var13, this.field2913 == null, this.field2915 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1436(256);
            var14.method1421(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1417();
        } else if (var15 == 2) {
            var14.method1418();
        } else if (var15 == 3) {
            var14.method1419();
        }
        if (this.field2913 != null) {
            for (int var16 = 0; var16 < this.field2913.length; var16++) {
                var14.method1480(this.field2913[var16], this.field2914[var16]);
            }
        }
        if (this.field2915 != null) {
            for (int var17 = 0; var17 < this.field2915.length; var17++) {
                var14.method1423(this.field2915[var17], this.field2916[var17]);
            }
        }
        if (var12) {
            var14.method1424(this.field2938, this.field2927, this.field2936);
        }
        if (var13) {
            var14.method1421(this.field2937, this.field2906, this.field2939);
        }
        return var14;
    }

    @ObfuscatedName("ga.v(I)Lga;")
    public final class198 method3445() {
        int var1 = -1;
        if (this.field2942 != -1) {
            var1 = class166.method916(this.field2942);
        } else if (this.field2945 != -1) {
            var1 = class166.field2158[this.field2945];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2943.length - 1) {
            var2 = this.field2943[var1];
        } else {
            var2 = this.field2943[this.field2943.length - 1];
        }
        return var2 == -1 ? null : method1865(var2);
    }

    @ObfuscatedName("z.d(I)V")
    public static void method214() {
        field2904.method2249();
        field2905.method2249();
        field2912.method2249();
        field2907.method2249();
    }

    @ObfuscatedName("ga.o(I)Z")
    public boolean method3446() {
        if (this.field2943 == null) {
            return this.field2909 != -1 || this.field2944 != null;
        }
        for (int var1 = 0; var1 < this.field2943.length; var1++) {
            if (this.field2943[var1] != -1) {
                class198 var2 = method1865(this.field2943[var1]);
                if (var2.field2909 != -1 || var2.field2944 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
