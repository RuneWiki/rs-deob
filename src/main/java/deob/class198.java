package deob;

@ObfuscatedName("gg")
public class class198 extends class130 {

    @ObfuscatedName("gg.o")
    public static boolean field2892 = false;

    @ObfuscatedName("gg.g")
    public static class125 field2893 = new class125(64);

    @ObfuscatedName("gg.h")
    public static class125 field2913 = new class125(500);

    @ObfuscatedName("gg.v")
    public static class125 field2895 = new class125(30);

    @ObfuscatedName("gg.l")
    public static class125 field2917 = new class125(30);

    @ObfuscatedName("gg.c")
    public static class77[] field2897 = new class77[4];

    @ObfuscatedName("gg.u")
    public int field2898;

    @ObfuscatedName("gg.k")
    public int[] field2938;

    @ObfuscatedName("gg.z")
    public int[] field2909;

    @ObfuscatedName("gg.y")
    public String field2901 = "null";

    @ObfuscatedName("gg.j")
    public short[] field2914;

    @ObfuscatedName("gg.f")
    public short[] field2902;

    @ObfuscatedName("gg.p")
    public short[] field2904;

    @ObfuscatedName("gg.i")
    public short[] field2905;

    @ObfuscatedName("gg.s")
    public int field2906 = 1;

    @ObfuscatedName("gg.x")
    public int field2939 = 1;

    @ObfuscatedName("gg.d")
    public int field2908 = 2;

    @ObfuscatedName("gg.w")
    public boolean field2919 = true;

    @ObfuscatedName("gg.n")
    public int field2910 = -1;

    @ObfuscatedName("gg.q")
    public int field2911 = -1;

    @ObfuscatedName("gg.t")
    public boolean field2912 = false;

    @ObfuscatedName("gg.r")
    public boolean field2891 = false;

    @ObfuscatedName("gg.a")
    public int field2907 = -1;

    @ObfuscatedName("gg.e")
    public int field2915 = 16;

    @ObfuscatedName("gg.am")
    public int field2916 = 0;

    @ObfuscatedName("gg.ag")
    public int field2896 = 0;

    @ObfuscatedName("gg.au")
    public String[] field2918 = new String[5];

    @ObfuscatedName("gg.aa")
    public int field2936 = -1;

    @ObfuscatedName("gg.ae")
    public int field2920 = -1;

    @ObfuscatedName("gg.av")
    public boolean field2921 = false;

    @ObfuscatedName("gg.ao")
    public boolean field2922 = true;

    @ObfuscatedName("gg.ah")
    public int field2903 = 128;

    @ObfuscatedName("gg.ak")
    public int field2923 = 128;

    @ObfuscatedName("gg.ab")
    public int field2925 = 128;

    @ObfuscatedName("gg.ay")
    public int field2926 = 0;

    @ObfuscatedName("gg.an")
    public int field2900 = 0;

    @ObfuscatedName("gg.aw")
    public int field2928 = 0;

    @ObfuscatedName("gg.af")
    public boolean field2929 = false;

    @ObfuscatedName("gg.ac")
    public boolean field2930 = false;

    @ObfuscatedName("gg.ar")
    public int field2931 = -1;

    @ObfuscatedName("gg.at")
    public int[] field2932;

    @ObfuscatedName("gg.al")
    public int field2933 = -1;

    @ObfuscatedName("gg.ax")
    public int field2934 = -1;

    @ObfuscatedName("gg.az")
    public int field2935 = -1;

    @ObfuscatedName("gg.ai")
    public int field2899 = 0;

    @ObfuscatedName("gg.ap")
    public int field2937 = 0;

    @ObfuscatedName("gg.aj")
    public int field2894 = 0;

    @ObfuscatedName("gg.aq")
    public int[] field2924;

    @ObfuscatedName("et.o(II)Lgg;")
    public static class198 method2463(int arg0) {
        class198 var1 = (class198) field2893.method2130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2927.method3012(6, arg0);
        class198 var3 = new class198();
        var3.field2898 = arg0;
        if (var2 != null) {
            var3.method3315(new class154(var2));
        }
        var3.method3314();
        if (var3.field2930) {
            var3.field2908 = 0;
            var3.field2919 = false;
        }
        field2893.method2132(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gg.m(I)V")
    public void method3314() {
        if (this.field2910 == -1) {
            this.field2910 = 0;
            if (this.field2938 != null && (this.field2909 == null || this.field2909[0] == 10)) {
                this.field2910 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2918[var1] != null) {
                    this.field2910 = 1;
                }
            }
        }
        if (this.field2931 == -1) {
            this.field2931 = this.field2908 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gg.b(Lez;B)V")
    public void method3315(class154 arg0) {
        while (true) {
            int var2 = arg0.method2552();
            if (var2 == 0) {
                return;
            }
            this.method3340(arg0, var2);
        }
    }

    @ObfuscatedName("gg.g(Lez;II)V")
    public void method3340(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2552();
            if (var3 > 0) {
                if (this.field2938 == null || field2892) {
                    this.field2909 = new int[var3];
                    this.field2938 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2938[var4] = arg0.method2554();
                        this.field2909[var4] = arg0.method2552();
                    }
                } else {
                    arg0.field2105 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2901 = arg0.method2606();
        } else if (arg1 == 5) {
            int var5 = arg0.method2552();
            if (var5 > 0) {
                if (this.field2938 == null || field2892) {
                    this.field2909 = null;
                    this.field2938 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2938[var6] = arg0.method2554();
                    }
                } else {
                    arg0.field2105 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2906 = arg0.method2552();
        } else if (arg1 == 15) {
            this.field2939 = arg0.method2552();
        } else if (arg1 == 17) {
            this.field2908 = 0;
            this.field2919 = false;
        } else if (arg1 == 18) {
            this.field2919 = false;
        } else if (arg1 == 19) {
            this.field2910 = arg0.method2552();
        } else if (arg1 == 21) {
            this.field2911 = 0;
        } else if (arg1 == 22) {
            this.field2912 = true;
        } else if (arg1 == 23) {
            this.field2891 = true;
        } else if (arg1 == 24) {
            this.field2907 = arg0.method2554();
            if (this.field2907 == 65535) {
                this.field2907 = -1;
            }
        } else if (arg1 == 27) {
            this.field2908 = 1;
        } else if (arg1 == 28) {
            this.field2915 = arg0.method2552();
        } else if (arg1 == 29) {
            this.field2916 = arg0.method2553();
        } else if (arg1 == 39) {
            this.field2896 = arg0.method2553() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2918[arg1 - 30] = arg0.method2606();
            if (this.field2918[arg1 - 30].equalsIgnoreCase(class174.field2364)) {
                this.field2918[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2552();
            this.field2914 = new short[var7];
            this.field2902 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2914[var8] = (short) arg0.method2554();
                this.field2902[var8] = (short) arg0.method2554();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2552();
            this.field2904 = new short[var9];
            this.field2905 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2904[var10] = (short) arg0.method2554();
                this.field2905[var10] = (short) arg0.method2554();
            }
        } else if (arg1 == 60) {
            this.field2936 = arg0.method2554();
        } else if (arg1 == 62) {
            this.field2921 = true;
        } else if (arg1 == 64) {
            this.field2922 = false;
        } else if (arg1 == 65) {
            this.field2903 = arg0.method2554();
        } else if (arg1 == 66) {
            this.field2923 = arg0.method2554();
        } else if (arg1 == 67) {
            this.field2925 = arg0.method2554();
        } else if (arg1 == 68) {
            this.field2920 = arg0.method2554();
        } else if (arg1 == 69) {
            arg0.method2552();
        } else if (arg1 == 70) {
            this.field2926 = arg0.method2555();
        } else if (arg1 == 71) {
            this.field2900 = arg0.method2555();
        } else if (arg1 == 72) {
            this.field2928 = arg0.method2555();
        } else if (arg1 == 73) {
            this.field2929 = true;
        } else if (arg1 == 74) {
            this.field2930 = true;
        } else if (arg1 == 75) {
            this.field2931 = arg0.method2552();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2933 = arg0.method2554();
            if (this.field2933 == 65535) {
                this.field2933 = -1;
            }
            this.field2934 = arg0.method2554();
            if (this.field2934 == 65535) {
                this.field2934 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2554();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2552();
            this.field2932 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2932[var15] = arg0.method2554();
                if (this.field2932[var15] == 65535) {
                    this.field2932[var15] = -1;
                }
            }
            this.field2932[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2935 = arg0.method2554();
            this.field2899 = arg0.method2552();
        } else if (arg1 == 79) {
            this.field2937 = arg0.method2554();
            this.field2894 = arg0.method2554();
            this.field2899 = arg0.method2552();
            int var11 = arg0.method2552();
            this.field2924 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2924[var12] = arg0.method2554();
            }
        } else if (arg1 == 81) {
            this.field2911 = arg0.method2552() * 256;
        }
    }

    @ObfuscatedName("gg.l(IB)Z")
    public final boolean method3321(int arg0) {
        if (this.field2909 != null) {
            for (int var4 = 0; var4 < this.field2909.length; var4++) {
                if (this.field2909[var4] == arg0) {
                    return Statics.field3071.method3014(this.field2938[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2938 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2938.length; var3++) {
                var2 &= Statics.field3071.method3014(this.field2938[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gg.c(I)Z")
    public final boolean method3318() {
        if (this.field2938 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2938.length; var2++) {
            var1 &= Statics.field3071.method3014(this.field2938[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gg.u(II[[IIIII)Lck;")
    public final class90 method3319(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2909 == null) {
            var7 = (long) ((this.field2898 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2898 << 10) + (arg0 << 3) + arg1);
        }
        class90 var9 = (class90) field2895.method2130(var7);
        if (var9 == null) {
            class77 var10 = this.method3322(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2912) {
                var10.field1254 = (short) (this.field2916 + 64);
                var10.field1260 = (short) (this.field2896 + 768);
                var10.method1381();
                var9 = var10;
            } else {
                var9 = var10.method1389(this.field2916 + 64, this.field2896 + 768, -50, -10, -50);
            }
            field2895.method2132(var9, var7);
        }
        if (this.field2912) {
            var9 = ((class77) var9).method1364();
        }
        if (this.field2911 >= 0) {
            if (var9 instanceof class83) {
                var9 = ((class83) var9).method1446(arg2, arg3, arg4, arg5, true, this.field2911);
            } else if (var9 instanceof class77) {
                var9 = ((class77) var9).method1405(arg2, arg3, arg4, arg5, true, this.field2911);
            }
        }
        return var9;
    }

    @ObfuscatedName("gg.k(II[[IIIII)Lcy;")
    public final class83 method3327(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2909 == null) {
            var7 = (long) ((this.field2898 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2898 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field2917.method2130(var7);
        if (var9 == null) {
            class77 var10 = this.method3322(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1389(this.field2916 + 64, this.field2896 + 768, -50, -10, -50);
            field2917.method2132(var9, var7);
        }
        if (this.field2911 >= 0) {
            var9 = var9.method1446(arg2, arg3, arg4, arg5, true, this.field2911);
        }
        return var9;
    }

    @ObfuscatedName("gg.z(II[[IIIILgf;II)Lcy;")
    public final class83 method3316(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class202 arg6, int arg7) {
        long var9;
        if (this.field2909 == null) {
            var9 = (long) ((this.field2898 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2898 << 10) + (arg0 << 3) + arg1);
        }
        class83 var11 = (class83) field2917.method2130(var9);
        if (var11 == null) {
            class77 var12 = this.method3322(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1389(this.field2916 + 64, this.field2896 + 768, -50, -10, -50);
            field2917.method2132(var11, var9);
        }
        if (arg6 == null && this.field2911 == -1) {
            return var11;
        }
        class83 var13;
        if (arg6 == null) {
            var13 = var11.method1458(true);
        } else {
            var13 = arg6.method3467(var11, arg7, arg1);
        }
        if (this.field2911 >= 0) {
            var13 = var13.method1446(arg2, arg3, arg4, arg5, false, this.field2911);
        }
        return var13;
    }

    @ObfuscatedName("gg.y(IIB)Lbg;")
    public final class77 method3322(int arg0, int arg1) {
        class77 var3 = null;
        if (this.field2909 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2938 == null) {
                return null;
            }
            boolean var4 = this.field2921;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2938.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2938[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class77) field2913.method2130((long) var7);
                if (var3 == null) {
                    var3 = class77.method1358(Statics.field3071, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1374();
                    }
                    field2913.method2132(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2897[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class77(field2897, var5);
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
            int var10 = this.field2938[var8];
            boolean var11 = this.field2921 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class77) field2913.method2130((long) var10);
            if (var3 == null) {
                var3 = class77.method1358(Statics.field3071, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1374();
                }
                field2913.method2132(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2903 == 128 && this.field2923 == 128 && this.field2925 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2926 == 0 && this.field2900 == 0 && this.field2928 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class77 var14 = new class77(var3, arg1 == 0 && !var12 && !var13, this.field2914 == null, this.field2904 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1370(256);
            var14.method1371(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1367();
        } else if (var15 == 2) {
            var14.method1368();
        } else if (var15 == 3) {
            var14.method1369();
        }
        if (this.field2914 != null) {
            for (int var16 = 0; var16 < this.field2914.length; var16++) {
                var14.method1372(this.field2914[var16], this.field2902[var16]);
            }
        }
        if (this.field2904 != null) {
            for (int var17 = 0; var17 < this.field2904.length; var17++) {
                var14.method1373(this.field2904[var17], this.field2905[var17]);
            }
        }
        if (var12) {
            var14.method1422(this.field2903, this.field2923, this.field2925);
        }
        if (var13) {
            var14.method1371(this.field2926, this.field2900, this.field2928);
        }
        return var14;
    }

    @ObfuscatedName("gg.j(I)Lgg;")
    public final class198 method3323() {
        int var1 = -1;
        if (this.field2933 != -1) {
            var1 = class166.method162(this.field2933);
        } else if (this.field2934 != -1) {
            var1 = class166.field2174[this.field2934];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2932.length - 1) {
            var2 = this.field2932[var1];
        } else {
            var2 = this.field2932[this.field2932.length - 1];
        }
        return var2 == -1 ? null : method2463(var2);
    }

    @ObfuscatedName("gg.f(I)Z")
    public boolean method3324() {
        if (this.field2932 == null) {
            return this.field2935 != -1 || this.field2924 != null;
        }
        for (int var1 = 0; var1 < this.field2932.length; var1++) {
            if (this.field2932[var1] != -1) {
                class198 var2 = method2463(this.field2932[var1]);
                if (var2.field2935 != -1 || var2.field2924 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
