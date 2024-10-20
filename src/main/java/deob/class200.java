package deob;

@ObfuscatedName("gf")
public class class200 extends class130 {

    @ObfuscatedName("gf.g")
    public static class125 field3009 = new class125(64);

    @ObfuscatedName("gf.v")
    public static class125 field3031 = new class125(50);

    @ObfuscatedName("gf.y")
    public int field3011;

    @ObfuscatedName("gf.p")
    public String field3021 = "null";

    @ObfuscatedName("gf.j")
    public int field3041 = 1;

    @ObfuscatedName("gf.m")
    public int[] field3014;

    @ObfuscatedName("gf.a")
    public int[] field3027;

    @ObfuscatedName("gf.i")
    public int field3016 = -1;

    @ObfuscatedName("gf.s")
    public int field3017 = -1;

    @ObfuscatedName("gf.k")
    public int field3018 = -1;

    @ObfuscatedName("gf.f")
    public int field3012 = -1;

    @ObfuscatedName("gf.o")
    public int field3020 = -1;

    @ObfuscatedName("gf.q")
    public int field3030 = -1;

    @ObfuscatedName("gf.c")
    public int field3022 = -1;

    @ObfuscatedName("gf.b")
    public short[] field3023;

    @ObfuscatedName("gf.w")
    public short[] field3024;

    @ObfuscatedName("gf.l")
    public short[] field3007;

    @ObfuscatedName("gf.r")
    public short[] field3025;

    @ObfuscatedName("gf.u")
    public String[] field3026 = new String[5];

    @ObfuscatedName("gf.e")
    public boolean field3028 = true;

    @ObfuscatedName("gf.h")
    public int field3029 = -1;

    @ObfuscatedName("gf.d")
    public int field3038 = 128;

    @ObfuscatedName("gf.z")
    public int field3013 = 128;

    @ObfuscatedName("gf.t")
    public boolean field3032 = false;

    @ObfuscatedName("gf.ab")
    public int field3033 = 0;

    @ObfuscatedName("gf.ac")
    public int field3034 = 0;

    @ObfuscatedName("gf.au")
    public int field3035 = -1;

    @ObfuscatedName("gf.al")
    public int field3036 = 32;

    @ObfuscatedName("gf.ae")
    public int[] field3019;

    @ObfuscatedName("gf.ad")
    public int field3015 = -1;

    @ObfuscatedName("gf.aq")
    public int field3039 = -1;

    @ObfuscatedName("gf.aa")
    public boolean field3040 = true;

    @ObfuscatedName("gf.af")
    public boolean field3010 = true;

    @ObfuscatedName("gf.as")
    public boolean field3042 = false;

    @ObfuscatedName("dh.x(Lgo;Lgo;I)V")
    public static void method1976(class183 arg0, class183 arg1) {
        Statics.field3037 = arg0;
        Statics.field3008 = arg1;
    }

    @ObfuscatedName("ff.n(II)Lgf;")
    public static class200 method2965(int arg0) {
        class200 var1 = (class200) field3009.method2275((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3037.method3153(9, arg0);
        class200 var3 = new class200();
        var3.field3011 = arg0;
        if (var2 != null) {
            var3.method3590(new class154(var2));
        }
        var3.method3569();
        field3009.method2282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gf.g(I)V")
    public void method3569() {
    }

    @ObfuscatedName("gf.v(Leq;S)V")
    public void method3590(class154 arg0) {
        while (true) {
            int var2 = arg0.method2878();
            if (var2 == 0) {
                return;
            }
            this.method3567(arg0, var2);
        }
    }

    @ObfuscatedName("gf.y(Leq;II)V")
    public void method3567(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2878();
            this.field3014 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3014[var4] = arg0.method2833();
            }
        } else if (arg1 == 2) {
            this.field3021 = arg0.method2709();
        } else if (arg1 == 12) {
            this.field3041 = arg0.method2878();
        } else if (arg1 == 13) {
            this.field3016 = arg0.method2833();
        } else if (arg1 == 14) {
            this.field3012 = arg0.method2833();
        } else if (arg1 == 15) {
            this.field3017 = arg0.method2833();
        } else if (arg1 == 16) {
            this.field3018 = arg0.method2833();
        } else if (arg1 == 17) {
            this.field3012 = arg0.method2833();
            this.field3020 = arg0.method2833();
            this.field3030 = arg0.method2833();
            this.field3022 = arg0.method2833();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3026[arg1 - 30] = arg0.method2709();
            if (this.field3026[arg1 - 30].equalsIgnoreCase(class174.field2361)) {
                this.field3026[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2878();
            this.field3023 = new short[var5];
            this.field3024 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3023[var6] = (short) arg0.method2833();
                this.field3024[var6] = (short) arg0.method2833();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2878();
            this.field3007 = new short[var7];
            this.field3025 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3007[var8] = (short) arg0.method2833();
                this.field3025[var8] = (short) arg0.method2833();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2878();
            this.field3027 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3027[var10] = arg0.method2833();
            }
        } else if (arg1 == 93) {
            this.field3028 = false;
        } else if (arg1 == 95) {
            this.field3029 = arg0.method2833();
        } else if (arg1 == 97) {
            this.field3038 = arg0.method2833();
        } else if (arg1 == 98) {
            this.field3013 = arg0.method2833();
        } else if (arg1 == 99) {
            this.field3032 = true;
        } else if (arg1 == 100) {
            this.field3033 = arg0.method2788();
        } else if (arg1 == 101) {
            this.field3034 = arg0.method2788() * 5;
        } else if (arg1 == 102) {
            this.field3035 = arg0.method2833();
        } else if (arg1 == 103) {
            this.field3036 = arg0.method2833();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3015 = arg0.method2833();
            if (this.field3015 == 65535) {
                this.field3015 = -1;
            }
            this.field3039 = arg0.method2833();
            if (this.field3039 == 65535) {
                this.field3039 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2833();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2878();
            this.field3019 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3019[var13] = arg0.method2833();
                if (this.field3019[var13] == 65535) {
                    this.field3019[var13] = -1;
                }
            }
            this.field3019[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3040 = false;
        } else if (arg1 == 109) {
            this.field3010 = false;
        } else if (arg1 == 111) {
            this.field3042 = true;
        }
    }

    @ObfuscatedName("gf.p(Lgk;ILgk;II)Lcj;")
    public final class83 method3568(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field3019 != null) {
            class200 var5 = this.method3570();
            return var5 == null ? null : var5.method3568(arg0, arg1, arg2, arg3);
        }
        class83 var6 = (class83) field3031.method2275((long) this.field3011);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3014.length; var8++) {
                if (!Statics.field3008.method3154(this.field3014[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class77[] var9 = new class77[this.field3014.length];
            for (int var10 = 0; var10 < this.field3014.length; var10++) {
                var9[var10] = class77.method1469(Statics.field3008, this.field3014[var10], 0);
            }
            class77 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class77(var9, var9.length);
            }
            if (this.field3023 != null) {
                for (int var12 = 0; var12 < this.field3023.length; var12++) {
                    var11.method1539(this.field3023[var12], this.field3024[var12]);
                }
            }
            if (this.field3007 != null) {
                for (int var13 = 0; var13 < this.field3007.length; var13++) {
                    var11.method1534(this.field3007[var13], this.field3025[var13]);
                }
            }
            var6 = var11.method1546(this.field3033 + 64, this.field3034 + 850, -30, -50, -30);
            field3031.method2282(var6, (long) this.field3011);
        }
        class83 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3622(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3609(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1619(true);
        } else {
            var14 = arg2.method3609(var6, arg3);
        }
        if (this.field3038 != 128 || this.field3013 != 128) {
            var14.method1582(this.field3038, this.field3013, this.field3038);
        }
        return var14;
    }

    @ObfuscatedName("gf.j(I)Lbc;")
    public final class77 method3586() {
        if (this.field3019 != null) {
            class200 var1 = this.method3570();
            return var1 == null ? null : var1.method3586();
        } else if (this.field3027 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3027.length; var3++) {
                if (!Statics.field3008.method3154(this.field3027[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class77[] var4 = new class77[this.field3027.length];
            for (int var5 = 0; var5 < this.field3027.length; var5++) {
                var4[var5] = class77.method1469(Statics.field3008, this.field3027[var5], 0);
            }
            class77 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class77(var4, var4.length);
            }
            if (this.field3023 != null) {
                for (int var7 = 0; var7 < this.field3023.length; var7++) {
                    var6.method1539(this.field3023[var7], this.field3024[var7]);
                }
            }
            if (this.field3007 != null) {
                for (int var8 = 0; var8 < this.field3007.length; var8++) {
                    var6.method1534(this.field3007[var8], this.field3025[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("gf.s(I)Lgf;")
    public final class200 method3570() {
        int var1 = -1;
        if (this.field3015 != -1) {
            var1 = class166.method203(this.field3015);
        } else if (this.field3039 != -1) {
            var1 = class166.field2166[this.field3039];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3019.length - 1) {
            var2 = this.field3019[var1];
        } else {
            var2 = this.field3019[this.field3019.length - 1];
        }
        return var2 == -1 ? null : method2965(var2);
    }

    @ObfuscatedName("gf.k(B)Z")
    public boolean method3575() {
        if (this.field3019 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3015 != -1) {
            var1 = class166.method203(this.field3015);
        } else if (this.field3039 != -1) {
            var1 = class166.field2166[this.field3039];
        }
        if (var1 >= 0 && var1 < this.field3019.length) {
            return this.field3019[var1] != -1;
        } else {
            return this.field3019[this.field3019.length - 1] != -1;
        }
    }
}
