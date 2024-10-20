package deob;

@ObfuscatedName("ah")
public class class184 extends class7 {

    @ObfuscatedName("ah.f")
    public short[] field2842;

    @ObfuscatedName("ah.g")
    public int field2830 = -1;

    @ObfuscatedName("ah.d")
    public int[] field2822;

    @ObfuscatedName("ah.e")
    public int field2845 = -1;

    @ObfuscatedName("ah.b")
    public static class75 field2817 = new class75(64);

    @ObfuscatedName("ah.a")
    public int field2827 = -1;

    @ObfuscatedName("ah.n")
    public int field2833 = 128;

    @ObfuscatedName("ah.o")
    public short[] field2831;

    @ObfuscatedName("ah.l")
    public int field2838 = 128;

    @ObfuscatedName("ah.m")
    public int field2821;

    @ObfuscatedName("ah.j")
    public int[] field2826;

    @ObfuscatedName("ah.k")
    public int field2828 = -1;

    @ObfuscatedName("ah.h")
    public short[] field2834;

    @ObfuscatedName("ah.i")
    public static class75 field2818 = new class75(50);

    @ObfuscatedName("ah.w")
    public boolean field2823 = true;

    @ObfuscatedName("ah.u")
    public int field2836 = -1;

    @ObfuscatedName("ah.t")
    public String[] field2835 = new String[5];

    @ObfuscatedName("ah.s")
    public short[] field2824;

    @ObfuscatedName("ah.r")
    public int field2837 = -1;

    @ObfuscatedName("ah.q")
    public boolean field2840 = false;

    @ObfuscatedName("ah.p")
    public int field2839 = -1;

    @ObfuscatedName("ah.z")
    public String field2820 = "null";

    @ObfuscatedName("ah.y")
    public int field2825 = -1;

    @ObfuscatedName("ah.x")
    public int field2829 = 1;

    @ObfuscatedName("ah.as")
    public int field2841 = 0;

    @ObfuscatedName("ah.ar")
    public boolean field2848 = true;

    @ObfuscatedName("ah.ax")
    public int field2843 = -1;

    @ObfuscatedName("ah.ai")
    public boolean field2815 = true;

    @ObfuscatedName("ah.ao")
    public int field2844 = 32;

    @ObfuscatedName("ah.an")
    public int field2847 = -1;

    @ObfuscatedName("ah.ac")
    public int field2832 = 0;

    @ObfuscatedName("ah.aa")
    public int field2846 = -1;

    @ObfuscatedName("ah.ah")
    public int[] field2819;

    @ObfuscatedName("ah.b(I)V")
    public void method3433() {
    }

    @ObfuscatedName("ah.m(Ldv;II)V")
    public void method3435(class28 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method450();
            this.field2822 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2822[var4] = arg0.method349();
            }
        } else if (arg1 == 2) {
            this.field2820 = arg0.method451();
        } else if (arg1 == 12) {
            this.field2829 = arg0.method450();
        } else if (arg1 == 13) {
            this.field2830 = arg0.method349();
        } else if (arg1 == 14) {
            this.field2836 = arg0.method349();
        } else if (arg1 == 15) {
            this.field2825 = arg0.method349();
        } else if (arg1 == 16) {
            this.field2827 = arg0.method349();
        } else if (arg1 == 17) {
            this.field2836 = arg0.method349();
            this.field2828 = arg0.method349();
            this.field2845 = arg0.method349();
            this.field2839 = arg0.method349();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2835[arg1 - 30] = arg0.method451();
            if (this.field2835[arg1 - 30].equalsIgnoreCase(class57.field819)) {
                this.field2835[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method450();
            this.field2831 = new short[var5];
            this.field2824 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2831[var6] = (short) arg0.method349();
                this.field2824[var6] = (short) arg0.method349();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method450();
            this.field2842 = new short[var7];
            this.field2834 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2842[var8] = (short) arg0.method349();
                this.field2834[var8] = (short) arg0.method349();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method450();
            this.field2826 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2826[var10] = arg0.method349();
            }
        } else if (arg1 == 93) {
            this.field2823 = false;
        } else if (arg1 == 95) {
            this.field2837 = arg0.method349();
        } else if (arg1 == 97) {
            this.field2838 = arg0.method349();
        } else if (arg1 == 98) {
            this.field2833 = arg0.method349();
        } else if (arg1 == 99) {
            this.field2840 = true;
        } else if (arg1 == 100) {
            this.field2841 = arg0.method313();
        } else if (arg1 == 101) {
            this.field2832 = arg0.method313() * 5;
        } else if (arg1 == 102) {
            this.field2843 = arg0.method349();
        } else if (arg1 == 103) {
            this.field2844 = arg0.method349();
        } else if (arg1 == 106) {
            this.field2846 = arg0.method349();
            if (this.field2846 == 65535) {
                this.field2846 = -1;
            }
            this.field2847 = arg0.method349();
            if (this.field2847 == 65535) {
                this.field2847 = -1;
            }
            int var11 = arg0.method450();
            this.field2819 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field2819[var12] = arg0.method349();
                if (this.field2819[var12] == 65535) {
                    this.field2819[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field2848 = false;
        } else if (arg1 == 109) {
            this.field2815 = false;
        }
    }

    @ObfuscatedName("ah.z(Lar;ILar;II)Ldk;")
    public final class43 method3437(class165 arg0, int arg1, class165 arg2, int arg3) {
        if (this.field2819 != null) {
            class184 var5 = this.method3457();
            return var5 == null ? null : var5.method3437(arg0, arg1, arg2, arg3);
        }
        class43 var6 = (class43) field2818.method1196((long) this.field2821);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field2822.length; var8++) {
                if (!Statics.field2816.method1300(this.field2822[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class151[] var9 = new class151[this.field2822.length];
            for (int var10 = 0; var10 < this.field2822.length; var10++) {
                var9[var10] = class151.method2655(Statics.field2816, this.field2822[var10], 0);
            }
            class151 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class151(var9, var9.length);
            }
            if (this.field2831 != null) {
                for (int var12 = 0; var12 < this.field2831.length; var12++) {
                    var11.method2668(this.field2831[var12], this.field2824[var12]);
                }
            }
            if (this.field2842 != null) {
                for (int var13 = 0; var13 < this.field2842.length; var13++) {
                    var11.method2657(this.field2842[var13], this.field2834[var13]);
                }
            }
            var6 = var11.method2675(this.field2841 + 64, this.field2832 + 850, -30, -50, -30);
            field2818.method1184(var6, (long) this.field2821);
        }
        class43 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3010(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method2980(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method774(true);
        } else {
            var14 = arg2.method2980(var6, arg3);
        }
        if (this.field2838 != 128 || this.field2833 != 128) {
            var14.method829(this.field2838, this.field2833, this.field2838);
        }
        return var14;
    }

    @ObfuscatedName("ah.x(I)Lcl;")
    public final class151 method3438() {
        if (this.field2819 != null) {
            class184 var1 = this.method3457();
            return var1 == null ? null : var1.method3438();
        } else if (this.field2826 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field2826.length; var3++) {
                if (!Statics.field2816.method1300(this.field2826[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class151[] var4 = new class151[this.field2826.length];
            for (int var5 = 0; var5 < this.field2826.length; var5++) {
                var4[var5] = class151.method2655(Statics.field2816, this.field2826[var5], 0);
            }
            class151 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class151(var4, var4.length);
            }
            if (this.field2831 != null) {
                for (int var7 = 0; var7 < this.field2831.length; var7++) {
                    var6.method2668(this.field2831[var7], this.field2824[var7]);
                }
            }
            if (this.field2842 != null) {
                for (int var8 = 0; var8 < this.field2842.length; var8++) {
                    var6.method2657(this.field2842[var8], this.field2834[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ah.j(B)Z")
    public boolean method3452() {
        if (this.field2819 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2846 != -1) {
            var1 = class1.method945(this.field2846);
        } else if (this.field2847 != -1) {
            var1 = class1.field4[this.field2847];
        }
        return var1 >= 0 && var1 < this.field2819.length && this.field2819[var1] != -1;
    }

    @ObfuscatedName("ah.d(B)Lah;")
    public final class184 method3457() {
        int var1 = -1;
        if (this.field2846 != -1) {
            var1 = class1.method945(this.field2846);
        } else if (this.field2847 != -1) {
            var1 = class1.field4[this.field2847];
        }
        return var1 < 0 || var1 >= this.field2819.length || this.field2819[var1] == -1 ? null : method3428(this.field2819[var1]);
    }

    @ObfuscatedName("ah.i(Ldv;I)V")
    public void method3463(class28 arg0) {
        while (true) {
            int var2 = arg0.method450();
            if (var2 == 0) {
                return;
            }
            this.method3435(arg0, var2);
        }
    }

    @ObfuscatedName("aj.v(Lel;Lel;I)V")
    public static void method3161(class87 arg0, class87 arg1) {
        Statics.field2849 = arg0;
        Statics.field2816 = arg1;
    }

    @ObfuscatedName("aa.c(II)Lah;")
    public static class184 method3428(int arg0) {
        class184 var1 = (class184) field2817.method1196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2849.method1298(9, arg0);
        class184 var3 = new class184();
        var3.field2821 = arg0;
        if (var2 != null) {
            var3.method3463(new class28(var2));
        }
        var3.method3433();
        field2817.method1184(var3, (long) arg0);
        return var3;
    }
}
