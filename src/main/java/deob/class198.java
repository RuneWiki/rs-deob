package deob;

@ObfuscatedName("gn")
public class class198 extends class130 {

    @ObfuscatedName("gn.f")
    public static boolean field2936 = false;

    @ObfuscatedName("gn.h")
    public static class125 field2929 = new class125(64);

    @ObfuscatedName("gn.r")
    public static class125 field2913 = new class125(500);

    @ObfuscatedName("gn.o")
    public static class125 field2902 = new class125(30);

    @ObfuscatedName("gn.l")
    public static class125 field2903 = new class125(30);

    @ObfuscatedName("gn.n")
    public static class77[] field2904 = new class77[4];

    @ObfuscatedName("gn.m")
    public int field2905;

    @ObfuscatedName("gn.w")
    public int[] field2908;

    @ObfuscatedName("gn.j")
    public int[] field2907;

    @ObfuscatedName("gn.s")
    public String field2932 = "null";

    @ObfuscatedName("gn.q")
    public short[] field2909;

    @ObfuscatedName("gn.d")
    public short[] field2920;

    @ObfuscatedName("gn.p")
    public short[] field2922;

    @ObfuscatedName("gn.y")
    public short[] field2901;

    @ObfuscatedName("gn.a")
    public int field2943 = 1;

    @ObfuscatedName("gn.v")
    public int field2914 = 1;

    @ObfuscatedName("gn.z")
    public int field2915 = 2;

    @ObfuscatedName("gn.x")
    public boolean field2916 = true;

    @ObfuscatedName("gn.g")
    public int field2917 = -1;

    @ObfuscatedName("gn.b")
    public int field2918 = -1;

    @ObfuscatedName("gn.k")
    public boolean field2919 = false;

    @ObfuscatedName("gn.t")
    public boolean field2934 = false;

    @ObfuscatedName("gn.c")
    public int field2921 = -1;

    @ObfuscatedName("gn.e")
    public int field2900 = 16;

    @ObfuscatedName("gn.am")
    public int field2942 = 0;

    @ObfuscatedName("gn.an")
    public int field2924 = 0;

    @ObfuscatedName("gn.aq")
    public String[] field2925 = new String[5];

    @ObfuscatedName("gn.ah")
    public int field2926 = -1;

    @ObfuscatedName("gn.ag")
    public int field2927 = -1;

    @ObfuscatedName("gn.ab")
    public boolean field2928 = false;

    @ObfuscatedName("gn.aw")
    public boolean field2923 = true;

    @ObfuscatedName("gn.ax")
    public int field2930 = 128;

    @ObfuscatedName("gn.ar")
    public int field2931 = 128;

    @ObfuscatedName("gn.ak")
    public int field2906 = 128;

    @ObfuscatedName("gn.ai")
    public int field2933 = 0;

    @ObfuscatedName("gn.ap")
    public int field2935 = 0;

    @ObfuscatedName("gn.au")
    public int field2897 = 0;

    @ObfuscatedName("gn.aj")
    public boolean field2946 = false;

    @ObfuscatedName("gn.at")
    public boolean field2937 = false;

    @ObfuscatedName("gn.ad")
    public int field2938 = -1;

    @ObfuscatedName("gn.av")
    public int[] field2939;

    @ObfuscatedName("gn.ao")
    public int field2912 = -1;

    @ObfuscatedName("gn.ae")
    public int field2941 = -1;

    @ObfuscatedName("gn.aa")
    public int field2911 = -1;

    @ObfuscatedName("gn.as")
    public int field2910 = 0;

    @ObfuscatedName("gn.al")
    public int field2944 = 0;

    @ObfuscatedName("gn.az")
    public int field2945 = 0;

    @ObfuscatedName("gn.ay")
    public int[] field2940;

    @ObfuscatedName("eu.f(II)Lgn;")
    public static class198 method2502(int arg0) {
        class198 var1 = (class198) field2929.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2898.method3163(6, arg0);
        class198 var3 = new class198();
        var3.field2905 = arg0;
        if (var2 != null) {
            var3.method3415(new class154(var2));
        }
        var3.method3414();
        if (var3.field2937) {
            var3.field2915 = 0;
            var3.field2916 = false;
        }
        field2929.method2246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gn.i(I)V")
    public void method3414() {
        if (this.field2917 == -1) {
            this.field2917 = 0;
            if (this.field2908 != null && (this.field2907 == null || this.field2907[0] == 10)) {
                this.field2917 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2925[var1] != null) {
                    this.field2917 = 1;
                }
            }
        }
        if (this.field2938 == -1) {
            this.field2938 = this.field2915 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gn.u(Leo;B)V")
    public void method3415(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3446(arg0, var2);
        }
    }

    @ObfuscatedName("gn.r(Leo;IB)V")
    public void method3446(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2666();
            if (var3 > 0) {
                if (this.field2908 == null || field2936) {
                    this.field2907 = new int[var3];
                    this.field2908 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2908[var4] = arg0.method2668();
                        this.field2907[var4] = arg0.method2666();
                    }
                } else {
                    arg0.field2111 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2932 = arg0.method2674();
        } else if (arg1 == 5) {
            int var5 = arg0.method2666();
            if (var5 > 0) {
                if (this.field2908 == null || field2936) {
                    this.field2907 = null;
                    this.field2908 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2908[var6] = arg0.method2668();
                    }
                } else {
                    arg0.field2111 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2943 = arg0.method2666();
        } else if (arg1 == 15) {
            this.field2914 = arg0.method2666();
        } else if (arg1 == 17) {
            this.field2915 = 0;
            this.field2916 = false;
        } else if (arg1 == 18) {
            this.field2916 = false;
        } else if (arg1 == 19) {
            this.field2917 = arg0.method2666();
        } else if (arg1 == 21) {
            this.field2918 = 0;
        } else if (arg1 == 22) {
            this.field2919 = true;
        } else if (arg1 == 23) {
            this.field2934 = true;
        } else if (arg1 == 24) {
            this.field2921 = arg0.method2668();
            if (this.field2921 == 65535) {
                this.field2921 = -1;
            }
        } else if (arg1 == 27) {
            this.field2915 = 1;
        } else if (arg1 == 28) {
            this.field2900 = arg0.method2666();
        } else if (arg1 == 29) {
            this.field2942 = arg0.method2667();
        } else if (arg1 == 39) {
            this.field2924 = arg0.method2667() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2925[arg1 - 30] = arg0.method2674();
            if (this.field2925[arg1 - 30].equalsIgnoreCase(class174.field2378)) {
                this.field2925[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2666();
            this.field2909 = new short[var7];
            this.field2920 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2909[var8] = (short) arg0.method2668();
                this.field2920[var8] = (short) arg0.method2668();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2666();
            this.field2922 = new short[var9];
            this.field2901 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2922[var10] = (short) arg0.method2668();
                this.field2901[var10] = (short) arg0.method2668();
            }
        } else if (arg1 == 60) {
            this.field2926 = arg0.method2668();
        } else if (arg1 == 62) {
            this.field2928 = true;
        } else if (arg1 == 64) {
            this.field2923 = false;
        } else if (arg1 == 65) {
            this.field2930 = arg0.method2668();
        } else if (arg1 == 66) {
            this.field2931 = arg0.method2668();
        } else if (arg1 == 67) {
            this.field2906 = arg0.method2668();
        } else if (arg1 == 68) {
            this.field2927 = arg0.method2668();
        } else if (arg1 == 69) {
            arg0.method2666();
        } else if (arg1 == 70) {
            this.field2933 = arg0.method2669();
        } else if (arg1 == 71) {
            this.field2935 = arg0.method2669();
        } else if (arg1 == 72) {
            this.field2897 = arg0.method2669();
        } else if (arg1 == 73) {
            this.field2946 = true;
        } else if (arg1 == 74) {
            this.field2937 = true;
        } else if (arg1 == 75) {
            this.field2938 = arg0.method2666();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2912 = arg0.method2668();
            if (this.field2912 == 65535) {
                this.field2912 = -1;
            }
            this.field2941 = arg0.method2668();
            if (this.field2941 == 65535) {
                this.field2941 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2668();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2666();
            this.field2939 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2939[var15] = arg0.method2668();
                if (this.field2939[var15] == 65535) {
                    this.field2939[var15] = -1;
                }
            }
            this.field2939[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2911 = arg0.method2668();
            this.field2910 = arg0.method2666();
        } else if (arg1 == 79) {
            this.field2944 = arg0.method2668();
            this.field2945 = arg0.method2668();
            this.field2910 = arg0.method2666();
            int var11 = arg0.method2666();
            this.field2940 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2940[var12] = arg0.method2668();
            }
        } else if (arg1 == 81) {
            this.field2918 = arg0.method2666() * 256;
        }
    }

    @ObfuscatedName("gn.o(II)Z")
    public final boolean method3417(int arg0) {
        if (this.field2907 != null) {
            for (int var4 = 0; var4 < this.field2907.length; var4++) {
                if (this.field2907[var4] == arg0) {
                    return Statics.field2899.method3119(this.field2908[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2908 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2908.length; var3++) {
                var2 &= Statics.field2899.method3119(this.field2908[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gn.l(I)Z")
    public final boolean method3418() {
        if (this.field2908 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2908.length; var2++) {
            var1 &= Statics.field2899.method3119(this.field2908[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gn.n(II[[IIIIB)Lcp;")
    public final class90 method3428(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2907 == null) {
            var7 = (long) ((this.field2905 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2905 << 10) + (arg0 << 3) + arg1);
        }
        class90 var9 = (class90) field2902.method2240(var7);
        if (var9 == null) {
            class77 var10 = this.method3422(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2919) {
                var10.field1279 = (short) (this.field2942 + 64);
                var10.field1268 = (short) (this.field2924 + 768);
                var10.method1426();
                var9 = var10;
            } else {
                var9 = var10.method1437(this.field2942 + 64, this.field2924 + 768, -50, -10, -50);
            }
            field2902.method2246(var9, var7);
        }
        if (this.field2919) {
            var9 = ((class77) var9).method1414();
        }
        if (this.field2918 >= 0) {
            if (var9 instanceof class83) {
                var9 = ((class83) var9).method1496(arg2, arg3, arg4, arg5, true, this.field2918);
            } else if (var9 instanceof class77) {
                var9 = ((class77) var9).method1415(arg2, arg3, arg4, arg5, true, this.field2918);
            }
        }
        return var9;
    }

    @ObfuscatedName("gn.m(II[[IIIII)Lce;")
    public final class83 method3420(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2907 == null) {
            var7 = (long) ((this.field2905 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2905 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field2903.method2240(var7);
        if (var9 == null) {
            class77 var10 = this.method3422(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1437(this.field2942 + 64, this.field2924 + 768, -50, -10, -50);
            field2903.method2246(var9, var7);
        }
        if (this.field2918 >= 0) {
            var9 = var9.method1496(arg2, arg3, arg4, arg5, true, this.field2918);
        }
        return var9;
    }

    @ObfuscatedName("gn.w(II[[IIIILgl;IB)Lce;")
    public final class83 method3421(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class202 arg6, int arg7) {
        long var9;
        if (this.field2907 == null) {
            var9 = (long) ((this.field2905 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2905 << 10) + (arg0 << 3) + arg1);
        }
        class83 var11 = (class83) field2903.method2240(var9);
        if (var11 == null) {
            class77 var12 = this.method3422(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1437(this.field2942 + 64, this.field2924 + 768, -50, -10, -50);
            field2903.method2246(var11, var9);
        }
        if (arg6 == null && this.field2918 == -1) {
            return var11;
        }
        class83 var13;
        if (arg6 == null) {
            var13 = var11.method1497(true);
        } else {
            var13 = arg6.method3570(var11, arg7, arg1);
        }
        if (this.field2918 >= 0) {
            var13 = var13.method1496(arg2, arg3, arg4, arg5, false, this.field2918);
        }
        return var13;
    }

    @ObfuscatedName("gn.j(III)Lbp;")
    public final class77 method3422(int arg0, int arg1) {
        class77 var3 = null;
        if (this.field2907 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2908 == null) {
                return null;
            }
            boolean var4 = this.field2928;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2908.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2908[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class77) field2913.method2240((long) var7);
                if (var3 == null) {
                    var3 = class77.method1408(Statics.field2899, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1424();
                    }
                    field2913.method2246(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2904[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class77(field2904, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2907.length; var9++) {
                if (this.field2907[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2908[var8];
            boolean var11 = this.field2928 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class77) field2913.method2240((long) var10);
            if (var3 == null) {
                var3 = class77.method1408(Statics.field2899, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1424();
                }
                field2913.method2246(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2930 == 128 && this.field2931 == 128 && this.field2906 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2933 == 0 && this.field2935 == 0 && this.field2897 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class77 var14 = new class77(var3, arg1 == 0 && !var12 && !var13, this.field2909 == null, this.field2922 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1413(256);
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
        if (this.field2909 != null) {
            for (int var16 = 0; var16 < this.field2909.length; var16++) {
                var14.method1422(this.field2909[var16], this.field2920[var16]);
            }
        }
        if (this.field2922 != null) {
            for (int var17 = 0; var17 < this.field2922.length; var17++) {
                var14.method1423(this.field2922[var17], this.field2901[var17]);
            }
        }
        if (var12) {
            var14.method1407(this.field2930, this.field2931, this.field2906);
        }
        if (var13) {
            var14.method1421(this.field2933, this.field2935, this.field2897);
        }
        return var14;
    }

    @ObfuscatedName("gn.s(I)Lgn;")
    public final class198 method3423() {
        int var1 = -1;
        if (this.field2912 != -1) {
            var1 = class166.method561(this.field2912);
        } else if (this.field2941 != -1) {
            var1 = class166.field2181[this.field2941];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2939.length - 1) {
            var2 = this.field2939[var1];
        } else {
            var2 = this.field2939[this.field2939.length - 1];
        }
        return var2 == -1 ? null : method2502(var2);
    }

    @ObfuscatedName("gn.d(I)Z")
    public boolean method3434() {
        if (this.field2939 == null) {
            return this.field2911 != -1 || this.field2940 != null;
        }
        for (int var1 = 0; var1 < this.field2939.length; var1++) {
            if (this.field2939[var1] != -1) {
                class198 var2 = method2502(this.field2939[var1]);
                if (var2.field2911 != -1 || var2.field2940 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
