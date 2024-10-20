package deob;

@ObfuscatedName("gv")
public class class200 extends class130 {

    @ObfuscatedName("gv.u")
    public static class125 field3027 = new class125(64);

    @ObfuscatedName("gv.h")
    public static class125 field3009 = new class125(50);

    @ObfuscatedName("gv.r")
    public int field3010;

    @ObfuscatedName("gv.o")
    public String field3011 = "null";

    @ObfuscatedName("gv.l")
    public int field3012 = 1;

    @ObfuscatedName("gv.n")
    public int[] field3013;

    @ObfuscatedName("gv.m")
    public int[] field3006;

    @ObfuscatedName("gv.w")
    public int field3015 = -1;

    @ObfuscatedName("gv.j")
    public int field3039 = -1;

    @ObfuscatedName("gv.s")
    public int field3017 = -1;

    @ObfuscatedName("gv.q")
    public int field3018 = -1;

    @ObfuscatedName("gv.d")
    public int field3019 = -1;

    @ObfuscatedName("gv.p")
    public int field3020 = -1;

    @ObfuscatedName("gv.y")
    public int field3032 = -1;

    @ObfuscatedName("gv.a")
    public short[] field3022;

    @ObfuscatedName("gv.v")
    public short[] field3007;

    @ObfuscatedName("gv.z")
    public short[] field3024;

    @ObfuscatedName("gv.x")
    public short[] field3025;

    @ObfuscatedName("gv.g")
    public String[] field3026 = new String[5];

    @ObfuscatedName("gv.b")
    public boolean field3042 = true;

    @ObfuscatedName("gv.k")
    public int field3028 = -1;

    @ObfuscatedName("gv.t")
    public int field3029 = 128;

    @ObfuscatedName("gv.c")
    public int field3030 = 128;

    @ObfuscatedName("gv.e")
    public boolean field3031 = false;

    @ObfuscatedName("gv.am")
    public int field3014 = 0;

    @ObfuscatedName("gv.an")
    public int field3033 = 0;

    @ObfuscatedName("gv.aq")
    public int field3034 = -1;

    @ObfuscatedName("gv.ah")
    public int field3035 = 32;

    @ObfuscatedName("gv.ag")
    public int[] field3036;

    @ObfuscatedName("gv.ab")
    public int field3041 = -1;

    @ObfuscatedName("gv.aw")
    public int field3038 = -1;

    @ObfuscatedName("gv.ax")
    public boolean field3021 = true;

    @ObfuscatedName("gv.ar")
    public boolean field3040 = true;

    @ObfuscatedName("gv.ak")
    public boolean field3008 = false;

    @ObfuscatedName("y.f(II)Lgv;")
    public static class200 method168(int arg0) {
        class200 var1 = (class200) field3027.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3023.method3163(9, arg0);
        class200 var3 = new class200();
        var3.field3010 = arg0;
        if (var2 != null) {
            var3.method3513(new class154(var2));
        }
        var3.method3528();
        field3027.method2246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gv.i(I)V")
    public void method3528() {
    }

    @ObfuscatedName("gv.u(Leo;I)V")
    public void method3513(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3524(arg0, var2);
        }
    }

    @ObfuscatedName("gv.r(Leo;II)V")
    public void method3524(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2666();
            this.field3013 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3013[var4] = arg0.method2668();
            }
        } else if (arg1 == 2) {
            this.field3011 = arg0.method2674();
        } else if (arg1 == 12) {
            this.field3012 = arg0.method2666();
        } else if (arg1 == 13) {
            this.field3015 = arg0.method2668();
        } else if (arg1 == 14) {
            this.field3018 = arg0.method2668();
        } else if (arg1 == 15) {
            this.field3039 = arg0.method2668();
        } else if (arg1 == 16) {
            this.field3017 = arg0.method2668();
        } else if (arg1 == 17) {
            this.field3018 = arg0.method2668();
            this.field3019 = arg0.method2668();
            this.field3020 = arg0.method2668();
            this.field3032 = arg0.method2668();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3026[arg1 - 30] = arg0.method2674();
            if (this.field3026[arg1 - 30].equalsIgnoreCase(class174.field2378)) {
                this.field3026[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2666();
            this.field3022 = new short[var5];
            this.field3007 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3022[var6] = (short) arg0.method2668();
                this.field3007[var6] = (short) arg0.method2668();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2666();
            this.field3024 = new short[var7];
            this.field3025 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3024[var8] = (short) arg0.method2668();
                this.field3025[var8] = (short) arg0.method2668();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2666();
            this.field3006 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3006[var10] = arg0.method2668();
            }
        } else if (arg1 == 93) {
            this.field3042 = false;
        } else if (arg1 == 95) {
            this.field3028 = arg0.method2668();
        } else if (arg1 == 97) {
            this.field3029 = arg0.method2668();
        } else if (arg1 == 98) {
            this.field3030 = arg0.method2668();
        } else if (arg1 == 99) {
            this.field3031 = true;
        } else if (arg1 == 100) {
            this.field3014 = arg0.method2667();
        } else if (arg1 == 101) {
            this.field3033 = arg0.method2667() * 5;
        } else if (arg1 == 102) {
            this.field3034 = arg0.method2668();
        } else if (arg1 == 103) {
            this.field3035 = arg0.method2668();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3041 = arg0.method2668();
            if (this.field3041 == 65535) {
                this.field3041 = -1;
            }
            this.field3038 = arg0.method2668();
            if (this.field3038 == 65535) {
                this.field3038 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2668();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2666();
            this.field3036 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3036[var13] = arg0.method2668();
                if (this.field3036[var13] == 65535) {
                    this.field3036[var13] = -1;
                }
            }
            this.field3036[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3021 = false;
        } else if (arg1 == 109) {
            this.field3040 = false;
        } else if (arg1 == 111) {
            this.field3008 = true;
        }
    }

    @ObfuscatedName("gv.o(Lgl;ILgl;IB)Lce;")
    public final class83 method3515(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field3036 != null) {
            class200 var5 = this.method3517();
            return var5 == null ? null : var5.method3515(arg0, arg1, arg2, arg3);
        }
        class83 var6 = (class83) field3009.method2240((long) this.field3010);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3013.length; var8++) {
                if (!Statics.field3037.method3119(this.field3013[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class77[] var9 = new class77[this.field3013.length];
            for (int var10 = 0; var10 < this.field3013.length; var10++) {
                var9[var10] = class77.method1408(Statics.field3037, this.field3013[var10], 0);
            }
            class77 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class77(var9, var9.length);
            }
            if (this.field3022 != null) {
                for (int var12 = 0; var12 < this.field3022.length; var12++) {
                    var11.method1422(this.field3022[var12], this.field3007[var12]);
                }
            }
            if (this.field3024 != null) {
                for (int var13 = 0; var13 < this.field3024.length; var13++) {
                    var11.method1423(this.field3024[var13], this.field3025[var13]);
                }
            }
            var6 = var11.method1437(this.field3014 + 64, this.field3033 + 850, -30, -50, -30);
            field3009.method2246(var6, (long) this.field3010);
        }
        class83 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3568(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3565(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1497(true);
        } else {
            var14 = arg2.method3565(var6, arg3);
        }
        if (this.field3029 != 128 || this.field3030 != 128) {
            var14.method1527(this.field3029, this.field3030, this.field3029);
        }
        return var14;
    }

    @ObfuscatedName("gv.l(B)Lbp;")
    public final class77 method3516() {
        if (this.field3036 != null) {
            class200 var1 = this.method3517();
            return var1 == null ? null : var1.method3516();
        } else if (this.field3006 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3006.length; var3++) {
                if (!Statics.field3037.method3119(this.field3006[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class77[] var4 = new class77[this.field3006.length];
            for (int var5 = 0; var5 < this.field3006.length; var5++) {
                var4[var5] = class77.method1408(Statics.field3037, this.field3006[var5], 0);
            }
            class77 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class77(var4, var4.length);
            }
            if (this.field3022 != null) {
                for (int var7 = 0; var7 < this.field3022.length; var7++) {
                    var6.method1422(this.field3022[var7], this.field3007[var7]);
                }
            }
            if (this.field3024 != null) {
                for (int var8 = 0; var8 < this.field3024.length; var8++) {
                    var6.method1423(this.field3024[var8], this.field3025[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("gv.n(B)Lgv;")
    public final class200 method3517() {
        int var1 = -1;
        if (this.field3041 != -1) {
            var1 = class166.method561(this.field3041);
        } else if (this.field3038 != -1) {
            var1 = class166.field2181[this.field3038];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3036.length - 1) {
            var2 = this.field3036[var1];
        } else {
            var2 = this.field3036[this.field3036.length - 1];
        }
        return var2 == -1 ? null : method168(var2);
    }

    @ObfuscatedName("gv.m(I)Z")
    public boolean method3518() {
        if (this.field3036 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3041 != -1) {
            var1 = class166.method561(this.field3041);
        } else if (this.field3038 != -1) {
            var1 = class166.field2181[this.field3038];
        }
        if (var1 >= 0 && var1 < this.field3036.length) {
            return this.field3036[var1] != -1;
        } else {
            return this.field3036[this.field3036.length - 1] != -1;
        }
    }
}
