package deob;

@ObfuscatedName("gw")
public class class200 extends class130 {

    @ObfuscatedName("gw.c")
    public static class125 field3014 = new class125(64);

    @ObfuscatedName("gw.d")
    public static class125 field3008 = new class125(50);

    @ObfuscatedName("gw.w")
    public int field3007;

    @ObfuscatedName("gw.h")
    public String field3028 = "null";

    @ObfuscatedName("gw.u")
    public int field3009 = 1;

    @ObfuscatedName("gw.k")
    public int[] field3010;

    @ObfuscatedName("gw.g")
    public int[] field3011;

    @ObfuscatedName("gw.y")
    public int field3012 = -1;

    @ObfuscatedName("gw.e")
    public int field3039 = -1;

    @ObfuscatedName("gw.q")
    public int field3020 = -1;

    @ObfuscatedName("gw.v")
    public int field3034 = -1;

    @ObfuscatedName("gw.l")
    public int field3016 = -1;

    @ObfuscatedName("gw.s")
    public int field3006 = -1;

    @ObfuscatedName("gw.r")
    public int field3018 = -1;

    @ObfuscatedName("gw.m")
    public short[] field3019;

    @ObfuscatedName("gw.i")
    public short[] field3015;

    @ObfuscatedName("gw.f")
    public short[] field3021;

    @ObfuscatedName("gw.b")
    public short[] field3022;

    @ObfuscatedName("gw.t")
    public String[] field3023 = new String[5];

    @ObfuscatedName("gw.z")
    public boolean field3024 = true;

    @ObfuscatedName("gw.p")
    public int field3025 = -1;

    @ObfuscatedName("gw.n")
    public int field3005 = 128;

    @ObfuscatedName("gw.a")
    public int field3017 = 128;

    @ObfuscatedName("gw.o")
    public boolean field3026 = false;

    @ObfuscatedName("gw.an")
    public int field3029 = 0;

    @ObfuscatedName("gw.ar")
    public int field3030 = 0;

    @ObfuscatedName("gw.aa")
    public int field3031 = -1;

    @ObfuscatedName("gw.af")
    public int field3032 = 32;

    @ObfuscatedName("gw.ax")
    public int[] field3033;

    @ObfuscatedName("gw.ah")
    public int field3027 = -1;

    @ObfuscatedName("gw.az")
    public int field3035 = -1;

    @ObfuscatedName("gw.at")
    public boolean field3036 = true;

    @ObfuscatedName("gw.ab")
    public boolean field3037 = true;

    @ObfuscatedName("gw.ae")
    public boolean field3038 = false;

    @ObfuscatedName("fi.x(Lgk;Lgk;I)V")
    public static void method3091(class183 arg0, class183 arg1) {
        Statics.field3003 = arg0;
        Statics.field3004 = arg1;
    }

    @ObfuscatedName("cf.j(II)Lgw;")
    public static class200 method1605(int arg0) {
        class200 var1 = (class200) field3014.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3003.method3121(9, arg0);
        class200 var3 = new class200();
        var3.field3007 = arg0;
        if (var2 != null) {
            var3.method3493(new class154(var2));
        }
        var3.method3517();
        field3014.method2223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gw.c(I)V")
    public void method3517() {
    }

    @ObfuscatedName("gw.d(Lek;I)V")
    public void method3493(class154 arg0) {
        while (true) {
            int var2 = arg0.method2701();
            if (var2 == 0) {
                return;
            }
            this.method3524(arg0, var2);
        }
    }

    @ObfuscatedName("gw.w(Lek;IB)V")
    public void method3524(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2701();
            this.field3010 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3010[var4] = arg0.method2745();
            }
        } else if (arg1 == 2) {
            this.field3028 = arg0.method2699();
        } else if (arg1 == 12) {
            this.field3009 = arg0.method2701();
        } else if (arg1 == 13) {
            this.field3012 = arg0.method2745();
        } else if (arg1 == 14) {
            this.field3034 = arg0.method2745();
        } else if (arg1 == 15) {
            this.field3039 = arg0.method2745();
        } else if (arg1 == 16) {
            this.field3020 = arg0.method2745();
        } else if (arg1 == 17) {
            this.field3034 = arg0.method2745();
            this.field3016 = arg0.method2745();
            this.field3006 = arg0.method2745();
            this.field3018 = arg0.method2745();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3023[arg1 - 30] = arg0.method2699();
            if (this.field3023[arg1 - 30].equalsIgnoreCase(class174.field2347)) {
                this.field3023[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2701();
            this.field3019 = new short[var5];
            this.field3015 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3019[var6] = (short) arg0.method2745();
                this.field3015[var6] = (short) arg0.method2745();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2701();
            this.field3021 = new short[var7];
            this.field3022 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3021[var8] = (short) arg0.method2745();
                this.field3022[var8] = (short) arg0.method2745();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2701();
            this.field3011 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3011[var10] = arg0.method2745();
            }
        } else if (arg1 == 93) {
            this.field3024 = false;
        } else if (arg1 == 95) {
            this.field3025 = arg0.method2745();
        } else if (arg1 == 97) {
            this.field3005 = arg0.method2745();
        } else if (arg1 == 98) {
            this.field3017 = arg0.method2745();
        } else if (arg1 == 99) {
            this.field3026 = true;
        } else if (arg1 == 100) {
            this.field3029 = arg0.method2640();
        } else if (arg1 == 101) {
            this.field3030 = arg0.method2640() * 5;
        } else if (arg1 == 102) {
            this.field3031 = arg0.method2745();
        } else if (arg1 == 103) {
            this.field3032 = arg0.method2745();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3027 = arg0.method2745();
            if (this.field3027 == 65535) {
                this.field3027 = -1;
            }
            this.field3035 = arg0.method2745();
            if (this.field3035 == 65535) {
                this.field3035 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2745();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2701();
            this.field3033 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3033[var13] = arg0.method2745();
                if (this.field3033[var13] == 65535) {
                    this.field3033[var13] = -1;
                }
            }
            this.field3033[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3036 = false;
        } else if (arg1 == 109) {
            this.field3037 = false;
        } else if (arg1 == 111) {
            this.field3038 = true;
        }
    }

    @ObfuscatedName("gw.u(Lgy;ILgy;IB)Lcj;")
    public final class83 method3495(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field3033 != null) {
            class200 var5 = this.method3506();
            return var5 == null ? null : var5.method3495(arg0, arg1, arg2, arg3);
        }
        class83 var6 = (class83) field3008.method2221((long) this.field3007);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3010.length; var8++) {
                if (!Statics.field3004.method3166(this.field3010[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class77[] var9 = new class77[this.field3010.length];
            for (int var10 = 0; var10 < this.field3010.length; var10++) {
                var9[var10] = class77.method1437(Statics.field3004, this.field3010[var10], 0);
            }
            class77 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class77(var9, var9.length);
            }
            if (this.field3019 != null) {
                for (int var12 = 0; var12 < this.field3019.length; var12++) {
                    var11.method1470(this.field3019[var12], this.field3015[var12]);
                }
            }
            if (this.field3021 != null) {
                for (int var13 = 0; var13 < this.field3021.length; var13++) {
                    var11.method1451(this.field3021[var13], this.field3022[var13]);
                }
            }
            var6 = var11.method1458(this.field3029 + 64, this.field3030 + 850, -30, -50, -30);
            field3008.method2223(var6, (long) this.field3007);
        }
        class83 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3564(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3550(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1529(true);
        } else {
            var14 = arg2.method3550(var6, arg3);
        }
        if (this.field3005 != 128 || this.field3017 != 128) {
            var14.method1542(this.field3005, this.field3017, this.field3005);
        }
        return var14;
    }

    @ObfuscatedName("gw.y(I)Lbg;")
    public final class77 method3496() {
        if (this.field3033 != null) {
            class200 var1 = this.method3506();
            return var1 == null ? null : var1.method3496();
        } else if (this.field3011 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3011.length; var3++) {
                if (!Statics.field3004.method3166(this.field3011[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class77[] var4 = new class77[this.field3011.length];
            for (int var5 = 0; var5 < this.field3011.length; var5++) {
                var4[var5] = class77.method1437(Statics.field3004, this.field3011[var5], 0);
            }
            class77 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class77(var4, var4.length);
            }
            if (this.field3019 != null) {
                for (int var7 = 0; var7 < this.field3019.length; var7++) {
                    var6.method1470(this.field3019[var7], this.field3015[var7]);
                }
            }
            if (this.field3021 != null) {
                for (int var8 = 0; var8 < this.field3021.length; var8++) {
                    var6.method1451(this.field3021[var8], this.field3022[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("gw.e(I)Lgw;")
    public final class200 method3506() {
        int var1 = -1;
        if (this.field3027 != -1) {
            var1 = class166.method1852(this.field3027);
        } else if (this.field3035 != -1) {
            var1 = class166.field2154[this.field3035];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3033.length - 1) {
            var2 = this.field3033[var1];
        } else {
            var2 = this.field3033[this.field3033.length - 1];
        }
        return var2 == -1 ? null : method1605(var2);
    }

    @ObfuscatedName("gw.q(I)Z")
    public boolean method3498() {
        if (this.field3033 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3027 != -1) {
            var1 = class166.method1852(this.field3027);
        } else if (this.field3035 != -1) {
            var1 = class166.field2154[this.field3035];
        }
        if (var1 >= 0 && var1 < this.field3033.length) {
            return this.field3033[var1] != -1;
        } else {
            return this.field3033[this.field3033.length - 1] != -1;
        }
    }

    @ObfuscatedName("z.v(B)V")
    public static void method231() {
        field3014.method2225();
        field3008.method2225();
    }
}
