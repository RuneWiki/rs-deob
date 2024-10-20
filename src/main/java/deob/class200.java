package deob;

@ObfuscatedName("gk")
public class class200 extends class130 {

    @ObfuscatedName("gk.h")
    public static class125 field3005 = new class125(64);

    @ObfuscatedName("gk.p")
    public static class125 field3027 = new class125(50);

    @ObfuscatedName("gk.j")
    public int field3009;

    @ObfuscatedName("gk.n")
    public String field3010 = "null";

    @ObfuscatedName("gk.r")
    public int field3011 = 1;

    @ObfuscatedName("gk.c")
    public int[] field3014;

    @ObfuscatedName("gk.i")
    public int[] field3021;

    @ObfuscatedName("gk.o")
    public int field3012 = -1;

    @ObfuscatedName("gk.m")
    public int field3013 = -1;

    @ObfuscatedName("gk.s")
    public int field3015 = -1;

    @ObfuscatedName("gk.u")
    public int field3038 = -1;

    @ObfuscatedName("gk.b")
    public int field3016 = -1;

    @ObfuscatedName("gk.v")
    public int field3017 = -1;

    @ObfuscatedName("gk.f")
    public int field3018 = -1;

    @ObfuscatedName("gk.z")
    public short[] field3019;

    @ObfuscatedName("gk.t")
    public short[] field3020;

    @ObfuscatedName("gk.y")
    public short[] field3031;

    @ObfuscatedName("gk.w")
    public short[] field3022;

    @ObfuscatedName("gk.a")
    public String[] field3023 = new String[5];

    @ObfuscatedName("gk.k")
    public boolean field3024 = true;

    @ObfuscatedName("gk.l")
    public int field3025 = -1;

    @ObfuscatedName("gk.x")
    public int field3026 = 128;

    @ObfuscatedName("gk.g")
    public int field3028 = 128;

    @ObfuscatedName("gk.e")
    public boolean field3007 = false;

    @ObfuscatedName("gk.ae")
    public int field3029 = 0;

    @ObfuscatedName("gk.aq")
    public int field3030 = 0;

    @ObfuscatedName("gk.at")
    public int field3008 = -1;

    @ObfuscatedName("gk.au")
    public int field3032 = 32;

    @ObfuscatedName("gk.am")
    public int[] field3033;

    @ObfuscatedName("gk.ad")
    public int field3034 = -1;

    @ObfuscatedName("gk.ai")
    public int field3035 = -1;

    @ObfuscatedName("gk.ac")
    public boolean field3036 = true;

    @ObfuscatedName("gk.ao")
    public boolean field3037 = true;

    @ObfuscatedName("gk.as")
    public boolean field3003 = false;

    @ObfuscatedName("b.q(II)Lgk;")
    public static class200 method175(int arg0) {
        class200 var1 = (class200) field3005.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3006.method3133(9, arg0);
        class200 var3 = new class200();
        var3.field3009 = arg0;
        if (var2 != null) {
            var3.method3544(new class154(var2));
        }
        var3.method3537();
        field3005.method2248(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gk.d(I)V")
    public void method3537() {
    }

    @ObfuscatedName("gk.h(Lel;I)V")
    public void method3544(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3539(arg0, var2);
        }
    }

    @ObfuscatedName("gk.p(Lel;II)V")
    public void method3539(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2666();
            this.field3014 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3014[var4] = arg0.method2668();
            }
        } else if (arg1 == 2) {
            this.field3010 = arg0.method2701();
        } else if (arg1 == 12) {
            this.field3011 = arg0.method2666();
        } else if (arg1 == 13) {
            this.field3012 = arg0.method2668();
        } else if (arg1 == 14) {
            this.field3038 = arg0.method2668();
        } else if (arg1 == 15) {
            this.field3013 = arg0.method2668();
        } else if (arg1 == 16) {
            this.field3015 = arg0.method2668();
        } else if (arg1 == 17) {
            this.field3038 = arg0.method2668();
            this.field3016 = arg0.method2668();
            this.field3017 = arg0.method2668();
            this.field3018 = arg0.method2668();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3023[arg1 - 30] = arg0.method2701();
            if (this.field3023[arg1 - 30].equalsIgnoreCase(class174.field2585)) {
                this.field3023[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2666();
            this.field3019 = new short[var5];
            this.field3020 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3019[var6] = (short) arg0.method2668();
                this.field3020[var6] = (short) arg0.method2668();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2666();
            this.field3031 = new short[var7];
            this.field3022 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3031[var8] = (short) arg0.method2668();
                this.field3022[var8] = (short) arg0.method2668();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2666();
            this.field3021 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3021[var10] = arg0.method2668();
            }
        } else if (arg1 == 93) {
            this.field3024 = false;
        } else if (arg1 == 95) {
            this.field3025 = arg0.method2668();
        } else if (arg1 == 97) {
            this.field3026 = arg0.method2668();
        } else if (arg1 == 98) {
            this.field3028 = arg0.method2668();
        } else if (arg1 == 99) {
            this.field3007 = true;
        } else if (arg1 == 100) {
            this.field3029 = arg0.method2835();
        } else if (arg1 == 101) {
            this.field3030 = arg0.method2835() * 5;
        } else if (arg1 == 102) {
            this.field3008 = arg0.method2668();
        } else if (arg1 == 103) {
            this.field3032 = arg0.method2668();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3034 = arg0.method2668();
            if (this.field3034 == 65535) {
                this.field3034 = -1;
            }
            this.field3035 = arg0.method2668();
            if (this.field3035 == 65535) {
                this.field3035 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2668();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2666();
            this.field3033 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3033[var13] = arg0.method2668();
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
            this.field3003 = true;
        }
    }

    @ObfuscatedName("gk.j(Lgf;ILgf;II)Lcf;")
    public final class83 method3548(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field3033 != null) {
            class200 var5 = this.method3542();
            return var5 == null ? null : var5.method3548(arg0, arg1, arg2, arg3);
        }
        class83 var6 = (class83) field3027.method2258((long) this.field3009);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3014.length; var8++) {
                if (!Statics.field3004.method3189(this.field3014[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class77[] var9 = new class77[this.field3014.length];
            for (int var10 = 0; var10 < this.field3014.length; var10++) {
                var9[var10] = class77.method1494(Statics.field3004, this.field3014[var10], 0);
            }
            class77 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class77(var9, var9.length);
            }
            if (this.field3019 != null) {
                for (int var12 = 0; var12 < this.field3019.length; var12++) {
                    var11.method1461(this.field3019[var12], this.field3020[var12]);
                }
            }
            if (this.field3031 != null) {
                for (int var13 = 0; var13 < this.field3031.length; var13++) {
                    var11.method1499(this.field3031[var13], this.field3022[var13]);
                }
            }
            var6 = var11.method1469(this.field3029 + 64, this.field3030 + 850, -30, -50, -30);
            field3027.method2248(var6, (long) this.field3009);
        }
        class83 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3589(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3600(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1549(true);
        } else {
            var14 = arg2.method3600(var6, arg3);
        }
        if (this.field3026 != 128 || this.field3028 != 128) {
            var14.method1563(this.field3026, this.field3028, this.field3026);
        }
        return var14;
    }

    @ObfuscatedName("gk.n(I)Lbx;")
    public final class77 method3547() {
        if (this.field3033 != null) {
            class200 var1 = this.method3542();
            return var1 == null ? null : var1.method3547();
        } else if (this.field3021 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3021.length; var3++) {
                if (!Statics.field3004.method3189(this.field3021[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class77[] var4 = new class77[this.field3021.length];
            for (int var5 = 0; var5 < this.field3021.length; var5++) {
                var4[var5] = class77.method1494(Statics.field3004, this.field3021[var5], 0);
            }
            class77 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class77(var4, var4.length);
            }
            if (this.field3019 != null) {
                for (int var7 = 0; var7 < this.field3019.length; var7++) {
                    var6.method1461(this.field3019[var7], this.field3020[var7]);
                }
            }
            if (this.field3031 != null) {
                for (int var8 = 0; var8 < this.field3031.length; var8++) {
                    var6.method1499(this.field3031[var8], this.field3022[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("gk.c(I)Lgk;")
    public final class200 method3542() {
        int var1 = -1;
        if (this.field3034 != -1) {
            var1 = class166.method2011(this.field3034);
        } else if (this.field3035 != -1) {
            var1 = class166.field2163[this.field3035];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3033.length - 1) {
            var2 = this.field3033[var1];
        } else {
            var2 = this.field3033[this.field3033.length - 1];
        }
        return var2 == -1 ? null : method175(var2);
    }

    @ObfuscatedName("gk.o(I)Z")
    public boolean method3543() {
        if (this.field3033 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3034 != -1) {
            var1 = class166.method2011(this.field3034);
        } else if (this.field3035 != -1) {
            var1 = class166.field2163[this.field3035];
        }
        if (var1 >= 0 && var1 < this.field3033.length) {
            return this.field3033[var1] != -1;
        } else {
            return this.field3033[this.field3033.length - 1] != -1;
        }
    }

    @ObfuscatedName("f.s(I)V")
    public static void method185() {
        field3005.method2249();
        field3027.method2249();
    }
}
