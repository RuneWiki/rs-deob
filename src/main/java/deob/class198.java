package deob;

@ObfuscatedName("gf")
public class class198 extends class130 {

    @ObfuscatedName("gf.u")
    public static boolean field2917 = false;

    @ObfuscatedName("gf.a")
    public static class125 field2905 = new class125(64);

    @ObfuscatedName("gf.f")
    public static class125 field2930 = new class125(500);

    @ObfuscatedName("gf.c")
    public static class125 field2885 = new class125(30);

    @ObfuscatedName("gf.d")
    public static class125 field2909 = new class125(30);

    @ObfuscatedName("gf.l")
    public static class77[] field2887 = new class77[4];

    @ObfuscatedName("gf.g")
    public int field2888;

    @ObfuscatedName("gf.z")
    public int[] field2889;

    @ObfuscatedName("gf.t")
    public int[] field2890;

    @ObfuscatedName("gf.m")
    public String field2891 = "null";

    @ObfuscatedName("gf.q")
    public short[] field2892;

    @ObfuscatedName("gf.e")
    public short[] field2893;

    @ObfuscatedName("gf.v")
    public short[] field2894;

    @ObfuscatedName("gf.j")
    public short[] field2895;

    @ObfuscatedName("gf.p")
    public int field2896 = 1;

    @ObfuscatedName("gf.k")
    public int field2932 = 1;

    @ObfuscatedName("gf.r")
    public int field2924 = 2;

    @ObfuscatedName("gf.y")
    public boolean field2899 = true;

    @ObfuscatedName("gf.h")
    public int field2900 = -1;

    @ObfuscatedName("gf.s")
    public int field2886 = -1;

    @ObfuscatedName("gf.w")
    public boolean field2884 = false;

    @ObfuscatedName("gf.n")
    public boolean field2903 = false;

    @ObfuscatedName("gf.o")
    public int field2904 = -1;

    @ObfuscatedName("gf.b")
    public int field2906 = 16;

    @ObfuscatedName("gf.aj")
    public int field2918 = 0;

    @ObfuscatedName("gf.ag")
    public int field2907 = 0;

    @ObfuscatedName("gf.al")
    public String[] field2916 = new String[5];

    @ObfuscatedName("gf.an")
    public int field2883 = -1;

    @ObfuscatedName("gf.af")
    public int field2910 = -1;

    @ObfuscatedName("gf.aa")
    public boolean field2911 = false;

    @ObfuscatedName("gf.ax")
    public boolean field2928 = true;

    @ObfuscatedName("gf.ai")
    public int field2913 = 128;

    @ObfuscatedName("gf.ah")
    public int field2914 = 128;

    @ObfuscatedName("gf.av")
    public int field2915 = 128;

    @ObfuscatedName("gf.at")
    public int field2922 = 0;

    @ObfuscatedName("gf.az")
    public int field2881 = 0;

    @ObfuscatedName("gf.ad")
    public int field2898 = 0;

    @ObfuscatedName("gf.aw")
    public boolean field2919 = false;

    @ObfuscatedName("gf.ak")
    public boolean field2920 = false;

    @ObfuscatedName("gf.aq")
    public int field2921 = -1;

    @ObfuscatedName("gf.ac")
    public int[] field2912;

    @ObfuscatedName("gf.am")
    public int field2923 = -1;

    @ObfuscatedName("gf.ay")
    public int field2897 = -1;

    @ObfuscatedName("gf.ar")
    public int field2925 = -1;

    @ObfuscatedName("gf.ab")
    public int field2926 = 0;

    @ObfuscatedName("gf.as")
    public int field2927 = 0;

    @ObfuscatedName("gf.ap")
    public int field2901 = 0;

    @ObfuscatedName("gf.ae")
    public int[] field2929;

    @ObfuscatedName("ey.u(Lgt;Lgt;ZI)V")
    public static void method2326(class183 arg0, class183 arg1, boolean arg2) {
        Statics.field2882 = arg0;
        Statics.field759 = arg1;
        field2917 = arg2;
    }

    @ObfuscatedName("cr.x(II)Lgf;")
    public static class198 method1443(int arg0) {
        class198 var1 = (class198) field2905.method2186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2882.method3071(6, arg0);
        class198 var3 = new class198();
        var3.field2888 = arg0;
        if (var2 != null) {
            var3.method3387(new class154(var2));
        }
        var3.method3393();
        if (var3.field2920) {
            var3.field2924 = 0;
            var3.field2899 = false;
        }
        field2905.method2179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gf.i(B)V")
    public void method3393() {
        if (this.field2900 == -1) {
            this.field2900 = 0;
            if (this.field2889 != null && (this.field2890 == null || this.field2890[0] == 10)) {
                this.field2900 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2916[var1] != null) {
                    this.field2900 = 1;
                }
            }
        }
        if (this.field2921 == -1) {
            this.field2921 = this.field2924 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gf.a(Len;I)V")
    public void method3387(class154 arg0) {
        while (true) {
            int var2 = arg0.method2708();
            if (var2 == 0) {
                return;
            }
            this.method3399(arg0, var2);
        }
    }

    @ObfuscatedName("gf.c(Len;II)V")
    public void method3399(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2708();
            if (var3 > 0) {
                if (this.field2889 == null || field2917) {
                    this.field2890 = new int[var3];
                    this.field2889 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2889[var4] = arg0.method2581();
                        this.field2890[var4] = arg0.method2708();
                    }
                } else {
                    arg0.field2073 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2891 = arg0.method2778();
        } else if (arg1 == 5) {
            int var5 = arg0.method2708();
            if (var5 > 0) {
                if (this.field2889 == null || field2917) {
                    this.field2890 = null;
                    this.field2889 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2889[var6] = arg0.method2581();
                    }
                } else {
                    arg0.field2073 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2896 = arg0.method2708();
        } else if (arg1 == 15) {
            this.field2932 = arg0.method2708();
        } else if (arg1 == 17) {
            this.field2924 = 0;
            this.field2899 = false;
        } else if (arg1 == 18) {
            this.field2899 = false;
        } else if (arg1 == 19) {
            this.field2900 = arg0.method2708();
        } else if (arg1 == 21) {
            this.field2886 = 0;
        } else if (arg1 == 22) {
            this.field2884 = true;
        } else if (arg1 == 23) {
            this.field2903 = true;
        } else if (arg1 == 24) {
            this.field2904 = arg0.method2581();
            if (this.field2904 == 65535) {
                this.field2904 = -1;
            }
        } else if (arg1 == 27) {
            this.field2924 = 1;
        } else if (arg1 == 28) {
            this.field2906 = arg0.method2708();
        } else if (arg1 == 29) {
            this.field2918 = arg0.method2754();
        } else if (arg1 == 39) {
            this.field2907 = arg0.method2754() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2916[arg1 - 30] = arg0.method2778();
            if (this.field2916[arg1 - 30].equalsIgnoreCase(class174.field2555)) {
                this.field2916[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2708();
            this.field2892 = new short[var7];
            this.field2893 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2892[var8] = (short) arg0.method2581();
                this.field2893[var8] = (short) arg0.method2581();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2708();
            this.field2894 = new short[var9];
            this.field2895 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2894[var10] = (short) arg0.method2581();
                this.field2895[var10] = (short) arg0.method2581();
            }
        } else if (arg1 == 60) {
            this.field2883 = arg0.method2581();
        } else if (arg1 == 62) {
            this.field2911 = true;
        } else if (arg1 == 64) {
            this.field2928 = false;
        } else if (arg1 == 65) {
            this.field2913 = arg0.method2581();
        } else if (arg1 == 66) {
            this.field2914 = arg0.method2581();
        } else if (arg1 == 67) {
            this.field2915 = arg0.method2581();
        } else if (arg1 == 68) {
            this.field2910 = arg0.method2581();
        } else if (arg1 == 69) {
            arg0.method2708();
        } else if (arg1 == 70) {
            this.field2922 = arg0.method2781();
        } else if (arg1 == 71) {
            this.field2881 = arg0.method2781();
        } else if (arg1 == 72) {
            this.field2898 = arg0.method2781();
        } else if (arg1 == 73) {
            this.field2919 = true;
        } else if (arg1 == 74) {
            this.field2920 = true;
        } else if (arg1 == 75) {
            this.field2921 = arg0.method2708();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2923 = arg0.method2581();
            if (this.field2923 == 65535) {
                this.field2923 = -1;
            }
            this.field2897 = arg0.method2581();
            if (this.field2897 == 65535) {
                this.field2897 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2581();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2708();
            this.field2912 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2912[var15] = arg0.method2581();
                if (this.field2912[var15] == 65535) {
                    this.field2912[var15] = -1;
                }
            }
            this.field2912[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2925 = arg0.method2581();
            this.field2926 = arg0.method2708();
        } else if (arg1 == 79) {
            this.field2927 = arg0.method2581();
            this.field2901 = arg0.method2581();
            this.field2926 = arg0.method2708();
            int var11 = arg0.method2708();
            this.field2929 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2929[var12] = arg0.method2581();
            }
        } else if (arg1 == 81) {
            this.field2886 = arg0.method2708() * 256;
        }
    }

    @ObfuscatedName("gf.g(IS)Z")
    public final boolean method3389(int arg0) {
        if (this.field2890 != null) {
            for (int var4 = 0; var4 < this.field2890.length; var4++) {
                if (this.field2890[var4] == arg0) {
                    return Statics.field759.method3063(this.field2889[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2889 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2889.length; var3++) {
                var2 &= Statics.field759.method3063(this.field2889[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gf.z(I)Z")
    public final boolean method3390() {
        if (this.field2889 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2889.length; var2++) {
            var1 &= Statics.field759.method3063(this.field2889[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gf.t(II[[IIIII)Lcm;")
    public final class90 method3391(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2890 == null) {
            var7 = (long) ((this.field2888 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2888 << 10) + (arg0 << 3) + arg1);
        }
        class90 var9 = (class90) field2885.method2186(var7);
        if (var9 == null) {
            class77 var10 = this.method3394(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2884) {
                var10.field1243 = (short) (this.field2918 + 64);
                var10.field1257 = (short) (this.field2907 + 768);
                var10.method1361();
                var9 = var10;
            } else {
                var9 = var10.method1416(this.field2918 + 64, this.field2907 + 768, -50, -10, -50);
            }
            field2885.method2179(var9, var7);
        }
        if (this.field2884) {
            var9 = ((class77) var9).method1424();
        }
        if (this.field2886 >= 0) {
            if (var9 instanceof class83) {
                var9 = ((class83) var9).method1445(arg2, arg3, arg4, arg5, true, this.field2886);
            } else if (var9 instanceof class77) {
                var9 = ((class77) var9).method1350(arg2, arg3, arg4, arg5, true, this.field2886);
            }
        }
        return var9;
    }

    @ObfuscatedName("gf.m(II[[IIIII)Lcs;")
    public final class83 method3386(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2890 == null) {
            var7 = (long) ((this.field2888 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2888 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field2909.method2186(var7);
        if (var9 == null) {
            class77 var10 = this.method3394(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1416(this.field2918 + 64, this.field2907 + 768, -50, -10, -50);
            field2909.method2179(var9, var7);
        }
        if (this.field2886 >= 0) {
            var9 = var9.method1445(arg2, arg3, arg4, arg5, true, this.field2886);
        }
        return var9;
    }

    @ObfuscatedName("gf.q(II[[IIIILgg;IB)Lcs;")
    public final class83 method3407(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class202 arg6, int arg7) {
        long var9;
        if (this.field2890 == null) {
            var9 = (long) ((this.field2888 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2888 << 10) + (arg0 << 3) + arg1);
        }
        class83 var11 = (class83) field2909.method2186(var9);
        if (var11 == null) {
            class77 var12 = this.method3394(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1416(this.field2918 + 64, this.field2907 + 768, -50, -10, -50);
            field2909.method2179(var11, var9);
        }
        if (arg6 == null && this.field2886 == -1) {
            return var11;
        }
        class83 var13;
        if (arg6 == null) {
            var13 = var11.method1487(true);
        } else {
            var13 = arg6.method3546(var11, arg7, arg1);
        }
        if (this.field2886 >= 0) {
            var13 = var13.method1445(arg2, arg3, arg4, arg5, false, this.field2886);
        }
        return var13;
    }

    @ObfuscatedName("gf.e(III)Lbc;")
    public final class77 method3394(int arg0, int arg1) {
        class77 var3 = null;
        if (this.field2890 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2889 == null) {
                return null;
            }
            boolean var4 = this.field2911;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2889.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2889[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class77) field2930.method2186((long) var7);
                if (var3 == null) {
                    var3 = class77.method1393(Statics.field759, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1344();
                    }
                    field2930.method2179(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2887[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class77(field2887, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2890.length; var9++) {
                if (this.field2890[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2889[var8];
            boolean var11 = this.field2911 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class77) field2930.method2186((long) var10);
            if (var3 == null) {
                var3 = class77.method1393(Statics.field759, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1344();
                }
                field2930.method2179(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2913 == 128 && this.field2914 == 128 && this.field2915 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2922 == 0 && this.field2881 == 0 && this.field2898 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class77 var14 = new class77(var3, arg1 == 0 && !var12 && !var13, this.field2892 == null, this.field2894 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1355(256);
            var14.method1356(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1352();
        } else if (var15 == 2) {
            var14.method1382();
        } else if (var15 == 3) {
            var14.method1354();
        }
        if (this.field2892 != null) {
            for (int var16 = 0; var16 < this.field2892.length; var16++) {
                var14.method1357(this.field2892[var16], this.field2893[var16]);
            }
        }
        if (this.field2894 != null) {
            for (int var17 = 0; var17 < this.field2894.length; var17++) {
                var14.method1399(this.field2894[var17], this.field2895[var17]);
            }
        }
        if (var12) {
            var14.method1353(this.field2913, this.field2914, this.field2915);
        }
        if (var13) {
            var14.method1356(this.field2922, this.field2881, this.field2898);
        }
        return var14;
    }

    @ObfuscatedName("gf.v(B)Lgf;")
    public final class198 method3420() {
        int var1 = -1;
        if (this.field2923 != -1) {
            var1 = class166.method1810(this.field2923);
        } else if (this.field2897 != -1) {
            var1 = class166.field2147[this.field2897];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2912.length - 1) {
            var2 = this.field2912[var1];
        } else {
            var2 = this.field2912[this.field2912.length - 1];
        }
        return var2 == -1 ? null : method1443(var2);
    }

    @ObfuscatedName("gf.j(I)Z")
    public boolean method3398() {
        if (this.field2912 == null) {
            return this.field2925 != -1 || this.field2929 != null;
        }
        for (int var1 = 0; var1 < this.field2912.length; var1++) {
            if (this.field2912[var1] != -1) {
                class198 var2 = method1443(this.field2912[var1]);
                if (var2.field2925 != -1 || var2.field2929 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
