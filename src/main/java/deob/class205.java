package deob;

@ObfuscatedName("gx")
public class class205 extends class151 {

    @ObfuscatedName("gx.n")
    public static class146 field3036 = new class146(64);

    @ObfuscatedName("gx.q")
    public static class146 field3037 = new class146(50);

    @ObfuscatedName("gx.t")
    public int field3038;

    @ObfuscatedName("gx.p")
    public String field3056 = "null";

    @ObfuscatedName("gx.u")
    public int field3043 = 1;

    @ObfuscatedName("gx.z")
    public int[] field3041;

    @ObfuscatedName("gx.l")
    public int[] field3042;

    @ObfuscatedName("gx.v")
    public int field3048 = -1;

    @ObfuscatedName("gx.g")
    public int field3044 = -1;

    @ObfuscatedName("gx.w")
    public int field3067 = -1;

    @ObfuscatedName("gx.r")
    public int field3066 = -1;

    @ObfuscatedName("gx.s")
    public int field3034 = -1;

    @ObfuscatedName("gx.k")
    public int field3063 = -1;

    @ObfuscatedName("gx.e")
    public int field3058 = -1;

    @ObfuscatedName("gx.j")
    public short[] field3050;

    @ObfuscatedName("gx.i")
    public short[] field3051;

    @ObfuscatedName("gx.a")
    public short[] field3052;

    @ObfuscatedName("gx.x")
    public short[] field3053;

    @ObfuscatedName("gx.h")
    public String[] field3054 = new String[5];

    @ObfuscatedName("gx.b")
    public boolean field3055 = true;

    @ObfuscatedName("gx.f")
    public int field3059 = -1;

    @ObfuscatedName("gx.o")
    public int field3057 = 128;

    @ObfuscatedName("gx.m")
    public int field3045 = 128;

    @ObfuscatedName("gx.y")
    public boolean field3065 = false;

    @ObfuscatedName("gx.am")
    public int field3060 = 0;

    @ObfuscatedName("gx.ax")
    public int field3061 = 0;

    @ObfuscatedName("gx.ac")
    public int field3046 = -1;

    @ObfuscatedName("gx.az")
    public int field3049 = 32;

    @ObfuscatedName("gx.ao")
    public int[] field3040;

    @ObfuscatedName("gx.ak")
    public int field3064 = -1;

    @ObfuscatedName("gx.aa")
    public int field3047 = -1;

    @ObfuscatedName("gx.aj")
    public boolean field3062 = true;

    @ObfuscatedName("gx.ay")
    public boolean field3068 = true;

    @ObfuscatedName("gx.ae")
    public boolean field3069 = false;

    @ObfuscatedName("gx.aq")
    public class143 field3070;

    @ObfuscatedName("fc.d(II)Lgx;")
    public static class205 method3033(int arg0) {
        class205 var1 = (class205) field3036.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3039.method3129(9, arg0);
        class205 var3 = new class205();
        var3.field3038 = arg0;
        if (var2 != null) {
            var3.method3612(new class130(var2));
        }
        var3.method3587();
        field3036.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gx.c(B)V")
    public void method3587() {
    }

    @ObfuscatedName("gx.n(Ldu;I)V")
    public void method3612(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3622(arg0, var2);
        }
    }

    @ObfuscatedName("gx.q(Ldu;II)V")
    public void method3622(class130 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2379();
            this.field3041 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3041[var4] = arg0.method2232();
            }
        } else if (arg1 == 2) {
            this.field3056 = arg0.method2314();
        } else if (arg1 == 12) {
            this.field3043 = arg0.method2379();
        } else if (arg1 == 13) {
            this.field3048 = arg0.method2232();
        } else if (arg1 == 14) {
            this.field3066 = arg0.method2232();
        } else if (arg1 == 15) {
            this.field3044 = arg0.method2232();
        } else if (arg1 == 16) {
            this.field3067 = arg0.method2232();
        } else if (arg1 == 17) {
            this.field3066 = arg0.method2232();
            this.field3034 = arg0.method2232();
            this.field3063 = arg0.method2232();
            this.field3058 = arg0.method2232();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3054[arg1 - 30] = arg0.method2314();
            if (this.field3054[arg1 - 30].equalsIgnoreCase(class176.field2361)) {
                this.field3054[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2379();
            this.field3050 = new short[var5];
            this.field3051 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3050[var6] = (short) arg0.method2232();
                this.field3051[var6] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2379();
            this.field3052 = new short[var7];
            this.field3053 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3052[var8] = (short) arg0.method2232();
                this.field3053[var8] = (short) arg0.method2232();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2379();
            this.field3042 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3042[var10] = arg0.method2232();
            }
        } else if (arg1 == 93) {
            this.field3055 = false;
        } else if (arg1 == 95) {
            this.field3059 = arg0.method2232();
        } else if (arg1 == 97) {
            this.field3057 = arg0.method2232();
        } else if (arg1 == 98) {
            this.field3045 = arg0.method2232();
        } else if (arg1 == 99) {
            this.field3065 = true;
        } else if (arg1 == 100) {
            this.field3060 = arg0.method2230();
        } else if (arg1 == 101) {
            this.field3061 = arg0.method2230() * 5;
        } else if (arg1 == 102) {
            this.field3046 = arg0.method2232();
        } else if (arg1 == 103) {
            this.field3049 = arg0.method2232();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3064 = arg0.method2232();
            if (this.field3064 == 65535) {
                this.field3064 = -1;
            }
            this.field3047 = arg0.method2232();
            if (this.field3047 == 65535) {
                this.field3047 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2232();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2379();
            this.field3040 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3040[var13] = arg0.method2232();
                if (this.field3040[var13] == 65535) {
                    this.field3040[var13] = -1;
                }
            }
            this.field3040[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3062 = false;
        } else if (arg1 == 109) {
            this.field3068 = false;
        } else if (arg1 == 111) {
            this.field3069 = true;
        } else if (arg1 == 249) {
            this.field3070 = class197.method3079(arg0, this.field3070);
        }
    }

    @ObfuscatedName("gx.t(Lgg;ILgg;IB)Lcf;")
    public final class83 method3600(class207 arg0, int arg1, class207 arg2, int arg3) {
        if (this.field3040 != null) {
            class205 var5 = this.method3591();
            return var5 == null ? null : var5.method3600(arg0, arg1, arg2, arg3);
        }
        class83 var6 = (class83) field3037.method2598((long) this.field3038);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3041.length; var8++) {
                if (!Statics.field3035.method3089(this.field3041[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class77[] var9 = new class77[this.field3041.length];
            for (int var10 = 0; var10 < this.field3041.length; var10++) {
                var9[var10] = class77.method1394(Statics.field3035, this.field3041[var10], 0);
            }
            class77 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class77(var9, var9.length);
            }
            if (this.field3050 != null) {
                for (int var12 = 0; var12 < this.field3050.length; var12++) {
                    var11.method1406(this.field3050[var12], this.field3051[var12]);
                }
            }
            if (this.field3052 != null) {
                for (int var13 = 0; var13 < this.field3052.length; var13++) {
                    var11.method1407(this.field3052[var13], this.field3053[var13]);
                }
            }
            var6 = var11.method1417(this.field3060 + 64, this.field3061 + 850, -30, -50, -30);
            field3037.method2607(var6, (long) this.field3038);
        }
        class83 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3662(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3649(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1486(true);
        } else {
            var14 = arg2.method3649(var6, arg3);
        }
        if (this.field3057 != 128 || this.field3045 != 128) {
            var14.method1497(this.field3057, this.field3045, this.field3057);
        }
        return var14;
    }

    @ObfuscatedName("gx.p(I)Lbd;")
    public final class77 method3619() {
        if (this.field3040 != null) {
            class205 var1 = this.method3591();
            return var1 == null ? null : var1.method3619();
        } else if (this.field3042 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3042.length; var3++) {
                if (!Statics.field3035.method3089(this.field3042[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class77[] var4 = new class77[this.field3042.length];
            for (int var5 = 0; var5 < this.field3042.length; var5++) {
                var4[var5] = class77.method1394(Statics.field3035, this.field3042[var5], 0);
            }
            class77 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class77(var4, var4.length);
            }
            if (this.field3050 != null) {
                for (int var7 = 0; var7 < this.field3050.length; var7++) {
                    var6.method1406(this.field3050[var7], this.field3051[var7]);
                }
            }
            if (this.field3052 != null) {
                for (int var8 = 0; var8 < this.field3052.length; var8++) {
                    var6.method1407(this.field3052[var8], this.field3053[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("gx.u(I)Lgx;")
    public final class205 method3591() {
        int var1 = -1;
        if (this.field3064 != -1) {
            var1 = class168.method1112(this.field3064);
        } else if (this.field3047 != -1) {
            var1 = class168.field2174[this.field3047];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3040.length - 1) {
            var2 = this.field3040[var1];
        } else {
            var2 = this.field3040[this.field3040.length - 1];
        }
        return var2 == -1 ? null : method3033(var2);
    }

    @ObfuscatedName("gx.w(B)Z")
    public boolean method3589() {
        if (this.field3040 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3064 != -1) {
            var1 = class168.method1112(this.field3064);
        } else if (this.field3047 != -1) {
            var1 = class168.field2174[this.field3047];
        }
        if (var1 >= 0 && var1 < this.field3040.length) {
            return this.field3040[var1] != -1;
        } else {
            return this.field3040[this.field3040.length - 1] != -1;
        }
    }

    @ObfuscatedName("gx.r(III)I")
    public int method3593(int arg0, int arg1) {
        return class197.method3195(this.field3070, arg0, arg1);
    }

    @ObfuscatedName("gx.s(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3618(int arg0, String arg1) {
        return Statics.method2910(this.field3070, arg0, arg1);
    }
}
