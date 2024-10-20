package deob;

@ObfuscatedName("gi")
public class class200 extends class130 {

    @ObfuscatedName("gi.i")
    public static class125 field3007 = new class125(64);

    @ObfuscatedName("gi.t")
    public static class125 field3010 = new class125(50);

    @ObfuscatedName("gi.k")
    public int field3027;

    @ObfuscatedName("gi.h")
    public String field3012 = "null";

    @ObfuscatedName("gi.n")
    public int field3013 = 1;

    @ObfuscatedName("gi.f")
    public int[] field3024;

    @ObfuscatedName("gi.a")
    public int[] field3015;

    @ObfuscatedName("gi.r")
    public int field3019 = -1;

    @ObfuscatedName("gi.x")
    public int field3017 = -1;

    @ObfuscatedName("gi.z")
    public int field3018 = -1;

    @ObfuscatedName("gi.p")
    public int field3037 = -1;

    @ObfuscatedName("gi.s")
    public int field3020 = -1;

    @ObfuscatedName("gi.o")
    public int field3021 = -1;

    @ObfuscatedName("gi.y")
    public int field3022 = -1;

    @ObfuscatedName("gi.w")
    public short[] field3023;

    @ObfuscatedName("gi.m")
    public short[] field3033;

    @ObfuscatedName("gi.u")
    public short[] field3025;

    @ObfuscatedName("gi.q")
    public short[] field3026;

    @ObfuscatedName("gi.c")
    public String[] field3009 = new String[5];

    @ObfuscatedName("gi.v")
    public boolean field3028 = true;

    @ObfuscatedName("gi.e")
    public int field3029 = -1;

    @ObfuscatedName("gi.j")
    public int field3031 = 128;

    @ObfuscatedName("gi.d")
    public int field3014 = 128;

    @ObfuscatedName("gi.g")
    public boolean field3016 = false;

    @ObfuscatedName("gi.ap")
    public int field3011 = 0;

    @ObfuscatedName("gi.aj")
    public int field3034 = 0;

    @ObfuscatedName("gi.ab")
    public int field3035 = -1;

    @ObfuscatedName("gi.af")
    public int field3039 = 32;

    @ObfuscatedName("gi.aw")
    public int[] field3036;

    @ObfuscatedName("gi.ac")
    public int field3032 = -1;

    @ObfuscatedName("gi.an")
    public int field3041 = -1;

    @ObfuscatedName("gi.ae")
    public boolean field3040 = true;

    @ObfuscatedName("gi.au")
    public boolean field3030 = true;

    @ObfuscatedName("gi.am")
    public boolean field3042 = false;

    @ObfuscatedName("dg.b(Lgj;Lgj;B)V")
    public static void method2038(class183 arg0, class183 arg1) {
        Statics.field3038 = arg0;
        Statics.field3008 = arg1;
    }

    @ObfuscatedName("ao.l(II)Lgi;")
    public static class200 method960(int arg0) {
        class200 var1 = (class200) field3007.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3038.method3226(9, arg0);
        class200 var3 = new class200();
        var3.field3027 = arg0;
        if (var2 != null) {
            var3.method3599(new class154(var2));
        }
        var3.method3598();
        field3007.method2258(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gi.i(B)V")
    public void method3598() {
    }

    @ObfuscatedName("gi.t(Leg;I)V")
    public void method3599(class154 arg0) {
        while (true) {
            int var2 = arg0.method2678();
            if (var2 == 0) {
                return;
            }
            this.method3613(arg0, var2);
        }
    }

    @ObfuscatedName("gi.k(Leg;II)V")
    public void method3613(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2678();
            this.field3024 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3024[var4] = arg0.method2801();
            }
        } else if (arg1 == 2) {
            this.field3012 = arg0.method2686();
        } else if (arg1 == 12) {
            this.field3013 = arg0.method2678();
        } else if (arg1 == 13) {
            this.field3019 = arg0.method2801();
        } else if (arg1 == 14) {
            this.field3037 = arg0.method2801();
        } else if (arg1 == 15) {
            this.field3017 = arg0.method2801();
        } else if (arg1 == 16) {
            this.field3018 = arg0.method2801();
        } else if (arg1 == 17) {
            this.field3037 = arg0.method2801();
            this.field3020 = arg0.method2801();
            this.field3021 = arg0.method2801();
            this.field3022 = arg0.method2801();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3009[arg1 - 30] = arg0.method2686();
            if (this.field3009[arg1 - 30].equalsIgnoreCase(class174.field2358)) {
                this.field3009[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2678();
            this.field3023 = new short[var5];
            this.field3033 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3023[var6] = (short) arg0.method2801();
                this.field3033[var6] = (short) arg0.method2801();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2678();
            this.field3025 = new short[var7];
            this.field3026 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3025[var8] = (short) arg0.method2801();
                this.field3026[var8] = (short) arg0.method2801();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2678();
            this.field3015 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3015[var10] = arg0.method2801();
            }
        } else if (arg1 == 93) {
            this.field3028 = false;
        } else if (arg1 == 95) {
            this.field3029 = arg0.method2801();
        } else if (arg1 == 97) {
            this.field3031 = arg0.method2801();
        } else if (arg1 == 98) {
            this.field3014 = arg0.method2801();
        } else if (arg1 == 99) {
            this.field3016 = true;
        } else if (arg1 == 100) {
            this.field3011 = arg0.method2679();
        } else if (arg1 == 101) {
            this.field3034 = arg0.method2679();
        } else if (arg1 == 102) {
            this.field3035 = arg0.method2801();
        } else if (arg1 == 103) {
            this.field3039 = arg0.method2801();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3032 = arg0.method2801();
            if (this.field3032 == 65535) {
                this.field3032 = -1;
            }
            this.field3041 = arg0.method2801();
            if (this.field3041 == 65535) {
                this.field3041 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2801();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2678();
            this.field3036 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3036[var13] = arg0.method2801();
                if (this.field3036[var13] == 65535) {
                    this.field3036[var13] = -1;
                }
            }
            this.field3036[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3040 = false;
        } else if (arg1 == 109) {
            this.field3030 = false;
        } else if (arg1 == 111) {
            this.field3042 = true;
        }
    }

    @ObfuscatedName("gi.x(Lgb;ILgb;IB)Lcs;")
    public final class83 method3600(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field3036 != null) {
            class200 var5 = this.method3602();
            return var5 == null ? null : var5.method3600(arg0, arg1, arg2, arg3);
        }
        class83 var6 = (class83) field3010.method2256((long) this.field3027);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3024.length; var8++) {
                if (!Statics.field3008.method3215(this.field3024[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class77[] var9 = new class77[this.field3024.length];
            for (int var10 = 0; var10 < this.field3024.length; var10++) {
                var9[var10] = class77.method1486(Statics.field3008, this.field3024[var10], 0);
            }
            class77 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class77(var9, var9.length);
            }
            if (this.field3023 != null) {
                for (int var12 = 0; var12 < this.field3023.length; var12++) {
                    var11.method1502(this.field3023[var12], this.field3033[var12]);
                }
            }
            if (this.field3025 != null) {
                for (int var13 = 0; var13 < this.field3025.length; var13++) {
                    var11.method1464(this.field3025[var13], this.field3026[var13]);
                }
            }
            var6 = var11.method1467(this.field3011 + 64, this.field3034 * 5 + 850, -30, -50, -30);
            field3010.method2258(var6, (long) this.field3027);
        }
        class83 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3676(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3653(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1533(true);
        } else {
            var14 = arg2.method3653(var6, arg3);
        }
        if (this.field3031 != 128 || this.field3014 != 128) {
            var14.method1571(this.field3031, this.field3014, this.field3031);
        }
        return var14;
    }

    @ObfuscatedName("gi.z(I)Lbh;")
    public final class77 method3608() {
        if (this.field3036 != null) {
            class200 var1 = this.method3602();
            return var1 == null ? null : var1.method3608();
        } else if (this.field3015 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3015.length; var3++) {
                if (!Statics.field3008.method3215(this.field3015[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class77[] var4 = new class77[this.field3015.length];
            for (int var5 = 0; var5 < this.field3015.length; var5++) {
                var4[var5] = class77.method1486(Statics.field3008, this.field3015[var5], 0);
            }
            class77 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class77(var4, var4.length);
            }
            if (this.field3023 != null) {
                for (int var7 = 0; var7 < this.field3023.length; var7++) {
                    var6.method1502(this.field3023[var7], this.field3033[var7]);
                }
            }
            if (this.field3025 != null) {
                for (int var8 = 0; var8 < this.field3025.length; var8++) {
                    var6.method1464(this.field3025[var8], this.field3026[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("gi.p(I)Lgi;")
    public final class200 method3602() {
        int var1 = -1;
        if (this.field3032 != -1) {
            var1 = class166.method2904(this.field3032);
        } else if (this.field3041 != -1) {
            var1 = class166.field2156[this.field3041];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3036.length - 1) {
            var2 = this.field3036[var1];
        } else {
            var2 = this.field3036[this.field3036.length - 1];
        }
        return var2 == -1 ? null : method960(var2);
    }

    @ObfuscatedName("gi.s(I)Z")
    public boolean method3601() {
        if (this.field3036 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3032 != -1) {
            var1 = class166.method2904(this.field3032);
        } else if (this.field3041 != -1) {
            var1 = class166.field2156[this.field3041];
        }
        if (var1 >= 0 && var1 < this.field3036.length) {
            return this.field3036[var1] != -1;
        } else {
            return this.field3036[this.field3036.length - 1] != -1;
        }
    }
}
