package deob;

@ObfuscatedName("gl")
public class class200 extends class130 {

    @ObfuscatedName("gl.c")
    public static class125 field3010 = new class125(64);

    @ObfuscatedName("gl.l")
    public static class125 field3046 = new class125(50);

    @ObfuscatedName("gl.y")
    public int field3028;

    @ObfuscatedName("gl.j")
    public String field3013 = "null";

    @ObfuscatedName("gl.g")
    public int field3042 = 1;

    @ObfuscatedName("gl.s")
    public int[] field3015;

    @ObfuscatedName("gl.r")
    public int[] field3016;

    @ObfuscatedName("gl.t")
    public int field3017 = -1;

    @ObfuscatedName("gl.k")
    public int field3038 = -1;

    @ObfuscatedName("gl.f")
    public int field3025 = -1;

    @ObfuscatedName("gl.a")
    public int field3020 = -1;

    @ObfuscatedName("gl.v")
    public int field3021 = -1;

    @ObfuscatedName("gl.d")
    public int field3022 = -1;

    @ObfuscatedName("gl.o")
    public int field3023 = -1;

    @ObfuscatedName("gl.q")
    public short[] field3024;

    @ObfuscatedName("gl.i")
    public short[] field3045;

    @ObfuscatedName("gl.x")
    public short[] field3026;

    @ObfuscatedName("gl.z")
    public short[] field3019;

    @ObfuscatedName("gl.n")
    public String[] field3027 = new String[5];

    @ObfuscatedName("gl.w")
    public boolean field3029 = true;

    @ObfuscatedName("gl.h")
    public int field3011 = -1;

    @ObfuscatedName("gl.u")
    public int field3031 = 128;

    @ObfuscatedName("gl.m")
    public int field3032 = 128;

    @ObfuscatedName("gl.p")
    public boolean field3033 = false;

    @ObfuscatedName("gl.aq")
    public int field3034 = 0;

    @ObfuscatedName("gl.aj")
    public int field3008 = 0;

    @ObfuscatedName("gl.ae")
    public int field3036 = -1;

    @ObfuscatedName("gl.au")
    public int field3037 = 32;

    @ObfuscatedName("gl.aa")
    public int[] field3035;

    @ObfuscatedName("gl.af")
    public int field3039 = -1;

    @ObfuscatedName("gl.at")
    public int field3040 = -1;

    @ObfuscatedName("gl.ap")
    public boolean field3041 = true;

    @ObfuscatedName("gl.aw")
    public boolean field3012 = true;

    @ObfuscatedName("gl.ah")
    public boolean field3043 = false;

    @ObfuscatedName("x.b(Lgv;Lgv;I)V")
    public static void method209(class183 arg0, class183 arg1) {
        Statics.field3014 = arg0;
        Statics.field3009 = arg1;
    }

    @ObfuscatedName("gb.e(IB)Lgl;")
    public static class200 method3376(int arg0) {
        class200 var1 = (class200) field3010.method2246((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3014.method3126(9, arg0);
        class200 var3 = new class200();
        var3.field3028 = arg0;
        if (var2 != null) {
            var3.method3550(new class154(var2));
        }
        var3.method3538();
        field3010.method2250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gl.c(I)V")
    public void method3538() {
    }

    @ObfuscatedName("gl.l(Lec;I)V")
    public void method3550(class154 arg0) {
        while (true) {
            int var2 = arg0.method2669();
            if (var2 == 0) {
                return;
            }
            this.method3539(arg0, var2);
        }
    }

    @ObfuscatedName("gl.y(Lec;II)V")
    public void method3539(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2669();
            this.field3015 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3015[var4] = arg0.method2671();
            }
        } else if (arg1 == 2) {
            this.field3013 = arg0.method2677();
        } else if (arg1 == 12) {
            this.field3042 = arg0.method2669();
        } else if (arg1 == 13) {
            this.field3017 = arg0.method2671();
        } else if (arg1 == 14) {
            this.field3020 = arg0.method2671();
        } else if (arg1 == 15) {
            this.field3038 = arg0.method2671();
        } else if (arg1 == 16) {
            this.field3025 = arg0.method2671();
        } else if (arg1 == 17) {
            this.field3020 = arg0.method2671();
            this.field3021 = arg0.method2671();
            this.field3022 = arg0.method2671();
            this.field3023 = arg0.method2671();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3027[arg1 - 30] = arg0.method2677();
            if (this.field3027[arg1 - 30].equalsIgnoreCase(class174.field2467)) {
                this.field3027[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2669();
            this.field3024 = new short[var5];
            this.field3045 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3024[var6] = (short) arg0.method2671();
                this.field3045[var6] = (short) arg0.method2671();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2669();
            this.field3026 = new short[var7];
            this.field3019 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3026[var8] = (short) arg0.method2671();
                this.field3019[var8] = (short) arg0.method2671();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2669();
            this.field3016 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3016[var10] = arg0.method2671();
            }
        } else if (arg1 == 93) {
            this.field3029 = false;
        } else if (arg1 == 95) {
            this.field3011 = arg0.method2671();
        } else if (arg1 == 97) {
            this.field3031 = arg0.method2671();
        } else if (arg1 == 98) {
            this.field3032 = arg0.method2671();
        } else if (arg1 == 99) {
            this.field3033 = true;
        } else if (arg1 == 100) {
            this.field3034 = arg0.method2670();
        } else if (arg1 == 101) {
            this.field3008 = arg0.method2670();
        } else if (arg1 == 102) {
            this.field3036 = arg0.method2671();
        } else if (arg1 == 103) {
            this.field3037 = arg0.method2671();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3039 = arg0.method2671();
            if (this.field3039 == 65535) {
                this.field3039 = -1;
            }
            this.field3040 = arg0.method2671();
            if (this.field3040 == 65535) {
                this.field3040 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2671();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2669();
            this.field3035 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3035[var13] = arg0.method2671();
                if (this.field3035[var13] == 65535) {
                    this.field3035[var13] = -1;
                }
            }
            this.field3035[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3041 = false;
        } else if (arg1 == 109) {
            this.field3012 = false;
        } else if (arg1 == 111) {
            this.field3043 = true;
        }
    }

    @ObfuscatedName("gl.j(Lgn;ILgn;II)Lco;")
    public final class83 method3541(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field3035 != null) {
            class200 var5 = this.method3552();
            return var5 == null ? null : var5.method3541(arg0, arg1, arg2, arg3);
        }
        class83 var6 = (class83) field3046.method2246((long) this.field3028);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3015.length; var8++) {
                if (!Statics.field3009.method3202(this.field3015[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class77[] var9 = new class77[this.field3015.length];
            for (int var10 = 0; var10 < this.field3015.length; var10++) {
                var9[var10] = class77.method1409(Statics.field3009, this.field3015[var10], 0);
            }
            class77 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class77(var9, var9.length);
            }
            if (this.field3024 != null) {
                for (int var12 = 0; var12 < this.field3024.length; var12++) {
                    var11.method1480(this.field3024[var12], this.field3045[var12]);
                }
            }
            if (this.field3026 != null) {
                for (int var13 = 0; var13 < this.field3026.length; var13++) {
                    var11.method1423(this.field3026[var13], this.field3019[var13]);
                }
            }
            var6 = var11.method1457(this.field3034 + 64, this.field3008 * 5 + 850, -30, -50, -30);
            field3046.method2250(var6, (long) this.field3028);
        }
        class83 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3583(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3582(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1502(true);
        } else {
            var14 = arg2.method3582(var6, arg3);
        }
        if (this.field3031 != 128 || this.field3032 != 128) {
            var14.method1514(this.field3031, this.field3032, this.field3031);
        }
        return var14;
    }

    @ObfuscatedName("gl.t(I)Lbr;")
    public final class77 method3542() {
        if (this.field3035 != null) {
            class200 var1 = this.method3552();
            return var1 == null ? null : var1.method3542();
        } else if (this.field3016 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3016.length; var3++) {
                if (!Statics.field3009.method3202(this.field3016[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class77[] var4 = new class77[this.field3016.length];
            for (int var5 = 0; var5 < this.field3016.length; var5++) {
                var4[var5] = class77.method1409(Statics.field3009, this.field3016[var5], 0);
            }
            class77 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class77(var4, var4.length);
            }
            if (this.field3024 != null) {
                for (int var7 = 0; var7 < this.field3024.length; var7++) {
                    var6.method1480(this.field3024[var7], this.field3045[var7]);
                }
            }
            if (this.field3026 != null) {
                for (int var8 = 0; var8 < this.field3026.length; var8++) {
                    var6.method1423(this.field3026[var8], this.field3019[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("gl.k(B)Lgl;")
    public final class200 method3552() {
        int var1 = -1;
        if (this.field3039 != -1) {
            var1 = class166.method916(this.field3039);
        } else if (this.field3040 != -1) {
            var1 = class166.field2158[this.field3040];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3035.length - 1) {
            var2 = this.field3035[var1];
        } else {
            var2 = this.field3035[this.field3035.length - 1];
        }
        return var2 == -1 ? null : method3376(var2);
    }

    @ObfuscatedName("gl.f(B)Z")
    public boolean method3544() {
        if (this.field3035 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3039 != -1) {
            var1 = class166.method916(this.field3039);
        } else if (this.field3040 != -1) {
            var1 = class166.field2158[this.field3040];
        }
        if (var1 >= 0 && var1 < this.field3035.length) {
            return this.field3035[var1] != -1;
        } else {
            return this.field3035[this.field3035.length - 1] != -1;
        }
    }
}
