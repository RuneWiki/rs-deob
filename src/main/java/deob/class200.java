package deob;

@ObfuscatedName("ga")
public class class200 extends class130 {

    @ObfuscatedName("ga.f")
    public static class125 field3007 = new class125(64);

    @ObfuscatedName("ga.h")
    public static class125 field3008 = new class125(50);

    @ObfuscatedName("ga.a")
    public int field3009;

    @ObfuscatedName("ga.g")
    public String field3010 = "null";

    @ObfuscatedName("ga.k")
    public int field3011 = 1;

    @ObfuscatedName("ga.u")
    public int[] field3033;

    @ObfuscatedName("ga.b")
    public int[] field3016;

    @ObfuscatedName("ga.x")
    public int field3014 = -1;

    @ObfuscatedName("ga.r")
    public int field3037 = -1;

    @ObfuscatedName("ga.n")
    public int field3034 = -1;

    @ObfuscatedName("ga.m")
    public int field3017 = -1;

    @ObfuscatedName("ga.j")
    public int field3018 = -1;

    @ObfuscatedName("ga.w")
    public int field3019 = -1;

    @ObfuscatedName("ga.p")
    public int field3020 = -1;

    @ObfuscatedName("ga.o")
    public short[] field3021;

    @ObfuscatedName("ga.i")
    public short[] field3041;

    @ObfuscatedName("ga.z")
    public short[] field3023;

    @ObfuscatedName("ga.e")
    public short[] field3024;

    @ObfuscatedName("ga.d")
    public String[] field3025 = new String[5];

    @ObfuscatedName("ga.t")
    public boolean field3036 = true;

    @ObfuscatedName("ga.q")
    public int field3027 = -1;

    @ObfuscatedName("ga.y")
    public int field3028 = 128;

    @ObfuscatedName("ga.l")
    public int field3029 = 128;

    @ObfuscatedName("ga.v")
    public boolean field3030 = false;

    @ObfuscatedName("ga.az")
    public int field3031 = 0;

    @ObfuscatedName("ga.ai")
    public int field3032 = 0;

    @ObfuscatedName("ga.ad")
    public int field3022 = -1;

    @ObfuscatedName("ga.aa")
    public int field3015 = 32;

    @ObfuscatedName("ga.ao")
    public int[] field3005;

    @ObfuscatedName("ga.ax")
    public int field3035 = -1;

    @ObfuscatedName("ga.ae")
    public int field3026 = -1;

    @ObfuscatedName("ga.al")
    public boolean field3038 = true;

    @ObfuscatedName("ga.an")
    public boolean field3039 = true;

    @ObfuscatedName("ga.aw")
    public boolean field3040 = false;

    @ObfuscatedName("cn.s(Lgp;Lgp;B)V")
    public static void method1581(class183 arg0, class183 arg1) {
        Statics.field3013 = arg0;
        Statics.field3006 = arg1;
    }

    @ObfuscatedName("ga.f(I)V")
    public void method3367() {
    }

    @ObfuscatedName("ga.g(Lea;I)V")
    public void method3385(class154 arg0) {
        while (true) {
            int var2 = arg0.method2545();
            if (var2 == 0) {
                return;
            }
            this.method3369(arg0, var2);
        }
    }

    @ObfuscatedName("ga.k(Lea;IB)V")
    public void method3369(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2545();
            this.field3033 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3033[var4] = arg0.method2541();
            }
        } else if (arg1 == 2) {
            this.field3010 = arg0.method2734();
        } else if (arg1 == 12) {
            this.field3011 = arg0.method2545();
        } else if (arg1 == 13) {
            this.field3014 = arg0.method2541();
        } else if (arg1 == 14) {
            this.field3017 = arg0.method2541();
        } else if (arg1 == 15) {
            this.field3037 = arg0.method2541();
        } else if (arg1 == 16) {
            this.field3034 = arg0.method2541();
        } else if (arg1 == 17) {
            this.field3017 = arg0.method2541();
            this.field3018 = arg0.method2541();
            this.field3019 = arg0.method2541();
            this.field3020 = arg0.method2541();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3025[arg1 - 30] = arg0.method2734();
            if (this.field3025[arg1 - 30].equalsIgnoreCase(class174.field2486)) {
                this.field3025[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2545();
            this.field3021 = new short[var5];
            this.field3041 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3021[var6] = (short) arg0.method2541();
                this.field3041[var6] = (short) arg0.method2541();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2545();
            this.field3023 = new short[var7];
            this.field3024 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3023[var8] = (short) arg0.method2541();
                this.field3024[var8] = (short) arg0.method2541();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2545();
            this.field3016 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3016[var10] = arg0.method2541();
            }
        } else if (arg1 == 93) {
            this.field3036 = false;
        } else if (arg1 == 95) {
            this.field3027 = arg0.method2541();
        } else if (arg1 == 97) {
            this.field3028 = arg0.method2541();
        } else if (arg1 == 98) {
            this.field3029 = arg0.method2541();
        } else if (arg1 == 99) {
            this.field3030 = true;
        } else if (arg1 == 100) {
            this.field3031 = arg0.method2657();
        } else if (arg1 == 101) {
            this.field3032 = arg0.method2657();
        } else if (arg1 == 102) {
            this.field3022 = arg0.method2541();
        } else if (arg1 == 103) {
            this.field3015 = arg0.method2541();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3035 = arg0.method2541();
            if (this.field3035 == 65535) {
                this.field3035 = -1;
            }
            this.field3026 = arg0.method2541();
            if (this.field3026 == 65535) {
                this.field3026 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2541();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2545();
            this.field3005 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3005[var13] = arg0.method2541();
                if (this.field3005[var13] == 65535) {
                    this.field3005[var13] = -1;
                }
            }
            this.field3005[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3038 = false;
        } else if (arg1 == 109) {
            this.field3039 = false;
        } else if (arg1 == 111) {
            this.field3040 = true;
        }
    }

    @ObfuscatedName("ga.u(Lgx;ILgx;II)Lcz;")
    public final class83 method3388(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field3005 != null) {
            class200 var5 = this.method3373();
            return var5 == null ? null : var5.method3388(arg0, arg1, arg2, arg3);
        }
        class83 var6 = (class83) field3008.method2121((long) this.field3009);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3033.length; var8++) {
                if (!Statics.field3006.method2988(this.field3033[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class77[] var9 = new class77[this.field3033.length];
            for (int var10 = 0; var10 < this.field3033.length; var10++) {
                var9[var10] = class77.method1351(Statics.field3006, this.field3033[var10], 0);
            }
            class77 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class77(var9, var9.length);
            }
            if (this.field3021 != null) {
                for (int var12 = 0; var12 < this.field3021.length; var12++) {
                    var11.method1364(this.field3021[var12], this.field3041[var12]);
                }
            }
            if (this.field3023 != null) {
                for (int var13 = 0; var13 < this.field3023.length; var13++) {
                    var11.method1365(this.field3023[var13], this.field3024[var13]);
                }
            }
            var6 = var11.method1371(this.field3031 + 64, this.field3032 * 5 + 850, -30, -50, -30);
            field3008.method2123(var6, (long) this.field3009);
        }
        class83 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3435(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3408(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1444(true);
        } else {
            var14 = arg2.method3408(var6, arg3);
        }
        if (this.field3028 != 128 || this.field3029 != 128) {
            var14.method1471(this.field3028, this.field3029, this.field3028);
        }
        return var14;
    }

    @ObfuscatedName("ga.b(I)Lbu;")
    public final class77 method3371() {
        if (this.field3005 != null) {
            class200 var1 = this.method3373();
            return var1 == null ? null : var1.method3371();
        } else if (this.field3016 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3016.length; var3++) {
                if (!Statics.field3006.method2988(this.field3016[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class77[] var4 = new class77[this.field3016.length];
            for (int var5 = 0; var5 < this.field3016.length; var5++) {
                var4[var5] = class77.method1351(Statics.field3006, this.field3016[var5], 0);
            }
            class77 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class77(var4, var4.length);
            }
            if (this.field3021 != null) {
                for (int var7 = 0; var7 < this.field3021.length; var7++) {
                    var6.method1364(this.field3021[var7], this.field3041[var7]);
                }
            }
            if (this.field3023 != null) {
                for (int var8 = 0; var8 < this.field3023.length; var8++) {
                    var6.method1365(this.field3023[var8], this.field3024[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ga.x(B)Lga;")
    public final class200 method3373() {
        int var1 = -1;
        if (this.field3035 != -1) {
            var1 = class166.method175(this.field3035);
        } else if (this.field3026 != -1) {
            var1 = class166.field2176[this.field3026];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3005.length - 1) {
            var2 = this.field3005[var1];
        } else {
            var2 = this.field3005[this.field3005.length - 1];
        }
        return var2 == -1 ? null : Statics.method2743(var2);
    }

    @ObfuscatedName("ga.r(I)Z")
    public boolean method3370() {
        if (this.field3005 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3035 != -1) {
            var1 = class166.method175(this.field3035);
        } else if (this.field3026 != -1) {
            var1 = class166.field2176[this.field3026];
        }
        if (var1 >= 0 && var1 < this.field3005.length) {
            return this.field3005[var1] != -1;
        } else {
            return this.field3005[this.field3005.length - 1] != -1;
        }
    }
}
