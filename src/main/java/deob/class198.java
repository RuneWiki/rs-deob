package deob;

@ObfuscatedName("gk")
public class class198 extends class130 {

    @ObfuscatedName("gk.p")
    public static boolean field2891 = false;

    @ObfuscatedName("gk.q")
    public static class125 field2929 = new class125(64);

    @ObfuscatedName("gk.d")
    public static class125 field2914 = new class125(500);

    @ObfuscatedName("gk.k")
    public static class125 field2931 = new class125(30);

    @ObfuscatedName("gk.j")
    public static class125 field2895 = new class125(30);

    @ObfuscatedName("gk.s")
    public static class77[] field2933 = new class77[4];

    @ObfuscatedName("gk.o")
    public int field2897;

    @ObfuscatedName("gk.a")
    public int[] field2898;

    @ObfuscatedName("gk.c")
    public int[] field2899;

    @ObfuscatedName("gk.m")
    public String field2900 = "null";

    @ObfuscatedName("gk.h")
    public short[] field2908;

    @ObfuscatedName("gk.r")
    public short[] field2902;

    @ObfuscatedName("gk.u")
    public short[] field2937;

    @ObfuscatedName("gk.i")
    public short[] field2904;

    @ObfuscatedName("gk.z")
    public int field2917 = 1;

    @ObfuscatedName("gk.n")
    public int field2906 = 1;

    @ObfuscatedName("gk.w")
    public int field2907 = 2;

    @ObfuscatedName("gk.y")
    public boolean field2935 = true;

    @ObfuscatedName("gk.v")
    public int field2909 = -1;

    @ObfuscatedName("gk.f")
    public int field2910 = -1;

    @ObfuscatedName("gk.l")
    public boolean field2923 = false;

    @ObfuscatedName("gk.t")
    public boolean field2893 = false;

    @ObfuscatedName("gk.b")
    public int field2913 = -1;

    @ObfuscatedName("gk.e")
    public int field2936 = 16;

    @ObfuscatedName("gk.ai")
    public int field2915 = 0;

    @ObfuscatedName("gk.am")
    public int field2916 = 0;

    @ObfuscatedName("gk.ad")
    public String[] field2892 = new String[5];

    @ObfuscatedName("gk.ah")
    public int field2918 = -1;

    @ObfuscatedName("gk.aj")
    public int field2919 = -1;

    @ObfuscatedName("gk.ax")
    public boolean field2920 = false;

    @ObfuscatedName("gk.ak")
    public boolean field2921 = true;

    @ObfuscatedName("gk.ar")
    public int field2922 = 128;

    @ObfuscatedName("gk.aw")
    public int field2894 = 128;

    @ObfuscatedName("gk.ay")
    public int field2924 = 128;

    @ObfuscatedName("gk.af")
    public int field2925 = 0;

    @ObfuscatedName("gk.av")
    public int field2926 = 0;

    @ObfuscatedName("gk.aa")
    public int field2927 = 0;

    @ObfuscatedName("gk.ag")
    public boolean field2928 = false;

    @ObfuscatedName("gk.ao")
    public boolean field2901 = false;

    @ObfuscatedName("gk.ab")
    public int field2930 = -1;

    @ObfuscatedName("gk.an")
    public int[] field2896;

    @ObfuscatedName("gk.ac")
    public int field2932 = -1;

    @ObfuscatedName("gk.al")
    public int field2903 = -1;

    @ObfuscatedName("gk.ae")
    public int field2934 = -1;

    @ObfuscatedName("gk.ap")
    public int field2911 = 0;

    @ObfuscatedName("gk.au")
    public int field2889 = 0;

    @ObfuscatedName("gk.aq")
    public int field2912 = 0;

    @ObfuscatedName("gk.at")
    public int[] field2938;

    @ObfuscatedName("hf.p(II)Lgk;")
    public static class198 method3716(int arg0) {
        class198 var1 = (class198) field2929.method2169((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2890.method3044(6, arg0);
        class198 var3 = new class198();
        var3.field2897 = arg0;
        if (var2 != null) {
            var3.method3349(new class154(var2));
        }
        var3.method3348();
        if (var3.field2901) {
            var3.field2907 = 0;
            var3.field2935 = false;
        }
        field2929.method2174(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gk.g(B)V")
    public void method3348() {
        if (this.field2909 == -1) {
            this.field2909 = 0;
            if (this.field2898 != null && (this.field2899 == null || this.field2899[0] == 10)) {
                this.field2909 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2892[var1] != null) {
                    this.field2909 = 1;
                }
            }
        }
        if (this.field2930 == -1) {
            this.field2930 = this.field2907 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gk.x(Lev;B)V")
    public void method3349(class154 arg0) {
        while (true) {
            int var2 = arg0.method2593();
            if (var2 == 0) {
                return;
            }
            this.method3356(arg0, var2);
        }
    }

    @ObfuscatedName("gk.q(Lev;IB)V")
    public void method3356(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2593();
            if (var3 > 0) {
                if (this.field2898 == null || field2891) {
                    this.field2899 = new int[var3];
                    this.field2898 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2898[var4] = arg0.method2595();
                        this.field2899[var4] = arg0.method2593();
                    }
                } else {
                    arg0.field2098 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2900 = arg0.method2625();
        } else if (arg1 == 5) {
            int var5 = arg0.method2593();
            if (var5 > 0) {
                if (this.field2898 == null || field2891) {
                    this.field2899 = null;
                    this.field2898 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2898[var6] = arg0.method2595();
                    }
                } else {
                    arg0.field2098 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2917 = arg0.method2593();
        } else if (arg1 == 15) {
            this.field2906 = arg0.method2593();
        } else if (arg1 == 17) {
            this.field2907 = 0;
            this.field2935 = false;
        } else if (arg1 == 18) {
            this.field2935 = false;
        } else if (arg1 == 19) {
            this.field2909 = arg0.method2593();
        } else if (arg1 == 21) {
            this.field2910 = 0;
        } else if (arg1 == 22) {
            this.field2923 = true;
        } else if (arg1 == 23) {
            this.field2893 = true;
        } else if (arg1 == 24) {
            this.field2913 = arg0.method2595();
            if (this.field2913 == 65535) {
                this.field2913 = -1;
            }
        } else if (arg1 == 27) {
            this.field2907 = 1;
        } else if (arg1 == 28) {
            this.field2936 = arg0.method2593();
        } else if (arg1 == 29) {
            this.field2915 = arg0.method2631();
        } else if (arg1 == 39) {
            this.field2916 = arg0.method2631() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2892[arg1 - 30] = arg0.method2625();
            if (this.field2892[arg1 - 30].equalsIgnoreCase(class174.field2443)) {
                this.field2892[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2593();
            this.field2908 = new short[var7];
            this.field2902 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2908[var8] = (short) arg0.method2595();
                this.field2902[var8] = (short) arg0.method2595();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2593();
            this.field2937 = new short[var9];
            this.field2904 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2937[var10] = (short) arg0.method2595();
                this.field2904[var10] = (short) arg0.method2595();
            }
        } else if (arg1 == 60) {
            this.field2918 = arg0.method2595();
        } else if (arg1 == 62) {
            this.field2920 = true;
        } else if (arg1 == 64) {
            this.field2921 = false;
        } else if (arg1 == 65) {
            this.field2922 = arg0.method2595();
        } else if (arg1 == 66) {
            this.field2894 = arg0.method2595();
        } else if (arg1 == 67) {
            this.field2924 = arg0.method2595();
        } else if (arg1 == 68) {
            this.field2919 = arg0.method2595();
        } else if (arg1 == 69) {
            arg0.method2593();
        } else if (arg1 == 70) {
            this.field2925 = arg0.method2739();
        } else if (arg1 == 71) {
            this.field2926 = arg0.method2739();
        } else if (arg1 == 72) {
            this.field2927 = arg0.method2739();
        } else if (arg1 == 73) {
            this.field2928 = true;
        } else if (arg1 == 74) {
            this.field2901 = true;
        } else if (arg1 == 75) {
            this.field2930 = arg0.method2593();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2932 = arg0.method2595();
            if (this.field2932 == 65535) {
                this.field2932 = -1;
            }
            this.field2903 = arg0.method2595();
            if (this.field2903 == 65535) {
                this.field2903 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2595();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2593();
            this.field2896 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2896[var15] = arg0.method2595();
                if (this.field2896[var15] == 65535) {
                    this.field2896[var15] = -1;
                }
            }
            this.field2896[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2934 = arg0.method2595();
            this.field2911 = arg0.method2593();
        } else if (arg1 == 79) {
            this.field2889 = arg0.method2595();
            this.field2912 = arg0.method2595();
            this.field2911 = arg0.method2593();
            int var11 = arg0.method2593();
            this.field2938 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2938[var12] = arg0.method2595();
            }
        } else if (arg1 == 81) {
            this.field2910 = arg0.method2593() * 256;
        }
    }

    @ObfuscatedName("gk.d(II)Z")
    public final boolean method3351(int arg0) {
        if (this.field2899 != null) {
            for (int var4 = 0; var4 < this.field2899.length; var4++) {
                if (this.field2899[var4] == arg0) {
                    return Statics.field2905.method3085(this.field2898[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2898 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2898.length; var3++) {
                var2 &= Statics.field2905.method3085(this.field2898[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gk.k(I)Z")
    public final boolean method3352() {
        if (this.field2898 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2898.length; var2++) {
            var1 &= Statics.field2905.method3085(this.field2898[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gk.j(II[[IIIII)Lch;")
    public final class90 method3392(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2899 == null) {
            var7 = (long) ((this.field2897 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2897 << 10) + (arg0 << 3) + arg1);
        }
        class90 var9 = (class90) field2931.method2169(var7);
        if (var9 == null) {
            class77 var10 = this.method3387(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2923) {
                var10.field1255 = (short) (this.field2915 + 64);
                var10.field1256 = (short) (this.field2916 + 768);
                var10.method1377();
                var9 = var10;
            } else {
                var9 = var10.method1381(this.field2915 + 64, this.field2916 + 768, -50, -10, -50);
            }
            field2931.method2174(var9, var7);
        }
        if (this.field2923) {
            var9 = ((class77) var9).method1366();
        }
        if (this.field2910 >= 0) {
            if (var9 instanceof class83) {
                var9 = ((class83) var9).method1456(arg2, arg3, arg4, arg5, true, this.field2910);
            } else if (var9 instanceof class77) {
                var9 = ((class77) var9).method1367(arg2, arg3, arg4, arg5, true, this.field2910);
            }
        }
        return var9;
    }

    @ObfuscatedName("gk.s(II[[IIIII)Lcw;")
    public final class83 method3361(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2899 == null) {
            var7 = (long) ((this.field2897 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2897 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field2895.method2169(var7);
        if (var9 == null) {
            class77 var10 = this.method3387(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1381(this.field2915 + 64, this.field2916 + 768, -50, -10, -50);
            field2895.method2174(var9, var7);
        }
        if (this.field2910 >= 0) {
            var9 = var9.method1456(arg2, arg3, arg4, arg5, true, this.field2910);
        }
        return var9;
    }

    @ObfuscatedName("gk.o(II[[IIIILgu;II)Lcw;")
    public final class83 method3355(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class202 arg6, int arg7) {
        long var9;
        if (this.field2899 == null) {
            var9 = (long) ((this.field2897 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2897 << 10) + (arg0 << 3) + arg1);
        }
        class83 var11 = (class83) field2895.method2169(var9);
        if (var11 == null) {
            class77 var12 = this.method3387(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1381(this.field2915 + 64, this.field2916 + 768, -50, -10, -50);
            field2895.method2174(var11, var9);
        }
        if (arg6 == null && this.field2910 == -1) {
            return var11;
        }
        class83 var13;
        if (arg6 == null) {
            var13 = var11.method1457(true);
        } else {
            var13 = arg6.method3504(var11, arg7, arg1);
        }
        if (this.field2910 >= 0) {
            var13 = var13.method1456(arg2, arg3, arg4, arg5, false, this.field2910);
        }
        return var13;
    }

    @ObfuscatedName("gk.a(IIB)Lbz;")
    public final class77 method3387(int arg0, int arg1) {
        class77 var3 = null;
        if (this.field2899 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2898 == null) {
                return null;
            }
            boolean var4 = this.field2920;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2898.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2898[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class77) field2914.method2169((long) var7);
                if (var3 == null) {
                    var3 = class77.method1361(Statics.field2905, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1375();
                    }
                    field2914.method2174(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2933[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class77(field2933, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2899.length; var9++) {
                if (this.field2899[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2898[var8];
            boolean var11 = this.field2920 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class77) field2914.method2169((long) var10);
            if (var3 == null) {
                var3 = class77.method1361(Statics.field2905, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1375();
                }
                field2914.method2174(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2922 == 128 && this.field2894 == 128 && this.field2924 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2925 == 0 && this.field2926 == 0 && this.field2927 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class77 var14 = new class77(var3, arg1 == 0 && !var12 && !var13, this.field2908 == null, this.field2937 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1368(256);
            var14.method1371(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1369();
        } else if (var15 == 2) {
            var14.method1435();
        } else if (var15 == 3) {
            var14.method1370();
        }
        if (this.field2908 != null) {
            for (int var16 = 0; var16 < this.field2908.length; var16++) {
                var14.method1373(this.field2908[var16], this.field2902[var16]);
            }
        }
        if (this.field2937 != null) {
            for (int var17 = 0; var17 < this.field2937.length; var17++) {
                var14.method1374(this.field2937[var17], this.field2904[var17]);
            }
        }
        if (var12) {
            var14.method1418(this.field2922, this.field2894, this.field2924);
        }
        if (var13) {
            var14.method1371(this.field2925, this.field2926, this.field2927);
        }
        return var14;
    }

    @ObfuscatedName("gk.c(I)Lgk;")
    public final class198 method3357() {
        int var1 = -1;
        if (this.field2932 != -1) {
            var1 = Statics.method115(this.field2932);
        } else if (this.field2903 != -1) {
            var1 = class166.field2159[this.field2903];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2896.length - 1) {
            var2 = this.field2896[var1];
        } else {
            var2 = this.field2896[this.field2896.length - 1];
        }
        return var2 == -1 ? null : method3716(var2);
    }

    @ObfuscatedName("dq.u(I)V")
    public static void method1943() {
        field2929.method2170();
        field2914.method2170();
        field2931.method2170();
        field2895.method2170();
    }

    @ObfuscatedName("gk.i(I)Z")
    public boolean method3391() {
        if (this.field2896 == null) {
            return this.field2934 != -1 || this.field2938 != null;
        }
        for (int var1 = 0; var1 < this.field2896.length; var1++) {
            if (this.field2896[var1] != -1) {
                class198 var2 = method3716(this.field2896[var1]);
                if (var2.field2934 != -1 || var2.field2938 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
